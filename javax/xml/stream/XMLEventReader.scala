package javax.xml.stream

import java.lang.{Object, String}
import java.util.Iterator
import javax.xml.stream.events.XMLEvent

// This is the top level interface for parsing XML Events.  It provides
// the ability to peek at the next event and returns configuration
// information through the property interface.
trait XMLEventReader extends Iterator {

    @stub
    // Frees any resources associated with this Reader.
    def close(): Unit = ???

    @stub
    // Reads the content of a text-only element.
    def getElementText(): String = ???

    @stub
    // Get the value of a feature/property from the underlying implementation
    def getProperty(name: String): Object = ???

    @stub
    // Check if there are more events.
    def hasNext(): Boolean = ???

    @stub
    // Get the next XMLEvent
    def nextEvent(): XMLEvent = ???

    @stub
    // Skips any insignificant space events until a START_ELEMENT or
    // END_ELEMENT is reached.
    def nextTag(): XMLEvent = ???
}
