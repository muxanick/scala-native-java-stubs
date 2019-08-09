package javax.xml.ws

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** The ProtocolException class is a
 *   base class for exceptions related to a specific protocol binding. Subclasses
 *   are used to communicate protocol level fault information to clients and may
 *   be used on the server to control the protocol specific fault representation.
 */
class ProtocolException extends WebServiceException {

    /** Constructs a new protocol exception with null as its detail message. */
    @stub
    def this() = ???

    /** Constructs a new protocol exception with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new runtime exception with the specified detail message and
     *  cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new runtime exception with the specified cause and a  detail
     *  message of (cause==null ? null : cause.toString())  (which typically
     *  contains the class and detail message of  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
