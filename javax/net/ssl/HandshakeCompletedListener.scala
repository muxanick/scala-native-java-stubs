package javax.net.ssl

import java.util.EventListener
import scala.scalanative.annotation.stub

/** This interface is implemented by any class which wants to receive
 *  notifications about the completion of an SSL protocol handshake
 *  on a given SSL connection.
 * 
 *   When an SSL handshake completes, new security parameters will
 *  have been established.  Those parameters always include the security
 *  keys used to protect messages.  They may also include parameters
 *  associated with a new session such as authenticated
 *  peer identity and a new SSL cipher suite.
 */
trait HandshakeCompletedListener extends EventListener {

    /** This method is invoked on registered objects
     *  when a SSL handshake is completed.
     */
    @stub
    def handshakeCompleted(event: HandshakeCompletedEvent): Unit = ???
}
