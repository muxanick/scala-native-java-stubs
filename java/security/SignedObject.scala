package java.security

import java.io.Serializable
import java.lang.{Object, String}

/**  SignedObject is a class for the purpose of creating authentic
 *  runtime objects whose integrity cannot be compromised without being
 *  detected.
 * 
 *   More specifically, a SignedObject contains another Serializable
 *  object, the (to-be-)signed object and its signature.
 * 
 *   The signed object is a "deep copy" (in serialized form) of an
 *  original object.  Once the copy is made, further manipulation of
 *  the original object has no side effect on the copy.
 * 
 *   The underlying signing algorithm is designated by the Signature
 *  object passed to the constructor and the verify method.
 *  A typical usage for signing is the following:
 * 
 *  
 *  Signature signingEngine = Signature.getInstance(algorithm,
 *                                                  provider);
 *  SignedObject so = new SignedObject(myobject, signingKey,
 *                                     signingEngine);
 *  
 * 
 *   A typical usage for verification is the following (having
 *  received SignedObject so):
 * 
 *  
 *  Signature verificationEngine =
 *      Signature.getInstance(algorithm, provider);
 *  if (so.verify(publickey, verificationEngine))
 *      try {
 *          Object myobj = so.getObject();
 *      } catch (java.lang.ClassNotFoundException e) {};
 *  
 * 
 *   Several points are worth noting.  First, there is no need to
 *  initialize the signing or verification engine, as it will be
 *  re-initialized inside the constructor and the verify
 *  method. Secondly, for verification to succeed, the specified
 *  public key must be the public key corresponding to the private key
 *  used to generate the SignedObject.
 * 
 *   More importantly, for flexibility reasons, the
 *  constructor and verify method allow for
 *  customized signature engines, which can implement signature
 *  algorithms that are not installed formally as part of a crypto
 *  provider.  However, it is crucial that the programmer writing the
 *  verifier code be aware what Signature engine is being
 *  used, as its own implementation of the verify method
 *  is invoked to verify a signature.  In other words, a malicious
 *  Signature may choose to always return true on
 *  verification in an attempt to bypass a security check.
 * 
 *   The signature algorithm can be, among others, the NIST standard
 *  DSA, using DSA and SHA-256.  The algorithm is specified using the
 *  same convention as that for signatures. The DSA algorithm using the
 *  SHA-256 message digest algorithm can be specified, for example, as
 *  "SHA256withDSA".  In the case of
 *  RSA the signing algorithm could be specified as, for example,
 *  "SHA256withRSA".  The algorithm name must be
 *  specified, as there is no default.
 * 
 *   The name of the Cryptography Package Provider is designated
 *  also by the Signature parameter to the constructor and the
 *  verify method.  If the provider is not
 *  specified, the default provider is used.  Each installation can
 *  be configured to use a particular provider as default.
 * 
 *   Potential applications of SignedObject include:
 *  
 *   It can be used
 *  internally to any Java runtime as an unforgeable authorization
 *  token -- one that can be passed around without the fear that the
 *  token can be maliciously modified without being detected.
 *   It
 *  can be used to sign and serialize data/object for storage outside
 *  the Java runtime (e.g., storing critical access control data on
 *  disk).
 *   Nested SignedObjects can be used to construct a logical
 *  sequence of signatures, resembling a chain of authorization and
 *  delegation.
 *  
 */
final class SignedObject extends Object with Serializable {

    /** Retrieves the name of the signature algorithm. */
    @stub
    def getAlgorithm(): String = ???

    /** Retrieves the encapsulated object. */
    @stub
    def getObject(): Object = ???

    /** Retrieves the signature on the signed object, in the form of a
     *  byte array.
     */
    @stub
    def getSignature(): Array[Byte] = ???
}
