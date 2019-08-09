package java.awt

import java.lang.Object

// The DisplayMode class encapsulates the bit depth, height,
// width, and refresh rate of a GraphicsDevice. The ability to
// change graphics device's display mode is platform- and
// configuration-dependent and may not always be available
// (see GraphicsDevice.isDisplayChangeSupported()).
// 
// For more information on full-screen exclusive mode API, see the
// 
// Full-Screen Exclusive Mode API Tutorial.
final class DisplayMode extends Object {

    @stub
    // Returns whether the two display modes are equal.
    def equals(dm: DisplayMode): Boolean = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(dm: Object): Boolean = ???

    @stub
    // Returns the bit depth of the display, in bits per pixel.
    def getBitDepth(): Int = ???

    @stub
    // Returns the height of the display, in pixels.
    def getHeight(): Int = ???

    @stub
    // Returns the refresh rate of the display, in hertz.
    def getRefreshRate(): Int = ???

    @stub
    // Returns the width of the display, in pixels.
    def getWidth(): Int = ???
}

object DisplayMode {
    @stub
    // Value of the bit depth if multiple bit depths are supported in this
    // display mode.
    def BIT_DEPTH_MULTI: Int = ???
}
