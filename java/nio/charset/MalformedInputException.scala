package java.nio.charset

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception thrown when an input byte sequence is not legal for given
// charset, or an input character sequence is not a legal sixteen-bit Unicode
// sequence.
class MalformedInputException extends CharacterCodingException {

    @stub
    // Returns the length of the input.
    def getInputLength(): Int = ???
}
