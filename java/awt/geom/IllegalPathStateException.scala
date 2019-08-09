package java.awt.geom

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** The IllegalPathStateException represents an
 *  exception that is thrown if an operation is performed on a path
 *  that is in an illegal state with respect to the particular
 *  operation being performed, such as appending a path segment
 *  to a GeneralPath without an initial moveto.
 */
class IllegalPathStateException extends RuntimeException {

    /** Constructs an IllegalPathStateException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalPathStateException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
