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
        	return "JObject";	
       	}
       	
       	@Override
       	protected JSONGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJObject"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:67:1: entryRuleJObject returns [EObject current=null] : iv_ruleJObject= ruleJObject EOF ;
    public final EObject entryRuleJObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJObject = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:68:2: (iv_ruleJObject= ruleJObject EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:69:2: iv_ruleJObject= ruleJObject EOF
            {
             newCompositeNode(grammarAccess.getJObjectRule()); 
            pushFollow(FOLLOW_ruleJObject_in_entryRuleJObject75);
            iv_ruleJObject=ruleJObject();

            state._fsp--;

             current =iv_ruleJObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJObject85); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:76:1: ruleJObject returns [EObject current=null] : (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleJObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:79:28: ( (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: (otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:3: otherlv_0= '{' () ( (lv_entries_2_0= ruleEntry ) )? (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,8,FOLLOW_8_in_ruleJObject122); 

                	newLeafNode(otherlv_0, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:84:1: ()
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:85:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJObjectAccess().getJObjectAction_1(),
                        current);
                

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:90:2: ( (lv_entries_2_0= ruleEntry ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:91:1: (lv_entries_2_0= ruleEntry )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:91:1: (lv_entries_2_0= ruleEntry )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:92:3: lv_entries_2_0= ruleEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntry_in_ruleJObject152);
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

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:108:3: (otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:108:5: otherlv_3= ',' ( (lv_entries_4_0= ruleEntry ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleJObject166); 

            	        	newLeafNode(otherlv_3, grammarAccess.getJObjectAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:112:1: ( (lv_entries_4_0= ruleEntry ) )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:113:1: (lv_entries_4_0= ruleEntry )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:113:1: (lv_entries_4_0= ruleEntry )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:114:3: lv_entries_4_0= ruleEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntry_in_ruleJObject187);
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

            otherlv_5=(Token)match(input,10,FOLLOW_10_in_ruleJObject201); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:142:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:143:2: (iv_ruleEntry= ruleEntry EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:144:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry237);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry247); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:151:1: ruleEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValue ) ) ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:154:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValue ) ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:155:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValue ) ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:155:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValue ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:155:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValue ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:155:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:156:1: (lv_key_0_0= RULE_STRING )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:156:1: (lv_key_0_0= RULE_STRING )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:157:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntry289); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEntry306); 

                	newLeafNode(otherlv_1, grammarAccess.getEntryAccess().getColonKeyword_1());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:177:1: ( (lv_content_2_0= ruleValue ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:178:1: (lv_content_2_0= ruleValue )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:178:1: (lv_content_2_0= ruleValue )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:179:3: lv_content_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getEntryAccess().getContentValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleEntry327);
            lv_content_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntryRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:203:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:204:2: (iv_ruleValue= ruleValue EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:205:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue363);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue373); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:212:1: ruleValue returns [EObject current=null] : ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) ) | ( ruleNull () ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        EObject lv_child_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_child_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:215:28: ( ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) ) | ( ruleNull () ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:1: ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) ) | ( ruleNull () ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:1: ( ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) ) | ( ruleNull () ) )
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
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:2: ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:2: ( ( (lv_child_0_0= ruleJObject ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= ruleBoolean ) ) | ( (lv_value_3_0= RULE_NUMBER ) ) | ( (lv_value_4_0= RULE_INT ) ) | ( (lv_child_5_0= ruleArray ) ) )
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
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:3: ( (lv_child_0_0= ruleJObject ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:216:3: ( (lv_child_0_0= ruleJObject ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:217:1: (lv_child_0_0= ruleJObject )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:217:1: (lv_child_0_0= ruleJObject )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:218:3: lv_child_0_0= ruleJObject
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getChildJObjectParserRuleCall_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJObject_in_ruleValue420);
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
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:235:6: ( (lv_value_1_0= RULE_STRING ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:235:6: ( (lv_value_1_0= RULE_STRING ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:236:1: (lv_value_1_0= RULE_STRING )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:236:1: (lv_value_1_0= RULE_STRING )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:237:3: lv_value_1_0= RULE_STRING
                            {
                            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue443); 

                            			newLeafNode(lv_value_1_0, grammarAccess.getValueAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:254:6: ( (lv_value_2_0= ruleBoolean ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:254:6: ( (lv_value_2_0= ruleBoolean ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: (lv_value_2_0= ruleBoolean )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: (lv_value_2_0= ruleBoolean )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:256:3: lv_value_2_0= ruleBoolean
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getValueBooleanParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleBoolean_in_ruleValue475);
                            lv_value_2_0=ruleBoolean();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_2_0, 
                                    		"Boolean");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:273:6: ( (lv_value_3_0= RULE_NUMBER ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:273:6: ( (lv_value_3_0= RULE_NUMBER ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:274:1: (lv_value_3_0= RULE_NUMBER )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:274:1: (lv_value_3_0= RULE_NUMBER )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:275:3: lv_value_3_0= RULE_NUMBER
                            {
                            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValue498); 

                            			newLeafNode(lv_value_3_0, grammarAccess.getValueAccess().getValueNUMBERTerminalRuleCall_0_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_3_0, 
                                    		"NUMBER");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:292:6: ( (lv_value_4_0= RULE_INT ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:292:6: ( (lv_value_4_0= RULE_INT ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:293:1: (lv_value_4_0= RULE_INT )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:293:1: (lv_value_4_0= RULE_INT )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:294:3: lv_value_4_0= RULE_INT
                            {
                            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue526); 

                            			newLeafNode(lv_value_4_0, grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_4_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_4_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:311:6: ( (lv_child_5_0= ruleArray ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:311:6: ( (lv_child_5_0= ruleArray ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:312:1: (lv_child_5_0= ruleArray )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:312:1: (lv_child_5_0= ruleArray )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:313:3: lv_child_5_0= ruleArray
                            {
                             
                            	        newCompositeNode(grammarAccess.getValueAccess().getChildArrayParserRuleCall_0_5_0()); 
                            	    
                            pushFollow(FOLLOW_ruleArray_in_ruleValue558);
                            lv_child_5_0=ruleArray();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"child",
                                    		lv_child_5_0, 
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
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:330:6: ( ruleNull () )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:330:6: ( ruleNull () )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:331:5: ruleNull ()
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNull_in_ruleValue582);
                    ruleNull();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:338:1: ()
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:339:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getValueAccess().getValueAction_1_1(),
                                current);
                        

                    }


                    }


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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:352:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:353:2: (iv_ruleArray= ruleArray EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:354:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray627);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray637); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:361:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:364:28: ( (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:365:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:365:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:365:3: otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleArray674); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:369:1: ()
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:370:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_1(),
                        current);
                

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:375:2: ( (lv_values_2_0= ruleValue ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||LA5_0==8||LA5_0==12||(LA5_0>=14 && LA5_0<=16)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:376:1: (lv_values_2_0= ruleValue )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:376:1: (lv_values_2_0= ruleValue )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:377:3: lv_values_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray704);
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

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:393:3: (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==9) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:393:5: otherlv_3= ',' ( (lv_values_4_0= ruleValue ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleArray718); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:397:1: ( (lv_values_4_0= ruleValue ) )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:1: (lv_values_4_0= ruleValue )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:1: (lv_values_4_0= ruleValue )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:399:3: lv_values_4_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray739);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleArray753); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:427:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:428:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:429:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean790);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean801); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:436:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:439:28: ( (kw= 'true' | kw= 'false' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:440:1: (kw= 'true' | kw= 'false' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:440:1: (kw= 'true' | kw= 'false' )
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
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:441:2: kw= 'true'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleBoolean839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:448:2: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBoolean858); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:461:1: entryRuleNull returns [String current=null] : iv_ruleNull= ruleNull EOF ;
    public final String entryRuleNull() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNull = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:462:2: (iv_ruleNull= ruleNull EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:463:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull899);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull910); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:470:1: ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNull() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:473:28: (kw= 'null' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:475:2: kw= 'null'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleNull947); 

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


 

    public static final BitSet FOLLOW_ruleJObject_in_entryRuleJObject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJObject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleJObject122 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleJObject152 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleJObject166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleJObject187 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_ruleJObject201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntry289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEntry306 = new BitSet(new long[]{0x000000000001D170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEntry327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_ruleValue420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleValue475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValue498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleValue582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArray674 = new BitSet(new long[]{0x000000000001F370L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray704 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_9_in_ruleArray718 = new BitSet(new long[]{0x000000000001D170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray739 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_13_in_ruleArray753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBoolean839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoolean858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNull947 = new BitSet(new long[]{0x0000000000000002L});

}