package eu.hohenegger.template.parser.serializer;

import com.google.inject.Inject;
import eu.hohenegger.template.parser.services.JSONGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JSONSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JSONGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Value_BooleanParserRuleCall_3_or_NUMBERTerminalRuleCall_4_or_NullParserRuleCall_5_or_STRINGTerminalRuleCall_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JSONGrammarAccess) access;
		match_Value_BooleanParserRuleCall_3_or_NUMBERTerminalRuleCall_4_or_NullParserRuleCall_5_or_STRINGTerminalRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getBooleanParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNullParserRuleCall_5()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBooleanRule())
			return getBooleanToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNullRule())
			return getNullToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Boolean:
	 * 	'true' | 'false';
	 */
	protected String getBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal NUMBER:
	 * 	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * Null:
	 * 	'null';
	 */
	protected String getNullToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"'
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Value_BooleanParserRuleCall_3_or_NUMBERTerminalRuleCall_4_or_NullParserRuleCall_5_or_STRINGTerminalRuleCall_1.equals(syntax))
				emit_Value_BooleanParserRuleCall_3_or_NUMBERTerminalRuleCall_4_or_NullParserRuleCall_5_or_STRINGTerminalRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Boolean | Null | NUMBER | STRING
	 */
	protected void emit_Value_BooleanParserRuleCall_3_or_NUMBERTerminalRuleCall_4_or_NullParserRuleCall_5_or_STRINGTerminalRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
