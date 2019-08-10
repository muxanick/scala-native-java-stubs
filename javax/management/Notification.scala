package javax.management

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The Notification class represents a notification emitted by an
 *  MBean.  It contains a reference to the source MBean: if the
 *  notification has been forwarded through the MBean server, and the
 *  original source of the notification was a reference to the emitting
 *  MBean object, then the MBean server replaces it by the MBean's
 *  ObjectName.  If the listener has registered directly with the
 *  MBean, this is either the object name or a direct reference to the
 *  MBean.
 * 
 *  It is strongly recommended that notification senders use the
 *  object name rather than a reference to the MBean object as the
 *  source.
 * 
 *  The serialVersionUID of this class is -7516092053498031989L.
 */
class Notification extends EventObject {

    /** Creates a Notification object. */
    @stub
    def this(type: String, source: Any, sequenceNumber: Long) = ???

    /** Creates a Notification object. */
    @stub
    def this(type: String, source: Any, sequenceNumber: Long, timeStamp: Long) = ???

    /** Creates a Notification object. */
    @stub
    def this(type: String, source: Any, sequenceNumber: Long, timeStamp: Long, message: String) = ???

    /** Creates a Notification object. */
    @stub
    def this(type: String, source: Any, sequenceNumber: Long, message: String) = ???

    /** This field hides the EventObject.source field in the
     *  parent class to make it non-transient and therefore part of the
     *  serialized form.
     */
    @stub
    protected val source: Any = ???

    /** Get the notification message. */
    @stub
    def getMessage(): String = ???

    /** Get the notification sequence number. */
    @stub
    def getSequenceNumber(): Long = ???

    /** Get the notification timestamp. */
    @stub
    def getTimeStamp(): Long = ???

    /** Get the notification type. */
    @stub
    def getType(): String = ???

    /** Get the user data. */
    @stub
    def getUserData(): Any = ???

    /** Set the notification sequence number. */
    @stub
    def setSequenceNumber(sequenceNumber: Long): Unit = ???

    /** Sets the source. */
    @stub
    def setSource(source: Any): Unit = ???

    /** Set the notification timestamp. */
    @stub
    def setTimeStamp(timeStamp: Long): Unit = ???

    /** Set the user data. */
    @stub
    def setUserData(userData: Any): Unit = ???

    /** Returns a String representation of this notification. */
    @stub
    def toString(): String = ???
}
