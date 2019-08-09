package java.beans.beancontext

import scala.scalanative.annotation.stub

/** The listener interface for receiving
 *  BeanContextServiceAvailableEvent objects.
 *  A class that is interested in processing a
 *  BeanContextServiceAvailableEvent implements this interface.
 */
trait BeanContextServicesListener extends BeanContextServiceRevokedListener {

    /** The service named has been registered. */
    @stub
    def serviceAvailable(bcsae: BeanContextServiceAvailableEvent): Unit = ???
}
