package java.lang.management

// A platform managed object is a JMX MXBean
// for monitoring and managing a component in the Java platform.
// Each platform managed object has a unique
// object name
// for the platform MBeanServer access.
// All platform MXBeans will implement this interface.
//
// 
// Note:
// The platform MXBean interfaces (i.e. all subinterfaces
// of PlatformManagedObject) are implemented
// by the Java platform only.  New methods may be added in these interfaces
// in future Java SE releases.
// In addition, this PlatformManagedObject interface is only
// intended for the management interfaces for the platform to extend but
// not for applications.
trait PlatformManagedObject {
}
