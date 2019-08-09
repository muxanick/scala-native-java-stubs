package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener, TreeModelEvent, TreeModelListener, TreeSelectionListener}

// This class implements accessibility support for the
// JTree class.  It provides an implementation of the
// Java Accessibility API appropriate to tree user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JTree.AccessibleJTree extends JComponent.AccessibleJComponent with AccessibleSelection, with TreeSelectionListener, with TreeModelListener, with TreeExpansionListener {

    @stub
    // Adds the specified selected item in the object to the object's
    // selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that nothing in the
    // object is selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Fire a visible data property change notification.
    def fireVisibleDataPropertyChange(): Unit = ???

    @stub
    // Returns the Accessible child, if one exists,
    // contained at the local coordinate Point.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Return the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of top-level children nodes of this
    // JTree.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Get the index of this object in its accessible parent.
    def getAccessibleIndexInParent(): Int = ???

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
    // Returns true if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Removes the specified selected item in the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???

    @stub
    // Causes every selected item in the object to be selected
    // if the object supports multiple selections.
    def selectAllAccessibleSelection(): Unit = ???

    @stub
    // Tree Collapsed notification.
    def treeCollapsed(e: TreeExpansionEvent): Unit = ???

    @stub
    // Tree Model Expansion notification.
    def treeExpanded(e: TreeExpansionEvent): Unit = ???

    @stub
    // Tree Model Node change notification.
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    @stub
    // Tree Model Node change notification.
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    @stub
    // Tree Model Node change notification.
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???

    @stub
    // Tree Model structure change change notification.
    def treeStructureChanged(e: TreeModelEvent): Unit = ???
}
