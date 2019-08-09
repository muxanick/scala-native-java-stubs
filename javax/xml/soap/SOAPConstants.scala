package javax.xml.soap

import java.lang.String
import javax.xml.namespace.QName

/** The definition of constants pertaining to the SOAP protocol. */
trait SOAPConstants {
}

object SOAPConstants {
    /** The default protocol: SOAP 1.1 for backwards compatibility. */
    @stub
    val DEFAULT_SOAP_PROTOCOL: String = ???

    /** Used to create MessageFactory instances that create
     *  SOAPMessages whose concrete type is based on the
     *  Content-Type MIME header passed to the
     *  createMessage method.
     */
    @stub
    val DYNAMIC_SOAP_PROTOCOL: String = ???

    /** The media type  of the Content-Type MIME header in SOAP 1.1. */
    @stub
    val SOAP_1_1_CONTENT_TYPE: String = ???

    /** Used to create MessageFactory instances that create
     *  SOAPMessages whose behavior supports the SOAP 1.1  specification.
     */
    @stub
    val SOAP_1_1_PROTOCOL: String = ???

    /** The media type  of the Content-Type MIME header in SOAP 1.2. */
    @stub
    val SOAP_1_2_CONTENT_TYPE: String = ???

    /** Used to create MessageFactory instances that create
     *  SOAPMessages whose behavior supports the SOAP 1.2
     *  specification
     */
    @stub
    val SOAP_1_2_PROTOCOL: String = ???

    /** SOAP 1.2 DataEncodingUnknown Fault */
    @stub
    val SOAP_DATAENCODINGUNKNOWN_FAULT: QName = ???

    /** The default namespace prefix for http://www.w3.org/2003/05/soap-envelope */
    @stub
    val SOAP_ENV_PREFIX: String = ???

    /** SOAP 1.2 MustUnderstand Fault */
    @stub
    val SOAP_MUSTUNDERSTAND_FAULT: QName = ???

    /** SOAP 1.2 Receiver Fault */
    @stub
    val SOAP_RECEIVER_FAULT: QName = ???

    /** SOAP 1.2 Sender Fault */
    @stub
    val SOAP_SENDER_FAULT: QName = ???

    /** SOAP 1.2 VersionMismatch Fault */
    @stub
    val SOAP_VERSIONMISMATCH_FAULT: QName = ???

    /** The namespace identifier for the SOAP 1.1 envelope. */
    @stub
    val URI_NS_SOAP_1_1_ENVELOPE: String = ???

    /** The namespace identifier for the SOAP 1.2 encoding. */
    @stub
    val URI_NS_SOAP_1_2_ENCODING: String = ???

    /** The namespace identifier for the SOAP 1.2 envelope. */
    @stub
    val URI_NS_SOAP_1_2_ENVELOPE: String = ???

    /** The namespace identifier for the SOAP 1.1 encoding. */
    @stub
    val URI_NS_SOAP_ENCODING: String = ???

    /** The namespace identifier for the SOAP 1.1 envelope, All SOAPElements in this
     *  namespace are defined by the SOAP 1.1 specification.
     */
    @stub
    val URI_NS_SOAP_ENVELOPE: String = ???

    /** The URI identifying the next application processing a SOAP request as the intended
     *  role for a SOAP 1.2 header entry (see section 2.2 of part 1 of the SOAP 1.2
     *  specification).
     */
    @stub
    val URI_SOAP_1_2_ROLE_NEXT: String = ???

    /** The URI specifying the role None in SOAP 1.2. */
    @stub
    val URI_SOAP_1_2_ROLE_NONE: String = ???

    /** The URI identifying the ultimate receiver of the SOAP 1.2 message. */
    @stub
    val URI_SOAP_1_2_ROLE_ULTIMATE_RECEIVER: String = ???
}
