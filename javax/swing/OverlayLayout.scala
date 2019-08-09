package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.io.Serializable
import java.lang.{Object, String}

// A layout manager to arrange components over the top
// of each other.  The requested size of the container
// will be the largest requested size of the children,
// taking alignment needs into consideration.
//
// The alignment is based upon what is needed to properly
// fit the children in the allocation area.  The children
// will be placed such that their alignment points are all
// on top of each other.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class OverlayLayout extends Object with LayoutManager2, with Serializable {

    @stub
    // Adds the specified component to the layout, using the specified
    // constraint object.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Adds the specified component to the layout.
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Returns the alignment along the x axis for the container.
    def getLayoutAlignmentX(target: Container): float = ???

    @stub
    // Returns the alignment along the y axis for the container.
    def getLayoutAlignmentY(target: Container): float = ???

    @stub
    // Returns the container that uses this layout manager.
    def getTarget(): Container = ???

    @stub
    // Indicates a child has changed its layout related information,
    // which causes any cached calculations to be flushed.
    def invalidateLayout(target: Container): Unit = ???

    @stub
    // Called by the AWT when the specified container needs to be laid out.
    def layoutContainer(target: Container): Unit = ???

    @stub
    // Returns the maximum dimensions needed to lay out the components
    // contained in the specified target container.
    def maximumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the minimum dimensions needed to lay out the components
    // contained in the specified target container.
    def minimumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the preferred dimensions for this layout given the components
    // in the specified target container.
    def preferredLayoutSize(target: Container): Dimension = ???
}
