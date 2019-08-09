package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Built-in XmlAdapter to handle xs:token and its derived types.
 * 
 *  
 *  This adapter removes leading and trailing whitespaces, then truncate any
 *  sequnce of tab, CR, LF, and SP by a single whitespace character ' '.
 */
class CollapsedStringAdapter extends XmlAdapter[String, String] {

    /**  */
    @stub
    def this() = ???

    /** No-op. */
    @stub
    def marshal(s: String): String = ???

    /** Removes leading and trailing whitespaces of the string
     *  given as the parameter, then truncate any
     *  sequnce of tab, CR, LF, and SP by a single whitespace character ' '.
     */
    @stub
    def unmarshal(text: String): String = ???
}

object CollapsedStringAdapter {
    /** returns true if the specified char is a white space character. */
    @stub
    protected def isWhiteSpace(ch: Char): Boolean = ???
}
