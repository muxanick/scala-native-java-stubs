package javax.xml.stream.events

import java.util.Iterator
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** An interface for the end element event.  An EndElement is reported
 *  for each End Tag in the document.
 */
trait EndElement extends XMLEvent {

    /** Get the name of this event */
    @stub
    def getName(): QName = ???

    /** Returns an Iterator of namespaces that have gone out
     *  of scope.
     */
    @stub
    def getNamespaces(): Iterator = ???
}
