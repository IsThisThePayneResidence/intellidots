// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/pascal.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pascalParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(@NotNull pascalParser.StringtypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull pascalParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(@NotNull pascalParser.CompoundStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull pascalParser.SignContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(@NotNull pascalParser.ProcedureDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull pascalParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull pascalParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(@NotNull pascalParser.FixedPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(@NotNull pascalParser.EmptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(@NotNull pascalParser.CaseListElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(@NotNull pascalParser.VariantPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(@NotNull pascalParser.TypeDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(@NotNull pascalParser.ForListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(@NotNull pascalParser.VariantContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(@NotNull pascalParser.VariableDeclarationPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull pascalParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(@NotNull pascalParser.ScalarTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(@NotNull pascalParser.RecordSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull pascalParser.TagContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(@NotNull pascalParser.FinalValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(@NotNull pascalParser.ConstantChrContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(@NotNull pascalParser.ResultTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(@NotNull pascalParser.ElementListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(@NotNull pascalParser.InitialValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull pascalParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(@NotNull pascalParser.SimpleTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(@NotNull pascalParser.ConditionalStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull pascalParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull pascalParser.EmptyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(@NotNull pascalParser.UnsignedNumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull pascalParser.ArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull pascalParser.IdentifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(@NotNull pascalParser.RepeatStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(@NotNull pascalParser.RecordVariableListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(@NotNull pascalParser.UsesUnitsPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(@NotNull pascalParser.SimpleExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(@NotNull pascalParser.GotoStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(@NotNull pascalParser.WithStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull pascalParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(@NotNull pascalParser.ProcedureOrFunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(@NotNull pascalParser.RepetetiveStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(@NotNull pascalParser.ProcedureStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(@NotNull pascalParser.ActualParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(@NotNull pascalParser.ConstantDefinitionPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(@NotNull pascalParser.TypeIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull pascalParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(@NotNull pascalParser.UnsignedRealContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(@NotNull pascalParser.StructuredStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(@NotNull pascalParser.ProcedureTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull pascalParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(@NotNull pascalParser.PointerTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(@NotNull pascalParser.CaseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(@NotNull pascalParser.AssignmentStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(@NotNull pascalParser.SignedFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(@NotNull pascalParser.ProcedureAndFunctionDeclarationPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull pascalParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(@NotNull pascalParser.UnsignedIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(@NotNull pascalParser.BaseTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(@NotNull pascalParser.ProgramHeadingContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(@NotNull pascalParser.ConstantDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull pascalParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(@NotNull pascalParser.StructuredTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(@NotNull pascalParser.FormalParameterSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(@NotNull pascalParser.UnlabelledStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull pascalParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull pascalParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(@NotNull pascalParser.FunctionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull pascalParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(@NotNull pascalParser.FieldListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(@NotNull pascalParser.ComponentTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull pascalParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull pascalParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(@NotNull pascalParser.FunctionDesignatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(@NotNull pascalParser.RecordTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull pascalParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull pascalParser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(@NotNull pascalParser.TypeDefinitionPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(@NotNull pascalParser.ConstListContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull pascalParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(@NotNull pascalParser.SetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(@NotNull pascalParser.ParameterGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull pascalParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull pascalParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(@NotNull pascalParser.IndexTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(@NotNull pascalParser.SubrangeTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(@NotNull pascalParser.SimpleStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull pascalParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(@NotNull pascalParser.LabelDeclarationPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(@NotNull pascalParser.UnpackedStructuredTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull pascalParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(@NotNull pascalParser.FileTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link pascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(@NotNull pascalParser.UnsignedConstantContext ctx);
}