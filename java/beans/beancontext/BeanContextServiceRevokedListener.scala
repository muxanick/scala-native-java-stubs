package java.beans.beancontext

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving
 *  BeanContextServiceRevokedEvent objects. A class that is
 *  interested in processing a BeanContextServiceRevokedEvent
 *  implements this interface.
 */
trait BeanContextServiceRevokedListener extends EventListener {

    /** The service named has been revoked. */
    @stub
    def serviceRevoked(bcsre: BeanContextServiceRevokedEvent): Unit = ???
}
