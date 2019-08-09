package javax.xml.crypto.dsig.keyinfo

import java.util.List
import javax.xml.crypto.{Data, URIReference, XMLCryptoContext, XMLStructure}

/** A representation of the XML RetrievalMethod element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  A RetrievalMethod object is used to convey a reference to
 *  KeyInfo information that is stored at another location.
 *  The XML schema definition is defined as:
 * 
 *  
 *    <element name="RetrievalMethod" type="ds:RetrievalMethodType"/>
 *    <complexType name="RetrievalMethodType">
 *      <sequence>
 *        <element name="Transforms" type="ds:TransformsType" minOccurs="0"/>
 *      </sequence>
 *      <attribute name="URI" type="anyURI"/>
 *      <attribute name="Type" type="anyURI" use="optional"/>
 *    </complexType>
 *  
 * 
 *  A RetrievalMethod instance may be created by invoking one of the
 *  newRetrievalMethod methods
 *  of the KeyInfoFactory class, and passing it the URI
 *  identifying the location of the KeyInfo, an optional type URI identifying
 *  the type of KeyInfo, and an optional list of Transforms; for example:
 *  
 *    KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *    RetrievalMethod rm = factory.newRetrievalMethod
 *       ("#KeyValue-1", KeyValue.DSA_TYPE, Collections.singletonList(Transform.BASE64));
 *  
 */
trait RetrievalMethod extends URIReference with XMLStructure {

    /** Dereferences the KeyInfo information referenced by this
     *  RetrievalMethod and applies the specified
     *  Transforms.
     */
    @stub
    def dereference(context: XMLCryptoContext): Data = ???

    /** Returns an unmodifiable
     *  list of Transforms of this RetrievalMethod.
     */
    @stub
    def getTransforms(): List = ???
}
