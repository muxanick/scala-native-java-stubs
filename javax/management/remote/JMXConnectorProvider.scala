package javax.management.remote

import java.lang.String
import java.util.Map
import scala.scalanative.annotation.stub

/** A provider for creating JMX API connector clients using a given
 *  protocol.  Instances of this interface are created by JMXConnectorFactory as part of its newJMXConnector method.
 */
trait JMXConnectorProvider {

    /** Creates a new connector client that is ready to connect
     *  to the connector server at the given address.
     */
    @stub
    def newJMXConnector(serviceURL: JMXServiceURL, environment: Map[String, _]): JMXConnector = ???
}
