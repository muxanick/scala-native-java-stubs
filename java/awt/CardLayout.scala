package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// A CardLayout object is a layout manager for a
// container. It treats each component in the container as a card.
// Only one card is visible at a time, and the container acts as
// a stack of cards. The first component added to a
// CardLayout object is the visible component when the
// container is first displayed.
// 
// The ordering of cards is determined by the container's own internal
// ordering of its component objects. CardLayout
// defines a set of methods that allow an application to flip
// through these cards sequentially, or to show a specified card.
// The addLayoutComponent(java.awt.Component, java.lang.Object)
// method can be used to associate a string identifier with a given card
// for fast random access.
class CardLayout extends Object with LayoutManager2, with Serializable {

    @stub
    // Creates a new card layout with gaps of size zero.
    def this() = ???

    @stub
    // Adds the specified component to this card layout's internal
    // table of names.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Deprecated. 
    //replaced by
    //      addLayoutComponent(Component, Object).
    //
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Flips to the first card of the container.
    def first(parent: Container): Unit = ???

    @stub
    // Gets the horizontal gap between components.
    def getHgap(): Int = ???

    @stub
    // Returns the alignment along the x axis.
    def getLayoutAlignmentX(parent: Container): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getLayoutAlignmentY(parent: Container): float = ???

    @stub
    // Gets the vertical gap between components.
    def getVgap(): Int = ???

    @stub
    // Invalidates the layout, indicating that if the layout manager
    // has cached information it should be discarded.
    def invalidateLayout(target: Container): Unit = ???

    @stub
    // Flips to the last card of the container.
    def last(parent: Container): Unit = ???

    @stub
    // Lays out the specified container using this card layout.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Returns the maximum dimensions for this layout given the components
    // in the specified target container.
    def maximumLayoutSize(target: Container): Dimension = ???

    @stub
    // Calculates the minimum size for the specified panel.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Flips to the next card of the specified container.
    def next(parent: Container): Unit = ???

    @stub
    // Determines the preferred size of the container argument using
    // this card layout.
    def preferredLayoutSize(parent: Container): Dimension = ???

    @stub
    // Flips to the previous card of the specified container.
    def previous(parent: Container): Unit = ???

    @stub
    // Removes the specified component from the layout.
    def removeLayoutComponent(comp: Component): Unit = ???

    @stub
    // Sets the horizontal gap between components.
    def setHgap(hgap: Int): Unit = ???

    @stub
    // Sets the vertical gap between components.
    def setVgap(vgap: Int): Unit = ???

    @stub
    // Flips to the component that was added to this layout with the
    // specified name, using addLayoutComponent.
    def show(parent: Container, name: String): Unit = ???
}
