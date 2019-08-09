package java.awt.font

import java.awt.geom.AffineTransform
import java.io.Serializable
import java.lang.Object

// The TransformAttribute class provides an immutable
// wrapper for a transform so that it is safe to use as an attribute.
final class TransformAttribute extends Object with Serializable {

    @stub
    // Returns true if rhs is a TransformAttribute
    // whose transform is equal to this TransformAttribute's
    // transform.
    def equals(rhs: Object): Boolean = ???

    @stub
    // Returns a copy of the wrapped transform.
    def getTransform(): AffineTransform = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
