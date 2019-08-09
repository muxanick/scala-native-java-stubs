package java.security.cert

import java.lang.Object
import java.util.Collection

/** Parameters used as input for the Collection CertStore
 *  algorithm.
 *  
 *  This class is used to provide necessary configuration parameters
 *  to implementations of the Collection CertStore
 *  algorithm. The only parameter included in this class is the
 *  Collection from which the CertStore will
 *  retrieve certificates and CRLs.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class CollectionCertStoreParameters extends Object with CertStoreParameters {

    /** Creates an instance of CollectionCertStoreParameters with
     *  the default parameter values (an empty and immutable
     *  Collection).
     */
    @stub
    def this() = ???

    /** Returns a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Returns the Collection from which Certificates
     *  and CRLs are retrieved.
     */
    @stub
    def getCollection(): Collection[_] = ???
}
