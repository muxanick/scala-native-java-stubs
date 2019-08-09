package javax.activity

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException

/** This exception may be thrown on any method for which Activity context is
 *  accessed and indicates that ongoing work within the Activity is not
 *  possible. This may be because the Activity has been instructed to complete
 *  with CompletionStatusFailOnly or has ended as a result of a timeout. This
 *  exception will be propagated across ORB boundaries via an
 *  org.omg.CORBA.ACTIVITY_COMPLETED system exception. An application should
 *  handle this error by attempting to complete the Activity.
 */
class ActivityCompletedException extends RemoteException {

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
