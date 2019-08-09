package java.awt

import java.awt.font.{FontRenderContext, LineMetrics}
import java.awt.geom.Rectangle2D
import java.io.Serializable
import java.lang.{Object, String}
import java.text.CharacterIterator

/** The FontMetrics class defines a font metrics object, which
 *  encapsulates information about the rendering of a particular font on a
 *  particular screen.
 *  
 *  Note to subclassers: Since many of these methods form closed,
 *  mutually recursive loops, you must take care that you implement
 *  at least one of the methods in each such loop to prevent
 *  infinite recursion when your subclass is used.
 *  In particular, the following is the minimal suggested set of methods
 *  to override in order to ensure correctness and prevent infinite
 *  recursion (though other subsets are equally feasible):
 *  
 *  getAscent()
 *  getLeading()
 *  getMaxAdvance()
 *  charWidth(char)
 *  charsWidth(char[], int, int)
 *  
 *  
 *  
 *  Note that the implementations of these methods are
 *  inefficient, so they are usually overridden with more efficient
 *  toolkit-specific implementations.
 *  
 *  When an application asks to place a character at the position
 *  (x, y), the character is placed so that its
 *  reference point (shown as the dot in the accompanying image) is
 *  put at that position. The reference point specifies a horizontal
 *  line called the baseline of the character. In normal
 *  printing, the baselines of characters should align.
 *  
 *  In addition, every character in a font has an ascent, a
 *  descent, and an advance width. The ascent is the
 *  amount by which the character ascends above the baseline. The
 *  descent is the amount by which the character descends below the
 *  baseline. The advance width indicates the position at which AWT
 *  should place the next character.
 *  
 *  An array of characters or a string can also have an ascent, a
 *  descent, and an advance width. The ascent of the array is the
 *  maximum ascent of any character in the array. The descent is the
 *  maximum descent of any character in the array. The advance width
 *  is the sum of the advance widths of each of the characters in the
 *  character array.  The advance of a String is the
 *  distance along the baseline of the String.  This
 *  distance is the width that should be used for centering or
 *  right-aligning the String.
 *  Note that the advance of a String is not necessarily
 *  the sum of the advances of its characters measured in isolation
 *  because the width of a character can vary depending on its context.
 *  For example, in Arabic text, the shape of a character can change
 *  in order to connect to other characters.  Also, in some scripts,
 *  certain character sequences can be represented by a single shape,
 *  called a ligature.  Measuring characters individually does
 *  not account for these transformations.
 *  Font metrics are baseline-relative, meaning that they are
 *  generally independent of the rotation applied to the font (modulo
 *  possible grid hinting effects).  See Font.
 */
abstract class FontMetrics extends Object with Serializable {

    /** Returns the total advance width for showing the specified array
     *  of bytes in this Font.
     */
    def bytesWidth(data: Array[Byte], off: Int, len: Int): Int

    /** Returns the total advance width for showing the specified array
     *  of characters in this Font.
     */
    def charsWidth(data: Array[Char], off: Int, len: Int): Int

    /** Returns the advance width of the specified character in this
     *  Font.
     */
    def charWidth(ch: Char): Int

    /** Returns the advance width of the specified character in this
     *  Font.
     */
    def charWidth(codePoint: Int): Int

    /** Determines the font ascent of the Font
     *  described by this FontMetrics object.
     */
    def getAscent(): Int

    /** Determines the font descent of the Font
     *  described by this
     *  FontMetrics object.
     */
    def getDescent(): Int

    /** Gets the Font described by this
     *  FontMetrics object.
     */
    def getFont(): Font

    /** Gets the FontRenderContext used by this
     *  FontMetrics object to measure text.
     */
    def getFontRenderContext(): FontRenderContext

    /** Gets the standard height of a line of text in this font. */
    def getHeight(): Int

    /** Determines the standard leading of the
     *  Font described by this FontMetrics
     *  object.
     */
    def getLeading(): Int

    /** Returns the LineMetrics object for the specified
     *  character array in the specified Graphics context.
     */
    def getLineMetrics(chars: Array[Char], beginIndex: Int, limit: Int, context: Graphics): LineMetrics

    /** Returns the LineMetrics object for the specified
     *  CharacterIterator in the specified Graphics
     *  context.
     */
    def getLineMetrics(ci: CharacterIterator, beginIndex: Int, limit: Int, context: Graphics): LineMetrics

    /** Returns the LineMetrics object for the specified
     *  String in the specified Graphics context.
     */
    def getLineMetrics(str: String, context: Graphics): LineMetrics

    /** Returns the LineMetrics object for the specified
     *  String in the specified Graphics context.
     */
    def getLineMetrics(str: String, beginIndex: Int, limit: Int, context: Graphics): LineMetrics

    /** Gets the maximum advance width of any character in this
     *  Font.
     */
    def getMaxAdvance(): Int

    /** Determines the maximum ascent of the Font
     *  described by this FontMetrics object.
     */
    def getMaxAscent(): Int

    /** Returns the bounds for the character with the maximum bounds
     *  in the specified Graphics context.
     */
    def getMaxCharBounds(context: Graphics): Rectangle2D

    /** Deprecated. 
     * As of JDK version 1.1.1,
     *  replaced by getMaxDescent().
     * 
     */
    def getMaxDecent(): Int

    /** Determines the maximum descent of the Font
     *  described by this FontMetrics object.
     */
    def getMaxDescent(): Int

    /** Returns the bounds of the specified array of characters
     *  in the specified Graphics context.
     */
    def getStringBounds(chars: Array[Char], beginIndex: Int, limit: Int, context: Graphics): Rectangle2D

    /** Returns the bounds of the characters indexed in the specified
     *  CharacterIterator in the
     *  specified Graphics context.
     */
    def getStringBounds(ci: CharacterIterator, beginIndex: Int, limit: Int, context: Graphics): Rectangle2D

    /** Returns the bounds of the specified String in the
     *  specified Graphics context.
     */
    def getStringBounds(str: String, context: Graphics): Rectangle2D

    /** Returns the bounds of the specified String in the
     *  specified Graphics context.
     */
    def getStringBounds(str: String, beginIndex: Int, limit: Int, context: Graphics): Rectangle2D

    /** Gets the advance widths of the first 256 characters in the
     *  Font.
     */
    def getWidths(): Array[Int]

    /** Checks to see if the Font has uniform line metrics. */
    def hasUniformLineMetrics(): Boolean

    /** Returns the total advance width for showing the specified
     *  String in this Font.
     */
    def stringWidth(str: String): Int
}
