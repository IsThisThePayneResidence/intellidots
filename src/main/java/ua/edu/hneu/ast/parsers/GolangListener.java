// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/Golang.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GolangParser}.
 */
public interface GolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDecl(@NotNull GolangParser.ShortVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDecl(@NotNull GolangParser.ShortVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(@NotNull GolangParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(@NotNull GolangParser.TopLevelDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(@NotNull GolangParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(@NotNull GolangParser.EosContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull GolangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull GolangParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousField(@NotNull GolangParser.AnonymousFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousField(@NotNull GolangParser.AnonymousFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(@NotNull GolangParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(@NotNull GolangParser.LiteralTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(@NotNull GolangParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(@NotNull GolangParser.SliceContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull GolangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull GolangParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(@NotNull GolangParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(@NotNull GolangParser.ContinueStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull GolangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull GolangParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull GolangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull GolangParser.ArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull GolangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull GolangParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(@NotNull GolangParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(@NotNull GolangParser.ReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCase(@NotNull GolangParser.TypeSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCase(@NotNull GolangParser.TypeSwitchCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull GolangParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull GolangParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendStmt(@NotNull GolangParser.SendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendStmt(@NotNull GolangParser.SendStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(@NotNull GolangParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(@NotNull GolangParser.BasicLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(@NotNull GolangParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(@NotNull GolangParser.SimpleStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull GolangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull GolangParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(@NotNull GolangParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(@NotNull GolangParser.ReceiverTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(@NotNull GolangParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(@NotNull GolangParser.SliceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(@NotNull GolangParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(@NotNull GolangParser.SignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull GolangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull GolangParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(@NotNull GolangParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(@NotNull GolangParser.ImportDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(@NotNull GolangParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(@NotNull GolangParser.QualifiedIdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(@NotNull GolangParser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(@NotNull GolangParser.DeferStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull GolangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull GolangParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLit(@NotNull GolangParser.CompositeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLit(@NotNull GolangParser.CompositeLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(@NotNull GolangParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(@NotNull GolangParser.SwitchStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull GolangParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull GolangParser.ResultContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(@NotNull GolangParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(@NotNull GolangParser.UnaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull GolangParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull GolangParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 */
	void enterCommCase(@NotNull GolangParser.CommCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 */
	void exitCommCase(@NotNull GolangParser.CommCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(@NotNull GolangParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(@NotNull GolangParser.PrimaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(@NotNull GolangParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(@NotNull GolangParser.StructTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull GolangParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull GolangParser.FunctionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(@NotNull GolangParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(@NotNull GolangParser.KeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GolangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GolangParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLit(@NotNull GolangParser.FunctionLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLit(@NotNull GolangParser.FunctionLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchStmt(@NotNull GolangParser.ExprSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchStmt(@NotNull GolangParser.ExprSwitchStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(@NotNull GolangParser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(@NotNull GolangParser.GotoStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(@NotNull GolangParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(@NotNull GolangParser.MapTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(@NotNull GolangParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(@NotNull GolangParser.ConstDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull GolangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull GolangParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(@NotNull GolangParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(@NotNull GolangParser.TypeCaseClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(@NotNull GolangParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(@NotNull GolangParser.ConstSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(@NotNull GolangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(@NotNull GolangParser.IfStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull GolangParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull GolangParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull GolangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull GolangParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(@NotNull GolangParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(@NotNull GolangParser.ElementTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull GolangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull GolangParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void enterRecvStmt(@NotNull GolangParser.RecvStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void exitRecvStmt(@NotNull GolangParser.RecvStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStmt(@NotNull GolangParser.LabeledStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStmt(@NotNull GolangParser.LabeledStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseClause(@NotNull GolangParser.ExprCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseClause(@NotNull GolangParser.ExprCaseClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchStmt(@NotNull GolangParser.TypeSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchStmt(@NotNull GolangParser.TypeSwitchStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 */
	void enterChannelType(@NotNull GolangParser.ChannelTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 */
	void exitChannelType(@NotNull GolangParser.ChannelTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(@NotNull GolangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(@NotNull GolangParser.SourceFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(@NotNull GolangParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(@NotNull GolangParser.VarSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull GolangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull GolangParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull GolangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull GolangParser.StatementListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(@NotNull GolangParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(@NotNull GolangParser.MethodExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchGuard(@NotNull GolangParser.TypeSwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchGuard(@NotNull GolangParser.TypeSwitchGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(@NotNull GolangParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(@NotNull GolangParser.IncDecStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyedElement(@NotNull GolangParser.KeyedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyedElement(@NotNull GolangParser.KeyedElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull GolangParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull GolangParser.ElementListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(@NotNull GolangParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(@NotNull GolangParser.ForStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(@NotNull GolangParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(@NotNull GolangParser.FieldDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(@NotNull GolangParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(@NotNull GolangParser.ParameterDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(@NotNull GolangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(@NotNull GolangParser.ReturnStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(@NotNull GolangParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(@NotNull GolangParser.ImportSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(@NotNull GolangParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(@NotNull GolangParser.TypeDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull GolangParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull GolangParser.SelectStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(@NotNull GolangParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(@NotNull GolangParser.BreakStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull GolangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull GolangParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(@NotNull GolangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(@NotNull GolangParser.TypeSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(@NotNull GolangParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(@NotNull GolangParser.Assign_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull GolangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull GolangParser.ParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(@NotNull GolangParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(@NotNull GolangParser.LiteralValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(@NotNull GolangParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(@NotNull GolangParser.ImportPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull GolangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull GolangParser.FunctionDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(@NotNull GolangParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(@NotNull GolangParser.TypeAssertionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void enterPackageClause(@NotNull GolangParser.PackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void exitPackageClause(@NotNull GolangParser.PackageClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(@NotNull GolangParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(@NotNull GolangParser.PointerTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull GolangParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull GolangParser.MethodDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchCase(@NotNull GolangParser.ExprSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchCase(@NotNull GolangParser.ExprSwitchCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStmt(@NotNull GolangParser.FallthroughStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStmt(@NotNull GolangParser.FallthroughStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(@NotNull GolangParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(@NotNull GolangParser.InterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoStmt(@NotNull GolangParser.GoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoStmt(@NotNull GolangParser.GoStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GolangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GolangParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull GolangParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull GolangParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(@NotNull GolangParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(@NotNull GolangParser.TypeLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(@NotNull GolangParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(@NotNull GolangParser.MethodSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(@NotNull GolangParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(@NotNull GolangParser.OperandNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(@NotNull GolangParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(@NotNull GolangParser.ConversionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull GolangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull GolangParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(@NotNull GolangParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(@NotNull GolangParser.ExpressionStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(@NotNull GolangParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(@NotNull GolangParser.ArrayLengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 */
	void enterCommClause(@NotNull GolangParser.CommClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 */
	void exitCommClause(@NotNull GolangParser.CommClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(@NotNull GolangParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(@NotNull GolangParser.RangeClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull GolangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull GolangParser.ArgumentsContext ctx);
}