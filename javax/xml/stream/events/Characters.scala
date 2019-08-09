package javax.xml.stream.events

import java.lang.String

// This describes the interface to Characters events.
// All text events get reported as Characters events.
// Content, CData and whitespace are all reported as
// Characters events.  IgnorableWhitespace, in most cases,
// will be set to false unless an element declaration of element
// content is present for the current element.
trait Characters extends XMLEvent {

    @stub
    // Get the character data of this event
    def getData(): String = ???

    @stub
    // Returns true if this is a CData section.
    def isCData(): Boolean = ???

    @stub
    // Return true if this is ignorableWhiteSpace.
    def isIgnorableWhiteSpace(): Boolean = ???
}
