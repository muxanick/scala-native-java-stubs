package javax.crypto

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This exception is thrown when the length of data provided to a block
 *  cipher is incorrect, i.e., does not match the block size of the cipher.
 */
class IllegalBlockSizeException extends GeneralSecurityException {

    /** Constructs an IllegalBlockSizeException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an IllegalBlockSizeException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
