package javax.xml.stream

import java.lang.String

// Provides information on the location of an event.
//
// All the information provided by a Location is optional.  For example
// an application may only report line numbers.
trait Location {

    @stub
    // Return the byte or character offset into the input source this location
    // is pointing to.
    def getCharacterOffset(): Int = ???

    @stub
    // Return the column number where the current event ends,
    // returns -1 if none is available.
    def getColumnNumber(): Int = ???

    @stub
    // Return the line number where the current event ends,
    // returns -1 if none is available.
    def getLineNumber(): Int = ???

    @stub
    // Returns the public ID of the XML
    def getPublicId(): String = ???
}
