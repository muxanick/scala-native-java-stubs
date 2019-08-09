package java.awt.image

import java.lang.{Cloneable, Object}

// The Kernel class defines a matrix that describes how a
// specified pixel and its surrounding pixels affect the value
// computed for the pixel's position in the output image of a filtering
// operation.  The X origin and Y origin indicate the kernel matrix element
// that corresponds to the pixel position for which an output value is
// being computed.
class Kernel extends Object with Cloneable {

    @stub
    // Clones this object.
    def clone(): Object = ???

    @stub
    // Returns the height of this Kernel.
    def getHeight(): Int = ???

    @stub
    // Returns the kernel data in row major order.
    def getKernelData(data: Array[float]): Array[float] = ???

    @stub
    // Returns the width of this Kernel.
    def getWidth(): Int = ???

    @stub
    // Returns the X origin of this Kernel.
    def getXOrigin(): Int = ???
}
