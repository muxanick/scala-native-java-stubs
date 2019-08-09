package javax.imageio.plugins.jpeg

import java.lang.Object

/** A class encapsulating a single JPEG Huffman table.
 *  Fields are provided for the "standard" tables taken
 *  from Annex K of the JPEG specification.
 *  These are the tables used as defaults.
 *  
 *  For more information about the operation of the standard JPEG plug-in,
 *  see the JPEG
 *  metadata format specification and usage notes
 */
class JPEGHuffmanTable extends Object {

    /** Returns an array of shorts containing the number of values
     *  for each length in the Huffman table.
     */
    @stub
    def getLengths(): Array[Short] = ???

    /** Returns an array of shorts containing the values arranged
     *  by increasing length of their corresponding codes.
     */
    @stub
    def getValues(): Array[Short] = ???
}

object JPEGHuffmanTable {
    /** The standard AC chrominance Huffman table. */
    @stub
    val StdACChrominance: JPEGHuffmanTable = ???

    /** The standard AC luminance Huffman table. */
    @stub
    val StdACLuminance: JPEGHuffmanTable = ???

    /** The standard DC chrominance Huffman table. */
    @stub
    val StdDCChrominance: JPEGHuffmanTable = ???
}
