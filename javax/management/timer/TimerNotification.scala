package javax.management.timer

import java.lang.{Integer, Object, String}
import java.util.EventObject
import javax.management.Notification
import scala.scalanative.annotation.stub

/** This class provides definitions of the notifications sent by timer MBeans.
 *  It defines a timer notification identifier which allows to retrieve a timer notification
 *  from the list of notifications of a timer MBean.
 *  
 *  The timer notifications are created and handled by the timer MBean.
 */
class TimerNotification extends Notification {

    /** Creates a timer notification object. */
    @stub
    def this(type: String, source: Object, sequenceNumber: Long, timeStamp: Long, msg: String, id: Integer) = ???

    /** Gets the identifier of this timer notification. */
    @stub
    def getNotificationID(): Integer = ???
}
