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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_WS", "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_WS=7;
    public static final int RULE_STRING=4;
    public static final int RULE_NUMBER=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalJSONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSONParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g"; }



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



    // $ANTLR start "entryRuleRoot"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:76:1: ruleRoot returns [EObject current=null] : ( (lv_content_0_0= ruleJObject ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:79:28: ( ( (lv_content_0_0= ruleJObject ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: ( (lv_content_0_0= ruleJObject ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: ( (lv_content_0_0= ruleJObject ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:81:1: (lv_content_0_0= ruleJObject )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:81:1: (lv_content_0_0= ruleJObject )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:82:3: lv_content_0_0= ruleJObject
            {
             
            	        newCompositeNode(grammarAccess.getRootAccess().getContentJObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJObject_in_ruleRoot130);
            lv_content_0_0=ruleJObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_0_0, 
                    		"JObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleJObject"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:106:1: entryRuleJObject returns [EObject current=null] : iv_ruleJObject= ruleJObject EOF ;
    public final EObject entryRuleJObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJObject = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:107:2: (iv_ruleJObject= ruleJObject EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:108:2: iv_ruleJObject= ruleJObject EOF
            {
             newCompositeNode(grammarAccess.getJObjectRule()); 
            pushFollow(FOLLOW_ruleJObject_in_entryRuleJObject165);
            iv_ruleJObject=ruleJObject();

            state._fsp--;

             current =iv_ruleJObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJObject175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJObject"


    // $ANTLR start "ruleJObject"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:115:1: ruleJObject returns [EObject current=null] : (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleJObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:118:28: ( (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:119:1: (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:119:1: (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:119:3: otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,8,FOLLOW_8_in_ruleJObject212); 

                	newLeafNode(otherlv_0, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:123:1: ()
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:124:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJObjectAccess().getJObjectAction_1(),
                        current);
                

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:129:2: ( (lv_entries_2_0= ruleEntry ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:130:1: (lv_entries_2_0= ruleEntry )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:130:1: (lv_entries_2_0= ruleEntry )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:131:3: lv_entries_2_0= ruleEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntry_in_ruleJObject242);
                    lv_entries_2_0=ruleEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"entries",
                            		lv_entries_2_0, 
                            		"Entry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:147:3: (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:147:5: otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleJObject256); 

            	        	newLeafNode(otherlv_3, grammarAccess.getJObjectAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:151:1: ( (lv_entries_4_0= ruleEntry ) )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:1: (lv_entries_4_0= ruleEntry )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:1: (lv_entries_4_0= ruleEntry )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:153:3: lv_entries_4_0= ruleEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntry_in_ruleJObject277);
            	    lv_entries_4_0=ruleEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_4_0, 
            	            		"Entry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,10,FOLLOW_10_in_ruleJObject291); 

                	newLeafNode(otherlv_5, grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJObject"


    // $ANTLR start "entryRuleEntry"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:181:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:182:2: (iv_ruleEntry= ruleEntry EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:183:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry327);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:190:1: ruleEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:193:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:194:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:194:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:194:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:194:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:195:1: (lv_key_0_0= RULE_STRING )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:195:1: (lv_key_0_0= RULE_STRING )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:196:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntry379); 

            			newLeafNode(lv_key_0_0, grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEntry396); 

                	newLeafNode(otherlv_1, grammarAccess.getEntryAccess().getColonKeyword_1());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:1: ( (lv_value_2_0= ruleValue ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:217:1: (lv_value_2_0= ruleValue )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:217:1: (lv_value_2_0= ruleValue )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:218:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleEntry417);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntryRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleValue"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:242:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:243:2: (iv_ruleValue= ruleValue EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:244:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue453);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:251:1: ruleValue returns [EObject current=null] : ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) ) | ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        Token lv_double_3_0=null;
        Token lv_int_4_0=null;
        EObject lv_child_0_0 = null;

        AntlrDatatypeRuleToken lv_boolean_2_0 = null;

        EObject lv_array_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:254:28: ( ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) ) | ruleNull ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) ) | ruleNull )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) ) | ruleNull )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_INT)||LA4_0==8||LA4_0==12||(LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:2: ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:2: ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_boolean_2_0= ruleBoolean ) ) | ( (lv_double_3_0= RULE_NUMBER ) ) | ( (lv_int_4_0= RULE_INT ) ) | ( (lv_array_5_0= ruleArray ) ) )
                    int alt3=6;
                    switch ( input.LA(1) ) {
                    case 8:
                        {
                        alt3=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt3=2;
                        }
                        break;
                    case 14:
                    case 15:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_NUMBER:
                        {
                        alt3=4;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt3=5;
                        }
                        break;
                    case 12:
                        {
                        alt3=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:3: ( (lv_child_0_0= ruleJObject ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:3: ( (lv_child_0_0= ruleJObject ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:256:1: (lv_child_0_0= ruleJObject )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:256:1: (lv_child_0_0= ruleJObject )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:257:3: lv_child_0_0= ruleJObject
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getChildJObjectParserRuleCall_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJObject_in_ruleValue510);
                            lv_child_0_0=ruleJObject();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"child",
                                    		lv_child_0_0, 
                                    		"JObject");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:274:6: ( (lv_string_1_0= RULE_STRING ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:274:6: ( (lv_string_1_0= RULE_STRING ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:275:1: (lv_string_1_0= RULE_STRING )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:275:1: (lv_string_1_0= RULE_STRING )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:276:3: lv_string_1_0= RULE_STRING
                            {
                            lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue533); 

                            			newLeafNode(lv_string_1_0, grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"string",
                                    		lv_string_1_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:293:6: ( (lv_boolean_2_0= ruleBoolean ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:293:6: ( (lv_boolean_2_0= ruleBoolean ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:294:1: (lv_boolean_2_0= ruleBoolean )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:294:1: (lv_boolean_2_0= ruleBoolean )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:295:3: lv_boolean_2_0= ruleBoolean
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getBooleanBooleanParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleBoolean_in_ruleValue565);
                            lv_boolean_2_0=ruleBoolean();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"boolean",
                                    		lv_boolean_2_0, 
                                    		"Boolean");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:312:6: ( (lv_double_3_0= RULE_NUMBER ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:312:6: ( (lv_double_3_0= RULE_NUMBER ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:313:1: (lv_double_3_0= RULE_NUMBER )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:313:1: (lv_double_3_0= RULE_NUMBER )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:314:3: lv_double_3_0= RULE_NUMBER
                            {
                            lv_double_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValue588); 

                            			newLeafNode(lv_double_3_0, grammarAccess.getValueAccess().getDoubleNUMBERTerminalRuleCall_0_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"double",
                                    		lv_double_3_0, 
                                    		"NUMBER");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:331:6: ( (lv_int_4_0= RULE_INT ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:331:6: ( (lv_int_4_0= RULE_INT ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:332:1: (lv_int_4_0= RULE_INT )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:332:1: (lv_int_4_0= RULE_INT )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:333:3: lv_int_4_0= RULE_INT
                            {
                            lv_int_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue616); 

                            			newLeafNode(lv_int_4_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_4_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"int",
                                    		lv_int_4_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:350:6: ( (lv_array_5_0= ruleArray ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:350:6: ( (lv_array_5_0= ruleArray ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:351:1: (lv_array_5_0= ruleArray )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:351:1: (lv_array_5_0= ruleArray )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:352:3: lv_array_5_0= ruleArray
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_0_5_0()); 
                            	    
                            pushFollow(FOLLOW_ruleArray_in_ruleValue648);
                            lv_array_5_0=ruleArray();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"array",
                                    		lv_array_5_0, 
                                    		"Array");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:370:5: ruleNull
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNull_in_ruleValue671);
                    ruleNull();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:385:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:386:2: (iv_ruleArray= ruleArray EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:387:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray706);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:394:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:397:28: ( (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:3: otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleArray753); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:402:1: ()
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:403:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_1(),
                        current);
                

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:408:2: ( (lv_values_2_0= ruleValue ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||LA5_0==8||LA5_0==12||(LA5_0>=14 && LA5_0<=16)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:409:1: (lv_values_2_0= ruleValue )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:409:1: (lv_values_2_0= ruleValue )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:410:3: lv_values_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray783);
                    lv_values_2_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_2_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:426:3: (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==9) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:426:5: otherlv_3= ',' ( (lv_values_4_0= ruleValue ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleArray797); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:430:1: ( (lv_values_4_0= ruleValue ) )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:431:1: (lv_values_4_0= ruleValue )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:431:1: (lv_values_4_0= ruleValue )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:432:3: lv_values_4_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray818);
            	    lv_values_4_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleArray832); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleBoolean"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:460:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:461:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:462:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean869);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:469:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:472:28: ( (kw= 'true' | kw= 'false' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:473:1: (kw= 'true' | kw= 'false' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:473:1: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:474:2: kw= 'true'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleBoolean918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:481:2: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBoolean937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:494:1: entryRuleNull returns [String current=null] : iv_ruleNull= ruleNull EOF ;
    public final String entryRuleNull() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNull = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:495:2: (iv_ruleNull= ruleNull EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:496:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull978);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:503:1: ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNull() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:506:28: (kw= 'null' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:508:2: kw= 'null'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleNull1026); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNullAccess().getNullKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNull"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_ruleRoot130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_entryRuleJObject165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJObject175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleJObject212 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleJObject242 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleJObject256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleJObject277 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_ruleJObject291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntry379 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEntry396 = new BitSet(new long[]{0x000000000001D170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEntry417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_ruleValue510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleValue565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValue588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleValue671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArray753 = new BitSet(new long[]{0x000000000001F370L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray783 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_9_in_ruleArray797 = new BitSet(new long[]{0x000000000001D170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray818 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_13_in_ruleArray832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBoolean918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoolean937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNull1026 = new BitSet(new long[]{0x0000000000000002L});

}