package javax.accessibility

import java.awt.Rectangle
import java.lang.String

// The AccessibleExtendedText interface contains additional methods
// not provided by the AccessibleText interface
//
// Applications can determine if an object supports the AccessibleExtendedText
// interface by first obtaining its AccessibleContext (see Accessible)
// and then calling the AccessibleContext.getAccessibleText() method of
// AccessibleContext.  If the return value is an instance of
// AccessibleExtendedText, the object supports this interface.
trait AccessibleExtendedText {

    @stub
    // Returns the bounding rectangle of the text between two indices.
    def getTextBounds(startIndex: Int, endIndex: Int): Rectangle = ???

    @stub
    // Returns the text between two indices
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    @stub
    // Returns the AccessibleTextSequence after a given index.
    def getTextSequenceAfter(part: Int, index: Int): AccessibleTextSequence = ???

    @stub
    // Returns the AccessibleTextSequence at a given index.
    def getTextSequenceAt(part: Int, index: Int): AccessibleTextSequence = ???
}

object AccessibleExtendedText {
    @stub
    // Constant used to indicate that the part of the text that should be
    // retrieved is contiguous text with the same text attributes.
    def ATTRIBUTE_RUN: Int = ???
}
