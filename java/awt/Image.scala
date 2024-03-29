package java.awt

import java.awt.image.{ImageObserver, ImageProducer}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The abstract class Image is the superclass of all
 *  classes that represent graphical images. The image must be
 *  obtained in a platform-specific manner.
 */
abstract class Image extends Object {

    /**  */
    @stub
    def this() = ???

    /** Priority for accelerating this image. */
    protected val accelerationPriority: Float

    /** Flushes all reconstructable resources being used by this Image object. */
    def flush(): Unit

    /** Returns the current value of the acceleration priority hint. */
    def getAccelerationPriority(): Float

    /** Returns an ImageCapabilities object which can be
     *  inquired as to the capabilities of this
     *  Image on the specified GraphicsConfiguration.
     */
    def getCapabilities(gc: GraphicsConfiguration): ImageCapabilities

    /** Creates a graphics context for drawing to an off-screen image. */
    def getGraphics(): Graphics

    /** Determines the height of the image. */
    def getHeight(observer: ImageObserver): Int

    /** Gets a property of this image by name. */
    def getProperty(name: String, observer: ImageObserver): Any

    /** Creates a scaled version of this image. */
    def getScaledInstance(width: Int, height: Int, hints: Int): Image

    /** Gets the object that produces the pixels for the image. */
    def getSource(): ImageProducer

    /** Determines the width of the image. */
    def getWidth(observer: ImageObserver): Int

    /** Sets a hint for this image about how important acceleration is. */
    def setAccelerationPriority(priority: Float): Unit
}

object Image {
    /** Use the Area Averaging image scaling algorithm. */
    @stub
    val SCALE_AREA_AVERAGING: Int = ???

    /** Use the default image-scaling algorithm. */
    @stub
    val SCALE_DEFAULT: Int = ???

    /** Choose an image-scaling algorithm that gives higher priority
     *  to scaling speed than smoothness of the scaled image.
     */
    @stub
    val SCALE_FAST: Int = ???

    /** Use the image scaling algorithm embodied in the
     *  ReplicateScaleFilter class.
     */
    @stub
    val SCALE_REPLICATE: Int = ???

    /** Choose an image-scaling algorithm that gives higher priority
     *  to image smoothness than scaling speed.
     */
    @stub
    val SCALE_SMOOTH: Int = ???

    /** The UndefinedProperty object should be returned whenever a
     *  property which was not defined for a particular image is fetched.
     */
    @stub
    val UndefinedProperty: Any = ???
}
