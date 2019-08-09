package javax.xml.crypto.dsig

import java.lang.String
import javax.xml.crypto.XMLStructure

/** A representation of the XML Manifest element as defined in
 *  the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 *  
 *  <element name="Manifest" type="ds:ManifestType"/>
 *    <complexType name="ManifestType">
 *      <sequence>
 *        <element ref="ds:Reference" maxOccurs="unbounded"/>
 *      </sequence>
 *      <attribute name="Id" type="ID" use="optional"/>
 *    </complexType>
 *  
 * 
 *  A Manifest instance may be created by invoking
 *  one of the newManifest
 *  methods of the XMLSignatureFactory class; for example:
 * 
 *  
 *    XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
 *    List references = Collections.singletonList(factory.newReference
 *        ("#reference-1", DigestMethod.SHA1));
 *    Manifest manifest = factory.newManifest(references, "manifest-1");
 *  
 */
trait Manifest extends XMLStructure {

    /** Returns the Id of this Manifest. */
    @stub
    def getId(): String = ???
}
