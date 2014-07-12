package eu.hohenegger.template.parser;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.Root;
import eu.hohenegger.template.json.model.Value;

public class TestStandaloneSetup {
	static final String ISO_8859_1 = "ISO-8859-1";
	static final String UTF_8 = "UTF-8";
	static final String Cp1252 = "Cp1252";
	private static final String SCHEME = "foo";
	private Resource resource;
	private String encoding;
	private XtextResourceSet rs;

	@Before
	public void test() throws UnsupportedEncodingException, IOException {
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
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		assertEquals("key", entry.getKey());
		assertEquals("value", entry.getValue().getString());
	}

	@Test
	public void testDouble() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : 42.5}";
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		assertEquals(Double.valueOf(42.5), entry.getValue().getDouble());
	}


	@Test
	public void testArray() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : [1,2,3]}";
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		EList<Value> values = entry.getValue().getArray().getValues();
		assertEquals(Integer.valueOf(1), values.get(0).getInt());
		assertEquals(Integer.valueOf(2), values.get(1).getInt());
		assertEquals(Integer.valueOf(3), values.get(2).getInt());
	}

	@Test
	public void testObject() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : {\"key\" : \"value\"}}";
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		assertEquals("key", entry.getKey());
		assertEquals("value", entry.getValue().getChild().getEntries().get(0)
				.getValue().getString());
	}

	@Test
	public void testBoolean() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : true}";
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		assertEquals("key", entry.getKey());
		assertEquals(Boolean.TRUE, entry.getValue().getBoolean());
	}

	@Test
	public void testNull() throws UnsupportedEncodingException, IOException {
		String string = "{\"key\" : null}";
		resource.load(new ByteArrayInputStream(string.getBytes(encoding)),
				rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;

		Entry entry = root.getContent().getEntries().get(0);
		assertEquals("key", entry.getKey());
		assertEquals(null, entry.getValue());
	}
}
