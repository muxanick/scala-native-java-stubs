package java.awt.image

import java.lang.{Cloneable, Object}

// The BufferedImageFilter class subclasses an
// ImageFilter to provide a simple means of
// using a single-source/single-destination image operator
// (BufferedImageOp) to filter a BufferedImage
// in the Image Producer/Consumer/Observer
// paradigm. Examples of these image operators are: ConvolveOp,
// AffineTransformOp and LookupOp.
class BufferedImageFilter extends ImageFilter with Cloneable {

    @stub
    // Returns the BufferedImageOp.
    def getBufferedImageOp(): BufferedImageOp = ???

    @stub
    // Filters the information provided in the imageComplete
    // method of the ImageConsumer interface.
    def imageComplete(status: Int): Unit = ???

    @stub
    // Filters the information provided in the
    // setColorModel method
    // of the ImageConsumer interface.
    def setColorModel(model: ColorModel): Unit = ???

    @stub
    // Filters the information provided in the
    // setDimensions  method
    // of the ImageConsumer interface.
    def setDimensions(width: Int, height: Int): Unit = ???

    @stub
    // Filters the information provided in the setPixels
    // method of the ImageConsumer interface which takes
    // an array of bytes.
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???
}
