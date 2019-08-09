package java.security

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

/** A transparent stream that updates the associated message digest using
 *  the bits going through the stream.
 * 
 *  To complete the message digest computation, call one of the
 *  digest methods on the associated message
 *  digest after your calls to one of this digest input stream's
 *  read methods.
 * 
 *  It is possible to turn this stream on or off (see
 *  on). When it is on, a call to one of the
 *  read methods
 *  results in an update on the message digest.  But when it is off,
 *  the message digest is not updated. The default is for the stream
 *  to be on.
 * 
 *  Note that digest objects can compute only one digest (see
 *  MessageDigest),
 *  so that in order to compute intermediate digests, a caller should
 *  retain a handle onto the digest object, and clone it for each
 *  digest to be computed, leaving the orginal digest untouched.
 */
class DigestInputStream extends FilterInputStream {

    /** Returns the message digest associated with this stream. */
    @stub
    def getMessageDigest(): MessageDigest = ???

    /** Turns the digest function on or off. */
    @stub
    def on(on: Boolean): Unit = ???

    /** Reads a byte, and updates the message digest (if the digest
     *  function is on).
     */
    @stub
    def read(): Int = ???

    /** Reads into a byte array, and updates the message digest (if the
     *  digest function is on).
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Associates the specified message digest with this stream. */
    @stub
    def setMessageDigest(digest: MessageDigest): Unit = ???
}
