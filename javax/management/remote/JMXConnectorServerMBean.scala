package javax.management.remote

import java.lang.String
import java.util.Map

// MBean interface for connector servers.  A JMX API connector server
// is attached to an MBean server, and establishes connections to that
// MBean server for remote clients.
//
// A newly-created connector server is inactive, and does
// not yet listen for connections.  Only when its start
// method has been called does it start listening for connections.
trait JMXConnectorServerMBean {

    @stub
    // The address of this connector server.
    def getAddress(): JMXServiceURL = ???

    @stub
    // The attributes for this connector server.
    def getAttributes(): Map[String, _] = ???

    @stub
    // The list of IDs for currently-open connections to this
    // connector server.
    def getConnectionIds(): Array[String] = ???

    @stub
    // Determines whether the connector server is active.
    def isActive(): Boolean = ???

    @stub
    // Inserts an object that intercepts requests for the MBean server
    // that arrive through this connector server.
    def setMBeanServerForwarder(mbsf: MBeanServerForwarder): Unit = ???

    @stub
    // Activates the connector server, that is, starts listening for
    // client connections.
    def start(): Unit = ???

    @stub
    // Deactivates the connector server, that is, stops listening for
    // client connections.
    def stop(): Unit = ???
}
