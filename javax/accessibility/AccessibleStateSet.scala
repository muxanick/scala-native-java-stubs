package javax.accessibility

import java.lang.Object

// Class AccessibleStateSet determines a component's state set.  The state set
// of a component is a set of AccessibleState objects and descriptions. E.G., The
// current overall state of the object, such as whether it is enabled,
// has focus, etc.
class AccessibleStateSet extends Object {

    @stub
    // Creates a new empty state set.
    def this() = ???

    @stub
    // Adds a new state to the current state set if it is not already
    // present.
    def add(state: AccessibleState): Boolean = ???

    @stub
    // Adds all of the states to the existing state set.
    def addAll(states: Array[AccessibleState]): Unit = ???

    @stub
    // Removes all the states from the current state set.
    def clear(): Unit = ???

    @stub
    // Checks if the current state is in the state set.
    def contains(state: AccessibleState): Boolean = ???

    @stub
    // Removes a state from the current state set.
    def remove(state: AccessibleState): Boolean = ???

    @stub
    // Returns the current state set as an array of AccessibleState
    def toArray(): Array[AccessibleState] = ???
}
