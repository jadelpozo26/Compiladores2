/* The following code was generated by JFlex 1.4.3 on 27/11/18 05:59 PM */

package analizador;
import static analizador.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/11/18 05:59 PM from the specification file
 * <tt>C:/Users/jadel/Desktop/Compiladores-master/MiniC#/src/analizador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\70\1\23\2\0\1\70\22\0\1\70\1\55\1\22\2\0"+
    "\1\51\1\56\1\0\1\64\1\65\1\47\1\46\1\61\1\21\1\17"+
    "\1\50\1\12\1\16\10\11\1\0\1\60\1\52\1\53\1\54\2\0"+
    "\1\44\1\15\2\14\1\20\1\14\7\24\1\43\11\24\1\13\2\24"+
    "\1\62\1\0\1\63\1\0\1\71\1\0\1\6\1\32\1\34\1\30"+
    "\1\4\1\5\1\33\1\35\1\27\1\24\1\42\1\7\1\37\1\31"+
    "\1\26\1\40\1\24\1\2\1\10\1\1\1\3\1\25\1\41\1\36"+
    "\1\45\1\24\1\66\1\57\1\67\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\6\2\2\3\1\4\1\5\1\1\1\6"+
    "\10\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\2\1\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\10\2\1\30\3\0\1\31\1\2"+
    "\1\32\11\2\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\6\2\1\46\1\2"+
    "\1\0\2\3\1\2\1\47\7\2\1\50\2\0\1\51"+
    "\1\52\1\2\1\53\2\2\1\30\1\0\1\54\3\2"+
    "\1\55\1\2\1\56\3\2\1\57\6\2\1\60\1\61"+
    "\1\62\1\2\1\63\1\2\1\64\2\2\1\65\1\2"+
    "\1\66\5\2\1\67\1\70\1\2\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\72\0\72\0\u0244\0\72\0\u027e\0\u02b8"+
    "\0\u02f2\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\72\0\72"+
    "\0\u044e\0\72\0\u0488\0\u04c2\0\u04fc\0\u0536\0\u0570\0\u05aa"+
    "\0\72\0\72\0\u05e4\0\72\0\u061e\0\72\0\u0658\0\72"+
    "\0\72\0\u0692\0\u06cc\0\u0706\0\u0740\0\u077a\0\u07b4\0\u07ee"+
    "\0\u0828\0\u0862\0\u089c\0\u08d6\0\u0244\0\u0244\0\u0910\0\350"+
    "\0\u094a\0\u0984\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0"+
    "\0\u0b1a\0\u0b54\0\u0b8e\0\72\0\72\0\72\0\72\0\72"+
    "\0\72\0\72\0\72\0\72\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76"+
    "\0\u0cb0\0\u0cea\0\350\0\u0d24\0\u0d5e\0\u089c\0\u08d6\0\u0d98"+
    "\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68"+
    "\0\u0fa2\0\u0fdc\0\u1016\0\350\0\350\0\u1050\0\350\0\u108a"+
    "\0\u10c4\0\u10fe\0\u10fe\0\350\0\u1138\0\u1172\0\u11ac\0\350"+
    "\0\u11e6\0\350\0\u1220\0\u125a\0\u1294\0\72\0\u12ce\0\u1308"+
    "\0\u1342\0\u137c\0\u13b6\0\u13f0\0\350\0\350\0\350\0\u142a"+
    "\0\350\0\u1464\0\350\0\u149e\0\u14d8\0\350\0\u1512\0\350"+
    "\0\u154c\0\u1586\0\u15c0\0\u15fa\0\u1634\0\350\0\350\0\u166e"+
    "\0\350";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\5\1\10"+
    "\1\11\1\12\3\5\1\11\1\13\1\5\1\14\1\15"+
    "\1\16\1\5\1\17\1\5\1\20\1\21\1\22\1\23"+
    "\1\5\1\24\4\5\1\25\1\5\1\26\2\5\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\2\73\0\1\5\1\52\14\5\1\0"+
    "\1\5\3\0\11\5\1\53\10\5\23\0\1\5\1\0"+
    "\3\5\1\54\12\5\1\0\1\5\3\0\22\5\23\0"+
    "\1\5\1\0\16\5\1\0\1\5\3\0\22\5\23\0"+
    "\1\5\1\0\6\5\1\55\7\5\1\0\1\5\3\0"+
    "\12\5\1\56\7\5\23\0\1\5\1\0\5\5\1\57"+
    "\10\5\1\0\1\5\3\0\2\5\1\60\17\5\23\0"+
    "\1\5\1\0\1\61\15\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\11\0\2\11\3\0\1\11\1\62\63\0"+
    "\2\11\1\63\1\0\1\64\1\11\1\62\12\0\1\64"+
    "\3\0\1\63\33\0\22\65\1\66\1\0\46\65\1\0"+
    "\16\5\1\0\1\5\3\0\2\5\1\67\17\5\23\0"+
    "\1\5\1\0\4\5\1\70\11\5\1\0\1\5\3\0"+
    "\5\5\1\71\5\5\1\72\6\5\23\0\1\5\1\0"+
    "\16\5\1\0\1\5\3\0\2\5\1\73\17\5\23\0"+
    "\1\5\1\0\2\5\1\74\13\5\1\0\1\5\3\0"+
    "\22\5\23\0\1\5\1\0\1\5\1\75\14\5\1\0"+
    "\1\5\3\0\2\5\1\76\17\5\23\0\1\5\1\0"+
    "\6\5\1\77\7\5\1\0\1\5\3\0\22\5\23\0"+
    "\1\5\1\0\16\5\1\0\1\5\3\0\11\5\1\100"+
    "\10\5\23\0\1\5\1\0\3\5\1\101\12\5\1\0"+
    "\1\5\3\0\22\5\23\0\1\5\47\0\1\102\1\103"+
    "\74\0\1\104\71\0\1\105\71\0\1\106\71\0\1\107"+
    "\74\0\1\110\72\0\1\111\75\0\1\112\73\0\1\113"+
    "\73\0\1\114\3\0\2\5\1\115\13\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\16\5\1\0\1\5"+
    "\3\0\3\5\1\116\16\5\23\0\1\5\1\0\1\117"+
    "\15\5\1\0\1\5\3\0\22\5\23\0\1\5\1\0"+
    "\7\5\1\120\6\5\1\0\1\5\3\0\22\5\23\0"+
    "\1\5\1\0\1\121\15\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\6\5\1\122\7\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\1\5\1\123\14\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\1\5"+
    "\1\124\14\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\4\0\1\125\4\0\2\62\3\0\1\62\1\0\1\125"+
    "\55\0\3\126\2\0\2\126\1\0\3\126\1\0\1\126"+
    "\7\0\1\126\1\0\1\126\1\0\1\126\7\0\1\126"+
    "\37\0\1\127\3\0\1\127\54\0\16\5\1\0\1\5"+
    "\3\0\3\5\1\130\16\5\23\0\1\5\1\0\1\131"+
    "\15\5\1\0\1\5\3\0\22\5\23\0\1\5\1\0"+
    "\16\5\1\0\1\5\3\0\14\5\1\132\5\5\23\0"+
    "\1\5\1\0\2\5\1\133\13\5\1\0\1\5\3\0"+
    "\22\5\23\0\1\5\1\0\6\5\1\134\7\5\1\0"+
    "\1\5\3\0\22\5\23\0\1\5\1\0\3\5\1\135"+
    "\12\5\1\0\1\5\3\0\22\5\23\0\1\5\1\0"+
    "\16\5\1\0\1\5\3\0\2\5\1\136\17\5\23\0"+
    "\1\5\1\0\5\5\1\137\10\5\1\0\1\5\3\0"+
    "\22\5\23\0\1\5\1\0\16\5\1\0\1\5\3\0"+
    "\3\5\1\140\16\5\23\0\1\5\1\0\16\5\1\0"+
    "\1\5\3\0\15\5\1\141\4\5\23\0\1\5\47\102"+
    "\1\142\1\143\21\102\23\103\1\0\46\103\1\0\3\5"+
    "\1\144\12\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\7\5\1\145\6\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\2\5\1\146\13\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\3\5\1\147\12\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\3\5"+
    "\1\150\12\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\7\5\1\115\6\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\16\5\1\0\1\5\3\0\3\5"+
    "\1\151\16\5\23\0\1\5\11\0\2\152\3\0\1\152"+
    "\2\0\1\153\24\0\1\153\24\0\16\5\1\0\1\5"+
    "\3\0\4\5\1\154\15\5\23\0\1\5\1\0\3\5"+
    "\1\155\12\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\6\5\1\156\7\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\16\5\1\0\1\5\3\0\6\5"+
    "\1\157\13\5\23\0\1\5\1\0\6\5\1\160\7\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\5\5"+
    "\1\161\10\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\6\5\1\162\7\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\7\5\1\163\6\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\6\5\1\164\7\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\16\5"+
    "\1\0\1\5\3\0\20\5\1\165\1\5\23\0\1\5"+
    "\47\143\1\142\1\166\70\143\1\142\22\143\1\0\1\5"+
    "\1\167\14\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\16\5\1\0\1\5\3\0\5\5\1\170\14\5"+
    "\23\0\1\5\1\0\16\5\1\0\1\5\3\0\5\5"+
    "\1\171\14\5\23\0\1\5\11\0\2\152\3\0\1\152"+
    "\54\0\1\5\1\172\14\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\3\5\1\173\12\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\6\5\1\174\7\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\16\5"+
    "\1\0\1\5\3\0\16\5\1\175\3\5\23\0\1\5"+
    "\1\0\7\5\1\176\6\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\3\5\1\177\12\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\1\5\1\200\14\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\16\5"+
    "\1\0\1\5\3\0\5\5\1\201\14\5\23\0\1\5"+
    "\1\0\16\5\1\0\1\5\3\0\4\5\1\202\15\5"+
    "\23\0\1\5\1\0\16\5\1\0\1\5\3\0\7\5"+
    "\1\203\12\5\23\0\1\5\1\0\4\5\1\204\11\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\16\5"+
    "\1\0\1\5\3\0\13\5\1\205\6\5\23\0\1\5"+
    "\1\0\3\5\1\206\12\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\1\5\1\207\14\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\7\5\1\210\6\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5\1\0\5\5"+
    "\1\211\10\5\1\0\1\5\3\0\22\5\23\0\1\5"+
    "\1\0\3\5\1\212\12\5\1\0\1\5\3\0\22\5"+
    "\23\0\1\5\1\0\5\5\1\213\10\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\16\5\1\0\1\5"+
    "\3\0\10\5\1\214\11\5\23\0\1\5\1\0\16\5"+
    "\1\0\1\5\3\0\5\5\1\215\14\5\23\0\1\5"+
    "\1\0\16\5\1\0\1\5\3\0\21\5\1\216\23\0"+
    "\1\5\1\0\3\5\1\217\12\5\1\0\1\5\3\0"+
    "\22\5\23\0\1\5\1\0\1\220\15\5\1\0\1\5"+
    "\3\0\22\5\23\0\1\5\1\0\7\5\1\221\6\5"+
    "\1\0\1\5\3\0\22\5\23\0\1\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5800];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\2\11\1\1\1\11\10\1\2\11"+
    "\1\1\1\11\6\1\2\11\1\1\1\11\1\1\1\11"+
    "\1\1\2\11\11\1\3\0\16\1\11\11\10\1\1\0"+
    "\14\1\2\0\7\1\1\0\12\1\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 48: 
          { lexeme=yytext(); return T_BREAK;
          }
        case 58: break;
        case 38: 
          { lexeme=yytext(); return T_FOR;
          }
        case 59: break;
        case 17: 
          { lexeme=yytext(); return T_CORCHIZQ;
          }
        case 60: break;
        case 43: 
          { lexeme=yytext(); return T_ELSE;
          }
        case 61: break;
        case 34: 
          { lexeme=yytext(); return T_OR;
          }
        case 62: break;
        case 11: 
          { lexeme=yytext(); return T_MENOR;
          }
        case 63: break;
        case 54: 
          { lexeme=yytext(); return T_EXTENDS;
          }
        case 64: break;
        case 18: 
          { lexeme=yytext(); return T_CORCHDER;
          }
        case 65: break;
        case 41: 
          { lexeme=yytext(); return T_CONST_BOOLEANO;
          }
        case 66: break;
        case 44: 
          { lexeme=yytext(); return T_VOID;
          }
        case 67: break;
        case 35: 
          { lexeme=yytext(); return T_CORCHETES;
          }
        case 68: break;
        case 57: 
          { lexeme=yytext(); return T_IMPLEMENTS;
          }
        case 69: break;
        case 55: 
          { lexeme=yytext(); return T_NEWARRAY;
          }
        case 70: break;
        case 21: 
          { lexeme=yytext(); return T_LLAVEIZQ;
          }
        case 71: break;
        case 31: 
          { lexeme=yytext(); return T_MAYORIGUAL;
          }
        case 72: break;
        case 2: 
          { lexeme=yytext(); return T_IDENTIFICADOR;
          }
        case 73: break;
        case 46: 
          { lexeme=yytext(); return T_BOOL;
          }
        case 74: break;
        case 22: 
          { lexeme=yytext(); return T_LLAVEDER;
          }
        case 75: break;
        case 9: 
          { lexeme=yytext(); return T_DIVISION;
          }
        case 76: break;
        case 32: 
          { lexeme=yytext(); return T_DIFERENTE;
          }
        case 77: break;
        case 29: 
          { lexeme=yytext(); return T_MENORIGUAL;
          }
        case 78: break;
        case 24: 
          { lexeme=yytext(); return T_CONST_DOUBLE;
          }
        case 79: break;
        case 53: 
          { lexeme=yytext(); return T_DOUBLE;
          }
        case 80: break;
        case 28: 
          { lexeme=yytext(); return COMENTARIO2;
          }
        case 81: break;
        case 3: 
          { lexeme=yytext(); return T_CONST_ENTERO;
          }
        case 82: break;
        case 14: 
          { lexeme=yytext(); return T_NEGACION;
          }
        case 83: break;
        case 15: 
          { lexeme=yytext(); return T_PUNTOYCOMA;
          }
        case 84: break;
        case 27: 
          { lexeme=yytext(); return ERROR1;
          }
        case 85: break;
        case 4: 
          { lexeme=yytext(); return T_PUNTO;
          }
        case 86: break;
        case 5: 
          { lexeme=yytext(); return T_RESTA;
          }
        case 87: break;
        case 13: 
          { lexeme=yytext(); return T_MAYOR;
          }
        case 88: break;
        case 26: 
          { lexeme=yytext(); return T_IF;
          }
        case 89: break;
        case 33: 
          { lexeme=yytext(); return T_AND;
          }
        case 90: break;
        case 39: 
          { lexeme=yytext(); return T_INT;
          }
        case 91: break;
        case 51: 
          { lexeme=yytext(); return T_RETURN;
          }
        case 92: break;
        case 23: 
          { lexeme=yytext(); return WHITE;
          }
        case 93: break;
        case 47: 
          { lexeme=yytext(); return COMENTARIO1;
          }
        case 94: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 95: break;
        case 45: 
          { lexeme=yytext(); return T_NULL;
          }
        case 96: break;
        case 37: 
          { lexeme=yytext(); return T_LLAVES;
          }
        case 97: break;
        case 16: 
          { lexeme=yytext(); return T_COMA;
          }
        case 98: break;
        case 40: 
          { lexeme=yytext(); return T_NEW;
          }
        case 99: break;
        case 49: 
          { lexeme=yytext(); return T_CLASS;
          }
        case 100: break;
        case 6: 
          { lexeme=yytext(); return ENTER;
          }
        case 101: break;
        case 52: 
          { lexeme=yytext(); return T_STRING;
          }
        case 102: break;
        case 25: 
          { lexeme=yytext(); return T_CONST_STRING;
          }
        case 103: break;
        case 19: 
          { lexeme=yytext(); return T_PARENIZQ;
          }
        case 104: break;
        case 42: 
          { lexeme=yytext(); return T_THIS;
          }
        case 105: break;
        case 12: 
          { lexeme=yytext(); return T_IGUAL;
          }
        case 106: break;
        case 7: 
          { lexeme=yytext(); return T_SUMA;
          }
        case 107: break;
        case 50: 
          { lexeme=yytext(); return T_WHILE;
          }
        case 108: break;
        case 8: 
          { lexeme=yytext(); return T_MULTIPLICACION;
          }
        case 109: break;
        case 20: 
          { lexeme=yytext(); return T_PARENDER;
          }
        case 110: break;
        case 30: 
          { lexeme=yytext(); return T_IGUALDAD;
          }
        case 111: break;
        case 10: 
          { lexeme=yytext(); return T_PROCENTAJE;
          }
        case 112: break;
        case 56: 
          { lexeme=yytext(); return T_INTERFACE;
          }
        case 113: break;
        case 36: 
          { lexeme=yytext(); return T_PARENTESIS;
          }
        case 114: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
