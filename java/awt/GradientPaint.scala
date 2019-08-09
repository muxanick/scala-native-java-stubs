package java.awt

import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.awt.image.ColorModel
import java.lang.Object

// The GradientPaint class provides a way to fill
// a Shape with a linear color gradient pattern.
// If Point P1 with Color C1 and Point P2 with
// Color C2 are specified in user space, the
// Color on the P1, P2 connecting line is proportionally
// changed from C1 to C2.  Any point P not on the extended P1, P2
// connecting line has the color of the point P' that is the perpendicular
// projection of P on the extended P1, P2 connecting line.
// Points on the extended line outside of the P1, P2 segment can be colored
// in one of two ways.
// 
// 
// If the gradient is cyclic then the points on the extended P1, P2
// connecting line cycle back and forth between the colors C1 and C2.
// 
// If the gradient is acyclic then points on the P1 side of the segment
// have the constant Color C1 while points on the P2 side
// have the constant Color C2.
// 
class GradientPaint extends Object with Paint {

    @stub
    // Constructs a simple acyclic GradientPaint object.
    def this(x1: float, y1: float, color1: Color, x2: float, y2: float, color2: Color) = ???

    @stub
    // Constructs either a cyclic or acyclic GradientPaint
    // object depending on the boolean parameter.
    def this(x1: float, y1: float, color1: Color, x2: float, y2: float, color2: Color, cyclic: Boolean) = ???

    @stub
    // Constructs a simple acyclic GradientPaint object.
    def this(pt1: Point2D, color1: Color, pt2: Point2D, color2: Color) = ???

    @stub
    // Creates and returns a PaintContext used to
    // generate a linear color gradient pattern.
    def createContext(cm: ColorModel, deviceBounds: Rectangle, userBounds: Rectangle2D, xform: AffineTransform, hints: RenderingHints): PaintContext = ???

    @stub
    // Returns the color C1 anchored by the point P1.
    def getColor1(): Color = ???

    @stub
    // Returns the color C2 anchored by the point P2.
    def getColor2(): Color = ???

    @stub
    // Returns a copy of the point P1 that anchors the first color.
    def getPoint1(): Point2D = ???

    @stub
    // Returns a copy of the point P2 which anchors the second color.
    def getPoint2(): Point2D = ???

    @stub
    // Returns the transparency mode for this GradientPaint.
    def getTransparency(): Int = ???
}
