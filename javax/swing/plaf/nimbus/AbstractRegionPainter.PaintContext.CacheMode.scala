package javax.swing.plaf.nimbus

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/**  */
class protected AbstractRegionPainter_PaintContext_CacheMode private (name: String, ordinal: Int) extends Enum[AbstractRegionPainter.PaintContext.CacheMode](name, ordinal) {
}

object AbstractRegionPainter_PaintContext_CacheMode {
    /**  */
    final val FIXED_SIZES = new AbstractRegionPainter.PaintContext.CacheMode(FIXED_SIZES, 0)

    /**  */
    final val NINE_SQUARE_SCALE = new AbstractRegionPainter.PaintContext.CacheMode(NINE_SQUARE_SCALE, 1)

    /**  */
    final val NO_CACHING = new AbstractRegionPainter.PaintContext.CacheMode(NO_CACHING, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): AbstractRegionPainter.PaintContext.CacheMode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[AbstractRegionPainter.PaintContext.CacheMode] = ???
}
