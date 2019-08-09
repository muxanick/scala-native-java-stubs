package javax.management

import java.io.Serializable
import java.lang.{Cloneable, Object, String}

// Describes the management interface exposed by an MBean; that is,
// the set of attributes and operations which are available for
// management operations.  Instances of this class are immutable.
// Subclasses may be mutable but this is not recommended.
//
// Usually the MBeanInfo for any given MBean does
// not change over the lifetime of that MBean.  Dynamic MBeans can change their
// MBeanInfo and in that case it is recommended that they emit a Notification with a type of "jmx.mbean.info.changed" and a userData that is the new MBeanInfo.  This is not required, but
// provides a conventional way for clients of the MBean to discover the change.
// See also the immutableInfo and
// infoTimeout fields in the MBeanInfo Descriptor.
//
// The contents of the MBeanInfo for a Dynamic MBean
// are determined by its getMBeanInfo() method.  This includes Open MBeans and Model
// MBeans, which are kinds of Dynamic MBeans.
//
// The contents of the MBeanInfo for a Standard MBean
// are determined by the MBean server as follows:
//
// 
//
// getClassName() returns the Java class name of the MBean
// object;
//
// getConstructors() returns the list of all public
// constructors in that object;
//
// getAttributes() returns the list of all attributes
// whose existence is deduced from the presence in the MBean interface
// of a getName, isName, or
// setName method that conforms to the conventions
// for Standard MBeans;
//
// getOperations() returns the list of all methods in
// the MBean interface that do not represent attributes;
//
// getNotifications() returns an empty array if the MBean
// does not implement the NotificationBroadcaster interface,
// otherwise the result of calling NotificationBroadcaster.getNotificationInfo() on it;
//
// getDescriptor() returns a descriptor containing the contents
// of any descriptor annotations in the MBean interface (see
// @DescriptorKey).
//
// 
//
// The description returned by getDescription() and the
// descriptions of the contained attributes and operations are not specified.
//
// The remaining details of the MBeanInfo for a
// Standard MBean are not specified.  This includes the description of
// any contained constructors, and notifications; the names
// of parameters to constructors and operations; and the descriptions of
// constructor parameters.
class MBeanInfo extends Object with Cloneable, with Serializable, with DescriptorRead {

    @stub
    // Constructs an MBeanInfo.
    def this(className: String, description: String, attributes: Array[MBeanAttributeInfo], constructors: Array[MBeanConstructorInfo], operations: Array[MBeanOperationInfo], notifications: Array[MBeanNotificationInfo]) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the list of attributes exposed for management.
    def getAttributes(): Array[MBeanAttributeInfo] = ???

    @stub
    // Returns the name of the Java class of the MBean described by
    // this MBeanInfo.
    def getClassName(): String = ???

    @stub
    // Returns the list of the public constructors of the MBean.
    def getConstructors(): Array[MBeanConstructorInfo] = ???

    @stub
    // Returns a human readable description of the MBean.
    def getDescription(): String = ???

    @stub
    // Get the descriptor of this MBeanInfo.
    def getDescriptor(): Descriptor = ???

    @stub
    // Returns the list of the notifications emitted by the MBean.
    def getNotifications(): Array[MBeanNotificationInfo] = ???

    @stub
    // Returns the list of operations  of the MBean.
    def getOperations(): Array[MBeanOperationInfo] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
