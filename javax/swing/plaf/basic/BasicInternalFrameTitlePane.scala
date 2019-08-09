package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, FontMetrics, Graphics, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Action, Icon, JButton, JComponent, JInternalFrame, JMenu, JMenuBar}

/** The class that manages a basic title bar
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class BasicInternalFrameTitlePane extends JComponent {

    /** This class should be treated as a "protected" inner class. */
    @stub
    object CloseAction extends BasicInternalFrameTitlePane.CloseAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object IconifyAction extends BasicInternalFrameTitlePane.IconifyAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object MaximizeAction extends BasicInternalFrameTitlePane.MaximizeAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object MoveAction extends BasicInternalFrameTitlePane.MoveAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object PropertyChangeHandler extends BasicInternalFrameTitlePane.PropertyChangeHandler

    /** This class should be treated as a "protected" inner class. */
    @stub
    object RestoreAction extends BasicInternalFrameTitlePane.RestoreAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object SizeAction extends BasicInternalFrameTitlePane.SizeAction

    /** This class should be treated as a "protected" inner class. */
    @stub
    object SystemMenuBar extends BasicInternalFrameTitlePane.SystemMenuBar

    /**  */
    @stub
    protected val closeAction: Action = ???

    /**  */
    @stub
    protected val closeButton: JButton = ???

    /**  */
    @stub
    protected val closeIcon: Icon = ???

    /**  */
    @stub
    protected val frame: JInternalFrame = ???

    /**  */
    @stub
    protected val iconButton: JButton = ???

    /**  */
    @stub
    protected val iconIcon: Icon = ???

    /**  */
    @stub
    protected val iconifyAction: Action = ???

    /**  */
    @stub
    protected val maxButton: JButton = ???

    /**  */
    @stub
    protected val maxIcon: Icon = ???

    /**  */
    @stub
    protected val maximizeAction: Action = ???

    /**  */
    @stub
    protected val menuBar: JMenuBar = ???

    /**  */
    @stub
    protected val minIcon: Icon = ???

    /**  */
    @stub
    protected val moveAction: Action = ???

    /**  */
    @stub
    protected val notSelectedTextColor: Color = ???

    /**  */
    @stub
    protected val notSelectedTitleColor: Color = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val restoreAction: Action = ???

    /**  */
    @stub
    protected val selectedTextColor: Color = ???

    /**  */
    @stub
    protected val selectedTitleColor: Color = ???

    /**  */
    @stub
    protected val sizeAction: Action = ???

    /**  */
    @stub
    protected def addSubComponents(): Unit = ???

    /**  */
    @stub
    protected def addSystemMenuItems(systemMenu: JMenu): Unit = ???

    /**  */
    @stub
    protected def assembleSystemMenu(): Unit = ???

    /**  */
    @stub
    protected def createActions(): Unit = ???

    /**  */
    @stub
    protected def createButtons(): Unit = ???

    /**  */
    @stub
    protected def createLayout(): LayoutManager = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createSystemMenu(): JMenu = ???

    /**  */
    @stub
    protected def createSystemMenuBar(): JMenuBar = ???

    /**  */
    @stub
    protected def enableActions(): Unit = ???

    /**  */
    @stub
    protected def getTitle(text: String, fm: FontMetrics, availTextWidth: Int): String = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /**  */
    @stub
    protected def installTitlePane(): Unit = ???

    /** Calls the UI delegate's paint method, if the UI delegate
     *  is non-null.
     */
    @stub
    def paintComponent(g: Graphics): Unit = ???

    /** Invoked from paintComponent. */
    @stub
    protected def paintTitleBackground(g: Graphics): Unit = ???

    /** Post a WINDOW_CLOSING-like event to the frame, so that it can
     *  be treated like a regular Frame.
     */
    @stub
    protected def postClosingEvent(frame: JInternalFrame): Unit = ???

    /**  */
    @stub
    protected def setButtonIcons(): Unit = ???

    /**  */
    @stub
    protected def showSystemMenu(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???
}

object BasicInternalFrameTitlePane {
    /**  */
    @stub
    protected val CLOSE_CMD: String = ???

    /**  */
    @stub
    protected val ICONIFY_CMD: String = ???

    /**  */
    @stub
    protected val MAXIMIZE_CMD: String = ???

    /**  */
    @stub
    protected val MOVE_CMD: String = ???

    /**  */
    @stub
    protected val RESTORE_CMD: String = ???

    /**  */
    @stub
    protected val SIZE_CMD: String = ???
}
