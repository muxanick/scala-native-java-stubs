package javax.swing.text

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.undo.UndoableEdit

// An implementation of the AbstractDocument.Content interface
// implemented using a gapped buffer similar to that used by emacs.
// The underlying storage is a array of unicode characters with
// a gap somewhere.  The gap is moved to the location of changes
// to take advantage of common behavior where most changes are
// in the same location.  Changes that occur at a gap boundary are
// generally cheap and moving the gap is generally cheaper than
// moving the array contents directly to accommodate the change.
// 
// The positions tracking change are also generally cheap to
// maintain.  The Position implementations (marks) store the array
// index and can easily calculate the sequential position from
// the current gap location.  Changes only require update to the
// the marks between the old and new gap boundaries when the gap
// is moved, so generally updating the marks is pretty cheap.
// The marks are stored sorted so they can be located quickly
// with a binary search.  This increases the cost of adding a
// mark, and decreases the cost of keeping the mark updated.
class GapContent extends Object with AbstractDocument.Content, with Serializable {

    @stub
    // Creates a new GapContent object.
    def this() = ???

    @stub
    // Allocate an array to store items of the type
    // appropriate (which is determined by the subclass).
    protected def allocateArray(len: Int): Object = ???

    @stub
    // Creates a position within the content that will
    // track change as the content is mutated.
    def createPosition(offset: Int): Position = ???

    @stub
    // Access to the array.
    protected def getArray(): Object = ???

    @stub
    // Get the length of the allocated array.
    protected def getArrayLength(): Int = ???

    @stub
    // Retrieves a portion of the content.
    def getChars(where: Int, len: Int, chars: Segment): Unit = ???

    @stub
    // Access to the end of the gap.
    protected def getGapEnd(): Int = ???

    @stub
    // Access to the start of the gap.
    protected def getGapStart(): Int = ???

    @stub
    // Returns a Vector containing instances of UndoPosRef for the
    // Positions in the range
    // offset to offset + length.
    protected def getPositionsInRange(v: Vector, offset: Int, length: Int): Vector = ???

    @stub
    // Retrieves a portion of the content.
    def getString(where: Int, len: Int): String = ???

    @stub
    // Inserts a string into the content.
    def insertString(where: Int, str: String): UndoableEdit = ???

    @stub
    // Returns the length of the content.
    def length(): Int = ???

    @stub
    // Removes part of the content.
    def remove(where: Int, nitems: Int): UndoableEdit = ???

    @stub
    // Replace the given logical position in the storage with
    // the given new items.
    protected def replace(position: Int, rmSize: Int, addItems: Object, addSize: Int): Unit = ???

    @stub
    // Resets all the marks that have an offset of 0 to have an index of
    // zero as well.
    protected def resetMarksAtZero(): Unit = ???

    @stub
    // Make the gap bigger, moving any necessary data and updating
    // the appropriate marks
    protected def shiftEnd(newSize: Int): Unit = ???

    @stub
    // Move the start of the gap to a new location,
    // without changing the size of the gap.
    protected def shiftGap(newGapStart: Int): Unit = ???

    @stub
    // Adjust the gap end upward.
    protected def shiftGapEndUp(newGapEnd: Int): Unit = ???

    @stub
    // Adjust the gap end downward.
    protected def shiftGapStartDown(newGapStart: Int): Unit = ???
}
