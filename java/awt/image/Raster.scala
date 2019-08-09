package java.awt.image

import java.awt.{Point, Rectangle}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class representing a rectangular array of pixels.  A Raster
 *  encapsulates a DataBuffer that stores the sample values and a
 *  SampleModel that describes how to locate a given sample value in a
 *  DataBuffer.
 *  
 *  A Raster defines values for pixels occupying a particular
 *  rectangular area of the plane, not necessarily including (0, 0).
 *  The rectangle, known as the Raster's bounding rectangle and
 *  available by means of the getBounds method, is defined by minX,
 *  minY, width, and height values.  The minX and minY values define
 *  the coordinate of the upper left corner of the Raster.  References
 *  to pixels outside of the bounding rectangle may result in an
 *  exception being thrown, or may result in references to unintended
 *  elements of the Raster's associated DataBuffer.  It is the user's
 *  responsibility to avoid accessing such pixels.
 *  
 *  A SampleModel describes how samples of a Raster
 *  are stored in the primitive array elements of a DataBuffer.
 *  Samples may be stored one per data element, as in a
 *  PixelInterleavedSampleModel or BandedSampleModel, or packed several to
 *  an element, as in a SinglePixelPackedSampleModel or
 *  MultiPixelPackedSampleModel.  The SampleModel is also
 *  controls whether samples are sign extended, allowing unsigned
 *  data to be stored in signed Java data types such as byte, short, and
 *  int.
 *  
 *  Although a Raster may live anywhere in the plane, a SampleModel
 *  makes use of a simple coordinate system that starts at (0, 0).  A
 *  Raster therefore contains a translation factor that allows pixel
 *  locations to be mapped between the Raster's coordinate system and
 *  that of the SampleModel.  The translation from the SampleModel
 *  coordinate system to that of the Raster may be obtained by the
 *  getSampleModelTranslateX and getSampleModelTranslateY methods.
 *  
 *  A Raster may share a DataBuffer with another Raster either by
 *  explicit construction or by the use of the createChild and
 *  createTranslatedChild methods.  Rasters created by these methods
 *  can return a reference to the Raster they were created from by
 *  means of the getParent method.  For a Raster that was not
 *  constructed by means of a call to createTranslatedChild or
 *  createChild, getParent will return null.
 *  
 *  The createTranslatedChild method returns a new Raster that
 *  shares all of the data of the current Raster, but occupies a
 *  bounding rectangle of the same width and height but with a
 *  different starting point.  For example, if the parent Raster
 *  occupied the region (10, 10) to (100, 100), and the translated
 *  Raster was defined to start at (50, 50), then pixel (20, 20) of the
 *  parent and pixel (60, 60) of the child occupy the same location in
 *  the DataBuffer shared by the two Rasters.  In the first case, (-10,
 *  -10) should be added to a pixel coordinate to obtain the
 *  corresponding SampleModel coordinate, and in the second case (-50,
 *  -50) should be added.
 *  
 *  The translation between a parent and child Raster may be
 *  determined by subtracting the child's sampleModelTranslateX and
 *  sampleModelTranslateY values from those of the parent.
 *  
 *  The createChild method may be used to create a new Raster
 *  occupying only a subset of its parent's bounding rectangle
 *  (with the same or a translated coordinate system) or
 *  with a subset of the bands of its parent.
 *  
 *  All constructors are protected.  The correct way to create a
 *  Raster is to use one of the static create methods defined in this
 *  class.  These methods create instances of Raster that use the
 *  standard Interleaved, Banded, and Packed SampleModels and that may
 *  be processed more efficiently than a Raster created by combining
 *  an externally generated SampleModel and DataBuffer.
 */
class Raster extends Object {

    /** Constructs a Raster with the given SampleModel and DataBuffer. */
    @stub
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, origin: Point) = ???

    /** Constructs a Raster with the given SampleModel, DataBuffer, and
     *  parent.
     */
    @stub
    protected def this(sampleModel: SampleModel, dataBuffer: DataBuffer, aRegion: Rectangle, sampleModelTranslate: Point, parent: Raster) = ???

    /** Constructs a Raster with the given SampleModel. */
    @stub
    protected def this(sampleModel: SampleModel, origin: Point) = ???

    /** The DataBuffer that stores the image data. */
    @stub
    protected val dataBuffer: DataBuffer = ???

    /** The height of this Raster. */
    @stub
    protected val height: Int = ???

    /** The X coordinate of the upper-left pixel of this Raster. */
    @stub
    protected val minX: Int = ???

    /** The Y coordinate of the upper-left pixel of this Raster. */
    @stub
    protected val minY: Int = ???

    /** The number of bands in the Raster. */
    @stub
    protected val numBands: Int = ???

    /** The number of DataBuffer data elements per pixel. */
    @stub
    protected val numDataElements: Int = ???

    /** The parent of this Raster, or null. */
    @stub
    protected val parent: Raster = ???

    /** The SampleModel that describes how pixels from this Raster
     *  are stored in the DataBuffer.
     */
    @stub
    protected val sampleModel: SampleModel = ???

    /** The X translation from the coordinate space of the
     *  Raster's SampleModel to that of the Raster.
     */
    @stub
    protected val sampleModelTranslateX: Int = ???

    /** The Y translation from the coordinate space of the
     *  Raster's SampleModel to that of the Raster.
     */
    @stub
    protected val sampleModelTranslateY: Int = ???

    /** The width of this Raster. */
    @stub
    protected val width: Int = ???

    /** Returns a new Raster which shares all or part of this Raster's
     *  DataBuffer.
     */
    @stub
    def createChild(parentX: Int, parentY: Int, width: Int, height: Int, childMinX: Int, childMinY: Int, bandList: Array[Int]): Raster = ???

    /** Create a compatible WritableRaster the same size as this Raster with
     *  the same SampleModel and a new initialized DataBuffer.
     */
    @stub
    def createCompatibleWritableRaster(): WritableRaster = ???

    /** Create a compatible WritableRaster with the specified size, a new
     *  SampleModel, and a new initialized DataBuffer.
     */
    @stub
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster = ???

    /** Create a compatible WritableRaster with the specified
     *  location (minX, minY) and size (width, height), a
     *  new SampleModel, and a new initialized DataBuffer.
     */
    @stub
    def createCompatibleWritableRaster(x: Int, y: Int, w: Int, h: Int): WritableRaster = ???

    /** Create a compatible WritableRaster with location (minX, minY)
     *  and size (width, height) specified by rect, a
     *  new SampleModel, and a new initialized DataBuffer.
     */
    @stub
    def createCompatibleWritableRaster(rect: Rectangle): WritableRaster = ???

    /** Create a Raster with the same size, SampleModel and DataBuffer
     *  as this one, but with a different location.
     */
    @stub
    def createTranslatedChild(childMinX: Int, childMinY: Int): Raster = ???

    /** Returns the bounding Rectangle of this Raster. */
    @stub
    def getBounds(): Rectangle = ???

    /** Returns the DataBuffer associated with this Raster. */
    @stub
    def getDataBuffer(): DataBuffer = ???

    /** Returns the pixel data for the specified rectangle of pixels in a
     *  primitive array of type TransferType.
     */
    @stub
    def getDataElements(x: Int, y: Int, w: Int, h: Int, outData: Object): Object = ???

    /** Returns data for a single pixel in a primitive array of type
     *  TransferType.
     */
    @stub
    def getDataElements(x: Int, y: Int, outData: Object): Object = ???

    /** Returns the height in pixels of the Raster. */
    @stub
    def getHeight(): Int = ???

    /** Returns the minimum valid X coordinate of the Raster. */
    @stub
    def getMinX(): Int = ???

    /** Returns the minimum valid Y coordinate of the Raster. */
    @stub
    def getMinY(): Int = ???

    /** Returns the number of bands (samples per pixel) in this Raster. */
    @stub
    def getNumBands(): Int = ???

    /** Returns the number of data elements needed to transfer one pixel
     *   via the getDataElements and setDataElements methods.
     */
    @stub
    def getNumDataElements(): Int = ???

    /** Returns the parent Raster (if any) of this Raster or null. */
    @stub
    def getParent(): Raster = ???

    /** Returns the samples in an array of double for the specified pixel. */
    @stub
    def getPixel(x: Int, y: Int, dArray: Array[Double]): Array[Double] = ???

    /** Returns the samples in an array of float for the
     *  specified pixel.
     */
    @stub
    def getPixel(x: Int, y: Int, fArray: Array[Float]): Array[Float] = ???

    /** Returns the samples in an array of int for the specified pixel. */
    @stub
    def getPixel(x: Int, y: Int, iArray: Array[Int]): Array[Int] = ???

    /** Returns a double array containing all samples for a rectangle of pixels,
     *  one sample per array element.
     */
    @stub
    def getPixels(x: Int, y: Int, w: Int, h: Int, dArray: Array[Double]): Array[Double] = ???

    /** Returns a float array containing all samples for a rectangle of pixels,
     *  one sample per array element.
     */
    @stub
    def getPixels(x: Int, y: Int, w: Int, h: Int, fArray: Array[Float]): Array[Float] = ???

    /** Returns an int array containing all samples for a rectangle of pixels,
     *  one sample per array element.
     */
    @stub
    def getPixels(x: Int, y: Int, w: Int, h: Int, iArray: Array[Int]): Array[Int] = ???

    /** Returns the sample in a specified band for the pixel located
     *  at (x,y) as an int.
     */
    @stub
    def getSample(x: Int, y: Int, b: Int): Int = ???

    /** Returns the sample in a specified band
     *  for a pixel located at (x,y) as a double.
     */
    @stub
    def getSampleDouble(x: Int, y: Int, b: Int): Double = ???

    /** Returns the sample in a specified band
     *  for the pixel located at (x,y) as a float.
     */
    @stub
    def getSampleFloat(x: Int, y: Int, b: Int): Float = ???

    /** Returns the SampleModel that describes the layout of the image data. */
    @stub
    def getSampleModel(): SampleModel = ???

    /** Returns the X translation from the coordinate system of the
     *  SampleModel to that of the Raster.
     */
    @stub
    def getSampleModelTranslateX(): Int = ???

    /** Returns the Y translation from the coordinate system of the
     *  SampleModel to that of the Raster.
     */
    @stub
    def getSampleModelTranslateY(): Int = ???

    /** Returns the samples for a specified band for a specified rectangle
     *  of pixels in a double array, one sample per array element.
     */
    @stub
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, dArray: Array[Double]): Array[Double] = ???

    /** Returns the samples for a specified band for the specified rectangle
     *  of pixels in a float array, one sample per array element.
     */
    @stub
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, fArray: Array[Float]): Array[Float] = ???

    /** Returns the samples for a specified band for the specified rectangle
     *  of pixels in an int array, one sample per array element.
     */
    @stub
    def getSamples(x: Int, y: Int, w: Int, h: Int, b: Int, iArray: Array[Int]): Array[Int] = ???

    /** Returns the TransferType used to transfer pixels via the
     *   getDataElements and setDataElements methods.
     */
    @stub
    def getTransferType(): Int = ???

    /** Returns the width in pixels of the Raster. */
    @stub
    def getWidth(): Int = ???
}

object Raster {
    /** Creates a Raster based on a BandedSampleModel with the
     *  specified DataBuffer, width, height, scanline stride, bank
     *  indices, and band offsets.
     */
    @stub
    def createBandedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, bankIndices: Array[Int], bandOffsets: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a BandedSampleModel with the
     *  specified data type, width, height, scanline stride, bank
     *  indices and band offsets.
     */
    @stub
    def createBandedRaster(dataType: Int, w: Int, h: Int, scanlineStride: Int, bankIndices: Array[Int], bandOffsets: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a BandedSampleModel with the
     *  specified data type, width, height, and number of bands.
     */
    @stub
    def createBandedRaster(dataType: Int, w: Int, h: Int, bands: Int, location: Point): WritableRaster = ???

    /** Creates a Raster based on a PixelInterleavedSampleModel with the
     *  specified DataBuffer, width, height, scanline stride, pixel
     *  stride, and band offsets.
     */
    @stub
    def createInterleavedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, pixelStride: Int, bandOffsets: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a PixelInterleavedSampleModel with the
     *  specified data type, width, height, scanline stride, pixel
     *  stride, and band offsets.
     */
    @stub
    def createInterleavedRaster(dataType: Int, w: Int, h: Int, scanlineStride: Int, pixelStride: Int, bandOffsets: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a PixelInterleavedSampleModel with the
     *  specified data type, width, height, and number of bands.
     */
    @stub
    def createInterleavedRaster(dataType: Int, w: Int, h: Int, bands: Int, location: Point): WritableRaster = ???

    /** Creates a Raster based on a SinglePixelPackedSampleModel with
     *  the specified DataBuffer, width, height, scanline stride, and
     *  band masks.
     */
    @stub
    def createPackedRaster(dataBuffer: DataBuffer, w: Int, h: Int, scanlineStride: Int, bandMasks: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a MultiPixelPackedSampleModel with the
     *  specified DataBuffer, width, height, and bits per pixel.
     */
    @stub
    def createPackedRaster(dataBuffer: DataBuffer, w: Int, h: Int, bitsPerPixel: Int, location: Point): WritableRaster = ???

    /** Creates a Raster based on a SinglePixelPackedSampleModel with
     *  the specified data type, width, height, and band masks.
     */
    @stub
    def createPackedRaster(dataType: Int, w: Int, h: Int, bandMasks: Array[Int], location: Point): WritableRaster = ???

    /** Creates a Raster based on a packed SampleModel with the
     *  specified data type, width, height, number of bands, and bits
     *  per band.
     */
    @stub
    def createPackedRaster(dataType: Int, w: Int, h: Int, bands: Int, bitsPerBand: Int, location: Point): WritableRaster = ???

    /** Creates a Raster with the specified SampleModel and DataBuffer. */
    @stub
    def createRaster(sm: SampleModel, db: DataBuffer, location: Point): Raster = ???

    /** Creates a WritableRaster with the specified SampleModel and DataBuffer. */
    @stub
    def createWritableRaster(sm: SampleModel, db: DataBuffer, location: Point): WritableRaster = ???

    /** Creates a WritableRaster with the specified SampleModel. */
    @stub
    def createWritableRaster(sm: SampleModel, location: Point): WritableRaster = ???
}
