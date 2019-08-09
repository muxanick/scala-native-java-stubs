package javax.swing.text

import java.lang.Object

// Specification for building elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object DefaultStyledDocument.ElementSpec extends Object {

    @stub
    // Constructor useful for markup when the markup will not
    // be stored in the document.
    def ElementSpec(a: AttributeSet, type: Short) = ???

    @stub
    // Constructor for creating a spec externally for batch
    // input of content and markup into the document.
    def ElementSpec(a: AttributeSet, type: Short, txt: Array[Char], offs: Int, len: Int) = ???

    @stub
    // A possible value for getType.
    def ContentType: Short = ???

    @stub
    // A possible value for getType.
    def EndTagType: Short = ???

    @stub
    // A possible value for getDirection.
    def JoinFractureDirection: Short = ???

    @stub
    // A possible value for getDirection.
    def JoinNextDirection: Short = ???

    @stub
    // A possible value for getDirection.
    def JoinPreviousDirection: Short = ???

    @stub
    // A possible value for getDirection.
    def OriginateDirection: Short = ???

    @stub
    // Gets the array of characters.
    def getArray(): Array[Char] = ???

    @stub
    // Gets the element attributes.
    def getAttributes(): AttributeSet = ???

    @stub
    // Gets the direction.
    def getDirection(): Short = ???

    @stub
    // Gets the length.
    def getLength(): Int = ???

    @stub
    // Gets the starting offset.
    def getOffset(): Int = ???

    @stub
    // Gets the element type.
    def getType(): Short = ???

    @stub
    // Sets the direction.
    def setDirection(direction: Short): Unit = ???

    @stub
    // Sets the element type.
    def setType(type: Short): Unit = ???
}
