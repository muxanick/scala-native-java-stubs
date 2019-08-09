package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A CardLayout object is a layout manager for a
 *  container. It treats each component in the container as a card.
 *  Only one card is visible at a time, and the container acts as
 *  a stack of cards. The first component added to a
 *  CardLayout object is the visible component when the
 *  container is first displayed.
 *  
 *  The ordering of cards is determined by the container's own internal
 *  ordering of its component objects. CardLayout
 *  defines a set of methods that allow an application to flip
 *  through these cards sequentially, or to show a specified card.
 *  The addLayoutComponent(java.awt.Component, java.lang.Object)
 *  method can be used to associate a string identifier with a given card
 *  for fast random access.
 */
class CardLayout extends Object with LayoutManager2 with Serializable {

    /** Creates a new card layout with gaps of size zero. */
    @stub
    def this() = ???

    /** Creates a new card layout with the specified horizontal and
     *  vertical gaps.
     */
    @stub
    def this(hgap: Int, vgap: Int) = ???

    /** Adds the specified component to this card layout's internal
     *  table of names.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    /** Deprecated. 
     * replaced by
     *       addLayoutComponent(Component, Object).
     * 
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Flips to the first card of the container. */
    @stub
    def first(parent: Container): Unit = ???

    /** Gets the horizontal gap between components. */
    @stub
    def getHgap(): Int = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getLayoutAlignmentX(parent: Container): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getLayoutAlignmentY(parent: Container): Float = ???

    /** Gets the vertical gap between components. */
    @stub
    def getVgap(): Int = ???

    /** Invalidates the layout, indicating that if the layout manager
     *  has cached information it should be discarded.
     */
    @stub
    def invalidateLayout(target: Container): Unit = ???

    /** Flips to the last card of the container. */
    @stub
    def last(parent: Container): Unit = ???

    /** Lays out the specified container using this card layout. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Returns the maximum dimensions for this layout given the components
     *  in the specified target container.
     */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???

    /** Calculates the minimum size for the specified panel. */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Flips to the next card of the specified container. */
    @stub
    def next(parent: Container): Unit = ???

    /** Determines the preferred size of the container argument using
     *  this card layout.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Flips to the previous card of the specified container. */
    @stub
    def previous(parent: Container): Unit = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???

    /** Sets the horizontal gap between components. */
    @stub
    def setHgap(hgap: Int): Unit = ???

    /** Sets the vertical gap between components. */
    @stub
    def setVgap(vgap: Int): Unit = ???

    /** Flips to the component that was added to this layout with the
     *  specified name, using addLayoutComponent.
     */
    @stub
    def show(parent: Container, name: String): Unit = ???

    /** Returns a string representation of the state of this card layout. */
    @stub
    def toString(): String = ???
}
