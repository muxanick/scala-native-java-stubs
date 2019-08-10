package java.awt

import java.awt.image.{BufferStrategy, VolatileImage}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Inner class for blitting offscreen surfaces to a component. */
protected class Component_BltBufferStrategy extends BufferStrategy {

    /** Creates a new blt buffer strategy around a component */
    @stub
    protected def BltBufferStrategy(numBuffers: Int, caps: BufferCapabilities) = ???

    /** The back buffers */
    @stub
    protected val backBuffers: Array[VolatileImage] = ???

    /** The buffering capabilities */
    @stub
    protected val caps: BufferCapabilities = ???

    /**  */
    @stub
    protected val height: Int = ???

    /** Whether or not the drawing buffer has been recently restored from
     *  a lost state.
     */
    @stub
    protected val validatedContents: Boolean = ???

    /** Size of the back buffers */
    @stub
    protected val width: Int = ???

    /** Returns whether the drawing buffer was lost since the last call to
     *  getDrawGraphics.
     */
    @stub
    def contentsLost(): Boolean = ???

    /** Returns whether the drawing buffer was recently restored from a lost
     *  state and reinitialized to the default background color (white).
     */
    @stub
    def contentsRestored(): Boolean = ???

    /** Creates the back buffers */
    @stub
    protected def createBackBuffers(numBuffers: Int): Unit = ???

    /** Releases system resources currently consumed by this
     *  BufferStrategy and
     *  removes it from the associated Component.
     */
    @stub
    def dispose(): Unit = ???

    /** Returns the BufferCapabilities for this
     *  BufferStrategy.
     */
    @stub
    def getCapabilities(): BufferCapabilities = ???

    /** Creates a graphics context for the drawing buffer. */
    @stub
    def getDrawGraphics(): Graphics = ???

    /** Restore the drawing buffer if it has been lost */
    @stub
    protected def revalidate(): Unit = ???

    /** Makes the next available buffer visible. */
    @stub
    def show(): Unit = ???
}
