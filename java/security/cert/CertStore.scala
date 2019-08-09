package java.security.cert

import java.lang.{Object, String}
import java.security.Provider
import java.util.Collection

/** A class for retrieving Certificates and CRLs
 *  from a repository.
 *  
 *  This class uses a provider-based architecture.
 *  To create a CertStore, call one of the static
 *  getInstance methods, passing in the type of
 *  CertStore desired, any applicable initialization parameters
 *  and optionally the name of the provider desired.
 *  
 *  Once the CertStore has been created, it can be used to
 *  retrieve Certificates and CRLs by calling its
 *  getCertificates and
 *  getCRLs methods.
 *  
 *  Unlike a KeyStore, which provides access
 *  to a cache of private keys and trusted certificates, a
 *  CertStore is designed to provide access to a potentially
 *  vast repository of untrusted certificates and CRLs. For example, an LDAP
 *  implementation of CertStore provides access to certificates
 *  and CRLs stored in one or more directories using the LDAP protocol and the
 *  schema as defined in the RFC service attribute.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard CertStore type:
 *  
 *  Collection
 *  
 *  This type is described in the 
 *  CertStore section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other types are supported.
 * 
 *  
 *  Concurrent Access
 *  
 *  All public methods of CertStore objects must be thread-safe.
 *  That is, multiple threads may concurrently invoke these methods on a
 *  single CertStore object (or more than one) with no
 *  ill effects. This allows a CertPathBuilder to search for a
 *  CRL while simultaneously searching for further certificates, for instance.
 *  
 *  The static methods of this class are also guaranteed to be thread-safe.
 *  Multiple threads may concurrently invoke the static methods defined in
 *  this class with no ill effects.
 */
class CertStore extends Object {

    /** Returns a Collection of Certificates that
     *  match the specified selector.
     */
    @stub
    def getCertificates(selector: CertSelector): Collection[_ <: Certificate] = ???

    /** Returns the parameters used to initialize this CertStore. */
    @stub
    def getCertStoreParameters(): CertStoreParameters = ???

    /** Returns a Collection of CRLs that
     *  match the specified selector.
     */
    @stub
    def getCRLs(selector: CRLSelector): Collection[_ <: CRL] = ???

    /** Returns the provider of this CertStore. */
    @stub
    def getProvider(): Provider = ???
}

object CertStore {
    /** Returns the default CertStore type as specified by the
     *  certstore.type security property, or the string
     *  "LDAP" if no such property exists.
     */
    @stub
    def getDefaultType(): String = ???

    /** Returns a CertStore object that implements the specified
     *  CertStore type and is initialized with the specified
     *  parameters.
     */
    @stub
    def getInstance(type: String, params: CertStoreParameters): CertStore = ???

    /** Returns a CertStore object that implements the specified
     *  CertStore type.
     */
    @stub
    def getInstance(type: String, params: CertStoreParameters, provider: Provider): CertStore = ???

    /** Returns a CertStore object that implements the specified
     *  CertStore type.
     */
    @stub
    def getInstance(type: String, params: CertStoreParameters, provider: String): CertStore = ???
}
