package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** A ServerException is thrown as a result of a remote method
 *  invocation when a RemoteException is thrown while processing
 *  the invocation on the server, either while unmarshalling the arguments or
 *  executing the remote method itself.
 * 
 *  A ServerException instance contains the original
 *  RemoteException that occurred as its cause.
 */
class ServerException extends RemoteException {

    /** Constructs a ServerException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
