package javax.swing.tree

import java.beans.PropertyChangeListener
import javax.swing.event.TreeSelectionListener
import scala.scalanative.annotation.stub

/** This interface represents the current state of the selection for
 *  the tree component.
 *  For information and examples of using tree selection models,
 *  see How to Use Trees
 *  in The Java Tutorial.
 * 
 *  
 *  The state of the tree selection is characterized by
 *  a set of TreePaths, and optionally a set of integers. The mapping
 *  from TreePath to integer is done by way of an instance of RowMapper.
 *  It is not necessary for a TreeSelectionModel to have a RowMapper to
 *  correctly operate, but without a RowMapper getSelectionRows
 *  will return null.
 * 
 *  
 * 
 *  A TreeSelectionModel can be configured to allow only one
 *  path (SINGLE_TREE_SELECTION) a number of
 *  contiguous paths (CONTIGUOUS_TREE_SELECTION) or a number of
 *  discontiguous paths (DISCONTIGUOUS_TREE_SELECTION).
 *  A RowMapper is used to determine if TreePaths are
 *  contiguous.
 *  In the absence of a RowMapper CONTIGUOUS_TREE_SELECTION and
 *  DISCONTIGUOUS_TREE_SELECTION behave the same, that is they
 *  allow any number of paths to be contained in the TreeSelectionModel.
 * 
 *  
 * 
 *  For a selection model of CONTIGUOUS_TREE_SELECTION any
 *  time the paths are changed (setSelectionPath,
 *  addSelectionPath ...) the TreePaths are again checked to
 *  make they are contiguous. A check of the TreePaths can also be forced
 *  by invoking resetRowSelection. How a set of discontiguous
 *  TreePaths is mapped to a contiguous set is left to implementors of
 *  this interface to enforce a particular policy.
 * 
 *  
 * 
 *  Implementations should combine duplicate TreePaths that are
 *  added to the selection. For example, the following code
 *  
 *    TreePath[] paths = new TreePath[] { treePath, treePath };
 *    treeSelectionModel.setSelectionPaths(paths);
 *  
 *  should result in only one path being selected:
 *  treePath, and
 *  not two copies of treePath.
 * 
 *  
 * 
 *  The lead TreePath is the last path that was added (or set). The lead
 *  row is then the row that corresponds to the TreePath as determined
 *  from the RowMapper.
 */
trait TreeSelectionModel {

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

    /** Empties the current selection. */
    @stub
    def clearSelection(): Unit = ???

    /** Returns the last path that was added. */
    @stub
    def getLeadSelectionPath(): TreePath = ???

    /** Returns the lead selection index. */
    @stub
    def getLeadSelectionRow(): Int = ???

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

    /** Returns the RowMapper instance that is able to map a TreePath to a
     *  row.
     */
    @stub
    def getRowMapper(): RowMapper = ???

    /** Returns the number of paths that are selected. */
    @stub
    def getSelectionCount(): Int = ???

    /** Returns the current selection mode, one of
     *  SINGLE_TREE_SELECTION,
     *  CONTIGUOUS_TREE_SELECTION or
     *  DISCONTIGUOUS_TREE_SELECTION.
     */
    @stub
    def getSelectionMode(): Int = ???

    /** Returns the first path in the selection. */
    @stub
    def getSelectionPath(): TreePath = ???

    /** Returns the paths in the selection. */
    @stub
    def getSelectionPaths(): Array[TreePath] = ???

    /** Returns all of the currently selected rows. */
    @stub
    def getSelectionRows(): Array[Int] = ???

    /** Returns true if the path, path, is in the current
     *  selection.
     */
    @stub
    def isPathSelected(path: TreePath): Boolean = ???

    /** Returns true if the row identified by row is selected. */
    @stub
    def isRowSelected(row: Int): Boolean = ???

    /** Returns true if the selection is currently empty. */
    @stub
    def isSelectionEmpty(): Boolean = ???

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

    /** Updates this object's mapping from TreePaths to rows. */
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

    /** Sets the selection to path. */
    @stub
    def setSelectionPaths(paths: Array[TreePath]): Unit = ???
}

object TreeSelectionModel {
    /** Selection can only be contiguous. */
    @stub
    val CONTIGUOUS_TREE_SELECTION: Int = ???

    /** Selection can contain any number of items that are not necessarily
     *  contiguous.
     */
    @stub
    val DISCONTIGUOUS_TREE_SELECTION: Int = ???

    /** Selection can only contain one path at a time. */
    @stub
    val SINGLE_TREE_SELECTION: Int = ???
}
