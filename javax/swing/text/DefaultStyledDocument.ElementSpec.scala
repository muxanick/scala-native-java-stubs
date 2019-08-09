package javax.swing.text

import java.lang.Object

/** Specification for building elements.
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
object DefaultStyledDocument.ElementSpec extends Object {

    /** Constructor useful for markup when the markup will not
     *  be stored in the document.
     */
    @stub
    def ElementSpec(a: AttributeSet, type: Short) = ???

    /** Constructor for creating a spec externally for batch
     *  input of content and markup into the document.
     */
    @stub
    def ElementSpec(a: AttributeSet, type: Short, txt: Array[Char], offs: Int, len: Int) = ???

    /** A possible value for getType. */
    @stub
    val ContentType: Short = ???

    /** A possible value for getType. */
    @stub
    val EndTagType: Short = ???

    /** A possible value for getDirection. */
    @stub
    val JoinFractureDirection: Short = ???

    /** A possible value for getDirection. */
    @stub
    val JoinNextDirection: Short = ???

    /** A possible value for getDirection. */
    @stub
    val JoinPreviousDirection: Short = ???

    /** A possible value for getDirection. */
    @stub
    val OriginateDirection: Short = ???

    /** Gets the array of characters. */
    @stub
    def getArray(): Array[Char] = ???

    /** Gets the element attributes. */
    @stub
    def getAttributes(): AttributeSet = ???

    /** Gets the direction. */
    @stub
    def getDirection(): Short = ???

    /** Gets the length. */
    @stub
    def getLength(): Int = ???

    /** Gets the starting offset. */
    @stub
    def getOffset(): Int = ???

    /** Gets the element type. */
    @stub
    def getType(): Short = ???

    /** Sets the direction. */
    @stub
    def setDirection(direction: Short): Unit = ???

    /** Sets the element type. */
    @stub
    def setType(type: Short): Unit = ???
}
