package javax.swing.border

import java.awt.{Component, Graphics, Insets}
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class which provides an empty, transparent border which
 *  takes up space but does no drawing.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class EmptyBorder extends AbstractBorder with Serializable {

    /** Creates an empty border with the specified insets. */
    @stub
    def this(borderInsets: Insets) = ???

    /** Creates an empty border with the specified insets. */
    @stub
    def this(top: Int, left: Int, bottom: Int, right: Int) = ???

    /**  */
    @stub
    protected val bottom: Int = ???

    /**  */
    @stub
    protected val left: Int = ???

    /**  */
    @stub
    protected val right: Int = ???

    /**  */
    @stub
    protected val top: Int = ???

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(): Insets = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Does no drawing by default. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
