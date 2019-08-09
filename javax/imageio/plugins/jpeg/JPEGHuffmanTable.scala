package javax.imageio.plugins.jpeg

import java.lang.Object

// A class encapsulating a single JPEG Huffman table.
// Fields are provided for the "standard" tables taken
// from Annex K of the JPEG specification.
// These are the tables used as defaults.
// 
// For more information about the operation of the standard JPEG plug-in,
// see the JPEG
// metadata format specification and usage notes
class JPEGHuffmanTable extends Object {

    @stub
    // Returns an array of shorts containing the number of values
    // for each length in the Huffman table.
    def getLengths(): Array[Short] = ???

    @stub
    // Returns an array of shorts containing the values arranged
    // by increasing length of their corresponding codes.
    def getValues(): Array[Short] = ???
}

object JPEGHuffmanTable {
    @stub
    // The standard AC chrominance Huffman table.
    def StdACChrominance: JPEGHuffmanTable = ???

    @stub
    // The standard AC luminance Huffman table.
    def StdACLuminance: JPEGHuffmanTable = ???

    @stub
    // The standard DC chrominance Huffman table.
    def StdDCChrominance: JPEGHuffmanTable = ???
}
