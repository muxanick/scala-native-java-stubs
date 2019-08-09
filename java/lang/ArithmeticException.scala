package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an exceptional arithmetic condition has occurred. For
 *  example, an integer "divide by zero" throws an
 *  instance of this class.
 * 
 *  ArithmeticException objects may be constructed by the
 *  virtual machine as if suppression were disabled and/or the
 *  stack trace was not writable.
 */
class ArithmeticException extends RuntimeException {

    /** Constructs an ArithmeticException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs an ArithmeticException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
