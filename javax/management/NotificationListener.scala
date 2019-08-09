package javax.management

import java.lang.Object
import java.util.EventListener
import scala.scalanative.annotation.stub

/** Should be implemented by an object that wants to receive notifications. */
trait NotificationListener extends EventListener {

    /** Invoked when a JMX notification occurs. */
    @stub
    def handleNotification(notification: Notification, handback: Object): Unit = ???
}
