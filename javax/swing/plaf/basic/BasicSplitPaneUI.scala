package javax.swing.plaf.basic

import java.awt.{Component, Dimension, Graphics, Insets}
import java.awt.event.{ActionListener, FocusListener}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JComponent, JSplitPane, KeyStroke}
import javax.swing.plaf.{ComponentUI, SplitPaneUI}

/** A Basic L&F implementation of the SplitPaneUI. */
class BasicSplitPaneUI extends SplitPaneUI {

    /** LayoutManager for JSplitPanes that have an orientation of
     *  HORIZONTAL_SPLIT.
     */
    @stub
    object BasicHorizontalLayoutManager extends BasicSplitPaneUI.BasicHorizontalLayoutManager

    /** LayoutManager used for JSplitPanes with an orientation of
     *  VERTICAL_SPLIT.
     */
    @stub
    object BasicVerticalLayoutManager extends BasicSplitPaneUI.BasicVerticalLayoutManager

    /** Implementation of the FocusListener that the JSplitPane UI uses. */
    @stub
    object FocusHandler extends BasicSplitPaneUI.FocusHandler

    /** Implementation of an ActionListener that the JSplitPane UI uses for
     *  handling specific key presses.
     */
    @stub
    object KeyboardDownRightHandler extends BasicSplitPaneUI.KeyboardDownRightHandler

    /** Implementation of an ActionListener that the JSplitPane UI uses for
     *  handling specific key presses.
     */
    @stub
    object KeyboardEndHandler extends BasicSplitPaneUI.KeyboardEndHandler

    /** Implementation of an ActionListener that the JSplitPane UI uses for
     *  handling specific key presses.
     */
    @stub
    object KeyboardHomeHandler extends BasicSplitPaneUI.KeyboardHomeHandler

    /** Implementation of an ActionListener that the JSplitPane UI uses for
     *  handling specific key presses.
     */
    @stub
    object KeyboardResizeToggleHandler extends BasicSplitPaneUI.KeyboardResizeToggleHandler

    /** Implementation of an ActionListener that the JSplitPane UI uses for
     *  handling specific key presses.
     */
    @stub
    object KeyboardUpLeftHandler extends BasicSplitPaneUI.KeyboardUpLeftHandler

    /** Location of the divider when the dragging session began. */
    @stub
    protected val beginDragDividerLocation: Int = ???

    /** Instance of the divider for this JSplitPane. */
    @stub
    protected val divider: BasicSplitPaneDivider = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val dividerResizeToggleKey: KeyStroke = ???

    /** The size of the divider while the dragging session is valid. */
    @stub
    protected val dividerSize: Int = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val downKey: KeyStroke = ???

    /** Set to true in startDragging if any of the children
     *  (not including the nonContinuousLayoutDivider) are heavy weights.
     */
    @stub
    protected val draggingHW: Boolean = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val endKey: KeyStroke = ???

    /** Instance of the FocusListener for this JSplitPane. */
    @stub
    protected val focusListener: FocusListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val homeKey: KeyStroke = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val keyboardDownRightListener: ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val keyboardEndListener: ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val keyboardHomeListener: ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val keyboardResizeToggleListener: ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val keyboardUpLeftListener: ActionListener = ???

    /** LayoutManager that is created and placed into the split pane. */
    @stub
    protected val layoutManager: BasicSplitPaneUI.BasicHorizontalLayoutManager = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val leftKey: KeyStroke = ???

    /** Instance for the shadow of the divider when non continuous layout
     *  is being used.
     */
    @stub
    protected val nonContinuousLayoutDivider: Component = ???

    /** Instance of the PropertyChangeListener for this JSplitPane. */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val rightKey: KeyStroke = ???

    /** JSplitPane instance this instance is providing
     *  the look and feel for.
     */
    @stub
    protected val splitPane: JSplitPane = ???

    /** Creates the default divider. */
    @stub
    def createDefaultDivider(): BasicSplitPaneDivider = ???

    /** Returns the default non continuous layout divider, which is an
     *  instance of Canvas that fills in the background with dark gray.
     */
    @stub
    protected def createDefaultNonContinuousLayoutDivider(): Component = ???

    /** Creates a FocusListener for the JSplitPane UI. */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected def createKeyboardDownRightListener(): ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected def createKeyboardEndListener(): ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected def createKeyboardHomeListener(): ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected def createKeyboardResizeToggleListener(): ActionListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected def createKeyboardUpLeftListener(): ActionListener = ???

    /** Creates a PropertyChangeListener for the JSplitPane UI. */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Messaged during a dragging session to move the divider to the
     *  passed in location.
     */
    @stub
    protected def dragDividerTo(location: Int): Unit = ???

    /** Messaged to finish the dragging session. */
    @stub
    protected def finishDraggingTo(location: Int): Unit = ???

    /** Called when the specified split pane has finished painting
     *  its children.
     */
    @stub
    def finishedPaintingChildren(sp: JSplitPane, g: Graphics): Unit = ???

    /** Returns the divider between the top Components. */
    @stub
    def getDivider(): BasicSplitPaneDivider = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3, instead set the border on the
     *  divider.
     * 
     */
    @stub
    protected def getDividerBorderSize(): Int = ???

    /** Returns the location of the divider, which may differ from what
     *  the splitpane thinks the location of the divider is.
     */
    @stub
    def getDividerLocation(jc: JSplitPane): Int = ???

    /** Returns the insets. */
    @stub
    def getInsets(jc: JComponent): Insets = ???

    /** Returns the last drag location of the JSplitPane. */
    @stub
    def getLastDragLocation(): Int = ???

    /** Gets the maximum location of the divider. */
    @stub
    def getMaximumDividerLocation(jc: JSplitPane): Int = ???

    /** Returns the maximum size for the passed in component,
     *  This is passed off to the current layout manager.
     */
    @stub
    def getMaximumSize(jc: JComponent): Dimension = ???

    /** Gets the minimum location of the divider. */
    @stub
    def getMinimumDividerLocation(jc: JSplitPane): Int = ???

    /** Returns the minimum size for the passed in component,
     *  This is passed off to the current layout manager.
     */
    @stub
    def getMinimumSize(jc: JComponent): Dimension = ???

    /** Returns the divider to use when the splitPane is configured to
     *  not continuously layout.
     */
    @stub
    def getNonContinuousLayoutDivider(): Component = ???

    /** Returns the orientation for the JSplitPane. */
    @stub
    def getOrientation(): Int = ???

    /** Returns the preferred size for the passed in component,
     *  This is passed off to the current layout manager.
     */
    @stub
    def getPreferredSize(jc: JComponent): Dimension = ???

    /** Returns the splitpane this instance is currently contained
     *  in.
     */
    @stub
    def getSplitPane(): JSplitPane = ???

    /** Installs the UI defaults. */
    @stub
    protected def installDefaults(): Unit = ???

    /** Installs the keyboard actions for the UI. */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Installs the event listeners for the UI. */
    @stub
    protected def installListeners(): Unit = ???

    /** Installs the UI. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Determines whether the JSplitPane is set to use a continuous layout. */
    @stub
    def isContinuousLayout(): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, jc: JComponent): Unit = ???

    /** Resets the layout manager based on orientation and messages it
     *  with invalidateLayout to pull in appropriate Components.
     */
    @stub
    protected def resetLayoutManager(): Unit = ???

    /** Messaged to reset the preferred sizes. */
    @stub
    def resetToPreferredSizes(jc: JSplitPane): Unit = ???

    /** Turn continuous layout on/off. */
    @stub
    def setContinuousLayout(b: Boolean): Unit = ???

    /** Sets the location of the divider to location. */
    @stub
    def setDividerLocation(jc: JSplitPane, location: Int): Unit = ???

    /** Set the last drag location of the JSplitPane. */
    @stub
    def setLastDragLocation(l: Int): Unit = ???

    /** Sets the divider to use when the splitPane is configured to
     *  not continuously layout.
     */
    @stub
    protected def setNonContinuousLayoutDivider(newDivider: Component): Unit = ???

    /** Sets the divider to use. */
    @stub
    protected def setNonContinuousLayoutDivider(newDivider: Component, rememberSizes: Boolean): Unit = ???

    /** Set the orientation for the JSplitPane. */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Should be messaged before the dragging session starts, resets
     *  lastDragLocation and dividerSize.
     */
    @stub
    protected def startDragging(): Unit = ???

    /** Uninstalls the UI defaults. */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Uninstalls the keyboard actions for the UI. */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /** Uninstalls the event listeners for the UI. */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object BasicSplitPaneUI {
    /** How far (relative) the divider does move when it is moved around by
     *  the cursor keys on the keyboard.
     */
    @stub
    protected val KEYBOARD_DIVIDER_MOVE_OFFSET: Int = ???

    /** The divider used for non-continuous layout is added to the split pane
     *  with this object.
     */
    @stub
    protected val NON_CONTINUOUS_DIVIDER: String = ???

    /** Creates a new BasicSplitPaneUI instance */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
