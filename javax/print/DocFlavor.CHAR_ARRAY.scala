package javax.print

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class DocFlavor.CHAR_ARRAY provides predefined static constant
 *  DocFlavor objects for example doc flavors using a character array
 *  (char[]) as the print data representation class. As such,
 *  the character set is Unicode.
 *  
 */
object DocFlavor_CHAR_ARRAY extends DocFlavor {

    /** Constructs a new doc flavor with the given MIME type and a print
     *  data representation class name of
     *  "[C" (character array).
     */
    @stub
    def CHAR_ARRAY(mimeType: String) = ???

    /** Doc flavor with MIME type = "text/html;
     *  charset=utf-16", print data representation class name =
     *  "[C" (character array).
     */
    @stub
    val TEXT_HTML: DocFlavor.CHAR_ARRAY = ???

    /** Doc flavor with MIME type = "text/plain;
     *  charset=utf-16", print data representation class name =
     *  "[C" (character array).
     */
    @stub
    val TEXT_PLAIN: DocFlavor.CHAR_ARRAY = ???
}
