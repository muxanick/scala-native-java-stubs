package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when a character with an invalid Unicode code
 *  point as defined by Character.isValidCodePoint(int) is passed to the
 *  Formatter.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class IllegalFormatCodePointException extends IllegalFormatException {

    /** Constructs an instance of this class with the specified illegal code
     *  point as defined by Character.isValidCodePoint(int).
     */
    @stub
    def this(c: Int) = ???

    /** Returns the illegal code point as defined by Character.isValidCodePoint(int). */
    @stub
    def getCodePoint(): Int = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
