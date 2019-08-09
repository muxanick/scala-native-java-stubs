package javax.swing.plaf.multi

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.accessibility.Accessible
import javax.swing.{JComboBox, JComponent}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}

/** A multiplexing UI used to combine ComboBoxUIs.
 * 
 *  This file was automatically generated by AutoMulti.
 */
class MultiComboBoxUI extends ComboBoxUI {

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

    /** Invokes the isFocusTraversable method on each UI handled by this object. */
    @stub
    def isFocusTraversable(a: JComboBox): Boolean = ???

    /** Invokes the isPopupVisible method on each UI handled by this object. */
    @stub
    def isPopupVisible(a: JComboBox): Boolean = ???

    /** Invokes the paint method on each UI handled by this object. */
    @stub
    def paint(a: Graphics, b: JComponent): Unit = ???

    /** Invokes the setPopupVisible method on each UI handled by this object. */
    @stub
    def setPopupVisible(a: JComboBox, b: Boolean): Unit = ???

    /** Invokes the uninstallUI method on each UI handled by this object. */
    @stub
    def uninstallUI(a: JComponent): Unit = ???
}

object MultiComboBoxUI {
    /** Returns a multiplexing UI instance if any of the auxiliary
     *  LookAndFeels supports this UI.
     */
    @stub
    def createUI(a: JComponent): ComponentUI = ???
}
