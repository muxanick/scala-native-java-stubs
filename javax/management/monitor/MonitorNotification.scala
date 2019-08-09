package javax.management.monitor

import java.lang.{Object, String}
import java.util.EventObject
import javax.management.{Notification, ObjectName}

// Provides definitions of the notifications sent by monitor MBeans.
// 
// The notification source and a set of parameters concerning the monitor MBean's state
// need to be specified when creating a new object of this class.
//
// The list of notifications fired by the monitor MBeans is the following:
//
// 
// Common to all kind of monitors:
//     
//     The observed object is not registered in the MBean server.
//     The observed attribute is not contained in the observed object.
//     The type of the observed attribute is not correct.
//     Any exception (except the cases described above) occurs when trying to get the value of the observed attribute.
//     
// Common to the counter and the gauge monitors:
//     
//     The threshold high or threshold low are not of the same type as the gauge (gauge monitors).
//     The threshold or the offset or the modulus are not of the same type as the counter (counter monitors).
//     
// Counter monitors only:
//     
//     The observed attribute has reached the threshold value.
//     
// Gauge monitors only:
//     
//     The observed attribute has exceeded the threshold high value.
//     The observed attribute has exceeded the threshold low value.
//     
// String monitors only:
//     
//     The observed attribute has matched the "string to compare" value.
//     The observed attribute has differed from the "string to compare" value.
//     
// 
class MonitorNotification extends Notification {

    @stub
    // Gets the derived gauge of this monitor notification.
    def getDerivedGauge(): Object = ???

    @stub
    // Gets the observed attribute of this monitor notification.
    def getObservedAttribute(): String = ???

    @stub
    // Gets the observed object of this monitor notification.
    def getObservedObject(): ObjectName = ???
}

object MonitorNotification {
    @stub
    // Notification type denoting that the observed attribute is not contained in the observed object.
    def OBSERVED_ATTRIBUTE_ERROR: String = ???

    @stub
    // Notification type denoting that the type of the observed attribute is not correct.
    def OBSERVED_ATTRIBUTE_TYPE_ERROR: String = ???

    @stub
    // Notification type denoting that the observed object is not registered in the MBean server.
    def OBSERVED_OBJECT_ERROR: String = ???

    @stub
    // Notification type denoting that a non-predefined error type has occurred when trying to get the value of the observed attribute.
    def RUNTIME_ERROR: String = ???

    @stub
    // Notification type denoting that the observed attribute has differed from the "string to compare" value.
    def STRING_TO_COMPARE_VALUE_DIFFERED: String = ???

    @stub
    // Notification type denoting that the observed attribute has matched the "string to compare" value.
    def STRING_TO_COMPARE_VALUE_MATCHED: String = ???

    @stub
    // Notification type denoting that the type of the thresholds, offset or modulus is not correct.
    def THRESHOLD_ERROR: String = ???

    @stub
    // Notification type denoting that the observed attribute has exceeded the threshold high value.
    def THRESHOLD_HIGH_VALUE_EXCEEDED: String = ???

    @stub
    // Notification type denoting that the observed attribute has exceeded the threshold low value.
    def THRESHOLD_LOW_VALUE_EXCEEDED: String = ???
}
