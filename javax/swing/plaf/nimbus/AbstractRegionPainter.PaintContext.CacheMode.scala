package javax.swing.plaf.nimbus

import java.lang.{Enum, Object, String}

// 
class protected AbstractRegionPainter.PaintContext.CacheMode private (name: String, ordinal: Int) extends Enum[AbstractRegionPainter.PaintContext.CacheMode](name, ordinal) {
}

object AbstractRegionPainter.PaintContext.CacheMode {
    // 
    final val FIXED_SIZES = new AbstractRegionPainter.PaintContext.CacheMode(FIXED_SIZES, 0)

    // 
    final val NINE_SQUARE_SCALE = new AbstractRegionPainter.PaintContext.CacheMode(NINE_SQUARE_SCALE, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): AbstractRegionPainter.PaintContext.CacheMode = ???
}
