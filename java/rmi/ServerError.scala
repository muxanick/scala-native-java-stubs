package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** A ServerError is thrown as a result of a remote method
 *  invocation when an Error is thrown while processing
 *  the invocation on the server, either while unmarshalling the arguments,
 *  executing the remote method itself, or marshalling the return value.
 * 
 *  A ServerError instance contains the original
 *  Error that occurred as its cause.
 */
class ServerError extends RemoteException {
}
