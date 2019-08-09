package javax.xml.soap

import java.lang.String
import java.util.{Iterator, Locale}
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** An element in the SOAPBody object that contains
 *  error and/or status information. This information may relate to
 *  errors in the SOAPMessage object or to problems
 *  that are not related to the content in the message itself. Problems
 *  not related to the message itself are generally errors in
 *  processing, such as the inability to communicate with an upstream
 *  server.
 *  
 *  Depending on the protocol specified while creating the
 *  MessageFactory instance,  a SOAPFault has
 *  sub-elements as defined in the SOAP 1.1/SOAP 1.2 specification.
 */
trait SOAPFault extends SOAPBodyElement {

    /** Creates an optional Detail object and sets it as the
     *  Detail object for this SOAPFault
     *  object.
     */
    @stub
    def addDetail(): Detail = ???

    /** Appends or replaces a Reason Text item containing the specified
     *  text message and an xml:lang derived from
     *  locale.
     */
    @stub
    def addFaultReasonText(text: String, locale: Locale): Unit = ???

    /** Adds a Subcode to the end of the sequence of Subcodes contained by this
     *  SOAPFault.
     */
    @stub
    def appendFaultSubcode(subcode: QName): Unit = ???

    /** Returns the optional detail element for this SOAPFault
     *  object.
     */
    @stub
    def getDetail(): Detail = ???

    /** Gets the fault actor for this SOAPFault object. */
    @stub
    def getFaultActor(): String = ???

    /** Gets the fault code for this SOAPFault object. */
    @stub
    def getFaultCode(): String = ???

    /** Gets the mandatory SOAP 1.1 fault code for this
     *  SOAPFault object as a SAAJ Name object.
     */
    @stub
    def getFaultCodeAsName(): Name = ???

    /** Gets the fault code for this
     *  SOAPFault object as a QName object.
     */
    @stub
    def getFaultCodeAsQName(): QName = ???

    /** Returns the optional Node element value for this
     *  SOAPFault object.
     */
    @stub
    def getFaultNode(): String = ???

    /** Returns an Iterator over a distinct sequence of
     *  Locales for which there are associated Reason Text items.
     */
    @stub
    def getFaultReasonLocales(): Iterator = ???

    /** Returns the Reason Text associated with the given Locale. */
    @stub
    def getFaultReasonText(locale: Locale): String = ???

    /** Returns an Iterator over a sequence of
     *  String objects containing all of the Reason Text items for
     *  this SOAPFault.
     */
    @stub
    def getFaultReasonTexts(): Iterator = ???

    /** Returns the optional Role element value for this
     *  SOAPFault object.
     */
    @stub
    def getFaultRole(): String = ???

    /** Gets the fault string for this SOAPFault object. */
    @stub
    def getFaultString(): String = ???

    /** Gets the locale of the fault string for this SOAPFault
     *  object.
     */
    @stub
    def getFaultStringLocale(): Locale = ???

    /** Gets the Subcodes for this SOAPFault as an iterator over
     *  QNames.
     */
    @stub
    def getFaultSubcodes(): Iterator = ???

    /** Returns true if this SOAPFault has a Detail
     *  subelement and false otherwise.
     */
    @stub
    def hasDetail(): Boolean = ???

    /** Removes any Subcodes that may be contained by this
     *  SOAPFault.
     */
    @stub
    def removeAllFaultSubcodes(): Unit = ???

    /** Sets this SOAPFault object with the given fault actor. */
    @stub
    def setFaultActor(faultActor: String): Unit = ???

    /** Sets this SOAPFault object with the given fault code. */
    @stub
    def setFaultCode(faultCodeQName: Name): Unit = ???

    /** Sets this SOAPFault object with the given fault code. */
    @stub
    def setFaultCode(faultCodeQName: QName): Unit = ???

    /** Sets this SOAPFault object with the give fault code. */
    @stub
    def setFaultCode(faultCode: String): Unit = ???

    /** Creates or replaces any existing Node element value for
     *  this SOAPFault object.
     */
    @stub
    def setFaultNode(uri: String): Unit = ???

    /** Creates or replaces any existing Role element value for
     *  this SOAPFault object.
     */
    @stub
    def setFaultRole(uri: String): Unit = ???

    /** Sets the fault string for this SOAPFault object
     *  to the given string.
     */
    @stub
    def setFaultString(faultString: String): Unit = ???

    /** Sets the fault string for this SOAPFault object
     *  to the given string and localized to the given locale.
     */
    @stub
    def setFaultString(faultString: String, locale: Locale): Unit = ???
}
