package javax.imageio.spi

import java.lang.Class

/** An optional interface that may be provided by service provider
 *  objects that will be registered with a
 *  ServiceRegistry.  If this interface is present,
 *  notification of registration and deregistration will be performed.
 */
trait RegisterableService {

    /** Called when an object implementing this interface is removed
     *  from the given category of the given
     *  registry.
     */
    @stub
    def onDeregistration(registry: ServiceRegistry, category: Class[_]): Unit = ???
}
