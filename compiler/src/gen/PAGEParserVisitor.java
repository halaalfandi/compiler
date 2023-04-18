// Generated from C:/Users/ESRAA/Downloads/Telegram Desktop/compoailer/src\PAGEParser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PAGEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PAGEParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PAGEParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(PAGEParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PAGEParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(PAGEParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#defination_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefination_page(PAGEParser.Defination_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#name_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_page(PAGEParser.Name_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PAGEParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(PAGEParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(PAGEParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(PAGEParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#inside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside(PAGEParser.InsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#pragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragraph(PAGEParser.PragraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PAGEParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(PAGEParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(PAGEParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#head_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead_table(PAGEParser.Head_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(PAGEParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(PAGEParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(PAGEParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(PAGEParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#type_IN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_IN(PAGEParser.Type_INContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(PAGEParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#type_OUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_OUT(PAGEParser.Type_OUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(PAGEParser.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#class_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_table(PAGEParser.Class_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PAGEParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#name_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_out(PAGEParser.Name_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(PAGEParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(PAGEParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#seesion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeesion(PAGEParser.SeesionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#array_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_s(PAGEParser.Array_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(PAGEParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#back_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack_end(PAGEParser.Back_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#defnation_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefnation_controller(PAGEParser.Defnation_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#name_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_controller(PAGEParser.Name_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#name_controller_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_controller_page(PAGEParser.Name_controller_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(PAGEParser.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#body_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_controller(PAGEParser.Body_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(PAGEParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PAGEParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(PAGEParser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#print_php}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_php(PAGEParser.Print_phpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PAGEParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#css_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_page(PAGEParser.Css_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#body_css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_css(PAGEParser.Body_cssContext ctx);
	/**
	 * Visit a parse tree produced by {@link PAGEParser#body_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_class(PAGEParser.Body_classContext ctx);
}