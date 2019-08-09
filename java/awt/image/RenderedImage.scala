package java.awt.image

import java.awt.Rectangle
import java.lang.{Object, String}
import java.util.Vector

// RenderedImage is a common interface for objects which contain
// or can produce image data in the form of Rasters.  The image
// data may be stored/produced as a single tile or a regular array
// of tiles.
trait RenderedImage {

    @stub
    // Computes an arbitrary rectangular region of the RenderedImage
    // and copies it into a caller-supplied WritableRaster.
    def copyData(raster: WritableRaster): WritableRaster = ???

    @stub
    // Returns the ColorModel associated with this image.
    def getColorModel(): ColorModel = ???

    @stub
    // Returns the image as one large tile (for tile based
    // images this will require fetching the whole image
    // and copying the image data over).
    def getData(): Raster = ???

    @stub
    // Computes and returns an arbitrary region of the RenderedImage.
    def getData(rect: Rectangle): Raster = ???

    @stub
    // Returns the height of the RenderedImage.
    def getHeight(): Int = ???

    @stub
    // Returns the minimum tile index in the X direction.
    def getMinTileX(): Int = ???

    @stub
    // Returns the minimum tile index in the Y direction.
    def getMinTileY(): Int = ???

    @stub
    // Returns the minimum X coordinate (inclusive) of the RenderedImage.
    def getMinX(): Int = ???

    @stub
    // Returns the minimum Y coordinate (inclusive) of the RenderedImage.
    def getMinY(): Int = ???

    @stub
    // Returns the number of tiles in the X direction.
    def getNumXTiles(): Int = ???

    @stub
    // Returns the number of tiles in the Y direction.
    def getNumYTiles(): Int = ???

    @stub
    // Gets a property from the property set of this image.
    def getProperty(name: String): Object = ???

    @stub
    // Returns an array of names recognized by
    // getProperty(String)
    // or null, if no property names are recognized.
    def getPropertyNames(): Array[String] = ???

    @stub
    // Returns the SampleModel associated with this image.
    def getSampleModel(): SampleModel = ???

    @stub
    // Returns a vector of RenderedImages that are the immediate sources of
    // image data for this RenderedImage.
    def getSources(): Vector[RenderedImage] = ???

    @stub
    // Returns tile (tileX, tileY).
    def getTile(tileX: Int, tileY: Int): Raster = ???

    @stub
    // Returns the X offset of the tile grid relative to the origin,
    // i.e., the X coordinate of the upper-left pixel of tile (0, 0).
    def getTileGridXOffset(): Int = ???

    @stub
    // Returns the Y offset of the tile grid relative to the origin,
    // i.e., the Y coordinate of the upper-left pixel of tile (0, 0).
    def getTileGridYOffset(): Int = ???

    @stub
    // Returns the tile height in pixels.
    def getTileHeight(): Int = ???

    @stub
    // Returns the tile width in pixels.
    def getTileWidth(): Int = ???
}
