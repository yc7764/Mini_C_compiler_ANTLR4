package ANTLR4_compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASTVisitor<T> extends ASTBaseVisitor<T> {
	SymbolTable st;
	String symbolName;
	TypeSpecifier typeSpecifier;
	TypeQualifier typeQualifier;
	int base;
	int offset;
	int width;
	int initialValue;
	boolean isFuncDef;
	
	public ASTVisitor() {
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
	public boolean checkNum(String str) {
		try {
            int num = Integer.parseInt(str);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
	}
	@Override
	public T visitProgramNode(ProgramNode node) {
		return visitChildren(node);
	}
	@Override
	public T visitFuncDefNode(FuncDefNode node) {
		return visitChildren(node);
	}
	@Override
	public T visitFuncHeadNode(FuncHeadNode node){
		isFuncDef = true;
		resetEntry();
		typeQualifier = TypeQualifier.FUNC_TYPE;
		visit(node.getChild(0));
		st.insert(node.getChild(1).toString(), typeSpecifier,
				typeQualifier, 1, 0, node.getChild(2).getChildCount(), 0);
		visit(node.getChild(2));
		return null;
	}
	@Override
	public T visitDclNode(DclNode node){
		resetEntry();
		typeQualifier = TypeQualifier.VAR_TYPE;
		return visitChildren(node);
	}
	@Override
	public T visitDclItemNode(DclItemNode node){
		if(node.getChildCount()>1)
			initialValue = Integer.parseInt(node.getChild(1).toString());
		else
			initialValue = 0;
		visit(node.getChild(0));
		st.insert(symbolName, typeSpecifier, typeQualifier, base, offset,
				width, initialValue);
		offset += width;
		return null;
	}
	@Override
	public T visitSimpleVarNode(SimpleVarNode node){
		width = 1;
		symbolName = node.getChild(0).toString();
		return null;
	}
	@Override
	public T visitArrayVarNode(ArrayVarNode node){
		if(node.getChildCount()>1)
			width = 1*Integer.parseInt(node.getChild(1).toString());
		else {
			printError();
			System.out.println("array size must be specified\n");
		}
		symbolName = node.getChild(0).toString();
		return null;
	}
	@Override
	public T visitFormalParaNode(FormalParaNode node){
		resetEntry();
		st.set();
		base++;
		offset = 1;
		typeQualifier = TypeQualifier.PARAM_TYPE;
		return visitChildren(node);
	}
	@Override
	public T visitParaDclNode(ParaDclNode node){
		visitChildren(node);
		st.insert(symbolName, typeSpecifier, typeQualifier, base,
				offset, width, initialValue);
		offset+=width;
		return null;
	}
	@Override
	public T visitCompoundStatNode(CompoundStatNode node){
		if(!isFuncDef) {
			st.set();
			base++;
			offset = 1;
			isFuncDef = false;
		}
		visitChildren(node);
		st.reset();
		base--;
		return null;
	}
	@Override
	public T visitConstNode(ConstNode node){
		typeQualifier = TypeQualifier.CONST_TYPE;
		return visitChildren(node);
	}
	@Override
	public T visitIntNode(IntNode node){
		typeSpecifier = TypeSpecifier.INT_TYPE;
		return visitChildren(node);
	}
	@Override
	public T visitVoidNode(VoidNode node){
		typeSpecifier = TypeSpecifier.VOID_TYPE;
		return visitChildren(node);
	}
	@Override
	public T visitAssignOpNode(AssignOpNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitAddAssignNode(AddAssignNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitSubAssignNode(SubAssignNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitMulAssignNode(MulAssignNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitDivAssignNode(DivAssignNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitModAssignNode(ModAssignNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitLogicalOrNode(LogicalOrNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitLogicalAndNode(LogicalAndNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitEQNode(EQNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitNENode(NENode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitGTNode(GTNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitLTNode(LTNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitGENode(GENode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitLENode(LENode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitAddNode(AddNode node){
		ParseTree pt;
		String tmp;
		SymbolEntry se;
		for(int i=0; i<node.getChildCount();i++) {
			pt = node.getChild(i);
			tmp = pt.toString();
			if((pt instanceof TerminalNode)) {
				if(!checkNum(tmp)) {
					se = st.lookup(tmp);
					if(se!=null)
						System.out.println(se.toString());
				}
			}
			else
				visit(pt);
		}
		return null;
	}
	@Override
	public T visitSubNode(SubNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitMulNode(MulNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitDivNode(DivNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitModNode(ModNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitUnaryMinusNode(UnaryMinusNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitLogicalNotNode(LogicalNotNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitPreIncNode(PreIncNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitPreDecNode(PreDecNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitIndexNode(IndexNode node){
		visitExp(node);
		return null;
	}
	@Override
	public T visitActualParaNode(ActualParaNode node){
		SymbolEntry se;
		ParseTree tmp;
		for(int i=0; i<node.getChildCount();i++) {
			tmp = node.getChild(i);
			if(tmp instanceof TerminalNode) {
				se = st.lookup(node.getChild(i).toString());
				if(se == null)
					printError();
				else
					System.out.println(se.toString());
			}
			else
				visit(tmp);
		}

		return null;
	}
	public T visitExp(ASTNode node) {
		ParseTree pt;
		String tmp;
		SymbolEntry se;
		for(int i=0; i<node.getChildCount();i++) {
			pt = node.getChild(i);
			tmp = pt.toString();
			if((pt instanceof TerminalNode)) {
				if(!checkNum(tmp)) {
					se = st.lookup(tmp);
					if(se.getTypeQualifier()==TypeQualifier.FUNC_TYPE) {
						printError();
						System.out.println("function name can't operate");
					}
					else
						System.out.println(se.toString());
				}
			}
			else
				visit(pt);
		}
		return null;
	}
	public void printError() {
		
	}
}
