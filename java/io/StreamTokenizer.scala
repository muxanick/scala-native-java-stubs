package java.io

import java.lang.{Object, String}

// The StreamTokenizer class takes an input stream and
// parses it into "tokens", allowing the tokens to be
// read one at a time. The parsing process is controlled by a table
// and a number of flags that can be set to various states. The
// stream tokenizer can recognize identifiers, numbers, quoted
// strings, and various comment styles.
// 
// Each byte read from the input stream is regarded as a character
// in the range '\u0000' through '\u00FF'.
// The character value is used to look up five possible attributes of
// the character: white space, alphabetic,
// numeric, string quote, and comment character.
// Each character can have zero or more of these attributes.
// 
// In addition, an instance has four flags. These flags indicate:
// 
// Whether line terminators are to be returned as tokens or treated
//     as white space that merely separates tokens.
// Whether C-style comments are to be recognized and skipped.
// Whether C++-style comments are to be recognized and skipped.
// Whether the characters of identifiers are converted to lowercase.
// 
// 
// A typical application first constructs an instance of this class,
// sets up the syntax tables, and then repeatedly loops calling the
// nextToken method in each iteration of the loop until
// it returns the value TT_EOF.
class StreamTokenizer extends Object {

    @stub
    // Deprecated. 
    //As of JDK version 1.1, the preferred way to tokenize an
    // input stream is to convert it into a character stream, for example:
    // 
    //   Reader r = new BufferedReader(new InputStreamReader(is));
    //   StreamTokenizer st = new StreamTokenizer(r);
    // 
    //
    def this(is: InputStream) = ???

    @stub
    // If the current token is a number, this field contains the value
    // of that number.
    def nval: double = ???

    @stub
    // If the current token is a word token, this field contains a
    // string giving the characters of the word token.
    def sval: String = ???

    @stub
    // Specified that the character argument starts a single-line
    // comment.
    def commentChar(ch: Int): Unit = ???

    @stub
    // Determines whether or not ends of line are treated as tokens.
    def eolIsSignificant(flag: Boolean): Unit = ???

    @stub
    // Return the current line number.
    def lineno(): Int = ???

    @stub
    // Determines whether or not word token are automatically lowercased.
    def lowerCaseMode(fl: Boolean): Unit = ???

    @stub
    // Parses the next token from the input stream of this tokenizer.
    def nextToken(): Int = ???

    @stub
    // Specifies that the character argument is "ordinary"
    // in this tokenizer.
    def ordinaryChar(ch: Int): Unit = ???

    @stub
    // Specifies that all characters c in the range
    // low <= c <= high
    // are "ordinary" in this tokenizer.
    def ordinaryChars(low: Int, hi: Int): Unit = ???

    @stub
    // Specifies that numbers should be parsed by this tokenizer.
    def parseNumbers(): Unit = ???

    @stub
    // Causes the next call to the nextToken method of this
    // tokenizer to return the current value in the ttype
    // field, and not to modify the value in the nval or
    // sval field.
    def pushBack(): Unit = ???

    @stub
    // Specifies that matching pairs of this character delimit string
    // constants in this tokenizer.
    def quoteChar(ch: Int): Unit = ???

    @stub
    // Resets this tokenizer's syntax table so that all characters are
    // "ordinary." See the ordinaryChar method
    // for more information on a character being ordinary.
    def resetSyntax(): Unit = ???

    @stub
    // Determines whether or not the tokenizer recognizes C++-style comments.
    def slashSlashComments(flag: Boolean): Unit = ???

    @stub
    // Determines whether or not the tokenizer recognizes C-style comments.
    def slashStarComments(flag: Boolean): Unit = ???

    @stub
    // Returns the string representation of the current stream token and
    // the line number it occurs on.
    def toString(): String = ???

    @stub
    // Specifies that all characters c in the range
    // low <= c <= high
    // are white space characters.
    def whitespaceChars(low: Int, hi: Int): Unit = ???
}

object StreamTokenizer {
    @stub
    // A constant indicating that the end of the stream has been read.
    def TT_EOF: Int = ???

    @stub
    // A constant indicating that the end of the line has been read.
    def TT_EOL: Int = ???

    @stub
    // A constant indicating that a number token has been read.
    def TT_NUMBER: Int = ???

    @stub
    // A constant indicating that a word token has been read.
    def TT_WORD: Int = ???
}
