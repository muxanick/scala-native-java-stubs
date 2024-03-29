package javax.swing.plaf.multi

import java.awt.{Dimension, Graphics, Rectangle}
import java.lang.Object
import java.util.Vector
import javax.accessibility.Accessible
import javax.swing.{JComponent, JTree}
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.tree.TreePath
import scala.scalanative.annotation.stub

/** A multiplexing UI used to combine TreeUIs.
 * 
 *  This file was automatically generated by AutoMulti.
 */
class MultiTreeUI extends TreeUI {

    /**  */
    @stub
    def this() = ???

    /** The vector containing the real UIs. */
    @stub
    protected val uis: Vector = ???

    /** Invokes the cancelEditing method on each UI handled by this object. */
    @stub
    def cancelEditing(a: JTree): Unit = ???

    /** Invokes the contains method on each UI handled by this object. */
    @stub
    def contains(a: JComponent, b: Int, c: Int): Boolean = ???

    /** Invokes the getAccessibleChild method on each UI handled by this object. */
    @stub
    def getAccessibleChild(a: JComponent, b: Int): Accessible = ???

    /** Invokes the getAccessibleChildrenCount method on each UI handled by this object. */
    @stub
    def getAccessibleChildrenCount(a: JComponent): Int = ???

    /** Invokes the getClosestPathForLocation method on each UI handled by this object. */
    @stub
    def getClosestPathForLocation(a: JTree, b: Int, c: Int): TreePath = ???

    /** Invokes the getEditingPath method on each UI handled by this object. */
    @stub
    def getEditingPath(a: JTree): TreePath = ???

    /** Invokes the getMaximumSize method on each UI handled by this object. */
    @stub
    def getMaximumSize(a: JComponent): Dimension = ???

    /** Invokes the getMinimumSize method on each UI handled by this object. */
    @stub
    def getMinimumSize(a: JComponent): Dimension = ???

    /** Invokes the getPathBounds method on each UI handled by this object. */
    @stub
    def getPathBounds(a: JTree, b: TreePath): Rectangle = ???

    /** Invokes the getPathForRow method on each UI handled by this object. */
    @stub
    def getPathForRow(a: JTree, b: Int): TreePath = ???

    /** Invokes the getPreferredSize method on each UI handled by this object. */
    @stub
    def getPreferredSize(a: JComponent): Dimension = ???

    /** Invokes the getRowCount method on each UI handled by this object. */
    @stub
    def getRowCount(a: JTree): Int = ???

    /** Invokes the getRowForPath method on each UI handled by this object. */
    @stub
    def getRowForPath(a: JTree, b: TreePath): Int = ???

    /** Returns the list of UIs associated with this multiplexing UI. */
    @stub
    def getUIs(): Array[ComponentUI] = ???

    /** Invokes the installUI method on each UI handled by this object. */
    @stub
    def installUI(a: JComponent): Unit = ???

    /** Invokes the isEditing method on each UI handled by this object. */
    @stub
    def isEditing(a: JTree): Boolean = ???

    /** Invokes the paint method on each UI handled by this object. */
    @stub
    def paint(a: Graphics, b: JComponent): Unit = ???

    /** Invokes the startEditingAtPath method on each UI handled by this object. */
    @stub
    def startEditingAtPath(a: JTree, b: TreePath): Unit = ???

    /** Invokes the stopEditing method on each UI handled by this object. */
    @stub
    def stopEditing(a: JTree): Boolean = ???

    /** Invokes the uninstallUI method on each UI handled by this object. */
    @stub
    def uninstallUI(a: JComponent): Unit = ???

    /** Invokes the update method on each UI handled by this object. */
    @stub
    def update(a: Graphics, b: JComponent): Unit = ???
}

object MultiTreeUI {
    /** Returns a multiplexing UI instance if any of the auxiliary
     *  LookAndFeels supports this UI.
     */
    @stub
    def createUI(a: JComponent): ComponentUI = ???
}
