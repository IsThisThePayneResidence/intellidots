// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/CSharpParser.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSharpParser}.
 */
public interface CSharpParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSharpParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string(@NotNull CSharpParser.Interpolated_regular_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string(@NotNull CSharpParser.Interpolated_regular_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void enterInterface_base(@NotNull CSharpParser.Interface_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void exitInterface_base(@NotNull CSharpParser.Interface_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#foreschStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeschStatement(@NotNull CSharpParser.ForeschStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#foreschStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeschStatement(@NotNull CSharpParser.ForeschStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(@NotNull CSharpParser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(@NotNull CSharpParser.Local_variable_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void enterUnbound_type_name(@NotNull CSharpParser.Unbound_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void exitUnbound_type_name(@NotNull CSharpParser.Unbound_type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_catch_clause(@NotNull CSharpParser.General_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_catch_clause(@NotNull CSharpParser.General_catch_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_list(@NotNull CSharpParser.Interface_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_list(@NotNull CSharpParser.Interface_type_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVariance_annotation(@NotNull CSharpParser.Variance_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVariance_annotation(@NotNull CSharpParser.Variance_annotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration(@NotNull CSharpParser.Indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration(@NotNull CSharpParser.Indexer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarators(@NotNull CSharpParser.Constant_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarators(@NotNull CSharpParser.Constant_declaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull CSharpParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull CSharpParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(@NotNull CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(@NotNull CSharpParser.All_member_modifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_constant_declaration(@NotNull CSharpParser.Local_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_constant_declaration(@NotNull CSharpParser.Local_constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_modifier(@NotNull CSharpParser.Parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_modifier(@NotNull CSharpParser.Parameter_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter_list(@NotNull CSharpParser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter_list(@NotNull CSharpParser.Variant_type_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(@NotNull CSharpParser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(@NotNull CSharpParser.Type_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(@NotNull CSharpParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(@NotNull CSharpParser.GotoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#isType}.
	 * @param ctx the parse tree
	 */
	void enterIsType(@NotNull CSharpParser.IsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#isType}.
	 * @param ctx the parse tree
	 */
	void exitIsType(@NotNull CSharpParser.IsTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(@NotNull CSharpParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(@NotNull CSharpParser.Formal_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(@NotNull CSharpParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(@NotNull CSharpParser.Query_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(@NotNull CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(@NotNull CSharpParser.Namespace_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void enterStruct_interfaces(@NotNull CSharpParser.Struct_interfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void exitStruct_interfaces(@NotNull CSharpParser.Struct_interfacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(@NotNull CSharpParser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(@NotNull CSharpParser.Switch_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(@NotNull CSharpParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(@NotNull CSharpParser.Explicit_anonymous_function_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_constraints(@NotNull CSharpParser.Secondary_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_constraints(@NotNull CSharpParser.Secondary_constraintsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(@NotNull CSharpParser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(@NotNull CSharpParser.Enum_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(@NotNull CSharpParser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(@NotNull CSharpParser.OrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(@NotNull CSharpParser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(@NotNull CSharpParser.Member_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull CSharpParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull CSharpParser.Boolean_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull CSharpParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull CSharpParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#usingStaticDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingStaticDirective(@NotNull CSharpParser.UsingStaticDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#usingStaticDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingStaticDirective(@NotNull CSharpParser.UsingStaticDirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull CSharpParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(@NotNull CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(@NotNull CSharpParser.Null_coalescing_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull CSharpParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull CSharpParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(@NotNull CSharpParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(@NotNull CSharpParser.Base_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void enterException_filter(@NotNull CSharpParser.Exception_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void exitException_filter(@NotNull CSharpParser.Exception_filterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull CSharpParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(@NotNull CSharpParser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(@NotNull CSharpParser.Query_body_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_or_collection_initializer(@NotNull CSharpParser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_or_collection_initializer(@NotNull CSharpParser.Object_or_collection_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull CSharpParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull CSharpParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull CSharpParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull CSharpParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(@NotNull CSharpParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(@NotNull CSharpParser.If_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CSharpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CSharpParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(@NotNull CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(@NotNull CSharpParser.Fixed_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull CSharpParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull CSharpParser.ThrowStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEvent_accessor_declarations(@NotNull CSharpParser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEvent_accessor_declarations(@NotNull CSharpParser.Event_accessor_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void enterInterface_accessors(@NotNull CSharpParser.Interface_accessorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void exitInterface_accessors(@NotNull CSharpParser.Interface_accessorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(@NotNull CSharpParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(@NotNull CSharpParser.TypeofExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(@NotNull CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(@NotNull CSharpParser.Constructor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(@NotNull CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(@NotNull CSharpParser.Conditional_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_initializer(@NotNull CSharpParser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_initializer(@NotNull CSharpParser.Anonymous_object_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(@NotNull CSharpParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(@NotNull CSharpParser.Operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(@NotNull CSharpParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(@NotNull CSharpParser.Type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(@NotNull CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(@NotNull CSharpParser.Class_member_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(@NotNull CSharpParser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(@NotNull CSharpParser.All_member_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#checkedStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckedStatement(@NotNull CSharpParser.CheckedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#checkedStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckedStatement(@NotNull CSharpParser.CheckedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints(@NotNull CSharpParser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints(@NotNull CSharpParser.Type_parameter_constraintsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer(@NotNull CSharpParser.Element_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer(@NotNull CSharpParser.Element_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(@NotNull CSharpParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(@NotNull CSharpParser.Lambda_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(@NotNull CSharpParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(@NotNull CSharpParser.Let_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(@NotNull CSharpParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(@NotNull CSharpParser.Member_accessContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(@NotNull CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(@NotNull CSharpParser.Class_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull CSharpParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull CSharpParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#uncheckedStatement}.
	 * @param ctx the parse tree
	 */
	void enterUncheckedStatement(@NotNull CSharpParser.UncheckedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#uncheckedStatement}.
	 * @param ctx the parse tree
	 */
	void exitUncheckedStatement(@NotNull CSharpParser.UncheckedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(@NotNull CSharpParser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(@NotNull CSharpParser.Struct_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declaration(@NotNull CSharpParser.Interface_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declaration(@NotNull CSharpParser.Interface_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(@NotNull CSharpParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(@NotNull CSharpParser.Integral_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull CSharpParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull CSharpParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#memberAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(@NotNull CSharpParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#memberAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(@NotNull CSharpParser.MemberAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(@NotNull CSharpParser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(@NotNull CSharpParser.Enum_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull CSharpParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull CSharpParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull CSharpParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_argument}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument(@NotNull CSharpParser.Attribute_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_argument}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument(@NotNull CSharpParser.Attribute_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(@NotNull CSharpParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(@NotNull CSharpParser.YieldStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declarator(@NotNull CSharpParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declarator(@NotNull CSharpParser.Conversion_operator_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(@NotNull CSharpParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(@NotNull CSharpParser.Class_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_assignment_expression(@NotNull CSharpParser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_assignment_expression(@NotNull CSharpParser.Non_assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(@NotNull CSharpParser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(@NotNull CSharpParser.Using_directivesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clauses(@NotNull CSharpParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clauses(@NotNull CSharpParser.Type_parameter_constraints_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variant_type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter(@NotNull CSharpParser.Variant_type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variant_type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter(@NotNull CSharpParser.Variant_type_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void enterQualified_alias_member(@NotNull CSharpParser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void exitQualified_alias_member(@NotNull CSharpParser.Qualified_alias_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_constraint(@NotNull CSharpParser.Primary_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_constraint(@NotNull CSharpParser.Primary_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(@NotNull CSharpParser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(@NotNull CSharpParser.Method_member_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(@NotNull CSharpParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(@NotNull CSharpParser.DeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(@NotNull CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(@NotNull CSharpParser.Common_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#arg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArg_declaration(@NotNull CSharpParser.Arg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#arg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArg_declaration(@NotNull CSharpParser.Arg_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCollection_initializer(@NotNull CSharpParser.Collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCollection_initializer(@NotNull CSharpParser.Collection_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(@NotNull CSharpParser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(@NotNull CSharpParser.Variable_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(@NotNull CSharpParser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(@NotNull CSharpParser.Pointer_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_member_declaration(@NotNull CSharpParser.Typed_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_member_declaration(@NotNull CSharpParser.Typed_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(@NotNull CSharpParser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(@NotNull CSharpParser.Combined_join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(@NotNull CSharpParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(@NotNull CSharpParser.Predefined_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(@NotNull CSharpParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(@NotNull CSharpParser.Simple_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void enterResource_acquisition(@NotNull CSharpParser.Resource_acquisitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void exitResource_acquisition(@NotNull CSharpParser.Resource_acquisitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(@NotNull CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(@NotNull CSharpParser.Conditional_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interpolated_verbatium_string_part}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_verbatium_string_part(@NotNull CSharpParser.Interpolated_verbatium_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interpolated_verbatium_string_part}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_verbatium_string_part(@NotNull CSharpParser.Interpolated_verbatium_string_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void enterRight_arrow(@NotNull CSharpParser.Right_arrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void exitRight_arrow(@NotNull CSharpParser.Right_arrowContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(@NotNull CSharpParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(@NotNull CSharpParser.Array_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSet_accessor_declaration(@NotNull CSharpParser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSet_accessor_declaration(@NotNull CSharpParser.Set_accessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(@NotNull CSharpParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(@NotNull CSharpParser.Property_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter(@NotNull CSharpParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter(@NotNull CSharpParser.Explicit_anonymous_function_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRemove_accessor_declaration(@NotNull CSharpParser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRemove_accessor_declaration(@NotNull CSharpParser.Remove_accessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_dimension_specifier(@NotNull CSharpParser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_dimension_specifier(@NotNull CSharpParser.Generic_dimension_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull CSharpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull CSharpParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(@NotNull CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(@NotNull CSharpParser.Local_variable_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#parenthesisExpressions}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpressions(@NotNull CSharpParser.ParenthesisExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#parenthesisExpressions}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpressions(@NotNull CSharpParser.ParenthesisExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull CSharpParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull CSharpParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(@NotNull CSharpParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(@NotNull CSharpParser.Method_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(@NotNull CSharpParser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(@NotNull CSharpParser.Type_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(@NotNull CSharpParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(@NotNull CSharpParser.Interface_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(@NotNull CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(@NotNull CSharpParser.Namespace_member_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull CSharpParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull CSharpParser.Constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(@NotNull CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(@NotNull CSharpParser.Local_variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_body(@NotNull CSharpParser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_body(@NotNull CSharpParser.Anonymous_function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarator(@NotNull CSharpParser.Constant_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarator(@NotNull CSharpParser.Constant_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(@NotNull CSharpParser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(@NotNull CSharpParser.For_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(@NotNull CSharpParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(@NotNull CSharpParser.Struct_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clause(@NotNull CSharpParser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clause(@NotNull CSharpParser.Specific_catch_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CSharpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CSharpParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_initializer(@NotNull CSharpParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_initializer(@NotNull CSharpParser.Fixed_pointer_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarator(@NotNull CSharpParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarator(@NotNull CSharpParser.Fixed_pointer_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#thisReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisReferenceExpression(@NotNull CSharpParser.ThisReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#thisReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisReferenceExpression(@NotNull CSharpParser.ThisReferenceExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(@NotNull CSharpParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(@NotNull CSharpParser.Class_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_constraint(@NotNull CSharpParser.Constructor_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_constraint(@NotNull CSharpParser.Constructor_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#usingNamespaceDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingNamespaceDirective(@NotNull CSharpParser.UsingNamespaceDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#usingNamespaceDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingNamespaceDirective(@NotNull CSharpParser.UsingNamespaceDirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(@NotNull CSharpParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(@NotNull CSharpParser.Numeric_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull CSharpParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull CSharpParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CSharpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CSharpParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGet_accessor_declaration(@NotNull CSharpParser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGet_accessor_declaration(@NotNull CSharpParser.Get_accessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(@NotNull CSharpParser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(@NotNull CSharpParser.Overloadable_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull CSharpParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(@NotNull CSharpParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(@NotNull CSharpParser.LockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_declarations(@NotNull CSharpParser.Accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_declarations(@NotNull CSharpParser.Accessor_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull CSharpParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull CSharpParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(@NotNull CSharpParser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(@NotNull CSharpParser.Catch_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull CSharpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull CSharpParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#defaultValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueExpression(@NotNull CSharpParser.DefaultValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#defaultValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueExpression(@NotNull CSharpParser.DefaultValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string_part(@NotNull CSharpParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string_part(@NotNull CSharpParser.Interpolated_regular_string_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(@NotNull CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(@NotNull CSharpParser.Constructor_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(@NotNull CSharpParser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(@NotNull CSharpParser.Enum_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixedStatement}.
	 * @param ctx the parse tree
	 */
	void enterFixedStatement(@NotNull CSharpParser.FixedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixedStatement}.
	 * @param ctx the parse tree
	 */
	void exitFixedStatement(@NotNull CSharpParser.FixedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull CSharpParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarator(@NotNull CSharpParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarator(@NotNull CSharpParser.Fixed_size_buffer_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(@NotNull CSharpParser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(@NotNull CSharpParser.Member_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarators(@NotNull CSharpParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarators(@NotNull CSharpParser.Fixed_pointer_declaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_section(@NotNull CSharpParser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_section(@NotNull CSharpParser.Global_attribute_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#nameofExpression}.
	 * @param ctx the parse tree
	 */
	void enterNameofExpression(@NotNull CSharpParser.NameofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#nameofExpression}.
	 * @param ctx the parse tree
	 */
	void exitNameofExpression(@NotNull CSharpParser.NameofExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(@NotNull CSharpParser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(@NotNull CSharpParser.Object_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(@NotNull CSharpParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(@NotNull CSharpParser.Orderby_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#embeddedStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedStatement(@NotNull CSharpParser.EmbeddedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#embeddedStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedStatement(@NotNull CSharpParser.EmbeddedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(@NotNull CSharpParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(@NotNull CSharpParser.Finally_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(@NotNull CSharpParser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(@NotNull CSharpParser.Query_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(@NotNull CSharpParser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(@NotNull CSharpParser.Variable_declaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift_assignment(@NotNull CSharpParser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift_assignment(@NotNull CSharpParser.Right_shift_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(@NotNull CSharpParser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(@NotNull CSharpParser.Interface_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(@NotNull CSharpParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(@NotNull CSharpParser.Compilation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void enterParameter_array(@NotNull CSharpParser.Parameter_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void exitParameter_array(@NotNull CSharpParser.Parameter_arrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(@NotNull CSharpParser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(@NotNull CSharpParser.Variable_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull CSharpParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull CSharpParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer_unsafe(@NotNull CSharpParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer_unsafe(@NotNull CSharpParser.Local_variable_initializer_unsafeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAdd_accessor_declaration(@NotNull CSharpParser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAdd_accessor_declaration(@NotNull CSharpParser.Add_accessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(@NotNull CSharpParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(@NotNull CSharpParser.UsingStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(@NotNull CSharpParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(@NotNull CSharpParser.Statement_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string_expression(@NotNull CSharpParser.Interpolated_string_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string_expression(@NotNull CSharpParser.Interpolated_string_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_definition(@NotNull CSharpParser.Destructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_definition(@NotNull CSharpParser.Destructor_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(@NotNull CSharpParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(@NotNull CSharpParser.Field_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#unsafeStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnsafeStatement(@NotNull CSharpParser.UnsafeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#unsafeStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnsafeStatement(@NotNull CSharpParser.UnsafeStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull CSharpParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull CSharpParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(@NotNull CSharpParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(@NotNull CSharpParser.Class_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(@NotNull CSharpParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(@NotNull CSharpParser.Member_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(@NotNull CSharpParser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(@NotNull CSharpParser.Right_shiftContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#objectCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreationExpression(@NotNull CSharpParser.ObjectCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#objectCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreationExpression(@NotNull CSharpParser.ObjectCreationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(@NotNull CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(@NotNull CSharpParser.Attribute_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression(@NotNull CSharpParser.Object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression(@NotNull CSharpParser.Object_creation_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull CSharpParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull CSharpParser.DoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(@NotNull CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(@NotNull CSharpParser.Namespace_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull CSharpParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull CSharpParser.Attribute_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#interpolated_verbatium_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_verbatium_string(@NotNull CSharpParser.Interpolated_verbatium_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#interpolated_verbatium_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_verbatium_string(@NotNull CSharpParser.Interpolated_verbatium_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declaration(@NotNull CSharpParser.Enum_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declaration(@NotNull CSharpParser.Enum_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull CSharpParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull CSharpParser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull CSharpParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull CSharpParser.From_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull CSharpParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull CSharpParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull CSharpParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull CSharpParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull CSharpParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull CSharpParser.Return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull CSharpParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull CSharpParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull CSharpParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull CSharpParser.Where_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#literalAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralAccessExpression(@NotNull CSharpParser.LiteralAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#literalAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralAccessExpression(@NotNull CSharpParser.LiteralAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(@NotNull CSharpParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(@NotNull CSharpParser.Array_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(@NotNull CSharpParser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(@NotNull CSharpParser.Embedded_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#sizeofExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeofExpression(@NotNull CSharpParser.SizeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#sizeofExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeofExpression(@NotNull CSharpParser.SizeofExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull CSharpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull CSharpParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull CSharpParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull CSharpParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(@NotNull CSharpParser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(@NotNull CSharpParser.Class_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directives(@NotNull CSharpParser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directives(@NotNull CSharpParser.Extern_alias_directivesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_modifier(@NotNull CSharpParser.Accessor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_modifier(@NotNull CSharpParser.Accessor_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(@NotNull CSharpParser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(@NotNull CSharpParser.Initializer_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(@NotNull CSharpParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(@NotNull CSharpParser.Implicit_anonymous_function_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(@NotNull CSharpParser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(@NotNull CSharpParser.Select_or_group_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(@NotNull CSharpParser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(@NotNull CSharpParser.For_iteratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target(@NotNull CSharpParser.Global_attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target(@NotNull CSharpParser.Global_attribute_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull CSharpParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull CSharpParser.Method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(@NotNull CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(@NotNull CSharpParser.Member_initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#usingAliasDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingAliasDirective(@NotNull CSharpParser.UsingAliasDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#usingAliasDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingAliasDirective(@NotNull CSharpParser.UsingAliasDirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#anonymousMethodExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousMethodExpression(@NotNull CSharpParser.AnonymousMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#anonymousMethodExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousMethodExpression(@NotNull CSharpParser.AnonymousMethodExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clause(@NotNull CSharpParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clause(@NotNull CSharpParser.Type_parameter_constraints_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#indexer_argument}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_argument(@NotNull CSharpParser.Indexer_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#indexer_argument}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_argument(@NotNull CSharpParser.Indexer_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation(@NotNull CSharpParser.Method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation(@NotNull CSharpParser.Method_invocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(@NotNull CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(@NotNull CSharpParser.Floating_point_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull CSharpParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull CSharpParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull CSharpParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull CSharpParser.TryStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(@NotNull CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(@NotNull CSharpParser.Fixed_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#baseAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterBaseAccessExpression(@NotNull CSharpParser.BaseAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#baseAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitBaseAccessExpression(@NotNull CSharpParser.BaseAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull CSharpParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull CSharpParser.SwitchStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_definition(@NotNull CSharpParser.Delegate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_definition(@NotNull CSharpParser.Delegate_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(@NotNull CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(@NotNull CSharpParser.Namespace_or_type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(@NotNull CSharpParser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(@NotNull CSharpParser.Event_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(@NotNull CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(@NotNull CSharpParser.Bracket_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#simpleNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNameExpression(@NotNull CSharpParser.SimpleNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#simpleNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNameExpression(@NotNull CSharpParser.SimpleNameExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull CSharpParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull CSharpParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#checkedExpression}.
	 * @param ctx the parse tree
	 */
	void enterCheckedExpression(@NotNull CSharpParser.CheckedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#checkedExpression}.
	 * @param ctx the parse tree
	 */
	void exitCheckedExpression(@NotNull CSharpParser.CheckedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(@NotNull CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(@NotNull CSharpParser.Namespace_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(@NotNull CSharpParser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(@NotNull CSharpParser.Attribute_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(@NotNull CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(@NotNull CSharpParser.Qualified_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(@NotNull CSharpParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(@NotNull CSharpParser.Switch_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_signature(@NotNull CSharpParser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_signature(@NotNull CSharpParser.Anonymous_function_signatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(@NotNull CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(@NotNull CSharpParser.Type_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull CSharpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull CSharpParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(@NotNull CSharpParser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(@NotNull CSharpParser.Member_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(@NotNull CSharpParser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(@NotNull CSharpParser.Query_continuationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull CSharpParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull CSharpParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull CSharpParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull CSharpParser.String_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#uncheckedExpression}.
	 * @param ctx the parse tree
	 */
	void enterUncheckedExpression(@NotNull CSharpParser.UncheckedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#uncheckedExpression}.
	 * @param ctx the parse tree
	 */
	void exitUncheckedExpression(@NotNull CSharpParser.UncheckedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directive(@NotNull CSharpParser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directive(@NotNull CSharpParser.Extern_alias_directiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(@NotNull CSharpParser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(@NotNull CSharpParser.Struct_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_body(@NotNull CSharpParser.Accessor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_body(@NotNull CSharpParser.Accessor_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull CSharpParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull CSharpParser.ContinueStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull CSharpParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull CSharpParser.LiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSharpParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(@NotNull CSharpParser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(@NotNull CSharpParser.Rank_specifierContext ctx);
}