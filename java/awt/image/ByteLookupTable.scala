package java.awt.image

import java.lang.Object

// This class defines a lookup table object.  The output of a
// lookup operation using an object of this class is interpreted
// as an unsigned byte quantity.  The lookup table contains byte
// data arrays for one or more bands (or components) of an image,
// and it contains an offset which will be subtracted from the
// input values before indexing the arrays.  This allows an array
// smaller than the native data size to be provided for a
// constrained input.  If there is only one array in the lookup
// table, it will be applied to all bands.
class ByteLookupTable extends LookupTable {

    @stub
    // Constructs a ByteLookupTable object from an array
    // of bytes representing a lookup table to be applied to all
    // bands.
    def this(offset: Int, data: Array[Byte]) = ???

    @stub
    // Returns the lookup table data by reference.
    def getTable(): Array[Array[Byte]] = ???

    @stub
    // Returns an array of samples of a pixel, translated with the lookup
    // table.
    def lookupPixel(src: Array[Byte], dst: Array[Byte]): Array[Byte] = ???
}
