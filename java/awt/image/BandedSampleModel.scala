package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class represents image data which is stored in a band interleaved
 *   fashion and for
 *   which each sample of a pixel occupies one data element of the DataBuffer.
 *   It subclasses ComponentSampleModel but provides a more efficient
 *   implementation for accessing band interleaved image data than is provided
 *   by ComponentSampleModel.  This class should typically be used when working
 *   with images which store sample data for each band in a different bank of the
 *   DataBuffer. Accessor methods are provided so that image data can be
 *   manipulated directly. Pixel stride is the number of
 *   data array elements between two samples for the same band on the same
 *   scanline. The pixel stride for a BandedSampleModel is one.
 *   Scanline stride is the number of data array elements between
 *   a given sample and the corresponding sample in the same column of the next
 *   scanline.  Band offsets denote the number
 *   of data array elements from the first data array element of the bank
 *   of the DataBuffer holding each band to the first sample of the band.
 *   The bands are numbered from 0 to N-1.
 *   Bank indices denote the correspondence between a bank of the data buffer
 *   and a band of image data.  This class supports
 *   TYPE_BYTE,
 *   TYPE_USHORT,
 *   TYPE_SHORT,
 *   TYPE_INT,
 *   TYPE_FLOAT, and
 *   TYPE_DOUBLE datatypes
 */
final class BandedSampleModel extends ComponentSampleModel {

    /** Constructs a BandedSampleModel with the specified parameters. */
    @stub
    def this(dataType: Int, w: Int, h: Int, numBands: Int) = ???

    /** Constructs a BandedSampleModel with the specified parameters. */
    @stub
    def this(dataType: Int, w: Int, h: Int, scanlineStride: Int, bankIndices: Array[Int], bandOffsets: Array[Int]) = ???

    /** Creates a new BandedSampleModel with the specified
     *  width and height.
     */
    @stub
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    /** Creates a DataBuffer that corresponds to this BandedSampleModel,
     *  The DataBuffer's data type, number of banks, and size
     *  will be consistent with this BandedSampleModel.
     */
    @stub
    def createDataBuffer(): DataBuffer = ???

    /** Creates a new BandedSampleModel with a subset of the bands of this
     *  BandedSampleModel.
     */
    @stub
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    /** Returns data for a single pixel in a primitive array of type
     *  TransferType.
     */
    @stub
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    /** Returns all samples for the specified pixel in an int array. */
    @stub
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns all samples for the specified rectangle of pixels in
     *  an int array, one sample per data array element.
     */
    @stub
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns as int the sample in a specified band for the pixel
     *  located at (x,y).
     */
    @stub
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    /** Returns the sample in a specified band
     *  for a pixel located at (x,y) as a double.
     */
    @stub
    def getSampleDouble(x: Int, y: Int, b: Int, data: DataBuffer): Double = ???

    /** Returns the sample in a specified band
     *  for the pixel located at (x,y) as a float.
     */
    @stub
    def getSampleFloat(x: Int, y: Int, b: Int, data: DataBuffer): Float = ???

    /** Returns the samples in a specified band for the specified rectangle
     *  of pixels in an int array, one sample per data array element.
     */
    @stub
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Sets the data for a single pixel in the specified DataBuffer from a
     *  primitive array of type TransferType.
     */
    @stub
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit = ???

    /** Sets a pixel in the DataBuffer using an int array of samples for input. */
    @stub
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    /** Sets all samples for a rectangle of pixels from an int array containing
     *  one sample per array element.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a double for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Double, data: DataBuffer): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using a float for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Float, data: DataBuffer): Unit = ???

    /** Sets a sample in the specified band for the pixel located at (x,y)
     *  in the DataBuffer using an int for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Int, data: DataBuffer): Unit = ???

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from an int array containing one sample per data array element.
     */
    @stub
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Unit = ???
}
