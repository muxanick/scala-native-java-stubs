package java.awt

import java.awt.image.{BufferStrategy, VolatileImage}
import java.lang.Object

// Inner class for blitting offscreen surfaces to a component.
protected class Component.BltBufferStrategy extends BufferStrategy {

    @stub
    // The back buffers
    protected def backBuffers: Array[VolatileImage] = ???

    @stub
    // The buffering capabilities
    protected def caps: BufferCapabilities = ???

    @stub
    // 
    protected def height: Int = ???

    @stub
    // Whether or not the drawing buffer has been recently restored from
    // a lost state.
    protected def validatedContents: Boolean = ???

    @stub
    // Returns whether the drawing buffer was lost since the last call to
    // getDrawGraphics.
    def contentsLost(): Boolean = ???

    @stub
    // Returns whether the drawing buffer was recently restored from a lost
    // state and reinitialized to the default background color (white).
    def contentsRestored(): Boolean = ???

    @stub
    // Creates the back buffers
    protected def createBackBuffers(numBuffers: Int): Unit = ???

    @stub
    // Releases system resources currently consumed by this
    // BufferStrategy and
    // removes it from the associated Component.
    def dispose(): Unit = ???

    @stub
    // Returns the BufferCapabilities for this
    // BufferStrategy.
    def getCapabilities(): BufferCapabilities = ???

    @stub
    // Creates a graphics context for the drawing buffer.
    def getDrawGraphics(): Graphics = ???

    @stub
    // Restore the drawing buffer if it has been lost
    protected def revalidate(): Unit = ???
}
