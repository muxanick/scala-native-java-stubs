package javax.swing.tree

import java.beans.PropertyChangeListener
import javax.swing.event.TreeSelectionListener

// This interface represents the current state of the selection for
// the tree component.
// For information and examples of using tree selection models,
// see How to Use Trees
// in The Java Tutorial.
//
// 
// The state of the tree selection is characterized by
// a set of TreePaths, and optionally a set of integers. The mapping
// from TreePath to integer is done by way of an instance of RowMapper.
// It is not necessary for a TreeSelectionModel to have a RowMapper to
// correctly operate, but without a RowMapper getSelectionRows
// will return null.
//
// 
//
// A TreeSelectionModel can be configured to allow only one
// path (SINGLE_TREE_SELECTION) a number of
// contiguous paths (CONTIGUOUS_TREE_SELECTION) or a number of
// discontiguous paths (DISCONTIGUOUS_TREE_SELECTION).
// A RowMapper is used to determine if TreePaths are
// contiguous.
// In the absence of a RowMapper CONTIGUOUS_TREE_SELECTION and
// DISCONTIGUOUS_TREE_SELECTION behave the same, that is they
// allow any number of paths to be contained in the TreeSelectionModel.
//
// 
//
// For a selection model of CONTIGUOUS_TREE_SELECTION any
// time the paths are changed (setSelectionPath,
// addSelectionPath ...) the TreePaths are again checked to
// make they are contiguous. A check of the TreePaths can also be forced
// by invoking resetRowSelection. How a set of discontiguous
// TreePaths is mapped to a contiguous set is left to implementors of
// this interface to enforce a particular policy.
//
// 
//
// Implementations should combine duplicate TreePaths that are
// added to the selection. For example, the following code
// 
//   TreePath[] paths = new TreePath[] { treePath, treePath };
//   treeSelectionModel.setSelectionPaths(paths);
// 
// should result in only one path being selected:
// treePath, and
// not two copies of treePath.
//
// 
//
// The lead TreePath is the last path that was added (or set). The lead
// row is then the row that corresponds to the TreePath as determined
// from the RowMapper.
trait TreeSelectionModel {

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
    // Empties the current selection.
    def clearSelection(): Unit = ???

    @stub
    // Returns the last path that was added.
    def getLeadSelectionPath(): TreePath = ???

    @stub
    // Returns the lead selection index.
    def getLeadSelectionRow(): Int = ???

    @stub
    // Returns the largest value obtained from the RowMapper for the
    // current set of selected TreePaths.
    def getMaxSelectionRow(): Int = ???

    @stub
    // Returns the smallest value obtained from the RowMapper for the
    // current set of selected TreePaths.
    def getMinSelectionRow(): Int = ???

    @stub
    // Returns the RowMapper instance that is able to map a TreePath to a
    // row.
    def getRowMapper(): RowMapper = ???

    @stub
    // Returns the number of paths that are selected.
    def getSelectionCount(): Int = ???

    @stub
    // Returns the current selection mode, one of
    // SINGLE_TREE_SELECTION,
    // CONTIGUOUS_TREE_SELECTION or
    // DISCONTIGUOUS_TREE_SELECTION.
    def getSelectionMode(): Int = ???

    @stub
    // Returns the first path in the selection.
    def getSelectionPath(): TreePath = ???

    @stub
    // Returns the paths in the selection.
    def getSelectionPaths(): Array[TreePath] = ???

    @stub
    // Returns all of the currently selected rows.
    def getSelectionRows(): Array[Int] = ???

    @stub
    // Returns true if the path, path, is in the current
    // selection.
    def isPathSelected(path: TreePath): Boolean = ???

    @stub
    // Returns true if the row identified by row is selected.
    def isRowSelected(row: Int): Boolean = ???

    @stub
    // Returns true if the selection is currently empty.
    def isSelectionEmpty(): Boolean = ???

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
    // Updates this object's mapping from TreePaths to rows.
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
}

object TreeSelectionModel {
    @stub
    // Selection can only be contiguous.
    def CONTIGUOUS_TREE_SELECTION: Int = ???

    @stub
    // Selection can contain any number of items that are not necessarily
    // contiguous.
    def DISCONTIGUOUS_TREE_SELECTION: Int = ???
}
