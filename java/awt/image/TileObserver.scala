package java.awt.image

// An interface for objects that wish to be informed when tiles
// of a WritableRenderedImage become modifiable by some writer via
// a call to getWritableTile, and when they become unmodifiable via
// the last call to releaseWritableTile.
trait TileObserver {
}
