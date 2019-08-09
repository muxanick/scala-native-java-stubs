package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** FieldPosition is a simple class used by Format
 *  and its subclasses to identify fields in formatted output. Fields can
 *  be identified in two ways:
 *  
 *   By an integer constant, whose names typically end with
 *       _FIELD. The constants are defined in the various
 *       subclasses of Format.
 *   By a Format.Field constant, see ERA_FIELD
 *       and its friends in DateFormat for an example.
 *  
 *  
 *  FieldPosition keeps track of the position of the
 *  field within the formatted output with two indices: the index
 *  of the first character of the field and the index of the last
 *  character of the field.
 * 
 *  
 *  One version of the format method in the various
 *  Format classes requires a FieldPosition
 *  object as an argument. You use this format method
 *  to perform partial formatting or to get information about the
 *  formatted output (such as the position of a field).
 * 
 *  
 *  If you are interested in the positions of all attributes in the
 *  formatted string use the Format method
 *  formatToCharacterIterator.
 */
class FieldPosition extends Object {

    /** Creates a FieldPosition object for the given field constant. */
    @stub
    def this(attribute: Format.Field) = ???

    /** Creates a FieldPosition object for the given field. */
    @stub
    def this(attribute: Format.Field, fieldID: Int) = ???

    /** Creates a FieldPosition object for the given field. */
    @stub
    def this(field: Int) = ???

    /** Overrides equals */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Retrieves the index of the first character in the requested field. */
    @stub
    def getBeginIndex(): Int = ???

    /** Retrieves the index of the character following the last character in the
     *  requested field.
     */
    @stub
    def getEndIndex(): Int = ???

    /** Retrieves the field identifier. */
    @stub
    def getField(): Int = ???

    /** Returns the field identifier as an attribute constant
     *  from one of the Field subclasses.
     */
    @stub
    def getFieldAttribute(): Format.Field = ???

    /** Returns a hash code for this FieldPosition. */
    @stub
    def hashCode(): Int = ???

    /** Sets the begin index. */
    @stub
    def setBeginIndex(bi: Int): Unit = ???

    /** Sets the end index. */
    @stub
    def setEndIndex(ei: Int): Unit = ???

    /** Return a string representation of this FieldPosition. */
    @stub
    def toString(): String = ???
}
