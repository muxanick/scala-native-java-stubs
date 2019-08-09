package java.util

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The string tokenizer class allows an application to break a
 *  string into tokens. The tokenization method is much simpler than
 *  the one used by the StreamTokenizer class. The
 *  StringTokenizer methods do not distinguish among
 *  identifiers, numbers, and quoted strings, nor do they recognize
 *  and skip comments.
 *  
 *  The set of delimiters (the characters that separate tokens) may
 *  be specified either at creation time or on a per-token basis.
 *  
 *  An instance of StringTokenizer behaves in one of two
 *  ways, depending on whether it was created with the
 *  returnDelims flag having the value true
 *  or false:
 *  
 *  If the flag is false, delimiter characters serve to
 *      separate tokens. A token is a maximal sequence of consecutive
 *      characters that are not delimiters.
 *  If the flag is true, delimiter characters are themselves
 *      considered to be tokens. A token is thus either one delimiter
 *      character, or a maximal sequence of consecutive characters that are
 *      not delimiters.
 *  
 *  A StringTokenizer object internally maintains a current
 *  position within the string to be tokenized. Some operations advance this
 *  current position past the characters processed.
 *  A token is returned by taking a substring of the string that was used to
 *  create the StringTokenizer object.
 *  
 *  The following is one example of the use of the tokenizer. The code:
 *  
 *      StringTokenizer st = new StringTokenizer("this is a test");
 *      while (st.hasMoreTokens()) {
 *          System.out.println(st.nextToken());
 *      }
 *  
 *  
 *  prints the following output:
 *  
 *      this
 *      is
 *      a
 *      test
 *  
 * 
 *  
 *  StringTokenizer is a legacy class that is retained for
 *  compatibility reasons although its use is discouraged in new code. It is
 *  recommended that anyone seeking this functionality use the split
 *  method of String or the java.util.regex package instead.
 *  
 *  The following example illustrates how the String.split
 *  method can be used to break up a string into its basic tokens:
 *  
 *      String[] result = "this is a test".split("\\s");
 *      for (int x=0; x<result.length; x++)
 *          System.out.println(result[x]);
 *  
 *  
 *  prints the following output:
 *  
 *      this
 *      is
 *      a
 *      test
 *  
 */
class StringTokenizer extends Object with Enumeration[Object] {

    /** Constructs a string tokenizer for the specified string. */
    @stub
    def this(str: String) = ???

    /** Constructs a string tokenizer for the specified string. */
    @stub
    def this(str: String, delim: String) = ???

    /** Constructs a string tokenizer for the specified string. */
    @stub
    def this(str: String, delim: String, returnDelims: Boolean) = ???

    /** Calculates the number of times that this tokenizer's
     *  nextToken method can be called before it generates an
     *  exception.
     */
    @stub
    def countTokens(): Int = ???

    /** Returns the same value as the hasMoreTokens
     *  method.
     */
    @stub
    def hasMoreElements(): Boolean = ???

    /** Tests if there are more tokens available from this tokenizer's string. */
    @stub
    def hasMoreTokens(): Boolean = ???

    /** Returns the same value as the nextToken method,
     *  except that its declared return value is Object rather than
     *  String.
     */
    @stub
    def nextElement(): Object = ???

    /** Returns the next token from this string tokenizer. */
    @stub
    def nextToken(): String = ???

    /** Returns the next token in this string tokenizer's string. */
    @stub
    def nextToken(delim: String): String = ???
}
