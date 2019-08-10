package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The color space in which to perform the gradient interpolation. */
class MultipleGradientPaint_ColorSpaceType private (name: String, ordinal: Int) extends Enum[MultipleGradientPaint.ColorSpaceType](name, ordinal) {
}

object MultipleGradientPaint_ColorSpaceType {
    /** Indicates that the color interpolation should occur in linearized
     *  RGB space.
     */
    final val LINEAR_RGB = new MultipleGradientPaint.ColorSpaceType(LINEAR_RGB, 0)

    /** Indicates that the color interpolation should occur in sRGB space. */
    final val SRGB = new MultipleGradientPaint.ColorSpaceType(SRGB, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MultipleGradientPaint.ColorSpaceType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[MultipleGradientPaint.ColorSpaceType] = ???
}
