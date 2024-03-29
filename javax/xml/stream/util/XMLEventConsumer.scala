package javax.xml.stream.util

import javax.xml.stream.events.XMLEvent
import scala.scalanative.annotation.stub

/** This interface defines an event consumer interface.  The contract of the
 *  of a consumer is to accept the event.  This interface can be used to
 *  mark an object as able to receive events.  Add may be called several
 *  times in immediate succession so a consumer must be able to cache
 *  events it hasn't processed yet.
 */
trait XMLEventConsumer {

    /** This method adds an event to the consumer. */
    @stub
    def add(event: XMLEvent): Unit = ???
}
