package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicInternalFrameTitlePane_TitlePaneLayout extends Object with LayoutManager {

    /**  */
    @stub
    def TitlePaneLayout() = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, c: Component): Unit = ???

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
