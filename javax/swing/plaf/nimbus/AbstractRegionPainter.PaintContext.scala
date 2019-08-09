package javax.swing.plaf.nimbus

import java.awt.{Dimension, Insets}
import java.lang.Object

// A class encapsulating state useful when painting. Generally, instances of this
// class are created once, and reused for each paint request without modification.
// This class contains values useful when hinting the cache engine, and when decoding
// control points and bezier curve anchors.
object protected AbstractRegionPainter.PaintContext extends Object {

    @stub
    // Creates a new PaintContext which does not attempt to cache or scale any cached
    // images.
    def PaintContext(insets: Insets, canvasSize: Dimension, inverted: Boolean) = ???
