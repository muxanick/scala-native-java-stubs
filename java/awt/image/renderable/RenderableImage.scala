package java.awt.image.renderable

import java.awt.RenderingHints
import java.awt.image.RenderedImage
import java.lang.{Object, String}
import java.util.Vector
import scala.scalanative.annotation.stub

/** A RenderableImage is a common interface for rendering-independent
 *  images (a notion which subsumes resolution independence).  That is,
 *  images which are described and have operations applied to them
 *  independent of any specific rendering of the image.  For example, a
 *  RenderableImage can be rotated and cropped in
 *  resolution-independent terms.  Then, it can be rendered for various
 *  specific contexts, such as a draft preview, a high-quality screen
 *  display, or a printer, each in an optimal fashion.
 * 
 *   A RenderedImage is returned from a RenderableImage via the
 *  createRendering() method, which takes a RenderContext.  The
 *  RenderContext specifies how the RenderedImage should be
 *  constructed.  Note that it is not possible to extract pixels
 *  directly from a RenderableImage.
 * 
 *   The createDefaultRendering() and createScaledRendering() methods are
 *  convenience methods that construct an appropriate RenderContext
 *  internally.  All of the rendering methods may return a reference to a
 *  previously produced rendering.
 */
trait RenderableImage {

    /** Returnd a RenderedImage instance of this image with a default
     *  width and height in pixels.
     */
    @stub
    def createDefaultRendering(): RenderedImage = ???

    /** Creates a RenderedImage that represented a rendering of this image
     *  using a given RenderContext.
     */
    @stub
    def createRendering(renderContext: RenderContext): RenderedImage = ???

    /** Creates a RenderedImage instance of this image with width w, and
     *  height h in pixels.
     */
    @stub
    def createScaledRendering(w: Int, h: Int, hints: RenderingHints): RenderedImage = ???

    /** Gets the height in user coordinate space. */
    @stub
    def getHeight(): Float = ???

    /** Gets the minimum X coordinate of the rendering-independent image data. */
    @stub
    def getMinX(): Float = ???

    /** Gets the minimum Y coordinate of the rendering-independent image data. */
    @stub
    def getMinY(): Float = ???

    /** Gets a property from the property set of this image. */
    @stub
    def getProperty(name: String): Any = ???

    /** Returns a list of names recognized by getProperty. */
    @stub
    def getPropertyNames(): Array[String] = ???

    /** Returns a vector of RenderableImages that are the sources of
     *  image data for this RenderableImage.
     */
    @stub
    def getSources(): Vector[RenderableImage] = ???

    /** Gets the width in user coordinate space. */
    @stub
    def getWidth(): Float = ???

    /** Returns true if successive renderings (that is, calls to
     *  createRendering() or createScaledRendering()) with the same arguments
     *  may produce different results.
     */
    @stub
    def isDynamic(): Boolean = ???
}

object RenderableImage {
    /** String constant that can be used to identify a property on
     *  a RenderedImage obtained via the createRendering or
     *  createScaledRendering methods.
     */
    @stub
    val HINTS_OBSERVED: String = ???
}
