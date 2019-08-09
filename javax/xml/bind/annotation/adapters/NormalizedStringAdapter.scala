package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** XmlAdapter to handle xs:normalizedString.
 * 
 *  
 *  Replaces any tab, CR, and LF by a whitespace character ' ',
 *  as specified in the whitespace facet 'replace'
 */
final class NormalizedStringAdapter extends XmlAdapter[String, String] {

    /**  */
    @stub
    def this() = ???

    /** No-op. */
    @stub
    def marshal(s: String): String = ???

    /** Replace any tab, CR, and LF by a whitespace character ' ',
     *  as specified in the whitespace facet 'replace'
     */
    @stub
    def unmarshal(text: String): String = ???
}

object NormalizedStringAdapter {
    /** Returns true if the specified char is a white space character
     *  but not 0x20.
     */
    @stub
    protected def isWhiteSpaceExceptSpace(ch: Char): Boolean = ???
}
