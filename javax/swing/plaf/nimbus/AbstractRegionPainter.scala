package javax.swing.plaf.nimbus

import java.awt.{Color, Dimension, Graphics2D, Insets, LinearGradientPaint, RadialGradientPaint}
import java.lang.{Enum, Object, String}
import javax.swing.{JComponent, Painter}
import scala.scalanative.annotation.stub

/** Convenient base class for defining Painter instances for rendering a
 *  region or component in Nimbus.
 */
abstract class AbstractRegionPainter extends Object with Painter[JComponent] {

    /** Create a new AbstractRegionPainter */
    @stub
    protected def this() = ???

    /** Configures the given Graphics2D. */
    protected def configureGraphics(g: Graphics2D): Unit

    /** Decodes and returns a float value representing the actual pixel location for
     *  the anchor point given the encoded X value of the control point, and the offset
     *  distance to the anchor from that control point.
     */
    protected def decodeAnchorX(x: Float, dx: Float): Float

    /** Decodes and returns a float value representing the actual pixel location for
     *  the anchor point given the encoded Y value of the control point, and the offset
     *  distance to the anchor from that control point.
     */
    protected def decodeAnchorY(y: Float, dy: Float): Float

    /** Decodes and returns a color, which is derived from a offset between two
     *  other colors.
     */
    protected def decodeColor(color1: Color, color2: Color, midPoint: Float): Color

    /** Decodes and returns a color, which is derived from a base color in UI
     *  defaults.
     */
    protected def decodeColor(key: String, hOffset: Float, sOffset: Float, bOffset: Float, aOffset: Int): Color

    /** Given parameters for creating a LinearGradientPaint, this method will
     *  create and return a linear gradient paint.
     */
    protected def decodeGradient(x1: Float, y1: Float, x2: Float, y2: Float, midpoints: Array[Float], colors: Array[Color]): LinearGradientPaint

    /** Given parameters for creating a RadialGradientPaint, this method will
     *  create and return a radial gradient paint.
     */
    protected def decodeRadialGradient(x: Float, y: Float, r: Float, midpoints: Array[Float], colors: Array[Color]): RadialGradientPaint

    /** Decodes and returns a float value representing the actual pixel location for
     *  the given encoded X value.
     */
    protected def decodeX(x: Float): Float

    /** Decodes and returns a float value representing the actual pixel location for
     *  the given encoded y value.
     */
    protected def decodeY(y: Float): Float

    /** Actually performs the painting operation. */
    protected def doPaint(g: Graphics2D, c: JComponent, width: Int, height: Int, extendedCacheKeys: Array[Object]): Unit

    /** Get a color property from the given JComponent. */
    protected def getComponentColor(c: JComponent, property: String, defaultColor: Color, saturationOffset: Float, brightnessOffset: Float, alphaOffset: Int): Color

    /** Get any extra attributes which the painter implementation would like
     *  to include in the image cache lookups.
     */
    protected def getExtendedCacheKeys(c: JComponent): Array[Object]

    /** Gets the PaintContext for this painting operation. */
    protected def getPaintContext(): AbstractRegionPainter.PaintContext

    /** Renders to the given Graphics2D object. */
    def paint(g: Graphics2D, c: JComponent, w: Int, h: Int): Unit
}

object AbstractRegionPainter {
    /** A class encapsulating state useful when painting. Generally, instances of this
     *  class are created once, and reused for each paint request without modification.
     *  This class contains values useful when hinting the cache engine, and when decoding
     *  control points and bezier curve anchors.
     */
    protected object PaintContext extends Object {

        /** Creates a new PaintContext which does not attempt to cache or scale any cached
         *  images.
         */
        @stub
        def apply(insets: Insets, canvasSize: Dimension, inverted: Boolean) = ???

        /** Creates a new PaintContext. */
        @stub
        def apply(insets: Insets, canvasSize: Dimension, inverted: Boolean, cacheMode: AbstractRegionPainter.PaintContext.CacheMode, maxH: Double, maxV: Double) = ???

        /**  */
        protected class CacheMode private (name: String, ordinal: Int) extends Enum[CacheMode](name, ordinal) {
        }

        protected object CacheMode {
            /**  */
            final val FIXED_SIZES: CacheMode = new CacheMode("FIXED_SIZES", 0)

            /**  */
            final val NINE_SQUARE_SCALE: CacheMode = new CacheMode("NINE_SQUARE_SCALE", 1)

            /**  */
            final val NO_CACHING: CacheMode = new CacheMode("NO_CACHING", 2)

            /** Returns the enum constant of this type with the specified name. */
            @stub
            def valueOf(name: String): CacheMode = ???

            /** Returns an array containing the constants of this enum type, in
             * the order they are declared.
             */
            @stub
            def values(): Array[CacheMode] = ???
        }

    }

}
