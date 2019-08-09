package javax.swing.plaf.synth

import java.awt.{FontMetrics, Graphics, Insets, LayoutManager}
import java.awt.event.MouseListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JButton, JComponent}
import javax.swing.plaf.{ComponentUI, TabbedPaneUI}
import javax.swing.plaf.basic.BasicTabbedPaneUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JTabbedPane.
 * 
 *  Looks up the selectedTabPadInsets property from the Style,
 *  which represents additional insets for the selected tab.
 */
class SynthTabbedPaneUI extends BasicTabbedPaneUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def calculateMaxTabHeight(tabPlacement: Int): Int = ???

    /**  */
    @stub
    protected def calculateMaxTabWidth(tabPlacement: Int): Int = ???

    /**  */
    @stub
    protected def calculateTabWidth(tabPlacement: Int, tabIndex: Int, metrics: FontMetrics): Int = ???

    /** Invoked by installUI to create
     *  a layout manager object to manage
     *  the JTabbedPane.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** 
     * 
     *  Overridden to keep track of whether the selected tab is also pressed.
     */
    @stub
    protected def createMouseListener(): MouseListener = ???

    /** Creates and returns a JButton that will provide the user
     *  with a way to scroll the tabs in a particular direction.
     */
    @stub
    protected def createScrollButton(direction: Int): JButton = ???

    /** Returns the baseline for the specified tab. */
    @stub
    protected def getBaseline(tab: Int): Int = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def getFontMetrics(): FontMetrics = ???

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
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the tabs in the tab area. */
    @stub
    protected def paintTabArea(g: Graphics, tabPlacement: Int, selectedIndex: Int): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Sets the tab the mouse is currently over to index. */
    @stub
    protected def setRolloverTab(index: Int): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthTabbedPaneUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
