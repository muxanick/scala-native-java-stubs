package java.awt

import java.lang.{Cloneable, Object}

/** Capabilities and properties of images. */
class ImageCapabilities extends Object with Cloneable {

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Returns true if the object whose capabilities are
     *  encapsulated in this ImageCapabilities can be or is
     *  accelerated.
     */
    @stub
    def isAccelerated(): Boolean = ???
}
