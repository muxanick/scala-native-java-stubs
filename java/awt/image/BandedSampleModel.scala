package java.awt.image

import java.lang.Object

// This class represents image data which is stored in a band interleaved
//  fashion and for
//  which each sample of a pixel occupies one data element of the DataBuffer.
//  It subclasses ComponentSampleModel but provides a more efficient
//  implementation for accessing band interleaved image data than is provided
//  by ComponentSampleModel.  This class should typically be used when working
//  with images which store sample data for each band in a different bank of the
//  DataBuffer. Accessor methods are provided so that image data can be
//  manipulated directly. Pixel stride is the number of
//  data array elements between two samples for the same band on the same
//  scanline. The pixel stride for a BandedSampleModel is one.
//  Scanline stride is the number of data array elements between
//  a given sample and the corresponding sample in the same column of the next
//  scanline.  Band offsets denote the number
//  of data array elements from the first data array element of the bank
//  of the DataBuffer holding each band to the first sample of the band.
//  The bands are numbered from 0 to N-1.
//  Bank indices denote the correspondence between a bank of the data buffer
//  and a band of image data.  This class supports
//  TYPE_BYTE,
//  TYPE_USHORT,
//  TYPE_SHORT,
//  TYPE_INT,
//  TYPE_FLOAT, and
//  TYPE_DOUBLE datatypes
final class BandedSampleModel extends ComponentSampleModel {

    @stub
    // Constructs a BandedSampleModel with the specified parameters.
    def this(dataType: Int, w: Int, h: Int, numBands: Int) = ???

    @stub
    // Creates a new BandedSampleModel with the specified
    // width and height.
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    @stub
    // Creates a DataBuffer that corresponds to this BandedSampleModel,
    // The DataBuffer's data type, number of banks, and size
    // will be consistent with this BandedSampleModel.
    def createDataBuffer(): DataBuffer = ???

    @stub
    // Creates a new BandedSampleModel with a subset of the bands of this
    // BandedSampleModel.
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???

    @stub
    // Returns data for a single pixel in a primitive array of type
    // TransferType.
    def getDataElements(x: Int, y: Int, obj: Object, data: DataBuffer): Object = ???

    @stub
    // Returns all samples for the specified pixel in an int array.
    def getPixel(x: Int, y: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

    @stub
    // Returns all samples for the specified rectangle of pixels in
    // an int array, one sample per data array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int], data: DataBuffer): Array[Int] = ???

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
