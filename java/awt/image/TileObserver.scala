package java.awt.image

import scala.scalanative.annotation.stub

/** An interface for objects that wish to be informed when tiles
 *  of a WritableRenderedImage become modifiable by some writer via
 *  a call to getWritableTile, and when they become unmodifiable via
 *  the last call to releaseWritableTile.
 */
trait TileObserver {

    /** A tile is about to be updated (it is either about to be grabbed
     *  for writing, or it is being released from writing).
     */
    @stub
    def tileUpdate(source: WritableRenderedImage, tileX: Int, tileY: Int, willBeWritable: Boolean): Unit = ???
}
