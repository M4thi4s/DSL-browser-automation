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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[TASK]'", "'[GOTO]'", "'[SELECT]'", "'$'", "'[CONTENT]'", "'[TYPE]'", "'[LABEL]'", "'[NAME]'", "'[VALUE]'", "'[ALT]'", "'[PARENT]'", "'{'", "'}'", "'[NTH-CHILD]'", "'[ACTION]'", "'[CLICK]'", "'[CHECK]'", "'[SET-TEXT]'", "'[CHOOSE]'", "'[TEST]'", "'LINK'", "'INPUT'", "'TEXT'", "'CHECKBOX'", "'DIV'", "'TITLE'"
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
    // InternalBrowserTest.g:108:1: ruleTask returns [EObject current=null] : (otherlv_0= '[TASK]' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:114:2: ( (otherlv_0= '[TASK]' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleAction ) )* ) )
            // InternalBrowserTest.g:115:2: (otherlv_0= '[TASK]' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleAction ) )* )
            {
            // InternalBrowserTest.g:115:2: (otherlv_0= '[TASK]' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleAction ) )* )
            // InternalBrowserTest.g:116:3: otherlv_0= '[TASK]' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTASKKeyword_0());
            		
            // InternalBrowserTest.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrowserTest.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrowserTest.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalBrowserTest.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBrowserTest.g:138:3: ( (lv_actions_2_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)||LA2_0==25||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBrowserTest.g:139:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalBrowserTest.g:139:4: (lv_actions_2_0= ruleAction )
            	    // InternalBrowserTest.g:140:5: lv_actions_2_0= ruleAction
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
            	    break loop2;
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
    // InternalBrowserTest.g:161:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserTest.g:161:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserTest.g:162:2: iv_ruleAction= ruleAction EOF
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
    // InternalBrowserTest.g:168:1: ruleAction returns [EObject current=null] : (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GoTo_0 = null;

        EObject this_Select_1 = null;

        EObject this_ActionCommand_2 = null;

        EObject this_Test_3 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:174:2: ( (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest ) )
            // InternalBrowserTest.g:175:2: (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest )
            {
            // InternalBrowserTest.g:175:2: (this_GoTo_0= ruleGoTo | this_Select_1= ruleSelect | this_ActionCommand_2= ruleActionCommand | this_Test_3= ruleTest )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 30:
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
                    // InternalBrowserTest.g:176:3: this_GoTo_0= ruleGoTo
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
                    // InternalBrowserTest.g:185:3: this_Select_1= ruleSelect
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
                    // InternalBrowserTest.g:194:3: this_ActionCommand_2= ruleActionCommand
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
                    // InternalBrowserTest.g:203:3: this_Test_3= ruleTest
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
    // InternalBrowserTest.g:215:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalBrowserTest.g:215:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalBrowserTest.g:216:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalBrowserTest.g:222:1: ruleGoTo returns [EObject current=null] : (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:228:2: ( (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserTest.g:229:2: (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserTest.g:229:2: (otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserTest.g:230:3: otherlv_0= '[GOTO]' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
            		
            // InternalBrowserTest.g:234:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserTest.g:235:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserTest.g:235:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserTest.g:236:5: lv_url_1_0= RULE_STRING
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
    // InternalBrowserTest.g:256:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalBrowserTest.g:256:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalBrowserTest.g:257:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalBrowserTest.g:263:1: ruleSelect returns [EObject current=null] : (otherlv_0= '[SELECT]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleProperty ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:269:2: ( (otherlv_0= '[SELECT]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleProperty ) )* ) )
            // InternalBrowserTest.g:270:2: (otherlv_0= '[SELECT]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleProperty ) )* )
            {
            // InternalBrowserTest.g:270:2: (otherlv_0= '[SELECT]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleProperty ) )* )
            // InternalBrowserTest.g:271:3: otherlv_0= '[SELECT]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleProperty ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getDollarSignKeyword_1());
            		
            // InternalBrowserTest.g:279:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBrowserTest.g:280:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBrowserTest.g:280:4: (lv_name_2_0= RULE_ID )
            // InternalBrowserTest.g:281:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBrowserTest.g:297:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=21)||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBrowserTest.g:298:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalBrowserTest.g:298:4: (lv_properties_3_0= ruleProperty )
            	    // InternalBrowserTest.g:299:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.browserautomation.mydsl.BrowserTest.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleProperty"
    // InternalBrowserTest.g:320:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBrowserTest.g:320:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBrowserTest.g:321:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBrowserTest.g:327:1: ruleProperty returns [EObject current=null] : ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) ) | (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) ) | (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) ) | (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) ) | (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) ) | (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) ) | (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' ) | (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token lv_alt_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_child_18_0=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_subProperties_15_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:333:2: ( ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) ) | (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) ) | (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) ) | (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) ) | (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) ) | (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) ) | (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' ) | (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) ) ) )
            // InternalBrowserTest.g:334:2: ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) ) | (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) ) | (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) ) | (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) ) | (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) ) | (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) ) | (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' ) | (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) ) )
            {
            // InternalBrowserTest.g:334:2: ( (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) ) | (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) ) | (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) ) | (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) ) | (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) ) | (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) ) | (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' ) | (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 24:
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
                    // InternalBrowserTest.g:335:3: (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:335:3: (otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:336:4: otherlv_0= '[CONTENT]' ( (lv_content_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0());
                    			
                    // InternalBrowserTest.g:340:4: ( (lv_content_1_0= RULE_STRING ) )
                    // InternalBrowserTest.g:341:5: (lv_content_1_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:341:5: (lv_content_1_0= RULE_STRING )
                    // InternalBrowserTest.g:342:6: lv_content_1_0= RULE_STRING
                    {
                    lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_content_1_0, grammarAccess.getPropertyAccess().getContentSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:360:3: (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) )
                    {
                    // InternalBrowserTest.g:360:3: (otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) ) )
                    // InternalBrowserTest.g:361:4: otherlv_2= '[TYPE]' otherlv_3= '$' ( (lv_type_4_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getTYPEKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDollarSignKeyword_1_1());
                    			
                    // InternalBrowserTest.g:369:4: ( (lv_type_4_0= ruleType ) )
                    // InternalBrowserTest.g:370:5: (lv_type_4_0= ruleType )
                    {
                    // InternalBrowserTest.g:370:5: (lv_type_4_0= ruleType )
                    // InternalBrowserTest.g:371:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.browserautomation.mydsl.BrowserTest.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:390:3: (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:390:3: (otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:391:4: otherlv_5= '[LABEL]' ( (lv_label_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getLABELKeyword_2_0());
                    			
                    // InternalBrowserTest.g:395:4: ( (lv_label_6_0= RULE_STRING ) )
                    // InternalBrowserTest.g:396:5: (lv_label_6_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:396:5: (lv_label_6_0= RULE_STRING )
                    // InternalBrowserTest.g:397:6: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_label_6_0, grammarAccess.getPropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:415:3: (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:415:3: (otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:416:4: otherlv_7= '[NAME]' ( (lv_name_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getNAMEKeyword_3_0());
                    			
                    // InternalBrowserTest.g:420:4: ( (lv_name_8_0= RULE_STRING ) )
                    // InternalBrowserTest.g:421:5: (lv_name_8_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:421:5: (lv_name_8_0= RULE_STRING )
                    // InternalBrowserTest.g:422:6: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:440:3: (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:440:3: (otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:441:4: otherlv_9= '[VALUE]' ( (lv_value_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getVALUEKeyword_4_0());
                    			
                    // InternalBrowserTest.g:445:4: ( (lv_value_10_0= RULE_STRING ) )
                    // InternalBrowserTest.g:446:5: (lv_value_10_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:446:5: (lv_value_10_0= RULE_STRING )
                    // InternalBrowserTest.g:447:6: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_10_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:465:3: (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:465:3: (otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:466:4: otherlv_11= '[ALT]' ( (lv_alt_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getALTKeyword_5_0());
                    			
                    // InternalBrowserTest.g:470:4: ( (lv_alt_12_0= RULE_STRING ) )
                    // InternalBrowserTest.g:471:5: (lv_alt_12_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:471:5: (lv_alt_12_0= RULE_STRING )
                    // InternalBrowserTest.g:472:6: lv_alt_12_0= RULE_STRING
                    {
                    lv_alt_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_alt_12_0, grammarAccess.getPropertyAccess().getAltSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alt",
                    							lv_alt_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserTest.g:490:3: (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' )
                    {
                    // InternalBrowserTest.g:490:3: (otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}' )
                    // InternalBrowserTest.g:491:4: otherlv_13= '[PARENT]' otherlv_14= '{' ( (lv_subProperties_15_0= ruleProperty ) )* otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getPARENTKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBrowserTest.g:499:4: ( (lv_subProperties_15_0= ruleProperty ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=15 && LA5_0<=21)||LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBrowserTest.g:500:5: (lv_subProperties_15_0= ruleProperty )
                    	    {
                    	    // InternalBrowserTest.g:500:5: (lv_subProperties_15_0= ruleProperty )
                    	    // InternalBrowserTest.g:501:6: lv_subProperties_15_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_subProperties_15_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subProperties",
                    	    							lv_subProperties_15_0,
                    	    							"org.xtext.browserautomation.mydsl.BrowserTest.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserTest.g:524:3: (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) )
                    {
                    // InternalBrowserTest.g:524:3: (otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) ) )
                    // InternalBrowserTest.g:525:4: otherlv_17= '[NTH-CHILD]' ( (lv_child_18_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getPropertyAccess().getNTHCHILDKeyword_7_0());
                    			
                    // InternalBrowserTest.g:529:4: ( (lv_child_18_0= RULE_INT ) )
                    // InternalBrowserTest.g:530:5: (lv_child_18_0= RULE_INT )
                    {
                    // InternalBrowserTest.g:530:5: (lv_child_18_0= RULE_INT )
                    // InternalBrowserTest.g:531:6: lv_child_18_0= RULE_INT
                    {
                    lv_child_18_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_child_18_0, grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"child",
                    							lv_child_18_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleActionCommand"
    // InternalBrowserTest.g:552:1: entryRuleActionCommand returns [EObject current=null] : iv_ruleActionCommand= ruleActionCommand EOF ;
    public final EObject entryRuleActionCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionCommand = null;


        try {
            // InternalBrowserTest.g:552:54: (iv_ruleActionCommand= ruleActionCommand EOF )
            // InternalBrowserTest.g:553:2: iv_ruleActionCommand= ruleActionCommand EOF
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
    // InternalBrowserTest.g:559:1: ruleActionCommand returns [EObject current=null] : (otherlv_0= '[ACTION]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )+ ( (lv_command_3_0= ruleActionType ) ) ) ;
    public final EObject ruleActionCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserTest.g:565:2: ( (otherlv_0= '[ACTION]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )+ ( (lv_command_3_0= ruleActionType ) ) ) )
            // InternalBrowserTest.g:566:2: (otherlv_0= '[ACTION]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )+ ( (lv_command_3_0= ruleActionType ) ) )
            {
            // InternalBrowserTest.g:566:2: (otherlv_0= '[ACTION]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )+ ( (lv_command_3_0= ruleActionType ) ) )
            // InternalBrowserTest.g:567:3: otherlv_0= '[ACTION]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )+ ( (lv_command_3_0= ruleActionType ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActionCommandAccess().getACTIONKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionCommandAccess().getDollarSignKeyword_1());
            		
            // InternalBrowserTest.g:575:3: ( (lv_name_2_0= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBrowserTest.g:576:4: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalBrowserTest.g:576:4: (lv_name_2_0= RULE_ID )
            	    // InternalBrowserTest.g:577:5: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    					newLeafNode(lv_name_2_0, grammarAccess.getActionCommandAccess().getNameIDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActionCommandRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"name",
            	    						lv_name_2_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


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

            // InternalBrowserTest.g:593:3: ( (lv_command_3_0= ruleActionType ) )
            // InternalBrowserTest.g:594:4: (lv_command_3_0= ruleActionType )
            {
            // InternalBrowserTest.g:594:4: (lv_command_3_0= ruleActionType )
            // InternalBrowserTest.g:595:5: lv_command_3_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_command_3_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_3_0,
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
    // InternalBrowserTest.g:616:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalBrowserTest.g:616:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalBrowserTest.g:617:2: iv_ruleActionType= ruleActionType EOF
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
    // InternalBrowserTest.g:623:1: ruleActionType returns [EObject current=null] : (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) ) | (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) ) | (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_argument_2_0=null;
        Token otherlv_3=null;
        Token lv_argument_4_0=null;
        Token otherlv_5=null;
        Token lv_argument_6_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:629:2: ( (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) ) | (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) ) | (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) ) ) )
            // InternalBrowserTest.g:630:2: (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) ) | (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) ) | (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) ) )
            {
            // InternalBrowserTest.g:630:2: (otherlv_0= '[CLICK]' | (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) ) | (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) ) | (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserTest.g:631:3: otherlv_0= '[CLICK]'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getActionTypeAccess().getCLICKKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:636:3: (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:636:3: (otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:637:4: otherlv_1= '[CHECK]' ( (lv_argument_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0());
                    			
                    // InternalBrowserTest.g:641:4: ( (lv_argument_2_0= RULE_STRING ) )
                    // InternalBrowserTest.g:642:5: (lv_argument_2_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:642:5: (lv_argument_2_0= RULE_STRING )
                    // InternalBrowserTest.g:643:6: lv_argument_2_0= RULE_STRING
                    {
                    lv_argument_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_argument_2_0, grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"argument",
                    							lv_argument_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:661:3: (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:661:3: (otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:662:4: otherlv_3= '[SET-TEXT]' ( (lv_argument_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0());
                    			
                    // InternalBrowserTest.g:666:4: ( (lv_argument_4_0= RULE_STRING ) )
                    // InternalBrowserTest.g:667:5: (lv_argument_4_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:667:5: (lv_argument_4_0= RULE_STRING )
                    // InternalBrowserTest.g:668:6: lv_argument_4_0= RULE_STRING
                    {
                    lv_argument_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_argument_4_0, grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"argument",
                    							lv_argument_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:686:3: (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserTest.g:686:3: (otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) ) )
                    // InternalBrowserTest.g:687:4: otherlv_5= '[CHOOSE]' ( (lv_argument_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0());
                    			
                    // InternalBrowserTest.g:691:4: ( (lv_argument_6_0= RULE_STRING ) )
                    // InternalBrowserTest.g:692:5: (lv_argument_6_0= RULE_STRING )
                    {
                    // InternalBrowserTest.g:692:5: (lv_argument_6_0= RULE_STRING )
                    // InternalBrowserTest.g:693:6: lv_argument_6_0= RULE_STRING
                    {
                    lv_argument_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_argument_6_0, grammarAccess.getActionTypeAccess().getArgumentSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"argument",
                    							lv_argument_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalBrowserTest.g:714:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserTest.g:714:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserTest.g:715:2: iv_ruleTest= ruleTest EOF
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
    // InternalBrowserTest.g:721:1: ruleTest returns [EObject current=null] : (otherlv_0= '[TEST]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:727:2: ( (otherlv_0= '[TEST]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBrowserTest.g:728:2: (otherlv_0= '[TEST]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBrowserTest.g:728:2: (otherlv_0= '[TEST]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBrowserTest.g:729:3: otherlv_0= '[TEST]' otherlv_1= '$' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTESTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getDollarSignKeyword_1());
            		
            // InternalBrowserTest.g:737:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBrowserTest.g:738:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBrowserTest.g:738:4: (lv_name_2_0= RULE_ID )
            // InternalBrowserTest.g:739:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleTest"


    // $ANTLR start "ruleType"
    // InternalBrowserTest.g:759:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalBrowserTest.g:765:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) ) )
            // InternalBrowserTest.g:766:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) )
            {
            // InternalBrowserTest.g:766:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'INPUT' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'CHECKBOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'TITLE' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            case 36:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBrowserTest.g:767:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalBrowserTest.g:767:3: (enumLiteral_0= 'LINK' )
                    // InternalBrowserTest.g:768:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserTest.g:775:3: (enumLiteral_1= 'INPUT' )
                    {
                    // InternalBrowserTest.g:775:3: (enumLiteral_1= 'INPUT' )
                    // InternalBrowserTest.g:776:4: enumLiteral_1= 'INPUT'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserTest.g:783:3: (enumLiteral_2= 'TEXT' )
                    {
                    // InternalBrowserTest.g:783:3: (enumLiteral_2= 'TEXT' )
                    // InternalBrowserTest.g:784:4: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserTest.g:791:3: (enumLiteral_3= 'CHECKBOX' )
                    {
                    // InternalBrowserTest.g:791:3: (enumLiteral_3= 'CHECKBOX' )
                    // InternalBrowserTest.g:792:4: enumLiteral_3= 'CHECKBOX'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserTest.g:799:3: (enumLiteral_4= 'DIV' )
                    {
                    // InternalBrowserTest.g:799:3: (enumLiteral_4= 'DIV' )
                    // InternalBrowserTest.g:800:4: enumLiteral_4= 'DIV'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserTest.g:807:3: (enumLiteral_5= 'TITLE' )
                    {
                    // InternalBrowserTest.g:807:3: (enumLiteral_5= 'TITLE' )
                    // InternalBrowserTest.g:808:4: enumLiteral_5= 'TITLE'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000042003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000013F8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001BF8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003C000010L});

}