package java.awt.image.renderable

import java.awt.image.{ImageConsumer, ImageProducer}
import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** An adapter class that implements ImageProducer to allow the
 *  asynchronous production of a RenderableImage.  The size of the
 *  ImageConsumer is determined by the scale factor of the usr2dev
 *  transform in the RenderContext.  If the RenderContext is null, the
 *  default rendering of the RenderableImage is used.  This class
 *  implements an asynchronous production that produces the image in
 *  one thread at one resolution.  This class may be subclassed to
 *  implement versions that will render the image using several
 *  threads.  These threads could render either the same image at
 *  progressively better quality, or different sections of the image at
 *  a single resolution.
 */
class RenderableImageProducer extends Object with ImageProducer with Runnable {

    /** Constructs a new RenderableImageProducer from a RenderableImage
     *  and a RenderContext.
     */
    @stub
    def this(rdblImage: RenderableImage, rc: RenderContext) = ???

    /** Adds an ImageConsumer to the list of consumers interested in
     *  data for this image.
     */
    @stub
    def addConsumer(ic: ImageConsumer): Unit = ???

    /** Determine if an ImageConsumer is on the list of consumers
     *  currently interested in data for this image.
     */
    @stub
    def isConsumer(ic: ImageConsumer): Boolean = ???

    /** Remove an ImageConsumer from the list of consumers interested in
     *  data for this image.
     */
    @stub
    def removeConsumer(ic: ImageConsumer): Unit = ???

    /** Requests that a given ImageConsumer have the image data delivered
     *  one more time in top-down, left-right order.
     */
    @stub
    def requestTopDownLeftRightResend(ic: ImageConsumer): Unit = ???

    /** The runnable method for this class. */
    @stub
    def run(): Unit = ???

    /** Sets a new RenderContext to use for the next startProduction() call. */
    @stub
    def setRenderContext(rc: RenderContext): Unit = ???

    /** Adds an ImageConsumer to the list of consumers interested in
     *  data for this image, and immediately starts delivery of the
     *  image data through the ImageConsumer interface.
     */
    @stub
    def startProduction(ic: ImageConsumer): Unit = ???
}
