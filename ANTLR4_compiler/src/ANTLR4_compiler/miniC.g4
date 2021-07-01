grammar miniC;
mini_c				: translation_unit						#PROGRAM;
translation_unit	: external_dcl
			    	| translation_unit external_dcl;
external_dcl		: function_def
			 		| declaration;
function_def		: function_header compound_st			#FUNC_DEF;
function_header		: dcl_spec function_name formal_param	#FUNC_HEAD;
dcl_spec			: dcl_specifiers						#DCL_SPECI;
dcl_specifiers		: dcl_specifier
			 		| dcl_specifiers dcl_specifier;
dcl_specifier		: type_qualifier
		    		| type_specifier;
type_qualifier		: 'const'								#CONST_NODE;
type_specifier		: 'int'									#INT_NODE
		    		| 'void'								#VOID_NODE;
function_name		: IDENT;
formal_param		: '(' opt_formal_param ')'				#FORMAL_PARAMETER;
opt_formal_param	: formal_param_list
					| ;
formal_param_list	: param_dcl
					| formal_param_list ',' param_dcl;
param_dcl			: dcl_spec declarator					#PARAMETER_DCL;
compound_st			: '{' opt_dcl_list opt_stat_list '}'	#COMPOUND_STMT;
opt_dcl_list		: declaration_list						#DCL_LIST
					| 										#NULL1;
declaration_list	: declaration
					| declaration_list declaration;
declaration			: dcl_spec init_dcl_list ';'			#DCL;
init_dcl_list		: init_declarator
					| init_dcl_list ',' init_declarator;
init_declarator		: declarator							#DCL_ITEM
					| declarator '=' NUMBER					#DCL_ITEM;
declarator			: IDENT									#SIMPLE_VAR
			 		| IDENT '[' opt_number ']'				#ARRAY_VAR;
opt_number			: NUMBER
					| ;
opt_stat_list		: statement_list						#STMT_LIST
					| 										#NULL2;
statement_list		: statement
				 	| statement_list statement;
statement			: compound_st
			 		| expression_st
			 		| if_st
			 		| while_st
			 		| return_st;
expression_st		: opt_expression ';'					#EXP_STMT;
opt_expression		: expression?;
if_st				: 'if' '(' expression ')' statement		#IF_STMT
			 		| 'if' '(' expression ')' statement 'else' statement	#IF_ELSE_STMT;
while_st			: 'while' '(' expression ')' statement	#WHILE_STMT;
return_st			: 'return' opt_expression ';'			#RETURN_STMT;
expression			: assignment_exp;
assignment_exp		: logical_or_exp						#NULL3
			 		| unary_exp '=' assignment_exp			#ASSIGN
			 		| unary_exp '+=' assignment_exp			#ADD_ASSIGN
			 		| unary_exp '-=' assignment_exp			#SUB_ASSIGN
			 		| unary_exp '*=' assignment_exp			#MUL_ASSIGN
			 		| unary_exp '/=' assignment_exp			#DIV_ASSIGN
			 		| unary_exp '%=' assignment_exp			#MOD_ASSIGN;
logical_or_exp		: logical_and_exp						#NULL4
			 		| logical_or_exp '||' logical_and_exp	#LOGICAL_OR;
logical_and_exp		: equality_exp							#NULL5
			 		| logical_and_exp '&&' equality_exp		#LOGICAL_AND;
equality_exp		: relational_exp						#NULL6
			 		| equality_exp '==' relational_exp		#EQ
			 		| equality_exp '!=' relational_exp		#NE;
relational_exp		: additive_exp							#NULL7
			 		| relational_exp '>' additive_exp		#GT
			 		| relational_exp '<' additive_exp		#LT
			 		| relational_exp '>=' additive_exp		#GE
			 		| relational_exp '<=' additive_exp		#LE;
additive_exp		: multiplicative_exp					#NULL8
			 		| additive_exp '+' multiplicative_exp	#ADD
			 		| additive_exp '-' multiplicative_exp	#SUB;
multiplicative_exp	: unary_exp								#NULL9
			 		| multiplicative_exp '*' unary_exp		#MUL
			 		| multiplicative_exp '/' unary_exp		#DIV
			 		| multiplicative_exp '%' unary_exp		#MOD;
unary_exp			: postfix_exp							#NULL10
			 		| '-' unary_exp							#UNARY_MINUS
			 		| '!' unary_exp							#LOGICAL_NOT
			 		| '++' unary_exp						#PRE_INC
			 		| '--' unary_exp						#PRE_DEC;
postfix_exp			: primary_exp							#NULL11
			 		| postfix_exp '[' expression ']'		#INDEX
			 		| postfix_exp '(' opt_actual_param ')'	#CALL
			 		| postfix_exp '++'						#POST_INC
			 		| postfix_exp '--'						#POST_DEC;
opt_actual_param 	: actual_param
					| ;
actual_param		: actual_param_list						#ACTUAL_PARAMETER;
actual_param_list	: assignment_exp
			 		| actual_param_list ',' assignment_exp;
primary_exp			: IDENT
			 		| NUMBER
			 		| '(' expression ')';
WS					: [ \t\r\n]+ -> skip;
IDENT				: [a-z] ([0-9] | [a-z])*;
NUMBER				: [0-9]+;