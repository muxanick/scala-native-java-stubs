package javax.xml.stream

import javax.xml.stream.events.XMLEvent
import scala.scalanative.annotation.stub

/** This interface declares a simple filter interface that one can
 *  create to filter XMLEventReaders
 */
trait EventFilter {

    /** Tests whether this event is part of this stream. */
    @stub
    def accept(event: XMLEvent): Boolean = ???
}
