package java.awt.image

import java.awt.{Point, Rectangle}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class extends Raster to provide pixel writing capabilities.
 *  Refer to the class comment for Raster for descriptions of how
 *  a Raster stores pixels.
 * 
 *   The constructors of this class are protected.  To instantiate
 *  a WritableRaster, use one of the createWritableRaster factory methods
 *  in the Raster class.
 */
class WritableRaster extends Raster {

    /** Constructs a WritableRaster with the given SampleModel and DataBuffer. */
    @stub
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, origin: Point) = ???

    /** Constructs a WritableRaster with the given SampleModel, DataBuffer,
     *  and parent.
     */
    @stub
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, aRegion: Rectangle, sampleModelTranslate: Point, parent: WritableRaster) = ???

    /** Constructs a WritableRaster with the given SampleModel. */
    @stub
    protected def this(sampleModel: SampleModel, origin: Point) = ???

    /** Returns a new WritableRaster which shares all or part of this
     *  WritableRaster's DataBuffer.
     */
    @stub
    def createWritableChild(parentX: Int, parentY: Int, w: Int, h: Int, childMinX: Int, childMinY: Int, bandList: Array[Int]): WritableRaster = ???

    /** Create a WritableRaster with the same size, SampleModel and DataBuffer
     *  as this one, but with a different location.
     */
    @stub
    def createWritableTranslatedChild(childMinX: Int, childMinY: Int): WritableRaster = ???

    /** Returns the parent WritableRaster (if any) of this WritableRaster,
     *   or else null.
     */
    @stub
    def getWritableParent(): WritableRaster = ???

    /** Sets the data for a rectangle of pixels from a
     *  primitive array of type TransferType.
     */
    @stub
    def setDataElements(x: Int, y: Int, w: Int, h: Int, inData: Object): Unit = ???

    /** Sets the data for a single pixel from a
     *  primitive array of type TransferType.
     */
    @stub
    def setDataElements(x: Int, y: Int, inData: Object): Unit = ???

    /** Sets the data for a rectangle of pixels from an input Raster. */
    @stub
    def setDataElements(x: Int, y: Int, inRaster: Raster): Unit = ???

    /** Sets a pixel in the DataBuffer using a double array of samples for input. */
    @stub
    def setPixel(x: Int, y: Int, dArray: Array[Double]): Unit = ???

    /** Sets a pixel in the DataBuffer using a float array of samples for input. */
    @stub
    def setPixel(x: Int, y: Int, fArray: Array[Float]): Unit = ???

    /** Sets a pixel in the DataBuffer using an int array of samples for input. */
    @stub
    def setPixel(x: Int, y: Int, iArray: Array[Int]): Unit = ???

    /** Sets all samples for a rectangle of pixels from a double array containing
     *  one sample per array element.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[Double]): Unit = ???

    /** Sets all samples for a rectangle of pixels from a float array containing
     *  one sample per array element.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[Float]): Unit = ???

    /** Sets all samples for a rectangle of pixels from an int array containing
     *  one sample per array element.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int]): Unit = ???

    /** Copies pixels from Raster srcRaster to this WritableRaster. */
    @stub
    def setRect(dx: Int, dy: Int, srcRaster: Raster): Unit = ???

    /** Copies pixels from Raster srcRaster to this WritableRaster. */
    @stub
    def setRect(srcRaster: Raster): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a double for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Double): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a float for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Float): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using an int for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Int): Unit = ???

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from a double array containing one sample per array element.
     */
    @stub
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[Double]): Unit = ???

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from a float array containing one sample per array element.
     */
    @stub
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[Float]): Unit = ???

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from an int array containing one sample per array element.
     */
    @stub
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int]): Unit = ???
}
