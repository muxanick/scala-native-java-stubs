package javax.management.loading

import java.io.{Externalizable, ObjectInput}
import java.lang.{Boolean, Class, ClassLoader, Object, String}
import java.net.{URL, URLClassLoader, URLStreamHandlerFactory}
import java.security.SecureClassLoader
import java.util.Set
import javax.management.{MBeanRegistration, MBeanServer, ObjectName}

// Allows you to instantiate and register one or several MBeans in the MBean server
// coming from a remote URL. M-let is a shortcut for management applet. The m-let service does this
// by loading an m-let text file, which specifies information on the MBeans to be obtained.
// The information on each MBean is specified in a single instance of a tag, called the MLET tag.
// The location of the m-let text file is specified by a URL.
// 
// The MLET tag has the following syntax:
// 
// <MLET
//      CODE = class | OBJECT = serfile
//      ARCHIVE = "archiveList"
//      [CODEBASE = codebaseURL]
//      [NAME = mbeanname]
//      [VERSION = version]
// >
//      [arglist]
// </MLET>
// 
// where:
// 
// CODE = class
// 
// This attribute specifies the full Java class name, including package name, of the MBean to be obtained.
// The compiled .class file of the MBean must be contained in one of the .jar files specified by the ARCHIVE
// attribute. Either CODE or OBJECT must be present.
// 
// OBJECT = serfile
// 
// This attribute specifies the .ser file that contains a serialized representation of the MBean to be obtained.
// This file must be contained in one of the .jar files specified by the ARCHIVE attribute. If the .jar file contains a directory hierarchy, specify the path of the file within this hierarchy. Otherwise  a match will not be found. Either CODE or OBJECT must be present.
// 
// ARCHIVE = "archiveList"
// 
// This mandatory attribute specifies one or more .jar files
// containing MBeans or other resources used by
// the MBean to be obtained. One of the .jar files must contain the file specified by the CODE or OBJECT attribute.
// If archivelist contains more than one file:
// 
// Each file must be separated from the one that follows it by a comma (,).
// archivelist must be enclosed in double quote marks.
// 
// All .jar files in archivelist must be stored in the directory specified by the code base URL.
// 
// CODEBASE = codebaseURL
// 
// This optional attribute specifies the code base URL of the MBean to be obtained. It identifies the directory that contains
// the .jar files specified by the ARCHIVE attribute. Specify this attribute only if the .jar files are not in the same
// directory as the m-let text file. If this attribute is not specified, the base URL of the m-let text file is used.
// 
// NAME = mbeanname
// 
// This optional attribute specifies the object name to be assigned to the
// MBean instance when the m-let service registers it. If
// mbeanname starts with the colon character (:), the domain
// part of the object name is the default domain of the MBean server,
// as returned by MBeanServer.getDefaultDomain().
// 
// VERSION = version
// 
// This optional attribute specifies the version number of the MBean and
// associated .jar files to be obtained. This version number can
// be used to specify that the .jar files are loaded from the
// server to update those stored locally in the cache the next time the m-let
// text file is loaded. version must be a series of non-negative
// decimal integers each separated by a period from the one that precedes it.
// 
// arglist
// 
// This optional attribute specifies a list of one or more parameters for the
// MBean to be instantiated. This list describes the parameters to be passed the MBean's constructor.
// Use the following syntax to specify each item in
// arglist:
// 
// <ARG TYPE=argumentType VALUE=value>
// where:
// 
// argumentType is the type of the argument that will be passed as parameter to the MBean's constructor.
// 
// 
// The arguments' type in the argument list should be a Java primitive type or a Java basic type
// (java.lang.Boolean, java.lang.Byte, java.lang.Short, java.lang.Long, java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String).
// 
// 
//
// When an m-let text file is loaded, an
// instance of each MBean specified in the file is created and registered.
// 
// The m-let service extends the java.net.URLClassLoader and can be used to load remote classes
// and jar files in the VM of the agent.
// Note -  The MLet class loader uses the MBeanServerFactory.getClassLoaderRepository(javax.management.MBeanServer)
// to load classes that could not be found in the loaded jar files.
class MLet extends URLClassLoader with MLetMBean, with MBeanRegistration, with Externalizable {

    @stub
    // Constructs a new MLet using the default delegation parent ClassLoader.
    def this() = ???

    @stub
    // Constructs a new MLet for the specified URLs using the default
    // delegation parent ClassLoader.
    def this(urls: Array[URL]) = ???

    @stub
    // Constructs a new MLet for the specified URLs using the default
    // delegation parent ClassLoader.
    def this(urls: Array[URL], delegateToCLR: Boolean) = ???

    @stub
    // Constructs a new MLet for the given URLs.
    def this(urls: Array[URL], parent: ClassLoader) = ???

    @stub
    // Constructs a new MLet for the given URLs.
    def this(urls: Array[URL], parent: ClassLoader, delegateToCLR: Boolean) = ???

    @stub
    // Constructs a new MLet for the specified URLs, parent class
    // loader, and URLStreamHandlerFactory.
    def this(urls: Array[URL], parent: ClassLoader, factory: URLStreamHandlerFactory) = ???

    @stub
    // Appends the specified URL to the list of URLs to search for classes and
    // resources.
    def addURL(url: String): Unit = ???

    @stub
    // Appends the specified URL to the list of URLs to search for classes and
    // resources.
    def addURL(url: URL): Unit = ???

    @stub
    // This method is to be overridden when extending this service to
    // support caching and versioning.
    protected def check(version: String, codebase: URL, jarfile: String, mlet: MLetContent): URL = ???

    @stub
    // This is the main method for class loaders that is being redefined.
    protected def findClass(name: String): Class[_] = ???

    @stub
    // Returns the absolute path name of a native library.
    protected def findLibrary(libname: String): String = ???

    @stub
    // Gets the current directory used by the library loader for
    // storing native libraries before they are loaded into memory.
    def getLibraryDirectory(): String = ???

    @stub
    // Loads a text file containing MLET tags that define the MBeans to
    // be added to the MBean server.
    def getMBeansFromURL(url: String): Set[Object] = ???

    @stub
    // Loads a text file containing MLET tags that define the MBeans to
    // be added to the MBean server.
    def getMBeansFromURL(url: URL): Set[Object] = ???

    @stub
    // Returns the search path of URLs for loading classes and resources.
    def getURLs(): Array[URL] = ???

    @stub
    // Load a class, using the given ClassLoaderRepository if
    // the class is not found in this MLet's URLs.
    def loadClass(name: String, clr: ClassLoaderRepository): Class[_] = ???

    @stub
    // Allows the m-let to perform any operations needed after having been
    // unregistered in the MBean server.
    def postDeregister(): Unit = ???

    @stub
    // Allows the m-let to perform any operations needed after having been
    // registered in the MBean server or after the registration has failed.
    def postRegister(registrationDone: Boolean): Unit = ???

    @stub
    // Allows the m-let to perform any operations it needs before being unregistered
    // by the MBean server.
    def preDeregister(): Unit = ???

    @stub
    // Allows the m-let to perform any operations it needs before
    // being registered in the MBean server.
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    @stub
    // Restore this MLet's contents from the given ObjectInput.
    def readExternal(in: ObjectInput): Unit = ???

    @stub
    // Sets the directory used by the library loader for storing
    // native libraries before they are loaded into memory.
    def setLibraryDirectory(libdir: String): Unit = ???
}
