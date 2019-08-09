package java.text

import java.lang.Object

// This class implements the Unicode Bidirectional Algorithm.
// 
// A Bidi object provides information on the bidirectional reordering of the text
// used to create it.  This is required, for example, to properly display Arabic
// or Hebrew text.  These languages are inherently mixed directional, as they order
// numbers from left-to-right while ordering most other text from right-to-left.
// 
// Once created, a Bidi object can be queried to see if the text it represents is
// all left-to-right or all right-to-left.  Such objects are very lightweight and
// this text is relatively easy to process.
// 
// If there are multiple runs of text, information about the runs can be accessed
// by indexing to get the start, limit, and level of a run.  The level represents
// both the direction and the 'nesting level' of a directional run.  Odd levels
// are right-to-left, while even levels are left-to-right.  So for example level
// 0 represents left-to-right text, while level 1 represents right-to-left text, and
// level 2 represents left-to-right text embedded in a right-to-left run.
final class Bidi extends Object {

    @stub
    // Create Bidi from the given paragraph of text.
    def this(paragraph: AttributedCharacterIterator) = ???

    @stub
    // Create Bidi from the given text, embedding, and direction information.
    def this(text: Array[Char], textStart: Int, embeddings: Array[Byte], embStart: Int, paragraphLength: Int, flags: Int) = ???

    @stub
    // Return true if the base direction is left-to-right.
    def baseIsLeftToRight(): Boolean = ???

    @stub
    // Create a Bidi object representing the bidi information on a line of text within
    // the paragraph represented by the current Bidi.
    def createLineBidi(lineStart: Int, lineLimit: Int): Bidi = ???

    @stub
    // Return the base level (0 if left-to-right, 1 if right-to-left).
    def getBaseLevel(): Int = ???

    @stub
    // Return the length of text in the line.
    def getLength(): Int = ???

    @stub
    // Return the resolved level of the character at offset.
    def getLevelAt(offset: Int): Int = ???

    @stub
    // Return the number of level runs.
    def getRunCount(): Int = ???

    @stub
    // Return the level of the nth logical run in this line.
    def getRunLevel(run: Int): Int = ???

    @stub
    // Return the index of the character past the end of the nth logical run in this line, as
    // an offset from the start of the line.
    def getRunLimit(run: Int): Int = ???

    @stub
    // Return the index of the character at the start of the nth logical run in this line, as
    // an offset from the start of the line.
    def getRunStart(run: Int): Int = ???

    @stub
    // Return true if the line is all left-to-right text and the base direction is left-to-right.
    def isLeftToRight(): Boolean = ???

    @stub
    // Return true if the line is not left-to-right or right-to-left.
    def isMixed(): Boolean = ???

    @stub
    // Return true if the line is all right-to-left text, and the base direction is right-to-left.
    def isRightToLeft(): Boolean = ???
}

object Bidi {
    @stub
    // Constant indicating that the base direction depends on the first strong
    // directional character in the text according to the Unicode
    // Bidirectional Algorithm.
    def DIRECTION_DEFAULT_LEFT_TO_RIGHT: Int = ???

    @stub
    // Constant indicating that the base direction depends on the first strong
    // directional character in the text according to the Unicode
    // Bidirectional Algorithm.
    def DIRECTION_DEFAULT_RIGHT_TO_LEFT: Int = ???

    @stub
    // Constant indicating base direction is left-to-right.
    def DIRECTION_LEFT_TO_RIGHT: Int = ???

    @stub
    // Reorder the objects in the array into visual order based on their levels.
    def reorderVisually(levels: Array[Byte], levelStart: Int, objects: Array[Object], objectStart: Int, count: Int): Unit = ???

    @stub
    // Return true if the specified text requires bidi analysis.
    def requiresBidi(text: Array[Char], start: Int, limit: Int): Boolean = ???
}
