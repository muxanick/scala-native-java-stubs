package java.awt

import java.lang.Object

// A type-safe enumeration of the possible back buffer contents after
// page-flipping
object final BufferCapabilities.FlipContents extends Object {

    @stub
    // When flip contents are BACKGROUND, the
    // contents of the back buffer are cleared with the background color after
    // flipping.
    def BACKGROUND: BufferCapabilities.FlipContents = ???

    @stub
    // When flip contents are COPIED, the
    // contents of the back buffer are copied to the front buffer when
    // flipping.
    def COPIED: BufferCapabilities.FlipContents = ???

    @stub
    // When flip contents are PRIOR, the
    // contents of the back buffer are the prior contents of the front buffer
    // (a true page flip).
    def PRIOR: BufferCapabilities.FlipContents = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
