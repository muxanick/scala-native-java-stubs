package java.awt.image

import java.awt.{Graphics, Graphics2D, Image, Point, Rectangle, Transparency}
import java.lang.{Object, String}
import java.util.{Hashtable, Vector}
import scala.scalanative.annotation.stub

/** The BufferedImage subclass describes an Image with an accessible buffer of image data.
 *  A BufferedImage is comprised of a ColorModel and a
 *  Raster of image data.
 *  The number and types of bands in the SampleModel of the
 *  Raster must match the number and types required by the
 *  ColorModel to represent its color and alpha components.
 *  All BufferedImage objects have an upper left corner
 *  coordinate of (0, 0).  Any Raster used to construct a
 *  BufferedImage must therefore have minX=0 and minY=0.
 * 
 *  
 *  This class relies on the data fetching and setting methods
 *  of Raster,
 *  and on the color characterization methods of ColorModel.
 */
class BufferedImage extends Image with WritableRenderedImage with Transparency {

    /** Constructs a new BufferedImage with a specified
     *  ColorModel and Raster.
     */
    @stub
    def this(cm: ColorModel, raster: WritableRaster, isRasterPremultiplied: Boolean, properties: Hashtable[_, _]) = ???

    /** Constructs a BufferedImage of one of the predefined
     *  image types.
     */
    @stub
    def this(width: Int, height: Int, imageType: Int) = ???

    /** Constructs a BufferedImage of one of the predefined
     *  image types:
     *  TYPE_BYTE_BINARY or TYPE_BYTE_INDEXED.
     */
    @stub
    def this(width: Int, height: Int, imageType: Int, cm: IndexColorModel) = ???

    /** Adds a tile observer. */
    @stub
    def addTileObserver(to: TileObserver): Unit = ???

    /** Forces the data to match the state specified in the
     *  isAlphaPremultiplied variable.
     */
    @stub
    def coerceData(isAlphaPremultiplied: Boolean): Unit = ???

    /** Computes an arbitrary rectangular region of the
     *  BufferedImage and copies it into a specified
     *  WritableRaster.
     */
    @stub
    def copyData(outRaster: WritableRaster): WritableRaster = ???

    /** Creates a Graphics2D, which can be used to draw into
     *  this BufferedImage.
     */
    @stub
    def createGraphics(): Graphics2D = ???

    /** Returns a WritableRaster representing the alpha
     *  channel for BufferedImage objects
     *  with ColorModel objects that support a separate
     *  spatial alpha channel, such as ComponentColorModel and
     *  DirectColorModel.
     */
    @stub
    def getAlphaRaster(): WritableRaster = ???

    /** Returns the ColorModel. */
    @stub
    def getColorModel(): ColorModel = ???

    /** Returns the image as one large tile. */
    @stub
    def getData(): Raster = ???

    /** Computes and returns an arbitrary region of the
     *  BufferedImage.
     */
    @stub
    def getData(rect: Rectangle): Raster = ???

    /** This method returns a Graphics2D, but is here
     *  for backwards compatibility.
     */
    @stub
    def getGraphics(): Graphics = ???

    /** Returns the height of the BufferedImage. */
    @stub
    def getHeight(): Int = ???

    /** Returns the height of the BufferedImage. */
    @stub
    def getHeight(observer: ImageObserver): Int = ???

    /** Returns the minimum tile index in the x direction. */
    @stub
    def getMinTileX(): Int = ???

    /** Returns the minimum tile index in the y direction. */
    @stub
    def getMinTileY(): Int = ???

    /** Returns the minimum x coordinate of this
     *  BufferedImage.
     */
    @stub
    def getMinX(): Int = ???

    /** Returns the minimum y coordinate of this
     *  BufferedImage.
     */
    @stub
    def getMinY(): Int = ???

    /** Returns the number of tiles in the x direction. */
    @stub
    def getNumXTiles(): Int = ???

    /** Returns the number of tiles in the y direction. */
    @stub
    def getNumYTiles(): Int = ???

    /** Returns a property of the image by name. */
    @stub
    def getProperty(name: String): Any = ???

    /** Returns a property of the image by name. */
    @stub
    def getProperty(name: String, observer: ImageObserver): Any = ???

    /** Returns an array of names recognized by
     *  getProperty(String)
     *  or null, if no property names are recognized.
     */
    @stub
    def getPropertyNames(): Array[String] = ???

    /** Returns the WritableRaster. */
    @stub
    def getRaster(): WritableRaster = ???

    /** Returns an integer pixel in the default RGB color model
     *  (TYPE_INT_ARGB) and default sRGB colorspace.
     */
    @stub
    def getRGB(x: Int, y: Int): Int = ???

    /** Returns an array of integer pixels in the default RGB color model
     *  (TYPE_INT_ARGB) and default sRGB color space,
     *  from a portion of the image data.
     */
    @stub
    def getRGB(startX: Int, startY: Int, w: Int, h: Int, rgbArray: Array[Int], offset: Int, scansize: Int): Array[Int] = ???

    /** Returns the SampleModel associated with this
     *  BufferedImage.
     */
    @stub
    def getSampleModel(): SampleModel = ???

    /** Returns the object that produces the pixels for the image. */
    @stub
    def getSource(): ImageProducer = ???

    /** Returns a Vector of RenderedImage objects that are
     *  the immediate sources, not the sources of these immediate sources,
     *  of image data for this BufferedImage.
     */
    @stub
    def getSources(): Vector[RenderedImage] = ???

    /** Returns a subimage defined by a specified rectangular region. */
    @stub
    def getSubimage(x: Int, y: Int, w: Int, h: Int): BufferedImage = ???

    /** Returns tile (tileX, tileY). */
    @stub
    def getTile(tileX: Int, tileY: Int): Raster = ???

    /** Returns the x offset of the tile grid relative to the origin,
     *  For example, the x coordinate of the location of tile
     *  (0, 0).
     */
    @stub
    def getTileGridXOffset(): Int = ???

    /** Returns the y offset of the tile grid relative to the origin,
     *  For example, the y coordinate of the location of tile
     *  (0, 0).
     */
    @stub
    def getTileGridYOffset(): Int = ???

    /** Returns the tile height in pixels. */
    @stub
    def getTileHeight(): Int = ???

    /** Returns the tile width in pixels. */
    @stub
    def getTileWidth(): Int = ???

    /** Returns the transparency. */
    @stub
    def getTransparency(): Int = ???

    /** Returns the image type. */
    @stub
    def getType(): Int = ???

    /** Returns the width of the BufferedImage. */
    @stub
    def getWidth(): Int = ???

    /** Returns the width of the BufferedImage. */
    @stub
    def getWidth(observer: ImageObserver): Int = ???

    /** Checks out a tile for writing. */
    @stub
    def getWritableTile(tileX: Int, tileY: Int): WritableRaster = ???

    /** Returns an array of Point objects indicating which tiles
     *  are checked out for writing.
     */
    @stub
    def getWritableTileIndices(): Array[Point] = ???

    /** Returns whether or not any tile is checked out for writing. */
    @stub
    def hasTileWriters(): Boolean = ???

    /** Returns whether or not the alpha has been premultiplied. */
    @stub
    def isAlphaPremultiplied(): Boolean = ???

    /** Returns whether or not a tile is currently checked out for writing. */
    @stub
    def isTileWritable(tileX: Int, tileY: Int): Boolean = ???

    /** Relinquishes permission to write to a tile. */
    @stub
    def releaseWritableTile(tileX: Int, tileY: Int): Unit = ???

    /** Removes a tile observer. */
    @stub
    def removeTileObserver(to: TileObserver): Unit = ???

    /** Sets a rectangular region of the image to the contents of the
     *  specified Raster r, which is
     *  assumed to be in the same coordinate space as the
     *  BufferedImage.
     */
    @stub
    def setData(r: Raster): Unit = ???

    /** Sets a pixel in this BufferedImage to the specified
     *  RGB value.
     */
    @stub
    def setRGB(x: Int, y: Int, rgb: Int): Unit = ???

    /** Sets an array of integer pixels in the default RGB color model
     *  (TYPE_INT_ARGB) and default sRGB color space,
     *  into a portion of the image data.
     */
    @stub
    def setRGB(startX: Int, startY: Int, w: Int, h: Int, rgbArray: Array[Int], offset: Int, scansize: Int): Unit = ???

    /** Returns a String representation of this
     *  BufferedImage object and its values.
     */
    @stub
    def toString(): String = ???
}

object BufferedImage {
    /** Represents an image with 8-bit RGB color components, corresponding
     *  to a Windows-style BGR color model) with the colors Blue, Green,
     *  and Red stored in 3 bytes.
     */
    @stub
    val TYPE_3BYTE_BGR: Int = ???

    /** Represents an image with 8-bit RGBA color components with the colors
     *  Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.
     */
    @stub
    val TYPE_4BYTE_ABGR: Int = ???

    /** Represents an image with 8-bit RGBA color components with the colors
     *  Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.
     */
    @stub
    val TYPE_4BYTE_ABGR_PRE: Int = ???

    /** Represents an opaque byte-packed 1, 2, or 4 bit image. */
    @stub
    val TYPE_BYTE_BINARY: Int = ???

    /** Represents a unsigned byte grayscale image, non-indexed. */
    @stub
    val TYPE_BYTE_GRAY: Int = ???

    /** Represents an indexed byte image. */
    @stub
    val TYPE_BYTE_INDEXED: Int = ???

    /** Image type is not recognized so it must be a customized
     *  image.
     */
    @stub
    val TYPE_CUSTOM: Int = ???

    /** Represents an image with 8-bit RGBA color components packed into
     *  integer pixels.
     */
    @stub
    val TYPE_INT_ARGB: Int = ???

    /** Represents an image with 8-bit RGBA color components packed into
     *  integer pixels.
     */
    @stub
    val TYPE_INT_ARGB_PRE: Int = ???

    /** Represents an image with 8-bit RGB color components, corresponding
     *  to a Windows- or Solaris- style BGR color model, with the colors
     *  Blue, Green, and Red packed into integer pixels.
     */
    @stub
    val TYPE_INT_BGR: Int = ???

    /** Represents an image with 8-bit RGB color components packed into
     *  integer pixels.
     */
    @stub
    val TYPE_INT_RGB: Int = ???

    /** Represents an image with 5-5-5 RGB color components (5-bits red,
     *  5-bits green, 5-bits blue) with no alpha.
     */
    @stub
    val TYPE_USHORT_555_RGB: Int = ???

    /** Represents an image with 5-6-5 RGB color components (5-bits red,
     *  6-bits green, 5-bits blue) with no alpha.
     */
    @stub
    val TYPE_USHORT_565_RGB: Int = ???

    /** Represents an unsigned short grayscale image, non-indexed). */
    @stub
    val TYPE_USHORT_GRAY: Int = ???
}
