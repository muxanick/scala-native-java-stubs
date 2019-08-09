package javax.management.remote

import java.io.IOException
import java.lang.{Error, Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception thrown as the result of a remote MBeanServer
 *  method invocation when an Error is thrown while
 *  processing the invocation in the remote MBean server.  A
 *  JMXServerErrorException instance contains the original
 *  Error that occurred as its cause.
 */
class JMXServerErrorException extends IOException {

    /** Constructs a JMXServerErrorException with the specified
     *  detail message and nested error.
     */
    @stub
    def this(s: String, err: Error) = ???

    /** Returns the cause of this throwable or null if the
     *  cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???
}
