package java.awt

import java.awt.geom.{AffineTransform, Rectangle2D}
import java.awt.image.{BufferedImage, ColorModel}
import java.lang.Object
import scala.scalanative.annotation.stub

/** The TexturePaint class provides a way to fill a
 *  Shape with a texture that is specified as
 *  a BufferedImage. The size of the BufferedImage
 *  object should be small because the BufferedImage data
 *  is copied by the TexturePaint object.
 *  At construction time, the texture is anchored to the upper
 *  left corner of a Rectangle2D that is
 *  specified in user space.  Texture is computed for
 *  locations in the device space by conceptually replicating the
 *  specified Rectangle2D infinitely in all directions
 *  in user space and mapping the BufferedImage to each
 *  replicated Rectangle2D.
 */
class TexturePaint extends Object with Paint {

    /** Constructs a TexturePaint object. */
    @stub
    def this(txtr: BufferedImage, anchor: Rectangle2D) = ???

    /** Creates and returns a PaintContext used to
     *  generate a tiled image pattern.
     */
    @stub
    def createContext(cm: ColorModel, deviceBounds: Rectangle, userBounds: Rectangle2D, xform: AffineTransform, hints: RenderingHints): PaintContext = ???

    /** Returns a copy of the anchor rectangle which positions and
     *  sizes the textured image.
     */
    @stub
    def getAnchorRect(): Rectangle2D = ???

    /** Returns the BufferedImage texture used to
     *  fill the shapes.
     */
    @stub
    def getImage(): BufferedImage = ???

    /** Returns the transparency mode for this TexturePaint. */
    @stub
    def getTransparency(): Int = ???
}
