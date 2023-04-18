// Generated from C:/Users/ESRAA/Downloads/Telegram Desktop/compoailer/src\PAGEParser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PAGEParser}.
 */
public interface PAGEParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PAGEParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(PAGEParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(PAGEParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PAGEParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PAGEParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(PAGEParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(PAGEParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#defination_page}.
	 * @param ctx the parse tree
	 */
	void enterDefination_page(PAGEParser.Defination_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#defination_page}.
	 * @param ctx the parse tree
	 */
	void exitDefination_page(PAGEParser.Defination_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#name_page}.
	 * @param ctx the parse tree
	 */
	void enterName_page(PAGEParser.Name_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#name_page}.
	 * @param ctx the parse tree
	 */
	void exitName_page(PAGEParser.Name_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PAGEParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PAGEParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(PAGEParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(PAGEParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(PAGEParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(PAGEParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(PAGEParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(PAGEParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#inside}.
	 * @param ctx the parse tree
	 */
	void enterInside(PAGEParser.InsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#inside}.
	 * @param ctx the parse tree
	 */
	void exitInside(PAGEParser.InsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#pragraph}.
	 * @param ctx the parse tree
	 */
	void enterPragraph(PAGEParser.PragraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#pragraph}.
	 * @param ctx the parse tree
	 */
	void exitPragraph(PAGEParser.PragraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PAGEParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PAGEParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(PAGEParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(PAGEParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(PAGEParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(PAGEParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#head_table}.
	 * @param ctx the parse tree
	 */
	void enterHead_table(PAGEParser.Head_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#head_table}.
	 * @param ctx the parse tree
	 */
	void exitHead_table(PAGEParser.Head_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(PAGEParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(PAGEParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(PAGEParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(PAGEParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(PAGEParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(PAGEParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(PAGEParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(PAGEParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#type_IN}.
	 * @param ctx the parse tree
	 */
	void enterType_IN(PAGEParser.Type_INContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#type_IN}.
	 * @param ctx the parse tree
	 */
	void exitType_IN(PAGEParser.Type_INContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(PAGEParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(PAGEParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#type_OUT}.
	 * @param ctx the parse tree
	 */
	void enterType_OUT(PAGEParser.Type_OUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#type_OUT}.
	 * @param ctx the parse tree
	 */
	void exitType_OUT(PAGEParser.Type_OUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(PAGEParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(PAGEParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#class_table}.
	 * @param ctx the parse tree
	 */
	void enterClass_table(PAGEParser.Class_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#class_table}.
	 * @param ctx the parse tree
	 */
	void exitClass_table(PAGEParser.Class_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PAGEParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PAGEParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#name_out}.
	 * @param ctx the parse tree
	 */
	void enterName_out(PAGEParser.Name_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#name_out}.
	 * @param ctx the parse tree
	 */
	void exitName_out(PAGEParser.Name_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(PAGEParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(PAGEParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(PAGEParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(PAGEParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#seesion}.
	 * @param ctx the parse tree
	 */
	void enterSeesion(PAGEParser.SeesionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#seesion}.
	 * @param ctx the parse tree
	 */
	void exitSeesion(PAGEParser.SeesionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#array_s}.
	 * @param ctx the parse tree
	 */
	void enterArray_s(PAGEParser.Array_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#array_s}.
	 * @param ctx the parse tree
	 */
	void exitArray_s(PAGEParser.Array_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(PAGEParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(PAGEParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#back_end}.
	 * @param ctx the parse tree
	 */
	void enterBack_end(PAGEParser.Back_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#back_end}.
	 * @param ctx the parse tree
	 */
	void exitBack_end(PAGEParser.Back_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#defnation_controller}.
	 * @param ctx the parse tree
	 */
	void enterDefnation_controller(PAGEParser.Defnation_controllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#defnation_controller}.
	 * @param ctx the parse tree
	 */
	void exitDefnation_controller(PAGEParser.Defnation_controllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#name_controller}.
	 * @param ctx the parse tree
	 */
	void enterName_controller(PAGEParser.Name_controllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#name_controller}.
	 * @param ctx the parse tree
	 */
	void exitName_controller(PAGEParser.Name_controllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#name_controller_page}.
	 * @param ctx the parse tree
	 */
	void enterName_controller_page(PAGEParser.Name_controller_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#name_controller_page}.
	 * @param ctx the parse tree
	 */
	void exitName_controller_page(PAGEParser.Name_controller_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(PAGEParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(PAGEParser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#body_controller}.
	 * @param ctx the parse tree
	 */
	void enterBody_controller(PAGEParser.Body_controllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#body_controller}.
	 * @param ctx the parse tree
	 */
	void exitBody_controller(PAGEParser.Body_controllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(PAGEParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(PAGEParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PAGEParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PAGEParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(PAGEParser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(PAGEParser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#print_php}.
	 * @param ctx the parse tree
	 */
	void enterPrint_php(PAGEParser.Print_phpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#print_php}.
	 * @param ctx the parse tree
	 */
	void exitPrint_php(PAGEParser.Print_phpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PAGEParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PAGEParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#css_page}.
	 * @param ctx the parse tree
	 */
	void enterCss_page(PAGEParser.Css_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#css_page}.
	 * @param ctx the parse tree
	 */
	void exitCss_page(PAGEParser.Css_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#body_css}.
	 * @param ctx the parse tree
	 */
	void enterBody_css(PAGEParser.Body_cssContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#body_css}.
	 * @param ctx the parse tree
	 */
	void exitBody_css(PAGEParser.Body_cssContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAGEParser#body_class}.
	 * @param ctx the parse tree
	 */
	void enterBody_class(PAGEParser.Body_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAGEParser#body_class}.
	 * @param ctx the parse tree
	 */
	void exitBody_class(PAGEParser.Body_classContext ctx);
}