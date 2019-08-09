package javax.management

import java.lang.{Cloneable, Object, String}

// The MBeanNotificationInfo class is used to describe the
// characteristics of the different notification instances
// emitted by an MBean, for a given Java class of notification.
// If an MBean emits notifications that can be instances of different Java classes,
// then the metadata for that MBean should provide an MBeanNotificationInfo
// object for each of these notification Java classes.
//
// Instances of this class are immutable.  Subclasses may be
// mutable but this is not recommended.
//
// This class extends javax.management.MBeanFeatureInfo
// and thus provides name and description fields.
// The name field should be the fully qualified Java class name of
// the notification objects described by this class.
//
// The getNotifTypes method returns an array of
// strings containing the notification types that the MBean may
// emit. The notification type is a dot-notation string which
// describes what the emitted notification is about, not the Java
// class of the notification.  A single generic notification class can
// be used to send notifications of several types.  All of these types
// are returned in the string array result of the
// getNotifTypes method.
class MBeanNotificationInfo extends MBeanFeatureInfo with Cloneable {

    @stub
    // Constructs an MBeanNotificationInfo object.
    def this(notifTypes: Array[String], name: String, description: String) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanNotificationInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the array of strings (in dot notation) containing the
    // notification types that the MBean may emit.
    def getNotifTypes(): Array[String] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
