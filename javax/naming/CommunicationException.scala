package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when the client is
 *  unable to communicate with the directory or naming service.
 *  The inability to communicate with the service might be a result
 *  of many factors, such as network partitioning, hardware or interface problems,
 *  failures on either the client or server side.
 *  This exception is meant to be used to capture such communication problems.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class CommunicationException extends NamingException {

    /** Constructs a new instance of CommunicationException. */
    @stub
    def this() = ???

    /** Constructs a new instance of CommunicationException using the
     *  arguments supplied.
     */
    @stub
    def this(explanation: String) = ???
}
