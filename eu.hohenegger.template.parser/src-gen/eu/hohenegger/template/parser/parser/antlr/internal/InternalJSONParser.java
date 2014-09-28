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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LD", "RULE_ID", "RULE_RD", "RULE_STRING", "RULE_TEXT_NODE_ELEMENT", "RULE_WS", "'/'", "'='"
    };
    public static final int RULE_LD=4;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=7;
    public static final int RULE_RD=6;
    public static final int RULE_TEXT_NODE_ELEMENT=8;
    public static final int T__11=11;
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
        	return "Tag";	
       	}
       	
       	@Override
       	protected JSONGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTag"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:67:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:68:2: (iv_ruleTag= ruleTag EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:69:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag75);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:76:1: ruleTag returns [EObject current=null] : (this_LD_0= RULE_LD ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token this_LD_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_RD_4=null;
        Token this_RD_5=null;
        Token this_LD_8=null;
        Token otherlv_9=null;
        Token this_ID_10=null;
        Token this_RD_11=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_subTags_6_0 = null;

        EObject lv_textNode_7_0 = null;


         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:79:28: ( (this_LD_0= RULE_LD ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: (this_LD_0= RULE_LD ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:1: (this_LD_0= RULE_LD ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:80:2: this_LD_0= RULE_LD ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) )
            {
            this_LD_0=(Token)match(input,RULE_LD,FOLLOW_RULE_LD_in_ruleTag121); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LD_0, grammarAccess.getTagAccess().getLDTerminalRuleCall_0()); 
                  
            }
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:85:1: (lv_name_1_0= RULE_ID )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTag137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTagRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:102:2: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:103:1: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:103:1: (lv_attributes_2_0= ruleAttribute )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:104:3: lv_attributes_2_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleTag163);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTagRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:120:3: ( (otherlv_3= '/' this_RD_4= RULE_RD ) | (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_RD) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:120:4: (otherlv_3= '/' this_RD_4= RULE_RD )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:120:4: (otherlv_3= '/' this_RD_4= RULE_RD )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:120:6: otherlv_3= '/' this_RD_4= RULE_RD
                    {
                    otherlv_3=(Token)match(input,10,FOLLOW_10_in_ruleTag178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTagAccess().getSolidusKeyword_3_0_0());
                          
                    }
                    this_RD_4=(Token)match(input,RULE_RD,FOLLOW_RULE_RD_in_ruleTag189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RD_4, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:129:6: (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD )
                    {
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:129:6: (this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD )
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:129:7: this_RD_5= RULE_RD ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) ) this_LD_8= RULE_LD otherlv_9= '/' this_ID_10= RULE_ID this_RD_11= RULE_RD
                    {
                    this_RD_5=(Token)match(input,RULE_RD,FOLLOW_RULE_RD_in_ruleTag207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RD_5, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_1_0()); 
                          
                    }
                    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:133:1: ( ( (lv_subTags_6_0= ruleTag ) )* | ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_LD) ) {
                        int LA3_1 = input.LA(2);

                        if ( (true) ) {
                            alt3=1;
                        }
                        else if ( (synpred1_InternalJSON()) ) {
                            alt3=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_0==RULE_TEXT_NODE_ELEMENT) && (synpred1_InternalJSON())) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:133:2: ( (lv_subTags_6_0= ruleTag ) )*
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:133:2: ( (lv_subTags_6_0= ruleTag ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==RULE_LD) ) {
                                    int LA2_1 = input.LA(2);

                                    if ( (LA2_1==RULE_ID) ) {
                                        alt2=1;
                                    }


                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:134:1: (lv_subTags_6_0= ruleTag )
                            	    {
                            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:134:1: (lv_subTags_6_0= ruleTag )
                            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:135:3: lv_subTags_6_0= ruleTag
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTagAccess().getSubTagsTagParserRuleCall_3_1_1_0_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleTag_in_ruleTag228);
                            	    lv_subTags_6_0=ruleTag();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTagRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"subTags",
                            	              		lv_subTags_6_0, 
                            	              		"Tag");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:6: ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:6: ( ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:7: ( ( ( ruleTextNode ) ) )=> ( (lv_textNode_7_0= ruleTextNode ) )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:156:5: ( (lv_textNode_7_0= ruleTextNode ) )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:157:1: (lv_textNode_7_0= ruleTextNode )
                            {
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:157:1: (lv_textNode_7_0= ruleTextNode )
                            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:158:3: lv_textNode_7_0= ruleTextNode
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTagAccess().getTextNodeTextNodeParserRuleCall_3_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTextNode_in_ruleTag269);
                            lv_textNode_7_0=ruleTextNode();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTagRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"textNode",
                                      		lv_textNode_7_0, 
                                      		"TextNode");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    this_LD_8=(Token)match(input,RULE_LD,FOLLOW_RULE_LD_in_ruleTag282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LD_8, grammarAccess.getTagAccess().getLDTerminalRuleCall_3_1_2()); 
                          
                    }
                    otherlv_9=(Token)match(input,10,FOLLOW_10_in_ruleTag293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTagAccess().getSolidusKeyword_3_1_3());
                          
                    }
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTag304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_10, grammarAccess.getTagAccess().getIDTerminalRuleCall_3_1_4()); 
                          
                    }
                    this_RD_11=(Token)match(input,RULE_RD,FOLLOW_RULE_RD_in_ruleTag314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RD_11, grammarAccess.getTagAccess().getRDTerminalRuleCall_3_1_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleAttribute"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:198:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:199:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:200:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute351);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:207:1: ruleAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:210:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:211:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:211:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:211:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:211:2: ( (lv_key_0_0= RULE_ID ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:212:1: (lv_key_0_0= RULE_ID )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:212:1: (lv_key_0_0= RULE_ID )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:213:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAttribute420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:233:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:234:1: (lv_value_2_0= RULE_STRING )
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:234:1: (lv_value_2_0= RULE_STRING )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:235:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleTextNode"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:259:1: entryRuleTextNode returns [EObject current=null] : iv_ruleTextNode= ruleTextNode EOF ;
    public final EObject entryRuleTextNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextNode = null;


        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:260:2: (iv_ruleTextNode= ruleTextNode EOF )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:261:2: iv_ruleTextNode= ruleTextNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextNodeRule()); 
            }
            pushFollow(FOLLOW_ruleTextNode_in_entryRuleTextNode478);
            iv_ruleTextNode=ruleTextNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextNode488); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextNode"


    // $ANTLR start "ruleTextNode"
    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:268:1: ruleTextNode returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT_NODE_ELEMENT ) )* ;
    public final EObject ruleTextNode() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:271:28: ( ( (lv_value_0_0= RULE_TEXT_NODE_ELEMENT ) )* )
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:272:1: ( (lv_value_0_0= RULE_TEXT_NODE_ELEMENT ) )*
            {
            // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:272:1: ( (lv_value_0_0= RULE_TEXT_NODE_ELEMENT ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TEXT_NODE_ELEMENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:273:1: (lv_value_0_0= RULE_TEXT_NODE_ELEMENT )
            	    {
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:273:1: (lv_value_0_0= RULE_TEXT_NODE_ELEMENT )
            	    // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:274:3: lv_value_0_0= RULE_TEXT_NODE_ELEMENT
            	    {
            	    lv_value_0_0=(Token)match(input,RULE_TEXT_NODE_ELEMENT,FOLLOW_RULE_TEXT_NODE_ELEMENT_in_ruleTextNode529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_value_0_0, grammarAccess.getTextNodeAccess().getValueTEXT_NODE_ELEMENTTerminalRuleCall_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTextNodeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"value",
            	              		lv_value_0_0, 
            	              		"TEXT_NODE_ELEMENT");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTextNode"

    // $ANTLR start synpred1_InternalJSON
    public final void synpred1_InternalJSON_fragment() throws RecognitionException {   
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:7: ( ( ( ruleTextNode ) ) )
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:8: ( ( ruleTextNode ) )
        {
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:152:8: ( ( ruleTextNode ) )
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:153:1: ( ruleTextNode )
        {
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:153:1: ( ruleTextNode )
        // ../eu.hohenegger.template.parser/src-gen/eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.g:154:1: ruleTextNode
        {
        pushFollow(FOLLOW_ruleTextNode_in_synpred1_InternalJSON250);
        ruleTextNode();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalJSON

    // Delegated rules

    public final boolean synpred1_InternalJSON() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJSON_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LD_in_ruleTag121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTag137 = new BitSet(new long[]{0x0000000000000460L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleTag163 = new BitSet(new long[]{0x0000000000000460L});
    public static final BitSet FOLLOW_10_in_ruleTag178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RD_in_ruleTag189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RD_in_ruleTag207 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleTag_in_ruleTag228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTextNode_in_ruleTag269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LD_in_ruleTag282 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleTag293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTag304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RD_in_ruleTag314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute403 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAttribute420 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextNode_in_entryRuleTextNode478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextNode488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_NODE_ELEMENT_in_ruleTextNode529 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleTextNode_in_synpred1_InternalJSON250 = new BitSet(new long[]{0x0000000000000002L});

}