package java.security

import java.io.{FilterOutputStream, OutputStream}
import java.lang.{Object, String}

/** A transparent stream that updates the associated message digest using
 *  the bits going through the stream.
 * 
 *  To complete the message digest computation, call one of the
 *  digest methods on the associated message
 *  digest after your calls to one of this digest output stream's
 *  write methods.
 * 
 *  It is possible to turn this stream on or off (see
 *  on). When it is on, a call to one of the
 *  write methods results in
 *  an update on the message digest.  But when it is off, the message
 *  digest is not updated. The default is for the stream to be on.
 */
class DigestOutputStream extends FilterOutputStream {

    /** Returns the message digest associated with this stream. */
    @stub
    def getMessageDigest(): MessageDigest = ???

    /** Turns the digest function on or off. */
    @stub
    def on(on: Boolean): Unit = ???

    /** Associates the specified message digest with this stream. */
    @stub
    def setMessageDigest(digest: MessageDigest): Unit = ???

    /** Prints a string representation of this digest output stream and
     *  its associated message digest object.
     */
    @stub
    def toString(): String = ???

    /** Updates the message digest (if the digest function is on) using
     *  the specified subarray, and in any case writes the subarray to
     *  the output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
