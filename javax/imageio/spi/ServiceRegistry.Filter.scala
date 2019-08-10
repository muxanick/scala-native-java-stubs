package javax.imageio.spi

import java.lang.Object
import scala.scalanative.annotation.stub

/** A simple filter interface used by
 *  ServiceRegistry.getServiceProviders to select
 *  providers matching an arbitrary criterion.  Classes that
 *  implement this interface should be defined in order to make use
 *  of the getServiceProviders method of
 *  ServiceRegistry that takes a Filter.
 */
trait ServiceRegistry_Filter {

    /** Returns true if the given
     *  provider object matches the criterion defined
     *  by this Filter.
     */
    @stub
    def filter(provider: Any): Boolean = ???
}
