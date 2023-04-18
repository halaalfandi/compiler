package com.company;

import ast.nodes.Language;
import ast.visitor.BaseVisitor;
import gen.PAGELexer;
import gen.PAGEParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
  static public String  path="C:\\xampp\\htdocs\\";
    public static void main(String[] args) {

        try {

            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            PAGELexer lexer = new PAGELexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            PAGEParser parser = new PAGEParser(token);
            ParseTree tree = parser.language();
            System.out.println("\n My Language");
            Language language = (Language) new BaseVisitor().visit(tree);
            System.out.println(language.toString());


             language.generate();
        //   language.getControllers().get(0).generateController();


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
