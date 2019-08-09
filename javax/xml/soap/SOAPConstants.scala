package javax.xml.soap

import java.lang.String
import javax.xml.namespace.QName

// The definition of constants pertaining to the SOAP protocol.
trait SOAPConstants {
}

object SOAPConstants {
    @stub
    // The default protocol: SOAP 1.1 for backwards compatibility.
    def DEFAULT_SOAP_PROTOCOL: String = ???

    @stub
    // Used to create MessageFactory instances that create
    // SOAPMessages whose concrete type is based on the
    // Content-Type MIME header passed to the
    // createMessage method.
    def DYNAMIC_SOAP_PROTOCOL: String = ???

    @stub
    // The media type  of the Content-Type MIME header in SOAP 1.1.
    def SOAP_1_1_CONTENT_TYPE: String = ???

    @stub
    // Used to create MessageFactory instances that create
    // SOAPMessages whose behavior supports the SOAP 1.1  specification.
    def SOAP_1_1_PROTOCOL: String = ???

    @stub
    // The media type  of the Content-Type MIME header in SOAP 1.2.
    def SOAP_1_2_CONTENT_TYPE: String = ???

    @stub
    // Used to create MessageFactory instances that create
    // SOAPMessages whose behavior supports the SOAP 1.2
    // specification
    def SOAP_1_2_PROTOCOL: String = ???

    @stub
    // SOAP 1.2 DataEncodingUnknown Fault
    def SOAP_DATAENCODINGUNKNOWN_FAULT: QName = ???

    @stub
    // The default namespace prefix for http://www.w3.org/2003/05/soap-envelope
    def SOAP_ENV_PREFIX: String = ???

    @stub
    // SOAP 1.2 MustUnderstand Fault
    def SOAP_MUSTUNDERSTAND_FAULT: QName = ???

    @stub
    // SOAP 1.2 Receiver Fault
    def SOAP_RECEIVER_FAULT: QName = ???

    @stub
    // SOAP 1.2 Sender Fault
    def SOAP_SENDER_FAULT: QName = ???

    @stub
    // SOAP 1.2 VersionMismatch Fault
    def SOAP_VERSIONMISMATCH_FAULT: QName = ???

    @stub
    // The namespace identifier for the SOAP 1.1 envelope.
    def URI_NS_SOAP_1_1_ENVELOPE: String = ???

    @stub
    // The namespace identifier for the SOAP 1.2 encoding.
    def URI_NS_SOAP_1_2_ENCODING: String = ???

    @stub
    // The namespace identifier for the SOAP 1.2 envelope.
    def URI_NS_SOAP_1_2_ENVELOPE: String = ???

    @stub
    // The namespace identifier for the SOAP 1.1 encoding.
    def URI_NS_SOAP_ENCODING: String = ???

    @stub
    // The namespace identifier for the SOAP 1.1 envelope, All SOAPElements in this
    // namespace are defined by the SOAP 1.1 specification.
    def URI_NS_SOAP_ENVELOPE: String = ???

    @stub
    // The URI identifying the next application processing a SOAP request as the intended
    // role for a SOAP 1.2 header entry (see section 2.2 of part 1 of the SOAP 1.2
    // specification).
    def URI_SOAP_1_2_ROLE_NEXT: String = ???

    @stub
    // The URI specifying the role None in SOAP 1.2.
    def URI_SOAP_1_2_ROLE_NONE: String = ???

    @stub
    // The URI identifying the ultimate receiver of the SOAP 1.2 message.
    def URI_SOAP_1_2_ROLE_ULTIMATE_RECEIVER: String = ???
}
