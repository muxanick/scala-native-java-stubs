package javax.swing.text

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.undo.UndoableEdit

/** An implementation of the AbstractDocument.Content interface that is
 *  a brute force implementation that is useful for relatively small
 *  documents and/or debugging.  It manages the character content
 *  as a simple character array.  It is also quite inefficient.
 *  
 *  It is generally recommended that the gap buffer or piece table
 *  implementations be used instead.  This buffer does not scale up
 *  to large sizes.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
final class StringContent extends Object with AbstractDocument.Content with Serializable {

    /** Creates a new StringContent object. */
    @stub
    def this() = ???

    /** Creates a position within the content that will
     *  track change as the content is mutated.
     */
    @stub
    def createPosition(offset: Int): Position = ???

    /** Retrieves a portion of the content. */
    @stub
    def getChars(where: Int, len: Int, chars: Segment): Unit = ???

    /** Returns a Vector containing instances of UndoPosRef for the
     *  Positions in the range
     *  offset to offset + length.
     */
    @stub
    protected def getPositionsInRange(v: Vector, offset: Int, length: Int): Vector = ???

    /** Retrieves a portion of the content. */
    @stub
    def getString(where: Int, len: Int): String = ???

    /** Inserts a string into the content. */
    @stub
    def insertString(where: Int, str: String): UndoableEdit = ???

    /** Returns the length of the content. */
    @stub
    def length(): Int = ???

    /** Removes part of the content. */
    @stub
    def remove(where: Int, nitems: Int): UndoableEdit = ???
}
