package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.io.Serializable
import java.lang.{Object, String}

// A layout manager that allows multiple components to be laid out either
// vertically or horizontally. The components will not wrap so, for
// example, a vertical arrangement of components will stay vertically
// arranged when the frame is resized.
// 
//    
//      
//         
//      
//    
// 
// 
// Nesting multiple panels with different combinations of horizontal and
// vertical gives an effect similar to GridBagLayout, without the
// complexity. The diagram shows two panels arranged horizontally, each
// of which contains 3 components arranged vertically.
//
//  The BoxLayout manager is constructed with an axis parameter that
// specifies the type of layout that will be done. There are four choices:
//
// X_AXIS - Components are laid out horizontally
// from left to right.
//
// Y_AXIS - Components are laid out vertically
// from top to bottom.
//
// LINE_AXIS - Components are laid out the way
// words are laid out in a line, based on the container's
// ComponentOrientation property. If the container's
// ComponentOrientation is horizontal then components are laid out
// horizontally, otherwise they are laid out vertically.  For horizontal
// orientations, if the container's ComponentOrientation is left to
// right then components are laid out left to right, otherwise they are laid
// out right to left. For vertical orientations components are always laid out
// from top to bottom.
//
// PAGE_AXIS - Components are laid out the way
// text lines are laid out on a page, based on the container's
// ComponentOrientation property. If the container's
// ComponentOrientation is horizontal then components are laid out
// vertically, otherwise they are laid out horizontally.  For horizontal
// orientations, if the container's ComponentOrientation is left to
// right then components are laid out left to right, otherwise they are laid
// out right to left.  For vertical orientations components are always
// laid out from top to bottom.
// 
// For all directions, components are arranged in the same order as they were
// added to the container.
// 
// BoxLayout attempts to arrange components
// at their preferred widths (for horizontal layout)
// or heights (for vertical layout).
// For a horizontal layout,
// if not all the components are the same height,
// BoxLayout attempts to make all the components
// as high as the highest component.
// If that's not possible for a particular component,
// then BoxLayout aligns that component vertically,
// according to the component's Y alignment.
// By default, a component has a Y alignment of 0.5,
// which means that the vertical center of the component
// should have the same Y coordinate as
// the vertical centers of other components with 0.5 Y alignment.
// 
// Similarly, for a vertical layout,
// BoxLayout attempts to make all components in the column
// as wide as the widest component.
// If that fails, it aligns them horizontally
// according to their X alignments.  For PAGE_AXIS layout,
// horizontal alignment is done based on the leading edge of the component.
// In other words, an X alignment value of 0.0 means the left edge of a
// component if the container's ComponentOrientation is left to
// right and it means the right edge of the component otherwise.
// 
// Instead of using BoxLayout directly, many programs use the Box class.
// The Box class is a lightweight container that uses a BoxLayout.
// It also provides handy methods to help you use BoxLayout well.
// Adding components to multiple nested boxes is a powerful way to get
// the arrangement you want.
// 
// For further information and examples see
// How to Use BoxLayout,
// a section in The Java Tutorial.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BoxLayout extends Object with LayoutManager2, with Serializable {

    @stub
    // Not used by this class.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Not used by this class.
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Returns the axis that was used to lay out components.
    def getAxis(): Int = ???

    @stub
    // Returns the alignment along the X axis for the container.
    def getLayoutAlignmentX(target: Container): float = ???

    @stub
    // Returns the alignment along the Y axis for the container.
    def getLayoutAlignmentY(target: Container): float = ???

    @stub
    // Returns the container that uses this layout manager.
    def getTarget(): Container = ???

    @stub
    // Indicates that a child has changed its layout related information,
    // and thus any cached calculations should be flushed.
    def invalidateLayout(target: Container): Unit = ???

    @stub
    // Called by the AWT <!--  XXX CHECK!  --> when the specified container
    // needs to be laid out.
    def layoutContainer(target: Container): Unit = ???

    @stub
    // Returns the maximum dimensions the target container can use
    // to lay out the components it contains.
    def maximumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the minimum dimensions needed to lay out the components
    // contained in the specified target container.
    def minimumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the preferred dimensions for this layout, given the components
    // in the specified target container.
    def preferredLayoutSize(target: Container): Dimension = ???
}

object BoxLayout {
    @stub
    // Specifies that components should be laid out in the direction of
    // a line of text as determined by the target container's
    // ComponentOrientation property.
    def LINE_AXIS: Int = ???

    @stub
    // Specifies that components should be laid out in the direction that
    // lines flow across a page as determined by the target container's
    // ComponentOrientation property.
    def PAGE_AXIS: Int = ???

    @stub
    // Specifies that components should be laid out left to right.
    def X_AXIS: Int = ???
}
