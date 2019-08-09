package javax.xml.ws.handler.soap

import java.util.Set
import javax.xml.namespace.QName
import javax.xml.ws.handler.Handler
import scala.scalanative.annotation.stub

/** The SOAPHandler class extends Handler
 *   to provide typesafety for the message context parameter and add a method
 *   to obtain access to the headers that may be processed by the handler.
 */
trait SOAPHandler[T <: SOAPMessageContext] extends Handler[T] {

    /** Gets the header blocks that can be processed by this Handler
     *   instance.
     */
    @stub
    def getHeaders(): Set[QName] = ???
}
