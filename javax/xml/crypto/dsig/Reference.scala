package javax.xml.crypto.dsig

import java.io.InputStream
import java.lang.String
import java.util.List
import javax.xml.crypto.{Data, URIReference, XMLStructure}

/** A representation of the Reference element as defined in the
 *  
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML schema is defined as:
 *  
 *  <element name="Reference" type="ds:ReferenceType"/>
 *  <complexType name="ReferenceType">
 *    <sequence>
 *      <element ref="ds:Transforms" minOccurs="0"/>
 *      <element ref="ds:DigestMethod"/>
 *      <element ref="ds:DigestValue"/>
 *    </sequence>
 *    <attribute name="Id" type="ID" use="optional"/>
 *    <attribute name="URI" type="anyURI" use="optional"/>
 *    <attribute name="Type" type="anyURI" use="optional"/>
 *  </complexType>
 * 
 *  <element name="DigestValue" type="ds:DigestValueType"/>
 *  <simpleType name="DigestValueType">
 *    <restriction base="base64Binary"/>
 *  </simpleType>
 *  
 * 
 *  A Reference instance may be created by invoking one of the
 *  newReference methods of the
 *  XMLSignatureFactory class; for example:
 * 
 *  
 *    XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
 *    Reference ref = factory.newReference
 *      ("http://www.ietf.org/rfc/rfc3275.txt",
 *       factory.newDigestMethod(DigestMethod.SHA1, null));
 *  
 */
trait Reference extends URIReference with XMLStructure {

    /** Returns the calculated digest value of this Reference
     *  after a validation operation.
     */
    @stub
    def getCalculatedDigestValue(): Array[Byte] = ???

    /** Returns the dereferenced data, if
     *  reference caching
     *  is enabled.
     */
    @stub
    def getDereferencedData(): Data = ???

    /** Returns the pre-digested input stream, if
     *  reference caching
     *  is enabled.
     */
    @stub
    def getDigestInputStream(): InputStream = ???

    /** Returns the digest method of this Reference. */
    @stub
    def getDigestMethod(): DigestMethod = ???

    /** Returns the digest value of this Reference. */
    @stub
    def getDigestValue(): Array[Byte] = ???

    /** Returns the optional Id attribute of this
     *  Reference, which permits this reference to be
     *  referenced from elsewhere.
     */
    @stub
    def getId(): String = ???

    /** Returns an unmodifiable
     *  list of Transforms that are contained in this
     *  Reference.
     */
    @stub
    def getTransforms(): List = ???
}
