package java.awt

import java.awt.geom.AffineTransform
import java.lang.Object

/** This is the superclass for Paints which use a multiple color
 *  gradient to fill in their raster.  It provides storage for variables and
 *  enumerated values common to
 *  LinearGradientPaint and RadialGradientPaint.
 */
abstract class MultipleGradientPaint extends Object with Paint {

    /** Returns a copy of the array of colors used by this gradient. */
    def getColors(): Array[Color]

    /** Returns the enumerated type which specifies color space for
     *  interpolation.
     */
    def getColorSpace(): MultipleGradientPaint.ColorSpaceType

    /** Returns the enumerated type which specifies cycling behavior. */
    def getCycleMethod(): MultipleGradientPaint.CycleMethod

    /** Returns a copy of the array of floats used by this gradient
     *  to calculate color distribution.
     */
    def getFractions(): Array[Float]

    /** Returns a copy of the transform applied to the gradient. */
    def getTransform(): AffineTransform
}

object MultipleGradientPaint {
    /** The color space in which to perform the gradient interpolation. */
    @stub
    object ColorSpaceType extends MultipleGradientPaint.ColorSpaceType
}
