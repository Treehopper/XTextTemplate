package eu.hohenegger.template.parser.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONLexer extends Lexer {
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

    public InternalJSONLexer() {;} 
    public InternalJSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:11:6: ( 'null' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:11:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:12:6: ( 'true' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:12:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:13:7: ( 'false' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:13:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:14:7: ( '{' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:15:7: ( '}' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:16:7: ( ',' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:17:7: ( ':' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:18:7: ( '[' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:19:7: ( ']' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:13: ( ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:15: ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:20: ( RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:20: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_INT(); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:43: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:44: ( 'E' | 'e' ) ( '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:54: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:913:54: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:915:10: ( ( '0' .. '9' )+ )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:915:12: ( '0' .. '9' )+
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:915:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:915:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:917:65: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:919:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:919:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:919:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_WS )
        int alt8=13;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:62: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:83: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../eu.hohenegger.template.parser.ui/src-gen/eu/hohenegger/template/parser/ui/contentassist/antlr/internal/InternalJSON.g:1:95: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\13\uffff\1\16\3\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\11\12\uffff\1\56\3\uffff";
    static final String DFA8_maxS =
        "\1\175\12\uffff\1\71\3\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14"+
        "\1\15\1\13";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\1\uffff\1\14\11\uffff\1\6"+
            "\2\12\1\uffff\12\13\1\7\40\uffff\1\10\1\uffff\1\11\10\uffff"+
            "\1\3\7\uffff\1\1\5\uffff\1\2\6\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\12\13",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_WS );";
        }
    }
 

}