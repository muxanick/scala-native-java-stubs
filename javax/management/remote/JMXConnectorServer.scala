package javax.management.remote

import java.lang.{Boolean, Object, String}
import javax.management.{MBeanNotificationInfo, MBeanRegistration, MBeanServer, NotificationBroadcasterSupport, ObjectName}

/** Superclass of every connector server.  A connector server is
 *  attached to an MBean server.  It listens for client connection
 *  requests and creates a connection for each one.
 * 
 *  A connector server is associated with an MBean server either by
 *  registering it in that MBean server, or by passing the MBean server
 *  to its constructor.
 * 
 *  A connector server is inactive when created.  It only starts
 *  listening for client connections when the start
 *  method is called.  A connector server stops listening for client
 *  connections when the stop method is called or when
 *  the connector server is unregistered from its MBean server.
 * 
 *  Stopping a connector server does not unregister it from its
 *  MBean server.  A connector server once stopped cannot be
 *  restarted.
 * 
 *  Each time a client connection is made or broken, a notification
 *  of class JMXConnectionNotification is emitted.
 */
abstract class JMXConnectorServer extends NotificationBroadcasterSupport with JMXConnectorServerMBean with MBeanRegistration with JMXAddressable {

    /** Constructs a connector server that will be registered as an
     *  MBean in the MBean server it is attached to.
     */
    @stub
    def this() = ???

    /** Called by a subclass when a client connection is closed
     *  normally.
     */
    protected def connectionClosed(connectionId: String, message: String, userData: Object): Unit

    /** Called by a subclass when a client connection fails. */
    protected def connectionFailed(connectionId: String, message: String, userData: Object): Unit

    /** Called by a subclass when a new client connection is opened. */
    protected def connectionOpened(connectionId: String, message: String, userData: Object): Unit

    /** The list of IDs for currently-open connections to this
     *  connector server.
     */
    def getConnectionIds(): Array[String]

    /** Returns the MBean server that this connector server is
     *  attached to.
     */
    def getMBeanServer(): MBeanServer

    /** Returns an array indicating the notifications that this MBean
     *  sends.
     */
    def getNotificationInfo(): Array[MBeanNotificationInfo]

    /** Allows the MBean to perform any operations needed after having been
     *  unregistered in the MBean server.
     */
    def postDeregister(): Unit

    /** Allows the MBean to perform any operations needed after having been
     *  registered in the MBean server or after the registration has failed.
     */
    def postRegister(registrationDone: Boolean): Unit

    /** Called by an MBean server when this connector server is
     *  unregistered from that MBean server.
     */
    def preDeregister(): Unit

    /** Called by an MBean server when this connector server is
     *  registered in that MBean server.
     */
    def preRegister(mbs: MBeanServer, name: ObjectName): ObjectName

    /** Inserts an object that intercepts requests for the MBean server
     *  that arrive through this connector server.
     */
    def setMBeanServerForwarder(mbsf: MBeanServerForwarder): Unit
}
