package java.awt.image

import java.lang.Object

// The MultiPixelPackedSampleModel class represents
// one-banded images and can pack multiple one-sample
// pixels into one data element.  Pixels are not allowed to span data elements.
// The data type can be DataBuffer.TYPE_BYTE, DataBuffer.TYPE_USHORT,
// or DataBuffer.TYPE_INT.  Each pixel must be a power of 2 number of bits
// and a power of 2 number of pixels must fit exactly in one data element.
// Pixel bit stride is equal to the number of bits per pixel.  Scanline
// stride is in data elements and the last several data elements might be
// padded with unused pixels.  Data bit offset is the offset in bits from
// the beginning of the DataBuffer to the first pixel and must be
// a multiple of pixel bit stride.
// 
// The following code illustrates extracting the bits for pixel
// x, y from DataBuffer data
// and storing the pixel data in data elements of type
// dataType:
// 
//      int dataElementSize = DataBuffer.getDataTypeSize(dataType);
//      int bitnum = dataBitOffset + x*pixelBitStride;
//      int element = data.getElem(y*scanlineStride + bitnum/dataElementSize);
//      int shift = dataElementSize - (bitnum & (dataElementSize-1))
//                  - pixelBitStride;
//      int pixel = (element >> shift) & ((1 << pixelBitStride) - 1);
// 
class MultiPixelPackedSampleModel extends SampleModel {

    @stub
    // Constructs a MultiPixelPackedSampleModel with the
    // specified data type, width, height and number of bits per pixel.
    def this(dataType: Int, w: Int, h: Int, numberOfBits: Int) = ???

    @stub
    // Creates a new MultiPixelPackedSampleModel with the
    // specified width and height.
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    @stub
    // Creates a DataBuffer that corresponds to this
    // MultiPixelPackedSampleModel.
    def createDataBuffer(): DataBuffer = ???

    @stub
    // Creates a new MultiPixelPackedSampleModel with a
    // subset of the bands of this
    // MultiPixelPackedSampleModel.
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the offset, in bits, into the data element in which it is
    //  stored for the xth pixel of a scanline.
    def getBitOffset(x: Int): Int = ???

    @stub
    // Returns the data bit offset in bits.
    def getDataBitOffset(): Int = ???

    @stub
    // Returns data for a single pixel in a primitive array of type
    // TransferType.
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    @stub
    // Returns the number of data elements needed to transfer one pixel
    // via the getDataElements(int, int, java.lang.Object, java.awt.image.DataBuffer) and setDataElements(int, int, java.lang.Object, java.awt.image.DataBuffer)
    // methods.
    def getNumDataElements(): Int = ???

    @stub
    // Returns the offset of pixel (x, y) in data array elements.
    def getOffset(x: Int, y: Int): Int = ???

    @stub
    // Returns the specified single band pixel in the first element
    // of an int array.
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns the pixel bit stride in bits.
    def getPixelBitStride(): Int = ???

    @stub
    // Returns as int the sample in a specified band for the
    // pixel located at (x, y).
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    @stub
    // Returns the number of bits per sample for all bands.
    def getSampleSize(): Array[Int] = ???

    @stub
    // Returns the number of bits per sample for the specified band.
    def getSampleSize(band: Int): Int = ???

    @stub
    // Returns the scanline stride.
    def getScanlineStride(): Int = ???

    @stub
    // Returns the TransferType used to transfer pixels by way of the
    //  getDataElements and setDataElements
    //  methods.
    def getTransferType(): Int = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Sets the data for a single pixel in the specified
    // DataBuffer from a primitive array of type
    // TransferType.
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using an
    // int array for input.
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit = ???
}
