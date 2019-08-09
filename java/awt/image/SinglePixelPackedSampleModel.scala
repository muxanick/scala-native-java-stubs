package java.awt.image

import java.lang.Object

// This class represents pixel data packed such that the N samples which make
//  up a single pixel are stored in a single data array element, and each data
//  data array element holds samples for only one pixel.
//  This class supports
//  TYPE_BYTE,
//  TYPE_USHORT,
//  TYPE_INT data types.
//  All data array elements reside
//  in the first bank of a DataBuffer.  Accessor methods are provided so
//  that the image data can be manipulated directly. Scanline stride is the
//  number of data array elements between a given sample and the corresponding
//  sample in the same column of the next scanline. Bit masks are the masks
//  required to extract the samples representing the bands of the pixel.
//  Bit offsets are the offsets in bits into the data array
//  element of the samples representing the bands of the pixel.
// 
// The following code illustrates extracting the bits of the sample
// representing band b for pixel x,y
// from DataBuffer data:
// 
//      int sample = data.getElem(y * scanlineStride + x);
//      sample = (sample & bitMasks[b]) >>> bitOffsets[b];
// 
class SinglePixelPackedSampleModel extends SampleModel {

    @stub
    // Constructs a SinglePixelPackedSampleModel with bitMasks.length bands.
    def this(dataType: Int, w: Int, h: Int, bitMasks: Array[Int]) = ???

    @stub
    // Creates a new SinglePixelPackedSampleModel with the specified
    // width and height.
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    @stub
    // Creates a DataBuffer that corresponds to this
    // SinglePixelPackedSampleModel.
    def createDataBuffer(): DataBuffer = ???

    @stub
    // This creates a new SinglePixelPackedSampleModel with a subset of the
    // bands of this SinglePixelPackedSampleModel.
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the bit masks for all bands.
    def getBitMasks(): Array[Int] = ???

    @stub
    // Returns the bit offsets into the data array element representing
    //  a pixel for all bands.
    def getBitOffsets(): Array[Int] = ???

    @stub
    // Returns data for a single pixel in a primitive array of type
    // TransferType.
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    @stub
    // Returns the number of data elements needed to transfer one pixel
    // via the getDataElements and setDataElements methods.
    def getNumDataElements(): Int = ???

    @stub
    // Returns the offset (in data array elements) of pixel (x,y).
    def getOffset(x: Int, y: Int): Int = ???

    @stub
    // Returns all samples in for the specified pixel in an int array.
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns all samples for the specified rectangle of pixels in
    // an int array, one sample per array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns as int the sample in a specified band for the pixel
    // located at (x,y).
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    @stub
    // Returns the samples for a specified band for the specified rectangle
    // of pixels in an int array, one sample per array element.
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns the number of bits per sample for all bands.
    def getSampleSize(): Array[Int] = ???

    @stub
    // Returns the number of bits per sample for the specified band.
    def getSampleSize(band: Int): Int = ???

    @stub
    // Returns the scanline stride of this SinglePixelPackedSampleModel.
    def getScanlineStride(): Int = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Sets the data for a single pixel in the specified DataBuffer from a
    // primitive array of type TransferType.
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using an int array of samples for input.
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    @stub
    // Sets all samples for a rectangle of pixels from an int array containing
    // one sample per array element.
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using an int for input.
    def setSample(x: Int, y: Int, b: Int, s: Int, data: DataBuffer): Unit = ???
}
