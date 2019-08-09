package javax.management.remote

import java.lang.String
import java.util.Map
import scala.scalanative.annotation.stub

/** MBean interface for connector servers.  A JMX API connector server
 *  is attached to an MBean server, and establishes connections to that
 *  MBean server for remote clients.
 * 
 *  A newly-created connector server is inactive, and does
 *  not yet listen for connections.  Only when its start
 *  method has been called does it start listening for connections.
 */
trait JMXConnectorServerMBean {

    /** The address of this connector server. */
    @stub
    def getAddress(): JMXServiceURL = ???

    /** The attributes for this connector server. */
    @stub
    def getAttributes(): Map[String, _] = ???

    /** The list of IDs for currently-open connections to this
     *  connector server.
     */
    @stub
    def getConnectionIds(): Array[String] = ???

    /** Determines whether the connector server is active. */
    @stub
    def isActive(): Boolean = ???

    /** Inserts an object that intercepts requests for the MBean server
     *  that arrive through this connector server.
     */
    @stub
    def setMBeanServerForwarder(mbsf: MBeanServerForwarder): Unit = ???

    /** Activates the connector server, that is, starts listening for
     *  client connections.
     */
    @stub
    def start(): Unit = ???

    /** Deactivates the connector server, that is, stops listening for
     *  client connections.
     */
    @stub
    def stop(): Unit = ???

    /** Returns a client stub for this connector server. */
    @stub
    def toJMXConnector(env: Map[String, _]): JMXConnector = ???
}
