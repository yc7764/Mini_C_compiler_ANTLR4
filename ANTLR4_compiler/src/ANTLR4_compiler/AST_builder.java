package ANTLR4_compiler;

import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AST_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharStream input = new ANTLRInputStream("const int global=1; void main() {int a=2; int b; b = a+global;}");
		miniCLexer lexer = new miniCLexer(input);
	    CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
	    miniCParser minicparser = new miniCParser(commonTokenStream);
	    
	    ParseTree pt = minicparser.mini_c();
	    BuildAstVisitor builder = new BuildAstVisitor();
	    ASTNode ast = builder.visit(pt);
	    TreeViewer viewer1 = 
        		new TreeViewer(Arrays.asList(minicparser.getRuleNames()),pt);
        TreeViewer viewer2 = 
        		new TreeViewer(Arrays.asList(builder.getRuleNames()),ast);
        //viewer1.open();
        viewer2.open();
        ASTVisitor sv = new ASTVisitor();
        sv.visit(ast);
	}

}
