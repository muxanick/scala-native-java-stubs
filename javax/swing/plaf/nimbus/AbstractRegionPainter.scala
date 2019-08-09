package javax.swing.plaf.nimbus

import java.awt.{Color, Graphics2D, LinearGradientPaint, RadialGradientPaint}
import java.lang.{Object, String}
import javax.swing.{JComponent, Painter}

// Convenient base class for defining Painter instances for rendering a
// region or component in Nimbus.
abstract class AbstractRegionPainter extends Object with Painter[JComponent] {

    // Configures the given Graphics2D.
    protected def configureGraphics(g: Graphics2D): Unit

    // Decodes and returns a float value representing the actual pixel location for
    // the anchor point given the encoded X value of the control point, and the offset
    // distance to the anchor from that control point.
    protected def decodeAnchorX(x: float, dx: float): float

    // Decodes and returns a float value representing the actual pixel location for
    // the anchor point given the encoded Y value of the control point, and the offset
    // distance to the anchor from that control point.
    protected def decodeAnchorY(y: float, dy: float): float

    // Decodes and returns a color, which is derived from a offset between two
    // other colors.
    protected def decodeColor(color1: Color, color2: Color, midPoint: float): Color

    // Decodes and returns a color, which is derived from a base color in UI
    // defaults.
    protected def decodeColor(key: String, hOffset: float, sOffset: float, bOffset: float, aOffset: Int): Color

    // Given parameters for creating a LinearGradientPaint, this method will
    // create and return a linear gradient paint.
    protected def decodeGradient(x1: float, y1: float, x2: float, y2: float, midpoints: Array[float], colors: Array[Color]): LinearGradientPaint

    // Given parameters for creating a RadialGradientPaint, this method will
    // create and return a radial gradient paint.
    protected def decodeRadialGradient(x: float, y: float, r: float, midpoints: Array[float], colors: Array[Color]): RadialGradientPaint

    // Decodes and returns a float value representing the actual pixel location for
    // the given encoded X value.
    protected def decodeX(x: float): float

    // Decodes and returns a float value representing the actual pixel location for
    // the given encoded y value.
    protected def decodeY(y: float): float

    // Actually performs the painting operation.
    protected def doPaint(g: Graphics2D, c: JComponent, width: Int, height: Int, extendedCacheKeys: Array[Object]): Unit

    // Get a color property from the given JComponent.
    protected def getComponentColor(c: JComponent, property: String, defaultColor: Color, saturationOffset: float, brightnessOffset: float, alphaOffset: Int): Color

    // Get any extra attributes which the painter implementation would like
    // to include in the image cache lookups.
    protected def getExtendedCacheKeys(c: JComponent): Array[Object]

    // Gets the PaintContext for this painting operation.
    protected def getPaintContext(): AbstractRegionPainter.PaintContext
}
