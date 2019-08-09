package javax.xml.soap

import java.lang.String

/** An object representing the contents in the SOAP header part of the
 *  SOAP envelope.
 *  The immediate children of a SOAPHeader object can
 *  be represented only as SOAPHeaderElement objects.
 *  
 *  A SOAPHeaderElement object can have other
 *  SOAPElement objects as its children.
 */
trait SOAPHeaderElement extends SOAPElement {

    /** Returns the uri of the actor attribute of this
     *  SOAPHeaderElement.
     */
    @stub
    def getActor(): String = ???

    /** Returns the boolean value of the mustUnderstand attribute for this
     *  SOAPHeaderElement.
     */
    @stub
    def getMustUnderstand(): Boolean = ???

    /** Returns the boolean value of the relay attribute for this
     *  SOAPHeaderElement
     */
    @stub
    def getRelay(): Boolean = ???

    /** Returns the value of the Role attribute of this
     *  SOAPHeaderElement.
     */
    @stub
    def getRole(): String = ???

    /** Sets the actor associated with this SOAPHeaderElement
     *  object to the specified actor.
     */
    @stub
    def setActor(actorURI: String): Unit = ???

    /** Sets the mustUnderstand attribute for this SOAPHeaderElement
     *  object to be either true or false.
     */
    @stub
    def setMustUnderstand(mustUnderstand: Boolean): Unit = ???

    /** Sets the relay attribute for this SOAPHeaderElement to be
     *  either true or false.
     */
    @stub
    def setRelay(relay: Boolean): Unit = ???
}
