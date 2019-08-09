package javax.swing.border

import java.awt.{BasicStroke, Component, Graphics, Insets, Paint}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class which implements a border of an arbitrary stroke.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI
 *  between applications running the same version of Swing.
 *  As of 1.4, support for long term storage of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class StrokeBorder extends AbstractBorder {

    /** Creates a border of the specified stroke. */
    @stub
    def this(stroke: BasicStroke) = ???

    /** Creates a border of the specified stroke and paint. */
    @stub
    def this(stroke: BasicStroke, paint: Paint) = ???

    /** Reinitializes the insets parameter
     *  with this border's current insets.
     */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns the Paint object used to generate a color
     *  during the border rendering.
     */
    @stub
    def getPaint(): Paint = ???

    /** Returns the BasicStroke object used to stroke a shape
     *  during the border rendering.
     */
    @stub
    def getStroke(): BasicStroke = ???

    /** Paints the border for the specified component
     *  with the specified position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
