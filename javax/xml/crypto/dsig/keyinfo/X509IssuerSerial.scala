package javax.xml.crypto.dsig.keyinfo

import java.lang.String
import javax.xml.crypto.XMLStructure

/** A representation of the XML X509IssuerSerial element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  An X509IssuerSerial object contains an X.509 issuer
 *  distinguished name (DN) and serial number pair. The XML schema definition is
 *  defined as:
 * 
 *  
 *    <element name="X509IssuerSerial" type="ds:X509IssuerSerialType"/>
 *    <complexType name="X509IssuerSerialType">
 *      <sequence>
 *        <element name="X509IssuerName" type="string"/>
 *        <element name="X509SerialNumber" type="integer"/>
 *      </sequence>
 *    </complexType>
 *  
 * 
 *  An X509IssuerSerial instance may be created by invoking the
 *  newX509IssuerSerial method
 *  of the KeyInfoFactory class, and passing it a
 *  String and BigInteger representing the X.500
 *  DN and serial number. Here is an example of creating an
 *  X509IssuerSerial from the issuer DN and serial number of an
 *  existing X509Certificate:
 *  
 *  KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *  X509IssuerSerial issuer = factory.newX509IssuerSerial
 *      (cert.getIssuerX500Principal().getName(), cert.getSerialNumber());
 *  
 */
trait X509IssuerSerial extends XMLStructure {

    /** Returns the X.500 distinguished name of this
     *  X509IssuerSerial in
     *  RFC 2253 String format.
     */
    @stub
    def getIssuerName(): String = ???
}
