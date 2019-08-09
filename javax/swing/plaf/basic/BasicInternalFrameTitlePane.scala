package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, FontMetrics, Graphics, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Action, Icon, JButton, JComponent, JInternalFrame, JMenu, JMenuBar}

// The class that manages a basic title bar
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicInternalFrameTitlePane extends JComponent {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.CloseAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.IconifyAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.MaximizeAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.MoveAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.PropertyChangeHandler: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.RestoreAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.SizeAction: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicInternalFrameTitlePane.SystemMenuBar: class = ???

    @stub
    // 
    protected def closeAction: Action = ???

    @stub
    // 
    protected def closeButton: JButton = ???

    @stub
    // 
    protected def closeIcon: Icon = ???

    @stub
    // 
    protected def frame: JInternalFrame = ???

    @stub
    // 
    protected def iconButton: JButton = ???

    @stub
    // 
    protected def iconIcon: Icon = ???

    @stub
    // 
    protected def iconifyAction: Action = ???

    @stub
    // 
    protected def maxButton: JButton = ???

    @stub
    // 
    protected def maxIcon: Icon = ???

    @stub
    // 
    protected def maximizeAction: Action = ???

    @stub
    // 
    protected def menuBar: JMenuBar = ???

    @stub
    // 
    protected def minIcon: Icon = ???

    @stub
    // 
    protected def moveAction: Action = ???

    @stub
    // 
    protected def notSelectedTextColor: Color = ???

    @stub
    // 
    protected def notSelectedTitleColor: Color = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def restoreAction: Action = ???

    @stub
    // 
    protected def selectedTextColor: Color = ???

    @stub
    // 
    protected def selectedTitleColor: Color = ???

    @stub
    // 
    protected def sizeAction: Action = ???

    @stub
    // 
    protected def addSubComponents(): Unit = ???

    @stub
    // 
    protected def addSystemMenuItems(systemMenu: JMenu): Unit = ???

    @stub
    // 
    protected def assembleSystemMenu(): Unit = ???

    @stub
    // 
    protected def createActions(): Unit = ???

    @stub
    // 
    protected def createButtons(): Unit = ???

    @stub
    // 
    protected def createLayout(): LayoutManager = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def createSystemMenu(): JMenu = ???

    @stub
    // 
    protected def createSystemMenuBar(): JMenuBar = ???

    @stub
    // 
    protected def enableActions(): Unit = ???

    @stub
    // 
    protected def getTitle(text: String, fm: FontMetrics, availTextWidth: Int): String = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // 
    protected def installTitlePane(): Unit = ???

    @stub
    // Calls the UI delegate's paint method, if the UI delegate
    // is non-null.
    def paintComponent(g: Graphics): Unit = ???

    @stub
    // Invoked from paintComponent.
    protected def paintTitleBackground(g: Graphics): Unit = ???

    @stub
    // Post a WINDOW_CLOSING-like event to the frame, so that it can
    // be treated like a regular Frame.
    protected def postClosingEvent(frame: JInternalFrame): Unit = ???

    @stub
    // 
    protected def setButtonIcons(): Unit = ???

    @stub
    // 
    protected def showSystemMenu(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???
}

object BasicInternalFrameTitlePane {
    @stub
    // 
    protected def CLOSE_CMD: String = ???

    @stub
    // 
    protected def ICONIFY_CMD: String = ???

    @stub
    // 
    protected def MAXIMIZE_CMD: String = ???

    @stub
    // 
    protected def MOVE_CMD: String = ???

    @stub
    // 
    protected def RESTORE_CMD: String = ???

    @stub
    // 
    protected def SIZE_CMD: String = ???
}
