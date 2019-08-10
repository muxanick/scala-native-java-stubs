package javax.swing

import java.awt.Component
import java.lang.Object
import scala.scalanative.annotation.stub

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
abstract class GroupLayout_Group extends Object {

    /** Adds a Component to this Group. */
    def addComponent(component: Component): GroupLayout.Group

    /** Adds a Component to this Group
     *  with the specified size.
     */
    def addComponent(component: Component, min: Int, pref: Int, max: Int): GroupLayout.Group

    /** Adds a rigid gap to this Group. */
    def addGap(size: Int): GroupLayout.Group

    /** Adds a gap to this Group with the specified size. */
    def addGap(min: Int, pref: Int, max: Int): GroupLayout.Group

    /** Adds a Group to this Group. */
    def addGroup(group: GroupLayout.Group): GroupLayout.Group
}
