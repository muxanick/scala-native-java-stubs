package javax.sound.sampled

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A LineUnavailableException is an exception indicating that a
 *  line cannot be opened because it is unavailable.  This situation
 *  arises most commonly when a requested line is already in use
 *  by another application.
 */
class LineUnavailableException extends Exception {

    /** Constructs a LineUnavailableException that has
     *  null as its error detail message.
     */
    @stub
    def this() = ???

    /** Constructs a LineUnavailableException that has
     *  the specified detail message.
     */
    @stub
    def this(message: String) = ???
}
