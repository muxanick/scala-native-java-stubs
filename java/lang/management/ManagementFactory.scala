package java.lang.management

import java.lang.{Class, Object, String}
import java.util.{List, Set}
import javax.management.{MBeanServer, MBeanServerConnection}

// The ManagementFactory class is a factory class for getting
// managed beans for the Java platform.
// This class consists of static methods each of which returns
// one or more platform MXBeans representing
// the management interface of a component of the Java virtual
// machine.
//
// Platform MXBeans
// 
// A platform MXBean is a managed bean that
// conforms to the JMX
// Instrumentation Specification and only uses a set of basic data types.
// A JMX management application and the platform MBeanServer
// can interoperate without requiring classes for MXBean specific
// data types.
// The data types being transmitted between the JMX connector
// server and the connector client are
// open types
// and this allows interoperation across versions.
// See 
// the specification of MXBeans for details.
//
// 
// Each platform MXBean is a PlatformManagedObject
// and it has a unique
// ObjectName for
// registration in the platform MBeanServer as returned by
// by the getObjectName
// method.
//
// 
// An application can access a platform MXBean in the following ways:
// 1. Direct access to an MXBean interface
// 
// 
//     Get an MXBean instance by calling the
//         getPlatformMXBean or
//         getPlatformMXBeans method
//         and access the MXBean locally in the running
//         virtual machine.
//         
//     Construct an MXBean proxy instance that forwards the
//         method calls to a given MBeanServer by calling
//         the getPlatformMXBean(MBeanServerConnection, Class) or
//         getPlatformMXBeans(MBeanServerConnection, Class) method.
//         The newPlatformMXBeanProxy method
//         can also be used to construct an MXBean proxy instance of
//         a given ObjectName.
//         A proxy is typically constructed to remotely access
//         an MXBean of another running virtual machine.
//         
// 
// 2. Indirect access to an MXBean interface via MBeanServer
// 
//     Go through the platform MBeanServer to access MXBeans
//         locally or a specific MBeanServerConnection to access
//         MXBeans remotely.
//         The attributes and operations of an MXBean use only
//         JMX open types which include basic data types,
//         CompositeData,
//         and TabularData
//         defined in
//         OpenType.
//         The mapping is specified in
//         the MXBean specification
//         for details.
//        
// 
// 
//
// 
// The getPlatformManagementInterfaces
// method returns all management interfaces supported in the Java virtual machine
// including the standard management interfaces listed in the tables
// below as well as the management interfaces extended by the JDK implementation.
// 
// A Java virtual machine has a single instance of the following management
// interfaces:
//
// 
// 
// 
// Management Interface
// ObjectName
// 
// 
//  ClassLoadingMXBean 
//  java.lang:type=ClassLoading
// 
// 
//  MemoryMXBean 
//  java.lang:type=Memory
// 
// 
//  ThreadMXBean 
//  java.lang:type=Threading
// 
// 
//  RuntimeMXBean 
//  java.lang:type=Runtime
// 
// 
//  OperatingSystemMXBean 
//  java.lang:type=OperatingSystem
// 
// 
//  PlatformLoggingMXBean 
//  java.util.logging:type=Logging
// 
// 
// 
//
// 
// A Java virtual machine has zero or a single instance of
// the following management interfaces.
//
// 
// 
// 
// Management Interface
// ObjectName
// 
// 
//  CompilationMXBean 
//  java.lang:type=Compilation
// 
// 
// 
//
// 
// A Java virtual machine may have one or more instances of the following
// management interfaces.
// 
// 
// 
// Management Interface
// ObjectName
// 
// 
//  GarbageCollectorMXBean 
//  java.lang:type=GarbageCollector,name=collector's name
// 
// 
//  MemoryManagerMXBean 
//  java.lang:type=MemoryManager,name=manager's name
// 
// 
//  MemoryPoolMXBean 
//  java.lang:type=MemoryPool,name=pool's name
// 
// 
//  BufferPoolMXBean 
//  java.nio:type=BufferPool,name=pool name
// 
// 
// 
class ManagementFactory extends Object {
}

object ManagementFactory {
    @stub
    // String representation of the
    // ObjectName for the ClassLoadingMXBean.
    def CLASS_LOADING_MXBEAN_NAME: String = ???

    @stub
    // String representation of the
    // ObjectName for the CompilationMXBean.
    def COMPILATION_MXBEAN_NAME: String = ???

    @stub
    // The domain name and the type key property in
    // the ObjectName for a GarbageCollectorMXBean.
    def GARBAGE_COLLECTOR_MXBEAN_DOMAIN_TYPE: String = ???

    @stub
    // The domain name and the type key property in
    // the ObjectName for a MemoryManagerMXBean.
    def MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE: String = ???

    @stub
    // String representation of the
    // ObjectName for the MemoryMXBean.
    def MEMORY_MXBEAN_NAME: String = ???

    @stub
    // The domain name and the type key property in
    // the ObjectName for a MemoryPoolMXBean.
    def MEMORY_POOL_MXBEAN_DOMAIN_TYPE: String = ???

    @stub
    // String representation of the
    // ObjectName for the OperatingSystemMXBean.
    def OPERATING_SYSTEM_MXBEAN_NAME: String = ???

    @stub
    // String representation of the
    // ObjectName for the RuntimeMXBean.
    def RUNTIME_MXBEAN_NAME: String = ???

    @stub
    // Returns the managed bean for the class loading system of
    // the Java virtual machine.
    def getClassLoadingMXBean(): ClassLoadingMXBean = ???

    @stub
    // Returns the managed bean for the compilation system of
    // the Java virtual machine.
    def getCompilationMXBean(): CompilationMXBean = ???

    @stub
    // Returns a list of GarbageCollectorMXBean objects
    // in the Java virtual machine.
    def getGarbageCollectorMXBeans(): List[GarbageCollectorMXBean] = ???

    @stub
    // Returns a list of MemoryManagerMXBean objects
    // in the Java virtual machine.
    def getMemoryManagerMXBeans(): List[MemoryManagerMXBean] = ???

    @stub
    // Returns the managed bean for the memory system of
    // the Java virtual machine.
    def getMemoryMXBean(): MemoryMXBean = ???

    @stub
    // Returns a list of MemoryPoolMXBean objects in the
    // Java virtual machine.
    def getMemoryPoolMXBeans(): List[MemoryPoolMXBean] = ???

    @stub
    // Returns the managed bean for the operating system on which
    // the Java virtual machine is running.
    def getOperatingSystemMXBean(): OperatingSystemMXBean = ???

    @stub
    // Returns the set of Class objects, subinterface of
    // PlatformManagedObject, representing
    // all management interfaces for
    // monitoring and managing the Java platform.
    def getPlatformManagementInterfaces(): Set[Class[_ <: PlatformManagedObject]] = ???

    @stub
    // Returns the platform MBeanServer.
    def getPlatformMBeanServer(): MBeanServer = ???

    @stub
    // Returns the platform MXBean implementing
    // the given mxbeanInterface which is specified
    // to have one single instance in the Java virtual machine.
    def T: [T <: PlatformManagedObject] = ???

    @stub
    // Returns the platform MXBean proxy for
    // mxbeanInterface which is specified to have one single
    // instance in a Java virtual machine and the proxy will
    // forward the method calls through the given MBeanServerConnection.
    def T: [T <: PlatformManagedObject] = ???

    @stub
    // Returns the list of platform MXBeans implementing
    // the given mxbeanInterface in the Java
    // virtual machine.
    def List[T]: [T <: PlatformManagedObject] = ???

    @stub
    // Returns the list of the platform MXBean proxies for
    // forwarding the method calls of the mxbeanInterface
    // through the given MBeanServerConnection.
    def List[T]: [T <: PlatformManagedObject] = ???

    @stub
    // Returns the managed bean for the runtime system of
    // the Java virtual machine.
    def getRuntimeMXBean(): RuntimeMXBean = ???

    @stub
    // Returns the managed bean for the thread system of
    // the Java virtual machine.
    def getThreadMXBean(): ThreadMXBean = ???
}
