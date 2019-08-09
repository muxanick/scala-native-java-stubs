package java.awt.image

// The interface for objects expressing interest in image data through
// the ImageProducer interfaces.  When a consumer is added to an image
// producer, the producer delivers all of the data about the image
// using the method calls defined in this interface.
trait ImageConsumer {

    @stub
    // The imageComplete method is called when the ImageProducer is
    // finished delivering all of the pixels that the source image
    // contains, or when a single frame of a multi-frame animation has
    // been completed, or when an error in loading or producing the
    // image has occurred.
    def imageComplete(status: Int): Unit = ???

    @stub
    // Sets the ColorModel object used for the majority of
    // the pixels reported using the setPixels method
    // calls.
    def setColorModel(model: ColorModel): Unit = ???

    @stub
    // The dimensions of the source image are reported using the
    // setDimensions method call.
    def setDimensions(width: Int, height: Int): Unit = ???

    @stub
    // Sets the hints that the ImageConsumer uses to process the
    // pixels delivered by the ImageProducer.
    def setHints(hintflags: Int): Unit = ???

    @stub
    // Delivers the pixels of the image with one or more calls
    // to this method.
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    @stub
    // The pixels of the image are delivered using one or more calls
    // to the setPixels method.
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???
}

object ImageConsumer {
    @stub
    // The pixels will be delivered in (multiples of) complete scanlines
    // at a time.
    def COMPLETESCANLINES: Int = ???

    @stub
    // The image creation process was deliberately aborted.
    def IMAGEABORTED: Int = ???

    @stub
    // An error was encountered while producing the image.
    def IMAGEERROR: Int = ???

    @stub
    // The pixels will be delivered in a random order.
    def RANDOMPIXELORDER: Int = ???

    @stub
    // The image contain a single static image.
    def SINGLEFRAME: Int = ???

    @stub
    // One frame of the image is complete but there are more frames
    // to be delivered.
    def SINGLEFRAMEDONE: Int = ???

    @stub
    // The pixels will be delivered in a single pass.
    def SINGLEPASS: Int = ???

    @stub
    // The image is complete and there are no more pixels or frames
    // to be delivered.
    def STATICIMAGEDONE: Int = ???
}
