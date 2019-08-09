package javax.xml.stream.util

import java.lang.{Object, String}
import javax.xml.stream.XMLEventReader
import javax.xml.stream.events.XMLEvent

/** This is the base class for deriving an XMLEventReader
 *  filter.
 * 
 *  This class is designed to sit between an XMLEventReader and an
 *  application's XMLEventReader.  By default each method
 *  does nothing but call the corresponding method on the
 *  parent interface.
 */
class EventReaderDelegate extends Object with XMLEventReader {

    /** Construct an empty filter with no parent. */
    @stub
    def this() = ???

    /** Frees any resources associated with this Reader. */
    @stub
    def close(): Unit = ???

    /** Reads the content of a text-only element. */
    @stub
    def getElementText(): String = ???

    /** Get the parent of this instance. */
    @stub
    def getParent(): XMLEventReader = ???

    /** Get the value of a feature/property from the underlying implementation */
    @stub
    def getProperty(name: String): Object = ???

    /** Check if there are more events. */
    @stub
    def hasNext(): Boolean = ???

    /** Returns the next element in the iteration. */
    @stub
    def next(): Object = ???

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

    /** Removes from the underlying collection the last element returned
     *  by this iterator (optional operation).
     */
    @stub
    def remove(): Unit = ???
}
