package java.awt

import java.lang.Object

/** The BasicStroke class defines a basic set of rendering
 *  attributes for the outlines of graphics primitives, which are rendered
 *  with a Graphics2D object that has its Stroke attribute set to
 *  this BasicStroke.
 *  The rendering attributes defined by BasicStroke describe
 *  the shape of the mark made by a pen drawn along the outline of a
 *  Shape and the decorations applied at the ends and joins of
 *  path segments of the Shape.
 *  These rendering attributes include:
 *  
 *  width
 *  The pen width, measured perpendicularly to the pen trajectory.
 *  end caps
 *  The decoration applied to the ends of unclosed subpaths and
 *  dash segments.  Subpaths that start and end on the same point are
 *  still considered unclosed if they do not have a CLOSE segment.
 *  See SEG_CLOSE
 *  for more information on the CLOSE segment.
 *  The three different decorations are: CAP_BUTT,
 *  CAP_ROUND, and CAP_SQUARE.
 *  line joins
 *  The decoration applied at the intersection of two path segments
 *  and at the intersection of the endpoints of a subpath that is closed
 *  using SEG_CLOSE.
 *  The three different decorations are: JOIN_BEVEL,
 *  JOIN_MITER, and JOIN_ROUND.
 *  miter limit
 *  The limit to trim a line join that has a JOIN_MITER decoration.
 *  A line join is trimmed when the ratio of miter length to stroke
 *  width is greater than the miterlimit value.  The miter length is
 *  the diagonal length of the miter, which is the distance between
 *  the inside corner and the outside corner of the intersection.
 *  The smaller the angle formed by two line segments, the longer
 *  the miter length and the sharper the angle of intersection.  The
 *  default miterlimit value of 10.0f causes all angles less than
 *  11 degrees to be trimmed.  Trimming miters converts
 *  the decoration of the line join to bevel.
 *  dash attributes
 *  The definition of how to make a dash pattern by alternating
 *  between opaque and transparent sections.
 *  
 *  All attributes that specify measurements and distances controlling
 *  the shape of the returned outline are measured in the same
 *  coordinate system as the original unstroked Shape
 *  argument.  When a Graphics2D object uses a
 *  Stroke object to redefine a path during the execution
 *  of one of its draw methods, the geometry is supplied
 *  in its original form before the Graphics2D transform
 *  attribute is applied.  Therefore, attributes such as the pen width
 *  are interpreted in the user space coordinate system of the
 *  Graphics2D object and are subject to the scaling and
 *  shearing effects of the user-space-to-device-space transform in that
 *  particular Graphics2D.
 *  For example, the width of a rendered shape's outline is determined
 *  not only by the width attribute of this BasicStroke,
 *  but also by the transform attribute of the
 *  Graphics2D object.  Consider this code:
 *  
 *       // sets the Graphics2D object's Transform attribute
 *       g2d.scale(10, 10);
 *       // sets the Graphics2D object's Stroke attribute
 *       g2d.setStroke(new BasicStroke(1.5f));
 *  
 *  Assuming there are no other scaling transforms added to the
 *  Graphics2D object, the resulting line
 *  will be approximately 15 pixels wide.
 *  As the example code demonstrates, a floating-point line
 *  offers better precision, especially when large transforms are
 *  used with a Graphics2D object.
 *  When a line is diagonal, the exact width depends on how the
 *  rendering pipeline chooses which pixels to fill as it traces the
 *  theoretical widened outline.  The choice of which pixels to turn
 *  on is affected by the antialiasing attribute because the
 *  antialiasing rendering pipeline can choose to color
 *  partially-covered pixels.
 *  
 *  For more information on the user space coordinate system and the
 *  rendering process, see the Graphics2D class comments.
 */
class BasicStroke extends Object with Stroke {

    /** Constructs a new BasicStroke with defaults for all
     *  attributes.
     */
    @stub
    def this() = ???

    /** Constructs a solid BasicStroke with the specified
     *  line width and with default values for the cap and join
     *  styles.
     */
    @stub
    def this(width: Float) = ???

    /** Constructs a solid BasicStroke with the specified
     *  attributes.
     */
    @stub
    def this(width: Float, cap: Int, join: Int) = ???

    /** Constructs a solid BasicStroke with the specified
     *  attributes.
     */
    @stub
    def this(width: Float, cap: Int, join: Int, miterlimit: Float) = ???

    /** Returns a Shape whose interior defines the
     *  stroked outline of a specified Shape.
     */
    @stub
    def createStrokedShape(s: Shape): Shape = ???

    /** Tests if a specified object is equal to this BasicStroke
     *  by first testing if it is a BasicStroke and then comparing
     *  its width, join, cap, miter limit, dash, and dash phase attributes with
     *  those of this BasicStroke.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the array representing the lengths of the dash segments. */
    @stub
    def getDashArray(): Array[Float] = ???

    /** Returns the current dash phase. */
    @stub
    def getDashPhase(): Float = ???

    /** Returns the end cap style. */
    @stub
    def getEndCap(): Int = ???

    /** Returns the line join style. */
    @stub
    def getLineJoin(): Int = ???

    /** Returns the line width. */
    @stub
    def getLineWidth(): Float = ???

    /** Returns the limit of miter joins. */
    @stub
    def getMiterLimit(): Float = ???
}

object BasicStroke {
    /** Ends unclosed subpaths and dash segments with no added
     *  decoration.
     */
    @stub
    val CAP_BUTT: Int = ???

    /** Ends unclosed subpaths and dash segments with a round
     *  decoration that has a radius equal to half of the width
     *  of the pen.
     */
    @stub
    val CAP_ROUND: Int = ???

    /** Ends unclosed subpaths and dash segments with a square
     *  projection that extends beyond the end of the segment
     *  to a distance equal to half of the line width.
     */
    @stub
    val CAP_SQUARE: Int = ???

    /** Joins path segments by connecting the outer corners of their
     *  wide outlines with a straight segment.
     */
    @stub
    val JOIN_BEVEL: Int = ???

    /** Joins path segments by extending their outside edges until
     *  they meet.
     */
    @stub
    val JOIN_MITER: Int = ???
}
