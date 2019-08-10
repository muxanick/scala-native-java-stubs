package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleExtendedComponent, AccessibleKeyBinding, AccessibleRole, AccessibleStateSet}
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/** Inner class of JComponent used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by component developers.
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
abstract class JComponent_AccessibleJComponent extends Container.AccessibleAWTContainer with AccessibleExtendedComponent {

    /** Though the class is abstract, this should be called by
     *  all sub-classes.
     */
    @stub
    protected def AccessibleJComponent() = ???

    /** Fire PropertyChange listener, if one is registered,
     *  when children added/removed.
     */
    protected type AccessibleContainerHandler = JComponent_AccessibleJComponent_AccessibleContainerHandler

    /** Fire PropertyChange listener, if one is registered,
     *  when focus events happen
     */
    protected type AccessibleFocusHandler = JComponent_AccessibleJComponent_AccessibleFocusHandler

    /** Deprecated.  */
    protected val accessibleFocusHandler: FocusListener

    /** Adds a PropertyChangeListener to the listener list. */
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Returns the nth Accessible child of the object. */
    def getAccessibleChild(i: Int): Accessible

    /** Returns the number of accessible children in the object. */
    def getAccessibleChildrenCount(): Int

    /** Gets the accessible description of this object. */
    def getAccessibleDescription(): String

    /** Returns key bindings associated with this object */
    def getAccessibleKeyBinding(): AccessibleKeyBinding

    /** Gets the accessible name of this object. */
    def getAccessibleName(): String

    /** Gets the role of this object. */
    def getAccessibleRole(): AccessibleRole

    /** Gets the state of this object. */
    def getAccessibleStateSet(): AccessibleStateSet

    /** Recursively search through the border hierarchy (if it exists)
     *  for a TitledBorder with a non-null title.
     */
    protected def getBorderTitle(b: Border): String

    /** Returns the titled border text */
    def getTitledBorderText(): String

    /** Returns the tool tip text */
    def getToolTipText(): String

    /** Removes a PropertyChangeListener from the listener list. */
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit
}
