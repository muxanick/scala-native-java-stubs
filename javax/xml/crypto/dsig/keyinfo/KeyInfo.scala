package javax.xml.crypto.dsig.keyinfo

import java.lang.String
import java.util.List
import javax.xml.crypto.XMLStructure

/** A representation of the XML KeyInfo element as defined in
 *  the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  A KeyInfo contains a list of XMLStructures, each of
 *  which contain information that enables the recipient(s) to obtain the key
 *  needed to validate an XML signature. The XML Schema Definition is defined as:
 * 
 *  
 *  <element name="KeyInfo" type="ds:KeyInfoType"/>
 *  <complexType name="KeyInfoType" mixed="true">
 *    <choice maxOccurs="unbounded">
 *      <element ref="ds:KeyName"/>
 *      <element ref="ds:KeyValue"/>
 *      <element ref="ds:RetrievalMethod"/>
 *      <element ref="ds:X509Data"/>
 *      <element ref="ds:PGPData"/>
 *      <element ref="ds:SPKIData"/>
 *      <element ref="ds:MgmtData"/>
 *      <any processContents="lax" namespace="##other"/>
 *      <!-- (1,1) elements from (0,unbounded) namespaces -->
 *    </choice>
 *    <attribute name="Id" type="ID" use="optional"/>
 *  </complexType>
 *  
 * 
 *  A KeyInfo instance may be created by invoking one of the
 *  newKeyInfo methods of the
 *  KeyInfoFactory class, and passing it a list of one or more
 *  XMLStructures and an optional id parameter;
 *  for example:
 *  
 *    KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *    KeyInfo keyInfo = factory.newKeyInfo
 *       (Collections.singletonList(factory.newKeyName("Alice"), "keyinfo-1"));
 *  
 * 
 *  KeyInfo objects can also be marshalled to XML by invoking
 *  the marshal method.
 */
trait KeyInfo extends XMLStructure {

    /** Returns an unmodifiable
     *  list containing the key information.
     */
    @stub
    def getContent(): List = ???

    /** Return the optional Id attribute of this KeyInfo, which
     *  may be useful for referencing this KeyInfo from other
     *  XML structures.
     */
    @stub
    def getId(): String = ???
}
