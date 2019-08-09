package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that the application has attempted to convert
 *  a string to one of the numeric types, but that the string does not
 *  have the appropriate format.
 */
class NumberFormatException extends IllegalArgumentException {

    /** Constructs a NumberFormatException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a NumberFormatException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
