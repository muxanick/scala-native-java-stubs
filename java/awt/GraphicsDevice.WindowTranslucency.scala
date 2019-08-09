package java.awt

import java.lang.{Enum, Object, String}

/** Kinds of translucency supported by the underlying system. */
class GraphicsDevice.WindowTranslucency private (name: String, ordinal: Int) extends Enum[GraphicsDevice.WindowTranslucency](name, ordinal) {
}

object GraphicsDevice.WindowTranslucency {
    /** Represents support in the underlying system for windows that
     *  contain or might contain pixels with arbitrary alpha values
     *  between and including 0.0 and 1.0.
     */
    final val PERPIXEL_TRANSLUCENT = new GraphicsDevice.WindowTranslucency(PERPIXEL_TRANSLUCENT, 0)

    /** Represents support in the underlying system for windows each pixel
     *  of which is guaranteed to be either completely opaque, with
     *  an alpha value of 1.0, or completely transparent, with an alpha
     *  value of 0.0.
     */
    final val PERPIXEL_TRANSPARENT = new GraphicsDevice.WindowTranslucency(PERPIXEL_TRANSPARENT, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): GraphicsDevice.WindowTranslucency = ???
}
