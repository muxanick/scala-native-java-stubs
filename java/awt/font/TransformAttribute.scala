package java.awt.font

import java.awt.geom.AffineTransform
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The TransformAttribute class provides an immutable
 *  wrapper for a transform so that it is safe to use as an attribute.
 */
final class TransformAttribute extends Object with Serializable {

    /** Wraps the specified transform. */
    @stub
    def this(transform: AffineTransform) = ???

    /** Returns true if rhs is a TransformAttribute
     *  whose transform is equal to this TransformAttribute's
     *  transform.
     */
    @stub
    def equals(rhs: Any): Boolean = ???

    /** Returns a copy of the wrapped transform. */
    @stub
    def getTransform(): AffineTransform = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the wrapped transform is
     *  an identity transform.
     */
    @stub
    def isIdentity(): Boolean = ???
}

object TransformAttribute {
    /** A TransformAttribute representing the identity transform. */
    @stub
    val IDENTITY: TransformAttribute = ???
}
