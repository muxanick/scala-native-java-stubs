package java.util.zip

import java.lang.Object

// This class provides support for general purpose compression using the
// popular ZLIB compression library. The ZLIB compression library was
// initially developed as part of the PNG graphics standard and is not
// protected by patents. It is fully described in the specifications at
// the java.util.zip
// package description.
//
// The following code fragment demonstrates a trivial compression
// and decompression of a string using Deflater and
// Inflater.
//
// 
// try {
//     // Encode a String into bytes
//     String inputString = "blahblahblah";
//     byte[] input = inputString.getBytes("UTF-8");
//
//     // Compress the bytes
//     byte[] output = new byte[100];
//     Deflater compresser = new Deflater();
//     compresser.setInput(input);
//     compresser.finish();
//     int compressedDataLength = compresser.deflate(output);
//     compresser.end();
//
//     // Decompress the bytes
//     Inflater decompresser = new Inflater();
//     decompresser.setInput(output, 0, compressedDataLength);
//     byte[] result = new byte[100];
//     int resultLength = decompresser.inflate(result);
//     decompresser.end();
//
//     // Decode the bytes into a String
//     String outputString = new String(result, 0, resultLength, "UTF-8");
// } catch(java.io.UnsupportedEncodingException ex) {
//     // handle
// } catch (java.util.zip.DataFormatException ex) {
//     // handle
// }
// 
class Deflater extends Object {

    @stub
    // Creates a new compressor with the default compression level.
    def this() = ???

    @stub
    // Creates a new compressor using the specified compression level.
    def this(level: Int) = ???

    @stub
    // Compresses the input data and fills specified buffer with compressed
    // data.
    def deflate(b: Array[Byte]): Int = ???

    @stub
    // Compresses the input data and fills specified buffer with compressed
    // data.
    def deflate(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Compresses the input data and fills the specified buffer with compressed
    // data.
    def deflate(b: Array[Byte], off: Int, len: Int, flush: Int): Int = ???

    @stub
    // Closes the compressor and discards any unprocessed input.
    def end(): Unit = ???

    @stub
    // Closes the compressor when garbage is collected.
    protected def finalize(): Unit = ???

    @stub
    // When called, indicates that compression should end with the current
    // contents of the input buffer.
    def finish(): Unit = ???

    @stub
    // Returns true if the end of the compressed data output stream has
    // been reached.
    def finished(): Boolean = ???

    @stub
    // Returns the ADLER-32 value of the uncompressed data.
    def getAdler(): Int = ???

    @stub
    // Returns the total number of uncompressed bytes input so far.
    def getBytesRead(): Long = ???

    @stub
    // Returns the total number of compressed bytes output so far.
    def getBytesWritten(): Long = ???

    @stub
    // Returns the total number of uncompressed bytes input so far.
    def getTotalIn(): Int = ???

    @stub
    // Returns the total number of compressed bytes output so far.
    def getTotalOut(): Int = ???

    @stub
    // Returns true if the input data buffer is empty and setInput()
    // should be called in order to provide more input.
    def needsInput(): Boolean = ???

    @stub
    // Resets deflater so that a new set of input data can be processed.
    def reset(): Unit = ???

    @stub
    // Sets preset dictionary for compression.
    def setDictionary(b: Array[Byte]): Unit = ???

    @stub
    // Sets preset dictionary for compression.
    def setDictionary(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Sets input data for compression.
    def setInput(b: Array[Byte]): Unit = ???

    @stub
    // Sets input data for compression.
    def setInput(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Sets the compression level to the specified value.
    def setLevel(level: Int): Unit = ???
}

object Deflater {
    @stub
    // Compression level for best compression.
    def BEST_COMPRESSION: Int = ???

    @stub
    // Compression level for fastest compression.
    def BEST_SPEED: Int = ???

    @stub
    // Default compression level.
    def DEFAULT_COMPRESSION: Int = ???

    @stub
    // Default compression strategy.
    def DEFAULT_STRATEGY: Int = ???

    @stub
    // Compression method for the deflate algorithm (the only one currently
    // supported).
    def DEFLATED: Int = ???

    @stub
    // Compression strategy best used for data consisting mostly of small
    // values with a somewhat random distribution.
    def FILTERED: Int = ???

    @stub
    // Compression flush mode used to flush out all pending output and
    // reset the deflater.
    def FULL_FLUSH: Int = ???

    @stub
    // Compression strategy for Huffman coding only.
    def HUFFMAN_ONLY: Int = ???

    @stub
    // Compression level for no compression.
    def NO_COMPRESSION: Int = ???

    @stub
    // Compression flush mode used to achieve best compression result.
    def NO_FLUSH: Int = ???
}
