package javax.management.remote

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Exception thrown as the result of a remote MBeanServer
 *  method invocation when an Error is thrown while
 *  processing the invocation in the remote MBean server.  A
 *  JMXServerErrorException instance contains the original
 *  Error that occurred as its cause.
 */
class JMXServerErrorException extends IOException {
}
