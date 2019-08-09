package java.awt.image

import java.awt.{Point, Rectangle}
import java.lang.Object

// A class representing a rectangular array of pixels.  A Raster
// encapsulates a DataBuffer that stores the sample values and a
// SampleModel that describes how to locate a given sample value in a
// DataBuffer.
// 
// A Raster defines values for pixels occupying a particular
// rectangular area of the plane, not necessarily including (0, 0).
// The rectangle, known as the Raster's bounding rectangle and
// available by means of the getBounds method, is defined by minX,
// minY, width, and height values.  The minX and minY values define
// the coordinate of the upper left corner of the Raster.  References
// to pixels outside of the bounding rectangle may result in an
// exception being thrown, or may result in references to unintended
// elements of the Raster's associated DataBuffer.  It is the user's
// responsibility to avoid accessing such pixels.
// 
// A SampleModel describes how samples of a Raster
// are stored in the primitive array elements of a DataBuffer.
// Samples may be stored one per data element, as in a
// PixelInterleavedSampleModel or BandedSampleModel, or packed several to
// an element, as in a SinglePixelPackedSampleModel or
// MultiPixelPackedSampleModel.  The SampleModel is also
// controls whether samples are sign extended, allowing unsigned
// data to be stored in signed Java data types such as byte, short, and
// int.
// 
// Although a Raster may live anywhere in the plane, a SampleModel
// makes use of a simple coordinate system that starts at (0, 0).  A
// Raster therefore contains a translation factor that allows pixel
// locations to be mapped between the Raster's coordinate system and
// that of the SampleModel.  The translation from the SampleModel
// coordinate system to that of the Raster may be obtained by the
// getSampleModelTranslateX and getSampleModelTranslateY methods.
// 
// A Raster may share a DataBuffer with another Raster either by
// explicit construction or by the use of the createChild and
// createTranslatedChild methods.  Rasters created by these methods
// can return a reference to the Raster they were created from by
// means of the getParent method.  For a Raster that was not
// constructed by means of a call to createTranslatedChild or
// createChild, getParent will return null.
// 
// The createTranslatedChild method returns a new Raster that
// shares all of the data of the current Raster, but occupies a
// bounding rectangle of the same width and height but with a
// different starting point.  For example, if the parent Raster
// occupied the region (10, 10) to (100, 100), and the translated
// Raster was defined to start at (50, 50), then pixel (20, 20) of the
// parent and pixel (60, 60) of the child occupy the same location in
// the DataBuffer shared by the two Rasters.  In the first case, (-10,
// -10) should be added to a pixel coordinate to obtain the
// corresponding SampleModel coordinate, and in the second case (-50,
// -50) should be added.
// 
// The translation between a parent and child Raster may be
// determined by subtracting the child's sampleModelTranslateX and
// sampleModelTranslateY values from those of the parent.
// 
// The createChild method may be used to create a new Raster
// occupying only a subset of its parent's bounding rectangle
// (with the same or a translated coordinate system) or
// with a subset of the bands of its parent.
// 
// All constructors are protected.  The correct way to create a
// Raster is to use one of the static create methods defined in this
// class.  These methods create instances of Raster that use the
// standard Interleaved, Banded, and Packed SampleModels and that may
// be processed more efficiently than a Raster created by combining
// an externally generated SampleModel and DataBuffer.
class Raster extends Object {

    @stub
    // Constructs a Raster with the given SampleModel and DataBuffer.
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, origin: Point) = ???

    @stub
    // Constructs a Raster with the given SampleModel, DataBuffer, and
    // parent.
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, aRegion: Rectangle, sampleModelTranslate: Point, parent: Raster) = ???

    @stub
    // The DataBuffer that stores the image data.
    protected def dataBuffer: DataBuffer = ???

    @stub
    // The height of this Raster.
    protected def height: Int = ???

    @stub
    // The X coordinate of the upper-left pixel of this Raster.
    protected def minX: Int = ???

    @stub
    // The Y coordinate of the upper-left pixel of this Raster.
    protected def minY: Int = ???

    @stub
    // The number of bands in the Raster.
    protected def numBands: Int = ???

    @stub
    // The number of DataBuffer data elements per pixel.
    protected def numDataElements: Int = ???

    @stub
    // The parent of this Raster, or null.
    protected def parent: Raster = ???

    @stub
    // The SampleModel that describes how pixels from this Raster
    // are stored in the DataBuffer.
    protected def sampleModel: SampleModel = ???

    @stub
    // The X translation from the coordinate space of the
    // Raster's SampleModel to that of the Raster.
    protected def sampleModelTranslateX: Int = ???

    @stub
    // The Y translation from the coordinate space of the
    // Raster's SampleModel to that of the Raster.
    protected def sampleModelTranslateY: Int = ???

    @stub
    // Returns a new Raster which shares all or part of this Raster's
    // DataBuffer.
    def createChild(parentX: Int, parentY: Int, width: Int, height: Int, childMinX: Int, childMinY: Int, bandList: Array[Int]): Raster = ???

    @stub
    // Create a compatible WritableRaster the same size as this Raster with
    // the same SampleModel and a new initialized DataBuffer.
    def createCompatibleWritableRaster(): WritableRaster = ???

    @stub
    // Create a compatible WritableRaster with the specified size, a new
    // SampleModel, and a new initialized DataBuffer.
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster = ???

    @stub
    // Create a compatible WritableRaster with the specified
    // location (minX, minY) and size (width, height), a
    // new SampleModel, and a new initialized DataBuffer.
    def createCompatibleWritableRaster(x: Int, y: Int, w: Int, h: Int): WritableRaster = ???

    @stub
    // Create a compatible WritableRaster with location (minX, minY)
    // and size (width, height) specified by rect, a
    // new SampleModel, and a new initialized DataBuffer.
    def createCompatibleWritableRaster(rect: Rectangle): WritableRaster = ???

    @stub
    // Create a Raster with the same size, SampleModel and DataBuffer
    // as this one, but with a different location.
    def createTranslatedChild(childMinX: Int, childMinY: Int): Raster = ???

    @stub
    // Returns the bounding Rectangle of this Raster.
    def getBounds(): Rectangle = ???

    @stub
    // Returns the DataBuffer associated with this Raster.
    def getDataBuffer(): DataBuffer = ???

    @stub
    // Returns the pixel data for the specified rectangle of pixels in a
    // primitive array of type TransferType.
    def getDataElements(x: Int, y: Int, w: Int, h: Int, outData: Object): Object = ???

    @stub
    // Returns data for a single pixel in a primitive array of type
    // TransferType.
    def getDataElements(x: Int, y: Int, outData: Object): Object = ???

    @stub
    // Returns the height in pixels of the Raster.
    def getHeight(): Int = ???

    @stub
    // Returns the minimum valid X coordinate of the Raster.
    def getMinX(): Int = ???

    @stub
    // Returns the minimum valid Y coordinate of the Raster.
    def getMinY(): Int = ???

    @stub
    // Returns the number of bands (samples per pixel) in this Raster.
    def getNumBands(): Int = ???

    @stub
    // Returns the number of data elements needed to transfer one pixel
    //  via the getDataElements and setDataElements methods.
    def getNumDataElements(): Int = ???

    @stub
    // Returns the parent Raster (if any) of this Raster or null.
    def getParent(): Raster = ???

    @stub
    // Returns the samples in an array of double for the specified pixel.
    def getPixel(x: Int, y: Int, dArray: Array[double]): Array[double] = ???

    @stub
    // Returns the samples in an array of float for the
    // specified pixel.
    def getPixel(x: Int, y: Int, fArray: Array[float]): Array[float] = ???

    @stub
    // Returns the samples in an array of int for the specified pixel.
    def getPixel(x: Int, y: Int, iArray: Array[Int]): Array[Int] = ???

    @stub
    // Returns a double array containing all samples for a rectangle of pixels,
    // one sample per array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[double]): Array[double] = ???

    @stub
    // Returns a float array containing all samples for a rectangle of pixels,
    // one sample per array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[float]): Array[float] = ???

    @stub
    // Returns an int array containing all samples for a rectangle of pixels,
    // one sample per array element.
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int]): Array[Int] = ???

    @stub
    // Returns the sample in a specified band for the pixel located
    // at (x,y) as an int.
    def getSample(x: Int, y: Int, b: Int): Int = ???

    @stub
    // Returns the sample in a specified band
    // for a pixel located at (x,y) as a double.
    def getSampleDouble(x: Int, y: Int, b: Int): double = ???

    @stub
    // Returns the sample in a specified band
    // for the pixel located at (x,y) as a float.
    def getSampleFloat(x: Int, y: Int, b: Int): float = ???

    @stub
    // Returns the SampleModel that describes the layout of the image data.
    def getSampleModel(): SampleModel = ???

    @stub
    // Returns the X translation from the coordinate system of the
    // SampleModel to that of the Raster.
    def getSampleModelTranslateX(): Int = ???

    @stub
    // Returns the Y translation from the coordinate system of the
    // SampleModel to that of the Raster.
    def getSampleModelTranslateY(): Int = ???

    @stub
    // Returns the samples for a specified band for a specified rectangle
    // of pixels in a double array, one sample per array element.
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[double]): Array[double] = ???

    @stub
    // Returns the samples for a specified band for the specified rectangle
    // of pixels in a float array, one sample per array element.
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[float]): Array[float] = ???

    @stub
    // Returns the samples for a specified band for the specified rectangle
    // of pixels in an int array, one sample per array element.
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int]): Array[Int] = ???

    @stub
    // Returns the TransferType used to transfer pixels via the
    //  getDataElements and setDataElements methods.
    def getTransferType(): Int = ???
}

object Raster {
    @stub
    // Creates a Raster based on a BandedSampleModel with the
    // specified DataBuffer, width, height, scanline stride, bank
    // indices, and band offsets.
    def createBandedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, bankIndices: Array[Int], bandOffsets: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a BandedSampleModel with the
    // specified data type, width, height, scanline stride, bank
    // indices and band offsets.
    def createBandedRaster(dataType: Int, w: Int, h: Int, scanlineStride: Int, bankIndices: Array[Int], bandOffsets: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a BandedSampleModel with the
    // specified data type, width, height, and number of bands.
    def createBandedRaster(dataType: Int, w: Int, h: Int, bands: Int, location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a PixelInterleavedSampleModel with the
    // specified DataBuffer, width, height, scanline stride, pixel
    // stride, and band offsets.
    def createInterleavedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, pixelStride: Int, bandOffsets: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a PixelInterleavedSampleModel with the
    // specified data type, width, height, scanline stride, pixel
    // stride, and band offsets.
    def createInterleavedRaster(dataType: Int, w: Int, h: Int, scanlineStride: Int, pixelStride: Int, bandOffsets: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a PixelInterleavedSampleModel with the
    // specified data type, width, height, and number of bands.
    def createInterleavedRaster(dataType: Int, w: Int, h: Int, bands: Int, location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a SinglePixelPackedSampleModel with
    // the specified DataBuffer, width, height, scanline stride, and
    // band masks.
    def createPackedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, bandMasks: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a MultiPixelPackedSampleModel with the
    // specified DataBuffer, width, height, and bits per pixel.
    def createPackedRaster(dataBuffer: DataBuffer, w: Int, h: Int, bitsPerPixel: Int, location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a SinglePixelPackedSampleModel with
    // the specified data type, width, height, and band masks.
    def createPackedRaster(dataType: Int, w: Int, h: Int, bandMasks: Array[Int], location: Point): WritableRaster = ???

    @stub
    // Creates a Raster based on a packed SampleModel with the
    // specified data type, width, height, number of bands, and bits
    // per band.
    def createPackedRaster(dataType: Int, w: Int, h: Int, bands: Int, bitsPerBand: Int, location: Point): WritableRaster = ???

    @stub
    // Creates a Raster with the specified SampleModel and DataBuffer.
    def createRaster(sm: SampleModel, db: DataBuffer, location: Point): Raster = ???

    @stub
    // Creates a WritableRaster with the specified SampleModel and DataBuffer.
    def createWritableRaster(sm: SampleModel, db: DataBuffer, location: Point): WritableRaster = ???

    @stub
    // Creates a WritableRaster with the specified SampleModel.
    def createWritableRaster(sm: SampleModel, location: Point): WritableRaster = ???
}
