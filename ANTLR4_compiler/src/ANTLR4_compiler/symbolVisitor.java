package ANTLR4_compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class symbolVisitor extends ASTVisitor {
	SymbolTable st;

	String symbolName;
	TypeSpecifier typeSpecifier;
	TypeQualifier typeQualifier;
	int base;
	int offset;
	int width;
	int initialValue;
	boolean isFuncDef;
	
	public symbolVisitor() {
		st = new SymbolTable();
		st.set();
		base = 1;
		offset = 1;
		isFuncDef = false;
	}
	public void resetEntry() {
		symbolName = "";
		typeSpecifier = TypeSpecifier.NON_SPECIFIER;
		typeQualifier = TypeQualifier.NON_QUALIFIER;
		width = 0;
		initialValue = 0;
	}
	
	@Override
	public Void visitProgramNode(ProgramNode node) {
		for(int i=0; i<node.getChildCount();i++) {
			visit((ASTNode)node.getChild(i));
		}
		return null;
	}
	@Override
	public Void visitFuncDefNode(FuncDefNode node) {
		isFuncDef = true;
		resetEntry();
		typeQualifier = TypeQualifier.FUNC_TYPE;
		visit((ASTNode)node.getChild(0));
		visit((ASTNode)node.getChild(1));
		return null;
	}
	@Override
	public Void visitFuncHeadNode(FuncHeadNode node){
		visit((ASTNode)node.getChild(0));
		st.insert(node.getChild(1).toString(), typeSpecifier, typeQualifier, 1, 0, node.getChild(2).getChildCount(), 0);
		visit((ASTNode)node.getChild(2));
		return null;
	}
	@Override
	public Void visitDclNode(DclNode node){
		resetEntry();
		typeQualifier = TypeQualifier.VAR_TYPE;
		for(int i=0; i<node.getChildCount();i++) {
			visit((ASTNode)node.getChild(i));
		}
		return null;
	}
	@Override
	public Void visitDclItemNode(DclItemNode node){
		ParseTree var = node.getChild(0);
		if(node.getChildCount()>1)
			initialValue = Integer.parseInt(node.getChild(1).toString());
		else
			initialValue = 0;
		visit((ASTNode)node.getChild(0));
		st.insert(symbolName, typeSpecifier, typeQualifier, base, offset, width, initialValue);
		offset += width;
		return null;
	}
	@Override
	public Void visitSimpleVarNode(SimpleVarNode node){
		width = 1;
		symbolName = node.getChild(0).toString();
		return null;
	}
	@Override
	public Void visitArrayVarNode(ArrayVarNode node){
		if(node.getChildCount()>1)
			width = 1*Integer.parseInt(node.getChild(1).toString());
		symbolName = node.getChild(0).toString();
		return null;
	}
	@Override
	public Void visitFormalParaNode(FormalParaNode node){
		resetEntry();
		st.set();
		base++;
		offset = 1;
		typeQualifier = TypeQualifier.PARAM_TYPE;
		for(int i=0; i<node.getChildCount();i++) {
			visit((ASTNode)node.getChild(i));
		}
		return null;
	}
	@Override
	public Void visitParaDclNode(ParaDclNode node){
		for(int i=0; i<node.getChildCount();i++) {
			visit((ASTNode)node.getChild(i));
		}
		st.insert(symbolName, typeSpecifier, typeQualifier, base, offset, width, initialValue);
		offset+=width;
		return null;
	}
	@Override
	public Void visitCompoundStatNode(CompoundStatNode node){
		if(!isFuncDef) {
			st.set();
			base++;
			offset = 1;
			isFuncDef = false;
		}
		for(int i=0; i<node.getChildCount();i++) {
			visit((ASTNode)node.getChild(i));
		}
		st.reset();
		base--;
		return null;
	}
	@Override
	public Void visitConstNode(ConstNode node){
		typeQualifier = TypeQualifier.CONST_TYPE;
		return null;
	}
	@Override
	public Void visitIntNode(IntNode node){
		typeSpecifier = TypeSpecifier.INT_TYPE;
		return null;
	}
	@Override
	public Void visitVoidNode(VoidNode node){
		typeSpecifier = TypeSpecifier.VOID_TYPE;
		return null;
	}
	@Override
	public Void visitAssignOpNode(AssignOpNode node){
		return visitExp(node);
	}
	@Override
	public Void visitAddAssignNode(AddAssignNode node){
		return visitExp(node);
	}
	@Override
	public Void visitSubAssignNode(SubAssignNode node){
		return visitExp(node);
	}
	@Override
	public Void visitMulAssignNode(MulAssignNode node){
		return visitExp(node);
	}
	@Override
	public Void visitDivAssignNode(DivAssignNode node){
		return visitExp(node);
	}
	@Override
	public Void visitModAssignNode(ModAssignNode node){
		return visitExp(node);
	}
	@Override
	public Void visitLogicalOrNode(LogicalOrNode node){
		return visitExp(node);
	}
	@Override
	public Void visitLogicalAndNode(LogicalAndNode node){
		return visitExp(node);
	}
	@Override
	public Void visitEQNode(EQNode node){
		return visitExp(node);
	}
	@Override
	public Void visitNENode(NENode node){
		return visitExp(node);
	}
	@Override
	public Void visitGTNode(GTNode node){
		return visitExp(node);
	}
	@Override
	public Void visitLTNode(LTNode node){
		return visitExp(node);
	}
	@Override
	public Void visitGENode(GENode node){
		return visitExp(node);
	}
	@Override
	public Void visitLENode(LENode node){
		return visitExp(node);
	}
	@Override
	public Void visitAddNode(AddNode node){
		return visitExp(node);
	}
	@Override
	public Void visitSubNode(SubNode node){
		return visitExp(node);
	}
	@Override
	public Void visitMulNode(MulNode node){
		return visitExp(node);
	}
	@Override
	public Void visitDivNode(DivNode node){
		return visitExp(node);
	}
	@Override
	public Void visitModNode(ModNode node){
		return visitExp(node);
	}
	@Override
	public Void visitUnaryMinusNode(UnaryMinusNode node){
		return visitExp(node);
	}
	@Override
	public Void visitLogicalNotNode(LogicalNotNode node){
		return visitExp(node);
	}
	@Override
	public Void visitPreIncNode(PreIncNode node){
		return visitExp(node);
	}
	@Override
	public Void visitPreDecNode(PreDecNode node){
		return visitExp(node);
	}
	@Override
	public Void visitIndexNode(IndexNode node){
		return visitExp(node);
	}
	public Void visitExp(ASTNode node) {
		ParseTree pt;
		String tmp;
		SymbolEntry se;
		for(int i=0; i<node.getChildCount();i++) {
			pt = node.getChild(i);
			tmp = pt.toString();
			if((pt instanceof TerminalNode)) {
				if(!checkNum(tmp)) {
					se = st.lookup(tmp);
					if(se.getTypeQualifier()==TypeQualifier.FUNC_TYPE)
						System.out.println("function name can't operate");
					else
						System.out.println(se.toString());
				}
			}
			else
				visit((ASTNode)pt);
		}
		return null;
	}
}
