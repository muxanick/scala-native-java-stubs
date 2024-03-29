package javax.xml.crypto.dsig

import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import javax.xml.crypto.{AlgorithmMethod, XMLStructure}
import scala.scalanative.annotation.stub

/** A representation of the XML DigestMethod element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 *  
 *  
 *    <element name="DigestMethod" type="ds:DigestMethodType"/>
 *      <complexType name="DigestMethodType" mixed="true">
 *        <sequence>
 *          <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
 *            <!-- (0,unbounded) elements from (1,1) namespace -->
 *        </sequence>
 *        <attribute name="Algorithm" type="anyURI" use="required"/>
 *      </complexType>
 *  
 * 
 *  A DigestMethod instance may be created by invoking the
 *  newDigestMethod method
 *  of the XMLSignatureFactory class.
 */
trait DigestMethod extends XMLStructure with AlgorithmMethod {

    /** Returns the algorithm-specific input parameters associated with this
     *  DigestMethod.
     */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???
}

object DigestMethod {
    /** The 
     *  RIPEMD-160 digest method algorithm URI.
     */
    @stub
    val RIPEMD160: String = ???

    /** The 
     *  SHA1 digest method algorithm URI.
     */
    @stub
    val SHA1: String = ???

    /** The 
     *  SHA256 digest method algorithm URI.
     */
    @stub
    val SHA256: String = ???

    /** The 
     *  SHA512 digest method algorithm URI.
     */
    @stub
    val SHA512: String = ???
}
