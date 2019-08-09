package java.awt.image

import java.lang.{Cloneable, Object}

/** The Kernel class defines a matrix that describes how a
 *  specified pixel and its surrounding pixels affect the value
 *  computed for the pixel's position in the output image of a filtering
 *  operation.  The X origin and Y origin indicate the kernel matrix element
 *  that corresponds to the pixel position for which an output value is
 *  being computed.
 */
class Kernel extends Object with Cloneable {

    /** Clones this object. */
    @stub
    def clone(): Object = ???

    /** Returns the height of this Kernel. */
    @stub
    def getHeight(): Int = ???

    /** Returns the kernel data in row major order. */
    @stub
    def getKernelData(data: Array[Float]): Array[Float] = ???

    /** Returns the width of this Kernel. */
    @stub
    def getWidth(): Int = ???

    /** Returns the X origin of this Kernel. */
    @stub
    def getXOrigin(): Int = ???
}
