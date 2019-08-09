package java.nio.channels

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{Object, String}
import java.nio.charset.{CharsetDecoder, CharsetEncoder}

// Utility methods for channels and streams.
//
//  This class defines static methods that support the interoperation of the
// stream classes of the java.io package with the channel
// classes of this package.  
final class Channels extends Object {
}

object Channels {
    @stub
    // Constructs a channel that reads bytes from the given stream.
    def newChannel(in: InputStream): ReadableByteChannel = ???

    @stub
    // Constructs a channel that writes bytes to the given stream.
    def newChannel(out: OutputStream): WritableByteChannel = ???

    @stub
    // Constructs a stream that reads bytes from the given channel.
    def newInputStream(ch: AsynchronousByteChannel): InputStream = ???

    @stub
    // Constructs a stream that reads bytes from the given channel.
    def newInputStream(ch: ReadableByteChannel): InputStream = ???

    @stub
    // Constructs a stream that writes bytes to the given channel.
    def newOutputStream(ch: AsynchronousByteChannel): OutputStream = ???

    @stub
    // Constructs a stream that writes bytes to the given channel.
    def newOutputStream(ch: WritableByteChannel): OutputStream = ???

    @stub
    // Constructs a reader that decodes bytes from the given channel using the
    // given decoder.
    def newReader(ch: ReadableByteChannel, dec: CharsetDecoder, minBufferCap: Int): Reader = ???

    @stub
    // Constructs a reader that decodes bytes from the given channel according
    // to the named charset.
    def newReader(ch: ReadableByteChannel, csName: String): Reader = ???

    @stub
    // Constructs a writer that encodes characters using the given encoder and
    // writes the resulting bytes to the given channel.
    def newWriter(ch: WritableByteChannel, enc: CharsetEncoder, minBufferCap: Int): Writer = ???
}
