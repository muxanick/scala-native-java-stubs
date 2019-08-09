package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}

// ButtonAreaLayout behaves in a similar manner to
// FlowLayout. It lays out all components from left to
// right. If syncAllWidths is true, the widths of each
// component will be set to the largest preferred size width.
//
// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of BasicOptionPaneUI.
object BasicOptionPaneUI.ButtonAreaLayout extends Object with LayoutManager {

    @stub
    // If true, children are lumped together in parent.
    protected def centersChildren: Boolean = ???

    @stub
    // 
    protected def padding: Int = ???

    @stub
    // If the layout manager uses a per-component string,
    // adds the component comp to the layout,
    // associating it
    // with the string specified by name.
    def addLayoutComponent(string: String, comp: Component): Unit = ???

    @stub
    // 
    def getCentersChildren(): Boolean = ???

    @stub
    // 
    def getPadding(): Int = ???

    @stub
    // 
    def getSyncAllWidths(): Boolean = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(container: Container): Unit = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(c: Container): Dimension = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(c: Container): Dimension = ???

    @stub
    // Removes the specified component from the layout.
    def removeLayoutComponent(c: Component): Unit = ???

    @stub
    // 
    def setCentersChildren(newValue: Boolean): Unit = ???

    @stub
    // 
    def setPadding(newPadding: Int): Unit = ???
}
