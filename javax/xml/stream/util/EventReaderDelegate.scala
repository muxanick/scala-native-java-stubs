package javax.xml.stream.util

import java.lang.{Object, String}
import javax.xml.stream.XMLEventReader
import javax.xml.stream.events.XMLEvent

// This is the base class for deriving an XMLEventReader
// filter.
//
// This class is designed to sit between an XMLEventReader and an
// application's XMLEventReader.  By default each method
// does nothing but call the corresponding method on the
// parent interface.
class EventReaderDelegate extends Object with XMLEventReader {

    @stub
    // Construct an empty filter with no parent.
    def this() = ???

    @stub
    // Frees any resources associated with this Reader.
    def close(): Unit = ???

    @stub
    // Reads the content of a text-only element.
    def getElementText(): String = ???

    @stub
    // Get the parent of this instance.
    def getParent(): XMLEventReader = ???

    @stub
    // Get the value of a feature/property from the underlying implementation
    def getProperty(name: String): Object = ???

    @stub
    // Check if there are more events.
    def hasNext(): Boolean = ???

    @stub
    // Returns the next element in the iteration.
    def next(): Object = ???

    @stub
    // Get the next XMLEvent
    def nextEvent(): XMLEvent = ???

    @stub
    // Skips any insignificant space events until a START_ELEMENT or
    // END_ELEMENT is reached.
    def nextTag(): XMLEvent = ???

    @stub
    // Check the next XMLEvent without reading it from the stream.
    def peek(): XMLEvent = ???

    @stub
    // Removes from the underlying collection the last element returned
    // by this iterator (optional operation).
    def remove(): Unit = ???
}
