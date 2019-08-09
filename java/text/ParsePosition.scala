package java.text

import java.lang.Object

// ParsePosition is a simple class used by Format
// and its subclasses to keep track of the current position during parsing.
// The parseObject method in the various Format
// classes requires a ParsePosition object as an argument.
//
// 
// By design, as you parse through a string with different formats,
// you can use the same ParsePosition, since the index parameter
// records the current position.
class ParsePosition extends Object {

    @stub
    // Overrides equals
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieve the index at which an error occurred, or -1 if the
    // error index has not been set.
    def getErrorIndex(): Int = ???

    @stub
    // Retrieve the current parse position.
    def getIndex(): Int = ???

    @stub
    // Returns a hash code for this ParsePosition.
    def hashCode(): Int = ???

    @stub
    // Set the index at which a parse error occurred.
    def setErrorIndex(ei: Int): Unit = ???

    @stub
    // Set the current parse position.
    def setIndex(index: Int): Unit = ???
}
