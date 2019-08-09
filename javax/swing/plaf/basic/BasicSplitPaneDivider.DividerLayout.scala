package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}

// Used to layout a BasicSplitPaneDivider.
// Layout for the divider
// involves appropriately moving the left/right buttons around.
protected class BasicSplitPaneDivider.DividerLayout extends Object with LayoutManager {

    @stub
    // If the layout manager uses a per-component string,
    // adds the component comp to the layout,
    // associating it
    // with the string specified by name.
    def addLayoutComponent(string: String, c: Component): Unit = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(c: Container): Unit = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(c: Container): Dimension = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(c: Container): Dimension = ???
}
