package java.awt.image

import java.awt.Rectangle
import java.lang.{Object, String}
import java.util.Vector

/** RenderedImage is a common interface for objects which contain
 *  or can produce image data in the form of Rasters.  The image
 *  data may be stored/produced as a single tile or a regular array
 *  of tiles.
 */
trait RenderedImage {

    /** Computes an arbitrary rectangular region of the RenderedImage
     *  and copies it into a caller-supplied WritableRaster.
     */
    @stub
    def copyData(raster: WritableRaster): WritableRaster = ???

    /** Returns the ColorModel associated with this image. */
    @stub
    def getColorModel(): ColorModel = ???

    /** Returns the image as one large tile (for tile based
     *  images this will require fetching the whole image
     *  and copying the image data over).
     */
    @stub
    def getData(): Raster = ???

    /** Computes and returns an arbitrary region of the RenderedImage. */
    @stub
    def getData(rect: Rectangle): Raster = ???

    /** Returns the height of the RenderedImage. */
    @stub
    def getHeight(): Int = ???

    /** Returns the minimum tile index in the X direction. */
    @stub
    def getMinTileX(): Int = ???

    /** Returns the minimum tile index in the Y direction. */
    @stub
    def getMinTileY(): Int = ???

    /** Returns the minimum X coordinate (inclusive) of the RenderedImage. */
    @stub
    def getMinX(): Int = ???

    /** Returns the minimum Y coordinate (inclusive) of the RenderedImage. */
    @stub
    def getMinY(): Int = ???

    /** Returns the number of tiles in the X direction. */
    @stub
    def getNumXTiles(): Int = ???

    /** Returns the number of tiles in the Y direction. */
    @stub
    def getNumYTiles(): Int = ???

    /** Gets a property from the property set of this image. */
    @stub
    def getProperty(name: String): Object = ???

    /** Returns an array of names recognized by
     *  getProperty(String)
     *  or null, if no property names are recognized.
     */
    @stub
    def getPropertyNames(): Array[String] = ???

    /** Returns the SampleModel associated with this image. */
    @stub
    def getSampleModel(): SampleModel = ???

    /** Returns a vector of RenderedImages that are the immediate sources of
     *  image data for this RenderedImage.
     */
    @stub
    def getSources(): Vector[RenderedImage] = ???

    /** Returns tile (tileX, tileY). */
    @stub
    def getTile(tileX: Int, tileY: Int): Raster = ???

    /** Returns the X offset of the tile grid relative to the origin,
     *  i.e., the X coordinate of the upper-left pixel of tile (0, 0).
     */
    @stub
    def getTileGridXOffset(): Int = ???

    /** Returns the Y offset of the tile grid relative to the origin,
     *  i.e., the Y coordinate of the upper-left pixel of tile (0, 0).
     */
    @stub
    def getTileGridYOffset(): Int = ???

    /** Returns the tile height in pixels. */
    @stub
    def getTileHeight(): Int = ???

    /** Returns the tile width in pixels. */
    @stub
    def getTileWidth(): Int = ???
}
