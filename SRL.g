grammar SRL;

character :
    KEYW_UPPERCASE? KEYW_LITERALLY STRING
    | KEYW_DIGIT
    | KEYW_LETTER
    | (KEYW_ONE | KEYW_ANY) KEYW_OF STRING
    | (KEYW_ANY | KEYW_NO) KEYW_CHARACTER
    | KEYW_ANYHTING
    | KEYW_NEW KEYW_LINE
    | KEYW_NO? KEYW_WHITESPACE
    | KEYW_TAB
    | KEYW_RAW
    ;

specification :
    KEYW_FROM CHAR KEYW_TO CHAR
    | KEYW_FROM DIGIT KEYW_TO DIGIT
    ;

quantifier :
    KEYW_EXACTLY NUMBER KEYW_TIMES
    | KEYW_BETWEEN NUMBER KEYW_AND NUMBER KEYW_TIMES?
    | KEYW_OPTIONAL
    | KEYW_AT KEYW_LEAST NUMBER KEYW_TIMES?
    | (KEYW_ONCE | KEYW_NEVER) KEYW_OR KEYW_MORE
    ;

anchor :
    (KEYW_BEGINS | KEYW_STARTS) KEYW_WITH block
    | KEYW_MUST KEYW_END
    ;

character_stmt : character specification? quantifier? ;

if_stmt :
    KEYW_IF KEYW_NOT? (
        KEYW_FOLLOWED KEYW_BY block
        | KEYW_ALREADY KEYW_HAD block
    ) ;

flag :
    KEYW_CASE KEYW_INSENSITIVE
    | KEYW_MULTI KEYW_LINE
    | KEYW_ALL KEYW_LAZY
    ;

stmt : (character_stmt | group_stmt) if_stmt? | flag | anchor;
stmts: stmt (','? stmt)* ;
block : '(' stmts ')' | stmt | STRING ;
group_stmt :
    KEYW_CAPTURE block (KEYW_AS STRING)? (KEYW_UNTIL STRING)?
    | KEYW_ANY KEYW_OF block quantifier?;

// Keyword characters
A : [Aa] ;
B : [Bb] ;
C : [Cc] ;
D : [Dd] ;
E : [Ee] ;
F : [Ff] ;
G : [Gg] ;
H : [Hh] ;
I : [Ii] ;
J : [Jj] ;
K : [Kk] ;
L : [Ll] ;
M : [Mm] ;
N : [Nn] ;
O : [Oo] ;
P : [Pp] ;
Q : [Qq] ;
R : [Rr] ;
S : [Ss] ;
T : [Tt] ;
U : [Uu] ;
V : [Vv] ;
W : [Ww] ;
X : [Xx] ;
Y : [Yy] ;
Z : [Zz] ;

// Keywords
KEYW_FROM : F R O M ;
KEYW_LITERALLY : L I T E R A L L Y ;
KEYW_DIGIT : D I G I T ;
KEYW_LETTER : L E T T E R ;
KEYW_UPPERCASE : U P P E R C A S E ;
KEYW_OF : O F ;
KEYW_ONE : O N E ;
KEYW_ANY : A N Y ;
KEYW_NO : N O ;
KEYW_CHARACTER : C H A R A C T E R ;
KEYW_ANYHTING : A N Y T H I N G ;
KEYW_NEW : N E W ;
KEYW_LINE : L I N E ;
KEYW_WHITESPACE : W H I T E S P A C E ;
KEYW_TAB : T A B ;
KEYW_RAW : R A W ;
KEYW_TO : T O ;
KEYW_EXACTLY : E X A C T L Y ;
KEYW_TIMES : T I M E S ;
KEYW_BETWEEN : B E T W E E N ;
KEYW_AND : A N D ;
KEYW_OPTIONAL : O P T I O N A L ;
KEYW_ONCE : O N C E ;
KEYW_NEVER : N E V E R ;
KEYW_MORE : M O R E ;
KEYW_OR : O R ;
KEYW_AT : A T ;
KEYW_LEAST : L E A S T ;
KEYW_CAPTURE : C A P T U R E ;
KEYW_AS : A S ;
KEYW_UNTIL : U N T I L ;
KEYW_IF : I F ;
KEYW_FOLLOWED : F O L L O W E D ;
KEYW_BY : B Y ;
KEYW_NOT : N O T ;
KEYW_ALREADY : A L R E A D Y ;
KEYW_HAD : H A D ;
KEYW_CASE : C A S E ;
KEYW_INSENSITIVE : I N S E N S I T I V E ;
KEYW_MULTI : M U L T I ;
KEYW_ALL : A L L ;
KEYW_LAZY : L A Z Y ;
KEYW_BEGINS : B E G I N S? ;
KEYW_STARTS : S T A R T S ;
KEYW_WITH : W I T H ;
KEYW_MUST : M U S T ;
KEYW_END : E N D ;

// Literals
DIGIT : '0' .. '9' ;
NUMBER : '1' .. '9' DIGIT+ ;
CHAR : ('a' .. 'z') | ('A' .. 'Z') ;

STRING :
    '"' ~('\r' | '\n')* '"'
    | '\'' ~('\r' | '\n')* '\''
    ;
WHITESPACE : (' ' | '\t' | '\r' | '\n')+ -> skip ;
