package javax.xml.crypto.dsig

import java.lang.{Object, String}
import java.security.Provider
import java.util.List
import javax.xml.crypto.{Data, URIDereferencer, XMLStructure}
import javax.xml.crypto.dsig.keyinfo.{KeyInfo, KeyInfoFactory}
import javax.xml.crypto.dsig.spec.{C14NMethodParameterSpec, DigestMethodParameterSpec, SignatureMethodParameterSpec, TransformParameterSpec}

// A factory for creating XMLSignature objects from scratch or
// for unmarshalling an XMLSignature object from a corresponding
// XML representation.
//
// XMLSignatureFactory Type
//
// Each instance of XMLSignatureFactory supports a specific
// XML mechanism type. To create an XMLSignatureFactory, call one
// of the static getInstance methods, passing in the XML
// mechanism type desired, for example:
//
// 
// XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
// 
//
// The objects that this factory produces will be based
// on DOM and abide by the DOM interoperability requirements as defined in the
// 
// DOM Mechanism Requirements section of the API overview. See the
// 
// Service Providers section of the API overview for a list of standard
// mechanism types.
//
// XMLSignatureFactory implementations are registered and loaded
// using the Provider mechanism.
// For example, a service provider that supports the
// DOM mechanism would be specified in the Provider subclass as:
// 
//     put("XMLSignatureFactory.DOM", "org.example.DOMXMLSignatureFactory");
// 
//
// An implementation MUST minimally support the default mechanism type: DOM.
//
// Note that a caller must use the same XMLSignatureFactory
// instance to create the XMLStructures of a particular
// XMLSignature that is to be generated. The behavior is
// undefined if XMLStructures from different providers or
// different mechanism types are used together.
//
// Also, the XMLStructures that are created by this factory
// may contain state specific to the XMLSignature and are not
// intended to be reusable.
//
// Creating XMLSignatures from scratch
//
// Once the XMLSignatureFactory has been created, objects
// can be instantiated by calling the appropriate method. For example, a
// Reference instance may be created by invoking one of the
// newReference methods.
//
// Unmarshalling XMLSignatures from XML
//
// Alternatively, an XMLSignature may be created from an
// existing XML representation by invoking the unmarshalXMLSignature method and passing it a mechanism-specific
// XMLValidateContext instance containing the XML content:
//
// 
// DOMValidateContext context = new DOMValidateContext(key, signatureElement);
// XMLSignature signature = factory.unmarshalXMLSignature(context);
// 
//
// Each XMLSignatureFactory must support the required
// XMLValidateContext types for that factory type, but may support
// others. A DOM XMLSignatureFactory must support DOMValidateContext objects.
//
// Signing and marshalling XMLSignatures to XML
//
// Each XMLSignature created by the factory can also be
// marshalled to an XML representation and signed, by invoking the
// sign method of the
// XMLSignature object and passing it a mechanism-specific
// XMLSignContext object containing the signing key and
// marshalling parameters (see DOMSignContext).
// For example:
//
// 
//    DOMSignContext context = new DOMSignContext(privateKey, document);
//    signature.sign(context);
// 
//
// Concurrent Access
// The static methods of this class are guaranteed to be thread-safe.
// Multiple threads may concurrently invoke the static methods defined in this
// class with no ill effects.
//
// However, this is not true for the non-static methods defined by this
// class. Unless otherwise documented by a specific provider, threads that
// need to access a single XMLSignatureFactory instance
// concurrently should synchronize amongst themselves and provide the
// necessary locking. Multiple threads each manipulating a different
// XMLSignatureFactory instance need not synchronize.
abstract class XMLSignatureFactory extends Object {

    // Returns a KeyInfoFactory that creates KeyInfo
    // objects.
    def getKeyInfoFactory(): KeyInfoFactory

    // Returns the type of the XML processing mechanism and representation
    // supported by this XMLSignatureFactory (ex: "DOM").
    def getMechanismType(): String

    // Returns the provider of this XMLSignatureFactory.
    def getProvider(): Provider

    // Returns a reference to the URIDereferencer that is used by
    // default to dereference URIs in Reference objects.
    def getURIDereferencer(): URIDereferencer

    // Indicates whether a specified feature is supported.
    def isFeatureSupported(feature: String): Boolean

    // Creates a CanonicalizationMethod for the specified
    // algorithm URI and parameters.
    def newCanonicalizationMethod(algorithm: String, params: C14NMethodParameterSpec): CanonicalizationMethod

    // Creates a CanonicalizationMethod for the specified
    // algorithm URI and parameters.
    def newCanonicalizationMethod(algorithm: String, params: XMLStructure): CanonicalizationMethod

    // Creates a DigestMethod for the specified algorithm URI
    // and parameters.
    def newDigestMethod(algorithm: String, params: DigestMethodParameterSpec): DigestMethod

    // Creates a Manifest containing the specified
    // list of References.
    def newManifest(references: List): Manifest

    // Creates a Manifest containing the specified
    // list of References and optional id.
    def newManifest(references: List, id: String): Manifest

    // Creates a Reference with the specified URI and digest
    // method.
    def newReference(uri: String, dm: DigestMethod): Reference

    // Creates a Reference with the specified parameters.
    def newReference(uri: String, dm: DigestMethod, appliedTransforms: List, result: Data, transforms: List, type: String, id: String): Reference

    // Creates a Reference with the specified parameters.
    def newReference(uri: String, dm: DigestMethod, transforms: List, type: String, id: String): Reference

    // Creates a Reference with the specified parameters and
    // pre-calculated digest value.
    def newReference(uri: String, dm: DigestMethod, transforms: List, type: String, id: String, digestValue: Array[Byte]): Reference

    // Creates a SignatureMethod for the specified algorithm URI
    // and parameters.
    def newSignatureMethod(algorithm: String, params: SignatureMethodParameterSpec): SignatureMethod

    // Creates a SignatureProperties containing the specified
    // list of SignaturePropertys and optional id.
    def newSignatureProperties(properties: List, id: String): SignatureProperties

    // Creates a SignatureProperty containing the specified
    // list of XMLStructures, target URI and optional id.
    def newSignatureProperty(content: List, target: String, id: String): SignatureProperty

    // Creates a SignedInfo with the specified canonicalization
    // and signature methods, and list of one or more references.
    def newSignedInfo(cm: CanonicalizationMethod, sm: SignatureMethod, references: List): SignedInfo

    // Creates a SignedInfo with the specified parameters.
    def newSignedInfo(cm: CanonicalizationMethod, sm: SignatureMethod, references: List, id: String): SignedInfo

    // Creates a Transform for the specified algorithm URI
    // and parameters.
    def newTransform(algorithm: String, params: TransformParameterSpec): Transform

    // Creates a Transform for the specified algorithm URI
    // and parameters.
    def newTransform(algorithm: String, params: XMLStructure): Transform

    // Creates an XMLObject from the specified parameters.
    def newXMLObject(content: List, id: String, mimeType: String, encoding: String): XMLObject

    // Creates an XMLSignature and initializes it with the contents
    // of the specified SignedInfo and KeyInfo
    // objects.
    def newXMLSignature(si: SignedInfo, ki: KeyInfo): XMLSignature

    // Creates an XMLSignature and initializes it with the
    // specified parameters.
    def newXMLSignature(si: SignedInfo, ki: KeyInfo, objects: List, id: String, signatureValueId: String): XMLSignature

    // Unmarshals a new XMLSignature instance from a
    // mechanism-specific XMLStructure instance.
    def unmarshalXMLSignature(xmlStructure: XMLStructure): XMLSignature
}

object XMLSignatureFactory {
    @stub
    // Returns an XMLSignatureFactory that supports the
    // default XML processing mechanism and representation type ("DOM").
    def getInstance(): XMLSignatureFactory = ???

    @stub
    // Returns an XMLSignatureFactory that supports the
    // specified XML processing mechanism and representation type (ex: "DOM").
    def getInstance(mechanismType: String): XMLSignatureFactory = ???

    @stub
    // Returns an XMLSignatureFactory that supports the
    // requested XML processing mechanism and representation type (ex: "DOM"),
    // as supplied by the specified provider.
    def getInstance(mechanismType: String, provider: Provider): XMLSignatureFactory = ???

    @stub
    // Returns an XMLSignatureFactory that supports the
    // requested XML processing mechanism and representation type (ex: "DOM"),
    // as supplied by the specified provider.
    def getInstance(mechanismType: String, provider: String): XMLSignatureFactory = ???
}
