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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ALL'", "'[CLICK]'", "'LINK'", "'INPUT'", "'TEXT'", "'CHECKBOX'", "'DIV'", "'TITLE'", "'CONTENT'", "'FALSE'", "'TRUE'", "'[TASK]'", "'[GOTO]'", "'[SELECT]'", "'$'", "'.'", "'[CONTENT]'", "'[LABEL]'", "'[VALUE]'", "'[ALT]'", "'[TYPE]'", "'[NAME]'", "'[NTH-CHILD]'", "'[PARENT]'", "'{'", "'}'", "'[ACTION]'", "'[CHECK]'", "'[SET-TEXT]'", "'[CHOOSE]'", "'[TEST]'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
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

                if ( (LA1_0==22) ) {
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


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserTest.g:178:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserTest.g:179:1: ( ruleVariable EOF )
            // InternalBrowserTest.g:180:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserTest.g:187:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:191:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalBrowserTest.g:192:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalBrowserTest.g:192:2: ( ( rule__Variable__Group__0 ) )
            // InternalBrowserTest.g:193:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalBrowserTest.g:194:3: ( rule__Variable__Group__0 )
            // InternalBrowserTest.g:194:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEntree"
    // InternalBrowserTest.g:203:1: entryRuleEntree : ruleEntree EOF ;
    public final void entryRuleEntree() throws RecognitionException {
        try {
            // InternalBrowserTest.g:204:1: ( ruleEntree EOF )
            // InternalBrowserTest.g:205:1: ruleEntree EOF
            {
             before(grammarAccess.getEntreeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getEntreeRule()); 
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
    // $ANTLR end "entryRuleEntree"


    // $ANTLR start "ruleEntree"
    // InternalBrowserTest.g:212:1: ruleEntree : ( ( rule__Entree__Alternatives ) ) ;
    public final void ruleEntree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:216:2: ( ( ( rule__Entree__Alternatives ) ) )
            // InternalBrowserTest.g:217:2: ( ( rule__Entree__Alternatives ) )
            {
            // InternalBrowserTest.g:217:2: ( ( rule__Entree__Alternatives ) )
            // InternalBrowserTest.g:218:3: ( rule__Entree__Alternatives )
            {
             before(grammarAccess.getEntreeAccess().getAlternatives()); 
            // InternalBrowserTest.g:219:3: ( rule__Entree__Alternatives )
            // InternalBrowserTest.g:219:4: rule__Entree__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntree"


    // $ANTLR start "entryRuleProperty"
    // InternalBrowserTest.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalBrowserTest.g:229:1: ( ruleProperty EOF )
            // InternalBrowserTest.g:230:1: ruleProperty EOF
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
    // InternalBrowserTest.g:237:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:241:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalBrowserTest.g:242:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalBrowserTest.g:242:2: ( ( rule__Property__Alternatives ) )
            // InternalBrowserTest.g:243:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalBrowserTest.g:244:3: ( rule__Property__Alternatives )
            // InternalBrowserTest.g:244:4: rule__Property__Alternatives
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
    // InternalBrowserTest.g:253:1: entryRuleActionCommand : ruleActionCommand EOF ;
    public final void entryRuleActionCommand() throws RecognitionException {
        try {
            // InternalBrowserTest.g:254:1: ( ruleActionCommand EOF )
            // InternalBrowserTest.g:255:1: ruleActionCommand EOF
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
    // InternalBrowserTest.g:262:1: ruleActionCommand : ( ( rule__ActionCommand__Group__0 ) ) ;
    public final void ruleActionCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:266:2: ( ( ( rule__ActionCommand__Group__0 ) ) )
            // InternalBrowserTest.g:267:2: ( ( rule__ActionCommand__Group__0 ) )
            {
            // InternalBrowserTest.g:267:2: ( ( rule__ActionCommand__Group__0 ) )
            // InternalBrowserTest.g:268:3: ( rule__ActionCommand__Group__0 )
            {
             before(grammarAccess.getActionCommandAccess().getGroup()); 
            // InternalBrowserTest.g:269:3: ( rule__ActionCommand__Group__0 )
            // InternalBrowserTest.g:269:4: rule__ActionCommand__Group__0
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
    // InternalBrowserTest.g:278:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalBrowserTest.g:279:1: ( ruleActionType EOF )
            // InternalBrowserTest.g:280:1: ruleActionType EOF
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
    // InternalBrowserTest.g:287:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:291:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalBrowserTest.g:292:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalBrowserTest.g:292:2: ( ( rule__ActionType__Alternatives ) )
            // InternalBrowserTest.g:293:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalBrowserTest.g:294:3: ( rule__ActionType__Alternatives )
            // InternalBrowserTest.g:294:4: rule__ActionType__Alternatives
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
    // InternalBrowserTest.g:303:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalBrowserTest.g:304:1: ( ruleTest EOF )
            // InternalBrowserTest.g:305:1: ruleTest EOF
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
    // InternalBrowserTest.g:312:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:316:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalBrowserTest.g:317:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalBrowserTest.g:317:2: ( ( rule__Test__Group__0 ) )
            // InternalBrowserTest.g:318:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalBrowserTest.g:319:3: ( rule__Test__Group__0 )
            // InternalBrowserTest.g:319:4: rule__Test__Group__0
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
    // InternalBrowserTest.g:328:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:332:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalBrowserTest.g:333:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalBrowserTest.g:333:2: ( ( rule__Type__Alternatives ) )
            // InternalBrowserTest.g:334:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalBrowserTest.g:335:3: ( rule__Type__Alternatives )
            // InternalBrowserTest.g:335:4: rule__Type__Alternatives
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


    // $ANTLR start "ruleBoolean"
    // InternalBrowserTest.g:344:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:348:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalBrowserTest.g:349:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalBrowserTest.g:349:2: ( ( rule__Boolean__Alternatives ) )
            // InternalBrowserTest.g:350:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalBrowserTest.g:351:3: ( rule__Boolean__Alternatives )
            // InternalBrowserTest.g:351:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleAttribute"
    // InternalBrowserTest.g:360:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:364:1: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalBrowserTest.g:365:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalBrowserTest.g:365:2: ( ( rule__Attribute__Alternatives ) )
            // InternalBrowserTest.g:366:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalBrowserTest.g:367:3: ( rule__Attribute__Alternatives )
            // InternalBrowserTest.g:367:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleAccessor"
    // InternalBrowserTest.g:376:1: ruleAccessor : ( ( 'ALL' ) ) ;
    public final void ruleAccessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:380:1: ( ( ( 'ALL' ) ) )
            // InternalBrowserTest.g:381:2: ( ( 'ALL' ) )
            {
            // InternalBrowserTest.g:381:2: ( ( 'ALL' ) )
            // InternalBrowserTest.g:382:3: ( 'ALL' )
            {
             before(grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration()); 
            // InternalBrowserTest.g:383:3: ( 'ALL' )
            // InternalBrowserTest.g:383:4: 'ALL'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleAccessor"


    // $ANTLR start "rule__Task__NameAlternatives_1_0"
    // InternalBrowserTest.g:391:1: rule__Task__NameAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Task__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:395:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserTest.g:396:2: ( RULE_ID )
                    {
                    // InternalBrowserTest.g:396:2: ( RULE_ID )
                    // InternalBrowserTest.g:397:3: RULE_ID
                    {
                     before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:402:2: ( RULE_STRING )
                    {
                    // InternalBrowserTest.g:402:2: ( RULE_STRING )
                    // InternalBrowserTest.g:403:3: RULE_STRING
                    {
                     before(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Task__NameAlternatives_1_0"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalBrowserTest.g:412:1: rule__Action__Alternatives : ( ( ruleGoTo ) | ( ruleSelect ) | ( ruleActionCommand ) | ( ruleTest ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:416:1: ( ( ruleGoTo ) | ( ruleSelect ) | ( ruleActionCommand ) | ( ruleTest ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBrowserTest.g:417:2: ( ruleGoTo )
                    {
                    // InternalBrowserTest.g:417:2: ( ruleGoTo )
                    // InternalBrowserTest.g:418:3: ruleGoTo
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
                    // InternalBrowserTest.g:423:2: ( ruleSelect )
                    {
                    // InternalBrowserTest.g:423:2: ( ruleSelect )
                    // InternalBrowserTest.g:424:3: ruleSelect
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
                    // InternalBrowserTest.g:429:2: ( ruleActionCommand )
                    {
                    // InternalBrowserTest.g:429:2: ( ruleActionCommand )
                    // InternalBrowserTest.g:430:3: ruleActionCommand
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
                    // InternalBrowserTest.g:435:2: ( ruleTest )
                    {
                    // InternalBrowserTest.g:435:2: ( ruleTest )
                    // InternalBrowserTest.g:436:3: ruleTest
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


    // $ANTLR start "rule__Entree__Alternatives"
    // InternalBrowserTest.g:445:1: rule__Entree__Alternatives : ( ( ( rule__Entree__Group_0__0 ) ) | ( ( rule__Entree__StringAssignment_1 ) ) | ( ( rule__Entree__Group_2__0 ) ) );
    public final void rule__Entree__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:449:1: ( ( ( rule__Entree__Group_0__0 ) ) | ( ( rule__Entree__StringAssignment_1 ) ) | ( ( rule__Entree__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==11) ) {
                    alt4=3;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserTest.g:450:2: ( ( rule__Entree__Group_0__0 ) )
                    {
                    // InternalBrowserTest.g:450:2: ( ( rule__Entree__Group_0__0 ) )
                    // InternalBrowserTest.g:451:3: ( rule__Entree__Group_0__0 )
                    {
                     before(grammarAccess.getEntreeAccess().getGroup_0()); 
                    // InternalBrowserTest.g:452:3: ( rule__Entree__Group_0__0 )
                    // InternalBrowserTest.g:452:4: rule__Entree__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entree__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntreeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:456:2: ( ( rule__Entree__StringAssignment_1 ) )
                    {
                    // InternalBrowserTest.g:456:2: ( ( rule__Entree__StringAssignment_1 ) )
                    // InternalBrowserTest.g:457:3: ( rule__Entree__StringAssignment_1 )
                    {
                     before(grammarAccess.getEntreeAccess().getStringAssignment_1()); 
                    // InternalBrowserTest.g:458:3: ( rule__Entree__StringAssignment_1 )
                    // InternalBrowserTest.g:458:4: rule__Entree__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entree__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntreeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:462:2: ( ( rule__Entree__Group_2__0 ) )
                    {
                    // InternalBrowserTest.g:462:2: ( ( rule__Entree__Group_2__0 ) )
                    // InternalBrowserTest.g:463:3: ( rule__Entree__Group_2__0 )
                    {
                     before(grammarAccess.getEntreeAccess().getGroup_2()); 
                    // InternalBrowserTest.g:464:3: ( rule__Entree__Group_2__0 )
                    // InternalBrowserTest.g:464:4: rule__Entree__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entree__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntreeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entree__Alternatives"


    // $ANTLR start "rule__Entree__Alternatives_0_2"
    // InternalBrowserTest.g:472:1: rule__Entree__Alternatives_0_2 : ( ( ( rule__Entree__ParamAssignment_0_2_0 ) ) | ( ( rule__Entree__UntypedAssignment_0_2_1 ) ) );
    public final void rule__Entree__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:476:1: ( ( ( rule__Entree__ParamAssignment_0_2_0 ) ) | ( ( rule__Entree__UntypedAssignment_0_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13||(LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserTest.g:477:2: ( ( rule__Entree__ParamAssignment_0_2_0 ) )
                    {
                    // InternalBrowserTest.g:477:2: ( ( rule__Entree__ParamAssignment_0_2_0 ) )
                    // InternalBrowserTest.g:478:3: ( rule__Entree__ParamAssignment_0_2_0 )
                    {
                     before(grammarAccess.getEntreeAccess().getParamAssignment_0_2_0()); 
                    // InternalBrowserTest.g:479:3: ( rule__Entree__ParamAssignment_0_2_0 )
                    // InternalBrowserTest.g:479:4: rule__Entree__ParamAssignment_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entree__ParamAssignment_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntreeAccess().getParamAssignment_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:483:2: ( ( rule__Entree__UntypedAssignment_0_2_1 ) )
                    {
                    // InternalBrowserTest.g:483:2: ( ( rule__Entree__UntypedAssignment_0_2_1 ) )
                    // InternalBrowserTest.g:484:3: ( rule__Entree__UntypedAssignment_0_2_1 )
                    {
                     before(grammarAccess.getEntreeAccess().getUntypedAssignment_0_2_1()); 
                    // InternalBrowserTest.g:485:3: ( rule__Entree__UntypedAssignment_0_2_1 )
                    // InternalBrowserTest.g:485:4: rule__Entree__UntypedAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entree__UntypedAssignment_0_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntreeAccess().getUntypedAssignment_0_2_1()); 

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
    // $ANTLR end "rule__Entree__Alternatives_0_2"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalBrowserTest.g:493:1: rule__Property__Alternatives : ( ( ( rule__Property__Group_0__0 ) ) | ( ( rule__Property__Group_1__0 ) ) | ( ( rule__Property__Group_2__0 ) ) | ( ( rule__Property__Group_3__0 ) ) | ( ( rule__Property__Group_4__0 ) ) | ( ( rule__Property__Group_5__0 ) ) | ( ( rule__Property__Group_6__0 ) ) | ( ( rule__Property__Group_7__0 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:497:1: ( ( ( rule__Property__Group_0__0 ) ) | ( ( rule__Property__Group_1__0 ) ) | ( ( rule__Property__Group_2__0 ) ) | ( ( rule__Property__Group_3__0 ) ) | ( ( rule__Property__Group_4__0 ) ) | ( ( rule__Property__Group_5__0 ) ) | ( ( rule__Property__Group_6__0 ) ) | ( ( rule__Property__Group_7__0 ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 34:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBrowserTest.g:498:2: ( ( rule__Property__Group_0__0 ) )
                    {
                    // InternalBrowserTest.g:498:2: ( ( rule__Property__Group_0__0 ) )
                    // InternalBrowserTest.g:499:3: ( rule__Property__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_0()); 
                    // InternalBrowserTest.g:500:3: ( rule__Property__Group_0__0 )
                    // InternalBrowserTest.g:500:4: rule__Property__Group_0__0
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
                    // InternalBrowserTest.g:504:2: ( ( rule__Property__Group_1__0 ) )
                    {
                    // InternalBrowserTest.g:504:2: ( ( rule__Property__Group_1__0 ) )
                    // InternalBrowserTest.g:505:3: ( rule__Property__Group_1__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_1()); 
                    // InternalBrowserTest.g:506:3: ( rule__Property__Group_1__0 )
                    // InternalBrowserTest.g:506:4: rule__Property__Group_1__0
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
                    // InternalBrowserTest.g:510:2: ( ( rule__Property__Group_2__0 ) )
                    {
                    // InternalBrowserTest.g:510:2: ( ( rule__Property__Group_2__0 ) )
                    // InternalBrowserTest.g:511:3: ( rule__Property__Group_2__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_2()); 
                    // InternalBrowserTest.g:512:3: ( rule__Property__Group_2__0 )
                    // InternalBrowserTest.g:512:4: rule__Property__Group_2__0
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
                    // InternalBrowserTest.g:516:2: ( ( rule__Property__Group_3__0 ) )
                    {
                    // InternalBrowserTest.g:516:2: ( ( rule__Property__Group_3__0 ) )
                    // InternalBrowserTest.g:517:3: ( rule__Property__Group_3__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_3()); 
                    // InternalBrowserTest.g:518:3: ( rule__Property__Group_3__0 )
                    // InternalBrowserTest.g:518:4: rule__Property__Group_3__0
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
                    // InternalBrowserTest.g:522:2: ( ( rule__Property__Group_4__0 ) )
                    {
                    // InternalBrowserTest.g:522:2: ( ( rule__Property__Group_4__0 ) )
                    // InternalBrowserTest.g:523:3: ( rule__Property__Group_4__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_4()); 
                    // InternalBrowserTest.g:524:3: ( rule__Property__Group_4__0 )
                    // InternalBrowserTest.g:524:4: rule__Property__Group_4__0
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
                    // InternalBrowserTest.g:528:2: ( ( rule__Property__Group_5__0 ) )
                    {
                    // InternalBrowserTest.g:528:2: ( ( rule__Property__Group_5__0 ) )
                    // InternalBrowserTest.g:529:3: ( rule__Property__Group_5__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_5()); 
                    // InternalBrowserTest.g:530:3: ( rule__Property__Group_5__0 )
                    // InternalBrowserTest.g:530:4: rule__Property__Group_5__0
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
                    // InternalBrowserTest.g:534:2: ( ( rule__Property__Group_6__0 ) )
                    {
                    // InternalBrowserTest.g:534:2: ( ( rule__Property__Group_6__0 ) )
                    // InternalBrowserTest.g:535:3: ( rule__Property__Group_6__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_6()); 
                    // InternalBrowserTest.g:536:3: ( rule__Property__Group_6__0 )
                    // InternalBrowserTest.g:536:4: rule__Property__Group_6__0
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
                    // InternalBrowserTest.g:540:2: ( ( rule__Property__Group_7__0 ) )
                    {
                    // InternalBrowserTest.g:540:2: ( ( rule__Property__Group_7__0 ) )
                    // InternalBrowserTest.g:541:3: ( rule__Property__Group_7__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_7()); 
                    // InternalBrowserTest.g:542:3: ( rule__Property__Group_7__0 )
                    // InternalBrowserTest.g:542:4: rule__Property__Group_7__0
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
    // InternalBrowserTest.g:550:1: rule__ActionType__Alternatives : ( ( '[CLICK]' ) | ( ( rule__ActionType__Group_1__0 ) ) | ( ( rule__ActionType__Group_2__0 ) ) | ( ( rule__ActionType__Group_3__0 ) ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:554:1: ( ( '[CLICK]' ) | ( ( rule__ActionType__Group_1__0 ) ) | ( ( rule__ActionType__Group_2__0 ) ) | ( ( rule__ActionType__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserTest.g:555:2: ( '[CLICK]' )
                    {
                    // InternalBrowserTest.g:555:2: ( '[CLICK]' )
                    // InternalBrowserTest.g:556:3: '[CLICK]'
                    {
                     before(grammarAccess.getActionTypeAccess().getCLICKKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getCLICKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:561:2: ( ( rule__ActionType__Group_1__0 ) )
                    {
                    // InternalBrowserTest.g:561:2: ( ( rule__ActionType__Group_1__0 ) )
                    // InternalBrowserTest.g:562:3: ( rule__ActionType__Group_1__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_1()); 
                    // InternalBrowserTest.g:563:3: ( rule__ActionType__Group_1__0 )
                    // InternalBrowserTest.g:563:4: rule__ActionType__Group_1__0
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
                    // InternalBrowserTest.g:567:2: ( ( rule__ActionType__Group_2__0 ) )
                    {
                    // InternalBrowserTest.g:567:2: ( ( rule__ActionType__Group_2__0 ) )
                    // InternalBrowserTest.g:568:3: ( rule__ActionType__Group_2__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_2()); 
                    // InternalBrowserTest.g:569:3: ( rule__ActionType__Group_2__0 )
                    // InternalBrowserTest.g:569:4: rule__ActionType__Group_2__0
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
                    // InternalBrowserTest.g:573:2: ( ( rule__ActionType__Group_3__0 ) )
                    {
                    // InternalBrowserTest.g:573:2: ( ( rule__ActionType__Group_3__0 ) )
                    // InternalBrowserTest.g:574:3: ( rule__ActionType__Group_3__0 )
                    {
                     before(grammarAccess.getActionTypeAccess().getGroup_3()); 
                    // InternalBrowserTest.g:575:3: ( rule__ActionType__Group_3__0 )
                    // InternalBrowserTest.g:575:4: rule__ActionType__Group_3__0
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
    // InternalBrowserTest.g:583:1: rule__Type__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'INPUT' ) ) | ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'DIV' ) ) | ( ( 'TITLE' ) ) | ( ( 'CONTENT' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:587:1: ( ( ( 'LINK' ) ) | ( ( 'INPUT' ) ) | ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'DIV' ) ) | ( ( 'TITLE' ) ) | ( ( 'CONTENT' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserTest.g:588:2: ( ( 'LINK' ) )
                    {
                    // InternalBrowserTest.g:588:2: ( ( 'LINK' ) )
                    // InternalBrowserTest.g:589:3: ( 'LINK' )
                    {
                     before(grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalBrowserTest.g:590:3: ( 'LINK' )
                    // InternalBrowserTest.g:590:4: 'LINK'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:594:2: ( ( 'INPUT' ) )
                    {
                    // InternalBrowserTest.g:594:2: ( ( 'INPUT' ) )
                    // InternalBrowserTest.g:595:3: ( 'INPUT' )
                    {
                     before(grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1()); 
                    // InternalBrowserTest.g:596:3: ( 'INPUT' )
                    // InternalBrowserTest.g:596:4: 'INPUT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:600:2: ( ( 'TEXT' ) )
                    {
                    // InternalBrowserTest.g:600:2: ( ( 'TEXT' ) )
                    // InternalBrowserTest.g:601:3: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2()); 
                    // InternalBrowserTest.g:602:3: ( 'TEXT' )
                    // InternalBrowserTest.g:602:4: 'TEXT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:606:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalBrowserTest.g:606:2: ( ( 'CHECKBOX' ) )
                    // InternalBrowserTest.g:607:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3()); 
                    // InternalBrowserTest.g:608:3: ( 'CHECKBOX' )
                    // InternalBrowserTest.g:608:4: 'CHECKBOX'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:612:2: ( ( 'DIV' ) )
                    {
                    // InternalBrowserTest.g:612:2: ( ( 'DIV' ) )
                    // InternalBrowserTest.g:613:3: ( 'DIV' )
                    {
                     before(grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4()); 
                    // InternalBrowserTest.g:614:3: ( 'DIV' )
                    // InternalBrowserTest.g:614:4: 'DIV'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:618:2: ( ( 'TITLE' ) )
                    {
                    // InternalBrowserTest.g:618:2: ( ( 'TITLE' ) )
                    // InternalBrowserTest.g:619:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5()); 
                    // InternalBrowserTest.g:620:3: ( 'TITLE' )
                    // InternalBrowserTest.g:620:4: 'TITLE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserTest.g:624:2: ( ( 'CONTENT' ) )
                    {
                    // InternalBrowserTest.g:624:2: ( ( 'CONTENT' ) )
                    // InternalBrowserTest.g:625:3: ( 'CONTENT' )
                    {
                     before(grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6()); 
                    // InternalBrowserTest.g:626:3: ( 'CONTENT' )
                    // InternalBrowserTest.g:626:4: 'CONTENT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6()); 

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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalBrowserTest.g:634:1: rule__Boolean__Alternatives : ( ( ( 'FALSE' ) ) | ( ( 'TRUE' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:638:1: ( ( ( 'FALSE' ) ) | ( ( 'TRUE' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBrowserTest.g:639:2: ( ( 'FALSE' ) )
                    {
                    // InternalBrowserTest.g:639:2: ( ( 'FALSE' ) )
                    // InternalBrowserTest.g:640:3: ( 'FALSE' )
                    {
                     before(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalBrowserTest.g:641:3: ( 'FALSE' )
                    // InternalBrowserTest.g:641:4: 'FALSE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:645:2: ( ( 'TRUE' ) )
                    {
                    // InternalBrowserTest.g:645:2: ( ( 'TRUE' ) )
                    // InternalBrowserTest.g:646:3: ( 'TRUE' )
                    {
                     before(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1()); 
                    // InternalBrowserTest.g:647:3: ( 'TRUE' )
                    // InternalBrowserTest.g:647:4: 'TRUE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalBrowserTest.g:655:1: rule__Attribute__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'TITLE' ) ) | ( ( 'CONTENT' ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:659:1: ( ( ( 'LINK' ) ) | ( ( 'TITLE' ) ) | ( ( 'CONTENT' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBrowserTest.g:660:2: ( ( 'LINK' ) )
                    {
                    // InternalBrowserTest.g:660:2: ( ( 'LINK' ) )
                    // InternalBrowserTest.g:661:3: ( 'LINK' )
                    {
                     before(grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalBrowserTest.g:662:3: ( 'LINK' )
                    // InternalBrowserTest.g:662:4: 'LINK'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:666:2: ( ( 'TITLE' ) )
                    {
                    // InternalBrowserTest.g:666:2: ( ( 'TITLE' ) )
                    // InternalBrowserTest.g:667:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1()); 
                    // InternalBrowserTest.g:668:3: ( 'TITLE' )
                    // InternalBrowserTest.g:668:4: 'TITLE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:672:2: ( ( 'CONTENT' ) )
                    {
                    // InternalBrowserTest.g:672:2: ( ( 'CONTENT' ) )
                    // InternalBrowserTest.g:673:3: ( 'CONTENT' )
                    {
                     before(grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2()); 
                    // InternalBrowserTest.g:674:3: ( 'CONTENT' )
                    // InternalBrowserTest.g:674:4: 'CONTENT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalBrowserTest.g:682:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:686:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBrowserTest.g:687:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalBrowserTest.g:694:1: rule__Task__Group__0__Impl : ( '[TASK]' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:698:1: ( ( '[TASK]' ) )
            // InternalBrowserTest.g:699:1: ( '[TASK]' )
            {
            // InternalBrowserTest.g:699:1: ( '[TASK]' )
            // InternalBrowserTest.g:700:2: '[TASK]'
            {
             before(grammarAccess.getTaskAccess().getTASKKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBrowserTest.g:709:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:713:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBrowserTest.g:714:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalBrowserTest.g:721:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:725:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBrowserTest.g:726:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBrowserTest.g:726:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBrowserTest.g:727:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBrowserTest.g:728:2: ( rule__Task__NameAssignment_1 )
            // InternalBrowserTest.g:728:3: rule__Task__NameAssignment_1
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
    // InternalBrowserTest.g:736:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:740:1: ( rule__Task__Group__2__Impl )
            // InternalBrowserTest.g:741:2: rule__Task__Group__2__Impl
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
    // InternalBrowserTest.g:747:1: rule__Task__Group__2__Impl : ( ( rule__Task__ActionsAssignment_2 )* ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:751:1: ( ( ( rule__Task__ActionsAssignment_2 )* ) )
            // InternalBrowserTest.g:752:1: ( ( rule__Task__ActionsAssignment_2 )* )
            {
            // InternalBrowserTest.g:752:1: ( ( rule__Task__ActionsAssignment_2 )* )
            // InternalBrowserTest.g:753:2: ( rule__Task__ActionsAssignment_2 )*
            {
             before(grammarAccess.getTaskAccess().getActionsAssignment_2()); 
            // InternalBrowserTest.g:754:2: ( rule__Task__ActionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)||LA11_0==37||LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBrowserTest.g:754:3: rule__Task__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Task__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBrowserTest.g:763:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:767:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalBrowserTest.g:768:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
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
    // InternalBrowserTest.g:775:1: rule__GoTo__Group__0__Impl : ( '[GOTO]' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:779:1: ( ( '[GOTO]' ) )
            // InternalBrowserTest.g:780:1: ( '[GOTO]' )
            {
            // InternalBrowserTest.g:780:1: ( '[GOTO]' )
            // InternalBrowserTest.g:781:2: '[GOTO]'
            {
             before(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBrowserTest.g:790:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:794:1: ( rule__GoTo__Group__1__Impl )
            // InternalBrowserTest.g:795:2: rule__GoTo__Group__1__Impl
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
    // InternalBrowserTest.g:801:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__UrlAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:805:1: ( ( ( rule__GoTo__UrlAssignment_1 ) ) )
            // InternalBrowserTest.g:806:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            {
            // InternalBrowserTest.g:806:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            // InternalBrowserTest.g:807:2: ( rule__GoTo__UrlAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_1()); 
            // InternalBrowserTest.g:808:2: ( rule__GoTo__UrlAssignment_1 )
            // InternalBrowserTest.g:808:3: rule__GoTo__UrlAssignment_1
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
    // InternalBrowserTest.g:817:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:821:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalBrowserTest.g:822:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalBrowserTest.g:829:1: rule__Select__Group__0__Impl : ( '[SELECT]' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:833:1: ( ( '[SELECT]' ) )
            // InternalBrowserTest.g:834:1: ( '[SELECT]' )
            {
            // InternalBrowserTest.g:834:1: ( '[SELECT]' )
            // InternalBrowserTest.g:835:2: '[SELECT]'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBrowserTest.g:844:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:848:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalBrowserTest.g:849:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserTest.g:856:1: rule__Select__Group__1__Impl : ( ( rule__Select__VarAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:860:1: ( ( ( rule__Select__VarAssignment_1 ) ) )
            // InternalBrowserTest.g:861:1: ( ( rule__Select__VarAssignment_1 ) )
            {
            // InternalBrowserTest.g:861:1: ( ( rule__Select__VarAssignment_1 ) )
            // InternalBrowserTest.g:862:2: ( rule__Select__VarAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getVarAssignment_1()); 
            // InternalBrowserTest.g:863:2: ( rule__Select__VarAssignment_1 )
            // InternalBrowserTest.g:863:3: rule__Select__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getVarAssignment_1()); 

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
    // InternalBrowserTest.g:871:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:875:1: ( rule__Select__Group__2__Impl )
            // InternalBrowserTest.g:876:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

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
    // InternalBrowserTest.g:882:1: rule__Select__Group__2__Impl : ( ( rule__Select__PropertiesAssignment_2 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:886:1: ( ( ( rule__Select__PropertiesAssignment_2 )* ) )
            // InternalBrowserTest.g:887:1: ( ( rule__Select__PropertiesAssignment_2 )* )
            {
            // InternalBrowserTest.g:887:1: ( ( rule__Select__PropertiesAssignment_2 )* )
            // InternalBrowserTest.g:888:2: ( rule__Select__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getSelectAccess().getPropertiesAssignment_2()); 
            // InternalBrowserTest.g:889:2: ( rule__Select__PropertiesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBrowserTest.g:889:3: rule__Select__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getPropertiesAssignment_2()); 

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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBrowserTest.g:898:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:902:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBrowserTest.g:903:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalBrowserTest.g:910:1: rule__Variable__Group__0__Impl : ( '$' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:914:1: ( ( '$' ) )
            // InternalBrowserTest.g:915:1: ( '$' )
            {
            // InternalBrowserTest.g:915:1: ( '$' )
            // InternalBrowserTest.g:916:2: '$'
            {
             before(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalBrowserTest.g:925:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:929:1: ( rule__Variable__Group__1__Impl )
            // InternalBrowserTest.g:930:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalBrowserTest.g:936:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:940:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalBrowserTest.g:941:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalBrowserTest.g:941:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalBrowserTest.g:942:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalBrowserTest.g:943:2: ( rule__Variable__NameAssignment_1 )
            // InternalBrowserTest.g:943:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Entree__Group_0__0"
    // InternalBrowserTest.g:952:1: rule__Entree__Group_0__0 : rule__Entree__Group_0__0__Impl rule__Entree__Group_0__1 ;
    public final void rule__Entree__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:956:1: ( rule__Entree__Group_0__0__Impl rule__Entree__Group_0__1 )
            // InternalBrowserTest.g:957:2: rule__Entree__Group_0__0__Impl rule__Entree__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Entree__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group_0__1();

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
    // $ANTLR end "rule__Entree__Group_0__0"


    // $ANTLR start "rule__Entree__Group_0__0__Impl"
    // InternalBrowserTest.g:964:1: rule__Entree__Group_0__0__Impl : ( ( rule__Entree__VarAssignment_0_0 ) ) ;
    public final void rule__Entree__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:968:1: ( ( ( rule__Entree__VarAssignment_0_0 ) ) )
            // InternalBrowserTest.g:969:1: ( ( rule__Entree__VarAssignment_0_0 ) )
            {
            // InternalBrowserTest.g:969:1: ( ( rule__Entree__VarAssignment_0_0 ) )
            // InternalBrowserTest.g:970:2: ( rule__Entree__VarAssignment_0_0 )
            {
             before(grammarAccess.getEntreeAccess().getVarAssignment_0_0()); 
            // InternalBrowserTest.g:971:2: ( rule__Entree__VarAssignment_0_0 )
            // InternalBrowserTest.g:971:3: rule__Entree__VarAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Entree__VarAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getVarAssignment_0_0()); 

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
    // $ANTLR end "rule__Entree__Group_0__0__Impl"


    // $ANTLR start "rule__Entree__Group_0__1"
    // InternalBrowserTest.g:979:1: rule__Entree__Group_0__1 : rule__Entree__Group_0__1__Impl rule__Entree__Group_0__2 ;
    public final void rule__Entree__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:983:1: ( rule__Entree__Group_0__1__Impl rule__Entree__Group_0__2 )
            // InternalBrowserTest.g:984:2: rule__Entree__Group_0__1__Impl rule__Entree__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Entree__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group_0__2();

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
    // $ANTLR end "rule__Entree__Group_0__1"


    // $ANTLR start "rule__Entree__Group_0__1__Impl"
    // InternalBrowserTest.g:991:1: rule__Entree__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Entree__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:995:1: ( ( '.' ) )
            // InternalBrowserTest.g:996:1: ( '.' )
            {
            // InternalBrowserTest.g:996:1: ( '.' )
            // InternalBrowserTest.g:997:2: '.'
            {
             before(grammarAccess.getEntreeAccess().getFullStopKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Entree__Group_0__1__Impl"


    // $ANTLR start "rule__Entree__Group_0__2"
    // InternalBrowserTest.g:1006:1: rule__Entree__Group_0__2 : rule__Entree__Group_0__2__Impl ;
    public final void rule__Entree__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1010:1: ( rule__Entree__Group_0__2__Impl )
            // InternalBrowserTest.g:1011:2: rule__Entree__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Group_0__2__Impl();

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
    // $ANTLR end "rule__Entree__Group_0__2"


    // $ANTLR start "rule__Entree__Group_0__2__Impl"
    // InternalBrowserTest.g:1017:1: rule__Entree__Group_0__2__Impl : ( ( rule__Entree__Alternatives_0_2 ) ) ;
    public final void rule__Entree__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1021:1: ( ( ( rule__Entree__Alternatives_0_2 ) ) )
            // InternalBrowserTest.g:1022:1: ( ( rule__Entree__Alternatives_0_2 ) )
            {
            // InternalBrowserTest.g:1022:1: ( ( rule__Entree__Alternatives_0_2 ) )
            // InternalBrowserTest.g:1023:2: ( rule__Entree__Alternatives_0_2 )
            {
             before(grammarAccess.getEntreeAccess().getAlternatives_0_2()); 
            // InternalBrowserTest.g:1024:2: ( rule__Entree__Alternatives_0_2 )
            // InternalBrowserTest.g:1024:3: rule__Entree__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getAlternatives_0_2()); 

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
    // $ANTLR end "rule__Entree__Group_0__2__Impl"


    // $ANTLR start "rule__Entree__Group_2__0"
    // InternalBrowserTest.g:1033:1: rule__Entree__Group_2__0 : rule__Entree__Group_2__0__Impl rule__Entree__Group_2__1 ;
    public final void rule__Entree__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1037:1: ( rule__Entree__Group_2__0__Impl rule__Entree__Group_2__1 )
            // InternalBrowserTest.g:1038:2: rule__Entree__Group_2__0__Impl rule__Entree__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Entree__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group_2__1();

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
    // $ANTLR end "rule__Entree__Group_2__0"


    // $ANTLR start "rule__Entree__Group_2__0__Impl"
    // InternalBrowserTest.g:1045:1: rule__Entree__Group_2__0__Impl : ( '$' ) ;
    public final void rule__Entree__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1049:1: ( ( '$' ) )
            // InternalBrowserTest.g:1050:1: ( '$' )
            {
            // InternalBrowserTest.g:1050:1: ( '$' )
            // InternalBrowserTest.g:1051:2: '$'
            {
             before(grammarAccess.getEntreeAccess().getDollarSignKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getDollarSignKeyword_2_0()); 

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
    // $ANTLR end "rule__Entree__Group_2__0__Impl"


    // $ANTLR start "rule__Entree__Group_2__1"
    // InternalBrowserTest.g:1060:1: rule__Entree__Group_2__1 : rule__Entree__Group_2__1__Impl ;
    public final void rule__Entree__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1064:1: ( rule__Entree__Group_2__1__Impl )
            // InternalBrowserTest.g:1065:2: rule__Entree__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entree__Group_2__1"


    // $ANTLR start "rule__Entree__Group_2__1__Impl"
    // InternalBrowserTest.g:1071:1: rule__Entree__Group_2__1__Impl : ( ( rule__Entree__AccessorAssignment_2_1 ) ) ;
    public final void rule__Entree__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1075:1: ( ( ( rule__Entree__AccessorAssignment_2_1 ) ) )
            // InternalBrowserTest.g:1076:1: ( ( rule__Entree__AccessorAssignment_2_1 ) )
            {
            // InternalBrowserTest.g:1076:1: ( ( rule__Entree__AccessorAssignment_2_1 ) )
            // InternalBrowserTest.g:1077:2: ( rule__Entree__AccessorAssignment_2_1 )
            {
             before(grammarAccess.getEntreeAccess().getAccessorAssignment_2_1()); 
            // InternalBrowserTest.g:1078:2: ( rule__Entree__AccessorAssignment_2_1 )
            // InternalBrowserTest.g:1078:3: rule__Entree__AccessorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entree__AccessorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getAccessorAssignment_2_1()); 

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
    // $ANTLR end "rule__Entree__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group_0__0"
    // InternalBrowserTest.g:1087:1: rule__Property__Group_0__0 : rule__Property__Group_0__0__Impl rule__Property__Group_0__1 ;
    public final void rule__Property__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1091:1: ( rule__Property__Group_0__0__Impl rule__Property__Group_0__1 )
            // InternalBrowserTest.g:1092:2: rule__Property__Group_0__0__Impl rule__Property__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1099:1: rule__Property__Group_0__0__Impl : ( '[CONTENT]' ) ;
    public final void rule__Property__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1103:1: ( ( '[CONTENT]' ) )
            // InternalBrowserTest.g:1104:1: ( '[CONTENT]' )
            {
            // InternalBrowserTest.g:1104:1: ( '[CONTENT]' )
            // InternalBrowserTest.g:1105:2: '[CONTENT]'
            {
             before(grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBrowserTest.g:1114:1: rule__Property__Group_0__1 : rule__Property__Group_0__1__Impl ;
    public final void rule__Property__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1118:1: ( rule__Property__Group_0__1__Impl )
            // InternalBrowserTest.g:1119:2: rule__Property__Group_0__1__Impl
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
    // InternalBrowserTest.g:1125:1: rule__Property__Group_0__1__Impl : ( ( rule__Property__ContentAssignment_0_1 ) ) ;
    public final void rule__Property__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1129:1: ( ( ( rule__Property__ContentAssignment_0_1 ) ) )
            // InternalBrowserTest.g:1130:1: ( ( rule__Property__ContentAssignment_0_1 ) )
            {
            // InternalBrowserTest.g:1130:1: ( ( rule__Property__ContentAssignment_0_1 ) )
            // InternalBrowserTest.g:1131:2: ( rule__Property__ContentAssignment_0_1 )
            {
             before(grammarAccess.getPropertyAccess().getContentAssignment_0_1()); 
            // InternalBrowserTest.g:1132:2: ( rule__Property__ContentAssignment_0_1 )
            // InternalBrowserTest.g:1132:3: rule__Property__ContentAssignment_0_1
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
    // InternalBrowserTest.g:1141:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1145:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // InternalBrowserTest.g:1146:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1153:1: rule__Property__Group_1__0__Impl : ( '[LABEL]' ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1157:1: ( ( '[LABEL]' ) )
            // InternalBrowserTest.g:1158:1: ( '[LABEL]' )
            {
            // InternalBrowserTest.g:1158:1: ( '[LABEL]' )
            // InternalBrowserTest.g:1159:2: '[LABEL]'
            {
             before(grammarAccess.getPropertyAccess().getLABELKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLABELKeyword_1_0()); 

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
    // InternalBrowserTest.g:1168:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1172:1: ( rule__Property__Group_1__1__Impl )
            // InternalBrowserTest.g:1173:2: rule__Property__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_1__1__Impl();

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
    // InternalBrowserTest.g:1179:1: rule__Property__Group_1__1__Impl : ( ( rule__Property__LabelAssignment_1_1 ) ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1183:1: ( ( ( rule__Property__LabelAssignment_1_1 ) ) )
            // InternalBrowserTest.g:1184:1: ( ( rule__Property__LabelAssignment_1_1 ) )
            {
            // InternalBrowserTest.g:1184:1: ( ( rule__Property__LabelAssignment_1_1 ) )
            // InternalBrowserTest.g:1185:2: ( rule__Property__LabelAssignment_1_1 )
            {
             before(grammarAccess.getPropertyAccess().getLabelAssignment_1_1()); 
            // InternalBrowserTest.g:1186:2: ( rule__Property__LabelAssignment_1_1 )
            // InternalBrowserTest.g:1186:3: rule__Property__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__LabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getLabelAssignment_1_1()); 

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


    // $ANTLR start "rule__Property__Group_2__0"
    // InternalBrowserTest.g:1195:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1199:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // InternalBrowserTest.g:1200:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1207:1: rule__Property__Group_2__0__Impl : ( '[VALUE]' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1211:1: ( ( '[VALUE]' ) )
            // InternalBrowserTest.g:1212:1: ( '[VALUE]' )
            {
            // InternalBrowserTest.g:1212:1: ( '[VALUE]' )
            // InternalBrowserTest.g:1213:2: '[VALUE]'
            {
             before(grammarAccess.getPropertyAccess().getVALUEKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getVALUEKeyword_2_0()); 

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
    // InternalBrowserTest.g:1222:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1226:1: ( rule__Property__Group_2__1__Impl )
            // InternalBrowserTest.g:1227:2: rule__Property__Group_2__1__Impl
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
    // InternalBrowserTest.g:1233:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__ValueAssignment_2_1 ) ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1237:1: ( ( ( rule__Property__ValueAssignment_2_1 ) ) )
            // InternalBrowserTest.g:1238:1: ( ( rule__Property__ValueAssignment_2_1 ) )
            {
            // InternalBrowserTest.g:1238:1: ( ( rule__Property__ValueAssignment_2_1 ) )
            // InternalBrowserTest.g:1239:2: ( rule__Property__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_2_1()); 
            // InternalBrowserTest.g:1240:2: ( rule__Property__ValueAssignment_2_1 )
            // InternalBrowserTest.g:1240:3: rule__Property__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_2_1()); 

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
    // InternalBrowserTest.g:1249:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1253:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // InternalBrowserTest.g:1254:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1261:1: rule__Property__Group_3__0__Impl : ( '[ALT]' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1265:1: ( ( '[ALT]' ) )
            // InternalBrowserTest.g:1266:1: ( '[ALT]' )
            {
            // InternalBrowserTest.g:1266:1: ( '[ALT]' )
            // InternalBrowserTest.g:1267:2: '[ALT]'
            {
             before(grammarAccess.getPropertyAccess().getALTKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getALTKeyword_3_0()); 

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
    // InternalBrowserTest.g:1276:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1280:1: ( rule__Property__Group_3__1__Impl )
            // InternalBrowserTest.g:1281:2: rule__Property__Group_3__1__Impl
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
    // InternalBrowserTest.g:1287:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__AltAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1291:1: ( ( ( rule__Property__AltAssignment_3_1 ) ) )
            // InternalBrowserTest.g:1292:1: ( ( rule__Property__AltAssignment_3_1 ) )
            {
            // InternalBrowserTest.g:1292:1: ( ( rule__Property__AltAssignment_3_1 ) )
            // InternalBrowserTest.g:1293:2: ( rule__Property__AltAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getAltAssignment_3_1()); 
            // InternalBrowserTest.g:1294:2: ( rule__Property__AltAssignment_3_1 )
            // InternalBrowserTest.g:1294:3: rule__Property__AltAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__AltAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAltAssignment_3_1()); 

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
    // InternalBrowserTest.g:1303:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1307:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalBrowserTest.g:1308:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserTest.g:1315:1: rule__Property__Group_4__0__Impl : ( '[TYPE]' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1319:1: ( ( '[TYPE]' ) )
            // InternalBrowserTest.g:1320:1: ( '[TYPE]' )
            {
            // InternalBrowserTest.g:1320:1: ( '[TYPE]' )
            // InternalBrowserTest.g:1321:2: '[TYPE]'
            {
             before(grammarAccess.getPropertyAccess().getTYPEKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTYPEKeyword_4_0()); 

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
    // InternalBrowserTest.g:1330:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl rule__Property__Group_4__2 ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1334:1: ( rule__Property__Group_4__1__Impl rule__Property__Group_4__2 )
            // InternalBrowserTest.g:1335:2: rule__Property__Group_4__1__Impl rule__Property__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Property__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4__2();

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
    // InternalBrowserTest.g:1342:1: rule__Property__Group_4__1__Impl : ( '$' ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1346:1: ( ( '$' ) )
            // InternalBrowserTest.g:1347:1: ( '$' )
            {
            // InternalBrowserTest.g:1347:1: ( '$' )
            // InternalBrowserTest.g:1348:2: '$'
            {
             before(grammarAccess.getPropertyAccess().getDollarSignKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getDollarSignKeyword_4_1()); 

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


    // $ANTLR start "rule__Property__Group_4__2"
    // InternalBrowserTest.g:1357:1: rule__Property__Group_4__2 : rule__Property__Group_4__2__Impl ;
    public final void rule__Property__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1361:1: ( rule__Property__Group_4__2__Impl )
            // InternalBrowserTest.g:1362:2: rule__Property__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__2__Impl();

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
    // $ANTLR end "rule__Property__Group_4__2"


    // $ANTLR start "rule__Property__Group_4__2__Impl"
    // InternalBrowserTest.g:1368:1: rule__Property__Group_4__2__Impl : ( ( rule__Property__TypeAssignment_4_2 ) ) ;
    public final void rule__Property__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1372:1: ( ( ( rule__Property__TypeAssignment_4_2 ) ) )
            // InternalBrowserTest.g:1373:1: ( ( rule__Property__TypeAssignment_4_2 ) )
            {
            // InternalBrowserTest.g:1373:1: ( ( rule__Property__TypeAssignment_4_2 ) )
            // InternalBrowserTest.g:1374:2: ( rule__Property__TypeAssignment_4_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_4_2()); 
            // InternalBrowserTest.g:1375:2: ( rule__Property__TypeAssignment_4_2 )
            // InternalBrowserTest.g:1375:3: rule__Property__TypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_4_2()); 

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
    // $ANTLR end "rule__Property__Group_4__2__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // InternalBrowserTest.g:1384:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1388:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // InternalBrowserTest.g:1389:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
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
    // InternalBrowserTest.g:1396:1: rule__Property__Group_5__0__Impl : ( '[NAME]' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1400:1: ( ( '[NAME]' ) )
            // InternalBrowserTest.g:1401:1: ( '[NAME]' )
            {
            // InternalBrowserTest.g:1401:1: ( '[NAME]' )
            // InternalBrowserTest.g:1402:2: '[NAME]'
            {
             before(grammarAccess.getPropertyAccess().getNAMEKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNAMEKeyword_5_0()); 

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
    // InternalBrowserTest.g:1411:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1415:1: ( rule__Property__Group_5__1__Impl )
            // InternalBrowserTest.g:1416:2: rule__Property__Group_5__1__Impl
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
    // InternalBrowserTest.g:1422:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__NameAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1426:1: ( ( ( rule__Property__NameAssignment_5_1 ) ) )
            // InternalBrowserTest.g:1427:1: ( ( rule__Property__NameAssignment_5_1 ) )
            {
            // InternalBrowserTest.g:1427:1: ( ( rule__Property__NameAssignment_5_1 ) )
            // InternalBrowserTest.g:1428:2: ( rule__Property__NameAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_5_1()); 
            // InternalBrowserTest.g:1429:2: ( rule__Property__NameAssignment_5_1 )
            // InternalBrowserTest.g:1429:3: rule__Property__NameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_5_1()); 

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
    // InternalBrowserTest.g:1438:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1442:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // InternalBrowserTest.g:1443:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserTest.g:1450:1: rule__Property__Group_6__0__Impl : ( '[NTH-CHILD]' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1454:1: ( ( '[NTH-CHILD]' ) )
            // InternalBrowserTest.g:1455:1: ( '[NTH-CHILD]' )
            {
            // InternalBrowserTest.g:1455:1: ( '[NTH-CHILD]' )
            // InternalBrowserTest.g:1456:2: '[NTH-CHILD]'
            {
             before(grammarAccess.getPropertyAccess().getNTHCHILDKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNTHCHILDKeyword_6_0()); 

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
    // InternalBrowserTest.g:1465:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1469:1: ( rule__Property__Group_6__1__Impl )
            // InternalBrowserTest.g:1470:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1__Impl();

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
    // InternalBrowserTest.g:1476:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__ChildAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1480:1: ( ( ( rule__Property__ChildAssignment_6_1 ) ) )
            // InternalBrowserTest.g:1481:1: ( ( rule__Property__ChildAssignment_6_1 ) )
            {
            // InternalBrowserTest.g:1481:1: ( ( rule__Property__ChildAssignment_6_1 ) )
            // InternalBrowserTest.g:1482:2: ( rule__Property__ChildAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getChildAssignment_6_1()); 
            // InternalBrowserTest.g:1483:2: ( rule__Property__ChildAssignment_6_1 )
            // InternalBrowserTest.g:1483:3: rule__Property__ChildAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ChildAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getChildAssignment_6_1()); 

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


    // $ANTLR start "rule__Property__Group_7__0"
    // InternalBrowserTest.g:1492:1: rule__Property__Group_7__0 : rule__Property__Group_7__0__Impl rule__Property__Group_7__1 ;
    public final void rule__Property__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1496:1: ( rule__Property__Group_7__0__Impl rule__Property__Group_7__1 )
            // InternalBrowserTest.g:1497:2: rule__Property__Group_7__0__Impl rule__Property__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserTest.g:1504:1: rule__Property__Group_7__0__Impl : ( () ) ;
    public final void rule__Property__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1508:1: ( ( () ) )
            // InternalBrowserTest.g:1509:1: ( () )
            {
            // InternalBrowserTest.g:1509:1: ( () )
            // InternalBrowserTest.g:1510:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_7_0()); 
            // InternalBrowserTest.g:1511:2: ()
            // InternalBrowserTest.g:1511:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__0__Impl"


    // $ANTLR start "rule__Property__Group_7__1"
    // InternalBrowserTest.g:1519:1: rule__Property__Group_7__1 : rule__Property__Group_7__1__Impl rule__Property__Group_7__2 ;
    public final void rule__Property__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1523:1: ( rule__Property__Group_7__1__Impl rule__Property__Group_7__2 )
            // InternalBrowserTest.g:1524:2: rule__Property__Group_7__1__Impl rule__Property__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__2();

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
    // InternalBrowserTest.g:1531:1: rule__Property__Group_7__1__Impl : ( '[PARENT]' ) ;
    public final void rule__Property__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1535:1: ( ( '[PARENT]' ) )
            // InternalBrowserTest.g:1536:1: ( '[PARENT]' )
            {
            // InternalBrowserTest.g:1536:1: ( '[PARENT]' )
            // InternalBrowserTest.g:1537:2: '[PARENT]'
            {
             before(grammarAccess.getPropertyAccess().getPARENTKeyword_7_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPARENTKeyword_7_1()); 

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


    // $ANTLR start "rule__Property__Group_7__2"
    // InternalBrowserTest.g:1546:1: rule__Property__Group_7__2 : rule__Property__Group_7__2__Impl rule__Property__Group_7__3 ;
    public final void rule__Property__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1550:1: ( rule__Property__Group_7__2__Impl rule__Property__Group_7__3 )
            // InternalBrowserTest.g:1551:2: rule__Property__Group_7__2__Impl rule__Property__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__Property__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__3();

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
    // $ANTLR end "rule__Property__Group_7__2"


    // $ANTLR start "rule__Property__Group_7__2__Impl"
    // InternalBrowserTest.g:1558:1: rule__Property__Group_7__2__Impl : ( '{' ) ;
    public final void rule__Property__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1562:1: ( ( '{' ) )
            // InternalBrowserTest.g:1563:1: ( '{' )
            {
            // InternalBrowserTest.g:1563:1: ( '{' )
            // InternalBrowserTest.g:1564:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_7_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_7_2()); 

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
    // $ANTLR end "rule__Property__Group_7__2__Impl"


    // $ANTLR start "rule__Property__Group_7__3"
    // InternalBrowserTest.g:1573:1: rule__Property__Group_7__3 : rule__Property__Group_7__3__Impl rule__Property__Group_7__4 ;
    public final void rule__Property__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1577:1: ( rule__Property__Group_7__3__Impl rule__Property__Group_7__4 )
            // InternalBrowserTest.g:1578:2: rule__Property__Group_7__3__Impl rule__Property__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__Property__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__4();

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
    // $ANTLR end "rule__Property__Group_7__3"


    // $ANTLR start "rule__Property__Group_7__3__Impl"
    // InternalBrowserTest.g:1585:1: rule__Property__Group_7__3__Impl : ( ( rule__Property__SubPropertiesAssignment_7_3 )* ) ;
    public final void rule__Property__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1589:1: ( ( ( rule__Property__SubPropertiesAssignment_7_3 )* ) )
            // InternalBrowserTest.g:1590:1: ( ( rule__Property__SubPropertiesAssignment_7_3 )* )
            {
            // InternalBrowserTest.g:1590:1: ( ( rule__Property__SubPropertiesAssignment_7_3 )* )
            // InternalBrowserTest.g:1591:2: ( rule__Property__SubPropertiesAssignment_7_3 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_7_3()); 
            // InternalBrowserTest.g:1592:2: ( rule__Property__SubPropertiesAssignment_7_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBrowserTest.g:1592:3: rule__Property__SubPropertiesAssignment_7_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Property__SubPropertiesAssignment_7_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_7_3()); 

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
    // $ANTLR end "rule__Property__Group_7__3__Impl"


    // $ANTLR start "rule__Property__Group_7__4"
    // InternalBrowserTest.g:1600:1: rule__Property__Group_7__4 : rule__Property__Group_7__4__Impl ;
    public final void rule__Property__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1604:1: ( rule__Property__Group_7__4__Impl )
            // InternalBrowserTest.g:1605:2: rule__Property__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_7__4__Impl();

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
    // $ANTLR end "rule__Property__Group_7__4"


    // $ANTLR start "rule__Property__Group_7__4__Impl"
    // InternalBrowserTest.g:1611:1: rule__Property__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Property__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1615:1: ( ( '}' ) )
            // InternalBrowserTest.g:1616:1: ( '}' )
            {
            // InternalBrowserTest.g:1616:1: ( '}' )
            // InternalBrowserTest.g:1617:2: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Property__Group_7__4__Impl"


    // $ANTLR start "rule__ActionCommand__Group__0"
    // InternalBrowserTest.g:1627:1: rule__ActionCommand__Group__0 : rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 ;
    public final void rule__ActionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1631:1: ( rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 )
            // InternalBrowserTest.g:1632:2: rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1
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
    // InternalBrowserTest.g:1639:1: rule__ActionCommand__Group__0__Impl : ( '[ACTION]' ) ;
    public final void rule__ActionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1643:1: ( ( '[ACTION]' ) )
            // InternalBrowserTest.g:1644:1: ( '[ACTION]' )
            {
            // InternalBrowserTest.g:1644:1: ( '[ACTION]' )
            // InternalBrowserTest.g:1645:2: '[ACTION]'
            {
             before(grammarAccess.getActionCommandAccess().getACTIONKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBrowserTest.g:1654:1: rule__ActionCommand__Group__1 : rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 ;
    public final void rule__ActionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1658:1: ( rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 )
            // InternalBrowserTest.g:1659:2: rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserTest.g:1666:1: rule__ActionCommand__Group__1__Impl : ( ( ( rule__ActionCommand__VarAssignment_1 ) ) ( ( rule__ActionCommand__VarAssignment_1 )* ) ) ;
    public final void rule__ActionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1670:1: ( ( ( ( rule__ActionCommand__VarAssignment_1 ) ) ( ( rule__ActionCommand__VarAssignment_1 )* ) ) )
            // InternalBrowserTest.g:1671:1: ( ( ( rule__ActionCommand__VarAssignment_1 ) ) ( ( rule__ActionCommand__VarAssignment_1 )* ) )
            {
            // InternalBrowserTest.g:1671:1: ( ( ( rule__ActionCommand__VarAssignment_1 ) ) ( ( rule__ActionCommand__VarAssignment_1 )* ) )
            // InternalBrowserTest.g:1672:2: ( ( rule__ActionCommand__VarAssignment_1 ) ) ( ( rule__ActionCommand__VarAssignment_1 )* )
            {
            // InternalBrowserTest.g:1672:2: ( ( rule__ActionCommand__VarAssignment_1 ) )
            // InternalBrowserTest.g:1673:3: ( rule__ActionCommand__VarAssignment_1 )
            {
             before(grammarAccess.getActionCommandAccess().getVarAssignment_1()); 
            // InternalBrowserTest.g:1674:3: ( rule__ActionCommand__VarAssignment_1 )
            // InternalBrowserTest.g:1674:4: rule__ActionCommand__VarAssignment_1
            {
            pushFollow(FOLLOW_21);
            rule__ActionCommand__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getVarAssignment_1()); 

            }

            // InternalBrowserTest.g:1677:2: ( ( rule__ActionCommand__VarAssignment_1 )* )
            // InternalBrowserTest.g:1678:3: ( rule__ActionCommand__VarAssignment_1 )*
            {
             before(grammarAccess.getActionCommandAccess().getVarAssignment_1()); 
            // InternalBrowserTest.g:1679:3: ( rule__ActionCommand__VarAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBrowserTest.g:1679:4: rule__ActionCommand__VarAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ActionCommand__VarAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActionCommandAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__ActionCommand__Group__1__Impl"


    // $ANTLR start "rule__ActionCommand__Group__2"
    // InternalBrowserTest.g:1688:1: rule__ActionCommand__Group__2 : rule__ActionCommand__Group__2__Impl ;
    public final void rule__ActionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1692:1: ( rule__ActionCommand__Group__2__Impl )
            // InternalBrowserTest.g:1693:2: rule__ActionCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__2__Impl();

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
    // InternalBrowserTest.g:1699:1: rule__ActionCommand__Group__2__Impl : ( ( rule__ActionCommand__CommandAssignment_2 ) ) ;
    public final void rule__ActionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1703:1: ( ( ( rule__ActionCommand__CommandAssignment_2 ) ) )
            // InternalBrowserTest.g:1704:1: ( ( rule__ActionCommand__CommandAssignment_2 ) )
            {
            // InternalBrowserTest.g:1704:1: ( ( rule__ActionCommand__CommandAssignment_2 ) )
            // InternalBrowserTest.g:1705:2: ( rule__ActionCommand__CommandAssignment_2 )
            {
             before(grammarAccess.getActionCommandAccess().getCommandAssignment_2()); 
            // InternalBrowserTest.g:1706:2: ( rule__ActionCommand__CommandAssignment_2 )
            // InternalBrowserTest.g:1706:3: rule__ActionCommand__CommandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__CommandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getCommandAssignment_2()); 

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


    // $ANTLR start "rule__ActionType__Group_1__0"
    // InternalBrowserTest.g:1715:1: rule__ActionType__Group_1__0 : rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1 ;
    public final void rule__ActionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1719:1: ( rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1 )
            // InternalBrowserTest.g:1720:2: rule__ActionType__Group_1__0__Impl rule__ActionType__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserTest.g:1727:1: rule__ActionType__Group_1__0__Impl : ( '[CHECK]' ) ;
    public final void rule__ActionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1731:1: ( ( '[CHECK]' ) )
            // InternalBrowserTest.g:1732:1: ( '[CHECK]' )
            {
            // InternalBrowserTest.g:1732:1: ( '[CHECK]' )
            // InternalBrowserTest.g:1733:2: '[CHECK]'
            {
             before(grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBrowserTest.g:1742:1: rule__ActionType__Group_1__1 : rule__ActionType__Group_1__1__Impl rule__ActionType__Group_1__2 ;
    public final void rule__ActionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1746:1: ( rule__ActionType__Group_1__1__Impl rule__ActionType__Group_1__2 )
            // InternalBrowserTest.g:1747:2: rule__ActionType__Group_1__1__Impl rule__ActionType__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__ActionType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_1__2();

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
    // InternalBrowserTest.g:1754:1: rule__ActionType__Group_1__1__Impl : ( '$' ) ;
    public final void rule__ActionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1758:1: ( ( '$' ) )
            // InternalBrowserTest.g:1759:1: ( '$' )
            {
            // InternalBrowserTest.g:1759:1: ( '$' )
            // InternalBrowserTest.g:1760:2: '$'
            {
             before(grammarAccess.getActionTypeAccess().getDollarSignKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getDollarSignKeyword_1_1()); 

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


    // $ANTLR start "rule__ActionType__Group_1__2"
    // InternalBrowserTest.g:1769:1: rule__ActionType__Group_1__2 : rule__ActionType__Group_1__2__Impl ;
    public final void rule__ActionType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1773:1: ( rule__ActionType__Group_1__2__Impl )
            // InternalBrowserTest.g:1774:2: rule__ActionType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_1__2__Impl();

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
    // $ANTLR end "rule__ActionType__Group_1__2"


    // $ANTLR start "rule__ActionType__Group_1__2__Impl"
    // InternalBrowserTest.g:1780:1: rule__ActionType__Group_1__2__Impl : ( ( rule__ActionType__ValueAssignment_1_2 ) ) ;
    public final void rule__ActionType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1784:1: ( ( ( rule__ActionType__ValueAssignment_1_2 ) ) )
            // InternalBrowserTest.g:1785:1: ( ( rule__ActionType__ValueAssignment_1_2 ) )
            {
            // InternalBrowserTest.g:1785:1: ( ( rule__ActionType__ValueAssignment_1_2 ) )
            // InternalBrowserTest.g:1786:2: ( rule__ActionType__ValueAssignment_1_2 )
            {
             before(grammarAccess.getActionTypeAccess().getValueAssignment_1_2()); 
            // InternalBrowserTest.g:1787:2: ( rule__ActionType__ValueAssignment_1_2 )
            // InternalBrowserTest.g:1787:3: rule__ActionType__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__ActionType__Group_1__2__Impl"


    // $ANTLR start "rule__ActionType__Group_2__0"
    // InternalBrowserTest.g:1796:1: rule__ActionType__Group_2__0 : rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1 ;
    public final void rule__ActionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1800:1: ( rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1 )
            // InternalBrowserTest.g:1801:2: rule__ActionType__Group_2__0__Impl rule__ActionType__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1808:1: rule__ActionType__Group_2__0__Impl : ( '[SET-TEXT]' ) ;
    public final void rule__ActionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1812:1: ( ( '[SET-TEXT]' ) )
            // InternalBrowserTest.g:1813:1: ( '[SET-TEXT]' )
            {
            // InternalBrowserTest.g:1813:1: ( '[SET-TEXT]' )
            // InternalBrowserTest.g:1814:2: '[SET-TEXT]'
            {
             before(grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBrowserTest.g:1823:1: rule__ActionType__Group_2__1 : rule__ActionType__Group_2__1__Impl ;
    public final void rule__ActionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1827:1: ( rule__ActionType__Group_2__1__Impl )
            // InternalBrowserTest.g:1828:2: rule__ActionType__Group_2__1__Impl
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
    // InternalBrowserTest.g:1834:1: rule__ActionType__Group_2__1__Impl : ( ( rule__ActionType__TextAssignment_2_1 ) ) ;
    public final void rule__ActionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1838:1: ( ( ( rule__ActionType__TextAssignment_2_1 ) ) )
            // InternalBrowserTest.g:1839:1: ( ( rule__ActionType__TextAssignment_2_1 ) )
            {
            // InternalBrowserTest.g:1839:1: ( ( rule__ActionType__TextAssignment_2_1 ) )
            // InternalBrowserTest.g:1840:2: ( rule__ActionType__TextAssignment_2_1 )
            {
             before(grammarAccess.getActionTypeAccess().getTextAssignment_2_1()); 
            // InternalBrowserTest.g:1841:2: ( rule__ActionType__TextAssignment_2_1 )
            // InternalBrowserTest.g:1841:3: rule__ActionType__TextAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getTextAssignment_2_1()); 

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
    // InternalBrowserTest.g:1850:1: rule__ActionType__Group_3__0 : rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 ;
    public final void rule__ActionType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1854:1: ( rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 )
            // InternalBrowserTest.g:1855:2: rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserTest.g:1862:1: rule__ActionType__Group_3__0__Impl : ( '[CHOOSE]' ) ;
    public final void rule__ActionType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1866:1: ( ( '[CHOOSE]' ) )
            // InternalBrowserTest.g:1867:1: ( '[CHOOSE]' )
            {
            // InternalBrowserTest.g:1867:1: ( '[CHOOSE]' )
            // InternalBrowserTest.g:1868:2: '[CHOOSE]'
            {
             before(grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBrowserTest.g:1877:1: rule__ActionType__Group_3__1 : rule__ActionType__Group_3__1__Impl ;
    public final void rule__ActionType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1881:1: ( rule__ActionType__Group_3__1__Impl )
            // InternalBrowserTest.g:1882:2: rule__ActionType__Group_3__1__Impl
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
    // InternalBrowserTest.g:1888:1: rule__ActionType__Group_3__1__Impl : ( ( rule__ActionType__OptionAssignment_3_1 ) ) ;
    public final void rule__ActionType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1892:1: ( ( ( rule__ActionType__OptionAssignment_3_1 ) ) )
            // InternalBrowserTest.g:1893:1: ( ( rule__ActionType__OptionAssignment_3_1 ) )
            {
            // InternalBrowserTest.g:1893:1: ( ( rule__ActionType__OptionAssignment_3_1 ) )
            // InternalBrowserTest.g:1894:2: ( rule__ActionType__OptionAssignment_3_1 )
            {
             before(grammarAccess.getActionTypeAccess().getOptionAssignment_3_1()); 
            // InternalBrowserTest.g:1895:2: ( rule__ActionType__OptionAssignment_3_1 )
            // InternalBrowserTest.g:1895:3: rule__ActionType__OptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__OptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getOptionAssignment_3_1()); 

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
    // InternalBrowserTest.g:1904:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1908:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserTest.g:1909:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalBrowserTest.g:1916:1: rule__Test__Group__0__Impl : ( '[TEST]' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1920:1: ( ( '[TEST]' ) )
            // InternalBrowserTest.g:1921:1: ( '[TEST]' )
            {
            // InternalBrowserTest.g:1921:1: ( '[TEST]' )
            // InternalBrowserTest.g:1922:2: '[TEST]'
            {
             before(grammarAccess.getTestAccess().getTESTKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBrowserTest.g:1931:1: rule__Test__Group__1 : rule__Test__Group__1__Impl ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1935:1: ( rule__Test__Group__1__Impl )
            // InternalBrowserTest.g:1936:2: rule__Test__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__1__Impl();

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
    // InternalBrowserTest.g:1942:1: rule__Test__Group__1__Impl : ( ( rule__Test__VarAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1946:1: ( ( ( rule__Test__VarAssignment_1 ) ) )
            // InternalBrowserTest.g:1947:1: ( ( rule__Test__VarAssignment_1 ) )
            {
            // InternalBrowserTest.g:1947:1: ( ( rule__Test__VarAssignment_1 ) )
            // InternalBrowserTest.g:1948:2: ( rule__Test__VarAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getVarAssignment_1()); 
            // InternalBrowserTest.g:1949:2: ( rule__Test__VarAssignment_1 )
            // InternalBrowserTest.g:1949:3: rule__Test__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getVarAssignment_1()); 

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


    // $ANTLR start "rule__TestFile__TaskAssignment"
    // InternalBrowserTest.g:1958:1: rule__TestFile__TaskAssignment : ( ruleTask ) ;
    public final void rule__TestFile__TaskAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1962:1: ( ( ruleTask ) )
            // InternalBrowserTest.g:1963:2: ( ruleTask )
            {
            // InternalBrowserTest.g:1963:2: ( ruleTask )
            // InternalBrowserTest.g:1964:3: ruleTask
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
    // InternalBrowserTest.g:1973:1: rule__Task__NameAssignment_1 : ( ( rule__Task__NameAlternatives_1_0 ) ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1977:1: ( ( ( rule__Task__NameAlternatives_1_0 ) ) )
            // InternalBrowserTest.g:1978:2: ( ( rule__Task__NameAlternatives_1_0 ) )
            {
            // InternalBrowserTest.g:1978:2: ( ( rule__Task__NameAlternatives_1_0 ) )
            // InternalBrowserTest.g:1979:3: ( rule__Task__NameAlternatives_1_0 )
            {
             before(grammarAccess.getTaskAccess().getNameAlternatives_1_0()); 
            // InternalBrowserTest.g:1980:3: ( rule__Task__NameAlternatives_1_0 )
            // InternalBrowserTest.g:1980:4: rule__Task__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAlternatives_1_0()); 

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
    // InternalBrowserTest.g:1988:1: rule__Task__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__Task__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:1992:1: ( ( ruleAction ) )
            // InternalBrowserTest.g:1993:2: ( ruleAction )
            {
            // InternalBrowserTest.g:1993:2: ( ruleAction )
            // InternalBrowserTest.g:1994:3: ruleAction
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
    // InternalBrowserTest.g:2003:1: rule__GoTo__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2007:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:2008:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:2008:2: ( RULE_STRING )
            // InternalBrowserTest.g:2009:3: RULE_STRING
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


    // $ANTLR start "rule__Select__VarAssignment_1"
    // InternalBrowserTest.g:2018:1: rule__Select__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__Select__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2022:1: ( ( ruleVariable ) )
            // InternalBrowserTest.g:2023:2: ( ruleVariable )
            {
            // InternalBrowserTest.g:2023:2: ( ruleVariable )
            // InternalBrowserTest.g:2024:3: ruleVariable
            {
             before(grammarAccess.getSelectAccess().getVarVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getVarVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Select__VarAssignment_1"


    // $ANTLR start "rule__Select__PropertiesAssignment_2"
    // InternalBrowserTest.g:2033:1: rule__Select__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__Select__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2037:1: ( ( ruleProperty ) )
            // InternalBrowserTest.g:2038:2: ( ruleProperty )
            {
            // InternalBrowserTest.g:2038:2: ( ruleProperty )
            // InternalBrowserTest.g:2039:3: ruleProperty
            {
             before(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Select__PropertiesAssignment_2"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalBrowserTest.g:2048:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2052:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:2053:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:2053:2: ( RULE_ID )
            // InternalBrowserTest.g:2054:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Entree__VarAssignment_0_0"
    // InternalBrowserTest.g:2063:1: rule__Entree__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Entree__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2067:1: ( ( ruleVariable ) )
            // InternalBrowserTest.g:2068:2: ( ruleVariable )
            {
            // InternalBrowserTest.g:2068:2: ( ruleVariable )
            // InternalBrowserTest.g:2069:3: ruleVariable
            {
             before(grammarAccess.getEntreeAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getEntreeAccess().getVarVariableParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Entree__VarAssignment_0_0"


    // $ANTLR start "rule__Entree__ParamAssignment_0_2_0"
    // InternalBrowserTest.g:2078:1: rule__Entree__ParamAssignment_0_2_0 : ( ruleAttribute ) ;
    public final void rule__Entree__ParamAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2082:1: ( ( ruleAttribute ) )
            // InternalBrowserTest.g:2083:2: ( ruleAttribute )
            {
            // InternalBrowserTest.g:2083:2: ( ruleAttribute )
            // InternalBrowserTest.g:2084:3: ruleAttribute
            {
             before(grammarAccess.getEntreeAccess().getParamAttributeEnumRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntreeAccess().getParamAttributeEnumRuleCall_0_2_0_0()); 

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
    // $ANTLR end "rule__Entree__ParamAssignment_0_2_0"


    // $ANTLR start "rule__Entree__UntypedAssignment_0_2_1"
    // InternalBrowserTest.g:2093:1: rule__Entree__UntypedAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__Entree__UntypedAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2097:1: ( ( RULE_ID ) )
            // InternalBrowserTest.g:2098:2: ( RULE_ID )
            {
            // InternalBrowserTest.g:2098:2: ( RULE_ID )
            // InternalBrowserTest.g:2099:3: RULE_ID
            {
             before(grammarAccess.getEntreeAccess().getUntypedIDTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getUntypedIDTerminalRuleCall_0_2_1_0()); 

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
    // $ANTLR end "rule__Entree__UntypedAssignment_0_2_1"


    // $ANTLR start "rule__Entree__StringAssignment_1"
    // InternalBrowserTest.g:2108:1: rule__Entree__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entree__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2112:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:2113:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:2113:2: ( RULE_STRING )
            // InternalBrowserTest.g:2114:3: RULE_STRING
            {
             before(grammarAccess.getEntreeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getStringSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entree__StringAssignment_1"


    // $ANTLR start "rule__Entree__AccessorAssignment_2_1"
    // InternalBrowserTest.g:2123:1: rule__Entree__AccessorAssignment_2_1 : ( ruleAccessor ) ;
    public final void rule__Entree__AccessorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2127:1: ( ( ruleAccessor ) )
            // InternalBrowserTest.g:2128:2: ( ruleAccessor )
            {
            // InternalBrowserTest.g:2128:2: ( ruleAccessor )
            // InternalBrowserTest.g:2129:3: ruleAccessor
            {
             before(grammarAccess.getEntreeAccess().getAccessorAccessorEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessor();

            state._fsp--;

             after(grammarAccess.getEntreeAccess().getAccessorAccessorEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Entree__AccessorAssignment_2_1"


    // $ANTLR start "rule__Property__ContentAssignment_0_1"
    // InternalBrowserTest.g:2138:1: rule__Property__ContentAssignment_0_1 : ( ruleEntree ) ;
    public final void rule__Property__ContentAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2142:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2143:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2143:2: ( ruleEntree )
            // InternalBrowserTest.g:2144:3: ruleEntree
            {
             before(grammarAccess.getPropertyAccess().getContentEntreeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getContentEntreeParserRuleCall_0_1_0()); 

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


    // $ANTLR start "rule__Property__LabelAssignment_1_1"
    // InternalBrowserTest.g:2153:1: rule__Property__LabelAssignment_1_1 : ( ruleEntree ) ;
    public final void rule__Property__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2157:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2158:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2158:2: ( ruleEntree )
            // InternalBrowserTest.g:2159:3: ruleEntree
            {
             before(grammarAccess.getPropertyAccess().getLabelEntreeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getLabelEntreeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Property__LabelAssignment_1_1"


    // $ANTLR start "rule__Property__ValueAssignment_2_1"
    // InternalBrowserTest.g:2168:1: rule__Property__ValueAssignment_2_1 : ( ruleEntree ) ;
    public final void rule__Property__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2172:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2173:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2173:2: ( ruleEntree )
            // InternalBrowserTest.g:2174:3: ruleEntree
            {
             before(grammarAccess.getPropertyAccess().getValueEntreeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueEntreeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Property__ValueAssignment_2_1"


    // $ANTLR start "rule__Property__AltAssignment_3_1"
    // InternalBrowserTest.g:2183:1: rule__Property__AltAssignment_3_1 : ( ruleEntree ) ;
    public final void rule__Property__AltAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2187:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2188:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2188:2: ( ruleEntree )
            // InternalBrowserTest.g:2189:3: ruleEntree
            {
             before(grammarAccess.getPropertyAccess().getAltEntreeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAltEntreeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Property__AltAssignment_3_1"


    // $ANTLR start "rule__Property__TypeAssignment_4_2"
    // InternalBrowserTest.g:2198:1: rule__Property__TypeAssignment_4_2 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2202:1: ( ( ruleType ) )
            // InternalBrowserTest.g:2203:2: ( ruleType )
            {
            // InternalBrowserTest.g:2203:2: ( ruleType )
            // InternalBrowserTest.g:2204:3: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_4_2"


    // $ANTLR start "rule__Property__NameAssignment_5_1"
    // InternalBrowserTest.g:2213:1: rule__Property__NameAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Property__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2217:1: ( ( RULE_STRING ) )
            // InternalBrowserTest.g:2218:2: ( RULE_STRING )
            {
            // InternalBrowserTest.g:2218:2: ( RULE_STRING )
            // InternalBrowserTest.g:2219:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_5_1"


    // $ANTLR start "rule__Property__ChildAssignment_6_1"
    // InternalBrowserTest.g:2228:1: rule__Property__ChildAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Property__ChildAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2232:1: ( ( RULE_INT ) )
            // InternalBrowserTest.g:2233:2: ( RULE_INT )
            {
            // InternalBrowserTest.g:2233:2: ( RULE_INT )
            // InternalBrowserTest.g:2234:3: RULE_INT
            {
             before(grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Property__ChildAssignment_6_1"


    // $ANTLR start "rule__Property__SubPropertiesAssignment_7_3"
    // InternalBrowserTest.g:2243:1: rule__Property__SubPropertiesAssignment_7_3 : ( ruleProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2247:1: ( ( ruleProperty ) )
            // InternalBrowserTest.g:2248:2: ( ruleProperty )
            {
            // InternalBrowserTest.g:2248:2: ( ruleProperty )
            // InternalBrowserTest.g:2249:3: ruleProperty
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__Property__SubPropertiesAssignment_7_3"


    // $ANTLR start "rule__ActionCommand__VarAssignment_1"
    // InternalBrowserTest.g:2258:1: rule__ActionCommand__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__ActionCommand__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2262:1: ( ( ruleVariable ) )
            // InternalBrowserTest.g:2263:2: ( ruleVariable )
            {
            // InternalBrowserTest.g:2263:2: ( ruleVariable )
            // InternalBrowserTest.g:2264:3: ruleVariable
            {
             before(grammarAccess.getActionCommandAccess().getVarVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getVarVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionCommand__VarAssignment_1"


    // $ANTLR start "rule__ActionCommand__CommandAssignment_2"
    // InternalBrowserTest.g:2273:1: rule__ActionCommand__CommandAssignment_2 : ( ruleActionType ) ;
    public final void rule__ActionCommand__CommandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2277:1: ( ( ruleActionType ) )
            // InternalBrowserTest.g:2278:2: ( ruleActionType )
            {
            // InternalBrowserTest.g:2278:2: ( ruleActionType )
            // InternalBrowserTest.g:2279:3: ruleActionType
            {
             before(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActionCommand__CommandAssignment_2"


    // $ANTLR start "rule__ActionType__ValueAssignment_1_2"
    // InternalBrowserTest.g:2288:1: rule__ActionType__ValueAssignment_1_2 : ( ruleBoolean ) ;
    public final void rule__ActionType__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2292:1: ( ( ruleBoolean ) )
            // InternalBrowserTest.g:2293:2: ( ruleBoolean )
            {
            // InternalBrowserTest.g:2293:2: ( ruleBoolean )
            // InternalBrowserTest.g:2294:3: ruleBoolean
            {
             before(grammarAccess.getActionTypeAccess().getValueBooleanEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getValueBooleanEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ActionType__ValueAssignment_1_2"


    // $ANTLR start "rule__ActionType__TextAssignment_2_1"
    // InternalBrowserTest.g:2303:1: rule__ActionType__TextAssignment_2_1 : ( ruleEntree ) ;
    public final void rule__ActionType__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2307:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2308:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2308:2: ( ruleEntree )
            // InternalBrowserTest.g:2309:3: ruleEntree
            {
             before(grammarAccess.getActionTypeAccess().getTextEntreeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getTextEntreeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ActionType__TextAssignment_2_1"


    // $ANTLR start "rule__ActionType__OptionAssignment_3_1"
    // InternalBrowserTest.g:2318:1: rule__ActionType__OptionAssignment_3_1 : ( ruleEntree ) ;
    public final void rule__ActionType__OptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2322:1: ( ( ruleEntree ) )
            // InternalBrowserTest.g:2323:2: ( ruleEntree )
            {
            // InternalBrowserTest.g:2323:2: ( ruleEntree )
            // InternalBrowserTest.g:2324:3: ruleEntree
            {
             before(grammarAccess.getActionTypeAccess().getOptionEntreeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getOptionEntreeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ActionType__OptionAssignment_3_1"


    // $ANTLR start "rule__Test__VarAssignment_1"
    // InternalBrowserTest.g:2333:1: rule__Test__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__Test__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserTest.g:2337:1: ( ( ruleVariable ) )
            // InternalBrowserTest.g:2338:2: ( ruleVariable )
            {
            // InternalBrowserTest.g:2338:2: ( ruleVariable )
            // InternalBrowserTest.g:2339:3: ruleVariable
            {
             before(grammarAccess.getTestAccess().getVarVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTestAccess().getVarVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Test__VarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000022001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000022001800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000007F8000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C2010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000017F8000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000300000L});

}