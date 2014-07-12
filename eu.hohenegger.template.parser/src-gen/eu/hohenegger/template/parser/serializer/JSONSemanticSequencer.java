package eu.hohenegger.template.parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.hohenegger.template.json.model.Array;
import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.JObject;
import eu.hohenegger.template.json.model.JTerminal;
import eu.hohenegger.template.json.model.ModelPackage;
import eu.hohenegger.template.json.model.Root;
import eu.hohenegger.template.parser.services.JSONGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JSONSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSONGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ARRAY:
				if(context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getValueRule()) {
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
				if(context == grammarAccess.getJObjectRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_JObject(context, (JObject) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.JTERMINAL:
				if(context == grammarAccess.getJTerminalRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_JTerminal(context, (JTerminal) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
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
	 *     (key=STRING value=Value)
	 */
	protected void sequence_Entry(EObject context, Entry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTRY__KEY));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (value=STRING | value=Boolean | value=NUMBER | value=Null)
	 */
	protected void sequence_JTerminal(EObject context, JTerminal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=JObject
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ROOT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ROOT__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootAccess().getContentJObjectParserRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
}
