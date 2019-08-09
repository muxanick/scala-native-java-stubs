package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JComboBox class.  It provides an implementation of the
 *  Java Accessibility API appropriate to Combo Box user-interface elements.
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
protected class JComboBox.AccessibleJComboBox extends JComponent.AccessibleJComponent with AccessibleAction with AccessibleSelection {

    /** Returns an AccessibleJComboBox instance */
    @stub
    def AccessibleJComboBox() = ???

    /** Adds the specified Accessible child of the object to the object's
     *  selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that no children in the
     *  object are selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Perform the specified Action on the object */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Get the AccessibleAction associated with this object. */
    @stub
    def getAccessibleAction(): AccessibleAction = ???

    /** Returns the number of Actions available in this object. */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Return a description of the specified action of the object. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Returns the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the AccessibleSelection associated with this object. */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the specified selected child
     *  in the popup.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of Accessible children currently selected. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Gets the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Determines if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Removes the specified child of the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Causes every child of the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???
}
