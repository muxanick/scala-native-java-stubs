package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, DescriptorAccess, MBeanFeatureInfo, MBeanNotificationInfo}

// The ModelMBeanNotificationInfo object describes a notification emitted
// by a ModelMBean.
// It is a subclass of MBeanNotificationInfo with the addition of an
// associated Descriptor and an implementation of the Descriptor interface.
//
// 
// The fields in the descriptor are defined, but not limited to, the following.
// Note that when the Type in this table is Number, a String that is the decimal
// representation of a Long can also be used.
//
// 
// NameTypeMeaning
// nameString
//     Notification name.
// descriptorTypeString
//     Must be "notification".
// severityNumber
//     0-6 where 0: unknown; 1: non-recoverable;
//         2: critical, failure; 3: major, severe;
//         4: minor, marginal, error; 5: warning;
//         6: normal, cleared, informative
// messageIDString
//     Unique key for message text (to allow translation, analysis).
// messageTextString
//     Text of notification.
// logString
//     T - log message, F - do not log message.
// logfileString
//     fully qualified file name appropriate for operating system.
// visibilityNumber
//     1-4 where 1: always visible 4: rarely visible.
// presentationStringString
//     XML formatted string to allow presentation of data.
// 
//
// The default descriptor contains the name, descriptorType,
// displayName and severity(=6) fields.  The default value of the name
// and displayName fields is the name of the Notification class (as
// specified by the name parameter of the
// ModelMBeanNotificationInfo constructor).
//
// The serialVersionUID of this class is -7445681389570207141L.
class ModelMBeanNotificationInfo extends MBeanNotificationInfo with DescriptorAccess {

    @stub
    // Constructs a new ModelMBeanNotificationInfo object from this
    // ModelMBeanNotfication Object.
    def this(inInfo: ModelMBeanNotificationInfo) = ???

    @stub
    // Constructs a ModelMBeanNotificationInfo object with a default
    // descriptor.
    def this(notifTypes: Array[String], name: String, description: String) = ???

    @stub
    // Creates and returns a new ModelMBeanNotificationInfo which is a
    // duplicate of this ModelMBeanNotificationInfo.
    def clone(): Object = ???

    @stub
    // Returns a copy of the associated Descriptor for the
    // ModelMBeanNotificationInfo.
    def getDescriptor(): Descriptor = ???

    @stub
    // Sets associated Descriptor (full replace) for the
    // ModelMBeanNotificationInfo If the new Descriptor is null,
    // then the associated Descriptor reverts to a default
    // descriptor.
    def setDescriptor(inDescriptor: Descriptor): Unit = ???
}
