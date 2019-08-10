package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, Dimension, FontMetrics, Graphics, LayoutManager}
import java.awt.event.ActionEvent
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{AbstractAction, Action, Icon, JButton, JComponent, JInternalFrame, JMenu, JMenuBar}
import scala.scalanative.annotation.stub

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

    /**  */
    @stub
    def this(f: JInternalFrame) = ???

    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class CloseAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class IconifyAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class MaximizeAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class MoveAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(evt: PropertyChangeEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class RestoreAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(evt: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class SizeAction extends AbstractAction {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class SystemMenuBar extends JMenuBar {

        /**  */
        @stub
        def this() = ???

        /** Returns whether this Component can become the focus
         *  owner.
         */
        @stub
        def isFocusTraversable(): Boolean = ???

        /** Returns true if this component is completely opaque. */
        @stub
        def isOpaque(): Boolean = ???

        /** Invoked by Swing to draw components. */
        @stub
        def paint(g: Graphics): Unit = ???

        /** Requests that this Component gets the input focus. */
        @stub
        def requestFocus(): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class TitlePaneLayout extends Object with LayoutManager {

        /**  */
        @stub
        def this() = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(name: String, c: Component): Unit = ???

        /** Lays out the specified container. */
        @stub
        def layoutContainer(c: Container): Unit = ???

        /** Calculates the minimum size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def minimumLayoutSize(c: Container): Dimension = ???

        /** Calculates the preferred size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def preferredLayoutSize(c: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(c: Component): Unit = ???
    }


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
    protected val windowMenu: JMenu = ???

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

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
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
