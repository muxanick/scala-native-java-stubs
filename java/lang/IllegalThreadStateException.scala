package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that a thread is not in an appropriate state
 *  for the requested operation. See, for example, the
 *  suspend and resume methods in class
 *  Thread.
 */
class IllegalThreadStateException extends IllegalArgumentException {

    /** Constructs an IllegalThreadStateException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalThreadStateException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
