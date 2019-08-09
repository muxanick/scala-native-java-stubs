package javax.xml.ws

import scala.scalanative.annotation.stub

/** The AsyncHandler interface is implemented by
 *  clients that wish to receive callback notification of the completion of
 *  service endpoint operations invoked asynchronously.
 */
trait AsyncHandler[T] {

    /** Called when the response to an asynchronous operation is available. */
    @stub
    def handleResponse(res: Response[T]): Unit = ???
}
