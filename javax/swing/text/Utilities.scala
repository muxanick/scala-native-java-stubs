package javax.swing.text

import java.awt.{FontMetrics, Graphics}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A collection of methods to deal with various text
 *  related activities.
 */
class Utilities extends Object {

    /**  */
    @stub
    def this() = ???
}

object Utilities {
    /** Draws the given text, expanding any tabs that are contained
     *  using the given tab expansion technique.
     */
    @stub
    def drawTabbedText(s: Segment, x: Int, y: Int, g: Graphics, e: TabExpander, startOffset: Int): Int = ???

    /** Determine where to break the given text to fit
     *  within the given span.
     */
    @stub
    def getBreakLocation(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int): Int = ???

    /** Determines the start of the next word for the given location. */
    @stub
    def getNextWord(c: JTextComponent, offs: Int): Int = ???

    /** Determines the element to use for a paragraph/line. */
    @stub
    def getParagraphElement(c: JTextComponent, offs: Int): Element = ???

    /** Determines the position in the model that is closest to the given
     *  view location in the row above.
     */
    @stub
    def getPositionAbove(c: JTextComponent, offs: Int, x: Int): Int = ???

    /** Determines the position in the model that is closest to the given
     *  view location in the row below.
     */
    @stub
    def getPositionBelow(c: JTextComponent, offs: Int, x: Int): Int = ???

    /** Determine the start of the prev word for the given location. */
    @stub
    def getPreviousWord(c: JTextComponent, offs: Int): Int = ???

    /** Determines the ending row model position of the row that contains
     *  the specified model position.
     */
    @stub
    def getRowEnd(c: JTextComponent, offs: Int): Int = ???

    /** Determines the starting row model position of the row that contains
     *  the specified model position.
     */
    @stub
    def getRowStart(c: JTextComponent, offs: Int): Int = ???

    /** Determines the relative offset into the given text that
     *  best represents the given span in the view coordinate
     *  system.
     */
    @stub
    def getTabbedTextOffset(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int): Int = ???

    /**  */
    @stub
    def getTabbedTextOffset(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int, round: Boolean): Int = ???

    /** Determines the width of the given segment of text taking tabs
     *  into consideration.
     */
    @stub
    def getTabbedTextWidth(s: Segment, metrics: FontMetrics, x: Int, e: TabExpander, startOffset: Int): Int = ???

    /** Determines the end of a word for the given location. */
    @stub
    def getWordEnd(c: JTextComponent, offs: Int): Int = ???

    /** Determines the start of a word for the given model location. */
    @stub
    def getWordStart(c: JTextComponent, offs: Int): Int = ???
}
