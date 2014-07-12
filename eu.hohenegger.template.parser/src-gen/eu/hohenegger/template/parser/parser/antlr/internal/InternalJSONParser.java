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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:251:1: ruleValue returns [EObject current=null] : (this_JObject_0= ruleJObject | this_Array_1= ruleArray | this_JTerminal_2= ruleJTerminal ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_JObject_0 = null;

        EObject this_Array_1 = null;

        EObject this_JTerminal_2 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:254:28: ( (this_JObject_0= ruleJObject | this_Array_1= ruleArray | this_JTerminal_2= ruleJTerminal ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: (this_JObject_0= ruleJObject | this_Array_1= ruleArray | this_JTerminal_2= ruleJTerminal )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:255:1: (this_JObject_0= ruleJObject | this_Array_1= ruleArray | this_JTerminal_2= ruleJTerminal )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 14:
            case 15:
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:256:5: this_JObject_0= ruleJObject
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getJObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJObject_in_ruleValue510);
                    this_JObject_0=ruleJObject();

                    state._fsp--;

                     
                            current = this_JObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:266:5: this_Array_1= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleValue537);
                    this_Array_1=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:276:5: this_JTerminal_2= ruleJTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getJTerminalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleJTerminal_in_ruleValue564);
                    this_JTerminal_2=ruleJTerminal();

                    state._fsp--;

                     
                            current = this_JTerminal_2; 
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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:292:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:293:2: (iv_ruleArray= ruleArray EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:294:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray599);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray609); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:301:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:304:28: ( (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:305:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:305:1: (otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:305:3: otherlv_0= '[' () ( (lv_values_2_0= ruleValue ) )? (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleArray646); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:309:1: ()
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_1(),
                        current);
                

            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:315:2: ( (lv_values_2_0= ruleValue ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_NUMBER)||LA4_0==8||LA4_0==12||(LA4_0>=14 && LA4_0<=16)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:316:1: (lv_values_2_0= ruleValue )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:316:1: (lv_values_2_0= ruleValue )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:317:3: lv_values_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray676);
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

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:333:3: (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==9) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:333:5: otherlv_3= ',' ( (lv_values_4_0= ruleValue ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleArray690); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:337:1: ( (lv_values_4_0= ruleValue ) )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:338:1: (lv_values_4_0= ruleValue )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:338:1: (lv_values_4_0= ruleValue )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:339:3: lv_values_4_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray711);
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleArray725); 

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


    // $ANTLR start "entryRuleJTerminal"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:367:1: entryRuleJTerminal returns [EObject current=null] : iv_ruleJTerminal= ruleJTerminal EOF ;
    public final EObject entryRuleJTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJTerminal = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:368:2: (iv_ruleJTerminal= ruleJTerminal EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:369:2: iv_ruleJTerminal= ruleJTerminal EOF
            {
             newCompositeNode(grammarAccess.getJTerminalRule()); 
            pushFollow(FOLLOW_ruleJTerminal_in_entryRuleJTerminal761);
            iv_ruleJTerminal=ruleJTerminal();

            state._fsp--;

             current =iv_ruleJTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJTerminal771); 

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
    // $ANTLR end "entryRuleJTerminal"


    // $ANTLR start "ruleJTerminal"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:376:1: ruleJTerminal returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) ) ) ;
    public final EObject ruleJTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_3=null;
        AntlrDatatypeRuleToken lv_value_0_2 = null;

        AntlrDatatypeRuleToken lv_value_0_4 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:379:28: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:380:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:380:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:381:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:381:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:382:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:382:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleBoolean | lv_value_0_3= RULE_NUMBER | lv_value_0_4= ruleNull )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 14:
            case 15:
                {
                alt6=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:383:3: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJTerminal814); 

                    			newLeafNode(lv_value_0_1, grammarAccess.getJTerminalAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_1, 
                            		"STRING");
                    	    

                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:398:8: lv_value_0_2= ruleBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getJTerminalAccess().getValueBooleanParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolean_in_ruleJTerminal838);
                    lv_value_0_2=ruleBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJTerminalRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_2, 
                            		"Boolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:413:8: lv_value_0_3= RULE_NUMBER
                    {
                    lv_value_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleJTerminal853); 

                    			newLeafNode(lv_value_0_3, grammarAccess.getJTerminalAccess().getValueNUMBERTerminalRuleCall_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_3, 
                            		"NUMBER");
                    	    

                    }
                    break;
                case 4 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:428:8: lv_value_0_4= ruleNull
                    {
                     
                    	        newCompositeNode(grammarAccess.getJTerminalAccess().getValueNullParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleNull_in_ruleJTerminal877);
                    lv_value_0_4=ruleNull();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJTerminalRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_4, 
                            		"Null");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleJTerminal"


    // $ANTLR start "entryRuleBoolean"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:454:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:455:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:456:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean916);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean927); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:463:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:466:28: ( (kw= 'true' | kw= 'false' ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:467:1: (kw= 'true' | kw= 'false' )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:467:1: (kw= 'true' | kw= 'false' )
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
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:468:2: kw= 'true'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleBoolean965); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:475:2: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBoolean984); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:488:1: entryRuleNull returns [String current=null] : iv_ruleNull= ruleNull EOF ;
    public final String entryRuleNull() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNull = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:489:2: (iv_ruleNull= ruleNull EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:490:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull1025);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull1036); 

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
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:497:1: ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNull() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:500:28: (kw= 'null' )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:502:2: kw= 'null'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleNull1073); 

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
    public static final BitSet FOLLOW_11_in_ruleEntry396 = new BitSet(new long[]{0x000000000001D130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEntry417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_ruleValue510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJTerminal_in_ruleValue564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArray646 = new BitSet(new long[]{0x000000000001F330L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray676 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_9_in_ruleArray690 = new BitSet(new long[]{0x000000000001D130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray711 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_13_in_ruleArray725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJTerminal_in_entryRuleJTerminal761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJTerminal771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJTerminal814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleJTerminal838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleJTerminal853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleJTerminal877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBoolean965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoolean984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNull1073 = new BitSet(new long[]{0x0000000000000002L});

}