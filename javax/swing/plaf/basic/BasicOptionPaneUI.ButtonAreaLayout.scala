package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** ButtonAreaLayout behaves in a similar manner to
 *  FlowLayout. It lays out all components from left to
 *  right. If syncAllWidths is true, the widths of each
 *  component will be set to the largest preferred size width.
 * 
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicOptionPaneUI.
 */
object BasicOptionPaneUI_ButtonAreaLayout extends Object with LayoutManager {

    /**  */
    @stub
    def ButtonAreaLayout(syncAllWidths: Boolean, padding: Int) = ???

    /** If true, children are lumped together in parent. */
    @stub
    protected val centersChildren: Boolean = ???

    /**  */
    @stub
    protected val padding: Int = ???

    /**  */
    @stub
    protected val syncAllWidths: Boolean = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(string: String, comp: Component): Unit = ???

    /**  */
    @stub
    def getCentersChildren(): Boolean = ???

    /**  */
    @stub
    def getPadding(): Int = ???

    /**  */
    @stub
    def getSyncAllWidths(): Boolean = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(container: Container): Unit = ???

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

    /**  */
    @stub
    def setCentersChildren(newValue: Boolean): Unit = ???

    /**  */
    @stub
    def setPadding(newPadding: Int): Unit = ???

    /**  */
    @stub
    def setSyncAllWidths(newValue: Boolean): Unit = ???
}
