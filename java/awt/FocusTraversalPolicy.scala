package java.awt

import java.lang.Object

/** A FocusTraversalPolicy defines the order in which Components with a
 *  particular focus cycle root are traversed. Instances can apply the policy to
 *  arbitrary focus cycle roots, allowing themselves to be shared across
 *  Containers. They do not need to be reinitialized when the focus cycle roots
 *  of a Component hierarchy change.
 *  
 *  The core responsibility of a FocusTraversalPolicy is to provide algorithms
 *  determining the next and previous Components to focus when traversing
 *  forward or backward in a UI. Each FocusTraversalPolicy must also provide
 *  algorithms for determining the first, last, and default Components in a
 *  traversal cycle. First and last Components are used when normal forward and
 *  backward traversal, respectively, wraps. The default Component is the first
 *  to receive focus when traversing down into a new focus traversal cycle.
 *  A FocusTraversalPolicy can optionally provide an algorithm for determining
 *  a Window's initial Component. The initial Component is the first to receive
 *  focus when a Window is first made visible.
 *  
 *  FocusTraversalPolicy takes into account focus traversal
 *  policy providers.  When searching for first/last/next/previous Component,
 *  if a focus traversal policy provider is encountered, its focus traversal
 *  policy is used to perform the search operation.
 *  
 *  Please see
 *  
 *  How to Use the Focus Subsystem,
 *  a section in The Java Tutorial, and the
 *  Focus Specification
 *  for more information.
 */
abstract class FocusTraversalPolicy extends Object {

    /** Returns the Component that should receive the focus after aComponent. */
    def getComponentAfter(aContainer: Container, aComponent: Component): Component

    /** Returns the Component that should receive the focus before aComponent. */
    def getComponentBefore(aContainer: Container, aComponent: Component): Component

    /** Returns the default Component to focus. */
    def getDefaultComponent(aContainer: Container): Component

    /** Returns the first Component in the traversal cycle. */
    def getFirstComponent(aContainer: Container): Component

    /** Returns the Component that should receive the focus when a Window is
     *  made visible for the first time.
     */
    def getInitialComponent(window: Window): Component
}
