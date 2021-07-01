package ANTLR4_compiler;

import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AST_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharStream in = new ANTLRInputStream("void main() { int i; }");
		miniCLexer lexer = new miniCLexer(in);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		miniCParser parser = new miniCParser(tokenStream);
		ParseTree tree = parser.mini_c();
		
		TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
		viewer.open();
	}

}
