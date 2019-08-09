package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class defines a lookup table object.  The output of a
 *  lookup operation using an object of this class is interpreted
 *  as an unsigned byte quantity.  The lookup table contains byte
 *  data arrays for one or more bands (or components) of an image,
 *  and it contains an offset which will be subtracted from the
 *  input values before indexing the arrays.  This allows an array
 *  smaller than the native data size to be provided for a
 *  constrained input.  If there is only one array in the lookup
 *  table, it will be applied to all bands.
 */
class ByteLookupTable extends LookupTable {

    /** Constructs a ByteLookupTable object from an array
     *  of bytes representing a lookup table to be applied to all
     *  bands.
     */
    @stub
    def this(offset: Int, data: Array[Byte]) = ???

    /** Constructs a ByteLookupTable object from an array of byte
     *  arrays representing a lookup table for each
     *  band.
     */
    @stub
    def this(offset: Int, data: Array[Array[Byte]]) = ???

    /** Returns the lookup table data by reference. */
    @stub
    def getTable(): Array[Array[Byte]] = ???

    /** Returns an array of samples of a pixel, translated with the lookup
     *  table.
     */
    @stub
    def lookupPixel(src: Array[Byte], dst: Array[Byte]): Array[Byte] = ???

    /** Returns an array of samples of a pixel, translated with the lookup
     *  table.
     */
    @stub
    def lookupPixel(src: Array[Int], dst: Array[Int]): Array[Int] = ???
}
