package java.text

import java.lang.Object

// FieldPosition is a simple class used by Format
// and its subclasses to identify fields in formatted output. Fields can
// be identified in two ways:
// 
//  By an integer constant, whose names typically end with
//      _FIELD. The constants are defined in the various
//      subclasses of Format.
//  By a Format.Field constant, see ERA_FIELD
//      and its friends in DateFormat for an example.
// 
// 
// FieldPosition keeps track of the position of the
// field within the formatted output with two indices: the index
// of the first character of the field and the index of the last
// character of the field.
//
// 
// One version of the format method in the various
// Format classes requires a FieldPosition
// object as an argument. You use this format method
// to perform partial formatting or to get information about the
// formatted output (such as the position of a field).
//
// 
// If you are interested in the positions of all attributes in the
// formatted string use the Format method
// formatToCharacterIterator.
class FieldPosition extends Object {

    @stub
    // Creates a FieldPosition object for the given field constant.
    def this(attribute: Format.Field) = ???

    @stub
    // Creates a FieldPosition object for the given field.
    def this(attribute: Format.Field, fieldID: Int) = ???

    @stub
    // Overrides equals
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves the index of the first character in the requested field.
    def getBeginIndex(): Int = ???

    @stub
    // Retrieves the index of the character following the last character in the
    // requested field.
    def getEndIndex(): Int = ???

    @stub
    // Retrieves the field identifier.
    def getField(): Int = ???

    @stub
    // Returns the field identifier as an attribute constant
    // from one of the Field subclasses.
    def getFieldAttribute(): Format.Field = ???

    @stub
    // Returns a hash code for this FieldPosition.
    def hashCode(): Int = ???

    @stub
    // Sets the begin index.
    def setBeginIndex(bi: Int): Unit = ???

    @stub
    // Sets the end index.
    def setEndIndex(ei: Int): Unit = ???
}
