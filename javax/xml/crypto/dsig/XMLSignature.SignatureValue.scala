package javax.xml.crypto.dsig

import java.lang.String
import javax.xml.crypto.XMLStructure

/** A representation of the XML SignatureValue element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  The XML Schema Definition is defined as:
 *  
 *  
 *    <element name="SignatureValue" type="ds:SignatureValueType"/>
 *      <complexType name="SignatureValueType">
 *        <simpleContent>
 *          <extension base="base64Binary">
 *            <attribute name="Id" type="ID" use="optional"/>
 *          </extension>
 *        </simpleContent>
 *      </complexType>
 *  
 */
object trait XMLSignature.SignatureValue extends XMLStructure {

    /** Returns the optional Id attribute of this
     *  SignatureValue, which permits this element to be
     *  referenced from elsewhere.
     */
    @stub
    def getId(): String = ???

    /** Returns the signature value of this SignatureValue. */
    @stub
    def getValue(): Array[Byte] = ???
}
