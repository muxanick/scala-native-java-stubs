package javax.swing.plaf.multi

import java.awt.{Dimension, Graphics, Point, Rectangle}
import java.lang.Object
import java.util.Vector
import javax.accessibility.Accessible
import javax.swing.{JComponent, JList}
import javax.swing.plaf.{ComponentUI, ListUI}
import scala.scalanative.annotation.stub

/** A multiplexing UI used to combine ListUIs.
 * 
 *  This file was automatically generated by AutoMulti.
 */
class MultiListUI extends ListUI {

    /**  */
    @stub
    def this() = ???

    /** The vector containing the real UIs. */
    @stub
    protected val uis: Vector = ???

    /** Invokes the contains method on each UI handled by this object. */
    @stub
    def contains(a: JComponent, b: Int, c: Int): Boolean = ???

    /** Invokes the getAccessibleChild method on each UI handled by this object. */
    @stub
    def getAccessibleChild(a: JComponent, b: Int): Accessible = ???

    /** Invokes the getAccessibleChildrenCount method on each UI handled by this object. */
    @stub
    def getAccessibleChildrenCount(a: JComponent): Int = ???

    /** Invokes the getCellBounds method on each UI handled by this object. */
    @stub
    def getCellBounds(a: JList, b: Int, c: Int): Rectangle = ???

    /** Invokes the getMaximumSize method on each UI handled by this object. */
    @stub
    def getMaximumSize(a: JComponent): Dimension = ???

    /** Invokes the getMinimumSize method on each UI handled by this object. */
    @stub
    def getMinimumSize(a: JComponent): Dimension = ???

    /** Invokes the getPreferredSize method on each UI handled by this object. */
    @stub
    def getPreferredSize(a: JComponent): Dimension = ???

    /** Returns the list of UIs associated with this multiplexing UI. */
    @stub
    def getUIs(): Array[ComponentUI] = ???

    /** Invokes the indexToLocation method on each UI handled by this object. */
    @stub
    def indexToLocation(a: JList, b: Int): Point = ???

    /** Invokes the installUI method on each UI handled by this object. */
    @stub
    def installUI(a: JComponent): Unit = ???

    /** Invokes the locationToIndex method on each UI handled by this object. */
    @stub
    def locationToIndex(a: JList, b: Point): Int = ???

    /** Invokes the paint method on each UI handled by this object. */
    @stub
    def paint(a: Graphics, b: JComponent): Unit = ???

    /** Invokes the uninstallUI method on each UI handled by this object. */
    @stub
    def uninstallUI(a: JComponent): Unit = ???

    /** Invokes the update method on each UI handled by this object. */
    @stub
    def update(a: Graphics, b: JComponent): Unit = ???
}

object MultiListUI {
    /** Returns a multiplexing UI instance if any of the auxiliary
     *  LookAndFeels supports this UI.
     */
    @stub
    def createUI(a: JComponent): ComponentUI = ???
}
