package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Insets, LayoutManager2}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** LayoutManager for JSplitPanes that have an orientation of
 *  HORIZONTAL_SPLIT.
 */
class BasicSplitPaneUI_BasicHorizontalLayoutManager extends Object with LayoutManager2 {

    /**  */
    @stub
    protected val components: Array[Component] = ???

    /**  */
    @stub
    protected val sizes: Array[Int] = ???

    /** Adds the specified component to the layout, using the specified
     *  constraint object.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Any): Unit = ???

    /** Adds the component at place. */
    @stub
    def addLayoutComponent(place: String, component: Component): Unit = ???

    /** Returns the available width based on the container size and
     *  Insets.
     */
    @stub
    protected def getAvailableSize(containerSize: Dimension, insets: Insets): Int = ???

    /** Returns the left inset, unless the Insets are null in which case
     *  0 is returned.
     */
    @stub
    protected def getInitialLocation(insets: Insets): Int = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getLayoutAlignmentX(target: Container): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getLayoutAlignmentY(target: Container): Float = ???

    /** Returns the width of the passed in Components preferred size. */
    @stub
    protected def getPreferredSizeOfComponent(c: Component): Int = ???

    /** Returns the width of the passed in component. */
    @stub
    protected def getSizeOfComponent(c: Component): Int = ???

    /** Returns the sizes of the components. */
    @stub
    protected def getSizes(): Array[Int] = ???

    /** Does nothing. */
    @stub
    def invalidateLayout(c: Container): Unit = ???

    /** Does the actual layout. */
    @stub
    def layoutContainer(container: Container): Unit = ???

    /** Returns the maximum layout size, which is Integer.MAX_VALUE
     *  in both directions.
     */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???

    /** Returns the minimum size needed to contain the children. */
    @stub
    def minimumLayoutSize(container: Container): Dimension = ???

    /** Returns the preferred size needed to contain the children. */
    @stub
    def preferredLayoutSize(container: Container): Dimension = ???

    /** Removes the specified component from our knowledge. */
    @stub
    def removeLayoutComponent(component: Component): Unit = ???

    /** Resets the size of the Component at the passed in location. */
    @stub
    protected def resetSizeAt(index: Int): Unit = ???

    /** Marks the receiver so that the next time this instance is
     *  laid out it'll ask for the preferred sizes.
     */
    @stub
    def resetToPreferredSizes(): Unit = ???

    /** Sets the width of the component c to be size, placing its
     *  x location at location, y to the insets.top and height
     *  to the containersize.height less the top and bottom insets.
     */
    @stub
    protected def setComponentToSize(c: Component, size: Int, location: Int, insets: Insets, containerSize: Dimension): Unit = ???

    /** Sets the sizes to newSizes. */
    @stub
    protected def setSizes(newSizes: Array[Int]): Unit = ???

    /** Determines the components. */
    @stub
    protected def updateComponents(): Unit = ???
}
