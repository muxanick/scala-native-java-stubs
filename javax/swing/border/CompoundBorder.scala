package javax.swing.border

import java.awt.{Component, Insets}
import java.lang.Object

/** A composite Border class used to compose two Border objects
 *  into a single border by nesting an inside Border object within
 *  the insets of an outside Border object.
 * 
 *  For example, this class may be used to add blank margin space
 *  to a component with an existing decorative border:
 * 
 *  
 *     Border border = comp.getBorder();
 *     Border margin = new EmptyBorder(10,10,10,10);
 *     comp.setBorder(new CompoundBorder(border, margin));
 *  
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
class CompoundBorder extends AbstractBorder {

    /** Creates a compound border with null outside and inside borders. */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val insideBorder: Border = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns the inside border object. */
    @stub
    def getInsideBorder(): Border = ???

    /** Returns the outside border object. */
    @stub
    def getOutsideBorder(): Border = ???

    /** Returns whether or not the compound border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???
}
