package javax.xml.crypto.dsig

import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** A representation of the XML CanonicalizationMethod
 *  element as defined in the
 *  
 *  W3C Recommendation for XML-Signature Syntax and Processing. The XML
 *  Schema Definition is defined as:
 *  
 *  
 *    <element name="CanonicalizationMethod" type="ds:CanonicalizationMethodType"/>
 *      <complexType name="CanonicalizationMethodType" mixed="true">
 *        <sequence>
 *          <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
 *            <!-- (0,unbounded) elements from (1,1) namespace -->
 *        </sequence>
 *        <attribute name="Algorithm" type="anyURI" use="required"/>
 *      </complexType>
 *  
 * 
 *  A CanonicalizationMethod instance may be created by invoking
 *  the newCanonicalizationMethod method of the XMLSignatureFactory class.
 */
trait CanonicalizationMethod extends Transform {

    /** Returns the algorithm-specific input parameters associated with this
     *  CanonicalizationMethod.
     */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???
}

object CanonicalizationMethod {
    /** The Exclusive
     *  Canonical XML (without comments) canonicalization method algorithm
     *  URI.
     */
    @stub
    val EXCLUSIVE: String = ???

    /** The 
     *  Exclusive Canonical XML with comments canonicalization method
     *  algorithm URI.
     */
    @stub
    val EXCLUSIVE_WITH_COMMENTS: String = ???

    /** The Canonical
     *  XML (without comments) canonicalization method algorithm URI.
     */
    @stub
    val INCLUSIVE: String = ???

    /** The
     *  
     *  Canonical XML with comments canonicalization method algorithm URI.
     */
    @stub
    val INCLUSIVE_WITH_COMMENTS: String = ???
}
