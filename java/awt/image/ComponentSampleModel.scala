package java.awt.image

import java.lang.Object

// This class represents image data which is stored such that each sample
//  of a pixel occupies one data element of the DataBuffer.  It stores the
//  N samples which make up a pixel in N separate data array elements.
//  Different bands may be in different banks of the DataBuffer.
//  Accessor methods are provided so that image data can be manipulated
//  directly. This class can support different kinds of interleaving, e.g.
//  band interleaving, scanline interleaving, and pixel interleaving.
//  Pixel stride is the number of data array elements between two samples
//  for the same band on the same scanline. Scanline stride is the number
//  of data array elements between a given sample and the corresponding sample
//  in the same column of the next scanline.  Band offsets denote the number
//  of data array elements from the first data array element of the bank
//  of the DataBuffer holding each band to the first sample of the band.
//  The bands are numbered from 0 to N-1.  This class can represent image
//  data for which each sample is an unsigned integral number which can be
//  stored in 8, 16, or 32 bits (using DataBuffer.TYPE_BYTE,
//  DataBuffer.TYPE_USHORT, or DataBuffer.TYPE_INT,
//  respectively), data for which each sample is a signed integral number
//  which can be stored in 16 bits (using DataBuffer.TYPE_SHORT),
//  or data for which each sample is a signed float or double quantity
//  (using DataBuffer.TYPE_FLOAT or
//  DataBuffer.TYPE_DOUBLE, respectively).
//  All samples of a given ComponentSampleModel
//  are stored with the same precision.  All strides and offsets must be
//  non-negative.  This class supports
//  TYPE_BYTE,
//  TYPE_USHORT,
//  TYPE_SHORT,
//  TYPE_INT,
//  TYPE_FLOAT,
//  TYPE_DOUBLE,
class ComponentSampleModel extends SampleModel {

    @stub
    // Constructs a ComponentSampleModel with the specified parameters.
    def this(dataType: Int, w: Int, h: Int, pixelStride: Int, scanlineStride: Int, bandOffsets: Array[Int]) = ???

    @stub
    // Offsets for all bands in data array elements.
    protected def bandOffsets: Array[Int] = ???

    @stub
    // Index for each bank storing a band of image data.
    protected def bankIndices: Array[Int] = ???

    @stub
    // The number of bands in this
    // ComponentSampleModel.
    protected def numBands: Int = ???

    @stub
    // The number of banks in this
    // ComponentSampleModel.
    protected def numBanks: Int = ???

    @stub
    // Pixel stride (in data array elements) of the region of image
    //  data described by this ComponentSampleModel.
    protected def pixelStride: Int = ???

    @stub
    // Creates a new ComponentSampleModel with the specified
    // width and height.
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    @stub
    // Creates a DataBuffer that corresponds to this
    // ComponentSampleModel.
    def createDataBuffer(): DataBuffer = ???

    @stub
    // Creates a new ComponentSampleModel with a subset of the bands
    // of this ComponentSampleModel.
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the band offset for all bands.
    def getBandOffsets(): Array[Int] = ???

    @stub
    // Returns the bank indices for all bands.
    def getBankIndices(): Array[Int] = ???

    @stub
    // Returns data for a single pixel in a primitive array of type
    // TransferType.
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    @stub
    // Returns the number of data elements needed to transfer a pixel
    // with the
    // getDataElements(int, int, Object, DataBuffer) and
    // setDataElements(int, int, Object, DataBuffer)
    // methods.
    def getNumDataElements(): Int = ???

    @stub
    // Gets the offset for the first band of pixel (x,y).
    def getOffset(x: Int, y: Int): Int = ???

    @stub
    // Gets the offset for band b of pixel (x,y).
    def getOffset(x: Int, y: Int, b: Int): Int = ???

    @stub
    // Returns all samples for the specified pixel in an int array,
    // one sample per array element.
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns all samples for the specified rectangle of pixels in
    // an int array, one sample per array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns the pixel stride of this ComponentSampleModel.
    def getPixelStride(): Int = ???

    @stub
    // Returns as int the sample in a specified band for the pixel
    // located at (x,y).
    def getSample(x: Int, y: Int, b: Int, data: DataBuffer): Int = ???

    @stub
    // Returns the sample in a specified band
    // for a pixel located at (x,y) as a double.
    def getSampleDouble(x: Int, y: Int, b: Int, data: DataBuffer): double = ???

    @stub
    // Returns the sample in a specified band
    // for the pixel located at (x,y) as a float.
    def getSampleFloat(x: Int, y: Int, b: Int, data: DataBuffer): float = ???

    @stub
    // Returns the samples in a specified band for the specified rectangle
    // of pixels in an int array, one sample per data array element.
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns the number of bits per sample for all bands.
    def getSampleSize(): Array[Int] = ???

    @stub
    // Returns the number of bits per sample for the specified band.
    def getSampleSize(band: Int): Int = ???

    @stub
    // Returns the scanline stride of this ComponentSampleModel.
    def getScanlineStride(): Int = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Sets the data for a single pixel in the specified
    // DataBuffer from a primitive array of type
    // TransferType.
    def setDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using an int array of
    // samples for input.
    def setPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    @stub
    // Sets all samples for a rectangle of pixels from an int array containing
    // one sample per array element.
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using a double for input.
    def setSample(x: Int, y: Int, b: Int, s: double, data: DataBuffer): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using a float for input.
    def setSample(x: Int, y: Int, b: Int, s: float, data: DataBuffer): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using an int for input.
    def setSample(x: Int, y: Int, b: Int, s: Int, data: DataBuffer): Unit = ???
}
