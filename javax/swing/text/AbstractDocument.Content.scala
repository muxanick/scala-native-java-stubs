package javax.swing.text

import java.lang.String
import javax.swing.undo.UndoableEdit
import scala.scalanative.annotation.stub

/** Interface to describe a sequence of character content that
 *  can be edited.  Implementations may or may not support a
 *  history mechanism which will be reflected by whether or not
 *  mutations return an UndoableEdit implementation.
 */
trait AbstractDocument_Content {

    /** Creates a position within the content that will
     *  track change as the content is mutated.
     */
    @stub
    def createPosition(offset: Int): Position = ???

    /** Gets a sequence of characters and copies them into a Segment. */
    @stub
    def getChars(where: Int, len: Int, txt: Segment): Unit = ???

    /** Fetches a string of characters contained in the sequence. */
    @stub
    def getString(where: Int, len: Int): String = ???

    /** Inserts a string of characters into the sequence. */
    @stub
    def insertString(where: Int, str: String): UndoableEdit = ???

    /** Current length of the sequence of character content. */
    @stub
    def length(): Int = ???

    /** Removes some portion of the sequence. */
    @stub
    def remove(where: Int, nitems: Int): UndoableEdit = ???
}
