grammar Viper;

program: vStatement* EOF;

vStatement: vDeclaration
         | vAssignment
         | vBlock
         | vMethod
         | vReturn
         | vContinue
         | vBreak
         | vWhile
         | vIf
         | vSwitch
         | vClass
         | vUnaryOperation ';'
         | vMethodCall ';'
         | vNewObject ';'
         | vExpression ';'
         ;

vMethodCall: (V_IDENTIFIER '.')* V_IDENTIFIER '(' (vExpression (',' vExpression)*)? ')';

vClass: vAccess? V_CLASS_KW V_IDENTIFIER '{' (vDeclaration | vMethod)*'}';

vSwitch: V_SWITCH_KW '(' vExpression ')' '{' vCase+ '}';

vCase: V_CASE_KW vExpression ':' (vStatement ';' | vBlock);

vIf: V_IF_KW '('vCondition=vExpression ')' vBlock (V_ELSEIF_KW '(' vExpression ')' vBlock )* (V_ELSE_KW vBlock)?;

vWhile: V_WHILE_KW '(' vExpression ')' vBlock;

vBreak: V_BREAK_KW ';';

vContinue: V_CONTINUE_KW ';';

vReturn: V_RETURN_KW vExpression? ';';

vBlock: '{' vStatement* '}';

vAssignment: (vExpression '.')* vName=V_IDENTIFIER '=' vValue=vExpression ';';

vDeclaration: vAccess? V_STATIC_KW? vType vName=V_IDENTIFIER ';'                  #DecNull
           | vAccess? V_STATIC_KW? vType vName=V_IDENTIFIER '=' vExpression ';'   #DecAssign
           ;

vMethod: vAccess? vStatic=V_STATIC_KW? vReturnType=vType vName=V_IDENTIFIER '(' (vType V_IDENTIFIER (',' vType V_IDENTIFIER)*)? ')' vBlock;

vNewObject: V_NEW_KW vType '(' (vExpression (',' vExpression)*)? ')';

vExpression: '(' vExpression ')'                                                     #ExParentheses
          | vNewObject                                                               #ExNewObject
          | vMethodCall                                                              #ExMethodCall
          | vUnaryOperation                                                          #ExUnaryOp
          | vOp='-' vExpression                                                      #ExNegOp
          | vOp='!' vExpression                                                      #ExNegBoolOp
          | vLeft=vExpression vOp=('*' | '/' | '%') vRight=vExpression               #ExMulOp
          | vLeft=vExpression vOp=('&' | '^' | '|') vRight=vExpression               #ExBitOp
          | vLeft=vExpression vOp=('+' | '-') vRight=vExpression                     #ExAddOp
          | vLeft=vExpression vOp=('<<' | '>>') vRight=vExpression                   #ExBitShiftOp
          | vLeft=vExpression vOp=('<' | '<=' | '>' | '>=') vRight=vExpression       #ExCmprLe
          | vLeft=vExpression vOp=('==' | '!=') vRight=vExpression                   #ExCmprEq
          | vLeft=vExpression vOp='&&' vRight=vExpression                            #ExLogAndOp
          | vLeft=vExpression vOp='||' vRight=vExpression                            #ExLogOrOp
          | condition=vExpression '?' vThen=vExpression ':' vElse=vExpression        #ExTernary
          | V_THIS_KW                                                                #ExThisLiteral
          | V_FLOAT                                                                  #ExFloatLiteral
          | V_INT                                                                    #ExIntLiteral
          | V_BOOL                                                                   #ExBoolLiteral
          | V_STRING                                                                 #ExStringLiteral
          | (V_THIS_KW '.')? (V_IDENTIFIER '.')* V_IDENTIFIER                        #ExIdentifier
          ;


vUnaryOperation: (V_IDENTIFIER vOp=('++' | '--')) | (vOp=('++' | '--') V_IDENTIFIER);

vType: V_STRING_KW      #TypeString
       | V_BOOL_KW      #TypeBool
       | V_FLOAT_KW     #TypeFloat
       | V_INT_KW       #TypeInt
       | V_IDENTIFIER   #TypeObject
       ;

vAccess: V_PUBLIC_KW    #AccessPublic
       | V_PRIVATE_KW   #AccessPrivate
       ;

//translations
V_CLASS_KW: 'class';
V_CASE_KW: 'case';
V_SWITCH_KW: 'switch';
V_ELSE_KW: 'else';
V_ELSEIF_KW: 'elseif';
V_IF_KW: 'if';
V_BREAK_KW: 'break';
V_CONTINUE_KW: 'continue';
V_RETURN_KW: 'return';
V_NEW_KW: 'new';
V_STATIC_KW: 'static';
V_PUBLIC_KW: 'public';
V_PRIVATE_KW: 'private';
V_WHILE_KW: 'while';
V_THIS_KW: 'this';
V_STRING_KW: 'string';
V_BOOL_KW: 'bool';
V_FLOAT_KW: 'float';
V_INT_KW: 'int';

V_STRING: '"' .*?'"';
V_BOOL: 'true' | 'false';
V_FLOAT: '0.0' | [1-9][0-9]*'.'[0-9]+ | '0.'[0-9]*[1-9][0-9]*;
V_INT: '0' | [1-9][0-9]*;

V_IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;

V_WS: [\n\r\t ]+ -> skip;
V_COMMENT: '//'.*? [\n\r]+ -> skip;