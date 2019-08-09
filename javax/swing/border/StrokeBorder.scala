package javax.swing.border

import java.awt.{BasicStroke, Component, Insets, Paint}
import java.lang.Object

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
}
