package java.awt.image

import java.awt.geom.{Point2D, Rectangle2D}

/** This interface describes single-input/single-output
 *  operations performed on BufferedImage objects.
 *  It is implemented by AffineTransformOp,
 *  ConvolveOp, ColorConvertOp, RescaleOp,
 *  and LookupOp.  These objects can be passed into
 *  a BufferedImageFilter to operate on a
 *  BufferedImage in the
 *  ImageProducer-ImageFilter-ImageConsumer paradigm.
 *  
 *  Classes that implement this
 *  interface must specify whether or not they allow in-place filtering--
 *  filter operations where the source object is equal to the destination
 *  object.
 *  
 *  This interface cannot be used to describe more sophisticated operations
 *  such as those that take multiple sources. Note that this restriction also
 *  means that the values of the destination pixels prior to the operation are
 *  not used as input to the filter operation.
 */
trait BufferedImageOp {

    /** Creates a zeroed destination image with the correct size and number of
     *  bands.
     */
    @stub
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    /** Performs a single-input/single-output operation on a
     *  BufferedImage.
     */
    @stub
    def filter(src: BufferedImage, dest: BufferedImage): BufferedImage = ???

    /** Returns the bounding box of the filtered destination image. */
    @stub
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    /** Returns the location of the corresponding destination point given a
     *  point in the source image.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???
}
