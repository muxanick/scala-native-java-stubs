package java.awt

import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.awt.image.ColorModel
import java.lang.Object

/** The LinearGradientPaint class provides a way to fill
 *  a Shape with a linear color gradient pattern.  The user
 *  may specify two or more gradient colors, and this paint will provide an
 *  interpolation between each color.  The user also specifies start and end
 *  points which define where in user space the color gradient should begin
 *  and end.
 *  
 *  The user must provide an array of floats specifying how to distribute the
 *  colors along the gradient.  These values should range from 0.0 to 1.0 and
 *  act like keyframes along the gradient (they mark where the gradient should
 *  be exactly a particular color).
 *  
 *  In the event that the user does not set the first keyframe value equal
 *  to 0 and/or the last keyframe value equal to 1, keyframes will be created
 *  at these positions and the first and last colors will be replicated there.
 *  So, if a user specifies the following arrays to construct a gradient:
 *  
 *      {Color.BLUE, Color.RED}, {.3f, .7f}
 *  
 *  this will be converted to a gradient with the following keyframes:
 *  
 *      {Color.BLUE, Color.BLUE, Color.RED, Color.RED}, {0f, .3f, .7f, 1f}
 *  
 * 
 *  
 *  The user may also select what action the LinearGradientPaint object
 *  takes when it is filling the space outside the start and end points by
 *  setting CycleMethod to either REFLECTION or REPEAT.
 *  The distances between any two colors in any of the reflected or repeated
 *  copies of the gradient are the same as the distance between those same two
 *  colors between the start and end points.
 *  Note that some minor variations in distances may occur due to sampling at
 *  the granularity of a pixel.
 *  If no cycle method is specified, NO_CYCLE will be chosen by
 *  default, which means the endpoint colors will be used to fill the
 *  remaining area.
 *  
 *  The colorSpace parameter allows the user to specify in which colorspace
 *  the interpolation should be performed, default sRGB or linearized RGB.
 * 
 *  
 *  The following code demonstrates typical usage of
 *  LinearGradientPaint:
 *  
 *      Point2D start = new Point2D.Float(0, 0);
 *      Point2D end = new Point2D.Float(50, 50);
 *      float[] dist = {0.0f, 0.2f, 1.0f};
 *      Color[] colors = {Color.RED, Color.WHITE, Color.BLUE};
 *      LinearGradientPaint p =
 *          new LinearGradientPaint(start, end, dist, colors);
 *  
 *  
 *  This code will create a LinearGradientPaint which interpolates
 *  between red and white for the first 20% of the gradient and between white
 *  and blue for the remaining 80%.
 * 
 *  
 *  This image demonstrates the example code above for each
 *  of the three cycle methods:
 *  
 *  
 *  
 */
final class LinearGradientPaint extends MultipleGradientPaint {

    /** Constructs a LinearGradientPaint with a default
     *  NO_CYCLE repeating method and SRGB color space.
     */
    @stub
    def this(startX: Float, startY: Float, endX: Float, endY: Float, fractions: Array[Float], colors: Array[Color]) = ???

    /** Constructs a LinearGradientPaint with a default SRGB
     *  color space.
     */
    @stub
    def this(startX: Float, startY: Float, endX: Float, endY: Float, fractions: Array[Float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    /** Constructs a LinearGradientPaint with a default
     *  NO_CYCLE repeating method and SRGB color space.
     */
    @stub
    def this(start: Point2D, end: Point2D, fractions: Array[Float], colors: Array[Color]) = ???

    /** Constructs a LinearGradientPaint with a default SRGB
     *  color space.
     */
    @stub
    def this(start: Point2D, end: Point2D, fractions: Array[Float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    /** Creates and returns a PaintContext used to
     *  generate a linear color gradient pattern.
     */
    @stub
    def createContext(cm: ColorModel, deviceBounds: Rectangle, userBounds: Rectangle2D, transform: AffineTransform, hints: RenderingHints): PaintContext = ???

    /** Returns a copy of the end point of the gradient axis. */
    @stub
    def getEndPoint(): Point2D = ???
}
