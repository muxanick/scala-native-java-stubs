package java.awt

import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.awt.image.ColorModel
import java.lang.Object

// The RadialGradientPaint class provides a way to fill a shape with
// a circular radial color gradient pattern. The user may specify 2 or more
// gradient colors, and this paint will provide an interpolation between
// each color.
// 
// The user must specify the circle controlling the gradient pattern,
// which is described by a center point and a radius.  The user can also
// specify a separate focus point within that circle, which controls the
// location of the first color of the gradient.  By default the focus is
// set to be the center of the circle.
// 
// This paint will map the first color of the gradient to the focus point,
// and the last color to the perimeter of the circle, interpolating
// smoothly for any in-between colors specified by the user.  Any line drawn
// from the focus point to the circumference will thus span all the gradient
// colors.
// 
// Specifying a focus point outside of the radius of the circle will cause
// the rings of the gradient pattern to be centered on the point just inside
// the edge of the circle in the direction of the focus point.
// The rendering will internally use this modified location as if it were
// the specified focus point.
// 
// The user must provide an array of floats specifying how to distribute the
// colors along the gradient.  These values should range from 0.0 to 1.0 and
// act like keyframes along the gradient (they mark where the gradient should
// be exactly a particular color).
// 
// In the event that the user does not set the first keyframe value equal
// to 0 and/or the last keyframe value equal to 1, keyframes will be created
// at these positions and the first and last colors will be replicated there.
// So, if a user specifies the following arrays to construct a gradient:
// 
//     {Color.BLUE, Color.RED}, {.3f, .7f}
// 
// this will be converted to a gradient with the following keyframes:
// 
//     {Color.BLUE, Color.BLUE, Color.RED, Color.RED}, {0f, .3f, .7f, 1f}
// 
//
// 
// The user may also select what action the RadialGradientPaint object
// takes when it is filling the space outside the circle's radius by
// setting CycleMethod to either REFLECTION or REPEAT.
// The gradient color proportions are equal for any particular line drawn
// from the focus point. The following figure shows that the distance AB
// is equal to the distance BC, and the distance AD is equal to the distance DE.
// 
// 
// 
// If the gradient and graphics rendering transforms are uniformly scaled and
// the user sets the focus so that it coincides with the center of the circle,
// the gradient color proportions are equal for any line drawn from the center.
// The following figure shows the distances AB, BC, AD, and DE. They are all equal.
// 
// 
// 
// Note that some minor variations in distances may occur due to sampling at
// the granularity of a pixel.
// If no cycle method is specified, NO_CYCLE will be chosen by
// default, which means the the last keyframe color will be used to fill the
// remaining area.
// 
// The colorSpace parameter allows the user to specify in which colorspace
// the interpolation should be performed, default sRGB or linearized RGB.
//
// 
// The following code demonstrates typical usage of
// RadialGradientPaint, where the center and focus points are
// the same:
// 
//     Point2D center = new Point2D.Float(50, 50);
//     float radius = 25;
//     float[] dist = {0.0f, 0.2f, 1.0f};
//     Color[] colors = {Color.RED, Color.WHITE, Color.BLUE};
//     RadialGradientPaint p =
//         new RadialGradientPaint(center, radius, dist, colors);
// 
//
// 
// This image demonstrates the example code above, with default
// (centered) focus for each of the three cycle methods:
// 
// 
// 
//
// 
// It is also possible to specify a non-centered focus point, as
// in the following code:
// 
//     Point2D center = new Point2D.Float(50, 50);
//     float radius = 25;
//     Point2D focus = new Point2D.Float(40, 40);
//     float[] dist = {0.0f, 0.2f, 1.0f};
//     Color[] colors = {Color.RED, Color.WHITE, Color.BLUE};
//     RadialGradientPaint p =
//         new RadialGradientPaint(center, radius, focus,
//                                 dist, colors,
//                                 CycleMethod.NO_CYCLE);
// 
//
// 
// This image demonstrates the previous example code, with non-centered
// focus for each of the three cycle methods:
// 
// 
// 
final class RadialGradientPaint extends MultipleGradientPaint {

    @stub
    // Constructs a RadialGradientPaint with a default
    // NO_CYCLE repeating method and SRGB color space,
    // using the center as the focus point.
    def this(cx: float, cy: float, radius: float, fractions: Array[float], colors: Array[Color]) = ???

    @stub
    // Constructs a RadialGradientPaint with a default
    // SRGB color space, using the center as the focus point.
    def this(cx: float, cy: float, radius: float, fractions: Array[float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    @stub
    // Constructs a RadialGradientPaint with a default
    // SRGB color space.
    def this(cx: float, cy: float, radius: float, fx: float, fy: float, fractions: Array[float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    @stub
    // Constructs a RadialGradientPaint with a default
    // NO_CYCLE repeating method and SRGB color space,
    // using the center as the focus point.
    def this(center: Point2D, radius: float, fractions: Array[float], colors: Array[Color]) = ???

    @stub
    // Constructs a RadialGradientPaint with a default
    // SRGB color space, using the center as the focus point.
    def this(center: Point2D, radius: float, fractions: Array[float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    @stub
    // Constructs a RadialGradientPaint with a default
    // SRGB color space.
    def this(center: Point2D, radius: float, focus: Point2D, fractions: Array[float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod) = ???

    @stub
    // Constructs a RadialGradientPaint.
    def this(center: Point2D, radius: float, focus: Point2D, fractions: Array[float], colors: Array[Color], cycleMethod: MultipleGradientPaint.CycleMethod, colorSpace: MultipleGradientPaint.ColorSpaceType, gradientTransform: AffineTransform) = ???

    @stub
    // Creates and returns a PaintContext used to
    // generate a circular radial color gradient pattern.
    def createContext(cm: ColorModel, deviceBounds: Rectangle, userBounds: Rectangle2D, transform: AffineTransform, hints: RenderingHints): PaintContext = ???

    @stub
    // Returns a copy of the center point of the radial gradient.
    def getCenterPoint(): Point2D = ???

    @stub
    // Returns a copy of the focus point of the radial gradient.
    def getFocusPoint(): Point2D = ???
}
