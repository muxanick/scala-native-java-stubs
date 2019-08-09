package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.awt.event.{FocusListener, KeyListener}
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent}
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, TableUI}

// BasicTableUI implementation
class BasicTableUI extends TableUI {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTableUI.FocusHandler: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTableUI.KeyHandler: class = ???

    @stub
    // 
    protected def focusListener: FocusListener = ???

    @stub
    // 
    protected def keyListener: KeyListener = ???

    @stub
    // 
    protected def mouseInputListener: MouseInputListener = ???

    @stub
    // 
    protected def rendererPane: CellRendererPane = ???

    @stub
    // Creates the focus listener for handling keyboard navigation in the JTable.
    protected def createFocusListener(): FocusListener = ???

    @stub
    // Creates the key listener for handling keyboard navigation in the JTable.
    protected def createKeyListener(): KeyListener = ???

    @stub
    // Creates the mouse listener for the JTable.
    protected def createMouseInputListener(): MouseInputListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Return the maximum size of the table.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Return the minimum size of the table.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Return the preferred size of the table.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Initialize JTable properties, e.g.
    protected def installDefaults(): Unit = ???

    @stub
    // Register all keyboard actions on the JTable.
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Attaches listeners to the JTable.
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paint a representation of the table instance
    // that was set in installUI().
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicTableUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
