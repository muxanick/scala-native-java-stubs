package javax.management.remote

import scala.scalanative.annotation.stub

/** Implemented by objects that can have a JMXServiceURL address.
 *  All JMXConnectorServer objects implement this interface.
 *  Depending on the connector implementation, a JMXConnector
 *  object may implement this interface too.  JMXConnector
 *  objects for the RMI Connector are instances of
 *  RMIConnector which
 *  implements this interface.
 * 
 *  An object implementing this interface might not have an address
 *  at a given moment.  This is indicated by a null return value from
 *  getAddress().
 */
trait JMXAddressable {

    /** The address of this object. */
    @stub
    def getAddress(): JMXServiceURL = ???
}
