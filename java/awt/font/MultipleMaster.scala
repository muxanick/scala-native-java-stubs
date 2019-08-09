package java.awt.font

import java.awt.Font
import java.lang.String

/** The MultipleMaster interface represents Type 1
 *  Multiple Master fonts.
 *  A particular Font object can implement this interface.
 */
trait MultipleMaster {

    /** Creates a new instance of a multiple master font based on the design
     *  axis values contained in the specified array.
     */
    @stub
    def deriveMMFont(axes: Array[Float]): Font = ???

    /** Creates a new instance of a multiple master font based on detailed metric
     *  information.
     */
    @stub
    def deriveMMFont(glyphWidths: Array[Float], avgStemWidth: Float, typicalCapHeight: Float, typicalXHeight: Float, italicAngle: Float): Font = ???

    /** Returns an array of default design values for each axis. */
    @stub
    def getDesignAxisDefaults(): Array[Float] = ???

    /** Returns the name for each design axis. */
    @stub
    def getDesignAxisNames(): Array[String] = ???

    /** Returns an array of design limits interleaved in the form [from→to]
     *  for each axis.
     */
    @stub
    def getDesignAxisRanges(): Array[Float] = ???
}
