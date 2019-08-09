package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Font, FontMetrics, Graphics, Insets, LayoutManager, Rectangle}
import java.awt.event.{FocusListener, MouseListener}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JButton, JComponent, JTabbedPane, KeyStroke, SwingConstants}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, TabbedPaneUI}
import javax.swing.text.View

// A Basic L&F implementation of TabbedPaneUI.
class BasicTabbedPaneUI extends TabbedPaneUI with SwingConstants {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTabbedPaneUI.FocusHandler: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTabbedPaneUI.MouseHandler: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTabbedPaneUI.PropertyChangeHandler: class = ???

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicTabbedPaneUI.TabbedPaneLayout: class = ???

    @stub
    // A rectangle used for general layout calculations in order
    // to avoid constructing many new Rectangles on the fly.
    protected def calcRect: Rectangle = ???

    @stub
    // 
    protected def contentBorderInsets: Insets = ???

    @stub
    // 
    protected def darkShadow: Color = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def downKey: KeyStroke = ???

    @stub
    // 
    protected def focus: Color = ???

    @stub
    // 
    protected def focusListener: FocusListener = ???

    @stub
    // 
    protected def highlight: Color = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def leftKey: KeyStroke = ???

    @stub
    // 
    protected def lightHighlight: Color = ???

    @stub
    // 
    protected def maxTabHeight: Int = ???

    @stub
    // 
    protected def maxTabWidth: Int = ???

    @stub
    // 
    protected def mouseListener: MouseListener = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def rects: Array[Rectangle] = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def rightKey: KeyStroke = ???

    @stub
    // 
    protected def runCount: Int = ???

    @stub
    // 
    protected def selectedRun: Int = ???

    @stub
    // 
    protected def selectedTabPadInsets: Insets = ???

    @stub
    // 
    protected def shadow: Color = ???

    @stub
    // 
    protected def tabAreaInsets: Insets = ???

    @stub
    // 
    protected def tabChangeListener: ChangeListener = ???

    @stub
    // 
    protected def tabInsets: Insets = ???

    @stub
    // 
    protected def tabPane: JTabbedPane = ???

    @stub
    // 
    protected def tabRunOverlay: Int = ???

    @stub
    // 
    protected def tabRuns: Array[Int] = ???

    @stub
    // 
    protected def textIconGap: Int = ???

    @stub
    // 
    protected def assureRectsCreated(tabCount: Int): Unit = ???

    @stub
    // 
    protected def calculateMaxTabHeight(tabPlacement: Int): Int = ???

    @stub
    // 
    protected def calculateMaxTabWidth(tabPlacement: Int): Int = ???

    @stub
    // 
    protected def calculateTabAreaHeight(tabPlacement: Int, horizRunCount: Int, maxTabHeight: Int): Int = ???

    @stub
    // 
    protected def calculateTabAreaWidth(tabPlacement: Int, vertRunCount: Int, maxTabWidth: Int): Int = ???

    @stub
    // 
    protected def calculateTabHeight(tabPlacement: Int, tabIndex: Int, fontHeight: Int): Int = ???

    @stub
    // 
    protected def calculateTabWidth(tabPlacement: Int, tabIndex: Int, metrics: FontMetrics): Int = ???

    @stub
    // 
    protected def createChangeListener(): ChangeListener = ???

    @stub
    // 
    protected def createFocusListener(): FocusListener = ???

    @stub
    // Invoked by installUI to create
    // a layout manager object to manage
    // the JTabbedPane.
    protected def createLayoutManager(): LayoutManager = ???

    @stub
    // 
    protected def createMouseListener(): MouseListener = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Creates and returns a JButton that will provide the user
    // with a way to scroll the tabs in a particular direction.
    protected def createScrollButton(direction: Int): JButton = ???

    @stub
    // 
    protected def expandTabRunsArray(): Unit = ???

    @stub
    // Returns the baseline for the specified tab.
    protected def getBaseline(tab: Int): Int = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns the amount the baseline is offset by.
    protected def getBaselineOffset(): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // 
    protected def getContentBorderInsets(tabPlacement: Int): Insets = ???

    @stub
    // Returns the index of the tab that has focus.
    protected def getFocusIndex(): Int = ???

    @stub
    // 
    protected def getFontMetrics(): FontMetrics = ???

    @stub
    // 
    protected def getIconForTab(tabIndex: Int): Icon = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getNextTabIndex(base: Int): Int = ???

    @stub
    // 
    protected def getNextTabIndexInRun(tabCount: Int, base: Int): Int = ???

    @stub
    // 
    protected def getNextTabRun(baseRun: Int): Int = ???

    @stub
    // 
    protected def getPreviousTabIndex(base: Int): Int = ???

    @stub
    // 
    protected def getPreviousTabIndexInRun(tabCount: Int, base: Int): Int = ???

    @stub
    // 
    protected def getPreviousTabRun(baseRun: Int): Int = ???

    @stub
    // Returns the tab the mouse is currently over, or -1 if the mouse is no
    // longer over any tab.
    protected def getRolloverTab(): Int = ???

    @stub
    // 
    protected def getRunForTab(tabCount: Int, tabIndex: Int): Int = ???

    @stub
    // 
    protected def getSelectedTabPadInsets(tabPlacement: Int): Insets = ???

    @stub
    // 
    protected def getTabAreaInsets(tabPlacement: Int): Insets = ???

    @stub
    // Returns the bounds of the specified tab in the coordinate space
    // of the JTabbedPane component.
    protected def getTabBounds(tabIndex: Int, dest: Rectangle): Rectangle = ???

    @stub
    // Returns the bounds of the specified tab index.
    def getTabBounds(pane: JTabbedPane, i: Int): Rectangle = ???

    @stub
    // 
    protected def getTabInsets(tabPlacement: Int, tabIndex: Int): Insets = ???

    @stub
    // 
    protected def getTabLabelShiftX(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    @stub
    // 
    protected def getTabLabelShiftY(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    @stub
    // 
    def getTabRunCount(pane: JTabbedPane): Int = ???

    @stub
    // 
    protected def getTabRunIndent(tabPlacement: Int, run: Int): Int = ???

    @stub
    // 
    protected def getTabRunOffset(tabPlacement: Int, tabCount: Int, tabIndex: Int, forward: Boolean): Int = ???

    @stub
    // 
    protected def getTabRunOverlay(tabPlacement: Int): Int = ???

    @stub
    // Returns the text View object required to render stylized text (HTML) for
    // the specified tab or null if no specialized text rendering is needed
    // for this tab.
    protected def getTextViewForTab(tabIndex: Int): View = ???

    @stub
    // 
    protected def getVisibleComponent(): Component = ???

    @stub
    // Creates and installs any required subcomponents for the JTabbedPane.
    protected def installComponents(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    protected def lastTabInRun(tabCount: Int, run: Int): Int = ???

    @stub
    // 
    protected def layoutLabel(tabPlacement: Int, metrics: FontMetrics, tabIndex: Int, title: String, icon: Icon, tabRect: Rectangle, iconRect: Rectangle, textRect: Rectangle, isSelected: Boolean): Unit = ???

    @stub
    // 
    protected def navigateSelectedTab(direction: Int): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def paintContentBorder(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    @stub
    // 
    protected def paintContentBorderBottomEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // 
    protected def paintContentBorderLeftEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // 
    protected def paintContentBorderRightEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // 
    protected def paintContentBorderTopEdge(g: Graphics, tabPlacement: Int, selectedIndex: Int, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // 
    protected def paintFocusIndicator(g: Graphics, tabPlacement: Int, rects: Array[Rectangle], tabIndex: Int, iconRect: Rectangle, textRect: Rectangle, isSelected: Boolean): Unit = ???

    @stub
    // 
    protected def paintIcon(g: Graphics, tabPlacement: Int, tabIndex: Int, icon: Icon, iconRect: Rectangle, isSelected: Boolean): Unit = ???

    @stub
    // 
    protected def paintTab(g: Graphics, tabPlacement: Int, rects: Array[Rectangle], tabIndex: Int, iconRect: Rectangle, textRect: Rectangle): Unit = ???

    @stub
    // Paints the tabs in the tab area.
    protected def paintTabArea(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    @stub
    // 
    protected def paintTabBackground(g: Graphics, tabPlacement: Int, tabIndex: Int, x: Int, y: Int, w: Int, h: Int, isSelected: Boolean): Unit = ???

    @stub
    // this function draws the border around each tab
    // note that this function does now draw the background of the tab.
    protected def paintTabBorder(g: Graphics, tabPlacement: Int, tabIndex: Int, x: Int, y: Int, w: Int, h: Int, isSelected: Boolean): Unit = ???

    @stub
    // 
    protected def paintText(g: Graphics, tabPlacement: Int, font: Font, metrics: FontMetrics, tabIndex: Int, title: String, textRect: Rectangle, isSelected: Boolean): Unit = ???

    @stub
    // 
    protected def selectAdjacentRunTab(tabPlacement: Int, tabIndex: Int, offset: Int): Unit = ???

    @stub
    // 
    protected def selectNextTab(current: Int): Unit = ???

    @stub
    // 
    protected def selectNextTabInRun(current: Int): Unit = ???

    @stub
    // 
    protected def selectPreviousTab(current: Int): Unit = ???

    @stub
    // 
    protected def selectPreviousTabInRun(current: Int): Unit = ???

    @stub
    // Sets the tab the mouse is currently over to index.
    protected def setRolloverTab(index: Int): Unit = ???

    @stub
    // 
    protected def setVisibleComponent(component: Component): Unit = ???

    @stub
    // 
    protected def shouldPadTabRun(tabPlacement: Int, run: Int): Boolean = ???

    @stub
    // 
    protected def shouldRotateTabRuns(tabPlacement: Int): Boolean = ???

    @stub
    // Returns the tab index which intersects the specified point
    // in the JTabbedPane's coordinate space.
    def tabForCoordinate(pane: JTabbedPane, x: Int, y: Int): Int = ???

    @stub
    // Removes any installed subcomponents from the JTabbedPane.
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicTabbedPaneUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???

    @stub
    // 
    protected def rotateInsets(topInsets: Insets, targetInsets: Insets, targetPlacement: Int): Unit = ???
}
