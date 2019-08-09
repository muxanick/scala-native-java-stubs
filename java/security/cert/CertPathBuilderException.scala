package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** An exception indicating one of a variety of problems encountered when
 *  building a certification path with a CertPathBuilder.
 *  
 *  A CertPathBuilderException provides support for wrapping
 *  exceptions. The getCause method returns the throwable,
 *  if any, that caused this exception to be thrown.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class CertPathBuilderException extends GeneralSecurityException {

    /** Creates a CertPathBuilderException with null
     *  as its detail message.
     */
    @stub
    def this() = ???

    /** Creates a CertPathBuilderException with the given
     *  detail message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a CertPathBuilderException with the specified
     *  detail message and cause.
     */
    @stub
    def this(msg: String, cause: Throwable) = ???

    /** Creates a CertPathBuilderException that wraps the specified
     *  throwable.
     */
    @stub
    def this(cause: Throwable) = ???
}
