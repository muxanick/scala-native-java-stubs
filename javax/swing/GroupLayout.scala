package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.lang.{Boolean, Object, String}

// GroupLayout is a LayoutManager that hierarchically
// groups components in order to position them in a Container.
// GroupLayout is intended for use by builders, but may be
// hand-coded as well.
// Grouping is done by instances of the Group class. GroupLayout supports two types of groups. A sequential group
// positions its child elements sequentially, one after another. A
// parallel group aligns its child elements in one of four ways.
// 
// Each group may contain any number of elements, where an element is
// a Group, Component, or gap. A gap can be thought
// of as an invisible component with a minimum, preferred and maximum
// size. In addition GroupLayout supports a preferred gap,
// whose value comes from LayoutStyle.
// 
// Elements are similar to a spring. Each element has a range as
// specified by a minimum, preferred and maximum.  Gaps have either a
// developer-specified range, or a range determined by LayoutStyle. The range for Components is determined from
// the Component's getMinimumSize, getPreferredSize and getMaximumSize methods. In addition,
// when adding Components you may specify a particular range
// to use instead of that from the component. The range for a Group is determined by the type of group. A ParallelGroup's
// range is the maximum of the ranges of its elements. A SequentialGroup's range is the sum of the ranges of its elements.
// 
// GroupLayout treats each axis independently.  That is, there
// is a group representing the horizontal axis, and a group
// representing the vertical axis.  The horizontal group is
// responsible for determining the minimum, preferred and maximum size
// along the horizontal axis as well as setting the x and width of the
// components contained in it. The vertical group is responsible for
// determining the minimum, preferred and maximum size along the
// vertical axis as well as setting the y and height of the
// components contained in it. Each Component must exist in both
// a horizontal and vertical group, otherwise an IllegalStateException
// is thrown during layout, or when the minimum, preferred or
// maximum size is requested.
// 
// The following diagram shows a sequential group along the horizontal
// axis. The sequential group contains three components. A parallel group
// was used along the vertical axis.
// 
// 
// 
// To reinforce that each axis is treated independently the diagram shows
// the range of each group and element along each axis. The
// range of each component has been projected onto the axes,
// and the groups are rendered in blue (horizontal) and red (vertical).
// For readability there is a gap between each of the elements in the
// sequential group.
// 
// The sequential group along the horizontal axis is rendered as a solid
// blue line. Notice the sequential group is the sum of the children elements
// it contains.
// 
// Along the vertical axis the parallel group is the maximum of the height
// of each of the components. As all three components have the same height,
// the parallel group has the same height.
// 
// The following diagram shows the same three components, but with the
// parallel group along the horizontal axis and the sequential group along
// the vertical axis.
//
// 
// 
// 
// As c1 is the largest of the three components, the parallel
// group is sized to c1. As c2 and c3 are smaller
// than c1 they are aligned based on the alignment specified
// for the component (if specified) or the default alignment of the
// parallel group. In the diagram c2 and c3 were created
// with an alignment of LEADING. If the component orientation were
// right-to-left then c2 and c3 would be positioned on
// the opposite side.
// 
// The following diagram shows a sequential group along both the horizontal
// and vertical axis.
// 
// 
// 
// GroupLayout provides the ability to insert gaps between
// Components. The size of the gap is determined by an
// instance of LayoutStyle. This may be turned on using the
// setAutoCreateGaps method.  Similarly, you may use
// the setAutoCreateContainerGaps method to insert gaps
// between components that touch the edge of the parent container and the
// container.
// 
// The following builds a panel consisting of two labels in
// one column, followed by two textfields in the next column:
// 
//   JComponent panel = ...;
//   GroupLayout layout = new GroupLayout(panel);
//   panel.setLayout(layout);
//
//   // Turn on automatically adding gaps between components
//   layout.setAutoCreateGaps(true);
//
//   // Turn on automatically creating gaps between components that touch
//   // the edge of the container and the container.
//   layout.setAutoCreateContainerGaps(true);
//
//   // Create a sequential group for the horizontal axis.
//
//   GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
//
//   // The sequential group in turn contains two parallel groups.
//   // One parallel group contains the labels, the other the text fields.
//   // Putting the labels in a parallel group along the horizontal axis
//   // positions them at the same x location.
//   //
//   // Variable indentation is used to reinforce the level of grouping.
//   hGroup.addGroup(layout.createParallelGroup().
//            addComponent(label1).addComponent(label2));
//   hGroup.addGroup(layout.createParallelGroup().
//            addComponent(tf1).addComponent(tf2));
//   layout.setHorizontalGroup(hGroup);
//
//   // Create a sequential group for the vertical axis.
//   GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
//
//   // The sequential group contains two parallel groups that align
//   // the contents along the baseline. The first parallel group contains
//   // the first label and text field, and the second parallel group contains
//   // the second label and text field. By using a sequential group
//   // the labels and text fields are positioned vertically after one another.
//   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
//            addComponent(label1).addComponent(tf1));
//   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
//            addComponent(label2).addComponent(tf2));
//   layout.setVerticalGroup(vGroup);
// 
// 
// When run the following is produced.
// 
// 
// 
// This layout consists of the following.
// The horizontal axis consists of a sequential group containing two
//         parallel groups.  The first parallel group contains the labels,
//         and the second parallel group contains the text fields.
//     The vertical axis consists of a sequential group
//         containing two parallel groups.  The parallel groups are configured
//         to align their components along the baseline. The first parallel
//         group contains the first label and first text field, and
//         the second group consists of the second label and second
//         text field.
// 
// There are a couple of things to notice in this code:
// 
//   You need not explicitly add the components to the container; this
//       is indirectly done by using one of the add methods of
//       Group.
//   The various add methods return
//       the caller.  This allows for easy chaining of invocations.  For
//       example, group.addComponent(label1).addComponent(label2); is
//       equivalent to
//       group.addComponent(label1); group.addComponent(label2);.
//   There are no public constructors for Groups; instead
//       use the create methods of GroupLayout.
// 
class GroupLayout extends Object with LayoutManager2 {

    @stub
    // Group provides the basis for the two types of
    // operations supported by GroupLayout: laying out
    // components one after another (SequentialGroup)
    // or aligned (ParallelGroup).
    def GroupLayout.Group: class = ???

    @stub
    // A Group that aligns and sizes it's children.
    def GroupLayout.ParallelGroup: class = ???

    @stub
    // Notification that a Component has been added to
    // the parent container.
    def addLayoutComponent(component: Component, constraints: Object): Unit = ???

    @stub
    // Notification that a Component has been added to
    // the parent container.
    def addLayoutComponent(name: String, component: Component): Unit = ???

    @stub
    // Creates and returns a ParallelGroup that aligns it's
    // elements along the baseline.
    def createBaselineGroup(resizable: Boolean, anchorBaselineToTop: Boolean): GroupLayout.ParallelGroup = ???

    @stub
    // Creates and returns a ParallelGroup with an alignment of
    // Alignment.LEADING.
    def createParallelGroup(): GroupLayout.ParallelGroup = ???

    @stub
    // Creates and returns a ParallelGroup with the specified
    // alignment.
    def createParallelGroup(alignment: GroupLayout.Alignment): GroupLayout.ParallelGroup = ???

    @stub
    // Creates and returns a ParallelGroup with the specified
    // alignment and resize behavior.
    def createParallelGroup(alignment: GroupLayout.Alignment, resizable: Boolean): GroupLayout.ParallelGroup = ???

    @stub
    // Creates and returns a SequentialGroup.
    def createSequentialGroup(): GroupLayout.SequentialGroup = ???

    @stub
    // Returns true if gaps between the container and components that
    // border the container are automatically created.
    def getAutoCreateContainerGaps(): Boolean = ???

    @stub
    // Returns true if gaps between components are automatically
    // created.
    def getAutoCreateGaps(): Boolean = ???

    @stub
    // Returns whether component visibility is considered when sizing and
    // positioning components.
    def getHonorsVisibility(): Boolean = ???

    @stub
    // Returns the alignment along the x axis.
    def getLayoutAlignmentX(parent: Container): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getLayoutAlignmentY(parent: Container): float = ???

    @stub
    // Returns the LayoutStyle used for calculating the preferred
    // gap between components.
    def getLayoutStyle(): LayoutStyle = ???

    @stub
    // Invalidates the layout, indicating that if the layout manager
    // has cached information it should be discarded.
    def invalidateLayout(parent: Container): Unit = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Forces the specified components to have the same size
    // regardless of their preferred, minimum or maximum sizes.
    def linkSize(components: Component*): Unit = ???

    @stub
    // Forces the specified components to have the same size along the
    // specified axis regardless of their preferred, minimum or
    // maximum sizes.
    def linkSize(axis: Int, components: Component*): Unit = ???

    @stub
    // Returns the maximum size for the specified container.
    def maximumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Returns the minimum size for the specified container.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Returns the preferred size for the specified container.
    def preferredLayoutSize(parent: Container): Dimension = ???

    @stub
    // Notification that a Component has been removed from
    // the parent container.
    def removeLayoutComponent(component: Component): Unit = ???

    @stub
    // Replaces an existing component with a new one.
    def replace(existingComponent: Component, newComponent: Component): Unit = ???

    @stub
    // Sets whether a gap between the container and components that
    // touch the border of the container should automatically be
    // created.
    def setAutoCreateContainerGaps(autoCreateContainerPadding: Boolean): Unit = ???

    @stub
    // Sets whether a gap between components should automatically be
    // created.
    def setAutoCreateGaps(autoCreatePadding: Boolean): Unit = ???

    @stub
    // Sets whether component visibility is considered when sizing and
    // positioning components.
    def setHonorsVisibility(honorsVisibility: Boolean): Unit = ???

    @stub
    // Sets whether the component's visibility is considered for
    // sizing and positioning.
    def setHonorsVisibility(component: Component, honorsVisibility: Boolean): Unit = ???

    @stub
    // Sets the Group that positions and sizes
    // components along the horizontal axis.
    def setHorizontalGroup(group: GroupLayout.Group): Unit = ???

    @stub
    // Sets the LayoutStyle used to calculate the preferred
    // gaps between components.
    def setLayoutStyle(layoutStyle: LayoutStyle): Unit = ???

    @stub
    // Sets the Group that positions and sizes
    // components along the vertical axis.
    def setVerticalGroup(group: GroupLayout.Group): Unit = ???
}

object GroupLayout {
    @stub
    // Enumeration of the possible ways ParallelGroup can align
    // its children.
    def GroupLayout.Alignment: class = ???

    @stub
    // Indicates the size from the component or gap should be used for a
    // particular range value.
    def DEFAULT_SIZE: Int = ???
}
