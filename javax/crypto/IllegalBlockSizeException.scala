package javax.crypto

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

// This exception is thrown when the length of data provided to a block
// cipher is incorrect, i.e., does not match the block size of the cipher.
class IllegalBlockSizeException extends GeneralSecurityException {

    @stub
    // Constructs an IllegalBlockSizeException with no detail message.
    def this() = ???
}
