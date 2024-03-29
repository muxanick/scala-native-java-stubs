package java.rmi.server

import java.lang.Exception
import scala.scalanative.annotation.stub

/** An RMIFailureHandler can be registered via the
 *  RMISocketFactory.setFailureHandler call. The
 *  failure method of the handler is invoked when the RMI
 *  runtime is unable to create a ServerSocket to listen
 *  for incoming calls. The failure method returns a boolean
 *  indicating whether the runtime should attempt to re-create the
 *  ServerSocket.
 */
trait RMIFailureHandler {

    /** The failure callback is invoked when the RMI
     *  runtime is unable to create a ServerSocket via the
     *  RMISocketFactory.
     */
    @stub
    def failure(ex: Exception): Boolean = ???
}
