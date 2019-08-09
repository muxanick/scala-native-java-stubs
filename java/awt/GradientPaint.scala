package java.awt

import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.awt.image.ColorModel
import java.lang.Object

/** The GradientPaint class provides a way to fill
 *  a Shape with a linear color gradient pattern.
 *  If Point P1 with Color C1 and Point P2 with
 *  Color C2 are specified in user space, the
 *  Color on the P1, P2 connecting line is proportionally
 *  changed from C1 to C2.  Any point P not on the extended P1, P2
 *  connecting line has the color of the point P' that is the perpendicular
 *  projection of P on the extended P1, P2 connecting line.
 *  Points on the extended line outside of the P1, P2 segment can be colored
 *  in one of two ways.
 *  
 *  
 *  If the gradient is cyclic then the points on the extended P1, P2
 *  connecting line cycle back and forth between the colors C1 and C2.
 *  
 *  If the gradient is acyclic then points on the P1 side of the segment
 *  have the constant Color C1 while points on the P2 side
 *  have the constant Color C2.
 *  
 */
class GradientPaint extends Object with Paint {

    /** Constructs a simple acyclic GradientPaint object. */
    @stub
    def this(x1: Float, y1: Float, color1: Color, x2: Float, y2: Float, color2: Color) = ???

    /** Constructs either a cyclic or acyclic GradientPaint
     *  object depending on the boolean parameter.
     */
    @stub
    def this(x1: Float, y1: Float, color1: Color, x2: Float, y2: Float, color2: Color, cyclic: Boolean) = ???

    /** Constructs a simple acyclic GradientPaint object. */
    @stub
    def this(pt1: Point2D, color1: Color, pt2: Point2D, color2: Color) = ???

    /** Creates and returns a PaintContext used to
     *  generate a linear color gradient pattern.
     */
    @stub
    def createContext(cm: ColorModel, deviceBounds: Rectangle, userBounds: Rectangle2D, xform: AffineTransform, hints: RenderingHints): PaintContext = ???

    /** Returns the color C1 anchored by the point P1. */
    @stub
    def getColor1(): Color = ???

    /** Returns the color C2 anchored by the point P2. */
    @stub
    def getColor2(): Color = ???

    /** Returns a copy of the point P1 that anchors the first color. */
    @stub
    def getPoint1(): Point2D = ???

    /** Returns a copy of the point P2 which anchors the second color. */
    @stub
    def getPoint2(): Point2D = ???

    /** Returns the transparency mode for this GradientPaint. */
    @stub
    def getTransparency(): Int = ???
}
