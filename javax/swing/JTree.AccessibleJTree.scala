package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener, TreeModelEvent, TreeModelListener, TreeSelectionEvent, TreeSelectionListener}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JTree class.  It provides an implementation of the
 *  Java Accessibility API appropriate to tree user-interface elements.
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
protected class JTree_AccessibleJTree extends JComponent.AccessibleJComponent with AccessibleSelection with TreeSelectionListener with TreeModelListener with TreeExpansionListener {

    /**  */
    @stub
    def AccessibleJTree() = ???

    /** This class implements accessibility support for the
     *  JTree child.
     */
    protected type AccessibleJTreeNode = JTree_AccessibleJTree_AccessibleJTreeNode

    /** Adds the specified selected item in the object to the object's
     *  selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that nothing in the
     *  object is selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Fire a visible data property change notification. */
    @stub
    def fireVisibleDataPropertyChange(): Unit = ???

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of top-level children nodes of this
     *  JTree.
     */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the AccessibleSelection associated with this object. */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the specified selected item
     *  in the object.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of items currently selected. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Returns true if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Removes the specified selected item in the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Causes every selected item in the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???

    /** Tree Collapsed notification. */
    @stub
    def treeCollapsed(e: TreeExpansionEvent): Unit = ???

    /** Tree Model Expansion notification. */
    @stub
    def treeExpanded(e: TreeExpansionEvent): Unit = ???

    /** Tree Model Node change notification. */
    @stub
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    /** Tree Model Node change notification. */
    @stub
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    /** Tree Model Node change notification. */
    @stub
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???

    /** Tree Model structure change change notification. */
    @stub
    def treeStructureChanged(e: TreeModelEvent): Unit = ???

    /** Tree Selection Listener value change method. */
    @stub
    def valueChanged(e: TreeSelectionEvent): Unit = ???
}
