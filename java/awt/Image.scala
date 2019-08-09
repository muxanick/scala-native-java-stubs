package java.awt

import java.awt.image.{ImageObserver, ImageProducer}
import java.lang.{Object, String}

// The abstract class Image is the superclass of all
// classes that represent graphical images. The image must be
// obtained in a platform-specific manner.
abstract class Image extends Object {

    // Priority for accelerating this image.
    protected def accelerationPriority: float

    // Flushes all reconstructable resources being used by this Image object.
    def flush(): Unit

    // Returns the current value of the acceleration priority hint.
    def getAccelerationPriority(): float

    // Returns an ImageCapabilities object which can be
    // inquired as to the capabilities of this
    // Image on the specified GraphicsConfiguration.
    def getCapabilities(gc: GraphicsConfiguration): ImageCapabilities

    // Creates a graphics context for drawing to an off-screen image.
    def getGraphics(): Graphics

    // Determines the height of the image.
    def getHeight(observer: ImageObserver): Int

    // Gets a property of this image by name.
    def getProperty(name: String, observer: ImageObserver): Object

    // Creates a scaled version of this image.
    def getScaledInstance(width: Int, height: Int, hints: Int): Image

    // Gets the object that produces the pixels for the image.
    def getSource(): ImageProducer

    // Determines the width of the image.
    def getWidth(observer: ImageObserver): Int
}

object Image {
    @stub
    // Use the Area Averaging image scaling algorithm.
    def SCALE_AREA_AVERAGING: Int = ???

    @stub
    // Use the default image-scaling algorithm.
    def SCALE_DEFAULT: Int = ???

    @stub
    // Choose an image-scaling algorithm that gives higher priority
    // to scaling speed than smoothness of the scaled image.
    def SCALE_FAST: Int = ???

    @stub
    // Use the image scaling algorithm embodied in the
    // ReplicateScaleFilter class.
    def SCALE_REPLICATE: Int = ???

    @stub
    // Choose an image-scaling algorithm that gives higher priority
    // to image smoothness than scaling speed.
    def SCALE_SMOOTH: Int = ???
}
