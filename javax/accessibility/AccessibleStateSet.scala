package javax.accessibility

import java.lang.{Object, String}
import java.util.Vector
import scala.scalanative.annotation.stub

/** Class AccessibleStateSet determines a component's state set.  The state set
 *  of a component is a set of AccessibleState objects and descriptions. E.G., The
 *  current overall state of the object, such as whether it is enabled,
 *  has focus, etc.
 */
class AccessibleStateSet extends Object {

    /** Creates a new empty state set. */
    @stub
    def this() = ???

    /** Creates a new state with the initial set of states contained in
     *  the array of states passed in.
     */
    @stub
    def this(states: Array[AccessibleState]) = ???

    /** Each entry in the Vector represents an AccessibleState. */
    @stub
    protected val states: Vector[AccessibleState] = ???

    /** Adds a new state to the current state set if it is not already
     *  present.
     */
    @stub
    def add(state: AccessibleState): Boolean = ???

    /** Adds all of the states to the existing state set. */
    @stub
    def addAll(states: Array[AccessibleState]): Unit = ???

    /** Removes all the states from the current state set. */
    @stub
    def clear(): Unit = ???

    /** Checks if the current state is in the state set. */
    @stub
    def contains(state: AccessibleState): Boolean = ???

    /** Removes a state from the current state set. */
    @stub
    def remove(state: AccessibleState): Boolean = ???

    /** Returns the current state set as an array of AccessibleState */
    @stub
    def toArray(): Array[AccessibleState] = ???

    /** Creates a localized String representing all the states in the set
     *  using the default locale.
     */
    @stub
    def toString(): String = ???
}
