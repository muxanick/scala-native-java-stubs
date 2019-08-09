package java.awt

import java.lang.{Cloneable, Object}

/** Capabilities and properties of buffers. */
class BufferCapabilities extends Object with Cloneable {

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Object = ???

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
}
