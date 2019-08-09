package javax.xml.soap

import java.lang.String

// An object representing the contents in the SOAP header part of the
// SOAP envelope.
// The immediate children of a SOAPHeader object can
// be represented only as SOAPHeaderElement objects.
// 
// A SOAPHeaderElement object can have other
// SOAPElement objects as its children.
trait SOAPHeaderElement extends SOAPElement {

    @stub
    // Returns the uri of the actor attribute of this
    // SOAPHeaderElement.
    def getActor(): String = ???

    @stub
    // Returns the boolean value of the mustUnderstand attribute for this
    // SOAPHeaderElement.
    def getMustUnderstand(): Boolean = ???

    @stub
    // Returns the boolean value of the relay attribute for this
    // SOAPHeaderElement
    def getRelay(): Boolean = ???

    @stub
    // Returns the value of the Role attribute of this
    // SOAPHeaderElement.
    def getRole(): String = ???

    @stub
    // Sets the actor associated with this SOAPHeaderElement
    // object to the specified actor.
    def setActor(actorURI: String): Unit = ???

    @stub
    // Sets the mustUnderstand attribute for this SOAPHeaderElement
    // object to be either true or false.
    def setMustUnderstand(mustUnderstand: Boolean): Unit = ???

    @stub
    // Sets the relay attribute for this SOAPHeaderElement to be
    // either true or false.
    def setRelay(relay: Boolean): Unit = ???
}
