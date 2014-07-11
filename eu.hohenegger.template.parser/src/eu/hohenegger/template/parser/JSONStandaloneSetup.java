package eu.hohenegger.template.parser;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

import eu.hohenegger.template.json.model.ModelPackage;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class JSONStandaloneSetup extends JSONStandaloneSetupGenerated {

	public static void doSetup() {
		new JSONStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	/**
	 * See Eclipse Bug 379999
	 */
	@Override
	public void register(Injector injector) {
		EPackage.Registry.INSTANCE.put(ModelPackage.eINSTANCE.getNsURI(),
				ModelPackage.eINSTANCE.getNsURI());
		super.register(injector);
	}
}
