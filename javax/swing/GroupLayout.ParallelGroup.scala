package javax.swing

import java.awt.Component
import java.lang.Object
import scala.scalanative.annotation.stub

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
class GroupLayout_ParallelGroup extends GroupLayout.Group {

    /** Adds a Component to this Group. */
    @stub
    def addComponent(component: Component): GroupLayout.ParallelGroup = ???

    /** Adds a Component to this ParallelGroup with
     *  the specified alignment.
     */
    @stub
    def addComponent(component: Component, alignment: GroupLayout.Alignment): GroupLayout.ParallelGroup = ???

    /** Adds a Component to this ParallelGroup with the
     *  specified alignment and size.
     */
    @stub
    def addComponent(component: Component, alignment: GroupLayout.Alignment, min: Int, pref: Int, max: Int): GroupLayout.ParallelGroup = ???

    /** Adds a Component to this Group
     *  with the specified size.
     */
    @stub
    def addComponent(component: Component, min: Int, pref: Int, max: Int): GroupLayout.ParallelGroup = ???

    /** Adds a rigid gap to this Group. */
    @stub
    def addGap(pref: Int): GroupLayout.ParallelGroup = ???

    /** Adds a gap to this Group with the specified size. */
    @stub
    def addGap(min: Int, pref: Int, max: Int): GroupLayout.ParallelGroup = ???

    /** Adds a Group to this ParallelGroup with the
     *  specified alignment.
     */
    @stub
    def addGroup(alignment: GroupLayout.Alignment, group: GroupLayout.Group): GroupLayout.ParallelGroup = ???

    /** Adds a Group to this Group. */
    @stub
    def addGroup(group: GroupLayout.Group): GroupLayout.ParallelGroup = ???
}
