package java.nio.charset

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when an input byte sequence is not legal for given
 *  charset, or an input character sequence is not a legal sixteen-bit Unicode
 *  sequence.
 */
class MalformedInputException extends CharacterCodingException {

    /** Constructs an MalformedInputException with the given
     *  length.
     */
    @stub
    def this(inputLength: Int) = ???

    /** Returns the length of the input. */
    @stub
    def getInputLength(): Int = ???

    /** Returns the message. */
    @stub
    def getMessage(): String = ???
}
