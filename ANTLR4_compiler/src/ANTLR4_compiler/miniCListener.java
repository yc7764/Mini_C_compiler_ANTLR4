// Generated from miniC.g4 by ANTLR 4.9.2
package ANTLR4_compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniCParser}.
 */
public interface miniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PROGRAM}
	 * labeled alternative in {@link miniCParser#mini_c}.
	 * @param ctx the parse tree
	 */
	void enterPROGRAM(miniCParser.PROGRAMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROGRAM}
	 * labeled alternative in {@link miniCParser#mini_c}.
	 * @param ctx the parse tree
	 */
	void exitPROGRAM(miniCParser.PROGRAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(miniCParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(miniCParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#external_dcl}.
	 * @param ctx the parse tree
	 */
	void enterExternal_dcl(miniCParser.External_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#external_dcl}.
	 * @param ctx the parse tree
	 */
	void exitExternal_dcl(miniCParser.External_dclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNC_DEF}
	 * labeled alternative in {@link miniCParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFUNC_DEF(miniCParser.FUNC_DEFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNC_DEF}
	 * labeled alternative in {@link miniCParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFUNC_DEF(miniCParser.FUNC_DEFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNC_HEAD}
	 * labeled alternative in {@link miniCParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFUNC_HEAD(miniCParser.FUNC_HEADContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNC_HEAD}
	 * labeled alternative in {@link miniCParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFUNC_HEAD(miniCParser.FUNC_HEADContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL_SPECI}
	 * labeled alternative in {@link miniCParser#dcl_spec}.
	 * @param ctx the parse tree
	 */
	void enterDCL_SPECI(miniCParser.DCL_SPECIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL_SPECI}
	 * labeled alternative in {@link miniCParser#dcl_spec}.
	 * @param ctx the parse tree
	 */
	void exitDCL_SPECI(miniCParser.DCL_SPECIContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#dcl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDcl_specifiers(miniCParser.Dcl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#dcl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDcl_specifiers(miniCParser.Dcl_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#dcl_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDcl_specifier(miniCParser.Dcl_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#dcl_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDcl_specifier(miniCParser.Dcl_specifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONST_NODE}
	 * labeled alternative in {@link miniCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterCONST_NODE(miniCParser.CONST_NODEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONST_NODE}
	 * labeled alternative in {@link miniCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitCONST_NODE(miniCParser.CONST_NODEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterINT_NODE(miniCParser.INT_NODEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitINT_NODE(miniCParser.INT_NODEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VOID_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterVOID_NODE(miniCParser.VOID_NODEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VOID_NODE}
	 * labeled alternative in {@link miniCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitVOID_NODE(miniCParser.VOID_NODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(miniCParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(miniCParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMAL_PARA}
	 * labeled alternative in {@link miniCParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFORMAL_PARA(miniCParser.FORMAL_PARAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMAL_PARA}
	 * labeled alternative in {@link miniCParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFORMAL_PARA(miniCParser.FORMAL_PARAContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#opt_formal_param}.
	 * @param ctx the parse tree
	 */
	void enterOpt_formal_param(miniCParser.Opt_formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#opt_formal_param}.
	 * @param ctx the parse tree
	 */
	void exitOpt_formal_param(miniCParser.Opt_formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#formal_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param_list(miniCParser.Formal_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#formal_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param_list(miniCParser.Formal_param_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARA_DCL}
	 * labeled alternative in {@link miniCParser#param_dcl}.
	 * @param ctx the parse tree
	 */
	void enterPARA_DCL(miniCParser.PARA_DCLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARA_DCL}
	 * labeled alternative in {@link miniCParser#param_dcl}.
	 * @param ctx the parse tree
	 */
	void exitPARA_DCL(miniCParser.PARA_DCLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPOUND_STAT}
	 * labeled alternative in {@link miniCParser#compound_st}.
	 * @param ctx the parse tree
	 */
	void enterCOMPOUND_STAT(miniCParser.COMPOUND_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPOUND_STAT}
	 * labeled alternative in {@link miniCParser#compound_st}.
	 * @param ctx the parse tree
	 */
	void exitCOMPOUND_STAT(miniCParser.COMPOUND_STATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL_LIST}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 */
	void enterDCL_LIST(miniCParser.DCL_LISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL_LIST}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 */
	void exitDCL_LIST(miniCParser.DCL_LISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL1}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 */
	void enterNULL1(miniCParser.NULL1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL1}
	 * labeled alternative in {@link miniCParser#opt_dcl_list}.
	 * @param ctx the parse tree
	 */
	void exitNULL1(miniCParser.NULL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(miniCParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(miniCParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link miniCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDCL(miniCParser.DCLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link miniCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDCL(miniCParser.DCLContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#init_dcl_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_dcl_list(miniCParser.Init_dcl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#init_dcl_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_dcl_list(miniCParser.Init_dcl_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL_ITEM}
	 * labeled alternative in {@link miniCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDCL_ITEM(miniCParser.DCL_ITEMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL_ITEM}
	 * labeled alternative in {@link miniCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDCL_ITEM(miniCParser.DCL_ITEMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SIMPLE_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterSIMPLE_VAR(miniCParser.SIMPLE_VARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SIMPLE_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitSIMPLE_VAR(miniCParser.SIMPLE_VARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_VAR(miniCParser.ARRAY_VARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_VAR}
	 * labeled alternative in {@link miniCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_VAR(miniCParser.ARRAY_VARContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#opt_number}.
	 * @param ctx the parse tree
	 */
	void enterOpt_number(miniCParser.Opt_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#opt_number}.
	 * @param ctx the parse tree
	 */
	void exitOpt_number(miniCParser.Opt_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STAT_LIST}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 */
	void enterSTAT_LIST(miniCParser.STAT_LISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STAT_LIST}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 */
	void exitSTAT_LIST(miniCParser.STAT_LISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL2}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 */
	void enterNULL2(miniCParser.NULL2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL2}
	 * labeled alternative in {@link miniCParser#opt_stat_list}.
	 * @param ctx the parse tree
	 */
	void exitNULL2(miniCParser.NULL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(miniCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(miniCParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP_STAT}
	 * labeled alternative in {@link miniCParser#expression_st}.
	 * @param ctx the parse tree
	 */
	void enterEXP_STAT(miniCParser.EXP_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP_STAT}
	 * labeled alternative in {@link miniCParser#expression_st}.
	 * @param ctx the parse tree
	 */
	void exitEXP_STAT(miniCParser.EXP_STATContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#opt_expression}.
	 * @param ctx the parse tree
	 */
	void enterOpt_expression(miniCParser.Opt_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#opt_expression}.
	 * @param ctx the parse tree
	 */
	void exitOpt_expression(miniCParser.Opt_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 */
	void enterIF_STAT(miniCParser.IF_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 */
	void exitIF_STAT(miniCParser.IF_STATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_ELSE_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 */
	void enterIF_ELSE_STAT(miniCParser.IF_ELSE_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_ELSE_STAT}
	 * labeled alternative in {@link miniCParser#if_st}.
	 * @param ctx the parse tree
	 */
	void exitIF_ELSE_STAT(miniCParser.IF_ELSE_STATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILE_STAT}
	 * labeled alternative in {@link miniCParser#while_st}.
	 * @param ctx the parse tree
	 */
	void enterWHILE_STAT(miniCParser.WHILE_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILE_STAT}
	 * labeled alternative in {@link miniCParser#while_st}.
	 * @param ctx the parse tree
	 */
	void exitWHILE_STAT(miniCParser.WHILE_STATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURN_STAT}
	 * labeled alternative in {@link miniCParser#return_st}.
	 * @param ctx the parse tree
	 */
	void enterRETURN_STAT(miniCParser.RETURN_STATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURN_STAT}
	 * labeled alternative in {@link miniCParser#return_st}.
	 * @param ctx the parse tree
	 */
	void exitRETURN_STAT(miniCParser.RETURN_STATContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miniCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miniCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL3}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL3(miniCParser.NULL3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL3}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL3(miniCParser.NULL3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN_OP}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN_OP(miniCParser.ASSIGN_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN_OP}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN_OP(miniCParser.ASSIGN_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterADD_ASSIGN(miniCParser.ADD_ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitADD_ASSIGN(miniCParser.ADD_ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUB_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterSUB_ASSIGN(miniCParser.SUB_ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUB_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitSUB_ASSIGN(miniCParser.SUB_ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterMUL_ASSIGN(miniCParser.MUL_ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitMUL_ASSIGN(miniCParser.MUL_ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterDIV_ASSIGN(miniCParser.DIV_ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitDIV_ASSIGN(miniCParser.DIV_ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void enterMOD_ASSIGN(miniCParser.MOD_ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOD_ASSIGN}
	 * labeled alternative in {@link miniCParser#assignment_exp}.
	 * @param ctx the parse tree
	 */
	void exitMOD_ASSIGN(miniCParser.MOD_ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_OR}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_OR(miniCParser.LOGICAL_ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_OR}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_OR(miniCParser.LOGICAL_ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL4}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL4(miniCParser.NULL4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL4}
	 * labeled alternative in {@link miniCParser#logical_or_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL4(miniCParser.NULL4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_AND}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_AND(miniCParser.LOGICAL_ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_AND}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_AND(miniCParser.LOGICAL_ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL5}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL5(miniCParser.NULL5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL5}
	 * labeled alternative in {@link miniCParser#logical_and_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL5(miniCParser.NULL5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NE}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void enterNE(miniCParser.NEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NE}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void exitNE(miniCParser.NEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void enterEQ(miniCParser.EQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void exitEQ(miniCParser.EQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL6}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL6(miniCParser.NULL6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL6}
	 * labeled alternative in {@link miniCParser#equality_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL6(miniCParser.NULL6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL7}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL7(miniCParser.NULL7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL7}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL7(miniCParser.NULL7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void enterLT(miniCParser.LTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void exitLT(miniCParser.LTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void enterLE(miniCParser.LEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void exitLE(miniCParser.LEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void enterGT(miniCParser.GTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void exitGT(miniCParser.GTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void enterGE(miniCParser.GEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniCParser#relational_exp}.
	 * @param ctx the parse tree
	 */
	void exitGE(miniCParser.GEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void enterADD(miniCParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void exitADD(miniCParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void enterSUB(miniCParser.SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void exitSUB(miniCParser.SUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL8}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL8(miniCParser.NULL8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL8}
	 * labeled alternative in {@link miniCParser#additive_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL8(miniCParser.NULL8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL9}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL9(miniCParser.NULL9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL9}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL9(miniCParser.NULL9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void enterDIV(miniCParser.DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void exitDIV(miniCParser.DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void enterMOD(miniCParser.MODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void exitMOD(miniCParser.MODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void enterMUL(miniCParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniCParser#multiplicative_exp}.
	 * @param ctx the parse tree
	 */
	void exitMUL(miniCParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL10}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL10(miniCParser.NULL10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL10}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL10(miniCParser.NULL10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UNARY_MINUS}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void enterUNARY_MINUS(miniCParser.UNARY_MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNARY_MINUS}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void exitUNARY_MINUS(miniCParser.UNARY_MINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_NOT}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_NOT(miniCParser.LOGICAL_NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_NOT}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_NOT(miniCParser.LOGICAL_NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRE_INC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void enterPRE_INC(miniCParser.PRE_INCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRE_INC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void exitPRE_INC(miniCParser.PRE_INCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRE_DEC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void enterPRE_DEC(miniCParser.PRE_DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRE_DEC}
	 * labeled alternative in {@link miniCParser#unary_exp}.
	 * @param ctx the parse tree
	 */
	void exitPRE_DEC(miniCParser.PRE_DECContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void enterCALL(miniCParser.CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void exitCALL(miniCParser.CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POST_INC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void enterPOST_INC(miniCParser.POST_INCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POST_INC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void exitPOST_INC(miniCParser.POST_INCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INDEX}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void enterINDEX(miniCParser.INDEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INDEX}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void exitINDEX(miniCParser.INDEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POST_DEC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void enterPOST_DEC(miniCParser.POST_DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POST_DEC}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void exitPOST_DEC(miniCParser.POST_DECContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL11}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void enterNULL11(miniCParser.NULL11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL11}
	 * labeled alternative in {@link miniCParser#postfix_exp}.
	 * @param ctx the parse tree
	 */
	void exitNULL11(miniCParser.NULL11Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#opt_actual_param}.
	 * @param ctx the parse tree
	 */
	void enterOpt_actual_param(miniCParser.Opt_actual_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#opt_actual_param}.
	 * @param ctx the parse tree
	 */
	void exitOpt_actual_param(miniCParser.Opt_actual_paramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACTUAL_PARA}
	 * labeled alternative in {@link miniCParser#actual_param}.
	 * @param ctx the parse tree
	 */
	void enterACTUAL_PARA(miniCParser.ACTUAL_PARAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACTUAL_PARA}
	 * labeled alternative in {@link miniCParser#actual_param}.
	 * @param ctx the parse tree
	 */
	void exitACTUAL_PARA(miniCParser.ACTUAL_PARAContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#actual_param_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_param_list(miniCParser.Actual_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#actual_param_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_param_list(miniCParser.Actual_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#primary_exp}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_exp(miniCParser.Primary_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#primary_exp}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_exp(miniCParser.Primary_expContext ctx);
}