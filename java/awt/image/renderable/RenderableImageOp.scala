package java.awt.image.renderable

import java.awt.RenderingHints
import java.awt.image.RenderedImage
import java.lang.{Object, String}
import java.util.Vector

/** This class handles the renderable aspects of an operation with help
 *  from its associated instance of a ContextualRenderedImageFactory.
 */
class RenderableImageOp extends Object with RenderableImage {

    /** Gets a RenderedImage instance of this image with a default
     *  width and height in pixels.
     */
    @stub
    def createDefaultRendering(): RenderedImage = ???

    /** Creates a RenderedImage which represents this
     *  RenderableImageOp (including its Renderable sources) rendered
     *  according to the given RenderContext.
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

    /** Returns a reference to the current parameter block. */
    @stub
    def getParameterBlock(): ParameterBlock = ???

    /** Gets a property from the property set of this image. */
    @stub
    def getProperty(name: String): Object = ???

    /** Return a list of names recognized by getProperty. */
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
