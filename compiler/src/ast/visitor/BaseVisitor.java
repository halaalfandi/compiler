package ast.visitor;


import ast.nodes.*;
import gen.PAGEParser;
import gen.PAGEParserBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseVisitor extends PAGEParserBaseVisitor {

    @Override
    public Object visitLanguage(PAGEParser.LanguageContext ctx)
    {
        List<Page> pages = new ArrayList<Page>();
        Language language = new Language();
        List<ControllerPhp> controllerPhps=new ArrayList<ControllerPhp>();
        for(int i=0;i<ctx.start().page().size();i++)
        {
            Page page=  new Page ((Page) visitPage(ctx.start().page(i)));
            language.getPages().add(page);
        }

        for (int i=0;i<ctx.start().back_end().size();i++)
        {
            System.out.println(ctx.start().back_end().size());
           ControllerPhp controller=new ControllerPhp((ControllerPhp) visitDefnation_controller(ctx.start().back_end(i).defnation_controller()));
             language.getControllers().add(controller);
             language.getMap().put(controller.getNamePage(),controller);

        }
        return language;
    }

    @Override
    public Object visitStart(PAGEParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public Object visitPage(PAGEParser.PageContext ctx)
    {
        int i=0;
        Page  page=new Page();
        List<Head>heads=new ArrayList<Head>();
        List<Inside>insides=new ArrayList<Inside>();
        List <Integer> extend=new ArrayList<Integer>();

        for ( i=0;i<ctx.defination_page().head().size();i++)
        {
            Head head   =new Head((Head)visitHead(ctx.defination_page().head(i)));
            heads.add(head);
        }


        for(i=0;i<ctx.defination_page().body().inside().size();i++)
        {
            insides.add((Inside) visitInside(ctx.defination_page().body().inside(i)));
        }

        for(i=1;i<ctx.defination_page().name_page().ID_PAGE().size();i++)
        {
            extend.add(Integer.valueOf(ctx.defination_page().name_page().ID_PAGE().get(i).getText()));
        }

        Integer id= Integer.valueOf(ctx.defination_page().name_page().ID_PAGE().get(0).getText()) ;
        String name=ctx.defination_page().name_page().NAME_PAGE().getText();
        page.setId(id);
        page.setName(name);
        page.setHeads(heads);
        page.setInsides(insides);
        page.setExtend(extend);

        return page;
    }

    @Override
    public Object visitDefination_page(PAGEParser.Defination_pageContext ctx) {
        return super.visitDefination_page(ctx);
    }

    @Override
    public Object visitName_page(PAGEParser.Name_pageContext ctx) {
        return super.visitName_page(ctx);
    }

    @Override
    public Object visitBody(PAGEParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Object visitHead(PAGEParser.HeadContext ctx)
    {
        String path;
        Head head=new Head();
        if(ctx.css()==null)
        {
            head.setType("script");
            head.setPath(ctx.script().NAME_TEXT().getText());
        }
        else {
            head.setType("css");
            head.setPath(ctx.css().NAME_TEXT().getText());
        }
        //  System.out.println(head.toString());
        return head;
    }

    @Override
    public Object visitCss(PAGEParser.CssContext ctx) {
        return super.visitCss(ctx);
    }

    @Override
    public Object visitScript(PAGEParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }

    @Override
    public Object visitInside(PAGEParser.InsideContext ctx) {

        if(ctx.input()!=null)
        {
            Inside inside;
            if(ctx.input().select()!=null)
                inside = new Select((Select) visitInput(ctx.input()));
            else
                inside = new Input((Input) visitInput(ctx.input()));
            if(ctx.input().class_()!=null)
                for (int i = 0; i < ctx.input().class_().NAME_CLASS().size(); i++) {
                    inside.getClasses().add(new String(ctx.input().class_().NAME_CLASS(i).getText()));
                }
            return inside;
        }


        else if(ctx.output()!=null)
        {
            Inside inside;
            inside = new Output((Output) visitOutput(ctx.output()));
            if(ctx.output().class_()!=null)
                for (int i = 0; i < ctx.output().class_().NAME_CLASS().size(); i++) {
                    inside.getClasses().add(new String(ctx.output().class_().NAME_CLASS(i).getText()));
                }
            return inside;
        }

        else if(ctx.data()!=null)
        {
            Inside inside;
            inside = new Data((Data)  visitData(ctx.data()));
            return inside;
        }


        else if(ctx.table()!=null)
        {
            Inside inside;
            inside = new Table((Table)  visitTable(ctx.table()));
         /* if(ctx.table().head_table().class_()!=null)
           {
             for (int i = 0; i < ctx.table().head_table().class_().NAME().size(); i++)
            {
           inside.getClasses().add(new String(ctx.table().head_table().class_().NAME(i).getText()));
             }
           }
*/

            return inside;
        }


        else if(ctx.list()!=null)
        {
            Inside inside;
            inside = new Listweb((Listweb)  visitList(ctx.list()));
           // System.out.println(";;;;;;;;"+inside.toString()+";;;;;;;;;;");
            return inside;
        }

        return super.visitInside(ctx);

    }


    @Override
    public Object visitList(PAGEParser.ListContext ctx)
    {

        Listweb listweb=new Listweb();
        for(int i=0;i<ctx.PARAGRAPH().size();i++)
        {
            listweb.getList().add(ctx.PARAGRAPH(i).getText());
        }
        listweb.setNameTag("list");
        return listweb;
    }

    @Override
    public Object visitLink(PAGEParser.LinkContext ctx) {
        return super.visitLink(ctx);
    }

    @Override
    public Object visitTable(PAGEParser.TableContext ctx)
    {
        Table table=new Table();
        List<String>list=new ArrayList<String>();
       List<List<String >> rows=new ArrayList<List<String>>();

        for(int i=0;i<ctx.head_table().column().NAME_COLUMN().size();i++)
          {list.add(ctx.head_table().column().NAME_COLUMN(i).getText());}
          table.setHeadTable(list);

          for(int j=0;j<ctx.head_table().row().size();j++)
          {
              List<String>row= new ArrayList<String>( (ArrayList<String>)visitRow(ctx.head_table().row(j)));
              rows.add(row);
          }
           table.setRows(rows);
         table.setNameTag("table");
         table.setType("table");
         table.setName("table");
        return table;
    }

    @Override
    public Object visitHead_table(PAGEParser.Head_tableContext ctx) {
        return super.visitHead_table(ctx);
    }

    @Override
    public Object visitColumn(PAGEParser.ColumnContext ctx) {
        return super.visitColumn(ctx);
    }


    @Override
    public Object visitRow(PAGEParser.RowContext ctx) {
        List<String> row=new ArrayList<String>();
          for(int i=0;i<ctx.column().NAME_COLUMN().size();i++)
        {
            row.add(new String(ctx.column().NAME_COLUMN(i).getText()));
        }

        return row;
    }

    @Override
    public Object visitOutput(PAGEParser.OutputContext ctx) {
        return super.visitOutput(ctx);
    }

    @Override
    public Object visitInput(PAGEParser.InputContext ctx) {
        Input input;
        if(ctx.select()==null)
        {
            input=new Input();
            input.setType(ctx.type_IN().getText());
        }
        else {
            input=new Select();
            input.setType(ctx.select().SELECT().getText());
            List<Option>options=new ArrayList<Option>();
            for(int i=0;i<ctx.option().size();i++)
            {
                Option option=new Option( (Option) visitOption(ctx.option(i))) ;
                options.add(option);
            }
            ((Select) input).setOptions(options);
        }
        input.setName(ctx.name().NAME().getText());
        input.setNameTag("input");

        //   System.out.println(";;;;;;;;;;;;;;;;;;;;;;;"+input.toString());
        return input;    }

    @Override
    public Object visitType_IN(PAGEParser.Type_INContext ctx) {
        return super.visitType_IN(ctx);
    }

    @Override
    public Object visitSelect(PAGEParser.SelectContext ctx) {
        return super.visitSelect(ctx);
    }

    @Override
    public Object visitType_OUT(PAGEParser.Type_OUTContext ctx) {
        return super.visitType_OUT(ctx);
    }

    @Override
    public Object visitClass_(PAGEParser.Class_Context ctx) {
        return super.visitClass_(ctx);
    }

    @Override
    public Object visitClass_table(PAGEParser.Class_tableContext ctx) {
        return super.visitClass_table(ctx);
    }

    @Override
    public Object visitName(PAGEParser.NameContext ctx) {
        return super.visitName(ctx);
    }

    @Override
    public Object visitName_out(PAGEParser.Name_outContext ctx) {
        return super.visitName_out(ctx);
    }

    @Override
    public Object visitOption(PAGEParser.OptionContext ctx)
    {
        Option option=new Option();
        option.setName(new String(ctx.NAME().getText()));
        System.out.println(option.getName());


        return option;
    }

    @Override
    public Object visitData(PAGEParser.DataContext ctx) {
        return super.visitData(ctx);
    }

    @Override
    public Object visitSeesion(PAGEParser.SeesionContext ctx) {
        return super.visitSeesion(ctx);
    }

    @Override
    public Object visitArray_s(PAGEParser.Array_sContext ctx) {
        return super.visitArray_s(ctx);
    }

    @Override
    public Object visitItem(PAGEParser.ItemContext ctx) {
        return super.visitItem(ctx);
    }

    @Override
    public Object visitBack_end(PAGEParser.Back_endContext ctx) {
        return super.visitBack_end(ctx);
    }

    @Override
    public Object visitDefnation_controller(PAGEParser.Defnation_controllerContext ctx)
    {

        ControllerPhp controller=new ControllerPhp();
        controller.setId(Integer.valueOf(ctx.name_controller().ID_CONTROLLER().getText()));
        controller.setIdPage(Integer.valueOf(ctx.name_controller_page().ID_CONTROLLER().getText()));
        controller.setName(ctx.name_controller().NAME_CONTROLLER().getText());
        controller.setNamePage(ctx.name_controller_page().NAME_CONTROLLER().getText());
       // System.out.println(controller.toString());

        for(int i=0;i<ctx.controller().body_controller().size();i++)
        {

         if(ctx.controller().body_controller(i).variable()!=null)
         {
           //  System.out.println("variable");
             Variable variable=new Variable((Variable)visitVariable(ctx.controller().body_controller(i).variable()));
             controller.getInsideControllers().add(variable);
         }
            if(ctx.controller().body_controller(i).print_php()!=null)
        {
                //  System.out.println("variable");
                Print printController=new Print((Print)visitPrint_php(ctx.controller().body_controller(i).print_php()));
                controller.getInsideControllers().add(printController);
        }


            if(ctx.controller().body_controller(i).if_body()!=null)
            {
                if(ctx.controller().body_controller(i).if_body().condition().VAR_IF(0)!=null)
                {

                 IfCondition ifCondition=new IfCondition((IfCondition) visitCondition(ctx.controller().body_controller(i).if_body().condition()));
                   ifCondition.setName(ctx.controller().body_controller(i).if_body().IF().getText());
                    controller.getInsideControllers().add(ifCondition);


                }
                else{
                    IfVeriable ifVeriable=new IfVeriable((IfVeriable) visitCondition(ctx.controller().body_controller(i).if_body().condition()));
                    ifVeriable.setName(ctx.controller().body_controller(i).if_body().IF().getText());
                    controller.getInsideControllers().add(ifVeriable);                 }
            }


        }
        return controller;

    }

    @Override
    public Object visitName_controller(PAGEParser.Name_controllerContext ctx) {
        return super.visitName_controller(ctx);
    }

    @Override
    public Object visitName_controller_page(PAGEParser.Name_controller_pageContext ctx) {
        return super.visitName_controller_page(ctx);
    }

    @Override
    public Object visitController(PAGEParser.ControllerContext ctx)
    {

        ControllerPhp controller=new ControllerPhp();
     //   controller.setId(ctx.);
        System.out.println(controller.toString());
        return controller;

    }

    @Override
    public Object visitIf_body(PAGEParser.If_bodyContext ctx) {
        return super.visitIf_body(ctx);
    }

    @Override
    public Object visitCondition(PAGEParser.ConditionContext ctx)
    {
        if(ctx.VAR_IF(0)!=null)
        {
             IfCondition ifCondition=new IfCondition();
            ifCondition.setFirst(ctx.VAR_IF(0).getText());
            ifCondition.setSecond(ctx.VAR_IF(1).getText());
            ifCondition.setOperation(ctx.OPERATION().getText());
            return ifCondition;
        }


        if(ctx.NAME_VALID(0)!=null)
        {
            IfVeriable ifVeriable=new IfVeriable();
           for(int i=0;i<ctx.NAME_VALID().size();i++)
           {
               ifVeriable.getValid().add(ctx.NAME_VALID(i).getText());
           }

            return ifVeriable;
        }


        return null;
    }

    @Override
    public Object visitFor_body(PAGEParser.For_bodyContext ctx) {
        return super.visitFor_body(ctx);
    }

    @Override
    public Object visitPrint_php(PAGEParser.Print_phpContext ctx)
    {
        Print printController=new Print();
        printController.setStatment(ctx.getText());
        return printController;
    }

    @Override
    public Object visitVariable(PAGEParser.VariableContext ctx)
    {
    Variable variable=new Variable();
    //variable.setName(ctx.);
 //   if(ctx.NAME(1)!=null)
   //  variable.setValue(ctx.NAME(1).getText());

        return variable;
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
