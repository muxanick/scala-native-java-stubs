package javax.xml.stream.events

import javax.xml.namespace.QName

/** An interface for the end element event.  An EndElement is reported
 *  for each End Tag in the document.
 */
trait EndElement extends XMLEvent {

    /** Get the name of this event */
    @stub
    def getName(): QName = ???
}
