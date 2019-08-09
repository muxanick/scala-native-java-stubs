package javax.swing.plaf

import java.awt.Rectangle
import java.lang.Object
import javax.swing.JTree
import javax.swing.tree.TreePath

/** Pluggable look and feel interface for JTree. */
abstract class TreeUI extends ComponentUI {

    /** Cancels the current editing session. */
    def cancelEditing(tree: JTree): Unit

    /** Returns the path to the node that is closest to x,y. */
    def getClosestPathForLocation(tree: JTree, x: Int, y: Int): TreePath

    /** Returns the path to the element that is being edited. */
    def getEditingPath(tree: JTree): TreePath

    /** Returns the Rectangle enclosing the label portion that the
     *  last item in path will be drawn into.
     */
    def getPathBounds(tree: JTree, path: TreePath): Rectangle

    /** Returns the path for passed in row. */
    def getPathForRow(tree: JTree, row: Int): TreePath

    /** Returns the number of rows that are being displayed. */
    def getRowCount(tree: JTree): Int

    /** Returns the row that the last item identified in path is visible
     *  at.
     */
    def getRowForPath(tree: JTree, path: TreePath): Int

    /** Returns true if the tree is being edited. */
    def isEditing(tree: JTree): Boolean

    /** Selects the last item in path and tries to edit it. */
    def startEditingAtPath(tree: JTree, path: TreePath): Unit
}
