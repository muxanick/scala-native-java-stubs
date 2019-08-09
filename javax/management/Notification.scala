package javax.management

import java.lang.{Object, String}
import java.util.EventObject

// The Notification class represents a notification emitted by an
// MBean.  It contains a reference to the source MBean: if the
// notification has been forwarded through the MBean server, and the
// original source of the notification was a reference to the emitting
// MBean object, then the MBean server replaces it by the MBean's
// ObjectName.  If the listener has registered directly with the
// MBean, this is either the object name or a direct reference to the
// MBean.
//
// It is strongly recommended that notification senders use the
// object name rather than a reference to the MBean object as the
// source.
//
// The serialVersionUID of this class is -7516092053498031989L.
class Notification extends EventObject {

    @stub
    // Creates a Notification object.
    def this(type: String, source: Object, sequenceNumber: Long) = ???

    @stub
    // Creates a Notification object.
    def this(type: String, source: Object, sequenceNumber: Long, timeStamp: Long) = ???

    @stub
    // Creates a Notification object.
    def this(type: String, source: Object, sequenceNumber: Long, timeStamp: Long, message: String) = ???

    @stub
    // Get the notification message.
    def getMessage(): String = ???

    @stub
    // Get the notification sequence number.
    def getSequenceNumber(): Long = ???

    @stub
    // Get the notification timestamp.
    def getTimeStamp(): Long = ???

    @stub
    // Get the notification type.
    def getType(): String = ???

    @stub
    // Get the user data.
    def getUserData(): Object = ???

    @stub
    // Set the notification sequence number.
    def setSequenceNumber(sequenceNumber: Long): Unit = ???

    @stub
    // Sets the source.
    def setSource(source: Object): Unit = ???

    @stub
    // Set the notification timestamp.
    def setTimeStamp(timeStamp: Long): Unit = ???

    @stub
    // Set the user data.
    def setUserData(userData: Object): Unit = ???
}
