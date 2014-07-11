package eu.hohenegger.template.parser.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.hohenegger.template.parser.services.JSONGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_WS", "'null'", "'true'", "'false'", "'{'", "'}'", "','", "':'", "'['", "']'"
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
    public String getGrammarFileName() { return "../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g"; }


     
     	private JSONGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JSONGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRoot"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:61:1: ( ruleRoot EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:69:1: ruleRoot : ( ( rule__Root__ContentAssignment ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:73:2: ( ( ( rule__Root__ContentAssignment ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:74:1: ( ( rule__Root__ContentAssignment ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:74:1: ( ( rule__Root__ContentAssignment ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:75:1: ( rule__Root__ContentAssignment )
            {
             before(grammarAccess.getRootAccess().getContentAssignment()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:76:1: ( rule__Root__ContentAssignment )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:76:2: rule__Root__ContentAssignment
            {
            pushFollow(FOLLOW_rule__Root__ContentAssignment_in_ruleRoot94);
            rule__Root__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleObject"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:88:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:89:1: ( ruleObject EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:90:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject121);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:97:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:101:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:102:1: ( ( rule__Object__Group__0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:102:1: ( ( rule__Object__Group__0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:103:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:104:1: ( rule__Object__Group__0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:104:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject154);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleEntry"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:116:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:117:1: ( ruleEntry EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:118:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry181);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:125:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:129:2: ( ( ( rule__Entry__Group__0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:130:1: ( ( rule__Entry__Group__0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:130:1: ( ( rule__Entry__Group__0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:131:1: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:132:1: ( rule__Entry__Group__0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:132:2: rule__Entry__Group__0
            {
            pushFollow(FOLLOW_rule__Entry__Group__0_in_ruleEntry214);
            rule__Entry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleValue"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:144:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:145:1: ( ruleValue EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:146:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue241);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:153:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:157:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:158:1: ( ( rule__Value__Alternatives ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:158:1: ( ( rule__Value__Alternatives ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:159:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:160:1: ( rule__Value__Alternatives )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:160:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue274);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:172:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:173:1: ( ruleArray EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:174:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray301);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:181:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:185:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:186:1: ( ( rule__Array__Group__0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:186:1: ( ( rule__Array__Group__0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:187:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:188:1: ( rule__Array__Group__0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:188:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray334);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleBoolean"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:200:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:201:1: ( ruleBoolean EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:202:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean361);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:209:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:213:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:214:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:214:1: ( ( rule__Boolean__Alternatives ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:215:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:216:1: ( rule__Boolean__Alternatives )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:216:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean394);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:228:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:229:1: ( ruleNull EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:230:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull421);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:237:1: ruleNull : ( 'null' ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:241:2: ( ( 'null' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:242:1: ( 'null' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:242:1: ( 'null' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:243:1: 'null'
            {
             before(grammarAccess.getNullAccess().getNullKeyword()); 
            match(input,8,FOLLOW_8_in_ruleNull455); 
             after(grammarAccess.getNullAccess().getNullKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "rule__Value__Alternatives"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:258:1: rule__Value__Alternatives : ( ( ruleObject ) | ( RULE_STRING ) | ( ruleArray ) | ( ruleBoolean ) | ( RULE_NUMBER ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:262:1: ( ( ruleObject ) | ( RULE_STRING ) | ( ruleArray ) | ( ruleBoolean ) | ( RULE_NUMBER ) | ( ruleNull ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 9:
            case 10:
                {
                alt1=4;
                }
                break;
            case RULE_NUMBER:
                {
                alt1=5;
                }
                break;
            case 8:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:263:1: ( ruleObject )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:263:1: ( ruleObject )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:264:1: ruleObject
                    {
                     before(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObject_in_rule__Value__Alternatives492);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:269:6: ( RULE_STRING )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:269:6: ( RULE_STRING )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:270:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives509); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:275:6: ( ruleArray )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:275:6: ( ruleArray )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:276:1: ruleArray
                    {
                     before(grammarAccess.getValueAccess().getArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArray_in_rule__Value__Alternatives526);
                    ruleArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:281:6: ( ruleBoolean )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:281:6: ( ruleBoolean )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:282:1: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBoolean_in_rule__Value__Alternatives543);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:287:6: ( RULE_NUMBER )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:287:6: ( RULE_NUMBER )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:288:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_4()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives560); 
                     after(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:293:6: ( ruleNull )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:293:6: ( ruleNull )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:294:1: ruleNull
                    {
                     before(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleNull_in_rule__Value__Alternatives577);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:304:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:308:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:309:1: ( 'true' )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:309:1: ( 'true' )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:310:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,9,FOLLOW_9_in_rule__Boolean__Alternatives610); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:317:6: ( 'false' )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:317:6: ( 'false' )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:318:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,10,FOLLOW_10_in_rule__Boolean__Alternatives630); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Object__Group__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:332:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:336:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:337:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0662);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0665);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:344:1: rule__Object__Group__0__Impl : ( '{' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:348:1: ( ( '{' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:349:1: ( '{' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:349:1: ( '{' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:350:1: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Object__Group__0__Impl693); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:363:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:367:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:368:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1724);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1727);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:375:1: rule__Object__Group__1__Impl : ( ( rule__Object__EntriesAssignment_1 )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:379:1: ( ( ( rule__Object__EntriesAssignment_1 )? ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:380:1: ( ( rule__Object__EntriesAssignment_1 )? )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:380:1: ( ( rule__Object__EntriesAssignment_1 )? )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:381:1: ( rule__Object__EntriesAssignment_1 )?
            {
             before(grammarAccess.getObjectAccess().getEntriesAssignment_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:382:1: ( rule__Object__EntriesAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:382:2: rule__Object__EntriesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Object__EntriesAssignment_1_in_rule__Object__Group__1__Impl754);
                    rule__Object__EntriesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getEntriesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:392:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:396:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:397:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2785);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__3_in_rule__Object__Group__2788);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:404:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )* ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:408:1: ( ( ( rule__Object__Group_2__0 )* ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:409:1: ( ( rule__Object__Group_2__0 )* )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:409:1: ( ( rule__Object__Group_2__0 )* )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:410:1: ( rule__Object__Group_2__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:411:1: ( rule__Object__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:411:2: rule__Object__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Object__Group_2__0_in_rule__Object__Group__2__Impl815);
            	    rule__Object__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:421:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:425:1: ( rule__Object__Group__3__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:426:2: rule__Object__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__3846);
            rule__Object__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:432:1: rule__Object__Group__3__Impl : ( '}' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:436:1: ( ( '}' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:437:1: ( '}' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:437:1: ( '}' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:438:1: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Object__Group__3__Impl874); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:459:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:463:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:464:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_rule__Object__Group_2__0__Impl_in_rule__Object__Group_2__0913);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_2__1_in_rule__Object__Group_2__0916);
            rule__Object__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:471:1: rule__Object__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:475:1: ( ( ',' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:476:1: ( ',' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:476:1: ( ',' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:477:1: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Object__Group_2__0__Impl944); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:490:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:494:1: ( rule__Object__Group_2__1__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:495:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_2__1__Impl_in_rule__Object__Group_2__1975);
            rule__Object__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:501:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__EntriesAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:505:1: ( ( ( rule__Object__EntriesAssignment_2_1 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:506:1: ( ( rule__Object__EntriesAssignment_2_1 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:506:1: ( ( rule__Object__EntriesAssignment_2_1 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:507:1: ( rule__Object__EntriesAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getEntriesAssignment_2_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:508:1: ( rule__Object__EntriesAssignment_2_1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:508:2: rule__Object__EntriesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Object__EntriesAssignment_2_1_in_rule__Object__Group_2__1__Impl1002);
            rule__Object__EntriesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getEntriesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:522:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:526:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:527:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__01036);
            rule__Entry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__01039);
            rule__Entry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0"


    // $ANTLR start "rule__Entry__Group__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:534:1: rule__Entry__Group__0__Impl : ( ( rule__Entry__KeyAssignment_0 ) ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:538:1: ( ( ( rule__Entry__KeyAssignment_0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:539:1: ( ( rule__Entry__KeyAssignment_0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:539:1: ( ( rule__Entry__KeyAssignment_0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:540:1: ( rule__Entry__KeyAssignment_0 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_0()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:541:1: ( rule__Entry__KeyAssignment_0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:541:2: rule__Entry__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Entry__KeyAssignment_0_in_rule__Entry__Group__0__Impl1066);
            rule__Entry__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:551:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:555:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:556:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__11096);
            rule__Entry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__11099);
            rule__Entry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1"


    // $ANTLR start "rule__Entry__Group__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:563:1: rule__Entry__Group__1__Impl : ( ':' ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:567:1: ( ( ':' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:568:1: ( ':' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:568:1: ( ':' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:569:1: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Entry__Group__1__Impl1127); 
             after(grammarAccess.getEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1__Impl"


    // $ANTLR start "rule__Entry__Group__2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:582:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:586:1: ( rule__Entry__Group__2__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:587:2: rule__Entry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__21158);
            rule__Entry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2"


    // $ANTLR start "rule__Entry__Group__2__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:593:1: rule__Entry__Group__2__Impl : ( ( rule__Entry__ValueAssignment_2 ) ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:597:1: ( ( ( rule__Entry__ValueAssignment_2 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:598:1: ( ( rule__Entry__ValueAssignment_2 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:598:1: ( ( rule__Entry__ValueAssignment_2 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:599:1: ( rule__Entry__ValueAssignment_2 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:600:1: ( rule__Entry__ValueAssignment_2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:600:2: rule__Entry__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Entry__ValueAssignment_2_in_rule__Entry__Group__2__Impl1185);
            rule__Entry__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:616:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:620:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:621:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01221);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01224);
            rule__Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:628:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:632:1: ( ( '[' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:633:1: ( '[' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:633:1: ( '[' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:634:1: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Array__Group__0__Impl1252); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:647:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:651:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:652:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11283);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11286);
            rule__Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:659:1: rule__Array__Group__1__Impl : ( ( rule__Array__ValuesAssignment_1 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:663:1: ( ( ( rule__Array__ValuesAssignment_1 )? ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:664:1: ( ( rule__Array__ValuesAssignment_1 )? )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:664:1: ( ( rule__Array__ValuesAssignment_1 )? )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:665:1: ( rule__Array__ValuesAssignment_1 )?
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:666:1: ( rule__Array__ValuesAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_NUMBER)||(LA5_0>=8 && LA5_0<=11)||LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:666:2: rule__Array__ValuesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl1313);
                    rule__Array__ValuesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:676:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:680:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:681:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21344);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__21347);
            rule__Array__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:688:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )* ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:692:1: ( ( ( rule__Array__Group_2__0 )* ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:693:1: ( ( rule__Array__Group_2__0 )* )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:693:1: ( ( rule__Array__Group_2__0 )* )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:694:1: ( rule__Array__Group_2__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:695:1: ( rule__Array__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:695:2: rule__Array__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl1374);
            	    rule__Array__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:705:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:709:1: ( rule__Array__Group__3__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:710:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__31405);
            rule__Array__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:716:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:720:1: ( ( ']' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:721:1: ( ']' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:721:1: ( ']' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:722:1: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Array__Group__3__Impl1433); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:743:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:747:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:748:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__01472);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__01475);
            rule__Array__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__0"


    // $ANTLR start "rule__Array__Group_2__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:755:1: rule__Array__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:759:1: ( ( ',' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:760:1: ( ',' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:760:1: ( ',' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:761:1: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Array__Group_2__0__Impl1503); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__0__Impl"


    // $ANTLR start "rule__Array__Group_2__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:774:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:778:1: ( rule__Array__Group_2__1__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:779:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__11534);
            rule__Array__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__1"


    // $ANTLR start "rule__Array__Group_2__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:785:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__ValuesAssignment_2_1 ) ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:789:1: ( ( ( rule__Array__ValuesAssignment_2_1 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:790:1: ( ( rule__Array__ValuesAssignment_2_1 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:790:1: ( ( rule__Array__ValuesAssignment_2_1 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:791:1: ( rule__Array__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_2_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:792:1: ( rule__Array__ValuesAssignment_2_1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:792:2: rule__Array__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Array__ValuesAssignment_2_1_in_rule__Array__Group_2__1__Impl1561);
            rule__Array__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__1__Impl"


    // $ANTLR start "rule__Root__ContentAssignment"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:807:1: rule__Root__ContentAssignment : ( ruleObject ) ;
    public final void rule__Root__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:811:1: ( ( ruleObject ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:812:1: ( ruleObject )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:812:1: ( ruleObject )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:813:1: ruleObject
            {
             before(grammarAccess.getRootAccess().getContentObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Root__ContentAssignment1600);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getRootAccess().getContentObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ContentAssignment"


    // $ANTLR start "rule__Object__EntriesAssignment_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:822:1: rule__Object__EntriesAssignment_1 : ( ruleEntry ) ;
    public final void rule__Object__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:826:1: ( ( ruleEntry ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:827:1: ( ruleEntry )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:827:1: ( ruleEntry )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:828:1: ruleEntry
            {
             before(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__Object__EntriesAssignment_11631);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__EntriesAssignment_1"


    // $ANTLR start "rule__Object__EntriesAssignment_2_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:837:1: rule__Object__EntriesAssignment_2_1 : ( ruleEntry ) ;
    public final void rule__Object__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:841:1: ( ( ruleEntry ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:842:1: ( ruleEntry )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:842:1: ( ruleEntry )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:843:1: ruleEntry
            {
             before(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__Object__EntriesAssignment_2_11662);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getEntriesEntryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__EntriesAssignment_2_1"


    // $ANTLR start "rule__Entry__KeyAssignment_0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:852:1: rule__Entry__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:856:1: ( ( RULE_STRING ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:857:1: ( RULE_STRING )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:857:1: ( RULE_STRING )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:858:1: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entry__KeyAssignment_01693); 
             after(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__KeyAssignment_0"


    // $ANTLR start "rule__Entry__ValueAssignment_2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:867:1: rule__Entry__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Entry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:871:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:872:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:872:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:873:1: ruleValue
            {
             before(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Entry__ValueAssignment_21724);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ValueAssignment_2"


    // $ANTLR start "rule__Array__ValuesAssignment_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:882:1: rule__Array__ValuesAssignment_1 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:886:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:887:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:887:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:888:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_11755);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValuesAssignment_1"


    // $ANTLR start "rule__Array__ValuesAssignment_2_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:897:1: rule__Array__ValuesAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:901:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:902:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:902:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:903:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_2_11786);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValuesAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__ContentAssignment_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0_in_ruleEntry214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleNull455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Value__Alternatives492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Value__Alternatives543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_rule__Value__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Boolean__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Boolean__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0662 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Object__Group__0__Impl693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1724 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__EntriesAssignment_1_in_rule__Object__Group__1__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2785 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Object__Group__3_in_rule__Object__Group__2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__0_in_rule__Object__Group__2__Impl815 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Object__Group__3__Impl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__0__Impl_in_rule__Object__Group_2__0913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Object__Group_2__1_in_rule__Object__Group_2__0916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Object__Group_2__0__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__1__Impl_in_rule__Object__Group_2__1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__EntriesAssignment_2_1_in_rule__Object__Group_2__1__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__01036 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__01039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__KeyAssignment_0_in_rule__Entry__Group__0__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__11096 = new BitSet(new long[]{0x0000000000008F30L});
    public static final BitSet FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entry__Group__1__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__21158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__ValueAssignment_2_in_rule__Entry__Group__2__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01221 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Array__Group__0__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11283 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21344 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__21347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl1374 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__31405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Array__Group__3__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__01472 = new BitSet(new long[]{0x0000000000008F30L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Array__Group_2__0__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_2_1_in_rule__Array__Group_2__1__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Root__ContentAssignment1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__Object__EntriesAssignment_11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__Object__EntriesAssignment_2_11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entry__KeyAssignment_01693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Entry__ValueAssignment_21724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_11755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_2_11786 = new BitSet(new long[]{0x0000000000000002L});

}