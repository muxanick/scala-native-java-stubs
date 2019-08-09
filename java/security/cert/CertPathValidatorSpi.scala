package java.security.cert

import java.lang.Object
import scala.scalanative.annotation.stub

/** The Service Provider Interface (SPI)
 *  for the CertPathValidator class. All
 *  CertPathValidator implementations must include a class (the
 *  SPI class) that extends this class (CertPathValidatorSpi)
 *  and implements all of its methods. In general, instances of this class
 *  should only be accessed through the CertPathValidator class.
 *  For details, see the Java Cryptography Architecture.
 *  
 *  Concurrent Access
 *  
 *  Instances of this class need not be protected against concurrent
 *  access from multiple threads. Threads that need to access a single
 *  CertPathValidatorSpi instance concurrently should synchronize
 *  amongst themselves and provide the necessary locking before calling the
 *  wrapping CertPathValidator object.
 *  
 *  However, implementations of CertPathValidatorSpi may still
 *  encounter concurrency issues, since multiple threads each
 *  manipulating a different CertPathValidatorSpi instance need not
 *  synchronize.
 */
abstract class CertPathValidatorSpi extends Object {

    /** The default constructor. */
    @stub
    def this() = ???

    /** Returns a CertPathChecker that this implementation uses to
     *  check the revocation status of certificates.
     */
    def engineGetRevocationChecker(): CertPathChecker

    /** Validates the specified certification path using the specified
     *  algorithm parameter set.
     */
    def engineValidate(certPath: CertPath, params: CertPathParameters): CertPathValidatorResult
}
