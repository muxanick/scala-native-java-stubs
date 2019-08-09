package java.awt

import java.lang.Object

// Defines the base type of all keys used along with the
// RenderingHints class to control various
// algorithm choices in the rendering and imaging pipelines.
// Instances of this class are immutable and unique which
// means that tests for matches can be made using the
// == operator instead of the more expensive
// equals() method.
object abstract RenderingHints.Key extends Object {

    @stub
    // The equals method for all Key objects will return the same
    // result as the equality operator '=='.
    def equals(o: Object): Boolean = ???

    @stub
    // The hash code for all Key objects will be the same as the
    // system identity code of the object as defined by the
    // System.identityHashCode() method.
    def hashCode(): Int = ???

    @stub
    // Returns the private integer key that the subclass
    // instantiated this Key with.
    protected def intKey(): Int = ???
}
