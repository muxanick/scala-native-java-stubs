package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.awt.event.ActionEvent
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{AbstractAction, DesktopManager, JComponent, JDesktopPane, KeyStroke}
import javax.swing.plaf.{ComponentUI, DesktopPaneUI}
import scala.scalanative.annotation.stub

/** Basic L&F for a desktop. */
class BasicDesktopPaneUI extends DesktopPaneUI {

    /**  */
    @stub
    def this() = ???

    /** Handles closing an internal frame. */
    protected class CloseAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Handles maximizing an internal frame. */
    protected class MaximizeAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Handles minimizing an internal frame. */
    protected class MinimizeAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Handles navigating to the next internal frame. */
    protected class NavigateAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Handles restoring a minimized or maximized internal frame. */
    protected class OpenAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Deprecated. 
     * As of 1.3.
     * 
     */
    @stub
    protected val closeKey: KeyStroke = ???

    /**  */
    @stub
    protected val desktop: JDesktopPane = ???

    /**  */
    @stub
    protected val desktopManager: DesktopManager = ???

    /** Deprecated. 
     * As of 1.3.
     * 
     */
    @stub
    protected val maximizeKey: KeyStroke = ???

    /** Deprecated. 
     * As of 1.3.
     * 
     */
    @stub
    protected val minimizeKey: KeyStroke = ???

    /** Deprecated. 
     * As of 1.3.
     * 
     */
    @stub
    protected val navigateKey: KeyStroke = ???

    /** Deprecated. 
     * As of 1.3.
     * 
     */
    @stub
    protected val navigateKey2: KeyStroke = ???

    /** Returns the PropertyChangeListener to install on
     *  the JDesktopPane.
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
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
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installDesktopManager(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Installs the PropertyChangeListener returned from
     *  createPropertyChangeListener on the
     *  JDesktopPane.
     */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def registerKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallDesktopManager(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /** Uninstalls the PropertyChangeListener returned from
     *  createPropertyChangeListener from the
     *  JDesktopPane.
     */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def unregisterKeyboardActions(): Unit = ???
}

object BasicDesktopPaneUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
