package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{DesktopManager, JComponent, JDesktopPane, KeyStroke}
import javax.swing.plaf.{ComponentUI, DesktopPaneUI}

// Basic L&F for a desktop.
class BasicDesktopPaneUI extends DesktopPaneUI {

    @stub
    // Handles closing an internal frame.
    protected def BasicDesktopPaneUI.CloseAction: class = ???

    @stub
    // Handles maximizing an internal frame.
    protected def BasicDesktopPaneUI.MaximizeAction: class = ???

    @stub
    // Handles minimizing an internal frame.
    protected def BasicDesktopPaneUI.MinimizeAction: class = ???

    @stub
    // Handles navigating to the next internal frame.
    protected def BasicDesktopPaneUI.NavigateAction: class = ???

    @stub
    // Deprecated. 
    //As of 1.3.
    //
    protected def closeKey: KeyStroke = ???

    @stub
    // 
    protected def desktop: JDesktopPane = ???

    @stub
    // 
    protected def desktopManager: DesktopManager = ???

    @stub
    // Deprecated. 
    //As of 1.3.
    //
    protected def maximizeKey: KeyStroke = ???

    @stub
    // Deprecated. 
    //As of 1.3.
    //
    protected def minimizeKey: KeyStroke = ???

    @stub
    // Deprecated. 
    //As of 1.3.
    //
    protected def navigateKey: KeyStroke = ???

    @stub
    // Returns the PropertyChangeListener to install on
    // the JDesktopPane.
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installDesktopManager(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Installs the PropertyChangeListener returned from
    // createPropertyChangeListener on the
    // JDesktopPane.
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def registerKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallDesktopManager(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // Uninstalls the PropertyChangeListener returned from
    // createPropertyChangeListener from the
    // JDesktopPane.
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicDesktopPaneUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
