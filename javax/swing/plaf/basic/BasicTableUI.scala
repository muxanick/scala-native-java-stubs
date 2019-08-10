package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.awt.event.{FocusEvent, FocusListener, KeyEvent, KeyListener, MouseEvent}
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

    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicTableUI.
     */
    class FocusHandler extends Object with FocusListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a component gains the keyboard focus. */
        @stub
        def focusGained(e: FocusEvent): Unit = ???

        /** Invoked when a component loses the keyboard focus. */
        @stub
        def focusLost(e: FocusEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicTableUI.
     *  As of Java 2 platform v1.3 this class is no longer used.
     *  Instead JTable
     *  overrides processKeyBinding to dispatch the event to
     *  the current TableCellEditor.
     */
    class KeyHandler extends Object with KeyListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a key has been pressed. */
        @stub
        def keyPressed(e: KeyEvent): Unit = ???

        /** Invoked when a key has been released. */
        @stub
        def keyReleased(e: KeyEvent): Unit = ???

        /** Invoked when a key has been typed. */
        @stub
        def keyTyped(e: KeyEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicTableUI.
     */
    class MouseInputHandler extends Object with MouseInputListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse enters a component. */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits a component. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


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
