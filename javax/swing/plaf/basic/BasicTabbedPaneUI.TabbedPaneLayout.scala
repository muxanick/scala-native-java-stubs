package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicTabbedPaneUI.
 */
class BasicTabbedPaneUI.TabbedPaneLayout extends Object with LayoutManager {

    /**  */
    @stub
    def TabbedPaneLayout() = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /**  */
    @stub
    def calculateLayoutInfo(): Unit = ???

    /**  */
    @stub
    protected def calculateSize(minimum: Boolean): Dimension = ???

    /**  */
    @stub
    protected def calculateTabRects(tabPlacement: Int, tabCount: Int): Unit = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Calculates the minimum size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /**  */
    @stub
    protected def normalizeTabRuns(tabPlacement: Int, tabCount: Int, start: Int, max: Int): Unit = ???

    /**  */
    @stub
    protected def padSelectedTab(tabPlacement: Int, selectedIndex: Int): Unit = ???

    /**  */
    @stub
    protected def padTabRun(tabPlacement: Int, start: Int, end: Int, max: Int): Unit = ???

    /** Calculates the preferred size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /**  */
    @stub
    protected def preferredTabAreaHeight(tabPlacement: Int, width: Int): Int = ???

    /**  */
    @stub
    protected def preferredTabAreaWidth(tabPlacement: Int, height: Int): Int = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???

    /**  */
    @stub
    protected def rotateTabRuns(tabPlacement: Int, selectedRun: Int): Unit = ???
}
