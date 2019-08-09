package java.awt.font

import java.lang.Object

// The LineMetrics class allows access to the
// metrics needed to layout characters along a line
// and to layout of a set of lines.  A LineMetrics
// object encapsulates the measurement information associated
// with a run of text.
// 
// Fonts can have different metrics for different ranges of
// characters.  The getLineMetrics methods of
// Font take some text as an argument
// and return a LineMetrics object describing the
// metrics of the initial number of characters in that text, as
// returned by getNumChars().
abstract class LineMetrics extends Object {

    // Returns the ascent of the text.
    def getAscent(): float

    // Returns the baseline index of the text.
    def getBaselineIndex(): Int

    // Returns the baseline offsets of the text,
    // relative to the baseline of the text.
    def getBaselineOffsets(): Array[float]

    // Returns the descent of the text.
    def getDescent(): float

    // Returns the height of the text.
    def getHeight(): float

    // Returns the leading of the text.
    def getLeading(): float

    // Returns the number of characters (char values) in the text whose
    // metrics are encapsulated by this LineMetrics
    // object.
    def getNumChars(): Int

    // Returns the position of the strike-through line
    // relative to the baseline.
    def getStrikethroughOffset(): float

    // Returns the thickness of the strike-through line.
    def getStrikethroughThickness(): float

    // Returns the position of the underline relative to
    // the baseline.
    def getUnderlineOffset(): float
}
