package java.awt.image

import java.awt.{Point, Rectangle}
import java.lang.Object

// This class extends Raster to provide pixel writing capabilities.
// Refer to the class comment for Raster for descriptions of how
// a Raster stores pixels.
//
//  The constructors of this class are protected.  To instantiate
// a WritableRaster, use one of the createWritableRaster factory methods
// in the Raster class.
class WritableRaster extends Raster {

    @stub
    // Constructs a WritableRaster with the given SampleModel and DataBuffer.
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, origin: Point) = ???

    @stub
    // Constructs a WritableRaster with the given SampleModel, DataBuffer,
    // and parent.
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, aRegion: Rectangle, sampleModelTranslate: Point, parent: WritableRaster) = ???

    @stub
    // Returns a new WritableRaster which shares all or part of this
    // WritableRaster's DataBuffer.
    def createWritableChild(parentX: Int, parentY: Int, w: Int, h: Int, childMinX: Int, childMinY: Int, bandList: Array[Int]): WritableRaster = ???

    @stub
    // Create a WritableRaster with the same size, SampleModel and DataBuffer
    // as this one, but with a different location.
    def createWritableTranslatedChild(childMinX: Int, childMinY: Int): WritableRaster = ???

    @stub
    // Returns the parent WritableRaster (if any) of this WritableRaster,
    //  or else null.
    def getWritableParent(): WritableRaster = ???

    @stub
    // Sets the data for a rectangle of pixels from a
    // primitive array of type TransferType.
    def setDataElements(x: Int, y: Int, w: Int, h: Int, inData: Object): Unit = ???

    @stub
    // Sets the data for a single pixel from a
    // primitive array of type TransferType.
    def setDataElements(x: Int, y: Int, inData: Object): Unit = ???

    @stub
    // Sets the data for a rectangle of pixels from an input Raster.
    def setDataElements(x: Int, y: Int, inRaster: Raster): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using a double array of samples for input.
    def setPixel(x: Int, y: Int, dArray: Array[double]): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using a float array of samples for input.
    def setPixel(x: Int, y: Int, fArray: Array[float]): Unit = ???

    @stub
    // Sets a pixel in the DataBuffer using an int array of samples for input.
    def setPixel(x: Int, y: Int, iArray: Array[Int]): Unit = ???

    @stub
    // Sets all samples for a rectangle of pixels from a double array containing
    // one sample per array element.
    def setPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[double]): Unit = ???

    @stub
    // Sets all samples for a rectangle of pixels from a float array containing
    // one sample per array element.
    def setPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[float]): Unit = ???

    @stub
    // Sets all samples for a rectangle of pixels from an int array containing
    // one sample per array element.
    def setPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int]): Unit = ???

    @stub
    // Copies pixels from Raster srcRaster to this WritableRaster.
    def setRect(dx: Int, dy: Int, srcRaster: Raster): Unit = ???

    @stub
    // Copies pixels from Raster srcRaster to this WritableRaster.
    def setRect(srcRaster: Raster): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using a double for input.
    def setSample(x: Int, y: Int, b: Int, s: double): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using a float for input.
    def setSample(x: Int, y: Int, b: Int, s: float): Unit = ???

    @stub
    // Sets a sample in the specified band for the pixel located at (x,y)
    // in the DataBuffer using an int for input.
    def setSample(x: Int, y: Int, b: Int, s: Int): Unit = ???

    @stub
    // Sets the samples in the specified band for the specified rectangle
    // of pixels from a double array containing one sample per array element.
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[double]): Unit = ???

    @stub
    // Sets the samples in the specified band for the specified rectangle
    // of pixels from a float array containing one sample per array element.
    def setSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[float]): Unit = ???
}
