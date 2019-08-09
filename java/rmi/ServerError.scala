package java.rmi

import java.io.IOException
import java.lang.{Error, Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A ServerError is thrown as a result of a remote method
 *  invocation when an Error is thrown while processing
 *  the invocation on the server, either while unmarshalling the arguments,
 *  executing the remote method itself, or marshalling the return value.
 * 
 *  A ServerError instance contains the original
 *  Error that occurred as its cause.
 */
class ServerError extends RemoteException {

    /** Constructs a ServerError with the specified
     *  detail message and nested error.
     */
    @stub
    def this(s: String, err: Error) = ???
}
