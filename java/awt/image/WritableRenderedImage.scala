package java.awt.image

import java.awt.Point

// WriteableRenderedImage is a common interface for objects which
// contain or can produce image data in the form of Rasters and
// which can be modified and/or written over.  The image
// data may be stored/produced as a single tile or a regular array
// of tiles.
// 
// WritableRenderedImage provides notification to other interested
// objects when a tile is checked out for writing (via the
// getWritableTile method) and when the last writer of a particular
// tile relinquishes its access (via a call to releaseWritableTile).
// Additionally, it allows any caller to determine whether any tiles
// are currently checked out (via hasTileWriters), and to obtain a
// list of such tiles (via getWritableTileIndices, in the form of a Vector
// of Point objects).
// 
// Objects wishing to be notified of changes in tile writability must
// implement the TileObserver interface, and are added by a
// call to addTileObserver.  Multiple calls to
// addTileObserver for the same object will result in multiple
// notifications.  An existing observer may reduce its notifications
// by calling removeTileObserver; if the observer had no
// notifications the operation is a no-op.
// 
// It is necessary for a WritableRenderedImage to ensure that
// notifications occur only when the first writer acquires a tile and
// the last writer releases it.
trait WritableRenderedImage extends RenderedImage {

    @stub
    // Adds an observer.
    def addTileObserver(to: TileObserver): Unit = ???

    @stub
    // Checks out a tile for writing.
    def getWritableTile(tileX: Int, tileY: Int): WritableRaster = ???

    @stub
    // Returns an array of Point objects indicating which tiles
    // are checked out for writing.
    def getWritableTileIndices(): Array[Point] = ???

    @stub
    // Returns whether any tile is checked out for writing.
    def hasTileWriters(): Boolean = ???

    @stub
    // Returns whether a tile is currently checked out for writing.
    def isTileWritable(tileX: Int, tileY: Int): Boolean = ???

    @stub
    // Relinquishes the right to write to a tile.
    def releaseWritableTile(tileX: Int, tileY: Int): Unit = ???

    @stub
    // Removes an observer.
    def removeTileObserver(to: TileObserver): Unit = ???
}
