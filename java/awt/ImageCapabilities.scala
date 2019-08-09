package java.awt

import java.lang.{Cloneable, Object}

// Capabilities and properties of images.
class ImageCapabilities extends Object with Cloneable {

    @stub
    // Creates and returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns true if the object whose capabilities are
    // encapsulated in this ImageCapabilities can be or is
    // accelerated.
    def isAccelerated(): Boolean = ???
}
