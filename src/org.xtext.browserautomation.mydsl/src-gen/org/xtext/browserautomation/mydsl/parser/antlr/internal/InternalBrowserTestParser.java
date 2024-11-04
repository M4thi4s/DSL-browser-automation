package org.xtext.browserautomation.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.browserautomation.mydsl.services.BrowserTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[TASK]'", "'[GOTO]'", "'[SELECT]'", "'$'", "'.'", "'[CONTENT]'", "'[LABEL]'", "'[VALUE]'", "'[ALT]'", "'[TYPE]'", "'[NAME]'", "'[NTH-CHILD]'", "'[PARENT]'", "'{'", "'}'", "'[ACTION]'", "'[CLICK]'", "'[CHECK]'", "'[SET-TEXT]'", "'[CHOOSE]'", "'[TEST]'", "'LINK'", "'INPUT'", "'TEXT'", "'CHECKBOX'", "'DIV'", "'TITLE'", "'CONTENT'", "'FALSE'", "'TRUE'", "'ALL'"
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

        public InternalBrowserTestParser(TokenStream input, BrowserTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TestFile";
       	}

       	@Override
       	protected BrowserTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTestFile"
    // InternalBrowserTest.g:65:1: entryRuleTestFile returns [EObject current=null] : iv_ruleTestFile= ruleTestFile EOF ;
    public final EObject entryRuleTestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestFile = null;


        try {
            // InternalBrowserTest.g:65:49: (iv_ruleTestFile= ruleTestFile EOF )
            // InternalBrowserTest.g:66:2: iv_ruleTestFile= ruleTestFile EOF
            {
             newCompositeNode(grammarAccess.getTestFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestFile=ruleTestFile();

            state._fsp--;

             current =iv_ruleTestFile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestFile"


    // $ANTLR start "ruleTestFile"
    // InternalBrowserTest.g:72:1: ruleTestFile returns [EObject current=null] : ( (lv_task_0_0= ruleTask ) )* ;
    public final EObject ruleTestFile() throws RecognitionException {
        EObject current = null;

        EObject lv_task_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:78:2: ( ( (lv_task_0_0= ruleTask ) )* )
            // InternalBrowserTest.g:79:2: ( (lv_task_0_0= ruleTask ) )*
            {
            // InternalBrowserTest.g:79:2: ( (lv_task_0_0= ruleTask ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserTest.g:80:3: (lv_task_0_0= ruleTask )
            	    {
            	    // InternalBrowserTest.g:80:3: (lv_task_0_0= ruleTask )
            	    // InternalBrowserTest.g:81:4: lv_task_0_0= ruleTask
            	    {

            	    				newCompositeNode(grammarAccess.getTestFileAccess().getTaskTaskParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_task_0_0=ruleTask();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTestFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"task",
            	    					lv_task_0_0,
            	    					"org.xtext.browserautomation.mydsl.BrowserTest.Task");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTestFile"


    // $ANTLR start "entryRuleTask"
    // InternalBrowserTest.g:101:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBrowserTest.g:101:45: (iv_ruleTask= ruleTask EOF )
            // InternalBrowserTest.g:102:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBrowserTest.g:108:1: ruleTask returns [EObject current=null] : (otherlv_0= '[TASK]' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:114:2: ( (otherlv_0= '[TASK]' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ( (lv_actions_2_0= ruleAction ) )* ) )
            // InternalBrowserTest.g:115:2: (otherlv_0= '[TASK]' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ( (lv_actions_2_0= ruleAction ) )* )
            {
            // InternalBrowserTest.g:115:2: (otherlv_0= '[TASK]' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ( (lv_actions_2_0= ruleAction ) )* )
            // InternalBrowserTest.g:116:3: otherlv_0= '[TASK]' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ( (lv_actions_2_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTASKKeyword_0());
            		
            // InternalBrowserTest.g:120:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalBrowserTest.g:121:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalBrowserTest.g:121:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalBrowserTest.g:122:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalBrowserTest.g:122:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
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
                    // InternalBrowserTest.g:123:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:138:6: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalBrowserTest.g:155:3: ( (lv_actions_2_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=13)||LA3_0==26||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBrowserTest.g:156:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalBrowserTest.g:156:4: (lv_actions_2_0= ruleAction )
            	    // InternalBrowserTest.g:157:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"org.xtext.browserautomation.mydsl.BrowserTest.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalBrowserTest.g:178:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserTest.g:178:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserTest.g:179:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBrowserTest.g:185:1: ruleAction returns [EObject current=null] : (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GoTo_0 = null;

        EObject this_Select_1 = null;

        EObject this_ActionCommand_2 = null;

        EObject this_Test_3 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:191:2: ( (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest ) )
            // InternalBrowserTest.g:192:2: (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest )
            {
            // InternalBrowserTest.g:192:2: (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 31:
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
                    // InternalBrowserTest.g:193:3: this_GoTo_0= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGoToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_0=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:202:3: this_Select_1= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_1=ruleSelect();

                    state._fsp--;


                    			current = this_Select_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:211:3: this_ActionCommand_2= ruleActionCommand
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionCommand_2=ruleActionCommand();

                    state._fsp--;


                    			current = this_ActionCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:220:3: this_Test_3= ruleTest
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTestParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Test_3=ruleTest();

                    state._fsp--;


                    			current = this_Test_3;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoTo"
    // InternalBrowserTest.g:232:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalBrowserTest.g:232:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalBrowserTest.g:233:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalBrowserTest.g:239:1: ruleGoTo returns [EObject current=null] : (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:245:2: ( (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserTest.g:246:2: (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserTest.g:246:2: (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserTest.g:247:3: otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
            		
            // InternalBrowserTest.g:251:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserTest.g:252:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserTest.g:252:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserTest.g:253:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleSelect"
    // InternalBrowserTest.g:273:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalBrowserTest.g:273:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalBrowserTest.g:274:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalBrowserTest.g:280:1: ruleSelect returns [EObject current=null] : (otherlv_0= '[SELECT]' ( (lv_var_1_0= ruleVariable ) ) ( (lv_properties_2_0= ruleProperty ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:286:2: ( (otherlv_0= '[SELECT]' ( (lv_var_1_0= ruleVariable ) ) ( (lv_properties_2_0= ruleProperty ) )* ) )
            // InternalBrowserTest.g:287:2: (otherlv_0= '[SELECT]' ( (lv_var_1_0= ruleVariable ) ) ( (lv_properties_2_0= ruleProperty ) )* )
            {
            // InternalBrowserTest.g:287:2: (otherlv_0= '[SELECT]' ( (lv_var_1_0= ruleVariable ) ) ( (lv_properties_2_0= ruleProperty ) )* )
            // InternalBrowserTest.g:288:3: otherlv_0= '[SELECT]' ( (lv_var_1_0= ruleVariable ) ) ( (lv_properties_2_0= ruleProperty ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalBrowserTest.g:292:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalBrowserTest.g:293:4: (lv_var_1_0= ruleVariable )
            {
            // InternalBrowserTest.g:293:4: (lv_var_1_0= ruleVariable )
            // InternalBrowserTest.g:294:5: lv_var_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getVarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserTest.g:311:3: ( (lv_properties_2_0= ruleProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowserTest.g:312:4: (lv_properties_2_0= ruleProperty )
            	    {
            	    // InternalBrowserTest.g:312:4: (lv_properties_2_0= ruleProperty )
            	    // InternalBrowserTest.g:313:5: lv_properties_2_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"org.xtext.browserautomation.mydsl.BrowserTest.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserTest.g:334:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserTest.g:334:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserTest.g:335:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserTest.g:341:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:347:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBrowserTest.g:348:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBrowserTest.g:348:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBrowserTest.g:349:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalBrowserTest.g:353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrowserTest.g:354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrowserTest.g:354:4: (lv_name_1_0= RULE_ID )
            // InternalBrowserTest.g:355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEntree"
    // InternalBrowserTest.g:375:1: entryRuleEntree returns [EObject current=null] : iv_ruleEntree= ruleEntree EOF ;
    public final EObject entryRuleEntree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntree = null;


        try {
            // InternalBrowserTest.g:375:47: (iv_ruleEntree= ruleEntree EOF )
            // InternalBrowserTest.g:376:2: iv_ruleEntree= ruleEntree EOF
            {
             newCompositeNode(grammarAccess.getEntreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntree=ruleEntree();

            state._fsp--;

             current =iv_ruleEntree; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntree"


    // $ANTLR start "ruleEntree"
    // InternalBrowserTest.g:382:1: ruleEntree returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) ) | ( (lv_string_4_0= RULE_STRING ) ) | (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) ) ) ;
    public final EObject ruleEntree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_untyped_3_0=null;
        Token lv_string_4_0=null;
        Token otherlv_5=null;
        EObject lv_var_0_0 = null;

        Enumerator lv_param_2_0 = null;

        Enumerator lv_accessor_6_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:388:2: ( ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) ) | ( (lv_string_4_0= RULE_STRING ) ) | (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) ) ) )
            // InternalBrowserTest.g:389:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) ) | ( (lv_string_4_0= RULE_STRING ) ) | (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) ) )
            {
            // InternalBrowserTest.g:389:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) ) | ( (lv_string_4_0= RULE_STRING ) ) | (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==41) ) {
                    alt7=3;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBrowserTest.g:390:3: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) )
                    {
                    // InternalBrowserTest.g:390:3: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) ) )
                    // InternalBrowserTest.g:391:4: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '.' ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) )
                    {
                    // InternalBrowserTest.g:391:4: ( (lv_var_0_0= ruleVariable ) )
                    // InternalBrowserTest.g:392:5: (lv_var_0_0= ruleVariable )
                    {
                    // InternalBrowserTest.g:392:5: (lv_var_0_0= ruleVariable )
                    // InternalBrowserTest.g:393:6: lv_var_0_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getEntreeAccess().getVarVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntreeRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_0_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntreeAccess().getFullStopKeyword_0_1());
                    			
                    // InternalBrowserTest.g:414:4: ( ( (lv_param_2_0= ruleAttribute ) ) | ( (lv_untyped_3_0= RULE_ID ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==32||(LA6_0>=37 && LA6_0<=38)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalBrowserTest.g:415:5: ( (lv_param_2_0= ruleAttribute ) )
                            {
                            // InternalBrowserTest.g:415:5: ( (lv_param_2_0= ruleAttribute ) )
                            // InternalBrowserTest.g:416:6: (lv_param_2_0= ruleAttribute )
                            {
                            // InternalBrowserTest.g:416:6: (lv_param_2_0= ruleAttribute )
                            // InternalBrowserTest.g:417:7: lv_param_2_0= ruleAttribute
                            {

                            							newCompositeNode(grammarAccess.getEntreeAccess().getParamAttributeEnumRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_param_2_0=ruleAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntreeRule());
                            							}
                            							set(
                            								current,
                            								"param",
                            								lv_param_2_0,
                            								"org.xtext.browserautomation.mydsl.BrowserTest.Attribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBrowserTest.g:435:5: ( (lv_untyped_3_0= RULE_ID ) )
                            {
                            // InternalBrowserTest.g:435:5: ( (lv_untyped_3_0= RULE_ID ) )
                            // InternalBrowserTest.g:436:6: (lv_untyped_3_0= RULE_ID )
                            {
                            // InternalBrowserTest.g:436:6: (lv_untyped_3_0= RULE_ID )
                            // InternalBrowserTest.g:437:7: lv_untyped_3_0= RULE_ID
                            {
                            lv_untyped_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_untyped_3_0, grammarAccess.getEntreeAccess().getUntypedIDTerminalRuleCall_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntreeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"untyped",
                            								lv_untyped_3_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:456:3: ( (lv_string_4_0= RULE_STRING ) )
                    {
                    // InternalBrowserTest.g:456:3: ( (lv_string_4_0= RULE_STRING ) )
                    // InternalBrowserTest.g:457:4: (lv_string_4_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:457:4: (lv_string_4_0= RULE_STRING )
                    // InternalBrowserTest.g:458:5: lv_string_4_0= RULE_STRING
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_4_0, grammarAccess.getEntreeAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntreeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:475:3: (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) )
                    {
                    // InternalBrowserTest.g:475:3: (otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) ) )
                    // InternalBrowserTest.g:476:4: otherlv_5= '$' ( (lv_accessor_6_0= ruleAccessor ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntreeAccess().getDollarSignKeyword_2_0());
                    			
                    // InternalBrowserTest.g:480:4: ( (lv_accessor_6_0= ruleAccessor ) )
                    // InternalBrowserTest.g:481:5: (lv_accessor_6_0= ruleAccessor )
                    {
                    // InternalBrowserTest.g:481:5: (lv_accessor_6_0= ruleAccessor )
                    // InternalBrowserTest.g:482:6: lv_accessor_6_0= ruleAccessor
                    {

                    						newCompositeNode(grammarAccess.getEntreeAccess().getAccessorAccessorEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_accessor_6_0=ruleAccessor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntreeRule());
                    						}
                    						set(
                    							current,
                    							"accessor",
                    							lv_accessor_6_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Accessor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleEntree"


    // $ANTLR start "entryRuleProperty"
    // InternalBrowserTest.g:504:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBrowserTest.g:504:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBrowserTest.g:505:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalBrowserTest.g:511:1: ruleProperty returns [EObject current=null] : ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) ) | (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) ) | (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) ) | (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) ) | (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) ) | (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) ) | (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token lv_child_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_content_1_0 = null;

        EObject lv_label_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_alt_7_0 = null;

        Enumerator lv_type_10_0 = null;

        EObject lv_subProperties_17_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:517:2: ( ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) ) | (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) ) | (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) ) | (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) ) | (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) ) | (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) ) | (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' ) ) )
            // InternalBrowserTest.g:518:2: ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) ) | (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) ) | (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) ) | (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) ) | (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) ) | (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) ) | (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' ) )
            {
            // InternalBrowserTest.g:518:2: ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) ) | (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) ) | (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) ) | (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) ) | (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) ) | (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) ) | (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            case 21:
                {
                alt9=6;
                }
                break;
            case 22:
                {
                alt9=7;
                }
                break;
            case 23:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBrowserTest.g:519:3: (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:519:3: (otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:520:4: otherlv_0= '[CONTENT]' ( (lv_content_1_0= ruleEntree ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0());
                    			
                    // InternalBrowserTest.g:524:4: ( (lv_content_1_0= ruleEntree ) )
                    // InternalBrowserTest.g:525:5: (lv_content_1_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:525:5: (lv_content_1_0= ruleEntree )
                    // InternalBrowserTest.g:526:6: lv_content_1_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getContentEntreeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_content_1_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_1_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:545:3: (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:545:3: (otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:546:4: otherlv_2= '[LABEL]' ( (lv_label_3_0= ruleEntree ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLABELKeyword_1_0());
                    			
                    // InternalBrowserTest.g:550:4: ( (lv_label_3_0= ruleEntree ) )
                    // InternalBrowserTest.g:551:5: (lv_label_3_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:551:5: (lv_label_3_0= ruleEntree )
                    // InternalBrowserTest.g:552:6: lv_label_3_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getLabelEntreeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_3_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:571:3: (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:571:3: (otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:572:4: otherlv_4= '[VALUE]' ( (lv_value_5_0= ruleEntree ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getVALUEKeyword_2_0());
                    			
                    // InternalBrowserTest.g:576:4: ( (lv_value_5_0= ruleEntree ) )
                    // InternalBrowserTest.g:577:5: (lv_value_5_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:577:5: (lv_value_5_0= ruleEntree )
                    // InternalBrowserTest.g:578:6: lv_value_5_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getValueEntreeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:597:3: (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:597:3: (otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:598:4: otherlv_6= '[ALT]' ( (lv_alt_7_0= ruleEntree ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getALTKeyword_3_0());
                    			
                    // InternalBrowserTest.g:602:4: ( (lv_alt_7_0= ruleEntree ) )
                    // InternalBrowserTest.g:603:5: (lv_alt_7_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:603:5: (lv_alt_7_0= ruleEntree )
                    // InternalBrowserTest.g:604:6: lv_alt_7_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getAltEntreeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alt_7_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"alt",
                    							lv_alt_7_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:623:3: (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) )
                    {
                    // InternalBrowserTest.g:623:3: (otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) ) )
                    // InternalBrowserTest.g:624:4: otherlv_8= '[TYPE]' otherlv_9= '$' ( (lv_type_10_0= ruleType ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTYPEKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getDollarSignKeyword_4_1());
                    			
                    // InternalBrowserTest.g:632:4: ( (lv_type_10_0= ruleType ) )
                    // InternalBrowserTest.g:633:5: (lv_type_10_0= ruleType )
                    {
                    // InternalBrowserTest.g:633:5: (lv_type_10_0= ruleType )
                    // InternalBrowserTest.g:634:6: lv_type_10_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_10_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:653:3: (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:653:3: (otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:654:4: otherlv_11= '[NAME]' ( (lv_name_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getNAMEKeyword_5_0());
                    			
                    // InternalBrowserTest.g:658:4: ( (lv_name_12_0= RULE_STRING ) )
                    // InternalBrowserTest.g:659:5: (lv_name_12_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:659:5: (lv_name_12_0= RULE_STRING )
                    // InternalBrowserTest.g:660:6: lv_name_12_0= RULE_STRING
                    {
                    lv_name_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_12_0, grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserTest.g:678:3: (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) )
                    {
                    // InternalBrowserTest.g:678:3: (otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) ) )
                    // InternalBrowserTest.g:679:4: otherlv_13= '[NTH-CHILD]' ( (lv_child_14_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getNTHCHILDKeyword_6_0());
                    			
                    // InternalBrowserTest.g:683:4: ( (lv_child_14_0= RULE_INT ) )
                    // InternalBrowserTest.g:684:5: (lv_child_14_0= RULE_INT )
                    {
                    // InternalBrowserTest.g:684:5: (lv_child_14_0= RULE_INT )
                    // InternalBrowserTest.g:685:6: lv_child_14_0= RULE_INT
                    {
                    lv_child_14_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_child_14_0, grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"child",
                    							lv_child_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserTest.g:703:3: (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' )
                    {
                    // InternalBrowserTest.g:703:3: (otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}' )
                    // InternalBrowserTest.g:704:4: otherlv_15= '[PARENT]' otherlv_16= '{' ( (lv_subProperties_17_0= ruleProperty ) )* otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getPropertyAccess().getPARENTKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBrowserTest.g:712:4: ( (lv_subProperties_17_0= ruleProperty ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=16 && LA8_0<=23)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBrowserTest.g:713:5: (lv_subProperties_17_0= ruleProperty )
                    	    {
                    	    // InternalBrowserTest.g:713:5: (lv_subProperties_17_0= ruleProperty )
                    	    // InternalBrowserTest.g:714:6: lv_subProperties_17_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_subProperties_17_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subProperties",
                    	    							lv_subProperties_17_0,
                    	    							"org.xtext.browserautomation.mydsl.BrowserTest.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleActionCommand"
    // InternalBrowserTest.g:740:1: entryRuleActionCommand returns [EObject current=null] : iv_ruleActionCommand= ruleActionCommand EOF ;
    public final EObject entryRuleActionCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionCommand = null;


        try {
            // InternalBrowserTest.g:740:54: (iv_ruleActionCommand= ruleActionCommand EOF )
            // InternalBrowserTest.g:741:2: iv_ruleActionCommand= ruleActionCommand EOF
            {
             newCompositeNode(grammarAccess.getActionCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionCommand=ruleActionCommand();

            state._fsp--;

             current =iv_ruleActionCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionCommand"


    // $ANTLR start "ruleActionCommand"
    // InternalBrowserTest.g:747:1: ruleActionCommand returns [EObject current=null] : (otherlv_0= '[ACTION]' ( (lv_var_1_0= ruleVariable ) )+ ( (lv_command_2_0= ruleActionType ) ) ) ;
    public final EObject ruleActionCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;

        EObject lv_command_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:753:2: ( (otherlv_0= '[ACTION]' ( (lv_var_1_0= ruleVariable ) )+ ( (lv_command_2_0= ruleActionType ) ) ) )
            // InternalBrowserTest.g:754:2: (otherlv_0= '[ACTION]' ( (lv_var_1_0= ruleVariable ) )+ ( (lv_command_2_0= ruleActionType ) ) )
            {
            // InternalBrowserTest.g:754:2: (otherlv_0= '[ACTION]' ( (lv_var_1_0= ruleVariable ) )+ ( (lv_command_2_0= ruleActionType ) ) )
            // InternalBrowserTest.g:755:3: otherlv_0= '[ACTION]' ( (lv_var_1_0= ruleVariable ) )+ ( (lv_command_2_0= ruleActionType ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActionCommandAccess().getACTIONKeyword_0());
            		
            // InternalBrowserTest.g:759:3: ( (lv_var_1_0= ruleVariable ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBrowserTest.g:760:4: (lv_var_1_0= ruleVariable )
            	    {
            	    // InternalBrowserTest.g:760:4: (lv_var_1_0= ruleVariable )
            	    // InternalBrowserTest.g:761:5: lv_var_1_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getActionCommandAccess().getVarVariableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_var_1_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"var",
            	    						lv_var_1_0,
            	    						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalBrowserTest.g:778:3: ( (lv_command_2_0= ruleActionType ) )
            // InternalBrowserTest.g:779:4: (lv_command_2_0= ruleActionType )
            {
            // InternalBrowserTest.g:779:4: (lv_command_2_0= ruleActionType )
            // InternalBrowserTest.g:780:5: lv_command_2_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_command_2_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_2_0,
            						"org.xtext.browserautomation.mydsl.BrowserTest.ActionType");
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
    // $ANTLR end "ruleActionCommand"


    // $ANTLR start "entryRuleActionType"
    // InternalBrowserTest.g:801:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalBrowserTest.g:801:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalBrowserTest.g:802:2: iv_ruleActionType= ruleActionType EOF
            {
             newCompositeNode(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionType=ruleActionType();

            state._fsp--;

             current =iv_ruleActionType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalBrowserTest.g:808:1: ruleActionType returns [EObject current=null] : (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) ) | (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) ) | (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) ) ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_value_3_0 = null;

        EObject lv_text_5_0 = null;

        EObject lv_option_7_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:814:2: ( (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) ) | (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) ) | (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) ) ) )
            // InternalBrowserTest.g:815:2: (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) ) | (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) ) | (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) ) )
            {
            // InternalBrowserTest.g:815:2: (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) ) | (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) ) | (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBrowserTest.g:816:3: otherlv_0= '[CLICK]'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getActionTypeAccess().getCLICKKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:821:3: (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) )
                    {
                    // InternalBrowserTest.g:821:3: (otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) ) )
                    // InternalBrowserTest.g:822:4: otherlv_1= '[CHECK]' otherlv_2= '$' ( (lv_value_3_0= ruleBoolean ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionTypeAccess().getDollarSignKeyword_1_1());
                    			
                    // InternalBrowserTest.g:830:4: ( (lv_value_3_0= ruleBoolean ) )
                    // InternalBrowserTest.g:831:5: (lv_value_3_0= ruleBoolean )
                    {
                    // InternalBrowserTest.g:831:5: (lv_value_3_0= ruleBoolean )
                    // InternalBrowserTest.g:832:6: lv_value_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getValueBooleanEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:851:3: (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:851:3: (otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:852:4: otherlv_4= '[SET-TEXT]' ( (lv_text_5_0= ruleEntree ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0());
                    			
                    // InternalBrowserTest.g:856:4: ( (lv_text_5_0= ruleEntree ) )
                    // InternalBrowserTest.g:857:5: (lv_text_5_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:857:5: (lv_text_5_0= ruleEntree )
                    // InternalBrowserTest.g:858:6: lv_text_5_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getTextEntreeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_5_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:877:3: (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) )
                    {
                    // InternalBrowserTest.g:877:3: (otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) ) )
                    // InternalBrowserTest.g:878:4: otherlv_6= '[CHOOSE]' ( (lv_option_7_0= ruleEntree ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0());
                    			
                    // InternalBrowserTest.g:882:4: ( (lv_option_7_0= ruleEntree ) )
                    // InternalBrowserTest.g:883:5: (lv_option_7_0= ruleEntree )
                    {
                    // InternalBrowserTest.g:883:5: (lv_option_7_0= ruleEntree )
                    // InternalBrowserTest.g:884:6: lv_option_7_0= ruleEntree
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getOptionEntreeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_option_7_0=ruleEntree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"option",
                    							lv_option_7_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleTest"
    // InternalBrowserTest.g:906:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserTest.g:906:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserTest.g:907:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserTest.g:913:1: ruleTest returns [EObject current=null] : (otherlv_0= '[TEST]' ( (lv_var_1_0= ruleVariable ) ) ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:919:2: ( (otherlv_0= '[TEST]' ( (lv_var_1_0= ruleVariable ) ) ) )
            // InternalBrowserTest.g:920:2: (otherlv_0= '[TEST]' ( (lv_var_1_0= ruleVariable ) ) )
            {
            // InternalBrowserTest.g:920:2: (otherlv_0= '[TEST]' ( (lv_var_1_0= ruleVariable ) ) )
            // InternalBrowserTest.g:921:3: otherlv_0= '[TEST]' ( (lv_var_1_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTESTKeyword_0());
            		
            // InternalBrowserTest.g:925:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalBrowserTest.g:926:4: (lv_var_1_0= ruleVariable )
            {
            // InternalBrowserTest.g:926:4: (lv_var_1_0= ruleVariable )
            // InternalBrowserTest.g:927:5: lv_var_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getTestAccess().getVarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
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
    // $ANTLR end "ruleTest"


    // $ANTLR start "ruleType"
    // InternalBrowserTest.g:948:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) | (enumLiteral_6= 'CONTENT' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:954:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) | (enumLiteral_6= 'CONTENT' ) ) )
            // InternalBrowserTest.g:955:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) | (enumLiteral_6= 'CONTENT' ) )
            {
            // InternalBrowserTest.g:955:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) | (enumLiteral_6= 'CONTENT' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            case 36:
                {
                alt12=5;
                }
                break;
            case 37:
                {
                alt12=6;
                }
                break;
            case 38:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBrowserTest.g:956:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalBrowserTest.g:956:3: (enumLiteral_0= 'LINK' )
                    // InternalBrowserTest.g:957:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:964:3: (enumLiteral_1= 'INPUT' )
                    {
                    // InternalBrowserTest.g:964:3: (enumLiteral_1= 'INPUT' )
                    // InternalBrowserTest.g:965:4: enumLiteral_1= 'INPUT'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:972:3: (enumLiteral_2= 'TEXT' )
                    {
                    // InternalBrowserTest.g:972:3: (enumLiteral_2= 'TEXT' )
                    // InternalBrowserTest.g:973:4: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:980:3: (enumLiteral_3= 'CHECKBOX' )
                    {
                    // InternalBrowserTest.g:980:3: (enumLiteral_3= 'CHECKBOX' )
                    // InternalBrowserTest.g:981:4: enumLiteral_3= 'CHECKBOX'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:988:3: (enumLiteral_4= 'DIV' )
                    {
                    // InternalBrowserTest.g:988:3: (enumLiteral_4= 'DIV' )
                    // InternalBrowserTest.g:989:4: enumLiteral_4= 'DIV'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:996:3: (enumLiteral_5= 'TITLE' )
                    {
                    // InternalBrowserTest.g:996:3: (enumLiteral_5= 'TITLE' )
                    // InternalBrowserTest.g:997:4: enumLiteral_5= 'TITLE'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserTest.g:1004:3: (enumLiteral_6= 'CONTENT' )
                    {
                    // InternalBrowserTest.g:1004:3: (enumLiteral_6= 'CONTENT' )
                    // InternalBrowserTest.g:1005:4: enumLiteral_6= 'CONTENT'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleBoolean"
    // InternalBrowserTest.g:1015:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'FALSE' ) | (enumLiteral_1= 'TRUE' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:1021:2: ( ( (enumLiteral_0= 'FALSE' ) | (enumLiteral_1= 'TRUE' ) ) )
            // InternalBrowserTest.g:1022:2: ( (enumLiteral_0= 'FALSE' ) | (enumLiteral_1= 'TRUE' ) )
            {
            // InternalBrowserTest.g:1022:2: ( (enumLiteral_0= 'FALSE' ) | (enumLiteral_1= 'TRUE' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBrowserTest.g:1023:3: (enumLiteral_0= 'FALSE' )
                    {
                    // InternalBrowserTest.g:1023:3: (enumLiteral_0= 'FALSE' )
                    // InternalBrowserTest.g:1024:4: enumLiteral_0= 'FALSE'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:1031:3: (enumLiteral_1= 'TRUE' )
                    {
                    // InternalBrowserTest.g:1031:3: (enumLiteral_1= 'TRUE' )
                    // InternalBrowserTest.g:1032:4: enumLiteral_1= 'TRUE'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleAttribute"
    // InternalBrowserTest.g:1042:1: ruleAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TITLE' ) | (enumLiteral_2= 'CONTENT' ) ) ;
    public final Enumerator ruleAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:1048:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TITLE' ) | (enumLiteral_2= 'CONTENT' ) ) )
            // InternalBrowserTest.g:1049:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TITLE' ) | (enumLiteral_2= 'CONTENT' ) )
            {
            // InternalBrowserTest.g:1049:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TITLE' ) | (enumLiteral_2= 'CONTENT' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBrowserTest.g:1050:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalBrowserTest.g:1050:3: (enumLiteral_0= 'LINK' )
                    // InternalBrowserTest.g:1051:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:1058:3: (enumLiteral_1= 'TITLE' )
                    {
                    // InternalBrowserTest.g:1058:3: (enumLiteral_1= 'TITLE' )
                    // InternalBrowserTest.g:1059:4: enumLiteral_1= 'TITLE'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:1066:3: (enumLiteral_2= 'CONTENT' )
                    {
                    // InternalBrowserTest.g:1066:3: (enumLiteral_2= 'CONTENT' )
                    // InternalBrowserTest.g:1067:4: enumLiteral_2= 'CONTENT'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleAccessor"
    // InternalBrowserTest.g:1077:1: ruleAccessor returns [Enumerator current=null] : (enumLiteral_0= 'ALL' ) ;
    public final Enumerator ruleAccessor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:1083:2: ( (enumLiteral_0= 'ALL' ) )
            // InternalBrowserTest.g:1084:2: (enumLiteral_0= 'ALL' )
            {
            // InternalBrowserTest.g:1084:2: (enumLiteral_0= 'ALL' )
            // InternalBrowserTest.g:1085:3: enumLiteral_0= 'ALL'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

            			current = grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAccessor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000084003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FF0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006100000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002FF0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000078004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000000000L});

}