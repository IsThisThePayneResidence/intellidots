// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/Scala.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScalaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScalaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScalaParser#patVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatVarDef(@NotNull ScalaParser.PatVarDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull ScalaParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#traitDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitDef(@NotNull ScalaParser.TraitDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTemplate(@NotNull ScalaParser.ClassTemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#valDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDcl(@NotNull ScalaParser.ValDclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(@NotNull ScalaParser.BindingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ScalaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#paramType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamType(@NotNull ScalaParser.ParamTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typeDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDcl(@NotNull ScalaParser.TypeDclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#refinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement(@NotNull ScalaParser.RefinementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ScalaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(@NotNull ScalaParser.Expr1Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#traitTemplateOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitTemplateOpt(@NotNull ScalaParser.TraitTemplateOptContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#stableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStableId(@NotNull ScalaParser.StableIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParam(@NotNull ScalaParser.ClassParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#selfInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfInvocation(@NotNull ScalaParser.SelfInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#refineStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefineStat(@NotNull ScalaParser.RefineStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(@NotNull ScalaParser.ClassDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#variantTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantTypeParam(@NotNull ScalaParser.VariantTypeParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#traitParents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitParents(@NotNull ScalaParser.TraitParentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull ScalaParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typePat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePat(@NotNull ScalaParser.TypePatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#existentialClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialClause(@NotNull ScalaParser.ExistentialClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassQualifier(@NotNull ScalaParser.ClassQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#templateStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStat(@NotNull ScalaParser.TemplateStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#tmplDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplDef(@NotNull ScalaParser.TmplDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(@NotNull ScalaParser.GuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#topStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStat(@NotNull ScalaParser.TopStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull ScalaParser.PatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#simpleExpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr1(@NotNull ScalaParser.SimpleExpr1Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(@NotNull ScalaParser.TypeDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ScalaParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#constr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr(@NotNull ScalaParser.ConstrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#resultExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExpr(@NotNull ScalaParser.ResultExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#argumentExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExprs(@NotNull ScalaParser.ArgumentExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#infixType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixType(@NotNull ScalaParser.InfixTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(@NotNull ScalaParser.PostfixExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#importSelectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSelectors(@NotNull ScalaParser.ImportSelectorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(@NotNull ScalaParser.CaseClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull ScalaParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#funSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunSig(@NotNull ScalaParser.FunSigContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#earlyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEarlyDef(@NotNull ScalaParser.EarlyDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParam(@NotNull ScalaParser.TypeParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#paramClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamClauses(@NotNull ScalaParser.ParamClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#objectDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDef(@NotNull ScalaParser.ObjectDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#annotType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotType(@NotNull ScalaParser.AnnotTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#paramClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamClause(@NotNull ScalaParser.ParamClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(@NotNull ScalaParser.CaseClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#funTypeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTypeParamClause(@NotNull ScalaParser.FunTypeParamClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#funDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDcl(@NotNull ScalaParser.FunDclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#simplePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePattern(@NotNull ScalaParser.SimplePatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#blockStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(@NotNull ScalaParser.BlockStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#functionArgTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgTypes(@NotNull ScalaParser.FunctionArgTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindings(@NotNull ScalaParser.BindingsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull ScalaParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classParamClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParamClauses(@NotNull ScalaParser.ClassParamClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgs(@NotNull ScalaParser.TypeArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(@NotNull ScalaParser.InfixExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(@NotNull ScalaParser.Import_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#importExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpr(@NotNull ScalaParser.ImportExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#importSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSelector(@NotNull ScalaParser.ImportSelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#constrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrExpr(@NotNull ScalaParser.ConstrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(@NotNull ScalaParser.SimpleTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#packageObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageObject(@NotNull ScalaParser.PackageObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classParents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParents(@NotNull ScalaParser.ClassParentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#ascription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscription(@NotNull ScalaParser.AscriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatterns(@NotNull ScalaParser.PatternsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#selfType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfType(@NotNull ScalaParser.SelfTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#prefixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(@NotNull ScalaParser.PrefixExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull ScalaParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#funDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDef(@NotNull ScalaParser.FunDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#qualId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualId(@NotNull ScalaParser.QualIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(@NotNull ScalaParser.IdsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(@NotNull ScalaParser.VarDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#varDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDcl(@NotNull ScalaParser.VarDclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerator(@NotNull ScalaParser.GeneratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#patDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatDef(@NotNull ScalaParser.PatDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(@NotNull ScalaParser.DclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#topStatSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStatSeq(@NotNull ScalaParser.TopStatSeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#compoundType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundType(@NotNull ScalaParser.CompoundTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classTemplateOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTemplateOpt(@NotNull ScalaParser.ClassTemplateOptContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#accessQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessQualifier(@NotNull ScalaParser.AccessQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#constrAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrAnnotation(@NotNull ScalaParser.ConstrAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(@NotNull ScalaParser.AccessModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull ScalaParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#constrBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrBlock(@NotNull ScalaParser.ConstrBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(@NotNull ScalaParser.ExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ScalaParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#blockExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(@NotNull ScalaParser.BlockExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParams(@NotNull ScalaParser.ClassParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(@NotNull ScalaParser.TypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#pattern1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern1(@NotNull ScalaParser.Pattern1Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#pattern2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern2(@NotNull ScalaParser.Pattern2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#pattern3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern3(@NotNull ScalaParser.Pattern3Context ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#packaging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackaging(@NotNull ScalaParser.PackagingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#traitTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitTemplate(@NotNull ScalaParser.TraitTemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#enumerators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerators(@NotNull ScalaParser.EnumeratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(@NotNull ScalaParser.TemplateBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#existentialDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialDcl(@NotNull ScalaParser.ExistentialDclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#localModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalModifier(@NotNull ScalaParser.LocalModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#classParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParamClause(@NotNull ScalaParser.ClassParamClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#earlyDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEarlyDefs(@NotNull ScalaParser.EarlyDefsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ScalaParser#typeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamClause(@NotNull ScalaParser.TypeParamClauseContext ctx);
}