package javax.xml.soap

import java.lang.String
import java.util.{Iterator, Locale}
import javax.xml.namespace.QName

// An element in the SOAPBody object that contains
// error and/or status information. This information may relate to
// errors in the SOAPMessage object or to problems
// that are not related to the content in the message itself. Problems
// not related to the message itself are generally errors in
// processing, such as the inability to communicate with an upstream
// server.
// 
// Depending on the protocol specified while creating the
// MessageFactory instance,  a SOAPFault has
// sub-elements as defined in the SOAP 1.1/SOAP 1.2 specification.
trait SOAPFault extends SOAPBodyElement {

    @stub
    // Creates an optional Detail object and sets it as the
    // Detail object for this SOAPFault
    // object.
    def addDetail(): Detail = ???

    @stub
    // Appends or replaces a Reason Text item containing the specified
    // text message and an xml:lang derived from
    // locale.
    def addFaultReasonText(text: String, locale: Locale): Unit = ???

    @stub
    // Adds a Subcode to the end of the sequence of Subcodes contained by this
    // SOAPFault.
    def appendFaultSubcode(subcode: QName): Unit = ???

    @stub
    // Returns the optional detail element for this SOAPFault
    // object.
    def getDetail(): Detail = ???

    @stub
    // Gets the fault actor for this SOAPFault object.
    def getFaultActor(): String = ???

    @stub
    // Gets the fault code for this SOAPFault object.
    def getFaultCode(): String = ???

    @stub
    // Gets the mandatory SOAP 1.1 fault code for this
    // SOAPFault object as a SAAJ Name object.
    def getFaultCodeAsName(): Name = ???

    @stub
    // Gets the fault code for this
    // SOAPFault object as a QName object.
    def getFaultCodeAsQName(): QName = ???

    @stub
    // Returns the optional Node element value for this
    // SOAPFault object.
    def getFaultNode(): String = ???

    @stub
    // Returns an Iterator over a distinct sequence of
    // Locales for which there are associated Reason Text items.
    def getFaultReasonLocales(): Iterator = ???

    @stub
    // Returns the Reason Text associated with the given Locale.
    def getFaultReasonText(locale: Locale): String = ???

    @stub
    // Returns an Iterator over a sequence of
    // String objects containing all of the Reason Text items for
    // this SOAPFault.
    def getFaultReasonTexts(): Iterator = ???

    @stub
    // Returns the optional Role element value for this
    // SOAPFault object.
    def getFaultRole(): String = ???

    @stub
    // Gets the fault string for this SOAPFault object.
    def getFaultString(): String = ???

    @stub
    // Gets the locale of the fault string for this SOAPFault
    // object.
    def getFaultStringLocale(): Locale = ???

    @stub
    // Gets the Subcodes for this SOAPFault as an iterator over
    // QNames.
    def getFaultSubcodes(): Iterator = ???

    @stub
    // Returns true if this SOAPFault has a Detail
    // subelement and false otherwise.
    def hasDetail(): Boolean = ???

    @stub
    // Removes any Subcodes that may be contained by this
    // SOAPFault.
    def removeAllFaultSubcodes(): Unit = ???

    @stub
    // Sets this SOAPFault object with the given fault actor.
    def setFaultActor(faultActor: String): Unit = ???

    @stub
    // Sets this SOAPFault object with the given fault code.
    def setFaultCode(faultCodeQName: Name): Unit = ???

    @stub
    // Sets this SOAPFault object with the given fault code.
    def setFaultCode(faultCodeQName: QName): Unit = ???

    @stub
    // Sets this SOAPFault object with the give fault code.
    def setFaultCode(faultCode: String): Unit = ???

    @stub
    // Creates or replaces any existing Node element value for
    // this SOAPFault object.
    def setFaultNode(uri: String): Unit = ???

    @stub
    // Creates or replaces any existing Role element value for
    // this SOAPFault object.
    def setFaultRole(uri: String): Unit = ???

    @stub
    // Sets the fault string for this SOAPFault object
    // to the given string.
    def setFaultString(faultString: String): Unit = ???
}
