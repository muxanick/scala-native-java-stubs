package java.awt

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A FocusTraversalPolicy that determines traversal order based on the order
 *  of child Components in a Container. From a particular focus cycle root, the
 *  policy makes a pre-order traversal of the Component hierarchy, and traverses
 *  a Container's children according to the ordering of the array returned by
 *  Container.getComponents(). Portions of the hierarchy that are
 *  not visible and displayable will not be searched.
 *  
 *  By default, ContainerOrderFocusTraversalPolicy implicitly transfers focus
 *  down-cycle. That is, during normal forward focus traversal, the Component
 *  traversed after a focus cycle root will be the focus-cycle-root's default
 *  Component to focus. This behavior can be disabled using the
 *  setImplicitDownCycleTraversal method.
 *  
 *  By default, methods of this class will return a Component only if it is
 *  visible, displayable, enabled, and focusable. Subclasses can modify this
 *  behavior by overriding the accept method.
 *  
 *  This policy takes into account focus traversal
 *  policy providers.  When searching for first/last/next/previous Component,
 *  if a focus traversal policy provider is encountered, its focus traversal
 *  policy is used to perform the search operation.
 */
class ContainerOrderFocusTraversalPolicy extends FocusTraversalPolicy with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Determines whether a Component is an acceptable choice as the new
     *  focus owner.
     */
    @stub
    protected def accept(aComponent: Component): Boolean = ???

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

    /** Returns whether this ContainerOrderFocusTraversalPolicy transfers focus
     *  down-cycle implicitly.
     */
    @stub
    def getImplicitDownCycleTraversal(): Boolean = ???

    /** Returns the last Component in the traversal cycle. */
    @stub
    def getLastComponent(aContainer: Container): Component = ???

    /** Sets whether this ContainerOrderFocusTraversalPolicy transfers focus
     *  down-cycle implicitly.
     */
    @stub
    def setImplicitDownCycleTraversal(implicitDownCycleTraversal: Boolean): Unit = ???
}
