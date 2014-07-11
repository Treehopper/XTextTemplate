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


    // $ANTLR start "entryRuleJObject"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:88:1: entryRuleJObject : ruleJObject EOF ;
    public final void entryRuleJObject() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:89:1: ( ruleJObject EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:90:1: ruleJObject EOF
            {
             before(grammarAccess.getJObjectRule()); 
            pushFollow(FOLLOW_ruleJObject_in_entryRuleJObject121);
            ruleJObject();

            state._fsp--;

             after(grammarAccess.getJObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJObject128); 

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
    // $ANTLR end "entryRuleJObject"


    // $ANTLR start "ruleJObject"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:97:1: ruleJObject : ( ( rule__JObject__Group__0 ) ) ;
    public final void ruleJObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:101:2: ( ( ( rule__JObject__Group__0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:102:1: ( ( rule__JObject__Group__0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:102:1: ( ( rule__JObject__Group__0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:103:1: ( rule__JObject__Group__0 )
            {
             before(grammarAccess.getJObjectAccess().getGroup()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:104:1: ( rule__JObject__Group__0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:104:2: rule__JObject__Group__0
            {
            pushFollow(FOLLOW_rule__JObject__Group__0_in_ruleJObject154);
            rule__JObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleJObject"


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


    // $ANTLR start "entryRuleJTerminal"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:200:1: entryRuleJTerminal : ruleJTerminal EOF ;
    public final void entryRuleJTerminal() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:201:1: ( ruleJTerminal EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:202:1: ruleJTerminal EOF
            {
             before(grammarAccess.getJTerminalRule()); 
            pushFollow(FOLLOW_ruleJTerminal_in_entryRuleJTerminal361);
            ruleJTerminal();

            state._fsp--;

             after(grammarAccess.getJTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJTerminal368); 

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
    // $ANTLR end "entryRuleJTerminal"


    // $ANTLR start "ruleJTerminal"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:209:1: ruleJTerminal : ( ( rule__JTerminal__Alternatives ) ) ;
    public final void ruleJTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:213:2: ( ( ( rule__JTerminal__Alternatives ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:214:1: ( ( rule__JTerminal__Alternatives ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:214:1: ( ( rule__JTerminal__Alternatives ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:215:1: ( rule__JTerminal__Alternatives )
            {
             before(grammarAccess.getJTerminalAccess().getAlternatives()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:216:1: ( rule__JTerminal__Alternatives )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:216:2: rule__JTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__JTerminal__Alternatives_in_ruleJTerminal394);
            rule__JTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJTerminalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJTerminal"


    // $ANTLR start "entryRuleBoolean"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:228:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:229:1: ( ruleBoolean EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:230:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean421);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean428); 

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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:237:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:241:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:242:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:242:1: ( ( rule__Boolean__Alternatives ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:243:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:244:1: ( rule__Boolean__Alternatives )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:244:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean454);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:256:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:257:1: ( ruleNull EOF )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:258:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull481);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull488); 

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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:265:1: ruleNull : ( 'null' ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:269:2: ( ( 'null' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:270:1: ( 'null' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:270:1: ( 'null' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:271:1: 'null'
            {
             before(grammarAccess.getNullAccess().getNullKeyword()); 
            match(input,8,FOLLOW_8_in_ruleNull515); 
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:286:1: rule__Value__Alternatives : ( ( ruleJObject ) | ( ruleArray ) | ( ruleJTerminal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:290:1: ( ( ruleJObject ) | ( ruleArray ) | ( ruleJTerminal ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 8:
            case 9:
            case 10:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:291:1: ( ruleJObject )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:291:1: ( ruleJObject )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:292:1: ruleJObject
                    {
                     before(grammarAccess.getValueAccess().getJObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleJObject_in_rule__Value__Alternatives552);
                    ruleJObject();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:297:6: ( ruleArray )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:297:6: ( ruleArray )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:298:1: ruleArray
                    {
                     before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArray_in_rule__Value__Alternatives569);
                    ruleArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:303:6: ( ruleJTerminal )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:303:6: ( ruleJTerminal )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:304:1: ruleJTerminal
                    {
                     before(grammarAccess.getValueAccess().getJTerminalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleJTerminal_in_rule__Value__Alternatives586);
                    ruleJTerminal();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJTerminalParserRuleCall_2()); 

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


    // $ANTLR start "rule__JTerminal__Alternatives"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:314:1: rule__JTerminal__Alternatives : ( ( RULE_STRING ) | ( ruleBoolean ) | ( RULE_NUMBER ) | ( ruleNull ) );
    public final void rule__JTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:318:1: ( ( RULE_STRING ) | ( ruleBoolean ) | ( RULE_NUMBER ) | ( ruleNull ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 9:
            case 10:
                {
                alt2=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt2=3;
                }
                break;
            case 8:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:319:1: ( RULE_STRING )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:319:1: ( RULE_STRING )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:320:1: RULE_STRING
                    {
                     before(grammarAccess.getJTerminalAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JTerminal__Alternatives618); 
                     after(grammarAccess.getJTerminalAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:325:6: ( ruleBoolean )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:325:6: ( ruleBoolean )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:326:1: ruleBoolean
                    {
                     before(grammarAccess.getJTerminalAccess().getBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolean_in_rule__JTerminal__Alternatives635);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getJTerminalAccess().getBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:331:6: ( RULE_NUMBER )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:331:6: ( RULE_NUMBER )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:332:1: RULE_NUMBER
                    {
                     before(grammarAccess.getJTerminalAccess().getNUMBERTerminalRuleCall_2()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__JTerminal__Alternatives652); 
                     after(grammarAccess.getJTerminalAccess().getNUMBERTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:337:6: ( ruleNull )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:337:6: ( ruleNull )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:338:1: ruleNull
                    {
                     before(grammarAccess.getJTerminalAccess().getNullParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNull_in_rule__JTerminal__Alternatives669);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getJTerminalAccess().getNullParserRuleCall_3()); 

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
    // $ANTLR end "rule__JTerminal__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:348:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:352:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            else if ( (LA3_0==10) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:353:1: ( 'true' )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:353:1: ( 'true' )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:354:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,9,FOLLOW_9_in_rule__Boolean__Alternatives702); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:361:6: ( 'false' )
                    {
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:361:6: ( 'false' )
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:362:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,10,FOLLOW_10_in_rule__Boolean__Alternatives722); 
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


    // $ANTLR start "rule__JObject__Group__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:376:1: rule__JObject__Group__0 : rule__JObject__Group__0__Impl rule__JObject__Group__1 ;
    public final void rule__JObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:380:1: ( rule__JObject__Group__0__Impl rule__JObject__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:381:2: rule__JObject__Group__0__Impl rule__JObject__Group__1
            {
            pushFollow(FOLLOW_rule__JObject__Group__0__Impl_in_rule__JObject__Group__0754);
            rule__JObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JObject__Group__1_in_rule__JObject__Group__0757);
            rule__JObject__Group__1();

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
    // $ANTLR end "rule__JObject__Group__0"


    // $ANTLR start "rule__JObject__Group__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:388:1: rule__JObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:392:1: ( ( '{' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:393:1: ( '{' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:393:1: ( '{' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:394:1: '{'
            {
             before(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__JObject__Group__0__Impl785); 
             after(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__JObject__Group__0__Impl"


    // $ANTLR start "rule__JObject__Group__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:407:1: rule__JObject__Group__1 : rule__JObject__Group__1__Impl rule__JObject__Group__2 ;
    public final void rule__JObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:411:1: ( rule__JObject__Group__1__Impl rule__JObject__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:412:2: rule__JObject__Group__1__Impl rule__JObject__Group__2
            {
            pushFollow(FOLLOW_rule__JObject__Group__1__Impl_in_rule__JObject__Group__1816);
            rule__JObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JObject__Group__2_in_rule__JObject__Group__1819);
            rule__JObject__Group__2();

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
    // $ANTLR end "rule__JObject__Group__1"


    // $ANTLR start "rule__JObject__Group__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:419:1: rule__JObject__Group__1__Impl : ( () ) ;
    public final void rule__JObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:423:1: ( ( () ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:424:1: ( () )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:424:1: ( () )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:425:1: ()
            {
             before(grammarAccess.getJObjectAccess().getJObjectAction_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:426:1: ()
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:428:1: 
            {
            }

             after(grammarAccess.getJObjectAccess().getJObjectAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__1__Impl"


    // $ANTLR start "rule__JObject__Group__2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:438:1: rule__JObject__Group__2 : rule__JObject__Group__2__Impl rule__JObject__Group__3 ;
    public final void rule__JObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:442:1: ( rule__JObject__Group__2__Impl rule__JObject__Group__3 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:443:2: rule__JObject__Group__2__Impl rule__JObject__Group__3
            {
            pushFollow(FOLLOW_rule__JObject__Group__2__Impl_in_rule__JObject__Group__2877);
            rule__JObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JObject__Group__3_in_rule__JObject__Group__2880);
            rule__JObject__Group__3();

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
    // $ANTLR end "rule__JObject__Group__2"


    // $ANTLR start "rule__JObject__Group__2__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:450:1: rule__JObject__Group__2__Impl : ( ( rule__JObject__EntriesAssignment_2 )? ) ;
    public final void rule__JObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:454:1: ( ( ( rule__JObject__EntriesAssignment_2 )? ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:455:1: ( ( rule__JObject__EntriesAssignment_2 )? )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:455:1: ( ( rule__JObject__EntriesAssignment_2 )? )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:456:1: ( rule__JObject__EntriesAssignment_2 )?
            {
             before(grammarAccess.getJObjectAccess().getEntriesAssignment_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:457:1: ( rule__JObject__EntriesAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:457:2: rule__JObject__EntriesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__JObject__EntriesAssignment_2_in_rule__JObject__Group__2__Impl907);
                    rule__JObject__EntriesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJObjectAccess().getEntriesAssignment_2()); 

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
    // $ANTLR end "rule__JObject__Group__2__Impl"


    // $ANTLR start "rule__JObject__Group__3"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:467:1: rule__JObject__Group__3 : rule__JObject__Group__3__Impl rule__JObject__Group__4 ;
    public final void rule__JObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:471:1: ( rule__JObject__Group__3__Impl rule__JObject__Group__4 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:472:2: rule__JObject__Group__3__Impl rule__JObject__Group__4
            {
            pushFollow(FOLLOW_rule__JObject__Group__3__Impl_in_rule__JObject__Group__3938);
            rule__JObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JObject__Group__4_in_rule__JObject__Group__3941);
            rule__JObject__Group__4();

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
    // $ANTLR end "rule__JObject__Group__3"


    // $ANTLR start "rule__JObject__Group__3__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:479:1: rule__JObject__Group__3__Impl : ( ( rule__JObject__Group_3__0 )* ) ;
    public final void rule__JObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:483:1: ( ( ( rule__JObject__Group_3__0 )* ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:484:1: ( ( rule__JObject__Group_3__0 )* )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:484:1: ( ( rule__JObject__Group_3__0 )* )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:485:1: ( rule__JObject__Group_3__0 )*
            {
             before(grammarAccess.getJObjectAccess().getGroup_3()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:486:1: ( rule__JObject__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:486:2: rule__JObject__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JObject__Group_3__0_in_rule__JObject__Group__3__Impl968);
            	    rule__JObject__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJObjectAccess().getGroup_3()); 

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
    // $ANTLR end "rule__JObject__Group__3__Impl"


    // $ANTLR start "rule__JObject__Group__4"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:496:1: rule__JObject__Group__4 : rule__JObject__Group__4__Impl ;
    public final void rule__JObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:500:1: ( rule__JObject__Group__4__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:501:2: rule__JObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JObject__Group__4__Impl_in_rule__JObject__Group__4999);
            rule__JObject__Group__4__Impl();

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
    // $ANTLR end "rule__JObject__Group__4"


    // $ANTLR start "rule__JObject__Group__4__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:507:1: rule__JObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:511:1: ( ( '}' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:512:1: ( '}' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:512:1: ( '}' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:513:1: '}'
            {
             before(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__JObject__Group__4__Impl1027); 
             after(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__JObject__Group__4__Impl"


    // $ANTLR start "rule__JObject__Group_3__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:536:1: rule__JObject__Group_3__0 : rule__JObject__Group_3__0__Impl rule__JObject__Group_3__1 ;
    public final void rule__JObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:540:1: ( rule__JObject__Group_3__0__Impl rule__JObject__Group_3__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:541:2: rule__JObject__Group_3__0__Impl rule__JObject__Group_3__1
            {
            pushFollow(FOLLOW_rule__JObject__Group_3__0__Impl_in_rule__JObject__Group_3__01068);
            rule__JObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JObject__Group_3__1_in_rule__JObject__Group_3__01071);
            rule__JObject__Group_3__1();

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
    // $ANTLR end "rule__JObject__Group_3__0"


    // $ANTLR start "rule__JObject__Group_3__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:548:1: rule__JObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__JObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:552:1: ( ( ',' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:553:1: ( ',' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:553:1: ( ',' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:554:1: ','
            {
             before(grammarAccess.getJObjectAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__JObject__Group_3__0__Impl1099); 
             after(grammarAccess.getJObjectAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__JObject__Group_3__0__Impl"


    // $ANTLR start "rule__JObject__Group_3__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:567:1: rule__JObject__Group_3__1 : rule__JObject__Group_3__1__Impl ;
    public final void rule__JObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:571:1: ( rule__JObject__Group_3__1__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:572:2: rule__JObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JObject__Group_3__1__Impl_in_rule__JObject__Group_3__11130);
            rule__JObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__JObject__Group_3__1"


    // $ANTLR start "rule__JObject__Group_3__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:578:1: rule__JObject__Group_3__1__Impl : ( ( rule__JObject__EntriesAssignment_3_1 ) ) ;
    public final void rule__JObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:582:1: ( ( ( rule__JObject__EntriesAssignment_3_1 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:583:1: ( ( rule__JObject__EntriesAssignment_3_1 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:583:1: ( ( rule__JObject__EntriesAssignment_3_1 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:584:1: ( rule__JObject__EntriesAssignment_3_1 )
            {
             before(grammarAccess.getJObjectAccess().getEntriesAssignment_3_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:585:1: ( rule__JObject__EntriesAssignment_3_1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:585:2: rule__JObject__EntriesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__JObject__EntriesAssignment_3_1_in_rule__JObject__Group_3__1__Impl1157);
            rule__JObject__EntriesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJObjectAccess().getEntriesAssignment_3_1()); 

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
    // $ANTLR end "rule__JObject__Group_3__1__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:599:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:603:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:604:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__01191);
            rule__Entry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__01194);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:611:1: rule__Entry__Group__0__Impl : ( ( rule__Entry__KeyAssignment_0 ) ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:615:1: ( ( ( rule__Entry__KeyAssignment_0 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:616:1: ( ( rule__Entry__KeyAssignment_0 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:616:1: ( ( rule__Entry__KeyAssignment_0 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:617:1: ( rule__Entry__KeyAssignment_0 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_0()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:618:1: ( rule__Entry__KeyAssignment_0 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:618:2: rule__Entry__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Entry__KeyAssignment_0_in_rule__Entry__Group__0__Impl1221);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:628:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:632:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:633:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__11251);
            rule__Entry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__11254);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:640:1: rule__Entry__Group__1__Impl : ( ':' ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:644:1: ( ( ':' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:645:1: ( ':' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:645:1: ( ':' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:646:1: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Entry__Group__1__Impl1282); 
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:659:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:663:1: ( rule__Entry__Group__2__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:664:2: rule__Entry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__21313);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:670:1: rule__Entry__Group__2__Impl : ( ( rule__Entry__ValueAssignment_2 ) ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:674:1: ( ( ( rule__Entry__ValueAssignment_2 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:675:1: ( ( rule__Entry__ValueAssignment_2 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:675:1: ( ( rule__Entry__ValueAssignment_2 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:676:1: ( rule__Entry__ValueAssignment_2 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:677:1: ( rule__Entry__ValueAssignment_2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:677:2: rule__Entry__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Entry__ValueAssignment_2_in_rule__Entry__Group__2__Impl1340);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:693:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:697:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:698:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01376);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01379);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:705:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:709:1: ( ( '[' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:710:1: ( '[' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:710:1: ( '[' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:711:1: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Array__Group__0__Impl1407); 
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:724:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:728:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:729:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11438);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11441);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:736:1: rule__Array__Group__1__Impl : ( () ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:740:1: ( ( () ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:741:1: ( () )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:741:1: ( () )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:742:1: ()
            {
             before(grammarAccess.getArrayAccess().getArrayAction_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:743:1: ()
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:745:1: 
            {
            }

             after(grammarAccess.getArrayAccess().getArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:755:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:759:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:760:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21499);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__21502);
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:767:1: rule__Array__Group__2__Impl : ( ( rule__Array__ValuesAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:771:1: ( ( ( rule__Array__ValuesAssignment_2 )? ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:772:1: ( ( rule__Array__ValuesAssignment_2 )? )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:772:1: ( ( rule__Array__ValuesAssignment_2 )? )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:773:1: ( rule__Array__ValuesAssignment_2 )?
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_2()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:774:1: ( rule__Array__ValuesAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_NUMBER)||(LA6_0>=8 && LA6_0<=11)||LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:774:2: rule__Array__ValuesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__ValuesAssignment_2_in_rule__Array__Group__2__Impl1529);
                    rule__Array__ValuesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_2()); 

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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:784:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:788:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:789:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__31560);
            rule__Array__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__31563);
            rule__Array__Group__4();

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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:796:1: rule__Array__Group__3__Impl : ( ( rule__Array__Group_3__0 )* ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:800:1: ( ( ( rule__Array__Group_3__0 )* ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:801:1: ( ( rule__Array__Group_3__0 )* )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:801:1: ( ( rule__Array__Group_3__0 )* )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:802:1: ( rule__Array__Group_3__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_3()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:803:1: ( rule__Array__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:803:2: rule__Array__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_3__0_in_rule__Array__Group__3__Impl1590);
            	    rule__Array__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Array__Group__4"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:813:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:817:1: ( rule__Array__Group__4__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:818:2: rule__Array__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__41621);
            rule__Array__Group__4__Impl();

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
    // $ANTLR end "rule__Array__Group__4"


    // $ANTLR start "rule__Array__Group__4__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:824:1: rule__Array__Group__4__Impl : ( ']' ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:828:1: ( ( ']' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:829:1: ( ']' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:829:1: ( ']' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:830:1: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Array__Group__4__Impl1649); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Array__Group__4__Impl"


    // $ANTLR start "rule__Array__Group_3__0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:853:1: rule__Array__Group_3__0 : rule__Array__Group_3__0__Impl rule__Array__Group_3__1 ;
    public final void rule__Array__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:857:1: ( rule__Array__Group_3__0__Impl rule__Array__Group_3__1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:858:2: rule__Array__Group_3__0__Impl rule__Array__Group_3__1
            {
            pushFollow(FOLLOW_rule__Array__Group_3__0__Impl_in_rule__Array__Group_3__01690);
            rule__Array__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_3__1_in_rule__Array__Group_3__01693);
            rule__Array__Group_3__1();

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
    // $ANTLR end "rule__Array__Group_3__0"


    // $ANTLR start "rule__Array__Group_3__0__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:865:1: rule__Array__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:869:1: ( ( ',' ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:870:1: ( ',' )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:870:1: ( ',' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:871:1: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Array__Group_3__0__Impl1721); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Array__Group_3__0__Impl"


    // $ANTLR start "rule__Array__Group_3__1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:884:1: rule__Array__Group_3__1 : rule__Array__Group_3__1__Impl ;
    public final void rule__Array__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:888:1: ( rule__Array__Group_3__1__Impl )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:889:2: rule__Array__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_3__1__Impl_in_rule__Array__Group_3__11752);
            rule__Array__Group_3__1__Impl();

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
    // $ANTLR end "rule__Array__Group_3__1"


    // $ANTLR start "rule__Array__Group_3__1__Impl"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:895:1: rule__Array__Group_3__1__Impl : ( ( rule__Array__ValuesAssignment_3_1 ) ) ;
    public final void rule__Array__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:899:1: ( ( ( rule__Array__ValuesAssignment_3_1 ) ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:900:1: ( ( rule__Array__ValuesAssignment_3_1 ) )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:900:1: ( ( rule__Array__ValuesAssignment_3_1 ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:901:1: ( rule__Array__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getArrayAccess().getValuesAssignment_3_1()); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:902:1: ( rule__Array__ValuesAssignment_3_1 )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:902:2: rule__Array__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Array__ValuesAssignment_3_1_in_rule__Array__Group_3__1__Impl1779);
            rule__Array__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValuesAssignment_3_1()); 

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
    // $ANTLR end "rule__Array__Group_3__1__Impl"


    // $ANTLR start "rule__Root__ContentAssignment"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:1: rule__Root__ContentAssignment : ( ruleJObject ) ;
    public final void rule__Root__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:921:1: ( ( ruleJObject ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:922:1: ( ruleJObject )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:922:1: ( ruleJObject )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:923:1: ruleJObject
            {
             before(grammarAccess.getRootAccess().getContentJObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJObject_in_rule__Root__ContentAssignment1818);
            ruleJObject();

            state._fsp--;

             after(grammarAccess.getRootAccess().getContentJObjectParserRuleCall_0()); 

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


    // $ANTLR start "rule__JObject__EntriesAssignment_2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:932:1: rule__JObject__EntriesAssignment_2 : ( ruleEntry ) ;
    public final void rule__JObject__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:936:1: ( ( ruleEntry ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:937:1: ( ruleEntry )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:937:1: ( ruleEntry )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:938:1: ruleEntry
            {
             before(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__JObject__EntriesAssignment_21849);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JObject__EntriesAssignment_2"


    // $ANTLR start "rule__JObject__EntriesAssignment_3_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:947:1: rule__JObject__EntriesAssignment_3_1 : ( ruleEntry ) ;
    public final void rule__JObject__EntriesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:951:1: ( ( ruleEntry ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:952:1: ( ruleEntry )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:952:1: ( ruleEntry )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:953:1: ruleEntry
            {
             before(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__JObject__EntriesAssignment_3_11880);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getJObjectAccess().getEntriesEntryParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__JObject__EntriesAssignment_3_1"


    // $ANTLR start "rule__Entry__KeyAssignment_0"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:962:1: rule__Entry__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:966:1: ( ( RULE_STRING ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:967:1: ( RULE_STRING )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:967:1: ( RULE_STRING )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:968:1: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entry__KeyAssignment_01911); 
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
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:977:1: rule__Entry__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Entry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:981:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:982:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:982:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:983:1: ruleValue
            {
             before(grammarAccess.getEntryAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Entry__ValueAssignment_21942);
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


    // $ANTLR start "rule__Array__ValuesAssignment_2"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:992:1: rule__Array__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:996:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:997:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:997:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:998:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_21973);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Array__ValuesAssignment_2"


    // $ANTLR start "rule__Array__ValuesAssignment_3_1"
    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1007:1: rule__Array__ValuesAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Array__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1011:1: ( ( ruleValue ) )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1012:1: ( ruleValue )
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1012:1: ( ruleValue )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1013:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_3_12004);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Array__ValuesAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Root__ContentAssignment_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_entryRuleJObject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJObject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group__0_in_ruleJObject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0_in_ruleEntry214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJTerminal_in_entryRuleJTerminal361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJTerminal368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JTerminal__Alternatives_in_ruleJTerminal394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleNull515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_rule__Value__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJTerminal_in_rule__Value__Alternatives586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JTerminal__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__JTerminal__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__JTerminal__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_rule__JTerminal__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Boolean__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Boolean__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group__0__Impl_in_rule__JObject__Group__0754 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__JObject__Group__1_in_rule__JObject__Group__0757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JObject__Group__0__Impl785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group__1__Impl_in_rule__JObject__Group__1816 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__JObject__Group__2_in_rule__JObject__Group__1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group__2__Impl_in_rule__JObject__Group__2877 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__JObject__Group__3_in_rule__JObject__Group__2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__EntriesAssignment_2_in_rule__JObject__Group__2__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group__3__Impl_in_rule__JObject__Group__3938 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__JObject__Group__4_in_rule__JObject__Group__3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group_3__0_in_rule__JObject__Group__3__Impl968 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__JObject__Group__4__Impl_in_rule__JObject__Group__4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__JObject__Group__4__Impl1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group_3__0__Impl_in_rule__JObject__Group_3__01068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JObject__Group_3__1_in_rule__JObject__Group_3__01071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JObject__Group_3__0__Impl1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__Group_3__1__Impl_in_rule__JObject__Group_3__11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JObject__EntriesAssignment_3_1_in_rule__JObject__Group_3__1__Impl1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__01191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__01194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__KeyAssignment_0_in_rule__Entry__Group__0__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__11251 = new BitSet(new long[]{0x0000000000008F30L});
    public static final BitSet FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entry__Group__1__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__21313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__ValueAssignment_2_in_rule__Entry__Group__2__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01376 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Array__Group__0__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11438 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21499 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__21502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_2_in_rule__Array__Group__2__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__31560 = new BitSet(new long[]{0x000000000001AF30L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__31563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_3__0_in_rule__Array__Group__3__Impl1590 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__41621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Array__Group__4__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_3__0__Impl_in_rule__Array__Group_3__01690 = new BitSet(new long[]{0x0000000000008F30L});
    public static final BitSet FOLLOW_rule__Array__Group_3__1_in_rule__Array__Group_3__01693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Array__Group_3__0__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_3__1__Impl_in_rule__Array__Group_3__11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_3_1_in_rule__Array__Group_3__1__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJObject_in_rule__Root__ContentAssignment1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__JObject__EntriesAssignment_21849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__JObject__EntriesAssignment_3_11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entry__KeyAssignment_01911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Entry__ValueAssignment_21942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_21973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValuesAssignment_3_12004 = new BitSet(new long[]{0x0000000000000002L});

}