package java.awt

import java.lang.{Enum, Object, String}

// The color space in which to perform the gradient interpolation.
class MultipleGradientPaint.ColorSpaceType private (name: String, ordinal: Int) extends Enum[MultipleGradientPaint.ColorSpaceType](name, ordinal) {
}

object MultipleGradientPaint.ColorSpaceType {
    // Indicates that the color interpolation should occur in linearized
    // RGB space.
    final val LINEAR_RGB = new MultipleGradientPaint.ColorSpaceType(LINEAR_RGB, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): MultipleGradientPaint.ColorSpaceType = ???
}
