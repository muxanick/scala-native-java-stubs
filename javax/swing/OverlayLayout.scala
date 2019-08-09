package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A layout manager to arrange components over the top
 *  of each other.  The requested size of the container
 *  will be the largest requested size of the children,
 *  taking alignment needs into consideration.
 * 
 *  The alignment is based upon what is needed to properly
 *  fit the children in the allocation area.  The children
 *  will be placed such that their alignment points are all
 *  on top of each other.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class OverlayLayout extends Object with LayoutManager2 with Serializable {

    /** Constructs a layout manager that performs overlay
     *  arrangement of the children.
     */
    @stub
    def this(target: Container) = ???

    /** Adds the specified component to the layout, using the specified
     *  constraint object.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    /** Adds the specified component to the layout. */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Returns the alignment along the x axis for the container. */
    @stub
    def getLayoutAlignmentX(target: Container): Float = ???

    /** Returns the alignment along the y axis for the container. */
    @stub
    def getLayoutAlignmentY(target: Container): Float = ???

    /** Returns the container that uses this layout manager. */
    @stub
    def getTarget(): Container = ???

    /** Indicates a child has changed its layout related information,
     *  which causes any cached calculations to be flushed.
     */
    @stub
    def invalidateLayout(target: Container): Unit = ???

    /** Called by the AWT when the specified container needs to be laid out. */
    @stub
    def layoutContainer(target: Container): Unit = ???

    /** Returns the maximum dimensions needed to lay out the components
     *  contained in the specified target container.
     */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???

    /** Returns the minimum dimensions needed to lay out the components
     *  contained in the specified target container.
     */
    @stub
    def minimumLayoutSize(target: Container): Dimension = ???

    /** Returns the preferred dimensions for this layout given the components
     *  in the specified target container.
     */
    @stub
    def preferredLayoutSize(target: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???
}
