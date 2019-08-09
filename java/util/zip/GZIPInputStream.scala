package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

// This class implements a stream filter for reading compressed data in
// the GZIP file format.
class GZIPInputStream extends InflaterInputStream {

    @stub
    // Creates a new input stream with a default buffer size.
    def this(in: InputStream) = ???

    @stub
    // CRC-32 for uncompressed data.
    protected def crc: CRC32 = ???

    @stub
    // Indicates end of input stream.
    protected def eos: Boolean = ???

    @stub
    // Closes this input stream and releases any system resources associated
    // with the stream.
    def close(): Unit = ???
}
