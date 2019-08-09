package java.awt.image.renderable

import java.awt.RenderingHints
import java.awt.image.RenderedImage
import scala.scalanative.annotation.stub

/** The RenderedImageFactory interface (often abbreviated RIF) is
 *  intended to be implemented by classes that wish to act as factories
 *  to produce different renderings, for example by executing a series
 *  of BufferedImageOps on a set of sources, depending on a specific
 *  set of parameters, properties, and rendering hints.
 */
trait RenderedImageFactory {

    /** Creates a RenderedImage representing the results of an imaging
     *  operation (or chain of operations) for a given ParameterBlock and
     *  RenderingHints.
     */
    @stub
    def create(paramBlock: ParameterBlock, hints: RenderingHints): RenderedImage = ???
}
