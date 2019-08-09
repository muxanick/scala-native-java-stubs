package java.util.logging

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Format a LogRecord into a standard XML format.
 *  
 *  The DTD specification is provided as Appendix A to the
 *  Java Logging APIs specification.
 *  
 *  The XMLFormatter can be used with arbitrary character encodings,
 *  but it is recommended that it normally be used with UTF-8.  The
 *  character encoding can be set on the output Handler.
 */
class XMLFormatter extends Formatter {

    /**  */
    @stub
    def this() = ???

    /** Format the given message to XML. */
    @stub
    def format(record: LogRecord): String = ???

    /** Return the header string for a set of XML formatted records. */
    @stub
    def getHead(h: Handler): String = ???

    /** Return the tail string for a set of XML formatted records. */
    @stub
    def getTail(h: Handler): String = ???
}
