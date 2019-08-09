package java.awt

import java.lang.Object
import scala.scalanative.annotation.stub

/** The DisplayMode class encapsulates the bit depth, height,
 *  width, and refresh rate of a GraphicsDevice. The ability to
 *  change graphics device's display mode is platform- and
 *  configuration-dependent and may not always be available
 *  (see GraphicsDevice.isDisplayChangeSupported()).
 *  
 *  For more information on full-screen exclusive mode API, see the
 *  
 *  Full-Screen Exclusive Mode API Tutorial.
 */
final class DisplayMode extends Object {

    /** Create a new display mode object with the supplied parameters. */
    @stub
    def this(width: Int, height: Int, bitDepth: Int, refreshRate: Int) = ???

    /** Returns whether the two display modes are equal. */
    @stub
    def equals(dm: DisplayMode): Boolean = ???

    /** Indicates whether some other object is "equal to" this one. */
    @stub
    def equals(dm: Object): Boolean = ???

    /** Returns the bit depth of the display, in bits per pixel. */
    @stub
    def getBitDepth(): Int = ???

    /** Returns the height of the display, in pixels. */
    @stub
    def getHeight(): Int = ???

    /** Returns the refresh rate of the display, in hertz. */
    @stub
    def getRefreshRate(): Int = ???

    /** Returns the width of the display, in pixels. */
    @stub
    def getWidth(): Int = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???
}

object DisplayMode {
    /** Value of the bit depth if multiple bit depths are supported in this
     *  display mode.
     */
    @stub
    val BIT_DEPTH_MULTI: Int = ???

    /** Value of the refresh rate if not known. */
    @stub
    val REFRESH_RATE_UNKNOWN: Int = ???
}
