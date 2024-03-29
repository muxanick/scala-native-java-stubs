package javax.xml.stream.util

import javax.xml.stream.XMLStreamReader
import javax.xml.stream.events.XMLEvent
import scala.scalanative.annotation.stub

/** This interface defines a class that allows a user to register
 *  a way to allocate events given an XMLStreamReader.  An implementation
 *  is not required to use the XMLEventFactory implementation but this
 *  is recommended.  The XMLEventAllocator can be set on an XMLInputFactory
 *  using the property "javax.xml.stream.allocator"
 */
trait XMLEventAllocator {

    /** This method allocates an event given the current
     *  state of the XMLStreamReader.
     */
    @stub
    def allocate(reader: XMLStreamReader): XMLEvent = ???

    /** This method allocates an event or set of events
     *  given the current
     *  state of the XMLStreamReader and adds the event
     *  or set of events to the
     *  consumer that was passed in.
     */
    @stub
    def allocate(reader: XMLStreamReader, consumer: XMLEventConsumer): Unit = ???

    /** This method creates an instance of the XMLEventAllocator. */
    @stub
    def newInstance(): XMLEventAllocator = ???
}
