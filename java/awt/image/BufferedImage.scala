package java.awt.image

import java.awt.{Graphics, Graphics2D, Image, Point, Rectangle, Transparency}
import java.lang.{Object, String}
import java.util.{Hashtable, Vector}

// The BufferedImage subclass describes an Image with an accessible buffer of image data.
// A BufferedImage is comprised of a ColorModel and a
// Raster of image data.
// The number and types of bands in the SampleModel of the
// Raster must match the number and types required by the
// ColorModel to represent its color and alpha components.
// All BufferedImage objects have an upper left corner
// coordinate of (0, 0).  Any Raster used to construct a
// BufferedImage must therefore have minX=0 and minY=0.
//
// 
// This class relies on the data fetching and setting methods
// of Raster,
// and on the color characterization methods of ColorModel.
class BufferedImage extends Image with WritableRenderedImage, with Transparency {

    @stub
    // Constructs a new BufferedImage with a specified
    // ColorModel and Raster.
    def this(cm: ColorModel, raster: WritableRaster, isRasterPremultiplied: Boolean, properties: Hashtable[_, _]) = ???

    @stub
    // Constructs a BufferedImage of one of the predefined
    // image types.
    def this(width: Int, height: Int, imageType: Int) = ???

    @stub
    // Adds a tile observer.
    def addTileObserver(to: TileObserver): Unit = ???

    @stub
    // Forces the data to match the state specified in the
    // isAlphaPremultiplied variable.
    def coerceData(isAlphaPremultiplied: Boolean): Unit = ???

    @stub
    // Computes an arbitrary rectangular region of the
    // BufferedImage and copies it into a specified
    // WritableRaster.
    def copyData(outRaster: WritableRaster): WritableRaster = ???

    @stub
    // Creates a Graphics2D, which can be used to draw into
    // this BufferedImage.
    def createGraphics(): Graphics2D = ???

    @stub
    // Returns a WritableRaster representing the alpha
    // channel for BufferedImage objects
    // with ColorModel objects that support a separate
    // spatial alpha channel, such as ComponentColorModel and
    // DirectColorModel.
    def getAlphaRaster(): WritableRaster = ???

    @stub
    // Returns the ColorModel.
    def getColorModel(): ColorModel = ???

    @stub
    // Returns the image as one large tile.
    def getData(): Raster = ???

    @stub
    // Computes and returns an arbitrary region of the
    // BufferedImage.
    def getData(rect: Rectangle): Raster = ???

    @stub
    // This method returns a Graphics2D, but is here
    // for backwards compatibility.
    def getGraphics(): Graphics = ???

    @stub
    // Returns the height of the BufferedImage.
    def getHeight(): Int = ???

    @stub
    // Returns the height of the BufferedImage.
    def getHeight(observer: ImageObserver): Int = ???

    @stub
    // Returns the minimum tile index in the x direction.
    def getMinTileX(): Int = ???

    @stub
    // Returns the minimum tile index in the y direction.
    def getMinTileY(): Int = ???

    @stub
    // Returns the minimum x coordinate of this
    // BufferedImage.
    def getMinX(): Int = ???

    @stub
    // Returns the minimum y coordinate of this
    // BufferedImage.
    def getMinY(): Int = ???

    @stub
    // Returns the number of tiles in the x direction.
    def getNumXTiles(): Int = ???

    @stub
    // Returns the number of tiles in the y direction.
    def getNumYTiles(): Int = ???

    @stub
    // Returns a property of the image by name.
    def getProperty(name: String): Object = ???

    @stub
    // Returns a property of the image by name.
    def getProperty(name: String, observer: ImageObserver): Object = ???

    @stub
    // Returns an array of names recognized by
    // getProperty(String)
    // or null, if no property names are recognized.
    def getPropertyNames(): Array[String] = ???

    @stub
    // Returns the WritableRaster.
    def getRaster(): WritableRaster = ???

    @stub
    // Returns an integer pixel in the default RGB color model
    // (TYPE_INT_ARGB) and default sRGB colorspace.
    def getRGB(x: Int, y: Int): Int = ???

    @stub
    // Returns an array of integer pixels in the default RGB color model
    // (TYPE_INT_ARGB) and default sRGB color space,
    // from a portion of the image data.
    def getRGB(startX: Int, startY: Int, w: Int, h: Int, rgbArray: Array[Int], offset: Int, scansize: Int): Array[Int] = ???

    @stub
    // Returns the SampleModel associated with this
    // BufferedImage.
    def getSampleModel(): SampleModel = ???

    @stub
    // Returns the object that produces the pixels for the image.
    def getSource(): ImageProducer = ???

    @stub
    // Returns a Vector of RenderedImage objects that are
    // the immediate sources, not the sources of these immediate sources,
    // of image data for this BufferedImage.
    def getSources(): Vector[RenderedImage] = ???

    @stub
    // Returns a subimage defined by a specified rectangular region.
    def getSubimage(x: Int, y: Int, w: Int, h: Int): BufferedImage = ???

    @stub
    // Returns tile (tileX, tileY).
    def getTile(tileX: Int, tileY: Int): Raster = ???

    @stub
    // Returns the x offset of the tile grid relative to the origin,
    // For example, the x coordinate of the location of tile
    // (0, 0).
    def getTileGridXOffset(): Int = ???

    @stub
    // Returns the y offset of the tile grid relative to the origin,
    // For example, the y coordinate of the location of tile
    // (0, 0).
    def getTileGridYOffset(): Int = ???

    @stub
    // Returns the tile height in pixels.
    def getTileHeight(): Int = ???

    @stub
    // Returns the tile width in pixels.
    def getTileWidth(): Int = ???

    @stub
    // Returns the transparency.
    def getTransparency(): Int = ???

    @stub
    // Returns the image type.
    def getType(): Int = ???

    @stub
    // Returns the width of the BufferedImage.
    def getWidth(): Int = ???

    @stub
    // Returns the width of the BufferedImage.
    def getWidth(observer: ImageObserver): Int = ???

    @stub
    // Checks out a tile for writing.
    def getWritableTile(tileX: Int, tileY: Int): WritableRaster = ???

    @stub
    // Returns an array of Point objects indicating which tiles
    // are checked out for writing.
    def getWritableTileIndices(): Array[Point] = ???

    @stub
    // Returns whether or not any tile is checked out for writing.
    def hasTileWriters(): Boolean = ???

    @stub
    // Returns whether or not the alpha has been premultiplied.
    def isAlphaPremultiplied(): Boolean = ???

    @stub
    // Returns whether or not a tile is currently checked out for writing.
    def isTileWritable(tileX: Int, tileY: Int): Boolean = ???

    @stub
    // Relinquishes permission to write to a tile.
    def releaseWritableTile(tileX: Int, tileY: Int): Unit = ???

    @stub
    // Removes a tile observer.
    def removeTileObserver(to: TileObserver): Unit = ???

    @stub
    // Sets a rectangular region of the image to the contents of the
    // specified Raster r, which is
    // assumed to be in the same coordinate space as the
    // BufferedImage.
    def setData(r: Raster): Unit = ???

    @stub
    // Sets a pixel in this BufferedImage to the specified
    // RGB value.
    def setRGB(x: Int, y: Int, rgb: Int): Unit = ???

    @stub
    // Sets an array of integer pixels in the default RGB color model
    // (TYPE_INT_ARGB) and default sRGB color space,
    // into a portion of the image data.
    def setRGB(startX: Int, startY: Int, w: Int, h: Int, rgbArray: Array[Int], offset: Int, scansize: Int): Unit = ???
}

object BufferedImage {
    @stub
    // Represents an image with 8-bit RGB color components, corresponding
    // to a Windows-style BGR color model) with the colors Blue, Green,
    // and Red stored in 3 bytes.
    def TYPE_3BYTE_BGR: Int = ???

    @stub
    // Represents an image with 8-bit RGBA color components with the colors
    // Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.
    def TYPE_4BYTE_ABGR: Int = ???

    @stub
    // Represents an image with 8-bit RGBA color components with the colors
    // Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.
    def TYPE_4BYTE_ABGR_PRE: Int = ???

    @stub
    // Represents an opaque byte-packed 1, 2, or 4 bit image.
    def TYPE_BYTE_BINARY: Int = ???

    @stub
    // Represents a unsigned byte grayscale image, non-indexed.
    def TYPE_BYTE_GRAY: Int = ???

    @stub
    // Represents an indexed byte image.
    def TYPE_BYTE_INDEXED: Int = ???

    @stub
    // Image type is not recognized so it must be a customized
    // image.
    def TYPE_CUSTOM: Int = ???

    @stub
    // Represents an image with 8-bit RGBA color components packed into
    // integer pixels.
    def TYPE_INT_ARGB: Int = ???

    @stub
    // Represents an image with 8-bit RGBA color components packed into
    // integer pixels.
    def TYPE_INT_ARGB_PRE: Int = ???

    @stub
    // Represents an image with 8-bit RGB color components, corresponding
    // to a Windows- or Solaris- style BGR color model, with the colors
    // Blue, Green, and Red packed into integer pixels.
    def TYPE_INT_BGR: Int = ???

    @stub
    // Represents an image with 8-bit RGB color components packed into
    // integer pixels.
    def TYPE_INT_RGB: Int = ???

    @stub
    // Represents an image with 5-5-5 RGB color components (5-bits red,
    // 5-bits green, 5-bits blue) with no alpha.
    def TYPE_USHORT_555_RGB: Int = ???

    @stub
    // Represents an image with 5-6-5 RGB color components (5-bits red,
    // 6-bits green, 5-bits blue) with no alpha.
    def TYPE_USHORT_565_RGB: Int = ???
}
