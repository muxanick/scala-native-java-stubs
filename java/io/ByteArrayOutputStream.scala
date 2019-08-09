package java.io

import java.lang.{Object, String}

// This class implements an output stream in which the data is
// written into a byte array. The buffer automatically grows as data
// is written to it.
// The data can be retrieved using toByteArray() and
// toString().
// 
// Closing a ByteArrayOutputStream has no effect. The methods in
// this class can be called after the stream has been closed without
// generating an IOException.
class ByteArrayOutputStream extends OutputStream {

    @stub
    // Creates a new byte array output stream.
    def this() = ???

    @stub
    // The buffer where data is stored.
    protected def buf: Array[Byte] = ???

    @stub
    // Closing a ByteArrayOutputStream has no effect.
    def close(): Unit = ???

    @stub
    // Resets the count field of this byte array output
    // stream to zero, so that all currently accumulated output in the
    // output stream is discarded.
    def reset(): Unit = ???

    @stub
    // Returns the current size of the buffer.
    def size(): Int = ???

    @stub
    // Creates a newly allocated byte array.
    def toByteArray(): Array[Byte] = ???

    @stub
    // Converts the buffer's contents into a string decoding bytes using the
    // platform's default character set.
    def toString(): String = ???

    @stub
    // Deprecated. 
    //This method does not properly convert bytes into characters.
    // As of JDK 1.1, the preferred way to do this is via the
    // toString(String enc) method, which takes an encoding-name
    // argument, or the toString() method, which uses the
    // platform's default character encoding.
    //
    def toString(hibyte: Int): String = ???

    @stub
    // Converts the buffer's contents into a string by decoding the bytes using
    // the named charset.
    def toString(charsetName: String): String = ???

    @stub
    // Writes len bytes from the specified byte array
    // starting at offset off to this byte array output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Writes the specified byte to this byte array output stream.
    def write(b: Int): Unit = ???
}
