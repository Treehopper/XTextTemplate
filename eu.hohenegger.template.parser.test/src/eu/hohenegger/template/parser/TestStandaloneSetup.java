package eu.hohenegger.template.parser;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import eu.hohenegger.template.json.model.Array;
import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.JObject;

public class TestStandaloneSetup {
	static final String ISO_8859_1 = "ISO-8859-1";
	static final String UTF_8 = "UTF-8";
	static final String Cp1252 = "Cp1252";
	private static final String SCHEME = "foo";
	private Resource resource;
	private XtextResourceSet rs;
	private String encoding;

	private JObject parse(String string) throws IOException,
	UnsupportedEncodingException {
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		JObject root = (JObject) dataRoot;
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
	public void testString() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : \"value\"}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		assertEquals("key", entry.getKey());
		assertEquals("value", entry.getValue());
	}

	@Test
	public void testDouble() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : 42.5}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		assertEquals(Double.valueOf(42.5), entry.getValue());
	}


	@Test
	public void testArray() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : [1,2,3]}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		Array values = (Array) entry.getContent().getChild();
		assertEquals(Integer.valueOf(1), values.getValue(0));
		assertEquals(Integer.valueOf(2), values.getValue(1));
		assertEquals(Integer.valueOf(3), values.getValue(2));
	}

	@Test
	public void testObject() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : {\"key\" : \"value\"}}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		assertEquals("key", entry.getKey());
		JObject child = (JObject) entry.getContent().getChild();
		assertEquals("value", child.getEntries().get(0).getValue());
	}

	@Test
	public void testBoolean() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : true}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		assertEquals(Boolean.TRUE, entry.getValue());
	}

	@Test
	public void testNull() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : null}";
		JObject root = parse(string);

		Entry entry = root.getValue("key");
		assertEquals(null, entry.getValue());
	}
}
