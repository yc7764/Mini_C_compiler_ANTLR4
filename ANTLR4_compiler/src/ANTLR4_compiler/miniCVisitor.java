// Generated from miniC.g4 by ANTLR 4.9.2
package ANTLR4_compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code PROGRAM}
	 * labeled alternative in {@link miniCParser#mini_c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROGRAM(miniCParser.PROGRAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(miniCParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#external_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_dcl(miniCParser.External_dclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNC_DEF}
	 * labeled alternative in {@link miniCParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNC_DEF(miniCParser.FUNC_DEFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNC_HEAD}
	 * labeled alternative in {@link miniCParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNC_HEAD(miniCParser.FUNC_HEADContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL_SPECI}
	 * labeled alternative in {@link miniCParser#dcl_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL_SPECI(miniCParser.DCL_SPECIContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#dcl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_specifiers(miniCParser.Dcl_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#dcl_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_specifier(miniCParser.Dcl_specifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONST_NODE}
	 * labeled alternative in {@link miniCParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONST_NODE(miniCParser.CONST_NODEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INT_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINT_NODE(miniCParser.INT_NODEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VOID_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVOID_NODE(miniCParser.VOID_NODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(miniCParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMAL_PARA}
	 * labeled alternative in {@link miniCParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMAL_PARA(miniCParser.FORMAL_PARAContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#opt_formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_formal_param(miniCParser.Opt_formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#formal_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param_list(miniCParser.Formal_param_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARA_DCL}
	 * labeled alternative in {@link miniCParser#param_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARA_DCL(miniCParser.PARA_DCLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPOUND_STAT}
	 * labeled alternative in {@link miniCParser#compound_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPOUND_STAT(miniCParser.COMPOUND_STATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL_LIST}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL_LIST(miniCParser.DCL_LISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL1}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL1(miniCParser.NULL1Context ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(miniCParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link miniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL(miniCParser.DCLContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#init_dcl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_dcl_list(miniCParser.Init_dcl_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL_ITEM}
	 * labeled alternative in {@link miniCParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL_ITEM(miniCParser.DCL_ITEMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIMPLE_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIMPLE_VAR(miniCParser.SIMPLE_VARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_VAR(miniCParser.ARRAY_VARContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#opt_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_number(miniCParser.Opt_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STAT_LIST}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTAT_LIST(miniCParser.STAT_LISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL2}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL2(miniCParser.NULL2Context ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(miniCParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP_STAT}
	 * labeled alternative in {@link miniCParser#expression_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP_STAT(miniCParser.EXP_STATContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#opt_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_expression(miniCParser.Opt_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_STAT(miniCParser.IF_STATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_ELSE_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_ELSE_STAT(miniCParser.IF_ELSE_STATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILE_STAT}
	 * labeled alternative in {@link miniCParser#while_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILE_STAT(miniCParser.WHILE_STATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURN_STAT}
	 * labeled alternative in {@link miniCParser#return_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURN_STAT(miniCParser.RETURN_STATContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(miniCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL3}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL3(miniCParser.NULL3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN_OP}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN_OP(miniCParser.ASSIGN_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD_ASSIGN(miniCParser.ADD_ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB_ASSIGN(miniCParser.SUB_ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL_ASSIGN(miniCParser.MUL_ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV_ASSIGN(miniCParser.DIV_ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOD_ASSIGN(miniCParser.MOD_ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_OR}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_OR(miniCParser.LOGICAL_ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL4}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL4(miniCParser.NULL4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_AND}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_AND(miniCParser.LOGICAL_ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL5}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL5(miniCParser.NULL5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NE}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNE(miniCParser.NEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQ(miniCParser.EQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL6}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL6(miniCParser.NULL6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL7}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL7(miniCParser.NULL7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLT(miniCParser.LTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLE(miniCParser.LEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGT(miniCParser.GTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGE(miniCParser.GEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(miniCParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB(miniCParser.SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL8}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL8(miniCParser.NULL8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL9}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL9(miniCParser.NULL9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(miniCParser.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOD(miniCParser.MODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL(miniCParser.MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL10}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL10(miniCParser.NULL10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UNARY_MINUS}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNARY_MINUS(miniCParser.UNARY_MINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_NOT}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_NOT(miniCParser.LOGICAL_NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE_INC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE_INC(miniCParser.PRE_INCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE_DEC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE_DEC(miniCParser.PRE_DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCALL(miniCParser.CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POST_INC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOST_INC(miniCParser.POST_INCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INDEX}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINDEX(miniCParser.INDEXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POST_DEC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOST_DEC(miniCParser.POST_DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL11}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL11(miniCParser.NULL11Context ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#opt_actual_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_actual_param(miniCParser.Opt_actual_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACTUAL_PARA}
	 * labeled alternative in {@link miniCParser#actual_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACTUAL_PARA(miniCParser.ACTUAL_PARAContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#actual_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_param_list(miniCParser.Actual_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniCParser#primary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_exp(miniCParser.Primary_expContext ctx);
}