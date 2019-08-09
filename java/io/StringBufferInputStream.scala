package java.io

import java.lang.{Deprecated, Object, String}

// This class allows an application to create an input stream in
// which the bytes read are supplied by the contents of a string.
// Applications can also read bytes from a byte array by using a
// ByteArrayInputStream.
// 
// Only the low eight bits of each character in the string are used by
// this class.
@Deprecated class StringBufferInputStream extends InputStream {

    @stub
    // Deprecated. 
    protected def buffer: String = ???

    @stub
    // Deprecated. 
    protected def count: Int = ???

    @stub
    // Deprecated. 
    def available(): Int = ???

    @stub
    // Deprecated. 
    def read(): Int = ???

    @stub
    // Deprecated. 
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Deprecated. 
    def reset(): Unit = ???
}
