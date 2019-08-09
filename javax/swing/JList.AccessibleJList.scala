package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import javax.swing.event.{ListDataEvent, ListDataListener, ListSelectionListener}

// This class implements accessibility support for the
// JList class. It provides an implementation of the
// Java Accessibility API appropriate to list user-interface
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
protected class JList.AccessibleJList extends JComponent.AccessibleJComponent with AccessibleSelection, with PropertyChangeListener, with ListSelectionListener, with ListDataListener {

    @stub
    // Adds the specified selected item in the object to the object's
    // selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that nothing in the
    // object is selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // List Data Listener contents changed method.
    def contentsChanged(e: ListDataEvent): Unit = ???

    @stub
    // Returns the Accessible child contained at
    // the local coordinate Point, if one exists.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Return the nth Accessible child of the object.
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
    // Returns an Accessible representing the specified selected item
    // in the object.
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns the number of items currently selected.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Get the state set of this object.
    def getAccessibleStateSet(): AccessibleStateSet = ???

    @stub
    // List Data Listener interval added method.
    def intervalAdded(e: ListDataEvent): Unit = ???

    @stub
    // List Data Listener interval removed method.
    def intervalRemoved(e: ListDataEvent): Unit = ???

    @stub
    // Returns true if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Property Change Listener change method.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Removes the specified selected item in the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???

    @stub
    // Causes every selected item in the object to be selected
    // if the object supports multiple selections.
    def selectAllAccessibleSelection(): Unit = ???
}
