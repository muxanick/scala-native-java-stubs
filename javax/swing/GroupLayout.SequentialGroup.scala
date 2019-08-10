package javax.swing

import java.awt.Component
import java.lang.Object
import scala.scalanative.annotation.stub

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
class GroupLayout_SequentialGroup extends GroupLayout.Group {

    /** Adds a Component to this Group. */
    @stub
    def addComponent(useAsBaseline: Boolean, component: Component): GroupLayout.SequentialGroup = ???

    /** Adds a Component to this Group
     *  with the specified size.
     */
    @stub
    def addComponent(useAsBaseline: Boolean, component: Component, min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    /** Adds a Component to this Group. */
    @stub
    def addComponent(component: Component): GroupLayout.SequentialGroup = ???

    /** Adds a Component to this Group
     *  with the specified size.
     */
    @stub
    def addComponent(component: Component, min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between an edge
     *  the container and components that touch the border of the
     *  container.
     */
    @stub
    def addContainerGap(): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between one
     *  edge of the container and the next or previous Component with the specified size.
     */
    @stub
    def addContainerGap(pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    /** Adds a rigid gap to this Group. */
    @stub
    def addGap(size: Int): GroupLayout.SequentialGroup = ???

    /** Adds a gap to this Group with the specified size. */
    @stub
    def addGap(min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    /** Adds a Group to this Group. */
    @stub
    def addGroup(useAsBaseline: Boolean, group: GroupLayout.Group): GroupLayout.SequentialGroup = ???

    /** Adds a Group to this Group. */
    @stub
    def addGroup(group: GroupLayout.Group): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between two
     *  components.
     */
    @stub
    def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between two
     *  components.
     */
    @stub
    def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between the
     *  nearest components.
     */
    @stub
    def addPreferredGap(type: LayoutStyle.ComponentPlacement): GroupLayout.SequentialGroup = ???

    /** Adds an element representing the preferred gap between the
     *  nearest components.
     */
    @stub
    def addPreferredGap(type: LayoutStyle.ComponentPlacement, pref: Int, max: Int): GroupLayout.SequentialGroup = ???
}
