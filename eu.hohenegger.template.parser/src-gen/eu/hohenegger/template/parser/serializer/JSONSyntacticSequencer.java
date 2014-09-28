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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JSONSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JSONGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Tag___RDTerminalRuleCall_3_1_0_LDTerminalRuleCall_3_1_2_SolidusKeyword_3_1_3_IDTerminalRuleCall_3_1_4_RDTerminalRuleCall_3_1_5___or___SolidusKeyword_3_0_0_RDTerminalRuleCall_3_0_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JSONGrammarAccess) access;
		match_Tag___RDTerminalRuleCall_3_1_0_LDTerminalRuleCall_3_1_2_SolidusKeyword_3_1_3_IDTerminalRuleCall_3_1_4_RDTerminalRuleCall_3_1_5___or___SolidusKeyword_3_0_0_RDTerminalRuleCall_3_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_1_0()), new TokenAlias(false, false, grammarAccess.getTagAccess().getLDTerminalRuleCall_3_1_2()), new TokenAlias(false, false, grammarAccess.getTagAccess().getSolidusKeyword_3_1_3()), new TokenAlias(false, false, grammarAccess.getTagAccess().getIDTerminalRuleCall_3_1_4()), new TokenAlias(false, false, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_1_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTagAccess().getSolidusKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_0_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLDRule())
			return getLDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRDRule())
			return getRDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID:
	 * 	('a'..'y')+
	 * ;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LD:
	 * 	'<'
	 * ;
	 */
	protected String getLDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal RD:
	 * 	'>'
	 * ;
	 */
	protected String getRDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Tag___RDTerminalRuleCall_3_1_0_LDTerminalRuleCall_3_1_2_SolidusKeyword_3_1_3_IDTerminalRuleCall_3_1_4_RDTerminalRuleCall_3_1_5___or___SolidusKeyword_3_0_0_RDTerminalRuleCall_3_0_1__.equals(syntax))
				emit_Tag___RDTerminalRuleCall_3_1_0_LDTerminalRuleCall_3_1_2_SolidusKeyword_3_1_3_IDTerminalRuleCall_3_1_4_RDTerminalRuleCall_3_1_5___or___SolidusKeyword_3_0_0_RDTerminalRuleCall_3_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (RD LD '/' ID RD) | ('/' RD)
	 */
	protected void emit_Tag___RDTerminalRuleCall_3_1_0_LDTerminalRuleCall_3_1_2_SolidusKeyword_3_1_3_IDTerminalRuleCall_3_1_4_RDTerminalRuleCall_3_1_5___or___SolidusKeyword_3_0_0_RDTerminalRuleCall_3_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
