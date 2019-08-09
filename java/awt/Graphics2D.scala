package java.awt

import java.awt.font.{FontRenderContext, GlyphVector}
import java.awt.geom.AffineTransform
import java.awt.image.{BufferedImage, BufferedImageOp, ImageObserver, RenderedImage}
import java.awt.image.renderable.RenderableImage
import java.lang.{Object, String}
import java.text.AttributedCharacterIterator
import java.util.Map
import scala.scalanative.annotation.stub

/** This Graphics2D class extends the
 *  Graphics class to provide more sophisticated
 *  control over geometry, coordinate transformations, color management,
 *  and text layout.  This is the fundamental class for rendering
 *  2-dimensional shapes, text and images on the  Java(tm) platform.
 *  
 *  Coordinate Spaces
 *  All coordinates passed to a Graphics2D object are specified
 *  in a device-independent coordinate system called User Space, which is
 *  used by applications.  The Graphics2D object contains
 *  an AffineTransform object as part of its rendering state
 *  that defines how to convert coordinates from user space to
 *  device-dependent coordinates in Device Space.
 *  
 *  Coordinates in device space usually refer to individual device pixels
 *  and are aligned on the infinitely thin gaps between these pixels.
 *  Some Graphics2D objects can be used to capture rendering
 *  operations for storage into a graphics metafile for playback on a
 *  concrete device of unknown physical resolution at a later time.  Since
 *  the resolution might not be known when the rendering operations are
 *  captured, the Graphics2D Transform is set up
 *  to transform user coordinates to a virtual device space that
 *  approximates the expected resolution of the target device. Further
 *  transformations might need to be applied at playback time if the
 *  estimate is incorrect.
 *  
 *  Some of the operations performed by the rendering attribute objects
 *  occur in the device space, but all Graphics2D methods take
 *  user space coordinates.
 *  
 *  Every Graphics2D object is associated with a target that
 *  defines where rendering takes place. A
 *  GraphicsConfiguration object defines the characteristics
 *  of the rendering target, such as pixel format and resolution.
 *  The same rendering target is used throughout the life of a
 *  Graphics2D object.
 *  
 *  When creating a Graphics2D object,  the
 *  GraphicsConfiguration
 *  specifies the default transform for
 *  the target of the Graphics2D (a
 *  Component or Image).  This default transform maps the
 *  user space coordinate system to screen and printer device coordinates
 *  such that the origin maps to the upper left hand corner of the
 *  target region of the device with increasing X coordinates extending
 *  to the right and increasing Y coordinates extending downward.
 *  The scaling of the default transform is set to identity for those devices
 *  that are close to 72 dpi, such as screen devices.
 *  The scaling of the default transform is set to approximately 72 user
 *  space coordinates per square inch for high resolution devices, such as
 *  printers.  For image buffers, the default transform is the
 *  Identity transform.
 * 
 *  Rendering Process
 *  The Rendering Process can be broken down into four phases that are
 *  controlled by the Graphics2D rendering attributes.
 *  The renderer can optimize many of these steps, either by caching the
 *  results for future calls, by collapsing multiple virtual steps into
 *  a single operation, or by recognizing various attributes as common
 *  simple cases that can be eliminated by modifying other parts of the
 *  operation.
 *  
 *  The steps in the rendering process are:
 *  
 *  
 *  Determine what to render.
 *  
 *  Constrain the rendering operation to the current Clip.
 *  The Clip is specified by a Shape in user
 *  space and is controlled by the program using the various clip
 *  manipulation methods of Graphics and
 *  Graphics2D.  This user clip
 *  is transformed into device space by the current
 *  Transform and combined with the
 *  device clip, which is defined by the visibility of windows and
 *  device extents.  The combination of the user clip and device clip
 *  defines the composite clip, which determines the final clipping
 *  region.  The user clip is not modified by the rendering
 *  system to reflect the resulting composite clip.
 *  
 *  Determine what colors to render.
 *  
 *  Apply the colors to the destination drawing surface using the current
 *  Composite attribute in the Graphics2D context.
 *  
 *  
 *  The three types of rendering operations, along with details of each
 *  of their particular rendering processes are:
 *  
 *  
 *  Shape operations
 *  
 *  
 *  If the operation is a draw(Shape) operation, then
 *  the  createStrokedShape
 *  method on the current Stroke attribute in the
 *  Graphics2D context is used to construct a new
 *  Shape object that contains the outline of the specified
 *  Shape.
 *  
 *  The Shape is transformed from user space to device space
 *  using the current Transform
 *  in the Graphics2D context.
 *  
 *  The outline of the Shape is extracted using the
 *  getPathIterator method of
 *  Shape, which returns a
 *  PathIterator
 *  object that iterates along the boundary of the Shape.
 *  
 *  If the Graphics2D object cannot handle the curved segments
 *  that the PathIterator object returns then it can call the
 *  alternate
 *  getPathIterator
 *  method of Shape, which flattens the Shape.
 *  
 *  The current Paint in the Graphics2D context
 *  is queried for a PaintContext, which specifies the
 *  colors to render in device space.
 *  
 *  
 *  Text operations
 *  
 *  
 *  The following steps are used to determine the set of glyphs required
 *  to render the indicated String:
 *  
 *  
 *  If the argument is a String, then the current
 *  Font in the Graphics2D context is asked to
 *  convert the Unicode characters in the String into a set of
 *  glyphs for presentation with whatever basic layout and shaping
 *  algorithms the font implements.
 *  
 *  If the argument is an
 *  AttributedCharacterIterator,
 *  the iterator is asked to convert itself to a
 *  TextLayout
 *  using its embedded font attributes. The TextLayout
 *  implements more sophisticated glyph layout algorithms that
 *  perform Unicode bi-directional layout adjustments automatically
 *  for multiple fonts of differing writing directions.
 *  
 *  If the argument is a
 *  GlyphVector, then the
 *  GlyphVector object already contains the appropriate
 *  font-specific glyph codes with explicit coordinates for the position of
 *  each glyph.
 *  
 *  
 *  The current Font is queried to obtain outlines for the
 *  indicated glyphs.  These outlines are treated as shapes in user space
 *  relative to the position of each glyph that was determined in step 1.
 *  
 *  The character outlines are filled as indicated above
 *  under Shape operations.
 *  
 *  The current Paint is queried for a
 *  PaintContext, which specifies
 *  the colors to render in device space.
 *  
 *  
 *  Image Operations
 *  
 *  
 *  The region of interest is defined by the bounding box of the source
 *  Image.
 *  This bounding box is specified in Image Space, which is the
 *  Image object's local coordinate system.
 *  
 *  If an AffineTransform is passed to
 *  drawImage(Image, AffineTransform, ImageObserver),
 *  the AffineTransform is used to transform the bounding
 *  box from image space to user space. If no AffineTransform
 *  is supplied, the bounding box is treated as if it is already in user space.
 *  
 *  The bounding box of the source Image is transformed from user
 *  space into device space using the current Transform.
 *  Note that the result of transforming the bounding box does not
 *  necessarily result in a rectangular region in device space.
 *  
 *  The Image object determines what colors to render,
 *  sampled according to the source to destination
 *  coordinate mapping specified by the current Transform and the
 *  optional image transform.
 *  
 *  
 * 
 *  Default Rendering Attributes
 *  The default values for the Graphics2D rendering attributes are:
 *  
 *  Paint
 *  The color of the Component.
 *  Font
 *  The Font of the Component.
 *  Stroke
 *  A square pen with a linewidth of 1, no dashing, miter segment joins
 *  and square end caps.
 *  Transform
 *  The
 *  getDefaultTransform
 *  for the GraphicsConfiguration of the Component.
 *  Composite
 *  The AlphaComposite.SRC_OVER rule.
 *  Clip
 *  No rendering Clip, the output is clipped to the
 *  Component.
 *  
 * 
 *  Rendering Compatibility Issues
 *  The JDK(tm) 1.1 rendering model is based on a pixelization model
 *  that specifies that coordinates
 *  are infinitely thin, lying between the pixels.  Drawing operations are
 *  performed using a one-pixel wide pen that fills the
 *  pixel below and to the right of the anchor point on the path.
 *  The JDK 1.1 rendering model is consistent with the
 *  capabilities of most of the existing class of platform
 *  renderers that need  to resolve integer coordinates to a
 *  discrete pen that must fall completely on a specified number of pixels.
 *  
 *  The Java 2D(tm) (Java(tm) 2 platform) API supports antialiasing renderers.
 *  A pen with a width of one pixel does not need to fall
 *  completely on pixel N as opposed to pixel N+1.  The pen can fall
 *  partially on both pixels. It is not necessary to choose a bias
 *  direction for a wide pen since the blending that occurs along the
 *  pen traversal edges makes the sub-pixel position of the pen
 *  visible to the user.  On the other hand, when antialiasing is
 *  turned off by setting the
 *  KEY_ANTIALIASING hint key
 *  to the
 *  VALUE_ANTIALIAS_OFF
 *  hint value, the renderer might need
 *  to apply a bias to determine which pixel to modify when the pen
 *  is straddling a pixel boundary, such as when it is drawn
 *  along an integer coordinate in device space.  While the capabilities
 *  of an antialiasing renderer make it no longer necessary for the
 *  rendering model to specify a bias for the pen, it is desirable for the
 *  antialiasing and non-antialiasing renderers to perform similarly for
 *  the common cases of drawing one-pixel wide horizontal and vertical
 *  lines on the screen.  To ensure that turning on antialiasing by
 *  setting the
 *  KEY_ANTIALIASING hint
 *  key to
 *  VALUE_ANTIALIAS_ON
 *  does not cause such lines to suddenly become twice as wide and half
 *  as opaque, it is desirable to have the model specify a path for such
 *  lines so that they completely cover a particular set of pixels to help
 *  increase their crispness.
 *  
 *  Java 2D API maintains compatibility with JDK 1.1 rendering
 *  behavior, such that legacy operations and existing renderer
 *  behavior is unchanged under Java 2D API.  Legacy
 *  methods that map onto general draw and
 *  fill methods are defined, which clearly indicates
 *  how Graphics2D extends Graphics based
 *  on settings of Stroke and Transform
 *  attributes and rendering hints.  The definition
 *  performs identically under default attribute settings.
 *  For example, the default Stroke is a
 *  BasicStroke with a width of 1 and no dashing and the
 *  default Transform for screen drawing is an Identity transform.
 *  
 *  The following two rules provide predictable rendering behavior whether
 *  aliasing or antialiasing is being used.
 *  
 *   Device coordinates are defined to be between device pixels which
 *  avoids any inconsistent results between aliased and antialiased
 *  rendering.  If coordinates were defined to be at a pixel's center, some
 *  of the pixels covered by a shape, such as a rectangle, would only be
 *  half covered.
 *  With aliased rendering, the half covered pixels would either be
 *  rendered inside the shape or outside the shape.  With anti-aliased
 *  rendering, the pixels on the entire edge of the shape would be half
 *  covered.  On the other hand, since coordinates are defined to be
 *  between pixels, a shape like a rectangle would have no half covered
 *  pixels, whether or not it is rendered using antialiasing.
 *   Lines and paths stroked using the BasicStroke
 *  object may be "normalized" to provide consistent rendering of the
 *  outlines when positioned at various points on the drawable and
 *  whether drawn with aliased or antialiased rendering.  This
 *  normalization process is controlled by the
 *  KEY_STROKE_CONTROL hint.
 *  The exact normalization algorithm is not specified, but the goals
 *  of this normalization are to ensure that lines are rendered with
 *  consistent visual appearance regardless of how they fall on the
 *  pixel grid and to promote more solid horizontal and vertical
 *  lines in antialiased mode so that they resemble their non-antialiased
 *  counterparts more closely.  A typical normalization step might
 *  promote antialiased line endpoints to pixel centers to reduce the
 *  amount of blending or adjust the subpixel positioning of
 *  non-antialiased lines so that the floating point line widths
 *  round to even or odd pixel counts with equal likelihood.  This
 *  process can move endpoints by up to half a pixel (usually towards
 *  positive infinity along both axes) to promote these consistent
 *  results.
 *  
 *  
 *  The following definitions of general legacy methods
 *  perform identically to previously specified behavior under default
 *  attribute settings:
 *  
 *  
 *  For fill operations, including fillRect,
 *  fillRoundRect, fillOval,
 *  fillArc, fillPolygon, and
 *  clearRect, fill can now be called
 *  with the desired Shape.  For example, when filling a
 *  rectangle:
 *  
 *  fill(new Rectangle(x, y, w, h));
 *  
 *  is called.
 *  
 *  
 *  Similarly, for draw operations, including drawLine,
 *  drawRect, drawRoundRect,
 *  drawOval, drawArc, drawPolyline,
 *  and drawPolygon, draw can now be
 *  called with the desired Shape.  For example, when drawing a
 *  rectangle:
 *  
 *  draw(new Rectangle(x, y, w, h));
 *  
 *  is called.
 *  
 *  
 *  The draw3DRect and fill3DRect methods were
 *  implemented in terms of the drawLine and
 *  fillRect methods in the Graphics class which
 *  would predicate their behavior upon the current Stroke
 *  and Paint objects in a Graphics2D context.
 *  This class overrides those implementations with versions that use
 *  the current Color exclusively, overriding the current
 *  Paint and which uses fillRect to describe
 *  the exact same behavior as the preexisting methods regardless of the
 *  setting of the current Stroke.
 *  
 *  The Graphics class defines only the setColor
 *  method to control the color to be painted.  Since the Java 2D API extends
 *  the Color object to implement the new Paint
 *  interface, the existing
 *  setColor method is now a convenience method for setting the
 *  current Paint attribute to a Color object.
 *  setColor(c) is equivalent to setPaint(c).
 *  
 *  The Graphics class defines two methods for controlling
 *  how colors are applied to the destination.
 *  
 *  
 *  The setPaintMode method is implemented as a convenience
 *  method to set the default Composite, equivalent to
 *  setComposite(new AlphaComposite.SrcOver).
 *  
 *  The setXORMode(Color xorcolor) method is implemented
 *  as a convenience method to set a special Composite object that
 *  ignores the Alpha components of source colors and sets the
 *  destination color to the value:
 *  
 *  dstpixel = (PixelOf(srccolor) ^ PixelOf(xorcolor) ^ dstpixel);
 *  
 *  
 */
abstract class Graphics2D extends Graphics {

    /** Constructs a new Graphics2D object. */
    @stub
    protected def this() = ???

    /** Sets the values of an arbitrary number of preferences for the
     *  rendering algorithms.
     */
    def addRenderingHints(hints: Map[_, _]): Unit

    /** Intersects the current Clip with the interior of the
     *  specified Shape and sets the Clip to the
     *  resulting intersection.
     */
    def clip(s: Shape): Unit

    /** Strokes the outline of a Shape using the settings of the
     *  current Graphics2D context.
     */
    def draw(s: Shape): Unit

    /** Draws a 3-D highlighted outline of the specified rectangle. */
    def draw3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit

    /** Renders the text of the specified
     *  GlyphVector using
     *  the Graphics2D context's rendering attributes.
     */
    def drawGlyphVector(g: GlyphVector, x: Float, y: Float): Unit

    /** Renders a BufferedImage that is
     *  filtered with a
     *  BufferedImageOp.
     */
    def drawImage(img: BufferedImage, op: BufferedImageOp, x: Int, y: Int): Unit

    /** Renders an image, applying a transform from image space into user space
     *  before drawing.
     */
    def drawImage(img: Image, xform: AffineTransform, obs: ImageObserver): Boolean

    /** Renders a
     *  RenderableImage,
     *  applying a transform from image space into user space before drawing.
     */
    def drawRenderableImage(img: RenderableImage, xform: AffineTransform): Unit

    /** Renders a RenderedImage,
     *  applying a transform from image
     *  space into user space before drawing.
     */
    def drawRenderedImage(img: RenderedImage, xform: AffineTransform): Unit

    /** Renders the text of the specified iterator applying its attributes
     *  in accordance with the specification of the TextAttribute class.
     */
    def drawString(iterator: AttributedCharacterIterator, x: Float, y: Float): Unit

    /** Renders the text of the specified iterator applying its attributes
     *  in accordance with the specification of the TextAttribute class.
     */
    def drawString(iterator: AttributedCharacterIterator, x: Int, y: Int): Unit

    /** Renders the text specified by the specified String,
     *  using the current text attribute state in the Graphics2D context.
     */
    def drawString(str: String, x: Float, y: Float): Unit

    /** Renders the text of the specified String, using the
     *  current text attribute state in the Graphics2D context.
     */
    def drawString(str: String, x: Int, y: Int): Unit

    /** Fills the interior of a Shape using the settings of the
     *  Graphics2D context.
     */
    def fill(s: Shape): Unit

    /** Paints a 3-D highlighted rectangle filled with the current color. */
    def fill3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit

    /** Returns the background color used for clearing a region. */
    def getBackground(): Color

    /** Returns the current Composite in the
     *  Graphics2D context.
     */
    def getComposite(): Composite

    /** Returns the device configuration associated with this
     *  Graphics2D.
     */
    def getDeviceConfiguration(): GraphicsConfiguration

    /** Get the rendering context of the Font within this
     *  Graphics2D context.
     */
    def getFontRenderContext(): FontRenderContext

    /** Returns the current Paint of the
     *  Graphics2D context.
     */
    def getPaint(): Paint

    /** Returns the value of a single preference for the rendering algorithms. */
    def getRenderingHint(hintKey: RenderingHints.Key): Object

    /** Gets the preferences for the rendering algorithms. */
    def getRenderingHints(): RenderingHints

    /** Returns the current Stroke in the
     *  Graphics2D context.
     */
    def getStroke(): Stroke

    /** Returns a copy of the current Transform in the
     *  Graphics2D context.
     */
    def getTransform(): AffineTransform

    /** Checks whether or not the specified Shape intersects
     *  the specified Rectangle, which is in device
     *  space.
     */
    def hit(rect: Rectangle, s: Shape, onStroke: Boolean): Boolean

    /** Concatenates the current Graphics2D
     *  Transform with a rotation transform.
     */
    def rotate(theta: Double): Unit

    /** Concatenates the current Graphics2D
     *  Transform with a translated rotation
     *  transform.
     */
    def rotate(theta: Double, x: Double, y: Double): Unit

    /** Concatenates the current Graphics2D
     *  Transform with a scaling transformation
     *  Subsequent rendering is resized according to the specified scaling
     *  factors relative to the previous scaling.
     */
    def scale(sx: Double, sy: Double): Unit

    /** Sets the background color for the Graphics2D context. */
    def setBackground(color: Color): Unit

    /** Sets the Composite for the Graphics2D context. */
    def setComposite(comp: Composite): Unit

    /** Sets the Paint attribute for the
     *  Graphics2D context.
     */
    def setPaint(paint: Paint): Unit

    /** Sets the value of a single preference for the rendering algorithms. */
    def setRenderingHint(hintKey: RenderingHints.Key, hintValue: Object): Unit

    /** Replaces the values of all preferences for the rendering
     *  algorithms with the specified hints.
     */
    def setRenderingHints(hints: Map[_, _]): Unit

    /** Sets the Stroke for the Graphics2D context. */
    def setStroke(s: Stroke): Unit

    /** Overwrites the Transform in the Graphics2D context. */
    def setTransform(Tx: AffineTransform): Unit

    /** Concatenates the current Graphics2D
     *  Transform with a shearing transform.
     */
    def shear(shx: Double, shy: Double): Unit

    /** Composes an AffineTransform object with the
     *  Transform in this Graphics2D according
     *  to the rule last-specified-first-applied.
     */
    def transform(Tx: AffineTransform): Unit

    /** Concatenates the current
     *  Graphics2D Transform
     *  with a translation transform.
     */
    def translate(tx: Double, ty: Double): Unit

    /** Translates the origin of the Graphics2D context to the
     *  point (x, y) in the current coordinate system.
     */
    def translate(x: Int, y: Int): Unit
}
