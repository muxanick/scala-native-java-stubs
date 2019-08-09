package javax.lang.model.element

import java.lang.{CharSequence, Object}

// An immutable sequence of characters.  When created by the same
// implementation, objects implementing this interface must obey the
// general equals contract when compared
// with each other.  Therefore, Name objects from the same
// implementation are usable in collections while Names from
// different implementations may not work properly in collections.
//
// An empty Name has a length of zero.
//
// In the context of annotation
// processing, the guarantees for "the same" implementation must
// include contexts where the API mediated side effects of processors could be visible
// to each other, including successive annotation processing
// rounds.
trait Name extends CharSequence {

    @stub
    // Compares this name to the specified CharSequence.
    def contentEquals(cs: CharSequence): Boolean = ???

    @stub
    // Returns true if the argument represents the same
    // name as this, and false otherwise.
    def equals(obj: Object): Boolean = ???
}