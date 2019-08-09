package javax.swing.text

import java.awt.{FontMetrics, Graphics}
import java.lang.Object

// A collection of methods to deal with various text
// related activities.
class Utilities extends Object {
}

object Utilities {
    @stub
    // Draws the given text, expanding any tabs that are contained
    // using the given tab expansion technique.
    def drawTabbedText(s: Segment, x: Int, y: Int, g: Graphics, e: TabExpander, startOffset: Int): Int = ???

    @stub
    // Determine where to break the given text to fit
    // within the given span.
    def getBreakLocation(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int): Int = ???

    @stub
    // Determines the start of the next word for the given location.
    def getNextWord(c: JTextComponent, offs: Int): Int = ???

    @stub
    // Determines the element to use for a paragraph/line.
    def getParagraphElement(c: JTextComponent, offs: Int): Element = ???

    @stub
    // Determines the position in the model that is closest to the given
    // view location in the row above.
    def getPositionAbove(c: JTextComponent, offs: Int, x: Int): Int = ???

    @stub
    // Determines the position in the model that is closest to the given
    // view location in the row below.
    def getPositionBelow(c: JTextComponent, offs: Int, x: Int): Int = ???

    @stub
    // Determine the start of the prev word for the given location.
    def getPreviousWord(c: JTextComponent, offs: Int): Int = ???

    @stub
    // Determines the ending row model position of the row that contains
    // the specified model position.
    def getRowEnd(c: JTextComponent, offs: Int): Int = ???

    @stub
    // Determines the starting row model position of the row that contains
    // the specified model position.
    def getRowStart(c: JTextComponent, offs: Int): Int = ???

    @stub
    // Determines the relative offset into the given text that
    // best represents the given span in the view coordinate
    // system.
    def getTabbedTextOffset(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int): Int = ???

    @stub
    // 
    def getTabbedTextOffset(s: Segment, metrics: FontMetrics, x0: Int, x: Int, e: TabExpander, startOffset: Int, round: Boolean): Int = ???

    @stub
    // Determines the width of the given segment of text taking tabs
    // into consideration.
    def getTabbedTextWidth(s: Segment, metrics: FontMetrics, x: Int, e: TabExpander, startOffset: Int): Int = ???

    @stub
    // Determines the end of a word for the given location.
    def getWordEnd(c: JTextComponent, offs: Int): Int = ???
}
