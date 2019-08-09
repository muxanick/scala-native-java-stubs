package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, TableHeaderUI}
import javax.swing.table.JTableHeader

// BasicTableHeaderUI implementation
class BasicTableHeaderUI extends TableHeaderUI {

    @stub
    // The JTableHeader that is delegating the painting to this UI.
    protected def header: JTableHeader = ???

    @stub
    // 
    protected def mouseInputListener: MouseInputListener = ???

    @stub
    // Creates the mouse listener for the JTableHeader.
    protected def createMouseInputListener(): MouseInputListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Return the maximum size of the header.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Return the minimum size of the header.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Return the preferred size of the header.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Returns the index of the column header over which the mouse
    // currently is.
    protected def getRolloverColumn(): Int = ???

    @stub
    // Initializes JTableHeader properties such as font, foreground, and background.
    protected def installDefaults(): Unit = ???

    @stub
    // Register all keyboard actions on the JTableHeader.
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Attaches listeners to the JTableHeader.
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // This method gets called every time when a rollover column in the table
    // header is updated.
    protected def rolloverColumnUpdated(oldColumn: Int, newColumn: Int): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Unregisters default key actions.
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicTableHeaderUI {
    @stub
    // 
    def createUI(h: JComponent): ComponentUI = ???
}
