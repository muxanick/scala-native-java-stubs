package javax.imageio.plugins.jpeg

import java.lang.Object

// A class encapsulating a single JPEG quantization table.
// The elements appear in natural order (as opposed to zig-zag order).
// Static variables are provided for the "standard" tables taken from
//  Annex K of the JPEG specification, as well as the default tables
// conventionally used for visually lossless encoding.
// 
// For more information about the operation of the standard JPEG plug-in,
// see the JPEG
// metadata format specification and usage notes
class JPEGQTable extends Object {

    @stub
    // Returns a new quantization table where the values are multiplied
    // by scaleFactor and then clamped to the range 1..32767
    // (or to 1..255 if forceBaseline is true).
    def getScaledInstance(scaleFactor: float, forceBaseline: Boolean): JPEGQTable = ???

    @stub
    // Returns a copy of the current quantization table as an array
    // of ints in natural (not zig-zag) order.
    def getTable(): Array[Int] = ???
}

object JPEGQTable {
    @stub
    // The sample luminance quantization table given in the JPEG
    // specification, table K.1, with all elements divided by 2.
    def K1Div2Luminance: JPEGQTable = ???

    @stub
    // The sample luminance quantization table given in the JPEG
    // specification, table K.1.
    def K1Luminance: JPEGQTable = ???

    @stub
    // The sample chrominance quantization table given in the JPEG
    // specification, table K.2.
    def K2Chrominance: JPEGQTable = ???
}
