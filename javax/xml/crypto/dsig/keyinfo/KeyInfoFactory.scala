package javax.xml.crypto.dsig.keyinfo

import java.lang.{Object, String}
import java.math.BigInteger
import java.security.{Provider, PublicKey}
import java.util.List
import javax.xml.crypto.URIDereferencer

/** A factory for creating KeyInfo objects from scratch or for
 *  unmarshalling a KeyInfo object from a corresponding XML
 *  representation.
 * 
 *  Each instance of KeyInfoFactory supports a specific
 *  XML mechanism type. To create a KeyInfoFactory, call one of the
 *  static getInstance methods, passing in the XML
 *  mechanism type desired, for example:
 * 
 *  
 *    KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *  
 * 
 *  The objects that this factory produces will be based
 *  on DOM and abide by the DOM interoperability requirements as defined in the
 *  
 *  DOM Mechanism Requirements section of the API overview. See the
 *  
 *  Service Providers section of the API overview for a list of standard
 *  mechanism types.
 * 
 *  KeyInfoFactory implementations are registered and loaded
 *  using the Provider mechanism.
 *  For example, a service provider that supports the
 *  DOM mechanism would be specified in the Provider subclass as:
 *  
 *      put("KeyInfoFactory.DOM", "org.example.DOMKeyInfoFactory");
 *  
 * 
 *  Also, the XMLStructures that are created by this factory
 *  may contain state specific to the KeyInfo and are not
 *  intended to be reusable.
 * 
 *  An implementation MUST minimally support the default mechanism type: DOM.
 * 
 *  Note that a caller must use the same KeyInfoFactory
 *  instance to create the XMLStructures of a particular
 *  KeyInfo object. The behavior is undefined if
 *  XMLStructures from different providers or different mechanism
 *  types are used together.
 * 
 *  Concurrent Access
 *  The static methods of this class are guaranteed to be thread-safe.
 *  Multiple threads may concurrently invoke the static methods defined in this
 *  class with no ill effects.
 * 
 *  However, this is not true for the non-static methods defined by this
 *  class. Unless otherwise documented by a specific provider, threads that
 *  need to access a single KeyInfoFactory instance concurrently
 *  should synchronize amongst themselves and provide the necessary locking.
 *  Multiple threads each manipulating a different KeyInfoFactory
 *  instance need not synchronize.
 */
abstract class KeyInfoFactory extends Object {

    /** Returns the type of the XML processing mechanism and representation
     *  supported by this KeyInfoFactory (ex: "DOM")
     */
    def getMechanismType(): String

    /** Returns the provider of this KeyInfoFactory. */
    def getProvider(): Provider

    /** Returns a reference to the URIDereferencer that is used by
     *  default to dereference URIs in RetrievalMethod objects.
     */
    def getURIDereferencer(): URIDereferencer

    /** Indicates whether a specified feature is supported. */
    def isFeatureSupported(feature: String): Boolean

    /** Creates a KeyInfo containing the specified list of
     *  key information types.
     */
    def newKeyInfo(content: List): KeyInfo

    /** Creates a KeyInfo containing the specified list of key
     *  information types and optional id.
     */
    def newKeyInfo(content: List, id: String): KeyInfo

    /** Creates a KeyName from the specified name. */
    def newKeyName(name: String): KeyName

    /** Creates a KeyValue from the specified public key. */
    def newKeyValue(key: PublicKey): KeyValue

    /** Creates a PGPData from the specified PGP public key
     *  identifier.
     */
    def newPGPData(keyId: Array[Byte]): PGPData

    /** Creates a PGPData from the specified PGP public key
     *  identifier, and optional key material packet and list of external
     *  elements.
     */
    def newPGPData(keyId: Array[Byte], keyPacket: Array[Byte], other: List): PGPData

    /** Creates a PGPData from the specified PGP key material
     *  packet and optional list of external elements.
     */
    def newPGPData(keyPacket: Array[Byte], other: List): PGPData

    /** Creates a RetrievalMethod from the specified URI. */
    def newRetrievalMethod(uri: String): RetrievalMethod

    /** Creates a RetrievalMethod from the specified parameters. */
    def newRetrievalMethod(uri: String, type: String, transforms: List): RetrievalMethod

    /** Creates a X509Data containing the specified list of
     *  X.509 content.
     */
    def newX509Data(content: List): X509Data

    /** Creates an X509IssuerSerial from the specified X.500 issuer
     *  distinguished name and serial number.
     */
    def newX509IssuerSerial(issuerName: String, serialNumber: BigInteger): X509IssuerSerial
}

object KeyInfoFactory {
    /** Returns a KeyInfoFactory that supports the
     *  default XML processing mechanism and representation type ("DOM").
     */
    @stub
    def getInstance(): KeyInfoFactory = ???

    /** Returns a KeyInfoFactory that supports the
     *  specified XML processing mechanism and representation type (ex: "DOM").
     */
    @stub
    def getInstance(mechanismType: String): KeyInfoFactory = ???

    /** Returns a KeyInfoFactory that supports the
     *  requested XML processing mechanism and representation type (ex: "DOM"),
     *  as supplied by the specified provider.
     */
    @stub
    def getInstance(mechanismType: String, provider: Provider): KeyInfoFactory = ???

    /** Returns a KeyInfoFactory that supports the
     *  requested XML processing mechanism and representation type (ex: "DOM"),
     *  as supplied by the specified provider.
     */
    @stub
    def getInstance(mechanismType: String, provider: String): KeyInfoFactory = ???
}
