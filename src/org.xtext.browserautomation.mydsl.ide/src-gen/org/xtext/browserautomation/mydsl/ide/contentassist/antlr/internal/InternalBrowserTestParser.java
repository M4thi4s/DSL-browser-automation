package org.xtext.browserautomation.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.browserautomation.mydsl.services.BrowserTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[CLICK]'", "'LINK'", "'INPUT'", "'TEXT'", "'CHECKBOX'", "'DIV'", "'TITLE'", "'[TASK]'", "'[GOTO]'", "'[SELECT]'", "'$'", "'[CONTENT]'", "'[TYPE]'", "'[LABEL]'", "'[NAME]'", "'[VALUE]'", "'[ALT]'", "'[PARENT]'", "'{'", "'}'", "'[NTH-CHILD]'", "'[ACTION]'", "'[CHECK]'", "'[SET-TEXT]'", "'[CHOOSE]'", "'[TEST]'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBrowserTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowserTest.g"; }


    	private BrowserTestGrammarAccess grammarAccess;

    	public void setGrammarAccess(BrowserTestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTestFile"
    // InternalBrowserTest.g:53:1: entryRuleTestFile : ruleTestFile EOF ;
    public final void entryRuleTestFile() throws RecognitionException {
        try {
            // InternalBrowserTest.g:54:1: ( ruleTestFile EOF )
            // InternalBrowserTest.g:55:1: ruleTestFile EOF
            {
             before(grammarAccess.getTestFileRule()); 
            pushFollow(FOLLOW_1);
            ruleTestFile();

            state._fsp--;

             after(grammarAccess.getTestFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestFile"


    // $ANTLR start "ruleTestFile"
    // InternalBrowserTest.g:62:1: ruleTestFile : ( ( rule__TestFile__TaskAssignment )* ) ;
    public final void ruleTestFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:66:2: ( ( ( rule__TestFile__TaskAssignment )* ) )
            // InternalBrowserTest.g:67:2: ( ( rule__TestFile__TaskAssignment )* )
            {
            // InternalBrowserTest.g:67:2: ( ( rule__TestFile__TaskAssignment )* )
            // InternalBrowserTest.g:68:3: ( rule__TestFile__TaskAssignment )*
            {
             before(grammarAccess.getTestFileAccess().getTaskAssignment()); 
            // InternalBrowserTest.g:69:3: ( rule__TestFile__TaskAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserTest.g:69:4: rule__TestFile__TaskAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TestFile__TaskAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTestFileAccess().getTaskAssignment()); 

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
    // $ANTLR end "ruleTestFile"


    // $ANTLR start "entryRuleTask"
    // InternalBrowserTest.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalBrowserTest.g:79:1: ( ruleTask EOF )
            // InternalBrowserTest.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBrowserTest.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalBrowserTest.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalBrowserTest.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalBrowserTest.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalBrowserTest.g:94:3: ( rule__Task__Group__0 )
            // InternalBrowserTest.g:94:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalBrowserTest.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBrowserTest.g:104:1: ( ruleAction EOF )
            // InternalBrowserTest.g:105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBrowserTest.g:112:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:116:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBrowserTest.g:117:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBrowserTest.g:117:2: ( ( rule__Action__Alternatives ) )
            // InternalBrowserTest.g:118:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBrowserTest.g:119:3: ( rule__Action__Alternatives )
            // InternalBrowserTest.g:119:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoTo"
    // InternalBrowserTest.g:128:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalBrowserTest.g:129:1: ( ruleGoTo EOF )
            // InternalBrowserTest.g:130:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalBrowserTest.g:137:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:141:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalBrowserTest.g:142:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalBrowserTest.g:142:2: ( ( rule__GoTo__Group__0 ) )
            // InternalBrowserTest.g:143:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalBrowserTest.g:144:3: ( rule__GoTo__Group__0 )
            // InternalBrowserTest.g:144:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleSelect"
    // InternalBrowserTest.g:153:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalBrowserTest.g:154:1: ( ruleSelect EOF )
            // InternalBrowserTest.g:155:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalBrowserTest.g:162:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:166:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalBrowserTest.g:167:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalBrowserTest.g:167:2: ( ( rule__Select__Group__0 ) )
            // InternalBrowserTest.g:168:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalBrowserTest.g:169:3: ( rule__Select__Group__0 )
            // InternalBrowserTest.g:169:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleProperty"
    // InternalBrowserTest.g:178:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalBrowserTest.g:179:1: ( ruleProperty EOF )
            // InternalBrowserTest.g:180:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalBrowserTest.g:187:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:191:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalBrowserTest.g:192:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalBrowserTest.g:192:2: ( ( rule__Property__Alternatives ) )
            // InternalBrowserTest.g:193:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalBrowserTest.g:194:3: ( rule__Property__Alternatives )
            // InternalBrowserTest.g:194:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleActionCommand"
    // InternalBrowserTest.g:203:1: entryRuleActionCommand : ruleActionCommand EOF ;
    public final void entryRuleActionCommand() throws RecognitionException {
        try {
            // InternalBrowserTest.g:204:1: ( ruleActionCommand EOF )
            // InternalBrowserTest.g:205:1: ruleActionCommand EOF
            {
             before(grammarAccess.getActionCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleActionCommand();

            state._fsp--;

             after(grammarAccess.getActionCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionCommand"


    // $ANTLR start "ruleActionCommand"
    // InternalBrowserTest.g:212:1: ruleActionCommand : ( ( rule__ActionCommand__Group__0 ) ) ;
    public final void ruleActionCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:216:2: ( ( ( rule__ActionCommand__Group__0 ) ) )
            // InternalBrowserTest.g:217:2: ( ( rule__ActionCommand__Group__0 ) )
            {
            // InternalBrowserTest.g:217:2: ( ( rule__ActionCommand__Group__0 ) )
            // InternalBrowserTest.g:218:3: ( rule__ActionCommand__Group__0 )
            {
             before(grammarAccess.getActionCommandAccess().getGroup()); 
            // InternalBrowserTest.g:219:3: ( rule__ActionCommand__Group__0 )
            // InternalBrowserTest.g:219:4: rule__ActionCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleActionCommand"


    // $ANTLR start "entryRuleActionType"
    // InternalBrowserTest.g:228:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalBrowserTest.g:229:1: ( ruleActionType EOF )
            // InternalBrowserTest.g:230:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalBrowserTest.g:237:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:241:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalBrowserTest.g:242:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalBrowserTest.g:242:2: ( ( rule__ActionType__Alternatives ) )
            // InternalBrowserTest.g:243:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalBrowserTest.g:244:3: ( rule__ActionType__Alternatives )
            // InternalBrowserTest.g:244:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleTest"
    // InternalBrowserTest.g:253:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalBrowserTest.g:254:1: ( ruleTest EOF )
            // InternalBrowserTest.g:255:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserTest.g:262:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:266:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalBrowserTest.g:267:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalBrowserTest.g:267:2: ( ( rule__Test__Group__0 ) )
            // InternalBrowserTest.g:268:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalBrowserTest.g:269:3: ( rule__Test__Group__0 )
            // InternalBrowserTest.g:269:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "ruleType"
    // InternalBrowserTest.g:278:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:282:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalBrowserTest.g:283:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalBrowserTest.g:283:2: ( ( rule__Type__Alternatives ) )
            // InternalBrowserTest.g:284:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalBrowserTest.g:285:3: ( rule__Type__Alternatives )
            // InternalBrowserTest.g:285:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalBrowserTest.g:293:1: rule__Action__Alternatives : ( ( ruleGoTo ) | ( ruleSelect ) | ( ruleActionCommand ) | ( ruleTest ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:297:1: ( ( ruleGoTo ) | ( ruleSelect ) | ( ruleActionCommand ) | ( ruleTest ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 36:
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
                    // InternalBrowserTest.g:298:2: ( ruleGoTo )
                    {
                    // InternalBrowserTest.g:298:2: ( ruleGoTo )
                    // InternalBrowserTest.g:299:3: ruleGoTo
                    {
                     before(grammarAccess.getActionAccess().getGoToParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGoToParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:304:2: ( ruleSelect )
                    {
                    // InternalBrowserTest.g:304:2: ( ruleSelect )
                    // InternalBrowserTest.g:305:3: ruleSelect
                    {
                     before(grammarAccess.getActionAccess().getSelectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSelectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:310:2: ( ruleActionCommand )
                    {
                    // InternalBrowserTest.g:310:2: ( ruleActionCommand )
                    // InternalBrowserTest.g:311:3: ruleActionCommand
                    {
                     before(grammarAccess.getActionAccess().getActionCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleActionCommand();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getActionCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:316:2: ( ruleTest )
                    {
                    // InternalBrowserTest.g:316:2: ( ruleTest )
                    // InternalBrowserTest.g:317:3: ruleTest
                    {
                     before(grammarAccess.getActionAccess().getTestParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTest();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTestParserRuleCall_3()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalBrowserTest.g:326:1: rule__Property__Alternatives : ( ( ( rule__Property__Group_0__0 ) ) | ( ( rule__Property__Group_1__0 ) ) | ( ( rule__Property__Group_2__0 ) ) | ( ( rule__Property__Group_3__0 ) ) | ( ( rule__Property__Group_4__0 ) ) | ( ( rule__Property__Group_5__0 ) ) | ( ( rule__Property__Group_6__0 ) ) | ( ( rule__Property__Group_7__0 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:330:1: ( ( ( rule__Property__Group_0__0 ) ) | ( ( rule__Property__Group_1__0 ) ) | ( ( rule__Property__Group_2__0 ) ) | ( ( rule__Property__Group_3__0 ) ) | ( ( rule__Property__Group_4__0 ) ) | ( ( rule__Property__Group_5__0 ) ) | ( ( rule__Property__Group_6__0 ) ) | ( ( rule__Property__Group_7__0 ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 27:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            case 31:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBrowserTest.g:331:2: ( ( rule__Property__Group_0__0 ) )
                    {
                    // InternalBrowserTest.g:331:2: ( ( rule__Property__Group_0__0 ) )
                    // InternalBrowserTest.g:332:3: ( rule__Property__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_0()); 
                    // InternalBrowserTest.g:333:3: ( rule__Property__Group_0__0 )
                    // InternalBrowserTest.g:333:4: rule__Property__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:337:2: ( ( rule__Property__Group_1__0 ) )
                    {
                    // InternalBrowserTest.g:337:2: ( ( rule__Property__Group_1__0 ) )
                    // InternalBrowserTest.g:338:3: ( rule__Property__Group_1__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_1()); 
                    // InternalBrowserTest.g:339:3: ( rule__Property__Group_1__0 )
                    // InternalBrowserTest.g:339:4: rule__Property__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:343:2: ( ( rule__Property__Group_2__0 ) )
                    {
                    // InternalBrowserTest.g:343:2: ( ( rule__Property__Group_2__0 ) )
                    // InternalBrowserTest.g:344:3: ( rule__Property__Group_2__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_2()); 
                    // InternalBrowserTest.g:345:3: ( rule__Property__Group_2__0 )
                    // InternalBrowserTest.g:345:4: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:349:2: ( ( rule__Property__Group_3__0 ) )
                    {
                    // InternalBrowserTest.g:349:2: ( ( rule__Property__Group_3__0 ) )
                    // InternalBrowserTest.g:350:3: ( rule__Property__Group_3__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_3()); 
                    // InternalBrowserTest.g:351:3: ( rule__Property__Group_3__0 )
                    // InternalBrowserTest.g:351:4: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:355:2: ( ( rule__Property__Group_4__0 ) )
                    {
                    // InternalBrowserTest.g:355:2: ( ( rule__Property__Group_4__0 ) )
                    // InternalBrowserTest.g:356:3: ( rule__Property__Group_4__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_4()); 
                    // InternalBrowserTest.g:357:3: ( rule__Property__Group_4__0 )
                    // InternalBrowserTest.g:357:4: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:361:2: ( ( rule__Property__Group_5__0 ) )
                    {
                    // InternalBrowserTest.g:361:2: ( ( rule__Property__Group_5__0 ) )
                    // InternalBrowserTest.g:362:3: ( rule__Property__Group_5__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_5()); 
                    // InternalBrowserTest.g:363:3: ( rule__Property__Group_5__0 )
                    // InternalBrowserTest.g:363:4: rule__Property__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserTest.g:367:2: ( ( rule__Property__Group_6__0 ) )
                    {
                    // InternalBrowserTest.g:367:2: ( ( rule__Property__Group_6__0 ) )
                    // InternalBrowserTest.g:368:3: ( rule__Property__Group_6__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_6()); 
                    // InternalBrowserTest.g:369:3: ( rule__Property__Group_6__0 )
                    // InternalBrowserTest.g:369:4: rule__Property__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserTest.g:373:2: ( ( rule__Property__Group_7__0 ) )
                    {
                    // InternalBrowserTest.g:373:2: ( ( rule__Property__Group_7__0 ) )
                    // InternalBrowserTest.g:374:3: ( rule__Property__Group_7__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_7()); 
                    // InternalBrowserTest.g:375:3: ( rule__Property__Group_7__0 )
                    // InternalBrowserTest.g:375:4: rule__Property__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalBrowserTest.g:383:1: rule__ActionType__Alternatives : ( ( '[CLICK]' ) | ( ( rule__ActionType__Group_1__0 ) ) | ( ( rule__ActionType__Group_2__0 ) ) | ( ( rule__ActionType__Group_3__0 ) ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:387:1: ( ( '[CLICK]' ) | ( ( rule__ActionType__Group_1__0 ) ) | ( ( rule__ActionType__Group_2__0 ) ) | ( ( rule__ActionType__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBrowserTest.g:388:2: ( '[CLICK]' )
                    {
                    // InternalBrowserTest.g:388:2: ( '[CLICK]' )
                    // InternalBrowserTest.g:389:3: '[CLICK]'
                    {
                     before(grammarAccess.getActionTypeAccess().getCLICKKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getCLICKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:394:2: ( ( rule__ActionType__Group_1__0 ) )
                    {
                    // InternalBrowserTest.g:394:2: ( ( rule__ActionType__Group_1__0 ) )
                    // InternalBrowserTest.g:395:3: ( rule__ActionType__Group_1__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_1()); 
                    // InternalBrowserTest.g:396:3: ( rule__ActionType__Group_1__0 )
                    // InternalBrowserTest.g:396:4: rule__ActionType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:400:2: ( ( rule__ActionType__Group_2__0 ) )
                    {
                    // InternalBrowserTest.g:400:2: ( ( rule__ActionType__Group_2__0 ) )
                    // InternalBrowserTest.g:401:3: ( rule__ActionType__Group_2__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_2()); 
                    // InternalBrowserTest.g:402:3: ( rule__ActionType__Group_2__0 )
                    // InternalBrowserTest.g:402:4: rule__ActionType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:406:2: ( ( rule__ActionType__Group_3__0 ) )
                    {
                    // InternalBrowserTest.g:406:2: ( ( rule__ActionType__Group_3__0 ) )
                    // InternalBrowserTest.g:407:3: ( rule__ActionType__Group_3__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_3()); 
                    // InternalBrowserTest.g:408:3: ( rule__ActionType__Group_3__0 )
                    // InternalBrowserTest.g:408:4: rule__ActionType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalBrowserTest.g:416:1: rule__Type__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'INPUT' ) ) | ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'DIV' ) ) | ( ( 'TITLE' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:420:1: ( ( ( 'LINK' ) ) | ( ( 'INPUT' ) ) | ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'DIV' ) ) | ( ( 'TITLE' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBrowserTest.g:421:2: ( ( 'LINK' ) )
                    {
                    // InternalBrowserTest.g:421:2: ( ( 'LINK' ) )
                    // InternalBrowserTest.g:422:3: ( 'LINK' )
                    {
                     before(grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalBrowserTest.g:423:3: ( 'LINK' )
                    // InternalBrowserTest.g:423:4: 'LINK'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:427:2: ( ( 'INPUT' ) )
                    {
                    // InternalBrowserTest.g:427:2: ( ( 'INPUT' ) )
                    // InternalBrowserTest.g:428:3: ( 'INPUT' )
                    {
                     before(grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1()); 
                    // InternalBrowserTest.g:429:3: ( 'INPUT' )
                    // InternalBrowserTest.g:429:4: 'INPUT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:433:2: ( ( 'TEXT' ) )
                    {
                    // InternalBrowserTest.g:433:2: ( ( 'TEXT' ) )
                    // InternalBrowserTest.g:434:3: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2()); 
                    // InternalBrowserTest.g:435:3: ( 'TEXT' )
                    // InternalBrowserTest.g:435:4: 'TEXT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:439:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalBrowserTest.g:439:2: ( ( 'CHECKBOX' ) )
                    // InternalBrowserTest.g:440:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3()); 
                    // InternalBrowserTest.g:441:3: ( 'CHECKBOX' )
                    // InternalBrowserTest.g:441:4: 'CHECKBOX'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:445:2: ( ( 'DIV' ) )
                    {
                    // InternalBrowserTest.g:445:2: ( ( 'DIV' ) )
                    // InternalBrowserTest.g:446:3: ( 'DIV' )
                    {
                     before(grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4()); 
                    // InternalBrowserTest.g:447:3: ( 'DIV' )
                    // InternalBrowserTest.g:447:4: 'DIV'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:451:2: ( ( 'TITLE' ) )
                    {
                    // InternalBrowserTest.g:451:2: ( ( 'TITLE' ) )
                    // InternalBrowserTest.g:452:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5()); 
                    // InternalBrowserTest.g:453:3: ( 'TITLE' )
                    // InternalBrowserTest.g:453:4: 'TITLE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalBrowserTest.g:461:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:465:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBrowserTest.g:466:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalBrowserTest.g:473:1: rule__Task__Group__0__Impl : ( '[TASK]' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:477:1: ( ( '[TASK]' ) )
            // InternalBrowserTest.g:478:1: ( '[TASK]' )
            {
            // InternalBrowserTest.g:478:1: ( '[TASK]' )
            // InternalBrowserTest.g:479:2: '[TASK]'
            {
             before(grammarAccess.getTaskAccess().getTASKKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTASKKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalBrowserTest.g:488:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:492:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBrowserTest.g:493:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalBrowserTest.g:500:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:504:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBrowserTest.g:505:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBrowserTest.g:505:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBrowserTest.g:506:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBrowserTest.g:507:2: ( rule__Task__NameAssignment_1 )
            // InternalBrowserTest.g:507:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalBrowserTest.g:515:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:519:1: ( rule__Task__Group__2__Impl )
            // InternalBrowserTest.g:520:2: rule__Task__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__2__Impl();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalBrowserTest.g:526:1: rule__Task__Group__2__Impl : ( ( rule__Task__ActionsAssignment_2 )* ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:530:1: ( ( ( rule__Task__ActionsAssignment_2 )* ) )
            // InternalBrowserTest.g:531:1: ( ( rule__Task__ActionsAssignment_2 )* )
            {
            // InternalBrowserTest.g:531:1: ( ( rule__Task__ActionsAssignment_2 )* )
            // InternalBrowserTest.g:532:2: ( rule__Task__ActionsAssignment_2 )*
            {
             before(grammarAccess.getTaskAccess().getActionsAssignment_2()); 
            // InternalBrowserTest.g:533:2: ( rule__Task__ActionsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)||LA6_0==32||LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBrowserTest.g:533:3: rule__Task__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Task__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getActionsAssignment_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalBrowserTest.g:542:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:546:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalBrowserTest.g:547:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

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
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalBrowserTest.g:554:1: rule__GoTo__Group__0__Impl : ( '[GOTO]' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:558:1: ( ( '[GOTO]' ) )
            // InternalBrowserTest.g:559:1: ( '[GOTO]' )
            {
            // InternalBrowserTest.g:559:1: ( '[GOTO]' )
            // InternalBrowserTest.g:560:2: '[GOTO]'
            {
             before(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 

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
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalBrowserTest.g:569:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:573:1: ( rule__GoTo__Group__1__Impl )
            // InternalBrowserTest.g:574:2: rule__GoTo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1__Impl();

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
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalBrowserTest.g:580:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__UrlAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:584:1: ( ( ( rule__GoTo__UrlAssignment_1 ) ) )
            // InternalBrowserTest.g:585:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            {
            // InternalBrowserTest.g:585:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            // InternalBrowserTest.g:586:2: ( rule__GoTo__UrlAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_1()); 
            // InternalBrowserTest.g:587:2: ( rule__GoTo__UrlAssignment_1 )
            // InternalBrowserTest.g:587:3: rule__GoTo__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_1()); 

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
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalBrowserTest.g:596:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:600:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalBrowserTest.g:601:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalBrowserTest.g:608:1: rule__Select__Group__0__Impl : ( '[SELECT]' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:612:1: ( ( '[SELECT]' ) )
            // InternalBrowserTest.g:613:1: ( '[SELECT]' )
            {
            // InternalBrowserTest.g:613:1: ( '[SELECT]' )
            // InternalBrowserTest.g:614:2: '[SELECT]'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalBrowserTest.g:623:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:627:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalBrowserTest.g:628:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalBrowserTest.g:635:1: rule__Select__Group__1__Impl : ( '$' ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:639:1: ( ( '$' ) )
            // InternalBrowserTest.g:640:1: ( '$' )
            {
            // InternalBrowserTest.g:640:1: ( '$' )
            // InternalBrowserTest.g:641:2: '$'
            {
             before(grammarAccess.getSelectAccess().getDollarSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getDollarSignKeyword_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalBrowserTest.g:650:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:654:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalBrowserTest.g:655:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

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
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalBrowserTest.g:662:1: rule__Select__Group__2__Impl : ( ( rule__Select__NameAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:666:1: ( ( ( rule__Select__NameAssignment_2 ) ) )
            // InternalBrowserTest.g:667:1: ( ( rule__Select__NameAssignment_2 ) )
            {
            // InternalBrowserTest.g:667:1: ( ( rule__Select__NameAssignment_2 ) )
            // InternalBrowserTest.g:668:2: ( rule__Select__NameAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getNameAssignment_2()); 
            // InternalBrowserTest.g:669:2: ( rule__Select__NameAssignment_2 )
            // InternalBrowserTest.g:669:3: rule__Select__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Select__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalBrowserTest.g:677:1: rule__Select__Group__3 : rule__Select__Group__3__Impl ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:681:1: ( rule__Select__Group__3__Impl )
            // InternalBrowserTest.g:682:2: rule__Select__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__3__Impl();

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
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalBrowserTest.g:688:1: rule__Select__Group__3__Impl : ( ( rule__Select__PropertiesAssignment_3 )* ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:692:1: ( ( ( rule__Select__PropertiesAssignment_3 )* ) )
            // InternalBrowserTest.g:693:1: ( ( rule__Select__PropertiesAssignment_3 )* )
            {
            // InternalBrowserTest.g:693:1: ( ( rule__Select__PropertiesAssignment_3 )* )
            // InternalBrowserTest.g:694:2: ( rule__Select__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSelectAccess().getPropertiesAssignment_3()); 
            // InternalBrowserTest.g:695:2: ( rule__Select__PropertiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=28)||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBrowserTest.g:695:3: rule__Select__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Property__Group_0__0"
    // InternalBrowserTest.g:704:1: rule__Property__Group_0__0 : rule__Property__Group_0__0__Impl rule__Property__Group_0__1 ;
    public final void rule__Property__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:708:1: ( rule__Property__Group_0__0__Impl rule__Property__Group_0__1 )
            // InternalBrowserTest.g:709:2: rule__Property__Group_0__0__Impl rule__Property__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_0__1();

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
    // $ANTLR end "rule__Property__Group_0__0"


    // $ANTLR start "rule__Property__Group_0__0__Impl"
    // InternalBrowserTest.g:716:1: rule__Property__Group_0__0__Impl : ( '[CONTENT]' ) ;
    public final void rule__Property__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:720:1: ( ( '[CONTENT]' ) )
            // InternalBrowserTest.g:721:1: ( '[CONTENT]' )
            {
            // InternalBrowserTest.g:721:1: ( '[CONTENT]' )
            // InternalBrowserTest.g:722:2: '[CONTENT]'
            {
             before(grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0()); 

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
    // $ANTLR end "rule__Property__Group_0__0__Impl"


    // $ANTLR start "rule__Property__Group_0__1"
    // InternalBrowserTest.g:731:1: rule__Property__Group_0__1 : rule__Property__Group_0__1__Impl ;
    public final void rule__Property__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:735:1: ( rule__Property__Group_0__1__Impl )
            // InternalBrowserTest.g:736:2: rule__Property__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_0__1__Impl();

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
    // $ANTLR end "rule__Property__Group_0__1"


    // $ANTLR start "rule__Property__Group_0__1__Impl"
    // InternalBrowserTest.g:742:1: rule__Property__Group_0__1__Impl : ( ( rule__Property__ContentAssignment_0_1 ) ) ;
    public final void rule__Property__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:746:1: ( ( ( rule__Property__ContentAssignment_0_1 ) ) )
            // InternalBrowserTest.g:747:1: ( ( rule__Property__ContentAssignment_0_1 ) )
            {
            // InternalBrowserTest.g:747:1: ( ( rule__Property__ContentAssignment_0_1 ) )
            // InternalBrowserTest.g:748:2: ( rule__Property__ContentAssignment_0_1 )
            {
             before(grammarAccess.getPropertyAccess().getContentAssignment_0_1()); 
            // InternalBrowserTest.g:749:2: ( rule__Property__ContentAssignment_0_1 )
            // InternalBrowserTest.g:749:3: rule__Property__ContentAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ContentAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getContentAssignment_0_1()); 

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
    // $ANTLR end "rule__Property__Group_0__1__Impl"


    // $ANTLR start "rule__Property__Group_1__0"
    // InternalBrowserTest.g:758:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:762:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // InternalBrowserTest.g:763:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_1__1();

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
    // $ANTLR end "rule__Property__Group_1__0"


    // $ANTLR start "rule__Property__Group_1__0__Impl"
    // InternalBrowserTest.g:770:1: rule__Property__Group_1__0__Impl : ( '[TYPE]' ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:774:1: ( ( '[TYPE]' ) )
            // InternalBrowserTest.g:775:1: ( '[TYPE]' )
            {
            // InternalBrowserTest.g:775:1: ( '[TYPE]' )
            // InternalBrowserTest.g:776:2: '[TYPE]'
            {
             before(grammarAccess.getPropertyAccess().getTYPEKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTYPEKeyword_1_0()); 

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
    // $ANTLR end "rule__Property__Group_1__0__Impl"


    // $ANTLR start "rule__Property__Group_1__1"
    // InternalBrowserTest.g:785:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl rule__Property__Group_1__2 ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:789:1: ( rule__Property__Group_1__1__Impl rule__Property__Group_1__2 )
            // InternalBrowserTest.g:790:2: rule__Property__Group_1__1__Impl rule__Property__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_1__2();

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
    // $ANTLR end "rule__Property__Group_1__1"


    // $ANTLR start "rule__Property__Group_1__1__Impl"
    // InternalBrowserTest.g:797:1: rule__Property__Group_1__1__Impl : ( '$' ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:801:1: ( ( '$' ) )
            // InternalBrowserTest.g:802:1: ( '$' )
            {
            // InternalBrowserTest.g:802:1: ( '$' )
            // InternalBrowserTest.g:803:2: '$'
            {
             before(grammarAccess.getPropertyAccess().getDollarSignKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getDollarSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Property__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group_1__2"
    // InternalBrowserTest.g:812:1: rule__Property__Group_1__2 : rule__Property__Group_1__2__Impl ;
    public final void rule__Property__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:816:1: ( rule__Property__Group_1__2__Impl )
            // InternalBrowserTest.g:817:2: rule__Property__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_1__2__Impl();

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
    // $ANTLR end "rule__Property__Group_1__2"


    // $ANTLR start "rule__Property__Group_1__2__Impl"
    // InternalBrowserTest.g:823:1: rule__Property__Group_1__2__Impl : ( ( rule__Property__TypeAssignment_1_2 ) ) ;
    public final void rule__Property__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:827:1: ( ( ( rule__Property__TypeAssignment_1_2 ) ) )
            // InternalBrowserTest.g:828:1: ( ( rule__Property__TypeAssignment_1_2 ) )
            {
            // InternalBrowserTest.g:828:1: ( ( rule__Property__TypeAssignment_1_2 ) )
            // InternalBrowserTest.g:829:2: ( rule__Property__TypeAssignment_1_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1_2()); 
            // InternalBrowserTest.g:830:2: ( rule__Property__TypeAssignment_1_2 )
            // InternalBrowserTest.g:830:3: rule__Property__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1_2()); 

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
    // $ANTLR end "rule__Property__Group_1__2__Impl"


    // $ANTLR start "rule__Property__Group_2__0"
    // InternalBrowserTest.g:839:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:843:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // InternalBrowserTest.g:844:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_2__1();

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
    // $ANTLR end "rule__Property__Group_2__0"


    // $ANTLR start "rule__Property__Group_2__0__Impl"
    // InternalBrowserTest.g:851:1: rule__Property__Group_2__0__Impl : ( '[LABEL]' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:855:1: ( ( '[LABEL]' ) )
            // InternalBrowserTest.g:856:1: ( '[LABEL]' )
            {
            // InternalBrowserTest.g:856:1: ( '[LABEL]' )
            // InternalBrowserTest.g:857:2: '[LABEL]'
            {
             before(grammarAccess.getPropertyAccess().getLABELKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLABELKeyword_2_0()); 

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
    // $ANTLR end "rule__Property__Group_2__0__Impl"


    // $ANTLR start "rule__Property__Group_2__1"
    // InternalBrowserTest.g:866:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:870:1: ( rule__Property__Group_2__1__Impl )
            // InternalBrowserTest.g:871:2: rule__Property__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_2__1__Impl();

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
    // $ANTLR end "rule__Property__Group_2__1"


    // $ANTLR start "rule__Property__Group_2__1__Impl"
    // InternalBrowserTest.g:877:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__LabelAssignment_2_1 ) ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:881:1: ( ( ( rule__Property__LabelAssignment_2_1 ) ) )
            // InternalBrowserTest.g:882:1: ( ( rule__Property__LabelAssignment_2_1 ) )
            {
            // InternalBrowserTest.g:882:1: ( ( rule__Property__LabelAssignment_2_1 ) )
            // InternalBrowserTest.g:883:2: ( rule__Property__LabelAssignment_2_1 )
            {
             before(grammarAccess.getPropertyAccess().getLabelAssignment_2_1()); 
            // InternalBrowserTest.g:884:2: ( rule__Property__LabelAssignment_2_1 )
            // InternalBrowserTest.g:884:3: rule__Property__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getLabelAssignment_2_1()); 

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
    // $ANTLR end "rule__Property__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group_3__0"
    // InternalBrowserTest.g:893:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:897:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // InternalBrowserTest.g:898:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_3__1();

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
    // $ANTLR end "rule__Property__Group_3__0"


    // $ANTLR start "rule__Property__Group_3__0__Impl"
    // InternalBrowserTest.g:905:1: rule__Property__Group_3__0__Impl : ( '[NAME]' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:909:1: ( ( '[NAME]' ) )
            // InternalBrowserTest.g:910:1: ( '[NAME]' )
            {
            // InternalBrowserTest.g:910:1: ( '[NAME]' )
            // InternalBrowserTest.g:911:2: '[NAME]'
            {
             before(grammarAccess.getPropertyAccess().getNAMEKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNAMEKeyword_3_0()); 

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
    // $ANTLR end "rule__Property__Group_3__0__Impl"


    // $ANTLR start "rule__Property__Group_3__1"
    // InternalBrowserTest.g:920:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:924:1: ( rule__Property__Group_3__1__Impl )
            // InternalBrowserTest.g:925:2: rule__Property__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_3__1__Impl();

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
    // $ANTLR end "rule__Property__Group_3__1"


    // $ANTLR start "rule__Property__Group_3__1__Impl"
    // InternalBrowserTest.g:931:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__NameAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:935:1: ( ( ( rule__Property__NameAssignment_3_1 ) ) )
            // InternalBrowserTest.g:936:1: ( ( rule__Property__NameAssignment_3_1 ) )
            {
            // InternalBrowserTest.g:936:1: ( ( rule__Property__NameAssignment_3_1 ) )
            // InternalBrowserTest.g:937:2: ( rule__Property__NameAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_3_1()); 
            // InternalBrowserTest.g:938:2: ( rule__Property__NameAssignment_3_1 )
            // InternalBrowserTest.g:938:3: rule__Property__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Property__Group_3__1__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // InternalBrowserTest.g:947:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:951:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalBrowserTest.g:952:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1();

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
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // InternalBrowserTest.g:959:1: rule__Property__Group_4__0__Impl : ( '[VALUE]' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:963:1: ( ( '[VALUE]' ) )
            // InternalBrowserTest.g:964:1: ( '[VALUE]' )
            {
            // InternalBrowserTest.g:964:1: ( '[VALUE]' )
            // InternalBrowserTest.g:965:2: '[VALUE]'
            {
             before(grammarAccess.getPropertyAccess().getVALUEKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getVALUEKeyword_4_0()); 

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
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // InternalBrowserTest.g:974:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:978:1: ( rule__Property__Group_4__1__Impl )
            // InternalBrowserTest.g:979:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1__Impl();

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
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // InternalBrowserTest.g:985:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__ValueAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:989:1: ( ( ( rule__Property__ValueAssignment_4_1 ) ) )
            // InternalBrowserTest.g:990:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            {
            // InternalBrowserTest.g:990:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            // InternalBrowserTest.g:991:2: ( rule__Property__ValueAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            // InternalBrowserTest.g:992:2: ( rule__Property__ValueAssignment_4_1 )
            // InternalBrowserTest.g:992:3: rule__Property__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // InternalBrowserTest.g:1001:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1005:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // InternalBrowserTest.g:1006:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1();

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
    // $ANTLR end "rule__Property__Group_5__0"


    // $ANTLR start "rule__Property__Group_5__0__Impl"
    // InternalBrowserTest.g:1013:1: rule__Property__Group_5__0__Impl : ( '[ALT]' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1017:1: ( ( '[ALT]' ) )
            // InternalBrowserTest.g:1018:1: ( '[ALT]' )
            {
            // InternalBrowserTest.g:1018:1: ( '[ALT]' )
            // InternalBrowserTest.g:1019:2: '[ALT]'
            {
             before(grammarAccess.getPropertyAccess().getALTKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getALTKeyword_5_0()); 

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
    // $ANTLR end "rule__Property__Group_5__0__Impl"


    // $ANTLR start "rule__Property__Group_5__1"
    // InternalBrowserTest.g:1028:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1032:1: ( rule__Property__Group_5__1__Impl )
            // InternalBrowserTest.g:1033:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1__Impl();

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
    // $ANTLR end "rule__Property__Group_5__1"


    // $ANTLR start "rule__Property__Group_5__1__Impl"
    // InternalBrowserTest.g:1039:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__AltAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1043:1: ( ( ( rule__Property__AltAssignment_5_1 ) ) )
            // InternalBrowserTest.g:1044:1: ( ( rule__Property__AltAssignment_5_1 ) )
            {
            // InternalBrowserTest.g:1044:1: ( ( rule__Property__AltAssignment_5_1 ) )
            // InternalBrowserTest.g:1045:2: ( rule__Property__AltAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getAltAssignment_5_1()); 
            // InternalBrowserTest.g:1046:2: ( rule__Property__AltAssignment_5_1 )
            // InternalBrowserTest.g:1046:3: rule__Property__AltAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__AltAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAltAssignment_5_1()); 

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
    // $ANTLR end "rule__Property__Group_5__1__Impl"


    // $ANTLR start "rule__Property__Group_6__0"
    // InternalBrowserTest.g:1055:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1059:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // InternalBrowserTest.g:1060:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1();

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
    // $ANTLR end "rule__Property__Group_6__0"


    // $ANTLR start "rule__Property__Group_6__0__Impl"
    // InternalBrowserTest.g:1067:1: rule__Property__Group_6__0__Impl : ( '[PARENT]' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1071:1: ( ( '[PARENT]' ) )
            // InternalBrowserTest.g:1072:1: ( '[PARENT]' )
            {
            // InternalBrowserTest.g:1072:1: ( '[PARENT]' )
            // InternalBrowserTest.g:1073:2: '[PARENT]'
            {
             before(grammarAccess.getPropertyAccess().getPARENTKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPARENTKeyword_6_0()); 

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
    // $ANTLR end "rule__Property__Group_6__0__Impl"


    // $ANTLR start "rule__Property__Group_6__1"
    // InternalBrowserTest.g:1082:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl rule__Property__Group_6__2 ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1086:1: ( rule__Property__Group_6__1__Impl rule__Property__Group_6__2 )
            // InternalBrowserTest.g:1087:2: rule__Property__Group_6__1__Impl rule__Property__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_6__2();

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
    // $ANTLR end "rule__Property__Group_6__1"


    // $ANTLR start "rule__Property__Group_6__1__Impl"
    // InternalBrowserTest.g:1094:1: rule__Property__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1098:1: ( ( '{' ) )
            // InternalBrowserTest.g:1099:1: ( '{' )
            {
            // InternalBrowserTest.g:1099:1: ( '{' )
            // InternalBrowserTest.g:1100:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Property__Group_6__1__Impl"


    // $ANTLR start "rule__Property__Group_6__2"
    // InternalBrowserTest.g:1109:1: rule__Property__Group_6__2 : rule__Property__Group_6__2__Impl rule__Property__Group_6__3 ;
    public final void rule__Property__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1113:1: ( rule__Property__Group_6__2__Impl rule__Property__Group_6__3 )
            // InternalBrowserTest.g:1114:2: rule__Property__Group_6__2__Impl rule__Property__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_6__3();

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
    // $ANTLR end "rule__Property__Group_6__2"


    // $ANTLR start "rule__Property__Group_6__2__Impl"
    // InternalBrowserTest.g:1121:1: rule__Property__Group_6__2__Impl : ( ( rule__Property__SubPropertiesAssignment_6_2 )* ) ;
    public final void rule__Property__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1125:1: ( ( ( rule__Property__SubPropertiesAssignment_6_2 )* ) )
            // InternalBrowserTest.g:1126:1: ( ( rule__Property__SubPropertiesAssignment_6_2 )* )
            {
            // InternalBrowserTest.g:1126:1: ( ( rule__Property__SubPropertiesAssignment_6_2 )* )
            // InternalBrowserTest.g:1127:2: ( rule__Property__SubPropertiesAssignment_6_2 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_6_2()); 
            // InternalBrowserTest.g:1128:2: ( rule__Property__SubPropertiesAssignment_6_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=28)||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBrowserTest.g:1128:3: rule__Property__SubPropertiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Property__SubPropertiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_6_2()); 

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
    // $ANTLR end "rule__Property__Group_6__2__Impl"


    // $ANTLR start "rule__Property__Group_6__3"
    // InternalBrowserTest.g:1136:1: rule__Property__Group_6__3 : rule__Property__Group_6__3__Impl ;
    public final void rule__Property__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1140:1: ( rule__Property__Group_6__3__Impl )
            // InternalBrowserTest.g:1141:2: rule__Property__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_6__3__Impl();

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
    // $ANTLR end "rule__Property__Group_6__3"


    // $ANTLR start "rule__Property__Group_6__3__Impl"
    // InternalBrowserTest.g:1147:1: rule__Property__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Property__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1151:1: ( ( '}' ) )
            // InternalBrowserTest.g:1152:1: ( '}' )
            {
            // InternalBrowserTest.g:1152:1: ( '}' )
            // InternalBrowserTest.g:1153:2: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__Property__Group_6__3__Impl"


    // $ANTLR start "rule__Property__Group_7__0"
    // InternalBrowserTest.g:1163:1: rule__Property__Group_7__0 : rule__Property__Group_7__0__Impl rule__Property__Group_7__1 ;
    public final void rule__Property__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1167:1: ( rule__Property__Group_7__0__Impl rule__Property__Group_7__1 )
            // InternalBrowserTest.g:1168:2: rule__Property__Group_7__0__Impl rule__Property__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__1();

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
    // $ANTLR end "rule__Property__Group_7__0"


    // $ANTLR start "rule__Property__Group_7__0__Impl"
    // InternalBrowserTest.g:1175:1: rule__Property__Group_7__0__Impl : ( '[NTH-CHILD]' ) ;
    public final void rule__Property__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1179:1: ( ( '[NTH-CHILD]' ) )
            // InternalBrowserTest.g:1180:1: ( '[NTH-CHILD]' )
            {
            // InternalBrowserTest.g:1180:1: ( '[NTH-CHILD]' )
            // InternalBrowserTest.g:1181:2: '[NTH-CHILD]'
            {
             before(grammarAccess.getPropertyAccess().getNTHCHILDKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNTHCHILDKeyword_7_0()); 

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
    // $ANTLR end "rule__Property__Group_7__0__Impl"


    // $ANTLR start "rule__Property__Group_7__1"
    // InternalBrowserTest.g:1190:1: rule__Property__Group_7__1 : rule__Property__Group_7__1__Impl ;
    public final void rule__Property__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1194:1: ( rule__Property__Group_7__1__Impl )
            // InternalBrowserTest.g:1195:2: rule__Property__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_7__1__Impl();

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
    // $ANTLR end "rule__Property__Group_7__1"


    // $ANTLR start "rule__Property__Group_7__1__Impl"
    // InternalBrowserTest.g:1201:1: rule__Property__Group_7__1__Impl : ( ( rule__Property__ChildAssignment_7_1 ) ) ;
    public final void rule__Property__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1205:1: ( ( ( rule__Property__ChildAssignment_7_1 ) ) )
            // InternalBrowserTest.g:1206:1: ( ( rule__Property__ChildAssignment_7_1 ) )
            {
            // InternalBrowserTest.g:1206:1: ( ( rule__Property__ChildAssignment_7_1 ) )
            // InternalBrowserTest.g:1207:2: ( rule__Property__ChildAssignment_7_1 )
            {
             before(grammarAccess.getPropertyAccess().getChildAssignment_7_1()); 
            // InternalBrowserTest.g:1208:2: ( rule__Property__ChildAssignment_7_1 )
            // InternalBrowserTest.g:1208:3: rule__Property__ChildAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ChildAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getChildAssignment_7_1()); 

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
    // $ANTLR end "rule__Property__Group_7__1__Impl"


    // $ANTLR start "rule__ActionCommand__Group__0"
    // InternalBrowserTest.g:1217:1: rule__ActionCommand__Group__0 : rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 ;
    public final void rule__ActionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1221:1: ( rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 )
            // InternalBrowserTest.g:1222:2: rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ActionCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__1();

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
    // $ANTLR end "rule__ActionCommand__Group__0"


    // $ANTLR start "rule__ActionCommand__Group__0__Impl"
    // InternalBrowserTest.g:1229:1: rule__ActionCommand__Group__0__Impl : ( '[ACTION]' ) ;
    public final void rule__ActionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1233:1: ( ( '[ACTION]' ) )
            // InternalBrowserTest.g:1234:1: ( '[ACTION]' )
            {
            // InternalBrowserTest.g:1234:1: ( '[ACTION]' )
            // InternalBrowserTest.g:1235:2: '[ACTION]'
            {
             before(grammarAccess.getActionCommandAccess().getACTIONKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActionCommandAccess().getACTIONKeyword_0()); 

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
    // $ANTLR end "rule__ActionCommand__Group__0__Impl"


    // $ANTLR start "rule__ActionCommand__Group__1"
    // InternalBrowserTest.g:1244:1: rule__ActionCommand__Group__1 : rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 ;
    public final void rule__ActionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1248:1: ( rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 )
            // InternalBrowserTest.g:1249:2: rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActionCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__2();

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
    // $ANTLR end "rule__ActionCommand__Group__1"


    // $ANTLR start "rule__ActionCommand__Group__1__Impl"
    // InternalBrowserTest.g:1256:1: rule__ActionCommand__Group__1__Impl : ( '$' ) ;
    public final void rule__ActionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1260:1: ( ( '$' ) )
            // InternalBrowserTest.g:1261:1: ( '$' )
            {
            // InternalBrowserTest.g:1261:1: ( '$' )
            // InternalBrowserTest.g:1262:2: '$'
            {
             before(grammarAccess.getActionCommandAccess().getDollarSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionCommandAccess().getDollarSignKeyword_1()); 

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
    // $ANTLR end "rule__ActionCommand__Group__1__Impl"


    // $ANTLR start "rule__ActionCommand__Group__2"
    // InternalBrowserTest.g:1271:1: rule__ActionCommand__Group__2 : rule__ActionCommand__Group__2__Impl rule__ActionCommand__Group__3 ;
    public final void rule__ActionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1275:1: ( rule__ActionCommand__Group__2__Impl rule__ActionCommand__Group__3 )
            // InternalBrowserTest.g:1276:2: rule__ActionCommand__Group__2__Impl rule__ActionCommand__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ActionCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__3();

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
    // $ANTLR end "rule__ActionCommand__Group__2"


    // $ANTLR start "rule__ActionCommand__Group__2__Impl"
    // InternalBrowserTest.g:1283:1: rule__ActionCommand__Group__2__Impl : ( ( ( rule__ActionCommand__NameAssignment_2 ) ) ( ( rule__ActionCommand__NameAssignment_2 )* ) ) ;
    public final void rule__ActionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1287:1: ( ( ( ( rule__ActionCommand__NameAssignment_2 ) ) ( ( rule__ActionCommand__NameAssignment_2 )* ) ) )
            // InternalBrowserTest.g:1288:1: ( ( ( rule__ActionCommand__NameAssignment_2 ) ) ( ( rule__ActionCommand__NameAssignment_2 )* ) )
            {
            // InternalBrowserTest.g:1288:1: ( ( ( rule__ActionCommand__NameAssignment_2 ) ) ( ( rule__ActionCommand__NameAssignment_2 )* ) )
            // InternalBrowserTest.g:1289:2: ( ( rule__ActionCommand__NameAssignment_2 ) ) ( ( rule__ActionCommand__NameAssignment_2 )* )
            {
            // InternalBrowserTest.g:1289:2: ( ( rule__ActionCommand__NameAssignment_2 ) )
            // InternalBrowserTest.g:1290:3: ( rule__ActionCommand__NameAssignment_2 )
            {
             before(grammarAccess.getActionCommandAccess().getNameAssignment_2()); 
            // InternalBrowserTest.g:1291:3: ( rule__ActionCommand__NameAssignment_2 )
            // InternalBrowserTest.g:1291:4: rule__ActionCommand__NameAssignment_2
            {
            pushFollow(FOLLOW_16);
            rule__ActionCommand__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getNameAssignment_2()); 

            }

            // InternalBrowserTest.g:1294:2: ( ( rule__ActionCommand__NameAssignment_2 )* )
            // InternalBrowserTest.g:1295:3: ( rule__ActionCommand__NameAssignment_2 )*
            {
             before(grammarAccess.getActionCommandAccess().getNameAssignment_2()); 
            // InternalBrowserTest.g:1296:3: ( rule__ActionCommand__NameAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBrowserTest.g:1296:4: rule__ActionCommand__NameAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ActionCommand__NameAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getActionCommandAccess().getNameAssignment_2()); 

            }


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
    // $ANTLR end "rule__ActionCommand__Group__2__Impl"


    // $ANTLR start "rule__ActionCommand__Group__3"
    // InternalBrowserTest.g:1305:1: rule__ActionCommand__Group__3 : rule__ActionCommand__Group__3__Impl ;
    public final void rule__ActionCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1309:1: ( rule__ActionCommand__Group__3__Impl )
            // InternalBrowserTest.g:1310:2: rule__ActionCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__3__Impl();

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
    // $ANTLR end "rule__ActionCommand__Group__3"


    // $ANTLR start "rule__ActionCommand__Group__3__Impl"
    // InternalBrowserTest.g:1316:1: rule__ActionCommand__Group__3__Impl : ( ( rule__ActionCommand__CommandAssignment_3 ) ) ;
    public final void rule__ActionCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1320:1: ( ( ( rule__ActionCommand__CommandAssignment_3 ) ) )
            // InternalBrowserTest.g:1321:1: ( ( rule__ActionCommand__CommandAssignment_3 ) )
            {
            // InternalBrowserTest.g:1321:1: ( ( rule__ActionCommand__CommandAssignment_3 ) )
            // InternalBrowserTest.g:1322:2: ( rule__ActionCommand__CommandAssignment_3 )
            {
             before(grammarAccess.getActionCommandAccess().getCommandAssignment_3()); 
            // InternalBrowserTest.g:1323:2: ( rule__ActionCommand__CommandAssignment_3 )
            // InternalBrowserTest.g:1323:3: rule__ActionCommand__CommandAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__CommandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getCommandAssignment_3()); 

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
    // $ANTLR end "rule__ActionCommand__Group__3__Impl"


    // $ANTLR start "rule__ActionType__Group_1__0"
    // InternalBrowserTest.g:1332:1: rule__ActionType__Group_1__0 : rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1 ;
    public final void rule__ActionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1336:1: ( rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1 )
            // InternalBrowserTest.g:1337:2: rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ActionType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_1__1();

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
    // $ANTLR end "rule__ActionType__Group_1__0"


    // $ANTLR start "rule__ActionType__Group_1__0__Impl"
    // InternalBrowserTest.g:1344:1: rule__ActionType__Group_1__0__Impl : ( '[CHECK]' ) ;
    public final void rule__ActionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1348:1: ( ( '[CHECK]' ) )
            // InternalBrowserTest.g:1349:1: ( '[CHECK]' )
            {
            // InternalBrowserTest.g:1349:1: ( '[CHECK]' )
            // InternalBrowserTest.g:1350:2: '[CHECK]'
            {
             before(grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0()); 

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
    // $ANTLR end "rule__ActionType__Group_1__0__Impl"


    // $ANTLR start "rule__ActionType__Group_1__1"
    // InternalBrowserTest.g:1359:1: rule__ActionType__Group_1__1 : rule__ActionType__Group_1__1__Impl ;
    public final void rule__ActionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1363:1: ( rule__ActionType__Group_1__1__Impl )
            // InternalBrowserTest.g:1364:2: rule__ActionType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_1__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_1__1"


    // $ANTLR start "rule__ActionType__Group_1__1__Impl"
    // InternalBrowserTest.g:1370:1: rule__ActionType__Group_1__1__Impl : ( ( rule__ActionType__ArgumentAssignment_1_1 ) ) ;
    public final void rule__ActionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1374:1: ( ( ( rule__ActionType__ArgumentAssignment_1_1 ) ) )
            // InternalBrowserTest.g:1375:1: ( ( rule__ActionType__ArgumentAssignment_1_1 ) )
            {
            // InternalBrowserTest.g:1375:1: ( ( rule__ActionType__ArgumentAssignment_1_1 ) )
            // InternalBrowserTest.g:1376:2: ( rule__ActionType__ArgumentAssignment_1_1 )
            {
             before(grammarAccess.getActionTypeAccess().getArgumentAssignment_1_1()); 
            // InternalBrowserTest.g:1377:2: ( rule__ActionType__ArgumentAssignment_1_1 )
            // InternalBrowserTest.g:1377:3: rule__ActionType__ArgumentAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__ArgumentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getArgumentAssignment_1_1()); 

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
    // $ANTLR end "rule__ActionType__Group_1__1__Impl"


    // $ANTLR start "rule__ActionType__Group_2__0"
    // InternalBrowserTest.g:1386:1: rule__ActionType__Group_2__0 : rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1 ;
    public final void rule__ActionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1390:1: ( rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1 )
            // InternalBrowserTest.g:1391:2: rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ActionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_2__1();

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
    // $ANTLR end "rule__ActionType__Group_2__0"


    // $ANTLR start "rule__ActionType__Group_2__0__Impl"
    // InternalBrowserTest.g:1398:1: rule__ActionType__Group_2__0__Impl : ( '[SET-TEXT]' ) ;
    public final void rule__ActionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1402:1: ( ( '[SET-TEXT]' ) )
            // InternalBrowserTest.g:1403:1: ( '[SET-TEXT]' )
            {
            // InternalBrowserTest.g:1403:1: ( '[SET-TEXT]' )
            // InternalBrowserTest.g:1404:2: '[SET-TEXT]'
            {
             before(grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0()); 

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
    // $ANTLR end "rule__ActionType__Group_2__0__Impl"


    // $ANTLR start "rule__ActionType__Group_2__1"
    // InternalBrowserTest.g:1413:1: rule__ActionType__Group_2__1 : rule__ActionType__Group_2__1__Impl ;
    public final void rule__ActionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1417:1: ( rule__ActionType__Group_2__1__Impl )
            // InternalBrowserTest.g:1418:2: rule__ActionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_2__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_2__1"


    // $ANTLR start "rule__ActionType__Group_2__1__Impl"
    // InternalBrowserTest.g:1424:1: rule__ActionType__Group_2__1__Impl : ( ( rule__ActionType__ArgumentAssignment_2_1 ) ) ;
    public final void rule__ActionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1428:1: ( ( ( rule__ActionType__ArgumentAssignment_2_1 ) ) )
            // InternalBrowserTest.g:1429:1: ( ( rule__ActionType__ArgumentAssignment_2_1 ) )
            {
            // InternalBrowserTest.g:1429:1: ( ( rule__ActionType__ArgumentAssignment_2_1 ) )
            // InternalBrowserTest.g:1430:2: ( rule__ActionType__ArgumentAssignment_2_1 )
            {
             before(grammarAccess.getActionTypeAccess().getArgumentAssignment_2_1()); 
            // InternalBrowserTest.g:1431:2: ( rule__ActionType__ArgumentAssignment_2_1 )
            // InternalBrowserTest.g:1431:3: rule__ActionType__ArgumentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__ArgumentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getArgumentAssignment_2_1()); 

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
    // $ANTLR end "rule__ActionType__Group_2__1__Impl"


    // $ANTLR start "rule__ActionType__Group_3__0"
    // InternalBrowserTest.g:1440:1: rule__ActionType__Group_3__0 : rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 ;
    public final void rule__ActionType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1444:1: ( rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 )
            // InternalBrowserTest.g:1445:2: rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ActionType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_3__1();

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
    // $ANTLR end "rule__ActionType__Group_3__0"


    // $ANTLR start "rule__ActionType__Group_3__0__Impl"
    // InternalBrowserTest.g:1452:1: rule__ActionType__Group_3__0__Impl : ( '[CHOOSE]' ) ;
    public final void rule__ActionType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1456:1: ( ( '[CHOOSE]' ) )
            // InternalBrowserTest.g:1457:1: ( '[CHOOSE]' )
            {
            // InternalBrowserTest.g:1457:1: ( '[CHOOSE]' )
            // InternalBrowserTest.g:1458:2: '[CHOOSE]'
            {
             before(grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0()); 

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
    // $ANTLR end "rule__ActionType__Group_3__0__Impl"


    // $ANTLR start "rule__ActionType__Group_3__1"
    // InternalBrowserTest.g:1467:1: rule__ActionType__Group_3__1 : rule__ActionType__Group_3__1__Impl ;
    public final void rule__ActionType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1471:1: ( rule__ActionType__Group_3__1__Impl )
            // InternalBrowserTest.g:1472:2: rule__ActionType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_3__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_3__1"


    // $ANTLR start "rule__ActionType__Group_3__1__Impl"
    // InternalBrowserTest.g:1478:1: rule__ActionType__Group_3__1__Impl : ( ( rule__ActionType__ArgumentAssignment_3_1 ) ) ;
    public final void rule__ActionType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1482:1: ( ( ( rule__ActionType__ArgumentAssignment_3_1 ) ) )
            // InternalBrowserTest.g:1483:1: ( ( rule__ActionType__ArgumentAssignment_3_1 ) )
            {
            // InternalBrowserTest.g:1483:1: ( ( rule__ActionType__ArgumentAssignment_3_1 ) )
            // InternalBrowserTest.g:1484:2: ( rule__ActionType__ArgumentAssignment_3_1 )
            {
             before(grammarAccess.getActionTypeAccess().getArgumentAssignment_3_1()); 
            // InternalBrowserTest.g:1485:2: ( rule__ActionType__ArgumentAssignment_3_1 )
            // InternalBrowserTest.g:1485:3: rule__ActionType__ArgumentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__ArgumentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getArgumentAssignment_3_1()); 

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
    // $ANTLR end "rule__ActionType__Group_3__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalBrowserTest.g:1494:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1498:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserTest.g:1499:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

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
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalBrowserTest.g:1506:1: rule__Test__Group__0__Impl : ( '[TEST]' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1510:1: ( ( '[TEST]' ) )
            // InternalBrowserTest.g:1511:1: ( '[TEST]' )
            {
            // InternalBrowserTest.g:1511:1: ( '[TEST]' )
            // InternalBrowserTest.g:1512:2: '[TEST]'
            {
             before(grammarAccess.getTestAccess().getTESTKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTESTKeyword_0()); 

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
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalBrowserTest.g:1521:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1525:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserTest.g:1526:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

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
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalBrowserTest.g:1533:1: rule__Test__Group__1__Impl : ( '$' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1537:1: ( ( '$' ) )
            // InternalBrowserTest.g:1538:1: ( '$' )
            {
            // InternalBrowserTest.g:1538:1: ( '$' )
            // InternalBrowserTest.g:1539:2: '$'
            {
             before(grammarAccess.getTestAccess().getDollarSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDollarSignKeyword_1()); 

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
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalBrowserTest.g:1548:1: rule__Test__Group__2 : rule__Test__Group__2__Impl ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1552:1: ( rule__Test__Group__2__Impl )
            // InternalBrowserTest.g:1553:2: rule__Test__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__2__Impl();

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
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalBrowserTest.g:1559:1: rule__Test__Group__2__Impl : ( ( rule__Test__NameAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1563:1: ( ( ( rule__Test__NameAssignment_2 ) ) )
            // InternalBrowserTest.g:1564:1: ( ( rule__Test__NameAssignment_2 ) )
            {
            // InternalBrowserTest.g:1564:1: ( ( rule__Test__NameAssignment_2 ) )
            // InternalBrowserTest.g:1565:2: ( rule__Test__NameAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_2()); 
            // InternalBrowserTest.g:1566:2: ( rule__Test__NameAssignment_2 )
            // InternalBrowserTest.g:1566:3: rule__Test__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__TestFile__TaskAssignment"
    // InternalBrowserTest.g:1575:1: rule__TestFile__TaskAssignment : ( ruleTask ) ;
    public final void rule__TestFile__TaskAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1579:1: ( ( ruleTask ) )
            // InternalBrowserTest.g:1580:2: ( ruleTask )
            {
            // InternalBrowserTest.g:1580:2: ( ruleTask )
            // InternalBrowserTest.g:1581:3: ruleTask
            {
             before(grammarAccess.getTestFileAccess().getTaskTaskParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTestFileAccess().getTaskTaskParserRuleCall_0()); 

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
    // $ANTLR end "rule__TestFile__TaskAssignment"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalBrowserTest.g:1590:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1594:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:1595:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:1595:2: ( RULE_ID )
            // InternalBrowserTest.g:1596:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionsAssignment_2"
    // InternalBrowserTest.g:1605:1: rule__Task__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__Task__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1609:1: ( ( ruleAction ) )
            // InternalBrowserTest.g:1610:2: ( ruleAction )
            {
            // InternalBrowserTest.g:1610:2: ( ruleAction )
            // InternalBrowserTest.g:1611:3: ruleAction
            {
             before(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Task__ActionsAssignment_2"


    // $ANTLR start "rule__GoTo__UrlAssignment_1"
    // InternalBrowserTest.g:1620:1: rule__GoTo__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1624:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1625:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1625:2: ( RULE_STRING )
            // InternalBrowserTest.g:1626:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GoTo__UrlAssignment_1"


    // $ANTLR start "rule__Select__NameAssignment_2"
    // InternalBrowserTest.g:1635:1: rule__Select__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Select__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1639:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:1640:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:1640:2: ( RULE_ID )
            // InternalBrowserTest.g:1641:3: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Select__NameAssignment_2"


    // $ANTLR start "rule__Select__PropertiesAssignment_3"
    // InternalBrowserTest.g:1650:1: rule__Select__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Select__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1654:1: ( ( ruleProperty ) )
            // InternalBrowserTest.g:1655:2: ( ruleProperty )
            {
            // InternalBrowserTest.g:1655:2: ( ruleProperty )
            // InternalBrowserTest.g:1656:3: ruleProperty
            {
             before(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Select__PropertiesAssignment_3"


    // $ANTLR start "rule__Property__ContentAssignment_0_1"
    // InternalBrowserTest.g:1665:1: rule__Property__ContentAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Property__ContentAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1669:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1670:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1670:2: ( RULE_STRING )
            // InternalBrowserTest.g:1671:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getContentSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getContentSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Property__ContentAssignment_0_1"


    // $ANTLR start "rule__Property__TypeAssignment_1_2"
    // InternalBrowserTest.g:1680:1: rule__Property__TypeAssignment_1_2 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1684:1: ( ( ruleType ) )
            // InternalBrowserTest.g:1685:2: ( ruleType )
            {
            // InternalBrowserTest.g:1685:2: ( ruleType )
            // InternalBrowserTest.g:1686:3: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_1_2"


    // $ANTLR start "rule__Property__LabelAssignment_2_1"
    // InternalBrowserTest.g:1695:1: rule__Property__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Property__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1699:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1700:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1700:2: ( RULE_STRING )
            // InternalBrowserTest.g:1701:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Property__LabelAssignment_2_1"


    // $ANTLR start "rule__Property__NameAssignment_3_1"
    // InternalBrowserTest.g:1710:1: rule__Property__NameAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Property__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1714:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1715:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1715:2: ( RULE_STRING )
            // InternalBrowserTest.g:1716:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_3_1"


    // $ANTLR start "rule__Property__ValueAssignment_4_1"
    // InternalBrowserTest.g:1725:1: rule__Property__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Property__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1729:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1730:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1730:2: ( RULE_STRING )
            // InternalBrowserTest.g:1731:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Property__ValueAssignment_4_1"


    // $ANTLR start "rule__Property__AltAssignment_5_1"
    // InternalBrowserTest.g:1740:1: rule__Property__AltAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Property__AltAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1744:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1745:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1745:2: ( RULE_STRING )
            // InternalBrowserTest.g:1746:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getAltSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getAltSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Property__AltAssignment_5_1"


    // $ANTLR start "rule__Property__SubPropertiesAssignment_6_2"
    // InternalBrowserTest.g:1755:1: rule__Property__SubPropertiesAssignment_6_2 : ( ruleProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1759:1: ( ( ruleProperty ) )
            // InternalBrowserTest.g:1760:2: ( ruleProperty )
            {
            // InternalBrowserTest.g:1760:2: ( ruleProperty )
            // InternalBrowserTest.g:1761:3: ruleProperty
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Property__SubPropertiesAssignment_6_2"


    // $ANTLR start "rule__Property__ChildAssignment_7_1"
    // InternalBrowserTest.g:1770:1: rule__Property__ChildAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Property__ChildAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1774:1: ( ( RULE_INT ) )
            // InternalBrowserTest.g:1775:2: ( RULE_INT )
            {
            // InternalBrowserTest.g:1775:2: ( RULE_INT )
            // InternalBrowserTest.g:1776:3: RULE_INT
            {
             before(grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Property__ChildAssignment_7_1"


    // $ANTLR start "rule__ActionCommand__NameAssignment_2"
    // InternalBrowserTest.g:1785:1: rule__ActionCommand__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActionCommand__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1789:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:1790:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:1790:2: ( RULE_ID )
            // InternalBrowserTest.g:1791:3: RULE_ID
            {
             before(grammarAccess.getActionCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionCommandAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActionCommand__NameAssignment_2"


    // $ANTLR start "rule__ActionCommand__CommandAssignment_3"
    // InternalBrowserTest.g:1800:1: rule__ActionCommand__CommandAssignment_3 : ( ruleActionType ) ;
    public final void rule__ActionCommand__CommandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1804:1: ( ( ruleActionType ) )
            // InternalBrowserTest.g:1805:2: ( ruleActionType )
            {
            // InternalBrowserTest.g:1805:2: ( ruleActionType )
            // InternalBrowserTest.g:1806:3: ruleActionType
            {
             before(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ActionCommand__CommandAssignment_3"


    // $ANTLR start "rule__ActionType__ArgumentAssignment_1_1"
    // InternalBrowserTest.g:1815:1: rule__ActionType__ArgumentAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ActionType__ArgumentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1819:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1820:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1820:2: ( RULE_STRING )
            // InternalBrowserTest.g:1821:3: RULE_STRING
            {
             before(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ActionType__ArgumentAssignment_1_1"


    // $ANTLR start "rule__ActionType__ArgumentAssignment_2_1"
    // InternalBrowserTest.g:1830:1: rule__ActionType__ArgumentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ActionType__ArgumentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1834:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1835:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1835:2: ( RULE_STRING )
            // InternalBrowserTest.g:1836:3: RULE_STRING
            {
             before(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ActionType__ArgumentAssignment_2_1"


    // $ANTLR start "rule__ActionType__ArgumentAssignment_3_1"
    // InternalBrowserTest.g:1845:1: rule__ActionType__ArgumentAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ActionType__ArgumentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1849:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:1850:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:1850:2: ( RULE_STRING )
            // InternalBrowserTest.g:1851:3: RULE_STRING
            {
             before(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ActionType__ArgumentAssignment_3_1"


    // $ANTLR start "rule__Test__NameAssignment_2"
    // InternalBrowserTest.g:1860:1: rule__Test__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1864:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:1865:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:1865:2: ( RULE_ID )
            // InternalBrowserTest.g:1866:3: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Test__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001100180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001100180002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000009FC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000009FC00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000DFC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000E00000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});

}