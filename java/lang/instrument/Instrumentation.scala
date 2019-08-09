package java.lang.instrument

import java.lang.{Class, ClassLoader, Object}
import java.util.jar.JarFile

// This class provides services needed to instrument Java
// programming language code.
// Instrumentation is the addition of byte-codes to methods for the
// purpose of gathering data to be utilized by tools.
// Since the changes are purely additive, these tools do not modify
// application state or behavior.
// Examples of such benign tools include monitoring agents, profilers,
// coverage analyzers, and event loggers.
//
// 
// There are two ways to obtain an instance of the
// Instrumentation interface:
//
// 
//    When a JVM is launched in a way that indicates an agent
//     class. In that case an Instrumentation instance
//     is passed to the premain method of the agent class.
//     
//    When a JVM provides a mechanism to start agents sometime
//     after the JVM is launched. In that case an Instrumentation
//     instance is passed to the agentmain method of the
//     agent code.  
// 
// 
// These mechanisms are described in the
// package specification.
// 
// Once an agent acquires an Instrumentation instance,
// the agent may call methods on the instance at any time.
trait Instrumentation {

    @stub
    // Registers the supplied transformer.
    def addTransformer(transformer: ClassFileTransformer): Unit = ???

    @stub
    // Registers the supplied transformer.
    def addTransformer(transformer: ClassFileTransformer, canRetransform: Boolean): Unit = ???

    @stub
    // Specifies a JAR file with instrumentation classes to be defined by the
    // bootstrap class loader.
    def appendToBootstrapClassLoaderSearch(jarfile: JarFile): Unit = ???

    @stub
    // Specifies a JAR file with instrumentation classes to be defined by the
    // system class loader.
    def appendToSystemClassLoaderSearch(jarfile: JarFile): Unit = ???

    @stub
    // Returns an array of all classes currently loaded by the JVM.
    def getAllLoadedClasses(): Array[Class] = ???

    @stub
    // Returns an array of all classes for which loader is an initiating loader.
    def getInitiatedClasses(loader: ClassLoader): Array[Class] = ???

    @stub
    // Returns an implementation-specific approximation of the amount of storage consumed by
    // the specified object.
    def getObjectSize(objectToSize: Object): Long = ???

    @stub
    // Determines whether a class is modifiable by
    // retransformation
    // or redefinition.
    def isModifiableClass(theClass: Class[_]): Boolean = ???

    @stub
    // Returns whether the current JVM configuration supports
    // setting a native method prefix.
    def isNativeMethodPrefixSupported(): Boolean = ???

    @stub
    // Returns whether or not the current JVM configuration supports redefinition
    // of classes.
    def isRedefineClassesSupported(): Boolean = ???

    @stub
    // Returns whether or not the current JVM configuration supports retransformation
    // of classes.
    def isRetransformClassesSupported(): Boolean = ???

    @stub
    // Redefine the supplied set of classes using the supplied class files.
    def redefineClasses(definitions: ClassDefinition*): Unit = ???

    @stub
    // Unregisters the supplied transformer.
    def removeTransformer(transformer: ClassFileTransformer): Boolean = ???

    @stub
    // Retransform the supplied set of classes.
    def retransformClasses(classes: Class[_]*): Unit = ???
}
