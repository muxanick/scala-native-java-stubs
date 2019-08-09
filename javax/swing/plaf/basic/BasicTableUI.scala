package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.awt.event.{FocusListener, KeyListener}
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent, JTable}
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, TableUI}
import scala.scalanative.annotation.stub

/** BasicTableUI implementation */
class BasicTableUI extends TableUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    @stub
    object FocusHandler extends BasicTableUI.FocusHandler

    /** This class should be treated as a "protected" inner class. */
    @stub
    object KeyHandler extends BasicTableUI.KeyHandler

    /** This class should be treated as a "protected" inner class. */
    @stub
    object MouseInputHandler extends BasicTableUI.MouseInputHandler

    /**  */
    @stub
    protected val focusListener: FocusListener = ???

    /**  */
    @stub
    protected val keyListener: KeyListener = ???

    /**  */
    @stub
    protected val mouseInputListener: MouseInputListener = ???

    /**  */
    @stub
    protected val rendererPane: CellRendererPane = ???

    /**  */
    @stub
    protected val table: JTable = ???

    /** Creates the focus listener for handling keyboard navigation in the JTable. */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Creates the key listener for handling keyboard navigation in the JTable. */
    @stub
    protected def createKeyListener(): KeyListener = ???

    /** Creates the mouse listener for the JTable. */
    @stub
    protected def createMouseInputListener(): MouseInputListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Return the maximum size of the table. */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Return the minimum size of the table. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Return the preferred size of the table. */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Initialize JTable properties, e.g. */
    @stub
    protected def installDefaults(): Unit = ???

    /** Register all keyboard actions on the JTable. */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Attaches listeners to the JTable. */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paint a representation of the table instance
     *  that was set in installUI().
     */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
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

object BasicTableUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
