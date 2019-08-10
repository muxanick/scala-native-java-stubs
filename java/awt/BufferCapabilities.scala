package java.awt

import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Capabilities and properties of buffers. */
class BufferCapabilities extends Object with Cloneable {

    /** Creates a new object for specifying buffering capabilities */
    @stub
    def this(frontCaps: ImageCapabilities, backCaps: ImageCapabilities, flipContents: BufferCapabilities.FlipContents) = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /**  */
    @stub
    def getBackBufferCapabilities(): ImageCapabilities = ???

    /**  */
    @stub
    def getFlipContents(): BufferCapabilities.FlipContents = ???

    /**  */
    @stub
    def getFrontBufferCapabilities(): ImageCapabilities = ???

    /**  */
    @stub
    def isFullScreenRequired(): Boolean = ???

    /**  */
    @stub
    def isMultiBufferAvailable(): Boolean = ???

    /**  */
    @stub
    def isPageFlipping(): Boolean = ???
}

object BufferCapabilities {
    /** A type-safe enumeration of the possible back buffer contents after
     *  page-flipping
     */
    final object FlipContents extends Object {

        /** When flip contents are BACKGROUND, the
         *  contents of the back buffer are cleared with the background color after
         *  flipping.
         */
        @stub
        val BACKGROUND: FlipContents = ???

        /** When flip contents are COPIED, the
         *  contents of the back buffer are copied to the front buffer when
         *  flipping.
         */
        @stub
        val COPIED: FlipContents = ???

        /** When flip contents are PRIOR, the
         *  contents of the back buffer are the prior contents of the front buffer
         *  (a true page flip).
         */
        @stub
        val PRIOR: FlipContents = ???

        /** When flip contents are UNDEFINED, the
         *  contents of the back buffer are undefined after flipping.
         */
        @stub
        val UNDEFINED: FlipContents = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }

}
