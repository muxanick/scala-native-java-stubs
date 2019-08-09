package javax.swing.text

import java.lang.String
import javax.swing.undo.UndoableEdit

// Interface to describe a sequence of character content that
// can be edited.  Implementations may or may not support a
// history mechanism which will be reflected by whether or not
// mutations return an UndoableEdit implementation.
object trait AbstractDocument.Content {

    @stub
    // Creates a position within the content that will
    // track change as the content is mutated.
    def createPosition(offset: Int): Position = ???

    @stub
    // Gets a sequence of characters and copies them into a Segment.
    def getChars(where: Int, len: Int, txt: Segment): Unit = ???

    @stub
    // Fetches a string of characters contained in the sequence.
    def getString(where: Int, len: Int): String = ???

    @stub
    // Inserts a string of characters into the sequence.
    def insertString(where: Int, str: String): UndoableEdit = ???

    @stub
    // Current length of the sequence of character content.
    def length(): Int = ???
}
