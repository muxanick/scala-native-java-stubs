package javax.swing.plaf.multi

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.accessibility.Accessible
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TableHeaderUI}

// A multiplexing UI used to combine TableHeaderUIs.
//
// This file was automatically generated by AutoMulti.
class MultiTableHeaderUI extends TableHeaderUI {

    @stub
    // Invokes the contains method on each UI handled by this object.
    def contains(a: JComponent, b: Int, c: Int): Boolean = ???

    @stub
    // Invokes the getAccessibleChild method on each UI handled by this object.
    def getAccessibleChild(a: JComponent, b: Int): Accessible = ???

    @stub
    // Invokes the getAccessibleChildrenCount method on each UI handled by this object.
    def getAccessibleChildrenCount(a: JComponent): Int = ???

    @stub
    // Invokes the getMaximumSize method on each UI handled by this object.
    def getMaximumSize(a: JComponent): Dimension = ???

    @stub
    // Invokes the getMinimumSize method on each UI handled by this object.
    def getMinimumSize(a: JComponent): Dimension = ???

    @stub
    // Invokes the getPreferredSize method on each UI handled by this object.
    def getPreferredSize(a: JComponent): Dimension = ???

    @stub
    // Returns the list of UIs associated with this multiplexing UI.
    def getUIs(): Array[ComponentUI] = ???

    @stub
    // Invokes the installUI method on each UI handled by this object.
    def installUI(a: JComponent): Unit = ???

    @stub
    // Invokes the paint method on each UI handled by this object.
    def paint(a: Graphics, b: JComponent): Unit = ???

    @stub
    // Invokes the uninstallUI method on each UI handled by this object.
    def uninstallUI(a: JComponent): Unit = ???
}

object MultiTableHeaderUI {
    @stub
    // Returns a multiplexing UI instance if any of the auxiliary
    // LookAndFeels supports this UI.
    def createUI(a: JComponent): ComponentUI = ???
}
