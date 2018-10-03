/* Generated By:JavaCC: Do not edit this line. CPPParserConstants.java */
package net.sourceforge.pmd.cpd.cppast;

public interface CPPParserConstants {

  int EOF = 0;
  int LCURLYBRACE = 14;
  int RCURLYBRACE = 15;
  int LSQUAREBRACKET = 16;
  int RSQUAREBRACKET = 17;
  int LPARENTHESIS = 18;
  int RPARENTHESIS = 19;
  int SCOPE = 20;
  int COLON = 21;
  int SEMICOLON = 22;
  int COMMA = 23;
  int QUESTIONMARK = 24;
  int ELLIPSIS = 25;
  int ASSIGNEQUAL = 26;
  int TIMESEQUAL = 27;
  int DIVIDEEQUAL = 28;
  int MODEQUAL = 29;
  int PLUSEQUAL = 30;
  int MINUSEQUAL = 31;
  int SHIFTLEFTEQUAL = 32;
  int SHIFTRIGHTEQUAL = 33;
  int BITWISEANDEQUAL = 34;
  int BITWISEXOREQUAL = 35;
  int BITWISEOREQUAL = 36;
  int OR = 37;
  int AND = 38;
  int BITWISEOR = 39;
  int BITWISEXOR = 40;
  int AMPERSAND = 41;
  int EQUAL = 42;
  int NOTEQUAL = 43;
  int LESSTHAN = 44;
  int GREATERTHAN = 45;
  int LESSTHANOREQUALTO = 46;
  int GREATERTHANOREQUALTO = 47;
  int SHIFTLEFT = 48;
  int SHIFTRIGHT = 49;
  int PLUS = 50;
  int MINUS = 51;
  int STAR = 52;
  int DIVIDE = 53;
  int MOD = 54;
  int PLUSPLUS = 55;
  int MINUSMINUS = 56;
  int TILDE = 57;
  int NOT = 58;
  int DOT = 59;
  int POINTERTO = 60;
  int DOTSTAR = 61;
  int ARROWSTAR = 62;
  int AUTO = 63;
  int BREAK = 64;
  int CASE = 65;
  int CATCH = 66;
  int CHAR = 67;
  int CONST = 68;
  int CONTINUE = 69;
  int _DEFAULT = 70;
  int DELETE = 71;
  int DO = 72;
  int DOUBLE = 73;
  int ELSE = 74;
  int ENUM = 75;
  int EXTERN = 76;
  int FLOAT = 77;
  int FOR = 78;
  int FRIEND = 79;
  int GOTO = 80;
  int IF = 81;
  int INLINE = 82;
  int INT = 83;
  int LONG = 84;
  int NEW = 85;
  int PRIVATE = 86;
  int PROTECTED = 87;
  int PUBLIC = 88;
  int REDECLARED = 89;
  int REGISTER = 90;
  int RETURN = 91;
  int SHORT = 92;
  int SIGNED = 93;
  int SIZEOF = 94;
  int STATIC = 95;
  int STRUCT = 96;
  int CLASS = 97;
  int SWITCH = 98;
  int TEMPLATE = 99;
  int THIS = 100;
  int TRY = 101;
  int TYPEDEF = 102;
  int UNION = 103;
  int UNSIGNED = 104;
  int VIRTUAL = 105;
  int VOID = 106;
  int VOLATILE = 107;
  int WHILE = 108;
  int OPERATOR = 109;
  int TRUETOK = 110;
  int FALSETOK = 111;
  int THROW = 112;
  int OCTALINT = 113;
  int OCTALLONG = 114;
  int UNSIGNED_OCTALINT = 115;
  int UNSIGNED_OCTALLONG = 116;
  int DECIMALINT = 117;
  int DECIMALLONG = 118;
  int UNSIGNED_DECIMALINT = 119;
  int UNSIGNED_DECIMALLONG = 120;
  int HEXADECIMALINT = 121;
  int HEXADECIMALLONG = 122;
  int UNSIGNED_HEXADECIMALINT = 123;
  int UNSIGNED_HEXADECIMALLONG = 124;
  int FLOATONE = 125;
  int FLOATTWO = 126;
  int CHARACTER = 127;
  int STRING = 128;
  int ID = 130;

  int DEFAULT = 0;
  int IN_LINE_COMMENT = 1;
  int IN_COMMENT = 2;
  int PREPROCESSOR_OUTPUT = 3;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\\n\"",
    "\"\\n\"",
    "\"//\"",
    "\"/*\"",
    "\"#\"",
    "\"\\n\"",
    "<token of kind 9>",
    "\"*/\"",
    "<token of kind 11>",
    "\"\\n\"",
    "<token of kind 13>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"::\"",
    "\":\"",
    "\";\"",
    "\",\"",
    "\"?\"",
    "\"...\"",
    "\"=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"+=\"",
    "\"-=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"&=\"",
    "\"^=\"",
    "\"|=\"",
    "\"||\"",
    "\"&&\"",
    "\"|\"",
    "\"^\"",
    "\"&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"<<\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"~\"",
    "\"!\"",
    "\".\"",
    "\"->\"",
    "\".*\"",
    "\"->*\"",
    "\"auto\"",
    "\"break\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"const\"",
    "\"continue\"",
    "\"default\"",
    "\"delete\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"extern\"",
    "\"float\"",
    "\"for\"",
    "\"friend\"",
    "\"goto\"",
    "\"if\"",
    "\"inline\"",
    "\"int\"",
    "\"long\"",
    "\"new\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"redeclared\"",
    "\"register\"",
    "\"return\"",
    "\"short\"",
    "\"signed\"",
    "\"sizeof\"",
    "\"static\"",
    "\"struct\"",
    "\"class\"",
    "\"switch\"",
    "\"template\"",
    "\"this\"",
    "\"try\"",
    "\"typedef\"",
    "\"union\"",
    "\"unsigned\"",
    "\"virtual\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "\"operator\"",
    "\"true\"",
    "\"false\"",
    "\"throw\"",
    "<OCTALINT>",
    "<OCTALLONG>",
    "<UNSIGNED_OCTALINT>",
    "<UNSIGNED_OCTALLONG>",
    "<DECIMALINT>",
    "<DECIMALLONG>",
    "<UNSIGNED_DECIMALINT>",
    "<UNSIGNED_DECIMALLONG>",
    "<HEXADECIMALINT>",
    "<HEXADECIMALLONG>",
    "<UNSIGNED_HEXADECIMALINT>",
    "<UNSIGNED_HEXADECIMALLONG>",
    "<FLOATONE>",
    "<FLOATTWO>",
    "<CHARACTER>",
    "<STRING>",
    "\"finally\"",
    "<ID>",
  };

}
