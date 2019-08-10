package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent}
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, TableHeaderUI}
import javax.swing.table.JTableHeader
import scala.scalanative.annotation.stub

/** BasicTableHeaderUI implementation */
class BasicTableHeaderUI extends TableHeaderUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    type MouseInputHandler = BasicTableHeaderUI_MouseInputHandler

    /** The JTableHeader that is delegating the painting to this UI. */
    @stub
    protected val header: JTableHeader = ???

    /**  */
    @stub
    protected val mouseInputListener: MouseInputListener = ???

    /**  */
    @stub
    protected val rendererPane: CellRendererPane = ???

    /** Creates the mouse listener for the JTableHeader. */
    @stub
    protected def createMouseInputListener(): MouseInputListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Return the maximum size of the header. */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Return the minimum size of the header. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Return the preferred size of the header. */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Returns the index of the column header over which the mouse
     *  currently is.
     */
    @stub
    protected def getRolloverColumn(): Int = ???

    /** Initializes JTableHeader properties such as font, foreground, and background. */
    @stub
    protected def installDefaults(): Unit = ???

    /** Register all keyboard actions on the JTableHeader. */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Attaches listeners to the JTableHeader. */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** This method gets called every time when a rollover column in the table
     *  header is updated.
     */
    @stub
    protected def rolloverColumnUpdated(oldColumn: Int, newColumn: Int): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Unregisters default key actions. */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicTableHeaderUI {
    /**  */
    @stub
    def createUI(h: JComponent): ComponentUI = ???
}
