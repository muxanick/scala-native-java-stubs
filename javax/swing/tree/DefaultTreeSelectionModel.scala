package javax.swing.tree

import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.util.{EventListener, Vector}
import javax.swing.DefaultListSelectionModel
import javax.swing.event.{EventListenerList, SwingPropertyChangeSupport, TreeSelectionEvent, TreeSelectionListener}

// Default implementation of TreeSelectionModel.  Listeners are notified
// whenever
// the paths in the selection change, not the rows. In order
// to be able to track row changes you may wish to become a listener
// for expansion events on the tree and test for changes from there.
// resetRowSelection is called from any of the methods that update
// the selected paths. If you subclass any of these methods to
// filter what is allowed to be selected, be sure and message
// resetRowSelection if you do not message super.
//
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultTreeSelectionModel extends Object with Cloneable, with Serializable, with TreeSelectionModel {

    @stub
    // Used to messaged registered listeners.
    protected def changeSupport: SwingPropertyChangeSupport = ???

    @stub
    // Index of the lead path in selection.
    protected def leadIndex: Int = ???

    @stub
    // Last path that was added.
    protected def leadPath: TreePath = ???

    @stub
    // Lead row.
    protected def leadRow: Int = ???

    @stub
    // Event listener list.
    protected def listenerList: EventListenerList = ???

    @stub
    // Handles maintaining the list selection model.
    protected def listSelectionModel: DefaultListSelectionModel = ???

    @stub
    // Provides a row for a given path.
    protected def rowMapper: RowMapper = ???

    @stub
    // Paths that are currently selected.
    protected def selection: Array[TreePath] = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Adds path to the current selection.
    def addSelectionPath(path: TreePath): Unit = ???

    @stub
    // Adds paths to the current selection.
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // Adds x to the list of listeners that are notified each time the
    // set of selected TreePaths changes.
    def addTreeSelectionListener(x: TreeSelectionListener): Unit = ???

    @stub
    // Returns true if the paths are contiguous,
    // or this object has no RowMapper.
    protected def arePathsContiguous(paths: Array[TreePath]): Boolean = ???

    @stub
    // Used to test if a particular set of TreePaths can
    // be added.
    protected def canPathsBeAdded(paths: Array[TreePath]): Boolean = ???

    @stub
    // Returns true if the paths can be removed without breaking the
    // continuity of the model.
    protected def canPathsBeRemoved(paths: Array[TreePath]): Boolean = ???

    @stub
    // Empties the current selection.
    def clearSelection(): Unit = ???

    @stub
    // Returns a clone of this object with the same selection.
    def clone(): Object = ???

    @stub
    // Notifies all listeners that are registered for
    // tree selection events on this object.
    protected def fireValueChanged(e: TreeSelectionEvent): Unit = ???

    @stub
    // Returns the last path that was added.
    def getLeadSelectionPath(): TreePath = ???

    @stub
    // Returns the lead selection index.
    def getLeadSelectionRow(): Int = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the largest value obtained from the RowMapper for the
    // current set of selected TreePaths.
    def getMaxSelectionRow(): Int = ???

    @stub
    // Returns the smallest value obtained from the RowMapper for the
    // current set of selected TreePaths.
    def getMinSelectionRow(): Int = ???

    @stub
    // Returns an array of all the property change listeners
    // registered on this DefaultTreeSelectionModel.
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    @stub
    // Returns the RowMapper instance that is able to map a TreePath to a
    // row.
    def getRowMapper(): RowMapper = ???

    @stub
    // Returns the number of paths that are selected.
    def getSelectionCount(): Int = ???

    @stub
    // Returns the selection mode, one of SINGLE_TREE_SELECTION,
    // DISCONTIGUOUS_TREE_SELECTION or
    // CONTIGUOUS_TREE_SELECTION.
    def getSelectionMode(): Int = ???

    @stub
    // Returns the first path in the selection.
    def getSelectionPath(): TreePath = ???

    @stub
    // Returns the selection.
    def getSelectionPaths(): Array[TreePath] = ???

    @stub
    // Returns the selection in terms of rows.
    def getSelectionRows(): Array[Int] = ???

    @stub
    // Returns an array of all the tree selection listeners
    // registered on this model.
    def getTreeSelectionListeners(): Array[TreeSelectionListener] = ???

    @stub
    // Makes sure the currently selected TreePaths are valid
    // for the current selection mode.
    protected def insureRowContinuity(): Unit = ???

    @stub
    // This method is obsolete and its implementation is now a noop.
    protected def insureUniqueness(): Unit = ???

    @stub
    // Returns true if the path, path,
    // is in the current selection.
    def isPathSelected(path: TreePath): Boolean = ???

    @stub
    // Returns true if the row identified by row is selected.
    def isRowSelected(row: Int): Boolean = ???

    @stub
    // Returns true if the selection is currently empty.
    def isSelectionEmpty(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.7
    //
    protected def notifyPathChange(changedPaths: Vector[_], oldLeadSelection: TreePath): Unit = ???

    @stub
    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Removes path from the selection.
    def removeSelectionPath(path: TreePath): Unit = ???

    @stub
    // Removes paths from the selection.
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // Removes x from the list of listeners that are notified each time
    // the set of selected TreePaths changes.
    def removeTreeSelectionListener(x: TreeSelectionListener): Unit = ???

    @stub
    // Updates this object's mapping from TreePath to rows.
    def resetRowSelection(): Unit = ???

    @stub
    // Sets the RowMapper instance.
    def setRowMapper(newMapper: RowMapper): Unit = ???

    @stub
    // Sets the selection model, which must be one of SINGLE_TREE_SELECTION,
    // CONTIGUOUS_TREE_SELECTION or DISCONTIGUOUS_TREE_SELECTION.
    def setSelectionMode(mode: Int): Unit = ???

    @stub
    // Sets the selection to path.
    def setSelectionPath(path: TreePath): Unit = ???

    @stub
    // Sets the selection.
    def setSelectionPaths(pPaths: Array[TreePath]): Unit = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???
}

object DefaultTreeSelectionModel {
    @stub
    // Property name for selectionMode.
    def SELECTION_MODE_PROPERTY: String = ???
}
