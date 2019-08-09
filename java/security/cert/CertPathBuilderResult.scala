package java.security.cert

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** A specification of the result of a certification path builder algorithm.
 *  All results returned by the CertPathBuilder.build method must implement this interface.
 *  
 *  At a minimum, a CertPathBuilderResult contains the
 *  CertPath built by the CertPathBuilder instance.
 *  Implementations of this interface may add methods to return implementation
 *  or algorithm specific information, such as debugging information or
 *  certification path validation results.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this interface are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
trait CertPathBuilderResult extends Cloneable {

    /** Makes a copy of this CertPathBuilderResult. */
    @stub
    def clone(): Object = ???

    /** Returns the built certification path. */
    @stub
    def getCertPath(): CertPath = ???
}
