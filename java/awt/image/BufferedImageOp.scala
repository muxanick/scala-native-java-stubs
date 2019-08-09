package java.awt.image

import java.awt.geom.{Point2D, Rectangle2D}

// This interface describes single-input/single-output
// operations performed on BufferedImage objects.
// It is implemented by AffineTransformOp,
// ConvolveOp, ColorConvertOp, RescaleOp,
// and LookupOp.  These objects can be passed into
// a BufferedImageFilter to operate on a
// BufferedImage in the
// ImageProducer-ImageFilter-ImageConsumer paradigm.
// 
// Classes that implement this
// interface must specify whether or not they allow in-place filtering--
// filter operations where the source object is equal to the destination
// object.
// 
// This interface cannot be used to describe more sophisticated operations
// such as those that take multiple sources. Note that this restriction also
// means that the values of the destination pixels prior to the operation are
// not used as input to the filter operation.
trait BufferedImageOp {

    @stub
    // Creates a zeroed destination image with the correct size and number of
    // bands.
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    @stub
    // Performs a single-input/single-output operation on a
    // BufferedImage.
    def filter(src: BufferedImage, dest: BufferedImage): BufferedImage = ???

    @stub
    // Returns the bounding box of the filtered destination image.
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    @stub
    // Returns the location of the corresponding destination point given a
    // point in the source image.
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???
}
