package java.awt.image

import java.lang.Object

/** This abstract class defines a lookup table object.  ByteLookupTable
 *  and ShortLookupTable are subclasses, which
 *  contain byte and short data, respectively.  A lookup table
 *  contains data arrays for one or more bands (or components) of an image
 *  (for example, separate arrays for R, G, and B),
 *  and it contains an offset which will be subtracted from the
 *  input values before indexing into the arrays.  This allows an array
 *  smaller than the native data size to be provided for a
 *  constrained input.  If there is only one array in the lookup
 *  table, it will be applied to all bands.  All arrays must be the
 *  same size.
 */
abstract class LookupTable extends Object {

    /** Returns the number of components in the lookup table. */
    def getNumComponents(): Int

    /** Returns the offset. */
    def getOffset(): Int
}
