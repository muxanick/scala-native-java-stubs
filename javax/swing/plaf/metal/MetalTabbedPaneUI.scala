package javax.swing.plaf.metal

import java.awt.{Color, Graphics, LayoutManager, Rectangle}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TabbedPaneUI}
import javax.swing.plaf.basic.BasicTabbedPaneUI
import scala.scalanative.annotation.stub

/** The Metal subclass of BasicTabbedPaneUI.
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
class MetalTabbedPaneUI extends BasicTabbedPaneUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    @stub
    object TabbedPaneLayout extends MetalTabbedPaneUI.TabbedPaneLayout

    /**  */
    @stub
    protected val minTabWidth: Int = ???

    /**  */
    @stub
    protected val selectColor: Color = ???

    /**  */
    @stub
    protected val selectHighlight: Color = ???

    /**  */
    @stub
    protected val tabAreaBackground: Color = ???

    /**  */
    @stub
    protected def calculateMaxTabHeight(tabPlacement: Int): Int = ???

    /** Invoked by installUI to create
     *  a layout manager object to manage
     *  the JTabbedPane.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** Returns the amount the baseline is offset by. */
    @stub
    protected def getBaselineOffset(): Int = ???

    /**  */
    @stub
    protected def getColorForGap(currentRun: Int, x: Int, y: Int): Color = ???

    /** Overridden to do nothing for the Java L&F. */
    @stub
    protected def getTabLabelShiftX(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    /** Overridden to do nothing for the Java L&F. */
    @stub
    protected def getTabLabelShiftY(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int = ???

    /**  */
    @stub
    protected def getTabRunOverlay(tabPlacement: Int): Int = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintBottomTabBorder(tabIndex: Int, g: Graphics, x: Int, y: Int, w: Int, h: Int, btm: Int, rght: Int, isSelected: Boolean): Unit = ???

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
    protected def paintHighlightBelowTab(): Unit = ???

    /**  */
    @stub
    protected def paintLeftTabBorder(tabIndex: Int, g: Graphics, x: Int, y: Int, w: Int, h: Int, btm: Int, rght: Int, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def paintRightTabBorder(tabIndex: Int, g: Graphics, x: Int, y: Int, w: Int, h: Int, btm: Int, rght: Int, isSelected: Boolean): Unit = ???

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
    protected def paintTopTabBorder(tabIndex: Int, g: Graphics, x: Int, y: Int, w: Int, h: Int, btm: Int, rght: Int, isSelected: Boolean): Unit = ???

    /**  */
    @stub
    protected def shouldFillGap(currentRun: Int, tabIndex: Int, x: Int, y: Int): Boolean = ???

    /**  */
    @stub
    protected def shouldPadTabRun(tabPlacement: Int, run: Int): Boolean = ???

    /**  */
    @stub
    protected def shouldRotateTabRuns(tabPlacement: Int, selectedRun: Int): Boolean = ???

    /** Notifies this UI delegate that it is time to paint the specified
     *  component.
     */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object MetalTabbedPaneUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
