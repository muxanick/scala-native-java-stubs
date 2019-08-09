package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The StreamTokenizer class takes an input stream and
 *  parses it into "tokens", allowing the tokens to be
 *  read one at a time. The parsing process is controlled by a table
 *  and a number of flags that can be set to various states. The
 *  stream tokenizer can recognize identifiers, numbers, quoted
 *  strings, and various comment styles.
 *  
 *  Each byte read from the input stream is regarded as a character
 *  in the range '\u0000' through '\u00FF'.
 *  The character value is used to look up five possible attributes of
 *  the character: white space, alphabetic,
 *  numeric, string quote, and comment character.
 *  Each character can have zero or more of these attributes.
 *  
 *  In addition, an instance has four flags. These flags indicate:
 *  
 *  Whether line terminators are to be returned as tokens or treated
 *      as white space that merely separates tokens.
 *  Whether C-style comments are to be recognized and skipped.
 *  Whether C++-style comments are to be recognized and skipped.
 *  Whether the characters of identifiers are converted to lowercase.
 *  
 *  
 *  A typical application first constructs an instance of this class,
 *  sets up the syntax tables, and then repeatedly loops calling the
 *  nextToken method in each iteration of the loop until
 *  it returns the value TT_EOF.
 */
class StreamTokenizer extends Object {

    /** Deprecated. 
     * As of JDK version 1.1, the preferred way to tokenize an
     *  input stream is to convert it into a character stream, for example:
     *  
     *    Reader r = new BufferedReader(new InputStreamReader(is));
     *    StreamTokenizer st = new StreamTokenizer(r);
     *  
     * 
     */
    @stub
    def this(is: InputStream) = ???

    /** Create a tokenizer that parses the given character stream. */
    @stub
    def this(r: Reader) = ???

    /** If the current token is a number, this field contains the value
     *  of that number.
     */
    @stub
    val nval: Double = ???

    /** If the current token is a word token, this field contains a
     *  string giving the characters of the word token.
     */
    @stub
    val sval: String = ???

    /** After a call to the nextToken method, this field
     *  contains the type of the token just read.
     */
    @stub
    val ttype: Int = ???

    /** Specified that the character argument starts a single-line
     *  comment.
     */
    @stub
    def commentChar(ch: Int): Unit = ???

    /** Determines whether or not ends of line are treated as tokens. */
    @stub
    def eolIsSignificant(flag: Boolean): Unit = ???

    /** Return the current line number. */
    @stub
    def lineno(): Int = ???

    /** Determines whether or not word token are automatically lowercased. */
    @stub
    def lowerCaseMode(fl: Boolean): Unit = ???

    /** Parses the next token from the input stream of this tokenizer. */
    @stub
    def nextToken(): Int = ???

    /** Specifies that the character argument is "ordinary"
     *  in this tokenizer.
     */
    @stub
    def ordinaryChar(ch: Int): Unit = ???

    /** Specifies that all characters c in the range
     *  low <= c <= high
     *  are "ordinary" in this tokenizer.
     */
    @stub
    def ordinaryChars(low: Int, hi: Int): Unit = ???

    /** Specifies that numbers should be parsed by this tokenizer. */
    @stub
    def parseNumbers(): Unit = ???

    /** Causes the next call to the nextToken method of this
     *  tokenizer to return the current value in the ttype
     *  field, and not to modify the value in the nval or
     *  sval field.
     */
    @stub
    def pushBack(): Unit = ???

    /** Specifies that matching pairs of this character delimit string
     *  constants in this tokenizer.
     */
    @stub
    def quoteChar(ch: Int): Unit = ???

    /** Resets this tokenizer's syntax table so that all characters are
     *  "ordinary." See the ordinaryChar method
     *  for more information on a character being ordinary.
     */
    @stub
    def resetSyntax(): Unit = ???

    /** Determines whether or not the tokenizer recognizes C++-style comments. */
    @stub
    def slashSlashComments(flag: Boolean): Unit = ???

    /** Determines whether or not the tokenizer recognizes C-style comments. */
    @stub
    def slashStarComments(flag: Boolean): Unit = ???

    /** Returns the string representation of the current stream token and
     *  the line number it occurs on.
     */
    @stub
    def toString(): String = ???

    /** Specifies that all characters c in the range
     *  low <= c <= high
     *  are white space characters.
     */
    @stub
    def whitespaceChars(low: Int, hi: Int): Unit = ???

    /** Specifies that all characters c in the range
     *  low <= c <= high
     *  are word constituents.
     */
    @stub
    def wordChars(low: Int, hi: Int): Unit = ???
}

object StreamTokenizer {
    /** A constant indicating that the end of the stream has been read. */
    @stub
    val TT_EOF: Int = ???

    /** A constant indicating that the end of the line has been read. */
    @stub
    val TT_EOL: Int = ???

    /** A constant indicating that a number token has been read. */
    @stub
    val TT_NUMBER: Int = ???

    /** A constant indicating that a word token has been read. */
    @stub
    val TT_WORD: Int = ???
}
