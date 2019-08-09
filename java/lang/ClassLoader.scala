package java.lang

import java.io.InputStream
import java.net.URL
import java.nio.ByteBuffer
import java.security.ProtectionDomain
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A class loader is an object that is responsible for loading classes. The
 *  class ClassLoader is an abstract class.  Given the binary name of a class, a class loader should attempt to
 *  locate or generate data that constitutes a definition for the class.  A
 *  typical strategy is to transform the name into a file name and then read a
 *  "class file" of that name from a file system.
 * 
 *   Every Class object contains a reference to the ClassLoader that defined
 *  it.
 * 
 *   Class objects for array classes are not created by class
 *  loaders, but are created automatically as required by the Java runtime.
 *  The class loader for an array class, as returned by Class.getClassLoader() is the same as the class loader for its element
 *  type; if the element type is a primitive type, then the array class has no
 *  class loader.
 * 
 *   Applications implement subclasses of ClassLoader in order to
 *  extend the manner in which the Java virtual machine dynamically loads
 *  classes.
 * 
 *   Class loaders may typically be used by security managers to indicate
 *  security domains.
 * 
 *   The ClassLoader class uses a delegation model to search for
 *  classes and resources.  Each instance of ClassLoader has an
 *  associated parent class loader.  When requested to find a class or
 *  resource, a ClassLoader instance will delegate the search for the
 *  class or resource to its parent class loader before attempting to find the
 *  class or resource itself.  The virtual machine's built-in class loader,
 *  called the "bootstrap class loader", does not itself have a parent but may
 *  serve as the parent of a ClassLoader instance.
 * 
 *   Class loaders that support concurrent loading of classes are known as
 *  parallel capable class loaders and are required to register
 *  themselves at their class initialization time by invoking the
 *  ClassLoader.registerAsParallelCapable
 *  method. Note that the ClassLoader class is registered as parallel
 *  capable by default. However, its subclasses still need to register themselves
 *  if they are parallel capable. 
 *  In environments in which the delegation model is not strictly
 *  hierarchical, class loaders need to be parallel capable, otherwise class
 *  loading can lead to deadlocks because the loader lock is held for the
 *  duration of the class loading process (see loadClass methods).
 * 
 *   Normally, the Java virtual machine loads classes from the local file
 *  system in a platform-dependent manner.  For example, on UNIX systems, the
 *  virtual machine loads classes from the directory defined by the
 *  CLASSPATH environment variable.
 * 
 *   However, some classes may not originate from a file; they may originate
 *  from other sources, such as the network, or they could be constructed by an
 *  application.  The method defineClass converts an array of bytes into an instance of class
 *  Class. Instances of this newly defined class can be created using
 *  Class.newInstance.
 * 
 *   The methods and constructors of objects created by a class loader may
 *  reference other classes.  To determine the class(es) referred to, the Java
 *  virtual machine invokes the loadClass method of
 *  the class loader that originally created the class.
 * 
 *   For example, an application could create a network class loader to
 *  download class files from a server.  Sample code might look like:
 * 
 *  
 *    ClassLoader loader = new NetworkClassLoader(host, port);
 *    Object main = loader.loadClass("Main", true).newInstance();
 *         . . .
 *  
 * 
 *   The network class loader subclass must define the methods findClass and loadClassData to load a class
 *  from the network.  Once it has downloaded the bytes that make up the class,
 *  it should use the method defineClass to
 *  create a class instance.  A sample implementation is:
 * 
 *  
 *      class NetworkClassLoader extends ClassLoader {
 *          String host;
 *          int port;
 * 
 *          public Class findClass(String name) {
 *              byte[] b = loadClassData(name);
 *              return defineClass(name, b, 0, b.length);
 *          }
 * 
 *          private byte[] loadClassData(String name) {
 *              // load the class data from the connection
 *               . . .
 *          }
 *      }
 *  
 * 
 *   Binary names 
 * 
 *   Any class name provided as a String parameter to methods in
 *  ClassLoader must be a binary name as defined by
 *  The Java™ Language Specification.
 * 
 *   Examples of valid class names include:
 *  
 *    "java.lang.String"
 *    "javax.swing.JSpinner$DefaultEditor"
 *    "java.security.KeyStore$Builder$FileBuilder$1"
 *    "java.net.URLClassLoader$3$1"
 *  
 */
abstract class ClassLoader extends Object {

    /** Creates a new class loader using the ClassLoader returned by
     *  the method getSystemClassLoader() as the parent class loader.
     */
    @stub
    protected def this() = ???

    /** Creates a new class loader using the specified parent class loader for
     *  delegation.
     */
    @stub
    protected def this(parent: ClassLoader) = ???

    /** Sets the default assertion status for this class loader to
     *  false and discards any package defaults or class assertion
     *  status settings associated with the class loader.
     */
    def clearAssertionStatus(): Unit

    /** Deprecated. 
     * Replaced by defineClass(String, byte[], int, int)
     * 
     */
    protected def defineClass(b: Array[Byte], off: Int, len: Int): Class[_]

    /** Converts an array of bytes into an instance of class Class. */
    protected def defineClass(name: String, b: Array[Byte], off: Int, len: Int): Class[_]

    /** Converts an array of bytes into an instance of class Class,
     *  with an optional ProtectionDomain.
     */
    protected def defineClass(name: String, b: Array[Byte], off: Int, len: Int, protectionDomain: ProtectionDomain): Class[_]

    /** Converts a ByteBuffer
     *  into an instance of class Class,
     *  with an optional ProtectionDomain.
     */
    protected def defineClass(name: String, b: ByteBuffer, protectionDomain: ProtectionDomain): Class[_]

    /** Defines a package by name in this ClassLoader. */
    protected def definePackage(name: String, specTitle: String, specVersion: String, specVendor: String, implTitle: String, implVersion: String, implVendor: String, sealBase: URL): Package

    /** Finds the class with the specified binary name. */
    protected def findClass(name: String): Class[_]

    /** Returns the absolute path name of a native library. */
    protected def findLibrary(libname: String): String

    /** Returns the class with the given binary name if this
     *  loader has been recorded by the Java virtual machine as an initiating
     *  loader of a class with that binary name.
     */
    protected def findLoadedClass(name: String): Class[_]

    /** Finds the resource with the given name. */
    protected def findResource(name: String): URL

    /** Returns an enumeration of URL objects
     *  representing all the resources with the given name.
     */
    protected def findResources(name: String): Enumeration[URL]

    /** Finds a class with the specified binary name,
     *  loading it if necessary.
     */
    protected def findSystemClass(name: String): Class[_]

    /** Returns the lock object for class loading operations. */
    protected def getClassLoadingLock(className: String): Object

    /** Returns a Package that has been defined by this class loader
     *  or any of its ancestors.
     */
    protected def getPackage(name: String): Package

    /** Returns all of the Packages defined by this class loader and
     *  its ancestors.
     */
    protected def getPackages(): Array[Package]

    /** Returns the parent class loader for delegation. */
    def getParent(): ClassLoader

    /** Finds the resource with the given name. */
    def getResource(name: String): URL

    /** Returns an input stream for reading the specified resource. */
    def getResourceAsStream(name: String): InputStream

    /** Finds all the resources with the given name. */
    def getResources(name: String): Enumeration[URL]

    /** Loads the class with the specified binary name. */
    def loadClass(name: String): Class[_]

    /** Loads the class with the specified binary name. */
    protected def loadClass(name: String, resolve: Boolean): Class[_]

    /** Links the specified class. */
    protected def resolveClass(c: Class[_]): Unit

    /** Sets the desired assertion status for the named top-level class in this
     *  class loader and any nested classes contained therein.
     */
    def setClassAssertionStatus(className: String, enabled: Boolean): Unit

    /** Sets the default assertion status for this class loader. */
    def setDefaultAssertionStatus(enabled: Boolean): Unit

    /** Sets the package default assertion status for the named package. */
    def setPackageAssertionStatus(packageName: String, enabled: Boolean): Unit

    /** Sets the signers of a class. */
    protected def setSigners(c: Class[_], signers: Array[Object]): Unit
}

object ClassLoader {
    /** Returns the system class loader for delegation. */
    @stub
    def getSystemClassLoader(): ClassLoader = ???

    /** Find a resource of the specified name from the search path used to load
     *  classes.
     */
    @stub
    def getSystemResource(name: String): URL = ???

    /** Open for reading, a resource of the specified name from the search path
     *  used to load classes.
     */
    @stub
    def getSystemResourceAsStream(name: String): InputStream = ???

    /** Finds all resources of the specified name from the search path used to
     *  load classes.
     */
    @stub
    def getSystemResources(name: String): Enumeration[URL] = ???

    /** Registers the caller as parallel capable. */
    @stub
    protected def registerAsParallelCapable(): Boolean = ???
}
