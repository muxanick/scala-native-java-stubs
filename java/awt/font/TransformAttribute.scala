package java.awt.font

import java.awt.geom.AffineTransform
import java.io.Serializable
import java.lang.Object

/** The TransformAttribute class provides an immutable
 *  wrapper for a transform so that it is safe to use as an attribute.
 */
final class TransformAttribute extends Object with Serializable {

    /** Returns true if rhs is a TransformAttribute
     *  whose transform is equal to this TransformAttribute's
     *  transform.
     */
    @stub
    def equals(rhs: Object): Boolean = ???

    /** Returns a copy of the wrapped transform. */
    @stub
    def getTransform(): AffineTransform = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???
}
