/* The following code was generated by JFlex 1.6.1 */

//package com.rest;

import java.lang.StringBuilder;
import java.io.PrintWriter;
import java.util.Calendar;
import java.io.File;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>query.flex</tt>
 */
public class Query {

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
    "\40\0\1\21\6\0\1\30\10\0\1\32\11\31\7\0\1\6\1\17"+
    "\1\24\1\13\1\4\1\14\1\22\1\10\1\34\1\33\1\36\1\3"+
    "\1\12\1\16\1\15\1\23\1\33\1\7\1\35\1\11\1\25\1\27"+
    "\1\1\1\33\1\5\1\33\6\0\1\6\1\17\1\24\1\13\1\4"+
    "\1\14\1\22\1\10\1\34\1\33\1\36\1\3\1\12\1\16\1\15"+
    "\1\23\1\33\1\7\1\35\1\11\1\25\1\27\1\1\1\33\1\5"+
    "\1\33\265\0\2\2\115\0\1\20\u1faa\0\1\26\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\14\2\1\1\3\2\1\1"+
    "\1\3\1\2\1\0\1\3\2\2\1\3\6\2\1\3"+
    "\1\2\1\0\3\2\1\3\3\2\1\0\5\2\2\0"+
    "\2\2\1\4\2\2\2\0\5\2\1\0\3\2\1\0"+
    "\1\2\1\0\11\2\1\0\1\2\1\0\1\3\1\2"+
    "\1\0\2\2\2\0\1\3\5\2\1\0\1\2\1\0"+
    "\3\2\1\0\1\2\1\0\1\5\1\2\1\0\2\2"+
    "\1\5\1\0\1\2\1\0\1\6\1\2\1\0\1\2"+
    "\1\0\1\2\1\7\1\2\1\0\1\2\2\0\2\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\6\1\7\1\0\1\2\3\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\2\0\1\2"+
    "\2\0\1\2\2\0\1\2\2\0\1\2\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
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
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331"+
    "\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1"+
    "\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u024d\0\u028b\0\u02aa"+
    "\0\u02c9\0\u02e8\0\u0307\0\37\0\u0326\0\u0345\0\u0364\0\u0383"+
    "\0\u03a2\0\u03c1\0\370\0\u03e0\0\u03ff\0\u041e\0\u043d\0\u045c"+
    "\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7\0\u0516\0\u0535\0\u0554"+
    "\0\u0573\0\u0592\0\u05b1\0\u05d0\0\u05ef\0\u060e\0\u026c\0\u062d"+
    "\0\u064c\0\u066b\0\u068a\0\u06a9\0\u06c8\0\u06e7\0\u0706\0\u0725"+
    "\0\135\0\u0744\0\u0763\0\u0782\0\u07a1\0\u07c0\0\u07df\0\u07fe"+
    "\0\u081d\0\u083c\0\u085b\0\u087a\0\u0899\0\u08b8\0\u08d7\0\u08f6"+
    "\0\u0915\0\u0934\0\u0953\0\u0972\0\u0991\0\u09b0\0\u09cf\0\u09ee"+
    "\0\u0a0d\0\u0a2c\0\u0a4b\0\u0a6a\0\u0a89\0\u0aa8\0\u0ac7\0\u0ae6"+
    "\0\u0b05\0\u0b24\0\u0b43\0\u0b62\0\u0b81\0\u0ba0\0\u0bbf\0\u0bde"+
    "\0\u0bfd\0\370\0\u0c1c\0\u0c3b\0\u0c5a\0\u0c79\0\37\0\u0c98"+
    "\0\u0cb7\0\u0cd6\0\370\0\u0cf5\0\u0d14\0\u0d33\0\u0d52\0\u0d71"+
    "\0\370\0\u0d90\0\u0daf\0\u0dce\0\u0ded\0\u0e0c\0\u0e2b\0\u0e4a"+
    "\0\u0e69\0\u0e88\0\u0ea7\0\u0ec6\0\u0ee5\0\u0f04\0\u0f23\0\u0f42"+
    "\0\u0f61\0\u0f80\0\37\0\37\0\u0f9f\0\u0fbe\0\u0fdd\0\u0ffc"+
    "\0\u101b\0\u103a\0\u1059\0\u1078\0\u1097\0\u10b6\0\u10d5\0\u10f4"+
    "\0\u1113\0\u1132\0\u1151\0\u1170\0\u118f\0\u11ae\0\u11cd\0\u11ec"+
    "\0\u120b\0\u122a\0\u1249\0\u0972\0\u1268\0\u1287\0\u12a6\0\u12c5"+
    "\0\u12e4\0\u1303\0\u1322\0\u1341\0\u1360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\11\1\20"+
    "\1\21\1\2\1\22\1\11\1\23\1\24\1\2\2\11"+
    "\1\25\1\2\1\11\1\26\1\27\1\11\40\0\1\11"+
    "\1\30\1\11\1\31\3\11\1\32\7\11\2\0\4\11"+
    "\1\0\2\11\2\0\1\11\1\33\2\11\20\0\1\34"+
    "\14\0\1\34\2\0\1\11\1\0\1\11\1\35\1\11"+
    "\1\36\11\11\2\0\3\11\1\37\1\0\2\11\2\0"+
    "\4\11\1\0\1\11\1\0\3\11\1\40\11\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\1\0\1\11\1\0"+
    "\3\11\1\41\6\11\1\42\2\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\1\0\1\11\1\0\6\11\1\43"+
    "\4\11\1\44\1\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\1\0\1\11\1\0\15\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\1\0\1\11\1\45\3\11\1\46"+
    "\11\11\2\0\4\11\1\0\2\11\2\0\1\11\1\47"+
    "\2\11\1\0\1\11\1\0\5\11\1\50\4\11\1\51"+
    "\2\11\2\0\3\11\1\52\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\1\11\1\53\10\11\1\54\2\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\55\12\11\1\56\2\11\2\0\4\11\1\0\2\11"+
    "\2\0\1\11\1\57\2\11\1\0\1\11\1\0\4\11"+
    "\1\60\5\11\1\61\2\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\13\11\1\43\1\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\1\11\1\43\2\11\1\62\10\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\6\0\1\63\16\0\1\64"+
    "\12\0\1\11\1\0\1\11\1\65\13\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\3\11"+
    "\1\66\11\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\15\11\1\34\1\0\4\11\1\0"+
    "\2\11\2\0\2\11\1\43\1\11\31\0\2\67\5\0"+
    "\1\11\1\0\3\11\1\70\11\11\2\0\3\11\1\71"+
    "\1\0\2\11\2\0\4\11\3\0\1\72\12\0\1\73"+
    "\21\0\1\11\1\0\10\11\1\74\4\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\1\11"+
    "\1\75\1\11\1\76\11\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\1\77\12\11\1\100"+
    "\1\11\2\0\4\11\1\0\2\11\2\0\4\11\1\0"+
    "\1\11\1\0\15\11\1\101\1\0\4\11\1\0\2\11"+
    "\2\0\2\11\1\24\1\11\1\0\1\11\1\0\6\11"+
    "\1\102\6\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\13\11\1\103\1\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\4\11"+
    "\1\104\1\11\1\43\6\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\15\11\1\105\1\0"+
    "\4\11\1\0\2\11\2\0\2\11\1\106\1\11\1\0"+
    "\1\11\1\0\15\11\2\0\3\11\1\43\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\2\11\1\43\12\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\3\0\1\107"+
    "\34\0\1\11\1\0\15\11\2\0\4\11\1\0\1\110"+
    "\1\11\2\0\4\11\1\0\1\11\1\0\1\111\14\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\1\11\1\112\1\11\1\17\11\11\2\0\3\11"+
    "\1\113\1\0\2\11\2\0\4\11\1\0\1\11\1\0"+
    "\7\11\1\114\1\115\4\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\1\11\1\116\13\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\4\11\1\117\10\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\4\11\1\110\6\11"+
    "\1\120\1\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\16\0\1\121\21\0\1\11\1\0\1\11\1\24\13\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\13\11\1\122\1\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\123\15\11\2\0\4\11"+
    "\1\0\2\11\2\0\1\11\1\120\2\11\1\0\1\11"+
    "\1\0\4\11\1\124\10\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\1\11\1\125\13\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\11\0\1\126"+
    "\43\0\1\123\21\0\1\11\1\0\6\11\1\43\6\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\1\127\12\11\1\43\1\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\1\0\1\11\1\0\6\11\1\130"+
    "\6\11\2\0\4\11\1\0\2\11\2\0\4\11\1\0"+
    "\1\11\1\0\13\11\1\120\1\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\3\0\1\34\1\131\45\0\1\132"+
    "\24\0\1\11\1\0\13\11\1\52\1\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\4\11"+
    "\1\110\10\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\6\11\1\133\6\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\1\43"+
    "\1\134\13\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\10\11\1\135\4\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\1\11"+
    "\1\136\13\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\15\11\2\0\2\11\1\137\1\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\5\11"+
    "\1\140\7\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\10\0\1\34\27\0\1\11\1\0\5\11\1\43\7\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\3\0\1\141"+
    "\34\0\1\11\1\0\1\11\1\43\13\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\1\142"+
    "\14\11\2\0\4\11\1\0\2\11\2\0\4\11\1\0"+
    "\1\11\1\0\4\11\1\110\10\11\1\0\1\143\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\4\11"+
    "\1\116\10\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\12\11\1\144\2\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\1\0\1\11\1\0\3\11"+
    "\1\145\11\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\1\0\1\11\1\0\15\11\1\123\1\0\4\11\1\0"+
    "\2\11\2\0\2\11\1\120\1\11\1\0\1\11\1\0"+
    "\1\11\1\146\13\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\1\0\1\11\1\0\10\11\1\115\4\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\16\0\1\147\21\0"+
    "\1\11\1\0\13\11\1\150\1\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\13\0\1\151\24\0\1\11\1\0"+
    "\10\11\1\152\4\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\1\0\1\11\1\0\3\11\1\153\11\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\25\0\1\154\12\0"+
    "\1\11\1\0\12\11\1\155\2\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\1\0\1\11\1\0\15\11\2\0"+
    "\3\11\1\156\1\0\2\11\2\0\4\11\5\0\1\157"+
    "\51\0\1\160\14\0\1\160\2\0\1\11\1\0\15\11"+
    "\1\34\1\0\4\11\1\0\1\11\1\24\2\0\2\11"+
    "\1\43\1\11\1\0\1\11\1\0\2\11\1\152\12\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\15\11\1\160\1\0\4\11\1\0\2\11\2\0"+
    "\2\11\1\161\1\11\1\0\1\11\1\0\15\11\1\0"+
    "\1\162\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\5\11\1\163\7\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\3\11\1\164\11\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\4\0\1\165"+
    "\33\0\1\11\1\0\1\11\1\166\13\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\22\0\1\167\15\0\1\11"+
    "\1\0\4\11\1\170\10\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\1\0\1\11\1\0\2\11\1\171\12\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\1\0\1\11"+
    "\1\0\10\11\1\172\4\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\4\0\1\173\33\0\1\11\1\0\1\11"+
    "\1\174\13\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\6\0\1\175\31\0\1\11\1\0\15\11\2\0\4\11"+
    "\1\176\2\11\2\0\3\11\1\177\7\0\1\123\30\0"+
    "\1\11\1\0\4\11\1\200\10\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\1\0\1\11\1\0\4\11\1\120"+
    "\10\11\2\0\4\11\1\0\2\11\2\0\4\11\15\0"+
    "\1\201\22\0\1\11\1\0\12\11\1\202\2\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\3\0\1\203\34\0"+
    "\1\11\1\0\4\11\1\204\10\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\16\0\1\205\21\0\1\11\1\0"+
    "\13\11\1\206\1\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\6\0\1\207\31\0\1\11\1\0\4\11\1\210"+
    "\10\11\2\0\4\11\1\0\2\11\2\0\4\11\1\0"+
    "\1\11\1\211\15\11\2\0\4\11\1\0\2\11\2\0"+
    "\1\11\1\212\2\11\7\0\1\213\30\0\1\11\1\0"+
    "\4\11\1\163\10\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\5\0\1\214\45\0\1\215\23\0\1\11\1\0"+
    "\11\11\1\216\3\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\1\0\1\11\1\217\15\11\2\0\4\11\1\0"+
    "\2\11\2\0\1\11\1\56\2\11\7\0\1\157\30\0"+
    "\1\11\1\0\4\11\1\152\10\11\2\0\4\11\1\0"+
    "\2\11\2\0\4\11\25\0\1\220\12\0\1\11\1\0"+
    "\6\11\1\152\6\11\2\0\4\11\1\0\2\11\2\0"+
    "\4\11\17\0\1\221\20\0\1\11\1\0\14\11\1\222"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\11\0\1\223"+
    "\26\0\1\11\1\0\12\11\1\224\2\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\11\0\1\225\26\0\1\11"+
    "\1\0\6\11\1\226\6\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\6\0\1\227\31\0\1\11\1\0\3\11"+
    "\1\230\11\11\2\0\4\11\1\0\2\11\2\0\4\11"+
    "\4\0\1\101\50\0\1\231\27\0\1\232\30\0\1\11"+
    "\1\0\4\11\1\233\10\11\2\0\4\11\1\0\2\11"+
    "\2\0\4\11\10\0\1\234\27\0\1\171\1\0\15\11"+
    "\2\0\4\11\1\0\2\11\2\0\4\11\10\0\1\157"+
    "\27\0\1\11\1\0\5\11\1\152\7\11\2\0\4\11"+
    "\1\0\2\11\2\0\4\11\20\0\1\235\14\0\1\235"+
    "\2\0\1\11\1\0\15\11\1\235\1\0\4\11\1\0"+
    "\2\11\2\0\2\11\1\236\1\11\24\0\1\237\20\0"+
    "\1\240\31\0\1\11\1\0\3\11\1\241\11\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\4\0\1\242\43\0"+
    "\1\213\26\0\1\11\1\0\6\11\1\163\6\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\10\0\1\213\44\0"+
    "\1\243\21\0\1\11\1\0\13\11\1\244\1\11\2\0"+
    "\4\11\1\0\2\11\2\0\4\11\7\0\1\245\42\0"+
    "\1\157\25\0\1\246\31\0\1\246\20\0\1\247\42\0"+
    "\1\250\35\0\1\251\40\0\1\252\16\0\1\253\41\0"+
    "\1\254\54\0\1\255\16\0\1\157\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4991];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\1\0\3\1\1\11\10\1\1\0"+
    "\7\1\1\0\5\1\2\0\5\1\2\0\5\1\1\0"+
    "\3\1\1\0\1\1\1\0\11\1\1\0\1\1\1\0"+
    "\2\1\1\0\2\1\2\0\6\1\1\0\1\1\1\0"+
    "\3\1\1\0\1\1\1\0\2\1\1\0\2\1\1\11"+
    "\1\0\1\1\1\0\2\1\1\0\1\1\1\0\3\1"+
    "\1\0\1\1\2\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\2\11\1\0"+
    "\1\1\3\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\2\0\1\1\2\0\1\1\2\0\1\1\2\0"+
    "\1\1\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  boolean today = true; //default if user doesn't specify day
  StringBuilder sb = new StringBuilder();
  StringBuilder itemBuild = new StringBuilder();
  String fin = "";
  String getString() {
	return fin;
  }
  Calendar cal = Calendar.getInstance();
  String[] days_of_week = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Query(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public String yylex() throws java.io.IOException {
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                //executed after search is lexed;
if(today) {
	String date = String.format("%02d-%02d-%d",cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), cal.get(Calendar.YEAR));
	sb.append("MEAL_DAY=" + date + ";");
}
String item = itemBuild.toString();
if(!item.equals("")) sb.append("ITEM_NAME="+item.substring(0,item.length()-1)+";");
String fin = sb.toString().substring(0,sb.length()-1);
File f = new File("/home/cs307/Intelligent-Search/files/tokens.txt");
//File f = new File("in1.txt");
PrintWriter writer = new PrintWriter(f);
writer.println(fin);
System.out.println(fin);
writer.close();
return fin;
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //excess input ignored (for now)
            }
          case 8: break;
          case 2: 
            { itemBuild.append(yytext() + " ");
            }
          case 9: break;
          case 3: 
            { 
            }
          case 10: break;
          case 4: 
            { String calories = yytext();
sb.append("CALORIES=");
sb.append(calories + ";");
            }
          case 11: break;
          case 5: 
            { String match = yytext();
if(match.equals("meredith"))
	match = "the gathering place";
sb.append("DINING_COURT=");
sb.append(match + ";");
            }
          case 12: break;
          case 6: 
            { sb.append("MEAL_TIME=");
sb.append(yytext() + ";" );
            }
          case 13: break;
          case 7: 
            { today = false;
String in = yytext();
sb.append("MEAL_DAY=");
int current = cal.get(cal.DAY_OF_WEEK);
int desired = 0;
for(int i = 0; i < 7; i++) {
	if(in.equals(days_of_week[i])) {
		desired = i + 1;
		break;
	}
}
int days_to_add = (desired - current);
if(days_to_add < 0) {
	days_to_add += 7;
}
if(in.equals("tomorrow")) days_to_add = 1;
if(in.equals("today")) days_to_add = 0;
cal.add(Calendar.DATE, days_to_add);
String month = String.format("%02d", cal.get(Calendar.MONTH)+1);
String day = String.format("%02d", cal.get(Calendar.DATE));
String year = Integer.toString(cal.get(Calendar.YEAR));
String date = String.format("%s-%s-%s", month, day, year);
sb.append(date + ";");
            }
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Query [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Query scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Query(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
