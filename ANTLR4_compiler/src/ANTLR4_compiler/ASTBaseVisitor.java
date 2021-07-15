package ANTLR4_compiler;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ASTBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ASTBaseVisitorIF<T> {
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
		return visitChildren(node);
	}
	@Override
	public T visitDclSpeciNode(DclSpeciNode node){
		return visitChildren(node);
	}
	@Override
	public T visitConstNode(ConstNode node){
		return visitChildren(node);
	}
	@Override
	public T visitIntNode(IntNode node){
		return visitChildren(node);
	}
	@Override
	public T visitVoidNode(VoidNode node){
		return visitChildren(node);
	}
	@Override
	public T visitFormalParaNode(FormalParaNode node){
		return visitChildren(node);
	}
	@Override
	public T visitParaDclNode(ParaDclNode node){
		return visitChildren(node);
	}
	@Override
	public T visitCompoundStatNode(CompoundStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitDclListNode(DclListNode node){
		return visitChildren(node);
	}
	@Override
	public T visitDclNode(DclNode node){
		return visitChildren(node);
	}
	@Override
	public T visitDclItemNode(DclItemNode node){
		return visitChildren(node);
	}
	@Override
	public T visitSimpleVarNode(SimpleVarNode node){
		return visitChildren(node);
	}
	@Override
	public T visitArrayVarNode(ArrayVarNode node){
		return visitChildren(node);
	}
	@Override
	public T visitStatListNode(StatListNode node){
		return visitChildren(node);
	}
	@Override
	public T visitExpStatNode(ExpStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitIfStatNode(IfStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitIfElseStatNode(IfElseStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitWhileStatNode(WhileStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitReturnStatNode(ReturnStatNode node){
		return visitChildren(node);
	}
	@Override
	public T visitAssignOpNode(AssignOpNode node){
		return visitChildren(node);
	}
	@Override
	public T visitAddAssignNode(AddAssignNode node){
		return visitChildren(node);
	}
	@Override
	public T visitSubAssignNode(SubAssignNode node){
		return visitChildren(node);
	}
	@Override
	public T visitMulAssignNode(MulAssignNode node){
		return visitChildren(node);
	}
	@Override
	public T visitDivAssignNode(DivAssignNode node){
		return visitChildren(node);
	}
	@Override
	public T visitModAssignNode(ModAssignNode node){
		return visitChildren(node);
	}
	@Override
	public T visitLogicalOrNode(LogicalOrNode node){
		return visitChildren(node);
	}
	@Override
	public T visitLogicalAndNode(LogicalAndNode node){
		return visitChildren(node);
	}
	@Override
	public T visitEQNode(EQNode node){
		return visitChildren(node);
	}
	@Override
	public T visitNENode(NENode node){
		return visitChildren(node);
	}
	@Override
	public T visitGTNode(GTNode node){
		return visitChildren(node);
	}
	@Override
	public T visitLTNode(LTNode node){
		return visitChildren(node);
	}
	@Override
	public T visitGENode(GENode node){
		return visitChildren(node);
	}
	@Override
	public T visitLENode(LENode node){
		return visitChildren(node);
	}
	@Override
	public T visitAddNode(AddNode node){
		return visitChildren(node);
	}
	@Override
	public T visitSubNode(SubNode node){
		return visitChildren(node);
	}
	@Override
	public T visitMulNode(MulNode node){
		return visitChildren(node);
	}
	@Override
	public T visitDivNode(DivNode node){
		return visitChildren(node);
	}
	@Override
	public T visitModNode(ModNode node){
		return visitChildren(node);
	}
	@Override
	public T visitUnaryMinusNode(UnaryMinusNode node){
		return visitChildren(node);
	}
	@Override
	public T visitLogicalNotNode(LogicalNotNode node){
		return visitChildren(node);
	}
	@Override
	public T visitPreIncNode(PreIncNode node){
		return visitChildren(node);
	}
	@Override
	public T visitPreDecNode(PreDecNode node){
		return visitChildren(node);
	}
	@Override
	public T visitIndexNode(IndexNode node){
		return visitChildren(node);
	}
	@Override
	public T visitCallNode(CallNode node){
		return visitChildren(node);
	}
	@Override
	public T visitPostIncNode(PostIncNode node){
		return visitChildren(node);
	}
	@Override
	public T visitPostDecNode(PostDecNode node){
		return visitChildren(node);
	}
	@Override
	public T visitActualParaNode(ActualParaNode node){
		return visitChildren(node);
	}
}
