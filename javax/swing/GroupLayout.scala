package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.lang.{Boolean, Enum, Object, String}
import scala.scalanative.annotation.stub

/** GroupLayout is a LayoutManager that hierarchically
 *  groups components in order to position them in a Container.
 *  GroupLayout is intended for use by builders, but may be
 *  hand-coded as well.
 *  Grouping is done by instances of the Group class. GroupLayout supports two types of groups. A sequential group
 *  positions its child elements sequentially, one after another. A
 *  parallel group aligns its child elements in one of four ways.
 *  
 *  Each group may contain any number of elements, where an element is
 *  a Group, Component, or gap. A gap can be thought
 *  of as an invisible component with a minimum, preferred and maximum
 *  size. In addition GroupLayout supports a preferred gap,
 *  whose value comes from LayoutStyle.
 *  
 *  Elements are similar to a spring. Each element has a range as
 *  specified by a minimum, preferred and maximum.  Gaps have either a
 *  developer-specified range, or a range determined by LayoutStyle. The range for Components is determined from
 *  the Component's getMinimumSize, getPreferredSize and getMaximumSize methods. In addition,
 *  when adding Components you may specify a particular range
 *  to use instead of that from the component. The range for a Group is determined by the type of group. A ParallelGroup's
 *  range is the maximum of the ranges of its elements. A SequentialGroup's range is the sum of the ranges of its elements.
 *  
 *  GroupLayout treats each axis independently.  That is, there
 *  is a group representing the horizontal axis, and a group
 *  representing the vertical axis.  The horizontal group is
 *  responsible for determining the minimum, preferred and maximum size
 *  along the horizontal axis as well as setting the x and width of the
 *  components contained in it. The vertical group is responsible for
 *  determining the minimum, preferred and maximum size along the
 *  vertical axis as well as setting the y and height of the
 *  components contained in it. Each Component must exist in both
 *  a horizontal and vertical group, otherwise an IllegalStateException
 *  is thrown during layout, or when the minimum, preferred or
 *  maximum size is requested.
 *  
 *  The following diagram shows a sequential group along the horizontal
 *  axis. The sequential group contains three components. A parallel group
 *  was used along the vertical axis.
 *  
 *  
 *  
 *  To reinforce that each axis is treated independently the diagram shows
 *  the range of each group and element along each axis. The
 *  range of each component has been projected onto the axes,
 *  and the groups are rendered in blue (horizontal) and red (vertical).
 *  For readability there is a gap between each of the elements in the
 *  sequential group.
 *  
 *  The sequential group along the horizontal axis is rendered as a solid
 *  blue line. Notice the sequential group is the sum of the children elements
 *  it contains.
 *  
 *  Along the vertical axis the parallel group is the maximum of the height
 *  of each of the components. As all three components have the same height,
 *  the parallel group has the same height.
 *  
 *  The following diagram shows the same three components, but with the
 *  parallel group along the horizontal axis and the sequential group along
 *  the vertical axis.
 * 
 *  
 *  
 *  
 *  As c1 is the largest of the three components, the parallel
 *  group is sized to c1. As c2 and c3 are smaller
 *  than c1 they are aligned based on the alignment specified
 *  for the component (if specified) or the default alignment of the
 *  parallel group. In the diagram c2 and c3 were created
 *  with an alignment of LEADING. If the component orientation were
 *  right-to-left then c2 and c3 would be positioned on
 *  the opposite side.
 *  
 *  The following diagram shows a sequential group along both the horizontal
 *  and vertical axis.
 *  
 *  
 *  
 *  GroupLayout provides the ability to insert gaps between
 *  Components. The size of the gap is determined by an
 *  instance of LayoutStyle. This may be turned on using the
 *  setAutoCreateGaps method.  Similarly, you may use
 *  the setAutoCreateContainerGaps method to insert gaps
 *  between components that touch the edge of the parent container and the
 *  container.
 *  
 *  The following builds a panel consisting of two labels in
 *  one column, followed by two textfields in the next column:
 *  
 *    JComponent panel = ...;
 *    GroupLayout layout = new GroupLayout(panel);
 *    panel.setLayout(layout);
 * 
 *    // Turn on automatically adding gaps between components
 *    layout.setAutoCreateGaps(true);
 * 
 *    // Turn on automatically creating gaps between components that touch
 *    // the edge of the container and the container.
 *    layout.setAutoCreateContainerGaps(true);
 * 
 *    // Create a sequential group for the horizontal axis.
 * 
 *    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
 * 
 *    // The sequential group in turn contains two parallel groups.
 *    // One parallel group contains the labels, the other the text fields.
 *    // Putting the labels in a parallel group along the horizontal axis
 *    // positions them at the same x location.
 *    //
 *    // Variable indentation is used to reinforce the level of grouping.
 *    hGroup.addGroup(layout.createParallelGroup().
 *             addComponent(label1).addComponent(label2));
 *    hGroup.addGroup(layout.createParallelGroup().
 *             addComponent(tf1).addComponent(tf2));
 *    layout.setHorizontalGroup(hGroup);
 * 
 *    // Create a sequential group for the vertical axis.
 *    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
 * 
 *    // The sequential group contains two parallel groups that align
 *    // the contents along the baseline. The first parallel group contains
 *    // the first label and text field, and the second parallel group contains
 *    // the second label and text field. By using a sequential group
 *    // the labels and text fields are positioned vertically after one another.
 *    vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
 *             addComponent(label1).addComponent(tf1));
 *    vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
 *             addComponent(label2).addComponent(tf2));
 *    layout.setVerticalGroup(vGroup);
 *  
 *  
 *  When run the following is produced.
 *  
 *  
 *  
 *  This layout consists of the following.
 *  The horizontal axis consists of a sequential group containing two
 *          parallel groups.  The first parallel group contains the labels,
 *          and the second parallel group contains the text fields.
 *      The vertical axis consists of a sequential group
 *          containing two parallel groups.  The parallel groups are configured
 *          to align their components along the baseline. The first parallel
 *          group contains the first label and first text field, and
 *          the second group consists of the second label and second
 *          text field.
 *  
 *  There are a couple of things to notice in this code:
 *  
 *    You need not explicitly add the components to the container; this
 *        is indirectly done by using one of the add methods of
 *        Group.
 *    The various add methods return
 *        the caller.  This allows for easy chaining of invocations.  For
 *        example, group.addComponent(label1).addComponent(label2); is
 *        equivalent to
 *        group.addComponent(label1); group.addComponent(label2);.
 *    There are no public constructors for Groups; instead
 *        use the create methods of GroupLayout.
 *  
 */
class GroupLayout extends Object with LayoutManager2 {

    /** Creates a GroupLayout for the specified Container. */
    @stub
    def this(host: Container) = ???

    /** Group provides the basis for the two types of
     *  operations supported by GroupLayout: laying out
     *  components one after another (SequentialGroup)
     *  or aligned (ParallelGroup). Group and
     *  its subclasses have no public constructor; to create one use
     *  one of createSequentialGroup or
     *  createParallelGroup. Additionally, taking a Group
     *  created from one GroupLayout and using it with another
     *  will produce undefined results.
     *  
     *  Various methods in Group and its subclasses allow you
     *  to explicitly specify the range. The arguments to these methods
     *  can take two forms, either a value greater than or equal to 0,
     *  or one of DEFAULT_SIZE or PREFERRED_SIZE. A
     *  value greater than or equal to 0 indicates a specific
     *  size. DEFAULT_SIZE indicates the corresponding size
     *  from the component should be used.  For example, if DEFAULT_SIZE is passed as the minimum size argument, the
     *  minimum size is obtained from invoking getMinimumSize
     *  on the component. Likewise, PREFERRED_SIZE indicates
     *  the value from getPreferredSize should be used.
     *  The following example adds myComponent to group
     *  with specific values for the range. That is, the minimum is
     *  explicitly specified as 100, preferred as 200, and maximum as
     *  300.
     *  
     *    group.addComponent(myComponent, 100, 200, 300);
     *  
     *  The following example adds myComponent to group using
     *  a combination of the forms. The minimum size is forced to be the
     *  same as the preferred size, the preferred size is determined by
     *  using myComponent.getPreferredSize and the maximum is
     *  determined by invoking getMaximumSize on the component.
     *  
     *    group.addComponent(myComponent, GroupLayout.PREFERRED_SIZE,
     *              GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE);
     *  
     *  
     *  Unless otherwise specified all the methods of Group and
     *  its subclasses that allow you to specify a range throw an
     *  IllegalArgumentException if passed an invalid range. An
     *  invalid range is one in which any of the values are < 0 and
     *  not one of PREFERRED_SIZE or DEFAULT_SIZE, or
     *  the following is not met (for specific values): min
     *  <= pref <= max.
     *  
     *  Similarly any methods that take a Component throw a
     *  IllegalArgumentException if passed null and any methods
     *  that take a Group throw an NullPointerException if
     *  passed null.
     */
    abstract class Group extends Object {

        /** Adds a Component to this Group. */
        def addComponent(component: Component): Group

        /** Adds a Component to this Group
         *  with the specified size.
         */
        def addComponent(component: Component, min: Int, pref: Int, max: Int): Group

        /** Adds a rigid gap to this Group. */
        def addGap(size: Int): Group

        /** Adds a gap to this Group with the specified size. */
        def addGap(min: Int, pref: Int, max: Int): Group

        /** Adds a Group to this Group. */
        def addGroup(group: GroupLayout.Group): Group
    }


    /** A Group that aligns and sizes it's children.
     *  ParallelGroup aligns it's children in
     *  four possible ways: along the baseline, centered, anchored to the
     *  leading edge, or anchored to the trailing edge.
     *  Baseline
     *  A ParallelGroup that aligns it's children along the
     *  baseline must first decide where the baseline is
     *  anchored. The baseline can either be anchored to the top, or
     *  anchored to the bottom of the group. That is, the distance between the
     *  baseline and the beginning of the group can be a constant
     *  distance, or the distance between the end of the group and the
     *  baseline can be a constant distance. The possible choices
     *  correspond to the BaselineResizeBehavior constants
     *  CONSTANT_ASCENT and
     *  CONSTANT_DESCENT.
     *  
     *  The baseline anchor may be explicitly specified by the
     *  createBaselineGroup method, or determined based on the elements.
     *  If not explicitly specified, the baseline will be anchored to
     *  the bottom if all the elements with a baseline, and that are
     *  aligned to the baseline, have a baseline resize behavior of
     *  CONSTANT_DESCENT; otherwise the baseline is anchored to the top
     *  of the group.
     *  
     *  Elements aligned to the baseline are resizable if they have have
     *  a baseline resize behavior of CONSTANT_ASCENT or
     *  CONSTANT_DESCENT. Elements with a baseline resize
     *  behavior of OTHER or CENTER_OFFSET are not resizable.
     *  
     *  The baseline is calculated based on the preferred height of each
     *  of the elements that have a baseline. The baseline is
     *  calculated using the following algorithm:
     *  max(maxNonBaselineHeight, maxAscent + maxDescent), where the
     *  maxNonBaselineHeight is the maximum height of all elements
     *  that do not have a baseline, or are not aligned along the baseline.
     *  maxAscent is the maximum ascent (baseline) of all elements that
     *  have a baseline and are aligned along the baseline.
     *  maxDescent is the maximum descent (preferred height - baseline)
     *  of all elements that have a baseline and are aligned along the baseline.
     *  
     *  A ParallelGroup that aligns it's elements along the baseline
     *  is only useful along the vertical axis. If you create a
     *  baseline group and use it along the horizontal axis an
     *  IllegalStateException is thrown when you ask
     *  GroupLayout for the minimum, preferred or maximum size or
     *  attempt to layout the components.
     *  
     *  Elements that are not aligned to the baseline and smaller than the size
     *  of the ParallelGroup are positioned in one of three
     *  ways: centered, anchored to the leading edge, or anchored to the
     *  trailing edge.
     * 
     *  Non-baseline ParallelGroup
     *  ParallelGroups created with an alignment other than
     *  BASELINE align elements that are smaller than the size
     *  of the group in one of three ways: centered, anchored to the
     *  leading edge, or anchored to the trailing edge.
     *  
     *  The leading edge is based on the axis and ComponentOrientation.  For the vertical axis the top edge is
     *  always the leading edge, and the bottom edge is always the
     *  trailing edge. When the ComponentOrientation is LEFT_TO_RIGHT, the leading edge is the left edge and the
     *  trailing edge the right edge. A ComponentOrientation of
     *  RIGHT_TO_LEFT flips the left and right edges. Child
     *  elements are aligned based on the specified alignment the
     *  element was added with. If you do not specify an alignment, the
     *  alignment specified for the ParallelGroup is used.
     *  
     *  To align elements along the baseline you createBaselineGroup,
     *  or createParallelGroup with an alignment of BASELINE.
     *  If the group was not created with a baseline alignment, and you attempt
     *  to add an element specifying a baseline alignment, an
     *  IllegalArgumentException is thrown.
     */
    class ParallelGroup extends GroupLayout.Group {

        /** Adds a Component to this Group. */
        @stub
        def addComponent(component: Component): ParallelGroup = ???

        /** Adds a Component to this ParallelGroup with
         *  the specified alignment.
         */
        @stub
        def addComponent(component: Component, alignment: GroupLayout.Alignment): ParallelGroup = ???

        /** Adds a Component to this ParallelGroup with the
         *  specified alignment and size.
         */
        @stub
        def addComponent(component: Component, alignment: GroupLayout.Alignment, min: Int, pref: Int, max: Int): ParallelGroup = ???

        /** Adds a Component to this Group
         *  with the specified size.
         */
        @stub
        def addComponent(component: Component, min: Int, pref: Int, max: Int): ParallelGroup = ???

        /** Adds a rigid gap to this Group. */
        @stub
        def addGap(pref: Int): ParallelGroup = ???

        /** Adds a gap to this Group with the specified size. */
        @stub
        def addGap(min: Int, pref: Int, max: Int): ParallelGroup = ???

        /** Adds a Group to this ParallelGroup with the
         *  specified alignment.
         */
        @stub
        def addGroup(alignment: GroupLayout.Alignment, group: GroupLayout.Group): ParallelGroup = ???

        /** Adds a Group to this Group. */
        @stub
        def addGroup(group: GroupLayout.Group): ParallelGroup = ???
    }


    /** A Group that positions and sizes its elements
     *  sequentially, one after another.  This class has no public
     *  constructor, use the createSequentialGroup method
     *  to create one.
     *  
     *  In order to align a SequentialGroup along the baseline
     *  of a baseline aligned ParallelGroup you need to specify
     *  which of the elements of the SequentialGroup is used to
     *  determine the baseline.  The element used to calculate the
     *  baseline is specified using one of the add methods that
     *  take a boolean. The last element added with a value of
     *  true for useAsBaseline is used to calculate the
     *  baseline.
     */
    class SequentialGroup extends GroupLayout.Group {

        /** Adds a Component to this Group. */
        @stub
        def addComponent(useAsBaseline: Boolean, component: Component): SequentialGroup = ???

        /** Adds a Component to this Group
         *  with the specified size.
         */
        @stub
        def addComponent(useAsBaseline: Boolean, component: Component, min: Int, pref: Int, max: Int): SequentialGroup = ???

        /** Adds a Component to this Group. */
        @stub
        def addComponent(component: Component): SequentialGroup = ???

        /** Adds a Component to this Group
         *  with the specified size.
         */
        @stub
        def addComponent(component: Component, min: Int, pref: Int, max: Int): SequentialGroup = ???

        /** Adds an element representing the preferred gap between an edge
         *  the container and components that touch the border of the
         *  container.
         */
        @stub
        def addContainerGap(): SequentialGroup = ???

        /** Adds an element representing the preferred gap between one
         *  edge of the container and the next or previous Component with the specified size.
         */
        @stub
        def addContainerGap(pref: Int, max: Int): SequentialGroup = ???

        /** Adds a rigid gap to this Group. */
        @stub
        def addGap(size: Int): SequentialGroup = ???

        /** Adds a gap to this Group with the specified size. */
        @stub
        def addGap(min: Int, pref: Int, max: Int): SequentialGroup = ???

        /** Adds a Group to this Group. */
        @stub
        def addGroup(useAsBaseline: Boolean, group: GroupLayout.Group): SequentialGroup = ???

        /** Adds a Group to this Group. */
        @stub
        def addGroup(group: GroupLayout.Group): SequentialGroup = ???

        /** Adds an element representing the preferred gap between two
         *  components.
         */
        @stub
        def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement): SequentialGroup = ???

        /** Adds an element representing the preferred gap between two
         *  components.
         */
        @stub
        def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement, pref: Int, max: Int): SequentialGroup = ???

        /** Adds an element representing the preferred gap between the
         *  nearest components.
         */
        @stub
        def addPreferredGap(type: LayoutStyle.ComponentPlacement): SequentialGroup = ???

        /** Adds an element representing the preferred gap between the
         *  nearest components.
         */
        @stub
        def addPreferredGap(type: LayoutStyle.ComponentPlacement, pref: Int, max: Int): SequentialGroup = ???
    }


    /** Notification that a Component has been added to
     *  the parent container.
     */
    @stub
    def addLayoutComponent(component: Component, constraints: Any): Unit = ???

    /** Notification that a Component has been added to
     *  the parent container.
     */
    @stub
    def addLayoutComponent(name: String, component: Component): Unit = ???

    /** Creates and returns a ParallelGroup that aligns it's
     *  elements along the baseline.
     */
    @stub
    def createBaselineGroup(resizable: Boolean, anchorBaselineToTop: Boolean): GroupLayout.ParallelGroup = ???

    /** Creates and returns a ParallelGroup with an alignment of
     *  Alignment.LEADING.
     */
    @stub
    def createParallelGroup(): GroupLayout.ParallelGroup = ???

    /** Creates and returns a ParallelGroup with the specified
     *  alignment.
     */
    @stub
    def createParallelGroup(alignment: GroupLayout.Alignment): GroupLayout.ParallelGroup = ???

    /** Creates and returns a ParallelGroup with the specified
     *  alignment and resize behavior.
     */
    @stub
    def createParallelGroup(alignment: GroupLayout.Alignment, resizable: Boolean): GroupLayout.ParallelGroup = ???

    /** Creates and returns a SequentialGroup. */
    @stub
    def createSequentialGroup(): GroupLayout.SequentialGroup = ???

    /** Returns true if gaps between the container and components that
     *  border the container are automatically created.
     */
    @stub
    def getAutoCreateContainerGaps(): Boolean = ???

    /** Returns true if gaps between components are automatically
     *  created.
     */
    @stub
    def getAutoCreateGaps(): Boolean = ???

    /** Returns whether component visibility is considered when sizing and
     *  positioning components.
     */
    @stub
    def getHonorsVisibility(): Boolean = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getLayoutAlignmentX(parent: Container): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getLayoutAlignmentY(parent: Container): Float = ???

    /** Returns the LayoutStyle used for calculating the preferred
     *  gap between components.
     */
    @stub
    def getLayoutStyle(): LayoutStyle = ???

    /** Invalidates the layout, indicating that if the layout manager
     *  has cached information it should be discarded.
     */
    @stub
    def invalidateLayout(parent: Container): Unit = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Forces the specified components to have the same size
     *  regardless of their preferred, minimum or maximum sizes.
     */
    @stub
    def linkSize(components: Component*): Unit = ???

    /** Forces the specified components to have the same size along the
     *  specified axis regardless of their preferred, minimum or
     *  maximum sizes.
     */
    @stub
    def linkSize(axis: Int, components: Component*): Unit = ???

    /** Returns the maximum size for the specified container. */
    @stub
    def maximumLayoutSize(parent: Container): Dimension = ???

    /** Returns the minimum size for the specified container. */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Returns the preferred size for the specified container. */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Notification that a Component has been removed from
     *  the parent container.
     */
    @stub
    def removeLayoutComponent(component: Component): Unit = ???

    /** Replaces an existing component with a new one. */
    @stub
    def replace(existingComponent: Component, newComponent: Component): Unit = ???

    /** Sets whether a gap between the container and components that
     *  touch the border of the container should automatically be
     *  created.
     */
    @stub
    def setAutoCreateContainerGaps(autoCreateContainerPadding: Boolean): Unit = ???

    /** Sets whether a gap between components should automatically be
     *  created.
     */
    @stub
    def setAutoCreateGaps(autoCreatePadding: Boolean): Unit = ???

    /** Sets whether component visibility is considered when sizing and
     *  positioning components.
     */
    @stub
    def setHonorsVisibility(honorsVisibility: Boolean): Unit = ???

    /** Sets whether the component's visibility is considered for
     *  sizing and positioning.
     */
    @stub
    def setHonorsVisibility(component: Component, honorsVisibility: Boolean): Unit = ???

    /** Sets the Group that positions and sizes
     *  components along the horizontal axis.
     */
    @stub
    def setHorizontalGroup(group: GroupLayout.Group): Unit = ???

    /** Sets the LayoutStyle used to calculate the preferred
     *  gaps between components.
     */
    @stub
    def setLayoutStyle(layoutStyle: LayoutStyle): Unit = ???

    /** Sets the Group that positions and sizes
     *  components along the vertical axis.
     */
    @stub
    def setVerticalGroup(group: GroupLayout.Group): Unit = ???

    /** Returns a string representation of this GroupLayout. */
    @stub
    def toString(): String = ???
}

object GroupLayout {
    /** Enumeration of the possible ways ParallelGroup can align
     *  its children.
     */
    class Alignment private (name: String, ordinal: Int) extends Enum[Alignment](name, ordinal) {
    }

    object Alignment {
        /** Indicates the elements should be aligned along
         *  their baseline.
         */
        final val BASELINE: Alignment = new Alignment("BASELINE", 0)

        /** Indicates the elements should be centered in
         *  the region.
         */
        final val CENTER: Alignment = new Alignment("CENTER", 1)

        /** Indicates the elements should be
         *  aligned to the origin.
         */
        final val LEADING: Alignment = new Alignment("LEADING", 2)

        /** Indicates the elements should be aligned to the end of the
         *  region.
         */
        final val TRAILING: Alignment = new Alignment("TRAILING", 3)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Alignment = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Alignment] = ???
    }


    /** Indicates the size from the component or gap should be used for a
     *  particular range value.
     */
    @stub
    val DEFAULT_SIZE: Int = ???

    /** Indicates the preferred size from the component or gap should
     *  be used for a particular range value.
     */
    @stub
    val PREFERRED_SIZE: Int = ???
}
