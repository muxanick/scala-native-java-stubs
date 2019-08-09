package java.awt.image.renderable

import java.awt.RenderingHints
import java.awt.image.RenderedImage
import java.lang.{Object, String}
import java.util.Vector

// A RenderableImage is a common interface for rendering-independent
// images (a notion which subsumes resolution independence).  That is,
// images which are described and have operations applied to them
// independent of any specific rendering of the image.  For example, a
// RenderableImage can be rotated and cropped in
// resolution-independent terms.  Then, it can be rendered for various
// specific contexts, such as a draft preview, a high-quality screen
// display, or a printer, each in an optimal fashion.
//
//  A RenderedImage is returned from a RenderableImage via the
// createRendering() method, which takes a RenderContext.  The
// RenderContext specifies how the RenderedImage should be
// constructed.  Note that it is not possible to extract pixels
// directly from a RenderableImage.
//
//  The createDefaultRendering() and createScaledRendering() methods are
// convenience methods that construct an appropriate RenderContext
// internally.  All of the rendering methods may return a reference to a
// previously produced rendering.
trait RenderableImage {

    @stub
    // Returnd a RenderedImage instance of this image with a default
    // width and height in pixels.
    def createDefaultRendering(): RenderedImage = ???

    @stub
    // Creates a RenderedImage that represented a rendering of this image
    // using a given RenderContext.
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
    // Gets a property from the property set of this image.
    def getProperty(name: String): Object = ???

    @stub
    // Returns a list of names recognized by getProperty.
    def getPropertyNames(): Array[String] = ???

    @stub
    // Returns a vector of RenderableImages that are the sources of
    // image data for this RenderableImage.
    def getSources(): Vector[RenderableImage] = ???

    @stub
    // Gets the width in user coordinate space.
    def getWidth(): float = ???
}
