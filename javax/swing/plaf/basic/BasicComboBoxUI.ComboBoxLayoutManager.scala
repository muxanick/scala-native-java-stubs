package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}

// This layout manager handles the 'standard' layout of combo boxes.  It puts
// the arrow button to the right and the editor to the left.  If there is no
// editor it still keeps the arrow button to the right.
//
// This public inner class should be treated as protected.
// Instantiate it only within subclasses of
// BasicComboBoxUI.
class BasicComboBoxUI.ComboBoxLayoutManager extends Object with LayoutManager {

    @stub
    // If the layout manager uses a per-component string,
    // adds the component comp to the layout,
    // associating it
    // with the string specified by name.
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(parent: Container): Dimension = ???
}
