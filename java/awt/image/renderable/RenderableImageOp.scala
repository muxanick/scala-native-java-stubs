package java.awt.image.renderable

import java.awt.RenderingHints
import java.awt.image.RenderedImage
import java.lang.{Object, String}
import java.util.Vector

// This class handles the renderable aspects of an operation with help
// from its associated instance of a ContextualRenderedImageFactory.
class RenderableImageOp extends Object with RenderableImage {

    @stub
    // Gets a RenderedImage instance of this image with a default
    // width and height in pixels.
    def createDefaultRendering(): RenderedImage = ???

    @stub
    // Creates a RenderedImage which represents this
    // RenderableImageOp (including its Renderable sources) rendered
    // according to the given RenderContext.
    def createRendering(renderContext: RenderContext): RenderedImage = ???

    @stub
    // Creates a RenderedImage instance of this image with width w, and
    // height h in pixels.
    def createScaledRendering(w: Int, h: Int, hints: RenderingHints): RenderedImage = ???

    @stub
    // Gets the height in user coordinate space.
    def getHeight(): float = ???

    @stub
    // Gets the minimum X coordinate of the rendering-independent image data.
    def getMinX(): float = ???

    @stub
    // Gets the minimum Y coordinate of the rendering-independent image data.
    def getMinY(): float = ???

    @stub
    // Returns a reference to the current parameter block.
    def getParameterBlock(): ParameterBlock = ???

    @stub
    // Gets a property from the property set of this image.
    def getProperty(name: String): Object = ???

    @stub
    // Return a list of names recognized by getProperty.
    def getPropertyNames(): Array[String] = ???

    @stub
    // Returns a vector of RenderableImages that are the sources of
    // image data for this RenderableImage.
    def getSources(): Vector[RenderableImage] = ???

    @stub
    // Gets the width in user coordinate space.
    def getWidth(): float = ???

    @stub
    // Returns true if successive renderings (that is, calls to
    // createRendering() or createScaledRendering()) with the same arguments
    // may produce different results.
    def isDynamic(): Boolean = ???
}
