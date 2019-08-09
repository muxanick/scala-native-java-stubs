package java.util.zip

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class provides support for general purpose compression using the
 *  popular ZLIB compression library. The ZLIB compression library was
 *  initially developed as part of the PNG graphics standard and is not
 *  protected by patents. It is fully described in the specifications at
 *  the java.util.zip
 *  package description.
 * 
 *  The following code fragment demonstrates a trivial compression
 *  and decompression of a string using Deflater and
 *  Inflater.
 * 
 *  
 *  try {
 *      // Encode a String into bytes
 *      String inputString = "blahblahblah";
 *      byte[] input = inputString.getBytes("UTF-8");
 * 
 *      // Compress the bytes
 *      byte[] output = new byte[100];
 *      Deflater compresser = new Deflater();
 *      compresser.setInput(input);
 *      compresser.finish();
 *      int compressedDataLength = compresser.deflate(output);
 *      compresser.end();
 * 
 *      // Decompress the bytes
 *      Inflater decompresser = new Inflater();
 *      decompresser.setInput(output, 0, compressedDataLength);
 *      byte[] result = new byte[100];
 *      int resultLength = decompresser.inflate(result);
 *      decompresser.end();
 * 
 *      // Decode the bytes into a String
 *      String outputString = new String(result, 0, resultLength, "UTF-8");
 *  } catch(java.io.UnsupportedEncodingException ex) {
 *      // handle
 *  } catch (java.util.zip.DataFormatException ex) {
 *      // handle
 *  }
 *  
 */
class Deflater extends Object {

    /** Creates a new compressor with the default compression level. */
    @stub
    def this() = ???

    /** Creates a new compressor using the specified compression level. */
    @stub
    def this(level: Int) = ???

    /** Creates a new compressor using the specified compression level. */
    @stub
    def this(level: Int, nowrap: Boolean) = ???

    /** Compresses the input data and fills specified buffer with compressed
     *  data.
     */
    @stub
    def deflate(b: Array[Byte]): Int = ???

    /** Compresses the input data and fills specified buffer with compressed
     *  data.
     */
    @stub
    def deflate(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Compresses the input data and fills the specified buffer with compressed
     *  data.
     */
    @stub
    def deflate(b: Array[Byte], off: Int, len: Int, flush: Int): Int = ???

    /** Closes the compressor and discards any unprocessed input. */
    @stub
    def end(): Unit = ???

    /** Closes the compressor when garbage is collected. */
    @stub
    protected def finalize(): Unit = ???

    /** When called, indicates that compression should end with the current
     *  contents of the input buffer.
     */
    @stub
    def finish(): Unit = ???

    /** Returns true if the end of the compressed data output stream has
     *  been reached.
     */
    @stub
    def finished(): Boolean = ???

    /** Returns the ADLER-32 value of the uncompressed data. */
    @stub
    def getAdler(): Int = ???

    /** Returns the total number of uncompressed bytes input so far. */
    @stub
    def getBytesRead(): Long = ???

    /** Returns the total number of compressed bytes output so far. */
    @stub
    def getBytesWritten(): Long = ???

    /** Returns the total number of uncompressed bytes input so far. */
    @stub
    def getTotalIn(): Int = ???

    /** Returns the total number of compressed bytes output so far. */
    @stub
    def getTotalOut(): Int = ???

    /** Returns true if the input data buffer is empty and setInput()
     *  should be called in order to provide more input.
     */
    @stub
    def needsInput(): Boolean = ???

    /** Resets deflater so that a new set of input data can be processed. */
    @stub
    def reset(): Unit = ???

    /** Sets preset dictionary for compression. */
    @stub
    def setDictionary(b: Array[Byte]): Unit = ???

    /** Sets preset dictionary for compression. */
    @stub
    def setDictionary(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Sets input data for compression. */
    @stub
    def setInput(b: Array[Byte]): Unit = ???

    /** Sets input data for compression. */
    @stub
    def setInput(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Sets the compression level to the specified value. */
    @stub
    def setLevel(level: Int): Unit = ???

    /** Sets the compression strategy to the specified value. */
    @stub
    def setStrategy(strategy: Int): Unit = ???
}

object Deflater {
    /** Compression level for best compression. */
    @stub
    val BEST_COMPRESSION: Int = ???

    /** Compression level for fastest compression. */
    @stub
    val BEST_SPEED: Int = ???

    /** Default compression level. */
    @stub
    val DEFAULT_COMPRESSION: Int = ???

    /** Default compression strategy. */
    @stub
    val DEFAULT_STRATEGY: Int = ???

    /** Compression method for the deflate algorithm (the only one currently
     *  supported).
     */
    @stub
    val DEFLATED: Int = ???

    /** Compression strategy best used for data consisting mostly of small
     *  values with a somewhat random distribution.
     */
    @stub
    val FILTERED: Int = ???

    /** Compression flush mode used to flush out all pending output and
     *  reset the deflater.
     */
    @stub
    val FULL_FLUSH: Int = ???

    /** Compression strategy for Huffman coding only. */
    @stub
    val HUFFMAN_ONLY: Int = ???

    /** Compression level for no compression. */
    @stub
    val NO_COMPRESSION: Int = ???

    /** Compression flush mode used to achieve best compression result. */
    @stub
    val NO_FLUSH: Int = ???

    /** Compression flush mode used to flush out all pending output; may
     *  degrade compression for some compression algorithms.
     */
    @stub
    val SYNC_FLUSH: Int = ???
}
