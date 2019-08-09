package java.util.zip

import java.lang.Object

/** This class provides support for general purpose decompression using the
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
 *      String inputString = "blahblahblah??";
 *      byte[] input = inputString.getBytes("UTF-8");
 * 
 *      // Compress the bytes
 *      byte[] output = new byte[100];
 *      Deflater compresser = new Deflater();
 *      compresser.setInput(input);
 *      compresser.finish();
 *      int compressedDataLength = compresser.deflate(output);
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
class Inflater extends Object {

    /** Creates a new decompressor. */
    @stub
    def this() = ???

    /** Closes the decompressor and discards any unprocessed input. */
    @stub
    def end(): Unit = ???

    /** Closes the decompressor when garbage is collected. */
    @stub
    protected def finalize(): Unit = ???

    /** Returns true if the end of the compressed data stream has been
     *  reached.
     */
    @stub
    def finished(): Boolean = ???

    /** Returns the ADLER-32 value of the uncompressed data. */
    @stub
    def getAdler(): Int = ???

    /** Returns the total number of compressed bytes input so far. */
    @stub
    def getBytesRead(): Long = ???

    /** Returns the total number of uncompressed bytes output so far. */
    @stub
    def getBytesWritten(): Long = ???

    /** Returns the total number of bytes remaining in the input buffer. */
    @stub
    def getRemaining(): Int = ???

    /** Returns the total number of compressed bytes input so far. */
    @stub
    def getTotalIn(): Int = ???

    /** Returns the total number of uncompressed bytes output so far. */
    @stub
    def getTotalOut(): Int = ???

    /** Uncompresses bytes into specified buffer. */
    @stub
    def inflate(b: Array[Byte]): Int = ???

    /** Uncompresses bytes into specified buffer. */
    @stub
    def inflate(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Returns true if a preset dictionary is needed for decompression. */
    @stub
    def needsDictionary(): Boolean = ???

    /** Returns true if no data remains in the input buffer. */
    @stub
    def needsInput(): Boolean = ???

    /** Resets inflater so that a new set of input data can be processed. */
    @stub
    def reset(): Unit = ???

    /** Sets the preset dictionary to the given array of bytes. */
    @stub
    def setDictionary(b: Array[Byte]): Unit = ???

    /** Sets the preset dictionary to the given array of bytes. */
    @stub
    def setDictionary(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Sets input data for decompression. */
    @stub
    def setInput(b: Array[Byte]): Unit = ???
}
