package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class implements the Unicode Bidirectional Algorithm.
 *  
 *  A Bidi object provides information on the bidirectional reordering of the text
 *  used to create it.  This is required, for example, to properly display Arabic
 *  or Hebrew text.  These languages are inherently mixed directional, as they order
 *  numbers from left-to-right while ordering most other text from right-to-left.
 *  
 *  Once created, a Bidi object can be queried to see if the text it represents is
 *  all left-to-right or all right-to-left.  Such objects are very lightweight and
 *  this text is relatively easy to process.
 *  
 *  If there are multiple runs of text, information about the runs can be accessed
 *  by indexing to get the start, limit, and level of a run.  The level represents
 *  both the direction and the 'nesting level' of a directional run.  Odd levels
 *  are right-to-left, while even levels are left-to-right.  So for example level
 *  0 represents left-to-right text, while level 1 represents right-to-left text, and
 *  level 2 represents left-to-right text embedded in a right-to-left run.
 */
final class Bidi extends Object {

    /** Create Bidi from the given paragraph of text. */
    @stub
    def this(paragraph: AttributedCharacterIterator) = ???

    /** Create Bidi from the given text, embedding, and direction information. */
    @stub
    def this(text: Array[Char], textStart: Int, embeddings: Array[Byte], embStart: Int, paragraphLength: Int, flags: Int) = ???

    /** Create Bidi from the given paragraph of text and base direction. */
    @stub
    def this(paragraph: String, flags: Int) = ???

    /** Return true if the base direction is left-to-right. */
    @stub
    def baseIsLeftToRight(): Boolean = ???

    /** Create a Bidi object representing the bidi information on a line of text within
     *  the paragraph represented by the current Bidi.
     */
    @stub
    def createLineBidi(lineStart: Int, lineLimit: Int): Bidi = ???

    /** Return the base level (0 if left-to-right, 1 if right-to-left). */
    @stub
    def getBaseLevel(): Int = ???

    /** Return the length of text in the line. */
    @stub
    def getLength(): Int = ???

    /** Return the resolved level of the character at offset. */
    @stub
    def getLevelAt(offset: Int): Int = ???

    /** Return the number of level runs. */
    @stub
    def getRunCount(): Int = ???

    /** Return the level of the nth logical run in this line. */
    @stub
    def getRunLevel(run: Int): Int = ???

    /** Return the index of the character past the end of the nth logical run in this line, as
     *  an offset from the start of the line.
     */
    @stub
    def getRunLimit(run: Int): Int = ???

    /** Return the index of the character at the start of the nth logical run in this line, as
     *  an offset from the start of the line.
     */
    @stub
    def getRunStart(run: Int): Int = ???

    /** Return true if the line is all left-to-right text and the base direction is left-to-right. */
    @stub
    def isLeftToRight(): Boolean = ???

    /** Return true if the line is not left-to-right or right-to-left. */
    @stub
    def isMixed(): Boolean = ???

    /** Return true if the line is all right-to-left text, and the base direction is right-to-left. */
    @stub
    def isRightToLeft(): Boolean = ???

    /** Display the bidi internal state, used in debugging. */
    @stub
    def toString(): String = ???
}

object Bidi {
    /** Constant indicating that the base direction depends on the first strong
     *  directional character in the text according to the Unicode
     *  Bidirectional Algorithm.
     */
    @stub
    val DIRECTION_DEFAULT_LEFT_TO_RIGHT: Int = ???

    /** Constant indicating that the base direction depends on the first strong
     *  directional character in the text according to the Unicode
     *  Bidirectional Algorithm.
     */
    @stub
    val DIRECTION_DEFAULT_RIGHT_TO_LEFT: Int = ???

    /** Constant indicating base direction is left-to-right. */
    @stub
    val DIRECTION_LEFT_TO_RIGHT: Int = ???

    /** Constant indicating base direction is right-to-left. */
    @stub
    val DIRECTION_RIGHT_TO_LEFT: Int = ???

    /** Reorder the objects in the array into visual order based on their levels. */
    @stub
    def reorderVisually(levels: Array[Byte], levelStart: Int, objects: Array[Object], objectStart: Int, count: Int): Unit = ???

    /** Return true if the specified text requires bidi analysis. */
    @stub
    def requiresBidi(text: Array[Char], start: Int, limit: Int): Boolean = ???
}
