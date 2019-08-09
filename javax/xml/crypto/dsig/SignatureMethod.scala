package javax.xml.crypto.dsig

import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import javax.xml.crypto.{AlgorithmMethod, XMLStructure}
import scala.scalanative.annotation.stub

/** A representation of the XML SignatureMethod element
 *  as defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 *  
 *  
 *    <element name="SignatureMethod" type="ds:SignatureMethodType"/>
 *      <complexType name="SignatureMethodType" mixed="true">
 *        <sequence>
 *          <element name="HMACOutputLength" minOccurs="0" type="ds:HMACOutputLengthType"/>
 *          <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
 *            <!-- (0,unbounded) elements from (1,1) namespace -->
 *        </sequence>
 *        <attribute name="Algorithm" type="anyURI" use="required"/>
 *      </complexType>
 *  
 * 
 *  A SignatureMethod instance may be created by invoking the
 *  newSignatureMethod method
 *  of the XMLSignatureFactory class.
 */
trait SignatureMethod extends XMLStructure with AlgorithmMethod {

    /** Returns the algorithm-specific input parameters of this
     *  SignatureMethod.
     */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???
}

object SignatureMethod {
    /** The DSAwithSHA1
     *  (DSS) signature method algorithm URI.
     */
    @stub
    val DSA_SHA1: String = ???

    /** The HMAC-SHA1
     *  MAC signature method algorithm URI
     */
    @stub
    val HMAC_SHA1: String = ???

    /** The RSAwithSHA1
     *  (PKCS #1) signature method algorithm URI.
     */
    @stub
    val RSA_SHA1: String = ???
}
