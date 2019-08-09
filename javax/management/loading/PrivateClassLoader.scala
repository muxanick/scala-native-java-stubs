package javax.management.loading

import scala.scalanative.annotation.stub

/** Marker interface indicating that a ClassLoader should not be added
 *  to the ClassLoaderRepository.  When a ClassLoader is
 *  registered as an MBean in the MBean server, it is added to the
 *  MBean server's ClassLoaderRepository unless it implements this
 *  interface.
 */
trait PrivateClassLoader {
}
