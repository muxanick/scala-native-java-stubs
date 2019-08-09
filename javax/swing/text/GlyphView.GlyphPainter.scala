package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object

// A class to perform rendering of the glyphs.
// This can be implemented to be stateless, or
// to hold some information as a cache to
// facilitate faster rendering and model/view
// translation.  At a minimum, the GlyphPainter
// allows a View implementation to perform its
// duties independant of a particular version
// of JVM and selection of capabilities (i.e.
// shaping for i18n, etc).
object abstract GlyphView.GlyphPainter extends Object {

    @stub
    // 
    def getAscent(v: GlyphView): float

    @stub
    // Determines the model location that represents the
    // maximum advance that fits within the given span.
    def getBoundedPosition(v: GlyphView, p0: Int, x: float, len: float): Int

    @stub
    // 
    def getDescent(v: GlyphView): float

    @stub
    // 
    def getHeight(v: GlyphView): float

    @stub
    // Provides a way to determine the next visually represented model
    // location that one might place a caret.
    def getNextVisualPositionFrom(v: GlyphView, pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    @stub
    // Create a painter to use for the given GlyphView.
    def getPainter(v: GlyphView, p0: Int, p1: Int): GlyphView.GlyphPainter = ???

    @stub
    // Determine the span the glyphs given a start location
    // (for tab expansion).
    def getSpan(v: GlyphView, p0: Int, p1: Int, e: TabExpander, x: float): float

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(v: GlyphView, pos: Int, bias: Position.Bias, a: Shape): Shape

    @stub
    // Paint the glyphs representing the given range.
    def paint(v: GlyphView, g: Graphics, a: Shape, p0: Int, p1: Int): Unit
}
