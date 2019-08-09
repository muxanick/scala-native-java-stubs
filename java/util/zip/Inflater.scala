package java.util.zip

import java.lang.Object

// This class provides support for general purpose decompression using the
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
//     String inputString = "blahblahblah??";
//     byte[] input = inputString.getBytes("UTF-8");
//
//     // Compress the bytes
//     byte[] output = new byte[100];
//     Deflater compresser = new Deflater();
//     compresser.setInput(input);
//     compresser.finish();
//     int compressedDataLength = compresser.deflate(output);
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
class Inflater extends Object {

    @stub
    // Creates a new decompressor.
    def this() = ???

    @stub
    // Closes the decompressor and discards any unprocessed input.
    def end(): Unit = ???

    @stub
    // Closes the decompressor when garbage is collected.
    protected def finalize(): Unit = ???

    @stub
    // Returns true if the end of the compressed data stream has been
    // reached.
    def finished(): Boolean = ???

    @stub
    // Returns the ADLER-32 value of the uncompressed data.
    def getAdler(): Int = ???

    @stub
    // Returns the total number of compressed bytes input so far.
    def getBytesRead(): Long = ???

    @stub
    // Returns the total number of uncompressed bytes output so far.
    def getBytesWritten(): Long = ???

    @stub
    // Returns the total number of bytes remaining in the input buffer.
    def getRemaining(): Int = ???

    @stub
    // Returns the total number of compressed bytes input so far.
    def getTotalIn(): Int = ???

    @stub
    // Returns the total number of uncompressed bytes output so far.
    def getTotalOut(): Int = ???

    @stub
    // Uncompresses bytes into specified buffer.
    def inflate(b: Array[Byte]): Int = ???

    @stub
    // Uncompresses bytes into specified buffer.
    def inflate(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Returns true if a preset dictionary is needed for decompression.
    def needsDictionary(): Boolean = ???

    @stub
    // Returns true if no data remains in the input buffer.
    def needsInput(): Boolean = ???

    @stub
    // Resets inflater so that a new set of input data can be processed.
    def reset(): Unit = ???

    @stub
    // Sets the preset dictionary to the given array of bytes.
    def setDictionary(b: Array[Byte]): Unit = ???

    @stub
    // Sets the preset dictionary to the given array of bytes.
    def setDictionary(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Sets input data for decompression.
    def setInput(b: Array[Byte]): Unit = ???
}
