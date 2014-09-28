package eu.hohenegger.template.parser;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import eu.hohenegger.template.json.model.Tag;

public class TestStandaloneSetup {
	static final String ISO_8859_1 = "ISO-8859-1";
	static final String UTF_8 = "UTF-8";
	static final String Cp1252 = "Cp1252";
	private static final String SCHEME = "foo";
	private Resource resource;
	private XtextResourceSet rs;
	private String encoding;

	@SuppressWarnings("unchecked")
	private <T> T parse(String string) throws IOException,
	UnsupportedEncodingException {
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		T root = (T) dataRoot;
		return root;
	}

	@Before
	public void setup() throws UnsupportedEncodingException, IOException {
		encoding = ISO_8859_1;

		Injector injector = new JSONStandaloneSetup()
		.createInjectorAndDoEMFRegistration();

		rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		rs.addLoadOption(XtextResource.OPTION_ENCODING, encoding);

		resource = rs.createResource(URI.createURI(SCHEME + ":/" + "foo.json"));
	}

	@Test
	public void testTag() throws UnsupportedEncodingException, IOException {
		String string = "<root></root>";
		Tag root = parse(string);

		assertEquals("root", root.getName());
	}


	@Test
	public void testAttribute() throws UnsupportedEncodingException, IOException {
		String string = "<root foo=\"bar\"></root>";
		Tag root = parse(string);

		assertEquals("foo", root.getAttributes().get(0).getKey());
		assertEquals("bar", root.getAttributes().get(0).getValue());
	}

	@Test
	public void testLeaf() throws UnsupportedEncodingException, IOException {
		String string = "<root><leaf /></root>";
		Tag root = parse(string);

		assertEquals("root", root.getName());
		assertEquals("leaf", root.getSubTags().get(0).getName());
	}
	@Test
	public void testText() throws UnsupportedEncodingException, IOException {
		String string = "<root>zz</root>";
		Tag root = parse(string);

		assertEquals(Arrays.asList((new String[] { "z", "z" })), root
				.getTextNode().getValue());
	}
}
