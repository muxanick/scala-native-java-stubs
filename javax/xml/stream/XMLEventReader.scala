package javax.xml.stream

import java.lang.{Object, String}
import java.util.Iterator
import javax.xml.stream.events.XMLEvent
import scala.scalanative.annotation.stub

/** This is the top level interface for parsing XML Events.  It provides
 *  the ability to peek at the next event and returns configuration
 *  information through the property interface.
 */
trait XMLEventReader extends Iterator {

    /** Frees any resources associated with this Reader. */
    @stub
    def close(): Unit = ???

    /** Reads the content of a text-only element. */
    @stub
    def getElementText(): String = ???

    /** Get the value of a feature/property from the underlying implementation */
    @stub
    def getProperty(name: String): Any = ???

    /** Check if there are more events. */
    @stub
    def hasNext(): Boolean = ???

    /** Get the next XMLEvent */
    @stub
    def nextEvent(): XMLEvent = ???

    /** Skips any insignificant space events until a START_ELEMENT or
     *  END_ELEMENT is reached.
     */
    @stub
    def nextTag(): XMLEvent = ???

    /** Check the next XMLEvent without reading it from the stream. */
    @stub
    def peek(): XMLEvent = ???
}
