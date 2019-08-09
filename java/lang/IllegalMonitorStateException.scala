package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that a thread has attempted to wait on an
 *  object's monitor or to notify other threads waiting on an object's
 *  monitor without owning the specified monitor.
 */
class IllegalMonitorStateException extends RuntimeException {

    /** Constructs an IllegalMonitorStateException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalMonitorStateException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
