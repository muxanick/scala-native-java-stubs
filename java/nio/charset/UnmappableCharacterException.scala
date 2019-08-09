package java.nio.charset

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when an input character (or byte) sequence
 *  is valid but cannot be mapped to an output byte (or character)
 *  sequence.
 */
class UnmappableCharacterException extends CharacterCodingException {

    /** Constructs an UnmappableCharacterException with the
     *  given length.
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
