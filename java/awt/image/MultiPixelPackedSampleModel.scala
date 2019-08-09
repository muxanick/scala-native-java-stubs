package java.awt.image

import java.lang.Object

/** The MultiPixelPackedSampleModel class represents
 *  one-banded images and can pack multiple one-sample
 *  pixels into one data element.  Pixels are not allowed to span data elements.
 *  The data type can be DataBuffer.TYPE_BYTE, DataBuffer.TYPE_USHORT,
 *  or DataBuffer.TYPE_INT.  Each pixel must be a power of 2 number of bits
 *  and a power of 2 number of pixels must fit exactly in one data element.
 *  Pixel bit stride is equal to the number of bits per pixel.  Scanline
 *  stride is in data elements and the last several data elements might be
 *  padded with unused pixels.  Data bit offset is the offset in bits from
 *  the beginning of the DataBuffer to the first pixel and must be
 *  a multiple of pixel bit stride.
 *  
 *  The following code illustrates extracting the bits for pixel
 *  x, y from DataBuffer data
 *  and storing the pixel data in data elements of type
 *  dataType:
 *  
 *       int dataElementSize = DataBuffer.getDataTypeSize(dataType);
 *       int bitnum = dataBitOffset + x*pixelBitStride;
 *       int element = data.getElem(y*scanlineStride + bitnum/dataElementSize);
 *       int shift = dataElementSize - (bitnum & (dataElementSize-1))
 *                   - pixelBitStride;
 *       int pixel = (element >> shift) & ((1 << pixelBitStride) - 1);
 *  
 */
class MultiPixelPackedSampleModel extends SampleModel {

    /** Constructs a MultiPixelPackedSampleModel with the
     *  specified data type, width, height and number of bits per pixel.
     */
    @stub
    def this(dataType: Int, w: Int, h: Int, numberOfBits: Int) = ???

    /** Creates a new MultiPixelPackedSampleModel with the
     *  specified width and height.
     */
    @stub
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    /** Creates a DataBuffer that corresponds to this
     *  MultiPixelPackedSampleModel.
     */
    @stub
    def createDataBuffer(): DataBuffer = ???

    /** Creates a new MultiPixelPackedSampleModel with a
     *  subset of the bands of this
     *  MultiPixelPackedSampleModel.
     */
    @stub
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    /** Indicates whether some other object is "equal to" this one. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the offset, in bits, into the data element in which it is
     *   stored for the xth pixel of a scanline.
     */
    @stub
    def getBitOffset(x: Int): Int = ???

    /** Returns the data bit offset in bits. */
    @stub
    def getDataBitOffset(): Int = ???

    /** Returns data for a single pixel in a primitive array of type
     *  TransferType.
     */
    @stub
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    /** Returns the number of data elements needed to transfer one pixel
     *  via the getDataElements(int, int, java.lang.Object, java.awt.image.DataBuffer) and setDataElements(int, int, java.lang.Object, java.awt.image.DataBuffer)
     *  methods.
     */
    @stub
    def getNumDataElements(): Int = ???

    /** Returns the offset of pixel (x, y) in data array elements. */
    @stub
    def getOffset(x: Int, y: Int): Int = ???

    /** Returns the specified single band pixel in the first element
     *  of an int array.
     */
    @stub
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    /** Returns the pixel bit stride in bits. */
    @stub
    def getPixelBitStride(): Int = ???

    /** Returns as int the sample in a specified band for the
     *  pixel located at (x, y).
     */
    @stub
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    /** Returns the number of bits per sample for all bands. */
    @stub
    def getSampleSize(): Array[Int] = ???

    /** Returns the number of bits per sample for the specified band. */
    @stub
    def getSampleSize(band: Int): Int = ???

    /** Returns the scanline stride. */
    @stub
    def getScanlineStride(): Int = ???

    /** Returns the TransferType used to transfer pixels by way of the
     *   getDataElements and setDataElements
     *   methods.
     */
    @stub
    def getTransferType(): Int = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Sets the data for a single pixel in the specified
     *  DataBuffer from a primitive array of type
     *  TransferType.
     */
    @stub
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit = ???

    /** Sets a pixel in the DataBuffer using an
     *  int array for input.
     */
    @stub
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit = ???
}
