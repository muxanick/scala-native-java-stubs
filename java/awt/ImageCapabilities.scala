package java.awt

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** Capabilities and properties of images. */
class ImageCapabilities extends Object with Cloneable {

    /** Creates a new object for specifying image capabilities. */
    @stub
    def this(accelerated: Boolean) = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Returns true if the object whose capabilities are
     *  encapsulated in this ImageCapabilities can be or is
     *  accelerated.
     */
    @stub
    def isAccelerated(): Boolean = ???

    /** Returns true if the VolatileImage
     *  described by this ImageCapabilities can lose
     *  its surfaces.
     */
    @stub
    def isTrueVolatile(): Boolean = ???
}
