// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/pascal.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascalParser}.
 */
public interface pascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(@NotNull pascalParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(@NotNull pascalParser.StringtypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull pascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull pascalParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull pascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull pascalParser.CompoundStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull pascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull pascalParser.SignContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(@NotNull pascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(@NotNull pascalParser.ProcedureDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull pascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull pascalParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull pascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull pascalParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(@NotNull pascalParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(@NotNull pascalParser.FixedPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull pascalParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull pascalParser.EmptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(@NotNull pascalParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(@NotNull pascalParser.CaseListElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(@NotNull pascalParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(@NotNull pascalParser.VariantPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(@NotNull pascalParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(@NotNull pascalParser.TypeDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(@NotNull pascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(@NotNull pascalParser.ForListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(@NotNull pascalParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(@NotNull pascalParser.VariantContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(@NotNull pascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(@NotNull pascalParser.VariableDeclarationPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull pascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull pascalParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(@NotNull pascalParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(@NotNull pascalParser.ScalarTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(@NotNull pascalParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(@NotNull pascalParser.RecordSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull pascalParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull pascalParser.TagContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(@NotNull pascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(@NotNull pascalParser.FinalValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(@NotNull pascalParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(@NotNull pascalParser.ConstantChrContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(@NotNull pascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(@NotNull pascalParser.ResultTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull pascalParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull pascalParser.ElementListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(@NotNull pascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(@NotNull pascalParser.InitialValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull pascalParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull pascalParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(@NotNull pascalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(@NotNull pascalParser.SimpleTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(@NotNull pascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(@NotNull pascalParser.ConditionalStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull pascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull pascalParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull pascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull pascalParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(@NotNull pascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(@NotNull pascalParser.UnsignedNumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull pascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull pascalParser.ArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull pascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull pascalParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(@NotNull pascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(@NotNull pascalParser.RepeatStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(@NotNull pascalParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(@NotNull pascalParser.RecordVariableListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(@NotNull pascalParser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(@NotNull pascalParser.UsesUnitsPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull pascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull pascalParser.SimpleExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(@NotNull pascalParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(@NotNull pascalParser.GotoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(@NotNull pascalParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(@NotNull pascalParser.WithStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull pascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull pascalParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(@NotNull pascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(@NotNull pascalParser.ProcedureOrFunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(@NotNull pascalParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(@NotNull pascalParser.RepetetiveStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(@NotNull pascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(@NotNull pascalParser.ProcedureStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(@NotNull pascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(@NotNull pascalParser.ActualParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(@NotNull pascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(@NotNull pascalParser.ConstantDefinitionPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull pascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull pascalParser.TypeIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull pascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull pascalParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(@NotNull pascalParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(@NotNull pascalParser.UnsignedRealContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(@NotNull pascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(@NotNull pascalParser.StructuredStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(@NotNull pascalParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(@NotNull pascalParser.ProcedureTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull pascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull pascalParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(@NotNull pascalParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(@NotNull pascalParser.PointerTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(@NotNull pascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(@NotNull pascalParser.CaseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull pascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull pascalParser.AssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(@NotNull pascalParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(@NotNull pascalParser.SignedFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(@NotNull pascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(@NotNull pascalParser.ProcedureAndFunctionDeclarationPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull pascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull pascalParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(@NotNull pascalParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(@NotNull pascalParser.UnsignedIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(@NotNull pascalParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(@NotNull pascalParser.BaseTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(@NotNull pascalParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(@NotNull pascalParser.ProgramHeadingContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(@NotNull pascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(@NotNull pascalParser.ConstantDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull pascalParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull pascalParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(@NotNull pascalParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(@NotNull pascalParser.StructuredTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(@NotNull pascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(@NotNull pascalParser.FormalParameterSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(@NotNull pascalParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(@NotNull pascalParser.UnlabelledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull pascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull pascalParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull pascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull pascalParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull pascalParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull pascalParser.FunctionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull pascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull pascalParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(@NotNull pascalParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(@NotNull pascalParser.FieldListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(@NotNull pascalParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(@NotNull pascalParser.ComponentTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull pascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull pascalParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull pascalParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull pascalParser.SetContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(@NotNull pascalParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(@NotNull pascalParser.FunctionDesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(@NotNull pascalParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(@NotNull pascalParser.RecordTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull pascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull pascalParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull pascalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull pascalParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(@NotNull pascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(@NotNull pascalParser.TypeDefinitionPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(@NotNull pascalParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(@NotNull pascalParser.ConstListContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull pascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull pascalParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull pascalParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull pascalParser.SetTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(@NotNull pascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(@NotNull pascalParser.ParameterGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull pascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull pascalParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull pascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull pascalParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(@NotNull pascalParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(@NotNull pascalParser.IndexTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(@NotNull pascalParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(@NotNull pascalParser.SubrangeTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(@NotNull pascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(@NotNull pascalParser.SimpleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull pascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull pascalParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(@NotNull pascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(@NotNull pascalParser.LabelDeclarationPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(@NotNull pascalParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(@NotNull pascalParser.UnpackedStructuredTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull pascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull pascalParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(@NotNull pascalParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(@NotNull pascalParser.FileTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link pascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(@NotNull pascalParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(@NotNull pascalParser.UnsignedConstantContext ctx);
}