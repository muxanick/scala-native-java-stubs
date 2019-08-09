package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.lang.{Object, String}

// A SpringLayout lays out the children of its associated container
// according to a set of constraints.
// See How to Use SpringLayout
// in The Java Tutorial for examples of using
// SpringLayout.
//
// 
// Each constraint,
// represented by a Spring object,
// controls the vertical or horizontal distance
// between two component edges.
// The edges can belong to
// any child of the container,
// or to the container itself.
// For example,
// the allowable width of a component
// can be expressed using a constraint
// that controls the distance between the west (left) and east (right)
// edges of the component.
// The allowable y coordinates for a component
// can be expressed by constraining the distance between
// the north (top) edge of the component
// and the north edge of its container.
//
// 
// Every child of a SpringLayout-controlled container,
// as well as the container itself,
// has exactly one set of constraints
// associated with it.
// These constraints are represented by
// a SpringLayout.Constraints object.
// By default,
// SpringLayout creates constraints
// that make their associated component
// have the minimum, preferred, and maximum sizes
// returned by the component's
// Component.getMinimumSize(),
// Component.getPreferredSize(), and
// Component.getMaximumSize()
// methods. The x and y positions are initially not
// constrained, so that until you constrain them the Component
// will be positioned at 0,0 relative to the Insets of the
// parent Container.
//
// 
// You can change
// a component's constraints in several ways.
// You can
// use one of the
// putConstraint
// methods
// to establish a spring
// linking the edges of two components within the same container.
// Or you can get the appropriate SpringLayout.Constraints
// object using
// getConstraints
// and then modify one or more of its springs.
// Or you can get the spring for a particular edge of a component
// using getConstraint,
// and modify it.
// You can also associate
// your own SpringLayout.Constraints object
// with a component by specifying the constraints object
// when you add the component to its container
// (using
// Container.add(Component, Object)).
//
// 
// The Spring object representing each constraint
// has a minimum, preferred, maximum, and current value.
// The current value of the spring
// is somewhere between the minimum and maximum values,
// according to the formula given in the
// Spring.sum(javax.swing.Spring, javax.swing.Spring) method description.
// When the minimum, preferred, and maximum values are the same,
// the current value is always equal to them;
// this inflexible spring is called a strut.
// You can create struts using the factory method
// Spring.constant(int).
// The Spring class also provides factory methods
// for creating other kinds of springs,
// including springs that depend on other springs.
//
// 
// In a SpringLayout, the position of each edge is dependent on
// the position of just one other edge. If a constraint is subsequently added
// to create a new binding for an edge, the previous binding is discarded
// and the edge remains dependent on a single edge.
// Springs should only be attached
// between edges of the container and its immediate children; the behavior
// of the SpringLayout when presented with constraints linking
// the edges of components from different containers (either internal or
// external) is undefined.
//
// 
// SpringLayout vs. Other Layout Managers
// 
//
// 
// 
// Note:
// Unlike many layout managers,
// SpringLayout doesn't automatically set the location of
// the components it manages.
// If you hand-code a GUI that uses SpringLayout,
// remember to initialize component locations by constraining the west/east
// and north/south locations.
// 
// Depending on the constraints you use,
// you may also need to set the size of the container explicitly.
// 
// 
//
// 
// Despite the simplicity of SpringLayout,
// it can emulate the behavior of most other layout managers.
// For some features,
// such as the line breaking provided by FlowLayout,
// you'll need to
// create a special-purpose subclass of the Spring class.
//
// 
// SpringLayout also provides a way to solve
// many of the difficult layout
// problems that cannot be solved by nesting combinations
// of Boxes. That said, SpringLayout honors the
// LayoutManager2 contract correctly and so can be nested with
// other layout managers -- a technique that can be preferable to
// creating the constraints implied by the other layout managers.
// 
// The asymptotic complexity of the layout operation of a SpringLayout
// is linear in the number of constraints (and/or components).
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SpringLayout extends Object with LayoutManager2 {

    @stub
    // If constraints is an instance of
    // SpringLayout.Constraints,
    // associates the constraints with the specified component.
    def addLayoutComponent(component: Component, constraints: Object): Unit = ???

    @stub
    // Has no effect,
    // since this layout manager does not
    // use a per-component string.
    def addLayoutComponent(name: String, c: Component): Unit = ???

    @stub
    // Returns the spring controlling the distance between
    // the specified edge of
    // the component and the top or left edge of its parent.
    def getConstraint(edgeName: String, c: Component): Spring = ???

    @stub
    // Returns the constraints for the specified component.
    def getConstraints(c: Component): SpringLayout.Constraints = ???

    @stub
    // Returns 0.5f (centered).
    def getLayoutAlignmentX(p: Container): float = ???

    @stub
    // Returns 0.5f (centered).
    def getLayoutAlignmentY(p: Container): float = ???

    @stub
    // Invalidates the layout, indicating that if the layout manager
    // has cached information it should be discarded.
    def invalidateLayout(p: Container): Unit = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Calculates the maximum size dimensions for the specified container,
    // given the components it contains.
    def maximumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(parent: Container): Dimension = ???

    @stub
    // Links edge e1 of component c1 to
    // edge e2 of component c2,
    // with a fixed distance between the edges.
    def putConstraint(e1: String, c1: Component, pad: Int, e2: String, c2: Component): Unit = ???

    @stub
    // Links edge e1 of component c1 to
    // edge e2 of component c2.
    def putConstraint(e1: String, c1: Component, s: Spring, e2: String, c2: Component): Unit = ???
}

object SpringLayout {
    @stub
    // Specifies the baseline of a component.
    def BASELINE: String = ???

    @stub
    // Specifies the right edge of a component's bounding rectangle.
    def EAST: String = ???

    @stub
    // Specifies the height of a component's bounding rectangle.
    def HEIGHT: String = ???

    @stub
    // Specifies the horizontal center of a component's bounding rectangle.
    def HORIZONTAL_CENTER: String = ???

    @stub
    // Specifies the top edge of a component's bounding rectangle.
    def NORTH: String = ???

    @stub
    // Specifies the bottom edge of a component's bounding rectangle.
    def SOUTH: String = ???

    @stub
    // Specifies the vertical center of a component's bounding rectangle.
    def VERTICAL_CENTER: String = ???

    @stub
    // Specifies the left edge of a component's bounding rectangle.
    def WEST: String = ???
}
