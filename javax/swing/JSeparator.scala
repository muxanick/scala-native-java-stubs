package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.SeparatorUI
import scala.scalanative.annotation.stub

/** JSeparator provides a general purpose component for
 *  implementing divider lines - most commonly used as a divider
 *  between menu items that breaks them up into logical groupings.
 *  Instead of using JSeparator directly,
 *  you can use the JMenu or JPopupMenu
 *  addSeparator method to create and add a separator.
 *  JSeparators may also be used elsewhere in a GUI
 *  wherever a visual divider is useful.
 * 
 *  
 * 
 *  For more information and examples see
 *  How to Use Menus,
 *  a section in The Java Tutorial.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JSeparator extends JComponent with SwingConstants with Accessible {

    /** Creates a new horizontal separator. */
    @stub
    def this() = ???

    /** Creates a new separator with the specified horizontal or
     *  vertical orientation.
     */
    @stub
    def this(orientation: Int) = ???

    /** This class implements accessibility support for the
     *  JSeparator class.
     */
    protected type AccessibleJSeparator = JSeparator_AccessibleJSeparator

    /** Gets the AccessibleContext associated with this JSeparator. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the orientation of this separator. */
    @stub
    def getOrientation(): Int = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): SeparatorUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JSeparator. */
    @stub
    protected def paramString(): String = ???

    /** Sets the orientation of the separator. */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: SeparatorUI): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
