package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Used to layout a BasicSplitPaneDivider.
 *  Layout for the divider
 *  involves appropriately moving the left/right buttons around.
 */
protected class BasicSplitPaneDivider_DividerLayout extends Object with LayoutManager {

    /**  */
    @stub
    protected def DividerLayout() = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(string: String, c: Component): Unit = ???

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
