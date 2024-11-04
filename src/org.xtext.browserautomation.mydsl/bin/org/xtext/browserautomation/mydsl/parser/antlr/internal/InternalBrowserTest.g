/*
 * generated by Xtext 2.36.0
 */
grammar InternalBrowserTest;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.browserautomation.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTestFile
entryRuleTestFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestFileRule()); }
	iv_ruleTestFile=ruleTestFile
	{ $current=$iv_ruleTestFile.current; }
	EOF;

// Rule TestFile
ruleTestFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTestFileAccess().getTaskTaskParserRuleCall_0());
			}
			lv_task_0_0=ruleTask
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTestFileRule());
				}
				add(
					$current,
					"task",
					lv_task_0_0,
					"org.xtext.browserautomation.mydsl.BrowserTest.Task");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[TASK]'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTASKKeyword_0());
		}
		(
			(
				(
					lv_name_1_1=RULE_ID
					{
						newLeafNode(lv_name_1_1, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_1,
							"org.eclipse.xtext.common.Terminals.ID");
					}
					    |
					lv_name_1_2=RULE_STRING
					{
						newLeafNode(lv_name_1_2, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getGoToParserRuleCall_0());
		}
		this_GoTo_0=ruleGoTo
		{
			$current = $this_GoTo_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSelectParserRuleCall_1());
		}
		this_Select_1=ruleSelect
		{
			$current = $this_Select_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getActionCommandParserRuleCall_2());
		}
		this_ActionCommand_2=ruleActionCommand
		{
			$current = $this_ActionCommand_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getTestParserRuleCall_3());
		}
		this_Test_3=ruleTest
		{
			$current = $this_Test_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGoTo
entryRuleGoTo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoToRule()); }
	iv_ruleGoTo=ruleGoTo
	{ $current=$iv_ruleGoTo.current; }
	EOF;

// Rule GoTo
ruleGoTo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[GOTO]'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_STRING
				{
					newLeafNode(lv_url_1_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoToRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSelect
entryRuleSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleSelect=ruleSelect
	{ $current=$iv_ruleSelect.current; }
	EOF;

// Rule Select
ruleSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[SELECT]'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getVarVariableParserRuleCall_1_0());
				}
				lv_var_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"var",
						lv_var_1_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getPropertiesPropertyParserRuleCall_2_0());
				}
				lv_properties_2_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					add(
						$current,
						"properties",
						lv_properties_2_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='$'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEntree
entryRuleEntree returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntreeRule()); }
	iv_ruleEntree=ruleEntree
	{ $current=$iv_ruleEntree.current; }
	EOF;

// Rule Entree
ruleEntree returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEntreeAccess().getVarVariableParserRuleCall_0_0_0());
					}
					lv_var_0_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntreeRule());
						}
						set(
							$current,
							"var",
							lv_var_0_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1='.'
			{
				newLeafNode(otherlv_1, grammarAccess.getEntreeAccess().getFullStopKeyword_0_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getEntreeAccess().getParamAttributeEnumRuleCall_0_2_0_0());
						}
						lv_param_2_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntreeRule());
							}
							set(
								$current,
								"param",
								lv_param_2_0,
								"org.xtext.browserautomation.mydsl.BrowserTest.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						lv_untyped_3_0=RULE_ID
						{
							newLeafNode(lv_untyped_3_0, grammarAccess.getEntreeAccess().getUntypedIDTerminalRuleCall_0_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEntreeRule());
							}
							setWithLastConsumed(
								$current,
								"untyped",
								lv_untyped_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
		    |
		(
			(
				lv_string_4_0=RULE_STRING
				{
					newLeafNode(lv_string_4_0, grammarAccess.getEntreeAccess().getStringSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntreeRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			otherlv_5='$'
			{
				newLeafNode(otherlv_5, grammarAccess.getEntreeAccess().getDollarSignKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntreeAccess().getAccessorAccessorEnumRuleCall_2_1_0());
					}
					lv_accessor_6_0=ruleAccessor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntreeRule());
						}
						set(
							$current,
							"accessor",
							lv_accessor_6_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Accessor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='[CONTENT]'
			{
				newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getCONTENTKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getContentEntreeParserRuleCall_0_1_0());
					}
					lv_content_1_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"content",
							lv_content_1_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='[LABEL]'
			{
				newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLABELKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getLabelEntreeParserRuleCall_1_1_0());
					}
					lv_label_3_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"label",
							lv_label_3_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='[VALUE]'
			{
				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getVALUEKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getValueEntreeParserRuleCall_2_1_0());
					}
					lv_value_5_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='[ALT]'
			{
				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getALTKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getAltEntreeParserRuleCall_3_1_0());
					}
					lv_alt_7_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"alt",
							lv_alt_7_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_8='[TYPE]'
			{
				newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTYPEKeyword_4_0());
			}
			otherlv_9='$'
			{
				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getDollarSignKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_4_2_0());
					}
					lv_type_10_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"type",
							lv_type_10_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_11='[NAME]'
			{
				newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getNAMEKeyword_5_0());
			}
			(
				(
					lv_name_12_0=RULE_STRING
					{
						newLeafNode(lv_name_12_0, grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertyRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_13='[NTH-CHILD]'
			{
				newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getNTHCHILDKeyword_6_0());
			}
			(
				(
					lv_child_14_0=RULE_INT
					{
						newLeafNode(lv_child_14_0, grammarAccess.getPropertyAccess().getChildINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertyRule());
						}
						setWithLastConsumed(
							$current,
							"child",
							lv_child_14_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			otherlv_15='[PARENT]'
			{
				newLeafNode(otherlv_15, grammarAccess.getPropertyAccess().getPARENTKeyword_7_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesPropertyParserRuleCall_7_2_0());
					}
					lv_subProperties_17_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						add(
							$current,
							"subProperties",
							lv_subProperties_17_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7_3());
			}
		)
	)
;

// Entry rule entryRuleActionCommand
entryRuleActionCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionCommandRule()); }
	iv_ruleActionCommand=ruleActionCommand
	{ $current=$iv_ruleActionCommand.current; }
	EOF;

// Rule ActionCommand
ruleActionCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[ACTION]'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionCommandAccess().getACTIONKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionCommandAccess().getVarVariableParserRuleCall_1_0());
				}
				lv_var_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionCommandRule());
					}
					add(
						$current,
						"var",
						lv_var_1_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getActionCommandAccess().getCommandActionTypeParserRuleCall_2_0());
				}
				lv_command_2_0=ruleActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_2_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.ActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleActionType
entryRuleActionType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionTypeRule()); }
	iv_ruleActionType=ruleActionType
	{ $current=$iv_ruleActionType.current; }
	EOF;

// Rule ActionType
ruleActionType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[CLICK]'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionTypeAccess().getCLICKKeyword_0());
		}
		    |
		(
			otherlv_1='[CHECK]'
			{
				newLeafNode(otherlv_1, grammarAccess.getActionTypeAccess().getCHECKKeyword_1_0());
			}
			otherlv_2='$'
			{
				newLeafNode(otherlv_2, grammarAccess.getActionTypeAccess().getDollarSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionTypeAccess().getValueBooleanEnumRuleCall_1_2_0());
					}
					lv_value_3_0=ruleBoolean
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionTypeRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Boolean");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='[SET-TEXT]'
			{
				newLeafNode(otherlv_4, grammarAccess.getActionTypeAccess().getSETTEXTKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionTypeAccess().getTextEntreeParserRuleCall_2_1_0());
					}
					lv_text_5_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionTypeRule());
						}
						set(
							$current,
							"text",
							lv_text_5_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='[CHOOSE]'
			{
				newLeafNode(otherlv_6, grammarAccess.getActionTypeAccess().getCHOOSEKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionTypeAccess().getOptionEntreeParserRuleCall_3_1_0());
					}
					lv_option_7_0=ruleEntree
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionTypeRule());
						}
						set(
							$current,
							"option",
							lv_option_7_0,
							"org.xtext.browserautomation.mydsl.BrowserTest.Entree");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[TEST]'
		{
			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTESTKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getVarVariableParserRuleCall_1_0());
				}
				lv_var_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"var",
						lv_var_1_0,
						"org.xtext.browserautomation.mydsl.BrowserTest.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LINK'
			{
				$current = grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getLINKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='INPUT'
			{
				$current = grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINPUTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='TEXT'
			{
				$current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='CHECKBOX'
			{
				$current = grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='DIV'
			{
				$current = grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDIVEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='TITLE'
			{
				$current = grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getTITLEEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='CONTENT'
			{
				$current = grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getCONTENTEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule Boolean
ruleBoolean returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='FALSE'
			{
				$current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TRUE'
			{
				$current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Attribute
ruleAttribute returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LINK'
			{
				$current = grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getLINKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TITLE'
			{
				$current = grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CONTENT'
			{
				$current = grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getCONTENTEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Accessor
ruleAccessor returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='ALL'
		{
			$current = grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getAccessorAccess().getALLEnumLiteralDeclaration());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
