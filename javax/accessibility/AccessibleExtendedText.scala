package javax.accessibility

import java.awt.Rectangle
import java.lang.String
import scala.scalanative.annotation.stub

/** The AccessibleExtendedText interface contains additional methods
 *  not provided by the AccessibleText interface
 * 
 *  Applications can determine if an object supports the AccessibleExtendedText
 *  interface by first obtaining its AccessibleContext (see Accessible)
 *  and then calling the AccessibleContext.getAccessibleText() method of
 *  AccessibleContext.  If the return value is an instance of
 *  AccessibleExtendedText, the object supports this interface.
 */
trait AccessibleExtendedText {

    /** Returns the bounding rectangle of the text between two indices. */
    @stub
    def getTextBounds(startIndex: Int, endIndex: Int): Rectangle = ???

    /** Returns the text between two indices */
    @stub
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    /** Returns the AccessibleTextSequence after a given index. */
    @stub
    def getTextSequenceAfter(part: Int, index: Int): AccessibleTextSequence = ???

    /** Returns the AccessibleTextSequence at a given index. */
    @stub
    def getTextSequenceAt(part: Int, index: Int): AccessibleTextSequence = ???

    /** Returns the AccessibleTextSequence before a given index. */
    @stub
    def getTextSequenceBefore(part: Int, index: Int): AccessibleTextSequence = ???
}

object AccessibleExtendedText {
    /** Constant used to indicate that the part of the text that should be
     *  retrieved is contiguous text with the same text attributes.
     */
    @stub
    val ATTRIBUTE_RUN: Int = ???

    /** Constant used to indicate that the part of the text that should be
     *  retrieved is a line of text.
     */
    @stub
    val LINE: Int = ???
}
