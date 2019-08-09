package java.lang

import java.io.FileDescriptor
import java.net.InetAddress
import java.security.Permission

// The security manager is a class that allows
// applications to implement a security policy. It allows an
// application to determine, before performing a possibly unsafe or
// sensitive operation, what the operation is and whether
// it is being attempted in a security context that allows the
// operation to be performed. The
// application can allow or disallow the operation.
// 
// The SecurityManager class contains many methods with
// names that begin with the word check. These methods
// are called by various methods in the Java libraries before those
// methods perform certain potentially sensitive operations. The
// invocation of such a check method typically looks like this:
// 
//     SecurityManager security = System.getSecurityManager();
//     if (security != null) {
//         security.checkXXX(argument,  . . . );
//     }
// 
// 
// The security manager is thereby given an opportunity to prevent
// completion of the operation by throwing an exception. A security
// manager routine simply returns if the operation is permitted, but
// throws a SecurityException if the operation is not
// permitted. The only exception to this convention is
// checkTopLevelWindow, which returns a
// boolean value.
// 
// The current security manager is set by the
// setSecurityManager method in class
// System. The current security manager is obtained
// by the getSecurityManager method.
// 
// The special method
// checkPermission(java.security.Permission)
// determines whether an access request indicated by a specified
// permission should be granted or denied. The
// default implementation calls
//
// 
//   AccessController.checkPermission(perm);
// 
//
// 
// If a requested access is allowed,
// checkPermission returns quietly. If denied, a
// SecurityException is thrown.
// 
// As of Java 2 SDK v1.2, the default implementation of each of the other
// check methods in SecurityManager is to
// call the SecurityManager checkPermission method
// to determine if the calling thread has permission to perform the requested
// operation.
// 
// Note that the checkPermission method with
// just a single permission argument always performs security checks
// within the context of the currently executing thread.
// Sometimes a security check that should be made within a given context
// will actually need to be done from within a
// different context (for example, from within a worker thread).
// The getSecurityContext method
// and the checkPermission
// method that includes a context argument are provided
// for this situation. The
// getSecurityContext method returns a "snapshot"
// of the current calling context. (The default implementation
// returns an AccessControlContext object.) A sample call is
// the following:
//
// 
//   Object context = null;
//   SecurityManager sm = System.getSecurityManager();
//   if (sm != null) context = sm.getSecurityContext();
// 
//
// 
// The checkPermission method
// that takes a context object in addition to a permission
// makes access decisions based on that context,
// rather than on that of the current execution thread.
// Code within a different context can thus call that method,
// passing the permission and the
// previously-saved context object. A sample call, using the
// SecurityManager sm obtained as in the previous example,
// is the following:
//
// 
//   if (sm != null) sm.checkPermission(permission, context);
// 
//
// Permissions fall into these categories: File, Socket, Net,
// Security, Runtime, Property, AWT, Reflect, and Serializable.
// The classes managing these various
// permission categories are java.io.FilePermission,
// java.net.SocketPermission,
// java.net.NetPermission,
// java.security.SecurityPermission,
// java.lang.RuntimePermission,
// java.util.PropertyPermission,
// java.awt.AWTPermission,
// java.lang.reflect.ReflectPermission, and
// java.io.SerializablePermission.
//
// All but the first two (FilePermission and SocketPermission) are
// subclasses of java.security.BasicPermission, which itself
// is an abstract subclass of the
// top-level class for permissions, which is
// java.security.Permission. BasicPermission defines the
// functionality needed for all permissions that contain a name
// that follows the hierarchical property naming convention
// (for example, "exitVM", "setFactory", "queuePrintJob", etc).
// An asterisk
// may appear at the end of the name, following a ".", or by itself, to
// signify a wildcard match. For example: "a.*" or "*" is valid,
// "*a" or "a*b" is not valid.
//
// FilePermission and SocketPermission are subclasses of the
// top-level class for permissions
// (java.security.Permission). Classes like these
// that have a more complicated name syntax than that used by
// BasicPermission subclass directly from Permission rather than from
// BasicPermission. For example,
// for a java.io.FilePermission object, the permission name is
// the path name of a file (or directory).
//
// Some of the permission classes have an "actions" list that tells
// the actions that are permitted for the object.  For example,
// for a java.io.FilePermission object, the actions list
// (such as "read, write") specifies which actions are granted for the
// specified file (or for files in the specified directory).
//
// Other permission classes are for "named" permissions -
// ones that contain a name but no actions list; you either have the
// named permission or you don't.
//
// Note: There is also a java.security.AllPermission
// permission that implies all permissions. It exists to simplify the work
// of system administrators who might need to perform multiple
// tasks that require all (or numerous) permissions.
// 
// See 
// Permissions in the JDK for permission-related information.
// This document includes, for example, a table listing the various SecurityManager
// check methods and the permission(s) the default
// implementation of each such method requires.
// It also contains a table of all the version 1.2 methods
// that require permissions, and for each such method tells
// which permission it requires.
// 
// For more information about SecurityManager changes made in
// the JDK and advice regarding porting of 1.1-style security managers,
// see the security documentation.
class SecurityManager extends Object {

    @stub
    // Throws a SecurityException if the
    // calling thread is not permitted to accept a socket connection from
    // the specified host and port number.
    def checkAccept(host: String, port: Int): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to modify the thread argument.
    def checkAccess(t: Thread): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to modify the thread group argument.
    def checkAccess(g: ThreadGroup): Unit = ???

    @stub
    // Deprecated. 
    //The dependency on AWTPermission creates an
    //             impediment to future modularization of the Java platform.
    //             Users of this method should instead invoke
    //             checkPermission(java.security.Permission) directly.
    //             This method will be changed in a future release to check
    //             the permission java.security.AllPermission.
    //
    def checkAwtEventQueueAccess(): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to open a socket connection to the
    // specified host and port number.
    def checkConnect(host: String, port: Int): Unit = ???

    @stub
    // Throws a SecurityException if the
    // specified security context is not allowed to open a socket
    // connection to the specified host and port number.
    def checkConnect(host: String, port: Int, context: Object): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to create a new class loader.
    def checkCreateClassLoader(): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to delete the specified file.
    def checkDelete(file: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to create a subprocess.
    def checkExec(cmd: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to cause the Java Virtual Machine to
    // halt with the specified status code.
    def checkExit(status: Int): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to dynamic link the library code
    // specified by the string argument file.
    def checkLink(lib: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to wait for a connection request on
    // the specified local port number.
    def checkListen(port: Int): Unit = ???

    @stub
    // Deprecated. 
    //This method relies on the caller being at a stack depth
    //             of 4 which is error-prone and cannot be enforced by the runtime.
    //             Users of this method should instead invoke checkPermission(java.security.Permission)
    //             directly.  This method will be changed in a future release
    //             to check the permission java.security.AllPermission.
    //
    def checkMemberAccess(clazz: Class[_], which: Int): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to use
    // (join/leave/send/receive) IP multicast.
    def checkMulticast(maddr: InetAddress): Unit = ???

    @stub
    // Deprecated. 
    //Use #checkPermission(java.security.Permission) instead
    //
    def checkMulticast(maddr: InetAddress, ttl: Byte): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to access the package specified by
    // the argument.
    def checkPackageAccess(pkg: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to define classes in the package
    // specified by the argument.
    def checkPackageDefinition(pkg: String): Unit = ???

    @stub
    // Throws a SecurityException if the requested
    // access, specified by the given permission, is not permitted based
    // on the security policy currently in effect.
    def checkPermission(perm: Permission): Unit = ???

    @stub
    // Throws a SecurityException if the
    // specified security context is denied access to the resource
    // specified by the given permission.
    def checkPermission(perm: Permission, context: Object): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to initiate a print job request.
    def checkPrintJobAccess(): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to access or modify the system
    // properties.
    def checkPropertiesAccess(): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to access the system property with
    // the specified key name.
    def checkPropertyAccess(key: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to read from the specified file
    // descriptor.
    def checkRead(fd: FileDescriptor): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to read the file specified by the
    // string argument.
    def checkRead(file: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // specified security context is not allowed to read the file
    // specified by the string argument.
    def checkRead(file: String, context: Object): Unit = ???

    @stub
    // Determines whether the permission with the specified permission target
    // name should be granted or denied.
    def checkSecurityAccess(target: String): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to set the socket factory used by
    // ServerSocket or Socket, or the stream
    // handler factory used by URL.
    def checkSetFactory(): Unit = ???

    @stub
    // Deprecated. 
    //The dependency on AWTPermission creates an
    //             impediment to future modularization of the Java platform.
    //             Users of this method should instead invoke
    //             checkPermission(java.security.Permission) directly.
    //             This method will be changed in a future release to check
    //             the permission java.security.AllPermission.
    //
    def checkSystemClipboardAccess(): Unit = ???

    @stub
    // Deprecated. 
    //The dependency on AWTPermission creates an
    //             impediment to future modularization of the Java platform.
    //             Users of this method should instead invoke
    //             checkPermission(java.security.Permission) directly.
    //             This method will be changed in a future release to check
    //             the permission java.security.AllPermission.
    //
    def checkTopLevelWindow(window: Object): Boolean = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to write to the specified file
    // descriptor.
    def checkWrite(fd: FileDescriptor): Unit = ???

    @stub
    // Throws a SecurityException if the
    // calling thread is not allowed to write to the file specified by
    // the string argument.
    def checkWrite(file: String): Unit = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    protected def classDepth(name: String): Int = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    protected def classLoaderDepth(): Int = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    protected def currentClassLoader(): ClassLoader = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    protected def currentLoadedClass(): Class[_] = ???

    @stub
    // Returns the current execution stack as an array of classes.
    protected def getClassContext(): Array[Class] = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    def getInCheck(): Boolean = ???

    @stub
    // Creates an object that encapsulates the current execution
    // environment.
    def getSecurityContext(): Object = ???

    @stub
    // Returns the thread group into which to instantiate any new
    // thread being created at the time this is being called.
    def getThreadGroup(): ThreadGroup = ???

    @stub
    // Deprecated. 
    //This type of security checking is not recommended.
    //  It is recommended that the checkPermission
    //  call be used instead.
    //
    protected def inClass(name: String): Boolean = ???
}