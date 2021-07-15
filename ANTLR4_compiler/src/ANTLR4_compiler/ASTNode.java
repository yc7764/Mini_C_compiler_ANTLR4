package ANTLR4_compiler;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;


public abstract class ASTNode extends ParserRuleContext{
	public ASTNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
}
class ProgramNode extends ASTNode{
	public ProgramNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitProgramNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 0; }
}
class FuncDefNode extends ASTNode{
	public FuncDefNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitFuncDefNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 1; }
}
class FuncHeadNode extends ASTNode{
	public FuncHeadNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitFuncHeadNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 2; }
}
class DclSpeciNode extends ASTNode{
	public DclSpeciNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDclSpeciNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 3; }
}
class ConstNode extends ASTNode{
	public ConstNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitConstNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 4; }
}
class IntNode extends ASTNode{
	public IntNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitIntNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 5; }
}
class VoidNode extends ASTNode{
	public VoidNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitVoidNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 6; }
}
class FormalParaNode extends ASTNode{
	public FormalParaNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitFormalParaNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 7; }
}
class ParaDclNode extends ASTNode{
	public ParaDclNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitParaDclNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 8; }
}
class CompoundStatNode extends ASTNode{
	public CompoundStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitCompoundStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 9; }
}
class DclListNode extends ASTNode{
	public DclListNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDclListNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 10; }
}
class DclNode extends ASTNode{
	public DclNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDclNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 11; }
}
class DclItemNode extends ASTNode{
	public DclItemNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDclItemNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 12; }
}
class SimpleVarNode extends ASTNode{
	public SimpleVarNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitSimpleVarNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 13; }
}
class ArrayVarNode extends ASTNode{
	public ArrayVarNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitArrayVarNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 14; }
}
class StatListNode extends ASTNode{
	public StatListNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitStatListNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 15; }
}
class ExpStatNode extends ASTNode{
	public ExpStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitExpStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 16; }
}
class IfStatNode extends ASTNode{
	public IfStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitIfStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 17; }
}
class IfElseStatNode extends ASTNode{
	public IfElseStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitIfElseStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 18; }
}
class WhileStatNode extends ASTNode{
	public WhileStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitWhileStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 19; }
}
class ReturnStatNode extends ASTNode{
	public ReturnStatNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitReturnStatNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 20; }
}
class AssignOpNode extends ASTNode{
	public AssignOpNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitAssignOpNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 21; }
}
class AddAssignNode extends ASTNode{
	public AddAssignNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitAddAssignNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 22; }
}
class SubAssignNode extends ASTNode{
	public SubAssignNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitSubAssignNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 23; }
}
class MulAssignNode extends ASTNode{
	public MulAssignNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitMulAssignNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 24; }
}
class DivAssignNode extends ASTNode{
	public DivAssignNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDivAssignNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 25; }
}
class ModAssignNode extends ASTNode{
	public ModAssignNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitModAssignNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 26; }
}
class LogicalOrNode extends ASTNode{
	public LogicalOrNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitLogicalOrNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 27; }
}
class LogicalAndNode extends ASTNode{
	public LogicalAndNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitLogicalAndNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 28; }
}
class EQNode extends ASTNode{
	public EQNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitEQNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 29; }
}
class NENode extends ASTNode{
	public NENode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitNENode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 30; }
}
class GTNode extends ASTNode{
	public GTNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitGTNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 31; }
}
class LTNode extends ASTNode{
	public LTNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitLTNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 32; }
}
class GENode extends ASTNode{
	public GENode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitGENode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 33; }
}
class LENode extends ASTNode{
	public LENode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitLENode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 34; }
}
class AddNode extends ASTNode{
	public AddNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitAddNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 35; }
}
class SubNode extends ASTNode{
	public SubNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitSubNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 36; }
}
class MulNode extends ASTNode{
	public MulNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitMulNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 37; }
}
class DivNode extends ASTNode{
	public DivNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitDivNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 38; }
}
class ModNode extends ASTNode{
	public ModNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitModNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 39; }
}
class UnaryMinusNode extends ASTNode{
	public UnaryMinusNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitUnaryMinusNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 40; }
}
class LogicalNotNode extends ASTNode{
	public LogicalNotNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitLogicalNotNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 41; }
}
class PreIncNode extends ASTNode{
	public PreIncNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitPreIncNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 42; }
}
class PreDecNode extends ASTNode{
	public PreDecNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitPreDecNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 43; }
}
class IndexNode extends ASTNode{
	public IndexNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitIndexNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 44; }
}
class CallNode extends ASTNode{
	public CallNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitCallNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 45; }
}
class PostIncNode extends ASTNode{
	public PostIncNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitPostIncNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 46; }
}
class PostDecNode extends ASTNode{
	public PostDecNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitPostDecNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 47; }
}
class ActualParaNode extends ASTNode{
	public ActualParaNode(ParserRuleContext parent, int invokingState) {
		super(parent, invokingState);
	}
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor){
		if ( visitor instanceof ASTBaseVisitor ) return ((ASTBaseVisitor<? extends T>)visitor).visitActualParaNode(this);
		else return visitor.visitChildren(this);
	}
	@Override public int getRuleIndex() { return 48; }
}