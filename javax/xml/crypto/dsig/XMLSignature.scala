package javax.xml.crypto.dsig

import java.lang.String
import java.util.List
import javax.xml.crypto.{KeySelectorResult, XMLStructure}
import javax.xml.crypto.dsig.keyinfo.KeyInfo
import scala.scalanative.annotation.stub

/** A representation of the XML Signature element as
 *  defined in the 
 *  W3C Recommendation for XML-Signature Syntax and Processing.
 *  This class contains methods for signing and validating XML signatures
 *  with behavior as defined by the W3C specification. The XML Schema Definition
 *  is defined as:
 *  
 *  <element name="Signature" type="ds:SignatureType"/>
 *  <complexType name="SignatureType">
 *     <sequence>
 *       <element ref="ds:SignedInfo"/>
 *       <element ref="ds:SignatureValue"/>
 *       <element ref="ds:KeyInfo" minOccurs="0"/>
 *       <element ref="ds:Object" minOccurs="0" maxOccurs="unbounded"/>
 *     </sequence>
 *     <attribute name="Id" type="ID" use="optional"/>
 *  </complexType>
 *  
 *  
 *  An XMLSignature instance may be created by invoking one of the
 *  newXMLSignature methods of the
 *  XMLSignatureFactory class.
 * 
 *  If the contents of the underlying document containing the
 *  XMLSignature are subsequently modified, the behavior is
 *  undefined.
 * 
 *  Note that this class is named XMLSignature rather than
 *  Signature to avoid naming clashes with the existing
 *  java.security.Signature class.
 */
trait XMLSignature extends XMLStructure {

    /** Returns the optional Id of this XMLSignature. */
    @stub
    def getId(): String = ???

    /** Returns the key info of this XMLSignature. */
    @stub
    def getKeyInfo(): KeyInfo = ???

    /** Returns the result of the KeySelector, if specified, after
     *  this XMLSignature has been signed or validated.
     */
    @stub
    def getKeySelectorResult(): KeySelectorResult = ???

    /** Returns an unmodifiable
     *  list of XMLObjects contained in this XMLSignature.
     */
    @stub
    def getObjects(): List = ???

    /** Returns the signature value of this XMLSignature. */
    @stub
    def getSignatureValue(): XMLSignature.SignatureValue = ???

    /** Returns the signed info of this XMLSignature. */
    @stub
    def getSignedInfo(): SignedInfo = ???

    /** Signs this XMLSignature. */
    @stub
    def sign(signContext: XMLSignContext): Unit = ???

    /** Validates the signature according to the
     *  
     *  core validation processing rules.
     */
    @stub
    def validate(validateContext: XMLValidateContext): Boolean = ???
}

object XMLSignature {
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
    trait SignatureValue extends XMLStructure {

        /** Returns the optional Id attribute of this
         *  SignatureValue, which permits this element to be
         *  referenced from elsewhere.
         */
        @stub
        def getId(): String = ???

        /** Returns the signature value of this SignatureValue. */
        @stub
        def getValue(): Array[Byte] = ???

        /** Validates the signature value. */
        @stub
        def validate(validateContext: XMLValidateContext): Boolean = ???
    }


    /** The XML Namespace URI of the W3C Recommendation for XML-Signature
     *  Syntax and Processing.
     */
    @stub
    val XMLNS: String = ???
}
