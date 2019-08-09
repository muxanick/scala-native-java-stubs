package javax.naming.ldap

import javax.naming.event.NamingListener

/** This interface is for handling UnsolicitedNotificationEvent.
 *  "Unsolicited notification" is defined in
 *  RFC 2251.
 *  It allows the server to send unsolicited notifications to the client.
 *  A UnsolicitedNotificationListener must:
 * 
 *  Implement this interface and its method
 *  Implement NamingListener.namingExceptionThrown() so
 *  that it will be notified of exceptions thrown while attempting to
 *  collect unsolicited notification events.
 *  Register with the context using one of the addNamingListener()
 *  methods from EventContext or EventDirContext.
 *  Only the NamingListener argument of these methods are applicable;
 *  the rest are ignored for a UnsolicitedNotificationListener.
 *  (These arguments might be applicable to the listener if it implements
 *  other listener interfaces).
 * 
 */
trait UnsolicitedNotificationListener extends NamingListener {
}
