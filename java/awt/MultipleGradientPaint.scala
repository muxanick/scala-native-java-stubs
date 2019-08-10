package java.awt

import java.awt.geom.AffineTransform
import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

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

    /** Returns the transparency mode for this Paint object. */
    def getTransparency(): Int
}

object MultipleGradientPaint {
    /** The color space in which to perform the gradient interpolation. */
    class ColorSpaceType private (name: String, ordinal: Int) extends Enum[ColorSpaceType](name, ordinal) {
    }

    object ColorSpaceType {
        /** Indicates that the color interpolation should occur in linearized
         *  RGB space.
         */
        final val LINEAR_RGB: ColorSpaceType = new ColorSpaceType("LINEAR_RGB", 0)

        /** Indicates that the color interpolation should occur in sRGB space. */
        final val SRGB: ColorSpaceType = new ColorSpaceType("SRGB", 1)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): ColorSpaceType = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[ColorSpaceType] = ???
    }


    /** The method to use when painting outside the gradient bounds. */
    class CycleMethod private (name: String, ordinal: Int) extends Enum[CycleMethod](name, ordinal) {
    }

    object CycleMethod {
        /** Use the terminal colors to fill the remaining area. */
        final val NO_CYCLE: CycleMethod = new CycleMethod("NO_CYCLE", 0)

        /** Cycle the gradient colors start-to-end, end-to-start
         *  to fill the remaining area.
         */
        final val REFLECT: CycleMethod = new CycleMethod("REFLECT", 1)

        /** Cycle the gradient colors start-to-end, start-to-end
         *  to fill the remaining area.
         */
        final val REPEAT: CycleMethod = new CycleMethod("REPEAT", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): CycleMethod = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[CycleMethod] = ???
    }

}
