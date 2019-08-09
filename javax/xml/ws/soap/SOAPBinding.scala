package javax.xml.ws.soap

import java.lang.String
import java.util.Set
import javax.xml.soap.{MessageFactory, SOAPFactory}
import javax.xml.ws.Binding

// The SOAPBinding interface is an abstraction for
//  the SOAP binding.
trait SOAPBinding extends Binding {

    @stub
    // Gets the SAAJ MessageFactory instance used by this SOAP binding.
    def getMessageFactory(): MessageFactory = ???

    @stub
    // Gets the roles played by the SOAP binding instance.
    def getRoles(): Set[String] = ???

    @stub
    // Gets the SAAJ SOAPFactory instance used by this SOAP binding.
    def getSOAPFactory(): SOAPFactory = ???

    @stub
    // Returns true if the use of MTOM is enabled.
    def isMTOMEnabled(): Boolean = ???

    @stub
    // Enables or disables use of MTOM.
    def setMTOMEnabled(flag: Boolean): Unit = ???
}

object SOAPBinding {
    @stub
    // A constant representing the identity of the SOAP 1.1 over HTTP binding.
    def SOAP11HTTP_BINDING: String = ???

    @stub
    // A constant representing the identity of the SOAP 1.1 over HTTP binding
    // with MTOM enabled by default.
    def SOAP11HTTP_MTOM_BINDING: String = ???

    @stub
    // A constant representing the identity of the SOAP 1.2 over HTTP binding.
    def SOAP12HTTP_BINDING: String = ???
}
