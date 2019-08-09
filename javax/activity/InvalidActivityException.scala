package javax.activity

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException

// This exception may be thrown on any method for which Activity context
// is accessed and indicates that the attempted invocation or the Activity
// context associated with the attempted invocation is incompatible with
// the Activity's current state. It may also be thrown by a container if
// Activity context is received on a method for which Activity context is
// forbidden. This exception will be propagated across J2EE Activity Service
// ORB boundaries via an org.omg.CORBA.INVALID_ACTIVITY system exception.
// An application should handle this error by attempting to complete the
// Activity.
class InvalidActivityException extends RemoteException {

    @stub
    // Constructs a new instance with null as its detail message.
    def this() = ???

    @stub
    // Constructs a new instance with the specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new throwable with the specified detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
