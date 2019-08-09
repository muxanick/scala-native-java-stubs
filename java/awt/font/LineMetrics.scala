package java.awt.font

import java.lang.Object

/** The LineMetrics class allows access to the
 *  metrics needed to layout characters along a line
 *  and to layout of a set of lines.  A LineMetrics
 *  object encapsulates the measurement information associated
 *  with a run of text.
 *  
 *  Fonts can have different metrics for different ranges of
 *  characters.  The getLineMetrics methods of
 *  Font take some text as an argument
 *  and return a LineMetrics object describing the
 *  metrics of the initial number of characters in that text, as
 *  returned by getNumChars().
 */
abstract class LineMetrics extends Object {

    /** Returns the ascent of the text. */
    def getAscent(): Float

    /** Returns the baseline index of the text. */
    def getBaselineIndex(): Int

    /** Returns the baseline offsets of the text,
     *  relative to the baseline of the text.
     */
    def getBaselineOffsets(): Array[Float]

    /** Returns the descent of the text. */
    def getDescent(): Float

    /** Returns the height of the text. */
    def getHeight(): Float

    /** Returns the leading of the text. */
    def getLeading(): Float

    /** Returns the number of characters (char values) in the text whose
     *  metrics are encapsulated by this LineMetrics
     *  object.
     */
    def getNumChars(): Int

    /** Returns the position of the strike-through line
     *  relative to the baseline.
     */
    def getStrikethroughOffset(): Float

    /** Returns the thickness of the strike-through line. */
    def getStrikethroughThickness(): Float

    /** Returns the position of the underline relative to
     *  the baseline.
     */
    def getUnderlineOffset(): Float
}
