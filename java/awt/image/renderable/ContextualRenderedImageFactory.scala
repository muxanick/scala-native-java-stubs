package java.awt.image.renderable

import java.awt.geom.Rectangle2D
import java.awt.image.RenderedImage
import java.lang.{Object, String}

/** ContextualRenderedImageFactory provides an interface for the
 *  functionality that may differ between instances of
 *  RenderableImageOp.  Thus different operations on RenderableImages
 *  may be performed by a single class such as RenderedImageOp through
 *  the use of multiple instances of ContextualRenderedImageFactory.
 *  The name ContextualRenderedImageFactory is commonly shortened to
 *  "CRIF."
 * 
 *   All operations that are to be used in a rendering-independent
 *  chain must implement ContextualRenderedImageFactory.
 * 
 *   Classes that implement this interface must provide a
 *  constructor with no arguments.
 */
trait ContextualRenderedImageFactory extends RenderedImageFactory {

    /** Creates a rendering, given a RenderContext and a ParameterBlock
     *  containing the operation's sources and parameters.
     */
    @stub
    def create(renderContext: RenderContext, paramBlock: ParameterBlock): RenderedImage = ???

    /** Returns the bounding box for the output of the operation,
     *  performed on a given set of sources, in rendering-independent
     *  space.
     */
    @stub
    def getBounds2D(paramBlock: ParameterBlock): Rectangle2D = ???

    /** Gets the appropriate instance of the property specified by the name
     *  parameter.
     */
    @stub
    def getProperty(paramBlock: ParameterBlock, name: String): Object = ???

    /** Returns a list of names recognized by getProperty. */
    @stub
    def getPropertyNames(): Array[String] = ???

    /** Returns true if successive renderings (that is, calls to
     *  create(RenderContext, ParameterBlock)) with the same arguments
     *  may produce different results.
     */
    @stub
    def isDynamic(): Boolean = ???
}
