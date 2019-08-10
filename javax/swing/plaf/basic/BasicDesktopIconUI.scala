package javax.swing.plaf.basic

import java.awt.{Dimension, Insets}
import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.{JComponent, JInternalFrame, JInternalFrame.JDesktopIcon}
import javax.swing.event.{MouseInputAdapter, MouseInputListener}
import javax.swing.plaf.{ComponentUI, DesktopIconUI}
import scala.scalanative.annotation.stub

/** Basic L&F for a minimized window on a desktop. */
class BasicDesktopIconUI extends DesktopIconUI {

    /**  */
    @stub
    def this() = ???

    /** Listens for mouse movements and acts on them.
     * 
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicDesktopIconUI.
     */
    class MouseInputHandler extends MouseInputAdapter {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

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

        /**  */
        @stub
        def moveAndRepaint(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???
    }


    /**  */
    @stub
    protected val desktopIcon: JInternalFrame.JDesktopIcon = ???

    /**  */
    @stub
    protected val frame: JInternalFrame = ???

    /** The title pane component used in the desktop icon. */
    @stub
    protected val iconPane: JComponent = ???

    /**  */
    @stub
    protected def createMouseInputListener(): MouseInputListener = ???

    /**  */
    @stub
    def deiconize(): Unit = ???

    /**  */
    @stub
    def getInsets(c: JComponent): Insets = ???

    /** Desktop icons can not be resized. */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicDesktopIconUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
