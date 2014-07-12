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
import org.junit.Test;

import com.google.inject.Injector;

import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.Root;

public class TestStandaloneSetup {
	static final String ISO_8859_1 = "ISO-8859-1";
	static final String UTF_8 = "UTF-8";
	static final String Cp1252 = "Cp1252";
	private static final String SCHEME = "foo";

	@Test
	public void test() throws UnsupportedEncodingException, IOException {
		String encoding = ISO_8859_1;
		
		Injector injector = new JSONStandaloneSetup()
				.createInjectorAndDoEMFRegistration();

		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		rs.addLoadOption(XtextResource.OPTION_ENCODING, encoding);

		Resource resource = rs.createResource(URI.createURI(SCHEME
				+ ":/" + "foo.json"));

		resource
				.load(new ByteArrayInputStream("{\"key\" : \"value\"}"
						.getBytes(encoding)), rs.getLoadOptions());

		EObject dataRoot = resource.getContents().get(0);
		Root root = (Root) dataRoot;
		
		Entry entry = root.getContent().getEntries().get(0);
		assertEquals("key", entry.getKey());
		assertEquals("value", entry.getValue().getValue());
	}

}
