package javax.xml.crypto.dsig

import java.io.OutputStream
import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import javax.xml.crypto.{AlgorithmMethod, Data, XMLCryptoContext, XMLStructure}
import scala.scalanative.annotation.stub

/** A representation of the XML Transform element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 * 
 *  
 *  <element name="Transform" type="ds:TransformType"/>
 *    <complexType name="TransformType" mixed="true">
 *      <choice minOccurs="0" maxOccurs="unbounded">
 *        <any namespace="##other" processContents="lax"/>
 *        <!-- (1,1) elements from (0,unbounded) namespaces -->
 *        <element name="XPath" type="string"/>
 *      </choice>
 *      <attribute name="Algorithm" type="anyURI" use="required"/>
 *    </complexType>
 *  
 * 
 *  A Transform instance may be created by invoking the
 *  newTransform method
 *  of the XMLSignatureFactory class.
 */
trait Transform extends XMLStructure with AlgorithmMethod {

    /** Returns the algorithm-specific input parameters associated with this
     *  Transform.
     */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???

    /** Transforms the specified data using the underlying transform algorithm. */
    @stub
    def transform(data: Data, context: XMLCryptoContext): Data = ???

    /** Transforms the specified data using the underlying transform algorithm. */
    @stub
    def transform(data: Data, context: XMLCryptoContext, os: OutputStream): Data = ???
}

object Transform {
    /** The Base64
     *  transform algorithm URI.
     */
    @stub
    val BASE64: String = ???

    /** The 
     *  Enveloped Signature transform algorithm URI.
     */
    @stub
    val ENVELOPED: String = ???

    /** The XPath
     *  transform algorithm URI.
     */
    @stub
    val XPATH: String = ???

    /** The 
     *  XPath Filter 2 transform algorithm URI.
     */
    @stub
    val XPATH2: String = ???

    /** The XSLT
     *  transform algorithm URI.
     */
    @stub
    val XSLT: String = ???
}
