package ANTLR4_compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface ASTBaseVisitorIF<T> extends ParseTreeVisitor<T>{
	T visitProgramNode(ProgramNode node);
	T visitFuncDefNode(FuncDefNode node);
	T visitFuncHeadNode(FuncHeadNode node);
	T visitDclSpeciNode(DclSpeciNode node);
	T visitConstNode(ConstNode node);
	T visitIntNode(IntNode node);
	T visitVoidNode(VoidNode node);
	T visitFormalParaNode(FormalParaNode node);
	T visitParaDclNode(ParaDclNode node);
	T visitCompoundStatNode(CompoundStatNode node);
	T visitDclListNode(DclListNode node);
	T visitDclNode(DclNode node);
	T visitDclItemNode(DclItemNode node);
	T visitSimpleVarNode(SimpleVarNode node);
	T visitArrayVarNode(ArrayVarNode node);
	T visitStatListNode(StatListNode node);
	T visitExpStatNode(ExpStatNode node);
	T visitIfStatNode(IfStatNode node);
	T visitIfElseStatNode(IfElseStatNode node);
	T visitWhileStatNode(WhileStatNode node);
	T visitReturnStatNode(ReturnStatNode node);
	T visitAssignOpNode(AssignOpNode node);
	T visitAddAssignNode(AddAssignNode node);
	T visitSubAssignNode(SubAssignNode node);
	T visitMulAssignNode(MulAssignNode node);
	T visitDivAssignNode(DivAssignNode node);
	T visitModAssignNode(ModAssignNode node);
	T visitLogicalOrNode(LogicalOrNode node);
	T visitLogicalAndNode(LogicalAndNode node);
	T visitEQNode(EQNode node);
	T visitNENode(NENode node);
	T visitGTNode(GTNode node);
	T visitLTNode(LTNode node);
	T visitGENode(GENode node);
	T visitLENode(LENode node);
	T visitAddNode(AddNode node);
	T visitSubNode(SubNode node);
	T visitMulNode(MulNode node);
	T visitDivNode(DivNode node);
	T visitModNode(ModNode node);
	T visitUnaryMinusNode(UnaryMinusNode node);
	T visitLogicalNotNode(LogicalNotNode node);
	T visitPreIncNode(PreIncNode node);
	T visitPreDecNode(PreDecNode node);
	T visitIndexNode(IndexNode node);
	T visitCallNode(CallNode node);
	T visitPostIncNode(PostIncNode node);
	T visitPostDecNode(PostDecNode node);
	T visitActualParaNode(ActualParaNode node);	
}