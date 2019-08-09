package java.awt

import java.awt.image.ImageObserver
import java.lang.{Object, String}
import java.text.AttributedCharacterIterator

// The Graphics class is the abstract base class for
// all graphics contexts that allow an application to draw onto
// components that are realized on various devices, as well as
// onto off-screen images.
// 
// A Graphics object encapsulates state information needed
// for the basic rendering operations that Java supports.  This
// state information includes the following properties:
//
// 
// The Component object on which to draw.
// A translation origin for rendering and clipping coordinates.
// The current clip.
// The current color.
// The current font.
// The current logical pixel operation function (XOR or Paint).
// The current XOR alternation color
//     (see setXORMode(java.awt.Color)).
// 
// 
// Coordinates are infinitely thin and lie between the pixels of the
// output device.
// Operations that draw the outline of a figure operate by traversing
// an infinitely thin path between pixels with a pixel-sized pen that hangs
// down and to the right of the anchor point on the path.
// Operations that fill a figure operate by filling the interior
// of that infinitely thin path.
// Operations that render horizontal text render the ascending
// portion of character glyphs entirely above the baseline coordinate.
// 
// The graphics pen hangs down and to the right from the path it traverses.
// This has the following implications:
// 
// If you draw a figure that covers a given rectangle, that
// figure occupies one extra row of pixels on the right and bottom edges
// as compared to filling a figure that is bounded by that same rectangle.
// If you draw a horizontal line along the same y coordinate as
// the baseline of a line of text, that line is drawn entirely below
// the text, except for any descenders.
// 
// All coordinates that appear as arguments to the methods of this
// Graphics object are considered relative to the
// translation origin of this Graphics object prior to
// the invocation of the method.
// 
// All rendering operations modify only pixels which lie within the
// area bounded by the current clip, which is specified by a Shape
// in user space and is controlled by the program using the
// Graphics object.  This user clip
// is transformed into device space and combined with the
// device clip, which is defined by the visibility of windows and
// device extents.  The combination of the user clip and device clip
// defines the composite clip, which determines the final clipping
// region.  The user clip cannot be modified by the rendering
// system to reflect the resulting composite clip. The user clip can only
// be changed through the setClip or clipRect
// methods.
// All drawing or writing is done in the current color,
// using the current paint mode, and in the current font.
abstract class Graphics extends Object {

    // Clears the specified rectangle by filling it with the background
    // color of the current drawing surface.
    def clearRect(x: Int, y: Int, width: Int, height: Int): Unit

    // Intersects the current clip with the specified rectangle.
    def clipRect(x: Int, y: Int, width: Int, height: Int): Unit

    // Copies an area of the component by a distance specified by
    // dx and dy.
    def copyArea(x: Int, y: Int, width: Int, height: Int, dx: Int, dy: Int): Unit

    // Creates a new Graphics object that is
    // a copy of this Graphics object.
    def create(): Graphics

    // Creates a new Graphics object based on this
    // Graphics object, but with a new translation and clip area.
    def create(x: Int, y: Int, width: Int, height: Int): Graphics

    // Disposes of this graphics context and releases
    // any system resources that it is using.
    def dispose(): Unit

    // Draws a 3-D highlighted outline of the specified rectangle.
    def draw3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit

    // Draws the outline of a circular or elliptical arc
    // covering the specified rectangle.
    def drawArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit

    // Draws the text given by the specified byte array, using this
    // graphics context's current font and color.
    def drawBytes(data: Array[Byte], offset: Int, length: Int, x: Int, y: Int): Unit

    // Draws the text given by the specified character array, using this
    // graphics context's current font and color.
    def drawChars(data: Array[Char], offset: Int, length: Int, x: Int, y: Int): Unit

    // Draws as much of the specified image as is currently available.
    def drawImage(img: Image, x: Int, y: Int, bgcolor: Color, observer: ImageObserver): Boolean

    // Draws as much of the specified image as is currently available.
    def drawImage(img: Image, x: Int, y: Int, observer: ImageObserver): Boolean

    // Draws as much of the specified image as has already been scaled
    // to fit inside the specified rectangle.
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, bgcolor: Color, observer: ImageObserver): Boolean

    // Draws as much of the specified image as has already been scaled
    // to fit inside the specified rectangle.
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, observer: ImageObserver): Boolean

    // Draws as much of the specified area of the specified image as is
    // currently available, scaling it on the fly to fit inside the
    // specified area of the destination drawable surface.
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, bgcolor: Color, observer: ImageObserver): Boolean

    // Draws as much of the specified area of the specified image as is
    // currently available, scaling it on the fly to fit inside the
    // specified area of the destination drawable surface.
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, observer: ImageObserver): Boolean

    // Draws a line, using the current color, between the points
    // (x1, y1) and (x2, y2)
    // in this graphics context's coordinate system.
    def drawLine(x1: Int, y1: Int, x2: Int, y2: Int): Unit

    // Draws the outline of an oval.
    def drawOval(x: Int, y: Int, width: Int, height: Int): Unit

    // Draws a closed polygon defined by
    // arrays of x and y coordinates.
    def drawPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit

    // Draws the outline of a polygon defined by the specified
    // Polygon object.
    def drawPolygon(p: Polygon): Unit

    // Draws a sequence of connected lines defined by
    // arrays of x and y coordinates.
    def drawPolyline(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit

    // Draws the outline of the specified rectangle.
    def drawRect(x: Int, y: Int, width: Int, height: Int): Unit

    // Draws an outlined round-cornered rectangle using this graphics
    // context's current color.
    def drawRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit

    // Renders the text of the specified iterator applying its attributes
    // in accordance with the specification of the
    // TextAttribute class.
    def drawString(iterator: AttributedCharacterIterator, x: Int, y: Int): Unit

    // Draws the text given by the specified string, using this
    // graphics context's current font and color.
    def drawString(str: String, x: Int, y: Int): Unit

    // Paints a 3-D highlighted rectangle filled with the current color.
    def fill3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit

    // Fills a circular or elliptical arc covering the specified rectangle.
    def fillArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit

    // Fills an oval bounded by the specified rectangle with the
    // current color.
    def fillOval(x: Int, y: Int, width: Int, height: Int): Unit

    // Fills a closed polygon defined by
    // arrays of x and y coordinates.
    def fillPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit

    // Fills the polygon defined by the specified Polygon object with
    // the graphics context's current color.
    def fillPolygon(p: Polygon): Unit

    // Fills the specified rectangle.
    def fillRect(x: Int, y: Int, width: Int, height: Int): Unit

    // Fills the specified rounded corner rectangle with the current color.
    def fillRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit

    // Disposes of this graphics context once it is no longer referenced.
    def finalize(): Unit

    // Gets the current clipping area.
    def getClip(): Shape

    // Returns the bounding rectangle of the current clipping area.
    def getClipBounds(): Rectangle

    // Returns the bounding rectangle of the current clipping area.
    def getClipBounds(r: Rectangle): Rectangle

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getClipBounds().
    //
    def getClipRect(): Rectangle

    // Gets this graphics context's current color.
    def getColor(): Color

    // Gets the current font.
    def getFont(): Font

    // Gets the font metrics of the current font.
    def getFontMetrics(): FontMetrics

    // Gets the font metrics for the specified font.
    def getFontMetrics(f: Font): FontMetrics

    // Returns true if the specified rectangular area might intersect
    // the current clipping area.
    def hitClip(x: Int, y: Int, width: Int, height: Int): Boolean

    // Sets the current clip to the rectangle specified by the given
    // coordinates.
    def setClip(x: Int, y: Int, width: Int, height: Int): Unit

    // Sets the current clipping area to an arbitrary clip shape.
    def setClip(clip: Shape): Unit

    // Sets this graphics context's current color to the specified
    // color.
    def setColor(c: Color): Unit

    // Sets this graphics context's font to the specified font.
    def setFont(font: Font): Unit

    // Sets the paint mode of this graphics context to overwrite the
    // destination with this graphics context's current color.
    def setPaintMode(): Unit

    // Sets the paint mode of this graphics context to alternate between
    // this graphics context's current color and the new specified color.
    def setXORMode(c1: Color): Unit

    // Returns a String object representing this
    //                        Graphics object's value.
    def toString(): String
}
