package ANTLR4_compiler;

import org.antlr.v4.runtime.ParserRuleContext;

import ANTLR4_compiler.miniCParser.MOD_ASSIGNContext;

public class BuildAstVisitor extends miniCBaseVisitor<ASTNode> {
	ParserRuleContext current_node;
	
	private static String[] makeRuleNames() {
		return new String[] {
			"Program", "Func_Def", "Func_Head", "Dcl_Spec", "Const_Node", 
			"Int_Node", "Void_Node", "Formal_Para", "Param_Dcl", "Compound_St", 
			"Dcl_List", "Dcl", "Dcl_Item", "Simple_Var", 
			"Array_Var", "Stat_List", "Exp_St", "If_St", "If_Else_St", 
			"While_St", "Return_St", "Assign_Op", "Add_Assign", "Sub_Assign", 
			"Mul_Aassign", "Div_Assign", "Mod_Assign", "Logical_Or", "Logical_And", 
			"EQ", "NE", "GT", "LT", "GE", "LE",
			"Add", "Sub", "Mul", "Div", 
			"Mod", "Unary_Minus", "Logical_Not", "Pre_Inc", 
			"Pre_Dec", "Index", "Call", "Post_Inc", "Post_Dec", "Actual_Param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();
	
	public String[] getRuleNames() { return ruleNames; }
	
	@Override public ASTNode visitPROGRAM(miniCParser.PROGRAMContext ctx) {
		ProgramNode node = new ProgramNode(current_node,0);
		current_node = node;
		visitChildren(ctx);
		return node;
	}
	
	@Override public ASTNode visitTranslation_unit(miniCParser.Translation_unitContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override public ASTNode visitExternal_dcl(miniCParser.External_dclContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitFUNC_DEF(miniCParser.FUNC_DEFContext ctx) {
		FuncDefNode node = new FuncDefNode(current_node,0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitFUNC_HEAD(miniCParser.FUNC_HEADContext ctx) {
		FuncHeadNode node = new FuncHeadNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDCL_SPECI(miniCParser.DCL_SPECIContext ctx) { 
		DclSpeciNode node = new DclSpeciNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDcl_specifiers(miniCParser.Dcl_specifiersContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitDcl_specifier(miniCParser.Dcl_specifierContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitCONST_NODE(miniCParser.CONST_NODEContext ctx) {
		ConstNode node = new ConstNode(current_node, 0);
		current_node.addAnyChild(node);
		return node;
	}
	
	@Override public ASTNode visitINT_NODE(miniCParser.INT_NODEContext ctx) {
		IntNode node = new IntNode(current_node, 0);
		current_node.addAnyChild(node);
		return node;
	}
	
	@Override public ASTNode visitVOID_NODE(miniCParser.VOID_NODEContext ctx) {
		VoidNode node = new VoidNode(current_node, 0);
		current_node.addAnyChild(node);
		return node;
	}
	
	@Override public ASTNode visitFunction_name(miniCParser.Function_nameContext ctx) {
		current_node.addAnyChild(ctx.getChild(0));
		return visitChildren(ctx);
	}
	
	@Override public ASTNode visitFORMAL_PARA(miniCParser.FORMAL_PARAContext ctx) {
		FormalParaNode node = new FormalParaNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitOpt_formal_param(miniCParser.Opt_formal_paramContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitFormal_param_list(miniCParser.Formal_param_listContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitPARA_DCL(miniCParser.PARA_DCLContext ctx) {
		ParaDclNode node = new ParaDclNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitCOMPOUND_STAT(miniCParser.COMPOUND_STATContext ctx) {
		CompoundStatNode node = new CompoundStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDCL_LIST(miniCParser.DCL_LISTContext ctx) {
		DclListNode node = new DclListNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDeclaration_list(miniCParser.Declaration_listContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitDCL(miniCParser.DCLContext ctx) { 
		DclNode node = new DclNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitInit_dcl_list(miniCParser.Init_dcl_listContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitDCL_ITEM(miniCParser.DCL_ITEMContext ctx) { 
		DclItemNode node = new DclItemNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		if(ctx.getChildCount()>1)
			current_node.addAnyChild(ctx.getChild(2));
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitSIMPLE_VAR(miniCParser.SIMPLE_VARContext ctx) {
		SimpleVarNode node = new SimpleVarNode(current_node, 0);
		current_node.addAnyChild(node);
		node.addAnyChild(ctx.getChild(0));
		return node;
	}
	
	@Override public ASTNode visitARRAY_VAR(miniCParser.ARRAY_VARContext ctx) {
		ArrayVarNode node = new ArrayVarNode(current_node, 0);
		current_node.addAnyChild(node);
		node.addAnyChild(ctx.getChild(0));
		if(ctx.opt_number().getChildCount()>1)
			node.addAnyChild(ctx.opt_number().getChild(0));
		return node;
	}
	
	@Override public ASTNode visitOpt_number(miniCParser.Opt_numberContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitSTAT_LIST(miniCParser.STAT_LISTContext ctx) {
		StatListNode node = new StatListNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitStatement_list(miniCParser.Statement_listContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitStatement(miniCParser.StatementContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitEXP_STAT(miniCParser.EXP_STATContext ctx) {
		ExpStatNode node = new ExpStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitOpt_expression(miniCParser.Opt_expressionContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitIF_STAT(miniCParser.IF_STATContext ctx) {
		IfStatNode node = new IfStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitIF_ELSE_STAT(miniCParser.IF_ELSE_STATContext ctx) {
		IfElseStatNode node = new IfElseStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitWHILE_STAT(miniCParser.WHILE_STATContext ctx) {
		WhileStatNode node = new WhileStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitRETURN_STAT(miniCParser.RETURN_STATContext ctx) {
		ReturnStatNode node = new ReturnStatNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitExpression(miniCParser.ExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitASSIGN_OP(miniCParser.ASSIGN_OPContext ctx) {
		AssignOpNode node = new AssignOpNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitADD_ASSIGN(miniCParser.ADD_ASSIGNContext ctx) {
		AddAssignNode node = new AddAssignNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}

	@Override public ASTNode visitSUB_ASSIGN(miniCParser.SUB_ASSIGNContext ctx) {
		SubAssignNode node = new SubAssignNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitMUL_ASSIGN(miniCParser.MUL_ASSIGNContext ctx) {
		MulAssignNode node = new MulAssignNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDIV_ASSIGN(miniCParser.DIV_ASSIGNContext ctx) {
		DivAssignNode node = new DivAssignNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitMOD_ASSIGN(miniCParser.MOD_ASSIGNContext ctx) {
		ModAssignNode node = new ModAssignNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitLOGICAL_OR(miniCParser.LOGICAL_ORContext ctx) {
		LogicalOrNode node = new LogicalOrNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitLOGICAL_AND(miniCParser.LOGICAL_ANDContext ctx) {
		LogicalAndNode node = new LogicalAndNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitNE(miniCParser.NEContext ctx) {
		NENode node = new NENode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitEQ(miniCParser.EQContext ctx) {
		EQNode node = new EQNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitLT(miniCParser.LTContext ctx) {
		LTNode node = new LTNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitLE(miniCParser.LEContext ctx) {
		LENode node = new LENode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitGT(miniCParser.GTContext ctx) {
		GTNode node = new GTNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitGE(miniCParser.GEContext ctx) {
		GENode node = new GENode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitADD(miniCParser.ADDContext ctx) {
		AddNode node = new AddNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitSUB(miniCParser.SUBContext ctx) {
		SubNode node = new SubNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitDIV(miniCParser.DIVContext ctx) {
		DivNode node = new DivNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitMOD(miniCParser.MODContext ctx) {
		ModNode node = new ModNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitMUL(miniCParser.MULContext ctx) {
		MulNode node = new MulNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitUNARY_MINUS(miniCParser.UNARY_MINUSContext ctx) {
		UnaryMinusNode node = new UnaryMinusNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitLOGICAL_NOT(miniCParser.LOGICAL_NOTContext ctx) {
		LogicalNotNode node = new LogicalNotNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitPRE_INC(miniCParser.PRE_INCContext ctx) {
		PreIncNode node = new PreIncNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitPRE_DEC(miniCParser.PRE_DECContext ctx) {
		PreDecNode node = new PreDecNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitCALL(miniCParser.CALLContext ctx) {
		CallNode node = new CallNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitPOST_INC(miniCParser.POST_INCContext ctx) {
		PostIncNode node = new PostIncNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitINDEX(miniCParser.INDEXContext ctx) {
		IndexNode node = new IndexNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitPOST_DEC(miniCParser.POST_DECContext ctx) {
		PostDecNode node = new PostDecNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitOpt_actual_param(miniCParser.Opt_actual_paramContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitACTUAL_PARA(miniCParser.ACTUAL_PARAContext ctx) {
		ActualParaNode node = new ActualParaNode(current_node, 0);
		current_node.addAnyChild(node);
		current_node = node;
		visitChildren(ctx);
		current_node = node.getParent();
		return node;
	}
	
	@Override public ASTNode visitActual_param_list(miniCParser.Actual_param_listContext ctx) { return visitChildren(ctx); }
	
	@Override public ASTNode visitPrimary_exp(miniCParser.Primary_expContext ctx) {
		if(ctx.getChildCount()<2)
			current_node.addAnyChild(ctx.getChild(0));
		return visitChildren(ctx);
	}
}
