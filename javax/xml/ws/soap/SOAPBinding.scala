package javax.xml.ws.soap

import java.lang.String
import java.util.Set
import javax.xml.soap.{MessageFactory, SOAPFactory}
import javax.xml.ws.Binding

/** The SOAPBinding interface is an abstraction for
 *   the SOAP binding.
 */
trait SOAPBinding extends Binding {

    /** Gets the SAAJ MessageFactory instance used by this SOAP binding. */
    @stub
    def getMessageFactory(): MessageFactory = ???

    /** Gets the roles played by the SOAP binding instance. */
    @stub
    def getRoles(): Set[String] = ???

    /** Gets the SAAJ SOAPFactory instance used by this SOAP binding. */
    @stub
    def getSOAPFactory(): SOAPFactory = ???

    /** Returns true if the use of MTOM is enabled. */
    @stub
    def isMTOMEnabled(): Boolean = ???

    /** Enables or disables use of MTOM. */
    @stub
    def setMTOMEnabled(flag: Boolean): Unit = ???
}

object SOAPBinding {
    /** A constant representing the identity of the SOAP 1.1 over HTTP binding. */
    @stub
    val SOAP11HTTP_BINDING: String = ???

    /** A constant representing the identity of the SOAP 1.1 over HTTP binding
     *  with MTOM enabled by default.
     */
    @stub
    val SOAP11HTTP_MTOM_BINDING: String = ???

    /** A constant representing the identity of the SOAP 1.2 over HTTP binding. */
    @stub
    val SOAP12HTTP_BINDING: String = ???
}
