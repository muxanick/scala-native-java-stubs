package java.awt

import java.lang.{Cloneable, Object}
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
    type FlipContents = BufferCapabilities_FlipContents
}
