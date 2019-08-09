package javax.xml.ws

import java.lang.{Object, String}
import java.util.Map
import java.util.concurrent.Future
import scala.scalanative.annotation.stub

/** The Response interface provides methods used to obtain the
 *   payload and context of a message sent in response to an operation
 *   invocation.
 * 
 *   For asynchronous operation invocations it provides additional methods
 *   to check the status of the request. The get(...) methods may
 *   throw the standard
 *   set of exceptions and their cause may be a RemoteException or a
 *   WebServiceException that represents the error that occured during the
 *   asynchronous method invocation.
 */
trait Response[T] extends Future[T] {

    /** Gets the contained response context. */
    @stub
    def getContext(): Map[String, Object] = ???
}
