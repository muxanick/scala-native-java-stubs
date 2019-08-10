package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Font, FontMetrics, Graphics, Insets, LayoutManager, Rectangle}
import java.awt.event.{FocusListener, MouseListener}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JButton, JComponent, JTabbedPane, KeyStroke, SwingConstants}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, TabbedPaneUI}
import javax.swing.text.View
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of TabbedPaneUI. */
class BasicTabbedPaneUI extends TabbedPaneUI with SwingConstants {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    type FocusHandler = BasicTabbedPaneUI_FocusHandler

    /** This class should be treated as a "protected" inner class. */
    type MouseHandler = BasicTabbedPaneUI_MouseHandler

    /** This class should be treated as a "protected" inner class. */
    type PropertyChangeHandler = BasicTabbedPaneUI_PropertyChangeHandler

    /** This class should be treated as a "protected" inner class. */
    type TabbedPaneLayout = BasicTabbedPaneUI_TabbedPaneLayout

    /** This class should be treated as a "protected" inner class. */
    type TabSelectionHandler = BasicTabbedPaneUI_TabSelectionHandler

    /** A rectangle used for general layout calculations in order
     *  to avoid constructing many new Rectangles on the fly.
     */
    @stub
    protected val calcRect: Rectangle = ???

    /**  */
    @stub
    protected val contentBorderInsets: Insets = ???

    /**  */
    @stub
    protected val darkShadow: Color = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val downKey: KeyStroke = ???

    /**  */
    @stub
    protected val focus: Color = ???

    /**  */
    @stub
    protected val focusListener: FocusListener = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val leftKey: KeyStroke = ???

    /**  */
    @stub
    protected val lightHighlight: Color = ???

    /**  */
    @stub
    protected val maxTabHeight: Int = ???

    /**  */
    @stub
    protected val maxTabWidth: Int = ???

    /**  */
    @stub
    protected val mouseListener: MouseListener = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val rects: Array[Rectangle] = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val rightKey: KeyStroke = ???

    /**  */
    @stub
    protected val runCount: Int = ???

    /**  */
    @stub
    protected val selectedRun: Int = ???

    /**  */
    @stub
    protected val selectedTabPadInsets: Insets = ???

    /**  */
    @stub
    protected val shadow: Color = ???

    /**  */
    @stub
    protected val tabAreaInsets: Insets = ???

    /**  */
    @stub
    protected val tabChangeListener: ChangeListener = ???

    /**  */
    @stub
    protected val tabInsets: Insets = ???

    /**  */
    @stub
    protected val tabPane: JTabbedPane = ???

    /**  */
    @stub
    protected val tabRunOverlay: Int = ???

    /**  */
    @stub
    protected val tabRuns: Array[Int] = ???

    /**  */
    @stub
    protected val textIconGap: Int = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val upKey: KeyStroke = ???

    /**  */
    @stub
    protected def assureRectsCreated(tabCount: Int): Unit = ???

    /**  */
    @stub
    protected def calculateMaxTabHeight(tabPlacement: Int): Int = ???

    /**  */
    @stub
    protected def calculateMaxTabWidth(tabPlacement: Int): Int = ???

    /**  */
    @stub
    protected def calculateTabAreaHeight(tabPlacement: Int, horizRunCount: Int, maxTabHeight: Int): Int = ???

    /**  */
    @stub
    protected def calculateTabAreaWidth(tabPlacement: Int, vertRunCount: Int, maxTabWidth: Int): Int = ???

    /**  */
    @stub
    protected def calculateTabHeight(tabPlacement: Int, tabIndex: Int, fontHeight: Int): Int = ???

    /**  */
    @stub
    protected def calculateTabWidth(tabPlacement: Int, tabIndex: Int, metrics: FontMetrics): Int = ???

    /**  */
    @stub
    protected def createChangeListener(): ChangeListener = ???

    /**  */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Invoked by installUI to create
     *  a layout manager object to manage
     *  the JTabbedPane.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /**  */
    @stub
    protected def createMouseListener(): MouseListener = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Creates and returns a JButton that will provide the user
     *  with a way to scroll the tabs in a particular direction.
     */
    @stub
    protected def createScrollButton(direction: Int): JButton = ???

    /**  */
    @stub
    protected def expandTabRunsArray(): Unit = ???

    /** Returns the baseline for the specified tab. */
    @stub
    protected def getBaseline(tab: Int): Int = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns the amount the baseline is offset by. */
    @stub
    protected def getBaselineOffset(): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /**  */
    @stub
    protected def getContentBorderInsets(tabPlacement: Int): Insets = ???

    /** Returns the index of the tab that has focus. */
    @stub
    protected def getFocusIndex(): Int = ???

    /**  */
    @stub
    protected def getFontMetrics(): FontMetrics = ???

    /**  */
    @stub
    protected def getIconForTab(tabIndex: Int): Icon = ???

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

    /**  */
    @stub
    protected def getNextTabIndex(base: Int): Int = ???

    /**  */
    @stub
    protected def getNextTabIndexInRun(tabCount: Int, base: Int): Int = ???

    /**  */
    @stub
    protected def getNextTabRun(baseRun: Int): Int = ???

    /**  */
    @stub
    protected def getPreviousTabIndex(base: Int): Int = ???

    /**  */
    @stub
    protected def getPreviousTabIndexInRun(tabCount: Int, base: Int): Int = ???

    /**  */
    @stub
    protected def getPreviousTabRun(baseRun: Int): Int = ???

    /** Returns the tab the mouse is currently over, or -1 if the mouse is no
     *  longer over any tab.
     */
    @stub
    protected def getRolloverTab(): Int = ???

    /**  */
    @stub
    protected def getRunForTab(tabCount: Int, tabIndex: Int): Int = ???

    /**  */
    @stub
    protected def getSelectedTabPadInsets(tabPlacement: Int): Insets = ???

    /**  */
    @stub
    protected def getTabAreaInsets(tabPlacement: Int): Insets = ???

    /** Returns the bounds of the specified tab in the coordinate space
     *  of the JTabbedPane component.
     */
    @stub
    protected def getTabBounds(tabIndex: Int, dest: Rectangle): Rectangle = ???

    /** Returns the bounds of the specified tab index. */
    @stub
    def getTabBounds(pane: JTabbedPane, i: Int): Rectangle = ???

    /**  */
    @stub
    protected def getTabInsets(tabPlacement: Int, tabIndex: Int): Insets = ???

    /**  */
    @stub
    protected def getTabLabelShiftX(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    /**  */
    @stub
    protected def getTabLabelShiftY(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    /**  */
    @stub
    def getTabRunCount(pane: JTabbedPane): Int = ???

    /**  */
    @stub
    protected def getTabRunIndent(tabPlacement: Int, run: Int): Int = ???

    /**  */
    @stub
    protected def getTabRunOffset(tabPlacement: Int, tabCount: Int, tabIndex: Int, forward: Boolean): Int = ???

    /**  */
    @stub
    protected def getTabRunOverlay(tabPlacement: Int): Int = ???

    /** Returns the text View object required to render stylized text (HTML) for
     *  the specified tab or null if no specialized text rendering is needed
     *  for this tab.
     */
    @stub
    protected def getTextViewForTab(tabIndex: Int): View = ???

    /**  */
    @stub
    protected def getVisibleComponent(): Component = ???

    /** Creates and installs any required subcomponents for the JTabbedPane. */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def lastTabInRun(tabCount: Int, run: Int): Int = ???

    /**  */
    @stub
    protected def layoutLabel(tabPlacement: Int, metrics: FontMetrics, tabIndex: Int, title: String, icon: Icon, tabRect: Rectangle, iconRect: Rectangle, textRect: Rectangle, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def navigateSelectedTab(direction: Int): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintContentBorder(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    /**  */
    @stub
    protected def paintContentBorderBottomEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /**  */
    @stub
    protected def paintContentBorderLeftEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /**  */
    @stub
    protected def paintContentBorderRightEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /**  */
    @stub
    protected def paintContentBorderTopEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /**  */
    @stub
    protected def paintFocusIndicator(g: Graphics, tabPlacement: Int, rects: Array[Rectangle], tabIndex: Int, iconRect: Rectangle, textRect: Rectangle, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def paintIcon(g: Graphics, tabPlacement: Int, tabIndex: Int, icon: Icon, iconRect: Rectangle, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def paintTab(g: Graphics, tabPlacement: Int, rects: Array[Rectangle], tabIndex: Int, iconRect: Rectangle, textRect: Rectangle): Unit = ???

    /** Paints the tabs in the tab area. */
    @stub
    protected def paintTabArea(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    /**  */
    @stub
    protected def paintTabBackground(g: Graphics, tabPlacement: Int, tabIndex: Int, x: Int, y: Int, w: Int, h: Int, isSelected: Boolean): Unit = ???

    /** this function draws the border around each tab
     *  note that this function does now draw the background of the tab.
     */
    @stub
    protected def paintTabBorder(g: Graphics, tabPlacement: Int, tabIndex: Int, x: Int, y: Int, w: Int, h: Int, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def paintText(g: Graphics, tabPlacement: Int, font: Font, metrics: FontMetrics, tabIndex: Int, title: String, textRect: Rectangle, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def selectAdjacentRunTab(tabPlacement: Int, tabIndex: Int, offset: Int): Unit = ???

    /**  */
    @stub
    protected def selectNextTab(current: Int): Unit = ???

    /**  */
    @stub
    protected def selectNextTabInRun(current: Int): Unit = ???

    /**  */
    @stub
    protected def selectPreviousTab(current: Int): Unit = ???

    /**  */
    @stub
    protected def selectPreviousTabInRun(current: Int): Unit = ???

    /** Sets the tab the mouse is currently over to index. */
    @stub
    protected def setRolloverTab(index: Int): Unit = ???

    /**  */
    @stub
    protected def setVisibleComponent(component: Component): Unit = ???

    /**  */
    @stub
    protected def shouldPadTabRun(tabPlacement: Int, run: Int): Boolean = ???

    /**  */
    @stub
    protected def shouldRotateTabRuns(tabPlacement: Int): Boolean = ???

    /** Returns the tab index which intersects the specified point
     *  in the JTabbedPane's coordinate space.
     */
    @stub
    def tabForCoordinate(pane: JTabbedPane, x: Int, y: Int): Int = ???

    /** Removes any installed subcomponents from the JTabbedPane. */
    @stub
    protected def uninstallComponents(): Unit = ???

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

object BasicTabbedPaneUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???

    /**  */
    @stub
    protected def rotateInsets(topInsets: Insets, targetInsets: Insets, targetPlacement: Int): Unit = ???
}
