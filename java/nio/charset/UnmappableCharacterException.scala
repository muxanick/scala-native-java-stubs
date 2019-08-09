package java.nio.charset

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Checked exception thrown when an input character (or byte) sequence
 *  is valid but cannot be mapped to an output byte (or character)
 *  sequence.
 */
class UnmappableCharacterException extends CharacterCodingException {

    /** Returns the length of the input. */
    @stub
    def getInputLength(): Int = ???
}
