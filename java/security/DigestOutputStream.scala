package java.security

import java.io.{FilterOutputStream, OutputStream}
import java.lang.{Object, String}

// A transparent stream that updates the associated message digest using
// the bits going through the stream.
//
// To complete the message digest computation, call one of the
// digest methods on the associated message
// digest after your calls to one of this digest output stream's
// write methods.
//
// It is possible to turn this stream on or off (see
// on). When it is on, a call to one of the
// write methods results in
// an update on the message digest.  But when it is off, the message
// digest is not updated. The default is for the stream to be on.
class DigestOutputStream extends FilterOutputStream {

    @stub
    // Returns the message digest associated with this stream.
    def getMessageDigest(): MessageDigest = ???

    @stub
    // Turns the digest function on or off.
    def on(on: Boolean): Unit = ???

    @stub
    // Associates the specified message digest with this stream.
    def setMessageDigest(digest: MessageDigest): Unit = ???

    @stub
    // Prints a string representation of this digest output stream and
    // its associated message digest object.
    def toString(): String = ???

    @stub
    // Updates the message digest (if the digest function is on) using
    // the specified subarray, and in any case writes the subarray to
    // the output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
