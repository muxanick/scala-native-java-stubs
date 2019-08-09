package java.awt

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by method createFont in the Font class to indicate
 *  that the specified font is bad.
 */
class FontFormatException extends Exception {

    /** Report a FontFormatException for the reason specified. */
    @stub
    def this(reason: String) = ???
}
