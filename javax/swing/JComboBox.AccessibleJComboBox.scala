package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}

// This class implements accessibility support for the
// JComboBox class.  It provides an implementation of the
// Java Accessibility API appropriate to Combo Box user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JComboBox.AccessibleJComboBox extends JComponent.AccessibleJComponent with AccessibleAction, with AccessibleSelection {

    @stub
    // Adds the specified Accessible child of the object to the object's
    // selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that no children in the
    // object are selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Perform the specified Action on the object
    def doAccessibleAction(i: Int): Boolean = ???

    @stub
    // Get the AccessibleAction associated with this object.
    def getAccessibleAction(): AccessibleAction = ???

    @stub
    // Returns the number of Actions available in this object.
    def getAccessibleActionCount(): Int = ???

    @stub
    // Return a description of the specified action of the object.
    def getAccessibleActionDescription(i: Int): String = ???

    @stub
    // Returns the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Get the AccessibleSelection associated with this object.
    def getAccessibleSelection(): AccessibleSelection = ???

    @stub
    // Returns an Accessible representing the specified selected child
    // in the popup.
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns the number of Accessible children currently selected.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Gets the state set of this object.
    def getAccessibleStateSet(): AccessibleStateSet = ???

    @stub
    // Determines if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Removes the specified child of the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???
}
