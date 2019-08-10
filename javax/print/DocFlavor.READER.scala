package javax.print

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class DocFlavor.READER provides predefined static constant DocFlavor
 *  objects for example doc flavors using a character stream (java.io.Reader) as the print data
 *  representation class. As such, the character set is Unicode.
 *  
 */
object DocFlavor_READER extends DocFlavor {

    /** Constructs a new doc flavor with the given MIME type and a print
     *  data representation class name of\
     *  "java.io.Reader" (character stream).
     */
    @stub
    def READER(mimeType: String) = ???

    /** Doc flavor with MIME type = "text/html;
     *  charset=utf-16", print data representation class name =
     *  "java.io.Reader" (character stream).
     */
    @stub
    val TEXT_HTML: DocFlavor.READER = ???

    /** Doc flavor with MIME type = "text/plain;
     *  charset=utf-16", print data representation class name =
     *  "java.io.Reader" (character stream).
     */
    @stub
    val TEXT_PLAIN: DocFlavor.READER = ???
}
