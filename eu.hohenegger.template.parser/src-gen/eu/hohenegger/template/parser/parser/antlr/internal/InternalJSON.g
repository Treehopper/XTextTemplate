/*
* generated by Xtext
*/
grammar InternalJSON;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package eu.hohenegger.template.parser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package eu.hohenegger.template.parser.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.hohenegger.template.parser.services.JSONGrammarAccess;

}

@parser::members {

 	private JSONGrammarAccess grammarAccess;
 	
    public InternalJSONParser(TokenStream input, JSONGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Root";	
   	}
   	
   	@Override
   	protected JSONGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	 iv_ruleRoot=ruleRoot 
	 { $current=$iv_ruleRoot.current; } 
	 EOF 
;

// Rule Root
ruleRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getRootAccess().getContentObjectParserRuleCall_0()); 
	    }
		lv_content_0_0=ruleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRootRule());
	        }
       		set(
       			$current, 
       			"content",
        		lv_content_0_0, 
        		"Object");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	 iv_ruleObject=ruleObject 
	 { $current=$iv_ruleObject.current; } 
	 EOF 
;

// Rule Object
ruleObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_1_0()); 
	    }
		lv_entries_1_0=ruleEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"entries",
        		lv_entries_1_0, 
        		"Entry");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_2_1_0()); 
	    }
		lv_entries_3_0=ruleEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"entries",
        		lv_entries_3_0, 
        		"Entry");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleEntry
entryRuleEntry returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntryRule()); }
	 iv_ruleEntry=ruleEntry 
	 { $current=$iv_ruleEntry.current; } 
	 EOF 
;

// Rule Entry
ruleEntry returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_STRING
		{
			newLeafNode(lv_key_0_0, grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_0_0, 
        		"STRING");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntryAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntryRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 
    }
    this_Object_0=ruleObject
    { 
        $current = $this_Object_0.current; 
        afterParserOrEnumRuleCall();
    }

    |this_STRING_1=RULE_STRING
    { 
    newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_2()); 
    }
    this_Array_2=ruleArray
    { 
        $current = $this_Array_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
    }
ruleBoolean
    { 
        afterParserOrEnumRuleCall();
    }

    |this_NUMBER_4=RULE_NUMBER
    { 
    newLeafNode(this_NUMBER_4, grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_4()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 
    }
ruleNull
    { 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleArray
entryRuleArray returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	 iv_ruleArray=ruleArray 
	 { $current=$iv_ruleArray.current; } 
	 EOF 
;

// Rule Array
ruleArray returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_0()); 
	    }
		lv_values_1_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_1_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_0()); 
	    }
		lv_values_3_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanRule()); } 
	 iv_ruleBoolean=ruleBoolean 
	 { $current=$iv_ruleBoolean.current.getText(); }  
	 EOF 
;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleNull
entryRuleNull returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNullRule()); } 
	 iv_ruleNull=ruleNull 
	 { $current=$iv_ruleNull.current.getText(); }  
	 EOF 
;

// Rule Null
ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='null' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNullAccess().getNullKeyword()); 
    }

    ;





RULE_NUMBER : '-'? RULE_INT? '.' RULE_INT (('E'|'e') '-'? RULE_INT)?;

RULE_INT : ('0'..'9')+;

RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

