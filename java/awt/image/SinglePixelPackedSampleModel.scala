package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class represents pixel data packed such that the N samples which make
 *   up a single pixel are stored in a single data array element, and each data
 *   data array element holds samples for only one pixel.
 *   This class supports
 *   TYPE_BYTE,
 *   TYPE_USHORT,
 *   TYPE_INT data types.
 *   All data array elements reside
 *   in the first bank of a DataBuffer.  Accessor methods are provided so
 *   that the image data can be manipulated directly. Scanline stride is the
 *   number of data array elements between a given sample and the corresponding
 *   sample in the same column of the next scanline. Bit masks are the masks
 *   required to extract the samples representing the bands of the pixel.
 *   Bit offsets are the offsets in bits into the data array
 *   element of the samples representing the bands of the pixel.
 *  
 *  The following code illustrates extracting the bits of the sample
 *  representing band b for pixel x,y
 *  from DataBuffer data:
 *  
 *       int sample = data.getElem(y * scanlineStride + x);
 *       sample = (sample & bitMasks[b]) >>> bitOffsets[b];
 *  
 */
class SinglePixelPackedSampleModel extends SampleModel {

    /** Constructs a SinglePixelPackedSampleModel with bitMasks.length bands. */
    @stub
    def this(dataType: Int, w: Int, h: Int, bitMasks: Array[Int]) = ???

    /** Constructs a SinglePixelPackedSampleModel with bitMasks.length bands
     *  and a scanline stride equal to scanlineStride data array elements.
     */
    @stub
    def this(dataType: Int, w: Int, h: Int, scanlineStride: Int, bitMasks: Array[Int]) = ???

    /** Creates a new SinglePixelPackedSampleModel with the specified
     *  width and height.
     */
    @stub
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    /** Creates a DataBuffer that corresponds to this
     *  SinglePixelPackedSampleModel.
     */
    @stub
    def createDataBuffer(): DataBuffer = ???

    /** This creates a new SinglePixelPackedSampleModel with a subset of the
     *  bands of this SinglePixelPackedSampleModel.
     */
    @stub
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    /** Indicates whether some other object is "equal to" this one. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the bit masks for all bands. */
    @stub
    def getBitMasks(): Array[Int] = ???

    /** Returns the bit offsets into the data array element representing
     *   a pixel for all bands.
     */
    @stub
    def getBitOffsets(): Array[Int] = ???

    /** Returns data for a single pixel in a primitive array of type
     *  TransferType.
     */
    @stub
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    /** Returns the number of data elements needed to transfer one pixel
     *  via the getDataElements and setDataElements methods.
     */
    @stub
    def getNumDataElements(): Int = ???

    /** Returns the offset (in data array elements) of pixel (x,y). */
    @stub
    def getOffset(x: Int, y: Int): Int = ???

    /** Returns all samples in for the specified pixel in an int array. */
    @stub
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns all samples for the specified rectangle of pixels in
     *  an int array, one sample per array element.
     */
    @stub
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns as int the sample in a specified band for the pixel
     *  located at (x,y).
     */
    @stub
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    /** Returns the samples for a specified band for the specified rectangle
     *  of pixels in an int array, one sample per array element.
     */
    @stub
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns the number of bits per sample for all bands. */
    @stub
    def getSampleSize(): Array[Int] = ???

    /** Returns the number of bits per sample for the specified band. */
    @stub
    def getSampleSize(band: Int): Int = ???

    /** Returns the scanline stride of this SinglePixelPackedSampleModel. */
    @stub
    def getScanlineStride(): Int = ???

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
     *  in the DataBuffer using an int for input.
     */
    @stub
    def setSample(x: Int, y: Int, b: Int, s: Int, data: DataBuffer): Unit = ???

    /** Sets the samples in the specified band for the specified rectangle
     *  of pixels from an int array containing one sample per array element.
     */
    @stub
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Unit = ???
}
