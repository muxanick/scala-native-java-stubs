package javax.xml.crypto.dsig.keyinfo

import java.lang.String
import javax.xml.crypto.XMLStructure

/** A representation of the XML X509Data element as defined in
 *  the 
 *  W3C Recommendation for XML-Signature Syntax and Processing. An
 *  X509Data object contains one or more identifers of keys
 *  or X.509 certificates (or certificates' identifiers or a revocation list).
 *  The XML Schema Definition is defined as:
 * 
 *  
 *     <element name="X509Data" type="ds:X509DataType"/>
 *     <complexType name="X509DataType">
 *         <sequence maxOccurs="unbounded">
 *           <choice>
 *             <element name="X509IssuerSerial" type="ds:X509IssuerSerialType"/>
 *             <element name="X509SKI" type="base64Binary"/>
 *             <element name="X509SubjectName" type="string"/>
 *             <element name="X509Certificate" type="base64Binary"/>
 *             <element name="X509CRL" type="base64Binary"/>
 *             <any namespace="##other" processContents="lax"/>
 *           </choice>
 *         </sequence>
 *     </complexType>
 * 
 *     <complexType name="X509IssuerSerialType">
 *       <sequence>
 *         <element name="X509IssuerName" type="string"/>
 *         <element name="X509SerialNumber" type="integer"/>
 *       </sequence>
 *     </complexType>
 *  
 * 
 *  An X509Data instance may be created by invoking the
 *  newX509Data methods of the
 *  KeyInfoFactory class and passing it a list of one or more
 *  XMLStructures representing X.509 content; for example:
 *  
 *    KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *    X509Data x509Data = factory.newX509Data
 *        (Collections.singletonList("cn=Alice"));
 *  
 */
trait X509Data extends XMLStructure {
}

object X509Data {
    /** URI identifying the binary (ASN.1 DER) X.509 Certificate KeyInfo type:
     *  http://www.w3.org/2000/09/xmldsig#rawX509Certificate.
     */
    @stub
    val RAW_X509_CERTIFICATE_TYPE: String = ???
}
