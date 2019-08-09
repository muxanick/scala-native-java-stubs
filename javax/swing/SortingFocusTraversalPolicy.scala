package javax.swing

import java.awt.{Component, Container, FocusTraversalPolicy}
import java.lang.Object
import java.util.Comparator
import scala.scalanative.annotation.stub

/** A FocusTraversalPolicy that determines traversal order by sorting the
 *  Components of a focus traversal cycle based on a given Comparator. Portions
 *  of the Component hierarchy that are not visible and displayable will not be
 *  included.
 *  
 *  By default, SortingFocusTraversalPolicy implicitly transfers focus down-
 *  cycle. That is, during normal focus traversal, the Component
 *  traversed after a focus cycle root will be the focus-cycle-root's default
 *  Component to focus. This behavior can be disabled using the
 *  setImplicitDownCycleTraversal method.
 *  
 *  By default, methods of this class with return a Component only if it is
 *  visible, displayable, enabled, and focusable. Subclasses can modify this
 *  behavior by overriding the accept method.
 *  
 *  This policy takes into account focus traversal
 *  policy providers.  When searching for first/last/next/previous Component,
 *  if a focus traversal policy provider is encountered, its focus traversal
 *  policy is used to perform the search operation.
 */
class SortingFocusTraversalPolicy extends InternalFrameFocusTraversalPolicy {

    /** Constructs a SortingFocusTraversalPolicy without a Comparator. */
    @stub
    protected def this() = ???

    /** Constructs a SortingFocusTraversalPolicy with the specified Comparator. */
    @stub
    def this(comparator: Comparator[_ >: Component]) = ???

    /** Determines whether a Component is an acceptable choice as the new
     *  focus owner.
     */
    @stub
    protected def accept(aComponent: Component): Boolean = ???

    /** Returns the Comparator which will be used to sort the Components in a
     *  focus traversal cycle.
     */
    @stub
    protected def getComparator(): Comparator[_ >: Component] = ???

    /** Returns the Component that should receive the focus after aComponent. */
    @stub
    def getComponentAfter(aContainer: Container, aComponent: Component): Component = ???

    /** Returns the Component that should receive the focus before aComponent. */
    @stub
    def getComponentBefore(aContainer: Container, aComponent: Component): Component = ???

    /** Returns the default Component to focus. */
    @stub
    def getDefaultComponent(aContainer: Container): Component = ???

    /** Returns the first Component in the traversal cycle. */
    @stub
    def getFirstComponent(aContainer: Container): Component = ???

    /** Returns whether this SortingFocusTraversalPolicy transfers focus down-
     *  cycle implicitly.
     */
    @stub
    def getImplicitDownCycleTraversal(): Boolean = ???

    /** Returns the last Component in the traversal cycle. */
    @stub
    def getLastComponent(aContainer: Container): Component = ???

    /** Sets the Comparator which will be used to sort the Components in a
     *  focus traversal cycle.
     */
    @stub
    protected def setComparator(comparator: Comparator[_ >: Component]): Unit = ???

    /** Sets whether this SortingFocusTraversalPolicy transfers focus down-cycle
     *  implicitly.
     */
    @stub
    def setImplicitDownCycleTraversal(implicitDownCycleTraversal: Boolean): Unit = ???
}
