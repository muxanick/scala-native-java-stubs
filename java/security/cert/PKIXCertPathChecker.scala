package java.security.cert

import java.lang.{Cloneable, Object, String}
import java.util.{Collection, Set}
import scala.scalanative.annotation.stub

/** An abstract class that performs one or more checks on an
 *  X509Certificate.
 * 
 *  A concrete implementation of the PKIXCertPathChecker class
 *  can be created to extend the PKIX certification path validation algorithm.
 *  For example, an implementation may check for and process a critical private
 *  extension of each certificate in a certification path.
 * 
 *  Instances of PKIXCertPathChecker are passed as parameters
 *  using the setCertPathCheckers
 *  or addCertPathChecker methods
 *  of the PKIXParameters and PKIXBuilderParameters
 *  class. Each of the PKIXCertPathCheckers check
 *  methods will be called, in turn, for each certificate processed by a PKIX
 *  CertPathValidator or CertPathBuilder
 *  implementation.
 * 
 *  A PKIXCertPathChecker may be called multiple times on
 *  successive certificates in a certification path. Concrete subclasses
 *  are expected to maintain any internal state that may be necessary to
 *  check successive certificates. The init method is used
 *  to initialize the internal state of the checker so that the certificates
 *  of a new certification path may be checked. A stateful implementation
 *  must override the clone method if necessary in
 *  order to allow a PKIX CertPathBuilder to efficiently
 *  backtrack and try other paths. In these situations, the
 *  CertPathBuilder is able to restore prior path validation
 *  states by restoring the cloned PKIXCertPathCheckers.
 * 
 *  The order in which the certificates are presented to the
 *  PKIXCertPathChecker may be either in the forward direction
 *  (from target to most-trusted CA) or in the reverse direction (from
 *  most-trusted CA to target). A PKIXCertPathChecker implementation
 *  must support reverse checking (the ability to perform its checks when
 *  it is presented with certificates in the reverse direction) and may
 *  support forward checking (the ability to perform its checks when it is
 *  presented with certificates in the forward direction). The
 *  isForwardCheckingSupported method
 *  indicates whether forward checking is supported.
 *  
 *  Additional input parameters required for executing the check may be
 *  specified through constructors of concrete implementations of this class.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
abstract class PKIXCertPathChecker extends Object with CertPathChecker with Cloneable {

    /** Default constructor. */
    @stub
    protected def this() = ???

    /** Performs the check(s) on the specified certificate using its internal
     *  state.
     */
    def check(cert: Certificate): Unit

    /** Performs the check(s) on the specified certificate using its internal
     *  state and removes any critical extensions that it processes from the
     *  specified collection of OID strings that represent the unresolved
     *  critical extensions.
     */
    def check(cert: Certificate, unresolvedCritExts: Collection[String]): Unit

    /** Returns a clone of this object. */
    def clone(): Object

    /** Returns an immutable Set of X.509 certificate extensions
     *  that this PKIXCertPathChecker supports (i.e.
     */
    def getSupportedExtensions(): Set[String]

    /** Initializes the internal state of this PKIXCertPathChecker. */
    def init(forward: Boolean): Unit

    /** Indicates if forward checking is supported. */
    def isForwardCheckingSupported(): Boolean
}
