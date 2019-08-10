package javax.print

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class DocFlavor.STRING provides predefined static constant DocFlavor
 *  objects for example doc flavors using a string (java.lang.String) as the print data representation class.
 *  As such, the character set is Unicode.
 *  
 */
object DocFlavor_STRING extends DocFlavor {

    /** Constructs a new doc flavor with the given MIME type and a print
     *  data representation class name of "java.lang.String".
     */
    @stub
    def STRING(mimeType: String) = ???

    /** Doc flavor with MIME type = "text/html;
     *  charset=utf-16", print data representation class name =
     *  "java.lang.String".
     */
    @stub
    val TEXT_HTML: DocFlavor.STRING = ???

    /** Doc flavor with MIME type = "text/plain;
     *  charset=utf-16", print data representation class name =
     *  "java.lang.String".
     */
    @stub
    val TEXT_PLAIN: DocFlavor.STRING = ???
}
