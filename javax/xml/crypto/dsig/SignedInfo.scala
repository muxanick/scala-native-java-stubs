package javax.xml.crypto.dsig

import java.io.InputStream
import java.lang.String
import java.util.List
import javax.xml.crypto.XMLStructure

/** An representation of the XML SignedInfo element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 *  
 *  <element name="SignedInfo" type="ds:SignedInfoType"/>
 *  <complexType name="SignedInfoType">
 *    <sequence>
 *      <element ref="ds:CanonicalizationMethod"/>
 *      <element ref="ds:SignatureMethod"/>
 *      <element ref="ds:Reference" maxOccurs="unbounded"/>
 *    </sequence>
 *    <attribute name="Id" type="ID" use="optional"/>
 *  </complexType>
 *  
 * 
 *  A SignedInfo instance may be created by invoking one of the
 *  newSignedInfo methods of the
 *  XMLSignatureFactory class.
 */
trait SignedInfo extends XMLStructure {

    /** Returns the canonicalization method of this SignedInfo. */
    @stub
    def getCanonicalizationMethod(): CanonicalizationMethod = ???

    /** Returns the canonicalized signed info bytes after a signing or
     *  validation operation.
     */
    @stub
    def getCanonicalizedData(): InputStream = ???

    /** Returns the optional Id attribute of this
     *  SignedInfo.
     */
    @stub
    def getId(): String = ???

    /** Returns an unmodifiable list of one or more References. */
    @stub
    def getReferences(): List = ???
}
