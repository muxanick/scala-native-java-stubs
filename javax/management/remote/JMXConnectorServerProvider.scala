package javax.management.remote

import java.lang.String
import java.util.Map
import javax.management.MBeanServer
import scala.scalanative.annotation.stub

/** A provider for creating JMX API connector servers using a given
 *  protocol.  Instances of this interface are created by JMXConnectorServerFactory as part of its newJMXConnectorServer method.
 */
trait JMXConnectorServerProvider {

    /** Creates a new connector server at the given address. */
    @stub
    def newJMXConnectorServer(serviceURL: JMXServiceURL, environment: Map[String, _], mbeanServer: MBeanServer): JMXConnectorServer = ???
}
