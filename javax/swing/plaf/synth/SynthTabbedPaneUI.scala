package javax.swing.plaf.synth

import java.awt.{FontMetrics, Graphics, Insets, LayoutManager}
import java.awt.event.MouseListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JButton, JComponent}
import javax.swing.plaf.{ComponentUI, TabbedPaneUI}
import javax.swing.plaf.basic.BasicTabbedPaneUI

// Provides the Synth L&F UI delegate for
// JTabbedPane.
//
// Looks up the selectedTabPadInsets property from the Style,
// which represents additional insets for the selected tab.
class SynthTabbedPaneUI extends BasicTabbedPaneUI with PropertyChangeListener, with SynthUI {

    @stub
    // 
    protected def calculateMaxTabHeight(tabPlacement: Int): Int = ???

    @stub
    // 
    protected def calculateMaxTabWidth(tabPlacement: Int): Int = ???

    @stub
    // 
    protected def calculateTabWidth(tabPlacement: Int, tabIndex: Int, metrics: FontMetrics): Int = ???

    @stub
    // Invoked by installUI to create
    // a layout manager object to manage
    // the JTabbedPane.
    protected def createLayoutManager(): LayoutManager = ???

    @stub
    // 
    //
    // Overridden to keep track of whether the selected tab is also pressed.
    protected def createMouseListener(): MouseListener = ???

    @stub
    // Creates and returns a JButton that will provide the user
    // with a way to scroll the tabs in a particular direction.
    protected def createScrollButton(direction: Int): JButton = ???

    @stub
    // Returns the baseline for the specified tab.
    protected def getBaseline(tab: Int): Int = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def getFontMetrics(): FontMetrics = ???

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
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Paints the tabs in the tab area.
    protected def paintTabArea(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Sets the tab the mouse is currently over to index.
    protected def setRolloverTab(index: Int): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthTabbedPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
