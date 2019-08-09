package javax.swing.tree

import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.util.{EventListener, Vector}
import javax.swing.DefaultListSelectionModel
import javax.swing.event.{EventListenerList, SwingPropertyChangeSupport, TreeSelectionEvent, TreeSelectionListener}

/** Default implementation of TreeSelectionModel.  Listeners are notified
 *  whenever
 *  the paths in the selection change, not the rows. In order
 *  to be able to track row changes you may wish to become a listener
 *  for expansion events on the tree and test for changes from there.
 *  resetRowSelection is called from any of the methods that update
 *  the selected paths. If you subclass any of these methods to
 *  filter what is allowed to be selected, be sure and message
 *  resetRowSelection if you do not message super.
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
class DefaultTreeSelectionModel extends Object with Cloneable with Serializable with TreeSelectionModel {

    /** Used to messaged registered listeners. */
    @stub
    protected val changeSupport: SwingPropertyChangeSupport = ???

    /** Index of the lead path in selection. */
    @stub
    protected val leadIndex: Int = ???

    /** Last path that was added. */
    @stub
    protected val leadPath: TreePath = ???

    /** Lead row. */
    @stub
    protected val leadRow: Int = ???

    /** Event listener list. */
    @stub
    protected val listenerList: EventListenerList = ???

    /** Handles maintaining the list selection model. */
    @stub
    protected val listSelectionModel: DefaultListSelectionModel = ???

    /** Provides a row for a given path. */
    @stub
    protected val rowMapper: RowMapper = ???

    /** Paths that are currently selected. */
    @stub
    protected val selection: Array[TreePath] = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Adds path to the current selection. */
    @stub
    def addSelectionPath(path: TreePath): Unit = ???

    /** Adds paths to the current selection. */
    @stub
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** Adds x to the list of listeners that are notified each time the
     *  set of selected TreePaths changes.
     */
    @stub
    def addTreeSelectionListener(x: TreeSelectionListener): Unit = ???

    /** Returns true if the paths are contiguous,
     *  or this object has no RowMapper.
     */
    @stub
    protected def arePathsContiguous(paths: Array[TreePath]): Boolean = ???

    /** Used to test if a particular set of TreePaths can
     *  be added.
     */
    @stub
    protected def canPathsBeAdded(paths: Array[TreePath]): Boolean = ???

    /** Returns true if the paths can be removed without breaking the
     *  continuity of the model.
     */
    @stub
    protected def canPathsBeRemoved(paths: Array[TreePath]): Boolean = ???

    /** Empties the current selection. */
    @stub
    def clearSelection(): Unit = ???

    /** Returns a clone of this object with the same selection. */
    @stub
    def clone(): Object = ???

    /** Notifies all listeners that are registered for
     *  tree selection events on this object.
     */
    @stub
    protected def fireValueChanged(e: TreeSelectionEvent): Unit = ???

    /** Returns the last path that was added. */
    @stub
    def getLeadSelectionPath(): TreePath = ???

    /** Returns the lead selection index. */
    @stub
    def getLeadSelectionRow(): Int = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the largest value obtained from the RowMapper for the
     *  current set of selected TreePaths.
     */
    @stub
    def getMaxSelectionRow(): Int = ???

    /** Returns the smallest value obtained from the RowMapper for the
     *  current set of selected TreePaths.
     */
    @stub
    def getMinSelectionRow(): Int = ???

    /** Returns an array of all the property change listeners
     *  registered on this DefaultTreeSelectionModel.
     */
    @stub
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    /** Returns the RowMapper instance that is able to map a TreePath to a
     *  row.
     */
    @stub
    def getRowMapper(): RowMapper = ???

    /** Returns the number of paths that are selected. */
    @stub
    def getSelectionCount(): Int = ???

    /** Returns the selection mode, one of SINGLE_TREE_SELECTION,
     *  DISCONTIGUOUS_TREE_SELECTION or
     *  CONTIGUOUS_TREE_SELECTION.
     */
    @stub
    def getSelectionMode(): Int = ???

    /** Returns the first path in the selection. */
    @stub
    def getSelectionPath(): TreePath = ???

    /** Returns the selection. */
    @stub
    def getSelectionPaths(): Array[TreePath] = ???

    /** Returns the selection in terms of rows. */
    @stub
    def getSelectionRows(): Array[Int] = ???

    /** Returns an array of all the tree selection listeners
     *  registered on this model.
     */
    @stub
    def getTreeSelectionListeners(): Array[TreeSelectionListener] = ???

    /** Makes sure the currently selected TreePaths are valid
     *  for the current selection mode.
     */
    @stub
    protected def insureRowContinuity(): Unit = ???

    /** This method is obsolete and its implementation is now a noop. */
    @stub
    protected def insureUniqueness(): Unit = ???

    /** Returns true if the path, path,
     *  is in the current selection.
     */
    @stub
    def isPathSelected(path: TreePath): Boolean = ???

    /** Returns true if the row identified by row is selected. */
    @stub
    def isRowSelected(row: Int): Boolean = ???

    /** Returns true if the selection is currently empty. */
    @stub
    def isSelectionEmpty(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.7
     * 
     */
    @stub
    protected def notifyPathChange(changedPaths: Vector[_], oldLeadSelection: TreePath): Unit = ???

    /** Removes a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Removes path from the selection. */
    @stub
    def removeSelectionPath(path: TreePath): Unit = ???

    /** Removes paths from the selection. */
    @stub
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** Removes x from the list of listeners that are notified each time
     *  the set of selected TreePaths changes.
     */
    @stub
    def removeTreeSelectionListener(x: TreeSelectionListener): Unit = ???

    /** Updates this object's mapping from TreePath to rows. */
    @stub
    def resetRowSelection(): Unit = ???

    /** Sets the RowMapper instance. */
    @stub
    def setRowMapper(newMapper: RowMapper): Unit = ???

    /** Sets the selection model, which must be one of SINGLE_TREE_SELECTION,
     *  CONTIGUOUS_TREE_SELECTION or DISCONTIGUOUS_TREE_SELECTION.
     */
    @stub
    def setSelectionMode(mode: Int): Unit = ???

    /** Sets the selection to path. */
    @stub
    def setSelectionPath(path: TreePath): Unit = ???

    /** Sets the selection. */
    @stub
    def setSelectionPaths(pPaths: Array[TreePath]): Unit = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???
}

object DefaultTreeSelectionModel {
    /** Property name for selectionMode. */
    @stub
    val SELECTION_MODE_PROPERTY: String = ???
}
