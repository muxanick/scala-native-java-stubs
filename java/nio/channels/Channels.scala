package java.nio.channels

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{Object, String}
import java.nio.charset.{CharsetDecoder, CharsetEncoder}

/** Utility methods for channels and streams.
 * 
 *   This class defines static methods that support the interoperation of the
 *  stream classes of the java.io package with the channel
 *  classes of this package.  
 */
final class Channels extends Object {
}

object Channels {
    /** Constructs a channel that reads bytes from the given stream. */
    @stub
    def newChannel(in: InputStream): ReadableByteChannel = ???

    /** Constructs a channel that writes bytes to the given stream. */
    @stub
    def newChannel(out: OutputStream): WritableByteChannel = ???

    /** Constructs a stream that reads bytes from the given channel. */
    @stub
    def newInputStream(ch: AsynchronousByteChannel): InputStream = ???

    /** Constructs a stream that reads bytes from the given channel. */
    @stub
    def newInputStream(ch: ReadableByteChannel): InputStream = ???

    /** Constructs a stream that writes bytes to the given channel. */
    @stub
    def newOutputStream(ch: AsynchronousByteChannel): OutputStream = ???

    /** Constructs a stream that writes bytes to the given channel. */
    @stub
    def newOutputStream(ch: WritableByteChannel): OutputStream = ???

    /** Constructs a reader that decodes bytes from the given channel using the
     *  given decoder.
     */
    @stub
    def newReader(ch: ReadableByteChannel, dec: CharsetDecoder, minBufferCap: Int): Reader = ???

    /** Constructs a reader that decodes bytes from the given channel according
     *  to the named charset.
     */
    @stub
    def newReader(ch: ReadableByteChannel, csName: String): Reader = ???

    /** Constructs a writer that encodes characters using the given encoder and
     *  writes the resulting bytes to the given channel.
     */
    @stub
    def newWriter(ch: WritableByteChannel, enc: CharsetEncoder, minBufferCap: Int): Writer = ???
}
