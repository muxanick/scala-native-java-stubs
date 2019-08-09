package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}
import javax.swing.event.ChangeListener

// This class implements accessibility support for the
// JTabbedPane class.  It provides an implementation of the
// Java Accessibility API appropriate to tabbed pane user-interface
// elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JTabbedPane.AccessibleJTabbedPane extends JComponent.AccessibleJComponent with AccessibleSelection, with ChangeListener {

    @stub
    // Adds the specified Accessible child of the object to the object's
    // selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that no children in the
    // object are selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Returns the Accessible child contained at
    // the local coordinate Point, if one exists.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Return the specified Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Returns the accessible name of this object, or null if
    // there is no accessible name.
    def getAccessibleName(): String = ???

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Gets the AccessibleSelection associated with
    // this object.
    def getAccessibleSelection(): AccessibleSelection = ???

    @stub
    // Returns an Accessible representing the specified selected child
    // of the object.
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns the number of Accessible children currently selected.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Determines if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Removes the specified child of the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???

    @stub
    // Causes every child of the object to be selected
    // if the object supports multiple selections.
    def selectAllAccessibleSelection(): Unit = ???
}
