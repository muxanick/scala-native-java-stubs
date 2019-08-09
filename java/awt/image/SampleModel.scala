package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This abstract class defines an interface for extracting samples of pixels
 *   in an image.  All image data is expressed as a collection of pixels.
 *   Each pixel consists of a number of samples. A sample is a datum
 *   for one band of an image and a band consists of all samples of a
 *   particular type in an image.  For example, a pixel might contain
 *   three samples representing its red, green and blue components.
 *   There are three bands in the image containing this pixel.  One band
 *   consists of all the red samples from all pixels in the
 *   image.  The second band consists of all the green samples and
 *   the remaining band consists of all of the blue samples.  The pixel
 *   can be stored in various formats.  For example, all samples from
 *   a particular band can be stored contiguously or all samples from a
 *   single pixel can be stored contiguously.
 *   
 *   Subclasses of SampleModel specify the types of samples they can
 *   represent (e.g. unsigned 8-bit byte, signed 16-bit short, etc.)
 *   and may specify how the samples are organized in memory.
 *   In the Java 2D(tm) API, built-in image processing operators may
 *   not operate on all possible sample types, but generally will work
 *   for unsigned integral samples of 16 bits or less.  Some operators
 *   support a wider variety of sample types.
 *   
 *   A collection of pixels is represented as a Raster, which consists of
 *   a DataBuffer and a SampleModel.  The SampleModel allows access to
 *   samples in the DataBuffer and may provide low-level information that
 *   a programmer can use to directly manipulate samples and pixels in the
 *   DataBuffer.
 *   
 *   This class is generally a fall back method for dealing with
 *   images.  More efficient code will cast the SampleModel to the
 *   appropriate subclass and extract the information needed to directly
 *   manipulate pixels in the DataBuffer.
 */
abstract class SampleModel extends Object {

    /** Constructs a SampleModel with the specified parameters. */
    @stub
    def this(dataType: Int, w: Int, h: Int, numBands: Int) = ???

    /** Data type of the DataBuffer storing the pixel data. */
    protected val dataType: Int

    /** Height in pixels of the region of image data that this SampleModel
     *   describes.
     */
    protected val height: Int

    /** Number of bands of the image data that this SampleModel describes. */
    protected val numBands: Int

    /** Width in pixels of the region of image data that this SampleModel
     *   describes.
     */
    protected val width: Int

    /** Creates a SampleModel which describes data in this SampleModel's
     *   format, but with a different width and height.
     */
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel

    /** Creates a DataBuffer that corresponds to this SampleModel. */
    def createDataBuffer(): DataBuffer

    /** Creates a new SampleModel
     *  with a subset of the bands of this
     *  SampleModel.
     */
    def createSubsetSampleModel(bands: Array[Int]): SampleModel

    /** Returns the pixel data for the specified rectangle of pixels in a
     *  primitive array of type TransferType.
     */
    def getDataElements(x: Int, y: Int, w: Int, h: Int, obj: Object, data: DataBuffer): Object

    /** Returns data for a single pixel in a primitive array of type
     *  TransferType.
     */
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object

    /** Returns the data type of the DataBuffer storing the pixel data. */
    def getDataType(): Int

    /** Returns the height in pixels. */
    def getHeight(): Int

    /** Returns the total number of bands of image data. */
    def getNumBands(): Int

    /** Returns the number of data elements needed to transfer a pixel
     *   via the getDataElements and setDataElements methods.
     */
    def getNumDataElements(): Int

    /** Returns the samples for the specified pixel in an array of double. */
    def getPixel(x: Int, y: Int, dArray: Array[Double], data: DataBuffer): Array[Double]

    /** Returns the samples for the specified pixel in an array of float. */
    def getPixel(x: Int, y: Int, fArray: Array[Float], data: DataBuffer): Array[Float]

    /** Returns the samples for a specified pixel in an int array,
     *  one sample per array element.
     */
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int]

    /** Returns all samples for a rectangle of pixels in a double
     *  array, one sample per array element.
     */
    def getPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[Double], data: DataBuffer): Array[Double]

    /** Returns all samples for a rectangle of pixels in a float
     *  array, one sample per array element.
     */
    def getPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[Float], data: DataBuffer): Array[Float]

    /** Returns all samples for a rectangle of pixels in an
     *  int array, one sample per array element.
     */
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int]

    /** Returns the sample in a specified band for the pixel located
     *  at (x,y) as an int.
     */
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int

    /** Returns the sample in a specified band
     *  for a pixel located at (x,y) as a double.
     */
    def getSampleDouble(x: Int, y: Int, b: Int, data: DataBuffer): Double

    /** Returns the sample in a specified band
     *  for the pixel located at (x,y) as a float.
     */
    def getSampleFloat(x: Int, y: Int, b: Int, data: DataBuffer): Float

    /** Returns the samples for a specified band for a specified rectangle
     *  of pixels in a double array, one sample per array element.
     */
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[Double], data: DataBuffer): Array[Double]

    /** Returns the samples for a specified band for the specified rectangle
     *  of pixels in a float array, one sample per array element.
     */
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[Float], data: DataBuffer): Array[Float]

    /** Returns the samples for a specified band for the specified rectangle
     *  of pixels in an int array, one sample per array element.
     */
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Array[Int]

    /** Returns the size in bits of samples for all bands. */
    def getSampleSize(): Array[Int]

    /** Returns the size in bits of samples for the specified band. */
    def getSampleSize(band: Int): Int

    /** Returns the TransferType used to transfer pixels via the
     *   getDataElements and setDataElements methods.
     */
    def getTransferType(): Int

    /** Returns the width in pixels. */
    def getWidth(): Int

    /** Sets the data for a rectangle of pixels in the specified DataBuffer
     *  from a primitive array of type TransferType.
     */
    def setDataElements(x: Int, y: Int, w: Int, h: Int, obj: Object, data: DataBuffer): Unit

    /** Sets the data for a single pixel in the specified DataBuffer from a
     *  primitive array of type TransferType.
     */
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit

    /** Sets a pixel in the DataBuffer using a double array of samples
     *  for input.
     */
    def setPixel(x: Int, y: Int, dArray: Array[Double], data: DataBuffer): Unit

    /** Sets a pixel in the DataBuffer using a float array of samples for input. */
    def setPixel(x: Int, y: Int, fArray: Array[Float], data: DataBuffer): Unit

    /** Sets a pixel in  the DataBuffer using an int array of samples for input. */
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit

    /** Sets all samples for a rectangle of pixels from a double array
     *  containing one sample per array element.
     */
    def setPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[Double], data: DataBuffer): Unit

    /** Sets all samples for a rectangle of pixels from a float array containing
     *  one sample per array element.
     */
    def setPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[Float], data: DataBuffer): Unit

    /** Sets all samples for a rectangle of pixels from an int array containing
     *  one sample per array element.
     */
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Unit

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a double for input.
     */
    def setSample(x: Int, y: Int, b: Int, s: Double, data: DataBuffer): Unit

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a float for input.
     */
    def setSample(x: Int, y: Int, b: Int, s: Float, data: DataBuffer): Unit

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using an int for input.
     */
    def setSample(x: Int, y: Int, b: Int, s: Int, data: DataBuffer): Unit

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from a double array containing one sample per array element.
     */
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[Double], data: DataBuffer): Unit

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from a float array containing one sample per array element.
     */
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[Float], data: DataBuffer): Unit

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from an int array containing one sample per array element.
     */
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Unit
}
