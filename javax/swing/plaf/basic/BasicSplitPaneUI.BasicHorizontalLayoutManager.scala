package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Insets, LayoutManager2}
import java.lang.{Object, String}

// LayoutManager for JSplitPanes that have an orientation of
// HORIZONTAL_SPLIT.
class BasicSplitPaneUI.BasicHorizontalLayoutManager extends Object with LayoutManager2 {

    @stub
    // 
    protected def components: Array[Component] = ???

    @stub
    // Adds the specified component to the layout, using the specified
    // constraint object.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Adds the component at place.
    def addLayoutComponent(place: String, component: Component): Unit = ???

    @stub
    // Returns the available width based on the container size and
    // Insets.
    protected def getAvailableSize(containerSize: Dimension, insets: Insets): Int = ???

    @stub
    // Returns the left inset, unless the Insets are null in which case
    // 0 is returned.
    protected def getInitialLocation(insets: Insets): Int = ???

    @stub
    // Returns the alignment along the x axis.
    def getLayoutAlignmentX(target: Container): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getLayoutAlignmentY(target: Container): float = ???

    @stub
    // Returns the width of the passed in Components preferred size.
    protected def getPreferredSizeOfComponent(c: Component): Int = ???

    @stub
    // Returns the width of the passed in component.
    protected def getSizeOfComponent(c: Component): Int = ???

    @stub
    // Returns the sizes of the components.
    protected def getSizes(): Array[Int] = ???

    @stub
    // Does nothing.
    def invalidateLayout(c: Container): Unit = ???

    @stub
    // Does the actual layout.
    def layoutContainer(container: Container): Unit = ???

    @stub
    // Returns the maximum layout size, which is Integer.MAX_VALUE
    // in both directions.
    def maximumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the minimum size needed to contain the children.
    def minimumLayoutSize(container: Container): Dimension = ???

    @stub
    // Returns the preferred size needed to contain the children.
    def preferredLayoutSize(container: Container): Dimension = ???

    @stub
    // Removes the specified component from our knowledge.
    def removeLayoutComponent(component: Component): Unit = ???

    @stub
    // Resets the size of the Component at the passed in location.
    protected def resetSizeAt(index: Int): Unit = ???

    @stub
    // Marks the receiver so that the next time this instance is
    // laid out it'll ask for the preferred sizes.
    def resetToPreferredSizes(): Unit = ???

    @stub
    // Sets the width of the component c to be size, placing its
    // x location at location, y to the insets.top and height
    // to the containersize.height less the top and bottom insets.
    protected def setComponentToSize(c: Component, size: Int, location: Int, insets: Insets, containerSize: Dimension): Unit = ???

    @stub
    // Sets the sizes to newSizes.
    protected def setSizes(newSizes: Array[Int]): Unit = ???
}
