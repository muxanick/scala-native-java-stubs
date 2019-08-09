package java.security.cert

import java.lang.Object
import java.util.Collection
import scala.scalanative.annotation.stub

/** The Service Provider Interface (SPI)
 *  for the CertStore class. All CertStore
 *  implementations must include a class (the SPI class) that extends
 *  this class (CertStoreSpi), provides a constructor with
 *  a single argument of type CertStoreParameters, and implements
 *  all of its methods. In general, instances of this class should only be
 *  accessed through the CertStore class.
 *  For details, see the Java Cryptography Architecture.
 *  
 *  Concurrent Access
 *  
 *  The public methods of all CertStoreSpi objects must be
 *  thread-safe. That is, multiple threads may concurrently invoke these
 *  methods on a single CertStoreSpi object (or more than one)
 *  with no ill effects. This allows a CertPathBuilder to search
 *  for a CRL while simultaneously searching for further certificates, for
 *  instance.
 *  
 *  Simple CertStoreSpi implementations will probably ensure
 *  thread safety by adding a synchronized keyword to their
 *  engineGetCertificates and engineGetCRLs methods.
 *  More sophisticated ones may allow truly concurrent access.
 */
abstract class CertStoreSpi extends Object {

    /** The sole constructor. */
    @stub
    def this(params: CertStoreParameters) = ???

    /** Returns a Collection of Certificates that
     *  match the specified selector.
     */
    def engineGetCertificates(selector: CertSelector): Collection[_ <: Certificate]

    /** Returns a Collection of CRLs that
     *  match the specified selector.
     */
    def engineGetCRLs(selector: CRLSelector): Collection[_ <: CRL]
}
