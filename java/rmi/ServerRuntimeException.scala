package java.rmi

import java.io.IOException
import java.lang.{Deprecated, Exception, Object, Throwable}

// From a server executing on JDK 1.1, a
// ServerRuntimeException is thrown as a result of a
// remote method invocation when a RuntimeException is
// thrown while processing the invocation on the server, either while
// unmarshalling the arguments, executing the remote method itself, or
// marshalling the return value.
//
// A ServerRuntimeException instance contains the original
// RuntimeException that occurred as its cause.
//
// A ServerRuntimeException is not thrown from servers
// executing on the Java 2 platform v1.2 or later versions.
@Deprecated class ServerRuntimeException extends RemoteException {
}
