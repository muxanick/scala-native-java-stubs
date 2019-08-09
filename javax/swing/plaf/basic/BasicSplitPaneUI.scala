package javax.swing.plaf.basic

import java.awt.{Component, Dimension, Graphics, Insets}
import java.awt.event.{ActionListener, FocusListener}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JComponent, JSplitPane, KeyStroke}
import javax.swing.plaf.{ComponentUI, SplitPaneUI}

// A Basic L&F implementation of the SplitPaneUI.
class BasicSplitPaneUI extends SplitPaneUI {

    @stub
    // LayoutManager for JSplitPanes that have an orientation of
    // HORIZONTAL_SPLIT.
    def BasicSplitPaneUI.BasicHorizontalLayoutManager: class = ???

    @stub
    // LayoutManager used for JSplitPanes with an orientation of
    // VERTICAL_SPLIT.
    def BasicSplitPaneUI.BasicVerticalLayoutManager: class = ???

    @stub
    // Implementation of the FocusListener that the JSplitPane UI uses.
    def BasicSplitPaneUI.FocusHandler: class = ???

    @stub
    // Implementation of an ActionListener that the JSplitPane UI uses for
    // handling specific key presses.
    def BasicSplitPaneUI.KeyboardDownRightHandler: class = ???

    @stub
    // Implementation of an ActionListener that the JSplitPane UI uses for
    // handling specific key presses.
    def BasicSplitPaneUI.KeyboardEndHandler: class = ???

    @stub
    // Implementation of an ActionListener that the JSplitPane UI uses for
    // handling specific key presses.
    def BasicSplitPaneUI.KeyboardHomeHandler: class = ???

    @stub
    // Implementation of an ActionListener that the JSplitPane UI uses for
    // handling specific key presses.
    def BasicSplitPaneUI.KeyboardResizeToggleHandler: class = ???

    @stub
    // Implementation of an ActionListener that the JSplitPane UI uses for
    // handling specific key presses.
    def BasicSplitPaneUI.KeyboardUpLeftHandler: class = ???

    @stub
    // Location of the divider when the dragging session began.
    protected def beginDragDividerLocation: Int = ???

    @stub
    // Instance of the divider for this JSplitPane.
    protected def divider: BasicSplitPaneDivider = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def dividerResizeToggleKey: KeyStroke = ???

    @stub
    // The size of the divider while the dragging session is valid.
    protected def dividerSize: Int = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def downKey: KeyStroke = ???

    @stub
    // Set to true in startDragging if any of the children
    // (not including the nonContinuousLayoutDivider) are heavy weights.
    protected def draggingHW: Boolean = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def endKey: KeyStroke = ???

    @stub
    // Instance of the FocusListener for this JSplitPane.
    protected def focusListener: FocusListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def homeKey: KeyStroke = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def keyboardDownRightListener: ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def keyboardEndListener: ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def keyboardHomeListener: ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def keyboardResizeToggleListener: ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def keyboardUpLeftListener: ActionListener = ???

    @stub
    // LayoutManager that is created and placed into the split pane.
    protected def layoutManager: BasicSplitPaneUI.BasicHorizontalLayoutManager = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def leftKey: KeyStroke = ???

    @stub
    // Instance for the shadow of the divider when non continuous layout
    // is being used.
    protected def nonContinuousLayoutDivider: Component = ???

    @stub
    // Instance of the PropertyChangeListener for this JSplitPane.
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def rightKey: KeyStroke = ???

    @stub
    // JSplitPane instance this instance is providing
    // the look and feel for.
    protected def splitPane: JSplitPane = ???

    @stub
    // Creates the default divider.
    def createDefaultDivider(): BasicSplitPaneDivider = ???

    @stub
    // Returns the default non continuous layout divider, which is an
    // instance of Canvas that fills in the background with dark gray.
    protected def createDefaultNonContinuousLayoutDivider(): Component = ???

    @stub
    // Creates a FocusListener for the JSplitPane UI.
    protected def createFocusListener(): FocusListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def createKeyboardDownRightListener(): ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def createKeyboardEndListener(): ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def createKeyboardHomeListener(): ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def createKeyboardResizeToggleListener(): ActionListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def createKeyboardUpLeftListener(): ActionListener = ???

    @stub
    // Creates a PropertyChangeListener for the JSplitPane UI.
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Messaged during a dragging session to move the divider to the
    // passed in location.
    protected def dragDividerTo(location: Int): Unit = ???

    @stub
    // Messaged to finish the dragging session.
    protected def finishDraggingTo(location: Int): Unit = ???

    @stub
    // Called when the specified split pane has finished painting
    // its children.
    def finishedPaintingChildren(sp: JSplitPane, g: Graphics): Unit = ???

    @stub
    // Returns the divider between the top Components.
    def getDivider(): BasicSplitPaneDivider = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3, instead set the border on the
    // divider.
    //
    protected def getDividerBorderSize(): Int = ???

    @stub
    // Returns the location of the divider, which may differ from what
    // the splitpane thinks the location of the divider is.
    def getDividerLocation(jc: JSplitPane): Int = ???

    @stub
    // Returns the insets.
    def getInsets(jc: JComponent): Insets = ???

    @stub
    // Returns the last drag location of the JSplitPane.
    def getLastDragLocation(): Int = ???

    @stub
    // Gets the maximum location of the divider.
    def getMaximumDividerLocation(jc: JSplitPane): Int = ???

    @stub
    // Returns the maximum size for the passed in component,
    // This is passed off to the current layout manager.
    def getMaximumSize(jc: JComponent): Dimension = ???

    @stub
    // Gets the minimum location of the divider.
    def getMinimumDividerLocation(jc: JSplitPane): Int = ???

    @stub
    // Returns the minimum size for the passed in component,
    // This is passed off to the current layout manager.
    def getMinimumSize(jc: JComponent): Dimension = ???

    @stub
    // Returns the divider to use when the splitPane is configured to
    // not continuously layout.
    def getNonContinuousLayoutDivider(): Component = ???

    @stub
    // Returns the orientation for the JSplitPane.
    def getOrientation(): Int = ???

    @stub
    // Returns the preferred size for the passed in component,
    // This is passed off to the current layout manager.
    def getPreferredSize(jc: JComponent): Dimension = ???

    @stub
    // Returns the splitpane this instance is currently contained
    // in.
    def getSplitPane(): JSplitPane = ???

    @stub
    // Installs the UI defaults.
    protected def installDefaults(): Unit = ???

    @stub
    // Installs the keyboard actions for the UI.
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Installs the event listeners for the UI.
    protected def installListeners(): Unit = ???

    @stub
    // Installs the UI.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Determines whether the JSplitPane is set to use a continuous layout.
    def isContinuousLayout(): Boolean = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, jc: JComponent): Unit = ???

    @stub
    // Resets the layout manager based on orientation and messages it
    // with invalidateLayout to pull in appropriate Components.
    protected def resetLayoutManager(): Unit = ???

    @stub
    // Messaged to reset the preferred sizes.
    def resetToPreferredSizes(jc: JSplitPane): Unit = ???

    @stub
    // Turn continuous layout on/off.
    def setContinuousLayout(b: Boolean): Unit = ???

    @stub
    // Sets the location of the divider to location.
    def setDividerLocation(jc: JSplitPane, location: Int): Unit = ???

    @stub
    // Set the last drag location of the JSplitPane.
    def setLastDragLocation(l: Int): Unit = ???

    @stub
    // Sets the divider to use when the splitPane is configured to
    // not continuously layout.
    protected def setNonContinuousLayoutDivider(newDivider: Component): Unit = ???

    @stub
    // Sets the divider to use.
    protected def setNonContinuousLayoutDivider(newDivider: Component, rememberSizes: Boolean): Unit = ???

    @stub
    // Set the orientation for the JSplitPane.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Should be messaged before the dragging session starts, resets
    // lastDragLocation and dividerSize.
    protected def startDragging(): Unit = ???

    @stub
    // Uninstalls the UI defaults.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Uninstalls the keyboard actions for the UI.
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // Uninstalls the event listeners for the UI.
    protected def uninstallListeners(): Unit = ???
}

object BasicSplitPaneUI {
    @stub
    // How far (relative) the divider does move when it is moved around by
    // the cursor keys on the keyboard.
    protected def KEYBOARD_DIVIDER_MOVE_OFFSET: Int = ???

    @stub
    // The divider used for non-continuous layout is added to the split pane
    // with this object.
    protected def NON_CONTINUOUS_DIVIDER: String = ???

    @stub
    // Creates a new BasicSplitPaneUI instance
    def createUI(x: JComponent): ComponentUI = ???
}
