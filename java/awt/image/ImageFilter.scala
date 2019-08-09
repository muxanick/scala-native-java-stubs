package java.awt.image

import java.lang.{Cloneable, Object}

// This class implements a filter for the set of interface methods that
// are used to deliver data from an ImageProducer to an ImageConsumer.
// It is meant to be used in conjunction with a FilteredImageSource
// object to produce filtered versions of existing images.  It is a
// base class that provides the calls needed to implement a "Null filter"
// which has no effect on the data being passed through.  Filters should
// subclass this class and override the methods which deal with the
// data that needs to be filtered and modify it as necessary.
class ImageFilter extends Object with ImageConsumer, with Cloneable {

    @stub
    // Clones this object.
    def clone(): Object = ???

    @stub
    // Returns a unique instance of an ImageFilter object which will
    // actually perform the filtering for the specified ImageConsumer.
    def getFilterInstance(ic: ImageConsumer): ImageFilter = ???

    @stub
    // Filters the information provided in the imageComplete method of
    // the ImageConsumer interface.
    def imageComplete(status: Int): Unit = ???

    @stub
    // Responds to a request for a TopDownLeftRight (TDLR) ordered resend
    // of the pixel data from an ImageConsumer.
    def resendTopDownLeftRight(ip: ImageProducer): Unit = ???

    @stub
    // Filter the information provided in the setColorModel method
    // of the ImageConsumer interface.
    def setColorModel(model: ColorModel): Unit = ???

    @stub
    // Filters the information provided in the setDimensions method
    // of the ImageConsumer interface.
    def setDimensions(width: Int, height: Int): Unit = ???

    @stub
    // Filters the information provided in the setHints method
    // of the ImageConsumer interface.
    def setHints(hints: Int): Unit = ???

    @stub
    // Filters the information provided in the setPixels method of the
    // ImageConsumer interface which takes an array of bytes.
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    @stub
    // Filters the information provided in the setPixels method of the
    // ImageConsumer interface which takes an array of integers.
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???
}
