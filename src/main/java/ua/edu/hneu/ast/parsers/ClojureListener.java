// Generated from /mnt/hdd/Programming/Projects/Groovy/intellidots/src/main/antlr/Clojure.g4 by ANTLR 4.2.2
package ua.edu.hneu.ast.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
public interface ClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void enterBign(@NotNull ClojureParser.BignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void exitBign(@NotNull ClojureParser.BignContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(@NotNull ClojureParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(@NotNull ClojureParser.DiscardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull ClojureParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull ClojureParser.SymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(@NotNull ClojureParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(@NotNull ClojureParser.DerefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(@NotNull ClojureParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(@NotNull ClojureParser.DispatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull ClojureParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull ClojureParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull ClojureParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull ClojureParser.BinContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void enterSimple_sym(@NotNull ClojureParser.Simple_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void exitSimple_sym(@NotNull ClojureParser.Simple_symContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNs_symbol(@NotNull ClojureParser.Ns_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNs_symbol(@NotNull ClojureParser.Ns_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(@NotNull ClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(@NotNull ClojureParser.Var_quoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSimple_keyword(@NotNull ClojureParser.Simple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSimple_keyword(@NotNull ClojureParser.Simple_keywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ClojureParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ClojureParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void enterU_hex_quad(@NotNull ClojureParser.U_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void exitU_hex_quad(@NotNull ClojureParser.U_hex_quadContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(@NotNull ClojureParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(@NotNull ClojureParser.NilContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ClojureParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ClojureParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ClojureParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ClojureParser.LambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull ClojureParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull ClojureParser.CharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ClojureParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ClojureParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(@NotNull ClojureParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(@NotNull ClojureParser.QuoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void enterHost_expr(@NotNull ClojureParser.Host_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void exitHost_expr(@NotNull ClojureParser.Host_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void enterUnquote_splicing(@NotNull ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void exitUnquote_splicing(@NotNull ClojureParser.Unquote_splicingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(@NotNull ClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(@NotNull ClojureParser.Meta_dataContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void enterMacro_keyword(@NotNull ClojureParser.Macro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void exitMacro_keyword(@NotNull ClojureParser.Macro_keywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(@NotNull ClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(@NotNull ClojureParser.VectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(@NotNull ClojureParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(@NotNull ClojureParser.HexContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull ClojureParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull ClojureParser.TagContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterReader_macro(@NotNull ClojureParser.Reader_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitReader_macro(@NotNull ClojureParser.Reader_macroContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void enterNamed_char(@NotNull ClojureParser.Named_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void exitNamed_char(@NotNull ClojureParser.Named_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull ClojureParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull ClojureParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull ClojureParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull ClojureParser.MapContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void enterUnquote(@NotNull ClojureParser.UnquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void exitUnquote(@NotNull ClojureParser.UnquoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull ClojureParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull ClojureParser.SetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void enterAny_char(@NotNull ClojureParser.Any_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void exitAny_char(@NotNull ClojureParser.Any_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ClojureParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ClojureParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void enterGensym(@NotNull ClojureParser.GensymContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void exitGensym(@NotNull ClojureParser.GensymContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(@NotNull ClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(@NotNull ClojureParser.RegexContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(@NotNull ClojureParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(@NotNull ClojureParser.FormContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void enterBacktick(@NotNull ClojureParser.BacktickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void exitBacktick(@NotNull ClojureParser.BacktickContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(@NotNull ClojureParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(@NotNull ClojureParser.Param_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(@NotNull ClojureParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(@NotNull ClojureParser.FormsContext ctx);
}