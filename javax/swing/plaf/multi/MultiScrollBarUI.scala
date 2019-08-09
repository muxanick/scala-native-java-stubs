package javax.swing.plaf.multi

import java.awt.{Dimension, Graphics}
import java.lang.Object
import java.util.Vector
import javax.accessibility.Accessible
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ScrollBarUI}
import scala.scalanative.annotation.stub

/** A multiplexing UI used to combine ScrollBarUIs.
 * 
 *  This file was automatically generated by AutoMulti.
 */
class MultiScrollBarUI extends ScrollBarUI {

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

    /** Invokes the installUI method on each UI handled by this object. */
    @stub
    def installUI(a: JComponent): Unit = ???

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

object MultiScrollBarUI {
    /** Returns a multiplexing UI instance if any of the auxiliary
     *  LookAndFeels supports this UI.
     */
    @stub
    def createUI(a: JComponent): ComponentUI = ???
}
