package javax.activity

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException

/** This exception is thrown by a container if Activity context is not received
 *  on a method for which Activity context is mandatory. This exception
 *  indicates a deployment or application configuration error. This exception
 *  will be propagated across ORB boundaries via an
 *  org.omg.CORBA.ACTIVITY_REQUIRED system exception.
 */
class ActivityRequiredException extends RemoteException {

    /** Constructs a new instance with null as its detail message. */
    @stub
    def this() = ???

    /** Constructs a new instance with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new throwable with the specified detail message and cause. */
    @stub
    def this(message: String, cause: Throwable) = ???
}
