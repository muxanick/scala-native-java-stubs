package javax.swing.plaf.nimbus

import java.awt.{Dimension, Insets}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class encapsulating state useful when painting. Generally, instances of this
 *  class are created once, and reused for each paint request without modification.
 *  This class contains values useful when hinting the cache engine, and when decoding
 *  control points and bezier curve anchors.
 */
object protected AbstractRegionPainter_PaintContext extends Object {

    /** Creates a new PaintContext which does not attempt to cache or scale any cached
     *  images.
     */
    @stub
    def PaintContext(insets: Insets, canvasSize: Dimension, inverted: Boolean) = ???

    /** Creates a new PaintContext. */
    @stub
    def PaintContext(insets: Insets, canvasSize: Dimension, inverted: Boolean, cacheMode: AbstractRegionPainter.PaintContext.CacheMode, maxH: Double, maxV: Double) = ???

    /**  */
    protected type CacheMode = AbstractRegionPainter_PaintContext_CacheMode
}
