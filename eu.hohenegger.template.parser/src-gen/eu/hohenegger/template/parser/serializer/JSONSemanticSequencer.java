package eu.hohenegger.template.parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.hohenegger.template.json.model.Array;
import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.JObject;
import eu.hohenegger.template.json.model.ModelPackage;
import eu.hohenegger.template.json.model.Value;
import eu.hohenegger.template.parser.services.JSONGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class JSONSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSONGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ENTRY:
				if(context == grammarAccess.getEntryRule()) {
					sequence_Entry(context, (Entry) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.JOBJECT:
				if(context == grammarAccess.getJObjectRule()) {
					sequence_JObject(context, (JObject) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (values+=Value? values+=Value*)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING content=Value)
	 */
	protected void sequence_Entry(EObject context, Entry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=Entry? entries+=Entry*)
	 */
	protected void sequence_JObject(EObject context, JObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Value}
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
