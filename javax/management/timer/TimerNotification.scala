package javax.management.timer

import java.lang.Object
import java.util.EventObject
import javax.management.Notification

// This class provides definitions of the notifications sent by timer MBeans.
// It defines a timer notification identifier which allows to retrieve a timer notification
// from the list of notifications of a timer MBean.
// 
// The timer notifications are created and handled by the timer MBean.
class TimerNotification extends Notification {
}
