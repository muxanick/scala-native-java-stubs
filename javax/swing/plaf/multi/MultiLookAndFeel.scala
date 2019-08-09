package javax.swing.plaf.multi

import java.lang.{Object, String}
import java.util.Vector
import javax.swing.{JComponent, LookAndFeel, UIDefaults}
import javax.swing.plaf.ComponentUI
import scala.scalanative.annotation.stub

/** A multiplexing look and feel that allows more than one UI
 *  to be associated with a component at the same time.
 *  The primary look and feel is called
 *  the default look and feel,
 *  and the other look and feels are called auxiliary.
 *  
 * 
 *  For further information, see
 *  Using the
 *  Multiplexing Look and Feel.
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
class MultiLookAndFeel extends LookAndFeel {

    /**  */
    @stub
    def this() = ???

    /** Creates, initializes, and returns
     *  the look and feel specific defaults.
     */
    @stub
    def getDefaults(): UIDefaults = ???

    /** Returns a one-line description of this look and feel. */
    @stub
    def getDescription(): String = ???

    /** Returns a string, suitable for use by applications/services,
     *  that identifies this look and feel.
     */
    @stub
    def getID(): String = ???

    /** Returns a string, suitable for use in menus,
     *  that identifies this look and feel.
     */
    @stub
    def getName(): String = ???

    /** Returns false;
     *  this look and feel is not native to any platform.
     */
    @stub
    def isNativeLookAndFeel(): Boolean = ???

    /** Returns true;
     *  every platform permits this look and feel.
     */
    @stub
    def isSupportedLookAndFeel(): Boolean = ???
}

object MultiLookAndFeel {
    /** Creates the ComponentUI objects
     *  required to present
     *  the target component,
     *  placing the objects in the uis vector and
     *  returning the
     *  ComponentUI object
     *  that best represents the component's UI.
     */
    @stub
    def createUIs(mui: ComponentUI, uis: Vector, target: JComponent): ComponentUI = ???

    /** Creates an array,
     *  populates it with UI objects from the passed-in vector,
     *  and returns the array.
     */
    @stub
    protected def uisToArray(uis: Vector): Array[ComponentUI] = ???
}
