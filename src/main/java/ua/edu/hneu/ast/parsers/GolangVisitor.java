// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/Golang.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GolangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GolangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVarDecl(@NotNull GolangParser.ShortVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDecl(@NotNull GolangParser.TopLevelDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(@NotNull GolangParser.EosContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GolangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousField(@NotNull GolangParser.AnonymousFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralType(@NotNull GolangParser.LiteralTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(@NotNull GolangParser.SliceContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull GolangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(@NotNull GolangParser.ContinueStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull GolangParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull GolangParser.ArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull GolangParser.IdentifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(@NotNull GolangParser.ReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchCase(@NotNull GolangParser.TypeSwitchCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull GolangParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStmt(@NotNull GolangParser.SendStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(@NotNull GolangParser.BasicLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(@NotNull GolangParser.SimpleStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull GolangParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(@NotNull GolangParser.ReceiverTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(@NotNull GolangParser.SliceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(@NotNull GolangParser.SignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull GolangParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(@NotNull GolangParser.ImportDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(@NotNull GolangParser.QualifiedIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStmt(@NotNull GolangParser.DeferStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull GolangParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLit(@NotNull GolangParser.CompositeLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(@NotNull GolangParser.SwitchStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull GolangParser.ResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(@NotNull GolangParser.UnaryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull GolangParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommCase(@NotNull GolangParser.CommCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(@NotNull GolangParser.PrimaryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(@NotNull GolangParser.StructTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(@NotNull GolangParser.FunctionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(@NotNull GolangParser.KeyContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull GolangParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLit(@NotNull GolangParser.FunctionLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchStmt(@NotNull GolangParser.ExprSwitchStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(@NotNull GolangParser.GotoStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(@NotNull GolangParser.MapTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(@NotNull GolangParser.ConstDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull GolangParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClause(@NotNull GolangParser.TypeCaseClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(@NotNull GolangParser.ConstSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(@NotNull GolangParser.IfStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull GolangParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull GolangParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(@NotNull GolangParser.ElementTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull GolangParser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecvStmt(@NotNull GolangParser.RecvStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(@NotNull GolangParser.LabeledStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseClause(@NotNull GolangParser.ExprCaseClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchStmt(@NotNull GolangParser.TypeSwitchStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelType(@NotNull GolangParser.ChannelTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(@NotNull GolangParser.SourceFileContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(@NotNull GolangParser.VarSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull GolangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull GolangParser.StatementListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpr(@NotNull GolangParser.MethodExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchGuard(@NotNull GolangParser.TypeSwitchGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(@NotNull GolangParser.IncDecStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedElement(@NotNull GolangParser.KeyedElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(@NotNull GolangParser.ElementListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(@NotNull GolangParser.ForStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(@NotNull GolangParser.FieldDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(@NotNull GolangParser.ParameterDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(@NotNull GolangParser.ReturnStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(@NotNull GolangParser.ImportSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(@NotNull GolangParser.TypeDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull GolangParser.SelectStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(@NotNull GolangParser.BreakStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull GolangParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(@NotNull GolangParser.TypeSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(@NotNull GolangParser.Assign_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull GolangParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(@NotNull GolangParser.LiteralValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(@NotNull GolangParser.ImportPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(@NotNull GolangParser.FunctionDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertion(@NotNull GolangParser.TypeAssertionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageClause(@NotNull GolangParser.PackageClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(@NotNull GolangParser.PointerTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(@NotNull GolangParser.MethodDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchCase(@NotNull GolangParser.ExprSwitchCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthroughStmt(@NotNull GolangParser.FallthroughStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(@NotNull GolangParser.InterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoStmt(@NotNull GolangParser.GoStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull GolangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull GolangParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(@NotNull GolangParser.TypeLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(@NotNull GolangParser.MethodSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandName(@NotNull GolangParser.OperandNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(@NotNull GolangParser.ConversionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull GolangParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(@NotNull GolangParser.ExpressionStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(@NotNull GolangParser.ArrayLengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommClause(@NotNull GolangParser.CommClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(@NotNull GolangParser.RangeClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull GolangParser.ArgumentsContext ctx);
}