package java.awt

import java.awt.image.{BufferStrategy, VolatileImage}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Inner class for flipping buffers on a component.  That component must
 *  be a Canvas or Window.
 */
protected class Component_FlipBufferStrategy extends BufferStrategy {

    /** Creates a new flipping buffer strategy for this component. */
    @stub
    protected def FlipBufferStrategy(numBuffers: Int, caps: BufferCapabilities) = ???

    /** The buffering capabilities */
    @stub
    protected val caps: BufferCapabilities = ???

    /** The drawing buffer */
    @stub
    protected val drawBuffer: Image = ???

    /** The drawing buffer as a volatile image */
    @stub
    protected val drawVBuffer: VolatileImage = ???

    /** The number of buffers */
    @stub
    protected val numBuffers: Int = ???

    /** Whether or not the drawing buffer has been recently restored from
     *  a lost state.
     */
    @stub
    protected val validatedContents: Boolean = ???

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

    /** Creates one or more complex, flipping buffers with the given
     *  capabilities.
     */
    @stub
    protected def createBuffers(numBuffers: Int, caps: BufferCapabilities): Unit = ???

    /** Destroys the buffers created through this object */
    @stub
    protected def destroyBuffers(): Unit = ???

    /** Releases system resources currently consumed by this
     *  BufferStrategy and
     *  removes it from the associated Component.
     */
    @stub
    def dispose(): Unit = ???

    /** Flipping moves the contents of the back buffer to the front buffer,
     *  either by copying or by moving the video pointer.
     */
    @stub
    protected def flip(flipAction: BufferCapabilities.FlipContents): Unit = ???

    /**  */
    @stub
    protected def getBackBuffer(): Image = ???

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

    /** Makes the next available buffer visible by either blitting or
     *  flipping.
     */
    @stub
    def show(): Unit = ???
}
