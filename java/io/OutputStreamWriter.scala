package java.io

import java.lang.{Object, String}
import java.nio.charset.{Charset, CharsetEncoder}

// An OutputStreamWriter is a bridge from character streams to byte streams:
// Characters written to it are encoded into bytes using a specified charset.  The charset that it uses
// may be specified by name or may be given explicitly, or the platform's
// default charset may be accepted.
//
//  Each invocation of a write() method causes the encoding converter to be
// invoked on the given character(s).  The resulting bytes are accumulated in a
// buffer before being written to the underlying output stream.  The size of
// this buffer may be specified, but by default it is large enough for most
// purposes.  Note that the characters passed to the write() methods are not
// buffered.
//
//  For top efficiency, consider wrapping an OutputStreamWriter within a
// BufferedWriter so as to avoid frequent converter invocations.  For example:
//
// 
// Writer out
//   = new BufferedWriter(new OutputStreamWriter(System.out));
// 
//
//  A surrogate pair is a character represented by a sequence of two
// char values: A high surrogate in the range '\uD800' to
// '\uDBFF' followed by a low surrogate in the range '\uDC00' to
// '\uDFFF'.
//
//  A malformed surrogate element is a high surrogate that is not
// followed by a low surrogate or a low surrogate that is not preceded by a
// high surrogate.
//
//  This class always replaces malformed surrogate elements and unmappable
// character sequences with the charset's default substitution sequence.
// The CharsetEncoder class should be used when more
// control over the encoding process is required.
class OutputStreamWriter extends Writer {

    @stub
    // Creates an OutputStreamWriter that uses the default character encoding.
    def this(out: OutputStream) = ???

    @stub
    // Creates an OutputStreamWriter that uses the given charset.
    def this(out: OutputStream, cs: Charset) = ???

    @stub
    // Creates an OutputStreamWriter that uses the given charset encoder.
    def this(out: OutputStream, enc: CharsetEncoder) = ???

    @stub
    // Closes the stream, flushing it first.
    def close(): Unit = ???

    @stub
    // Flushes the stream.
    def flush(): Unit = ???

    @stub
    // Returns the name of the character encoding being used by this stream.
    def getEncoding(): String = ???

    @stub
    // Writes a portion of an array of characters.
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    @stub
    // Writes a single character.
    def write(c: Int): Unit = ???
}
