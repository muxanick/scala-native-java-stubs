package java.rmi.server

import java.lang.{Class, ClassLoader, Object, String}
import java.net.URL

/** RMIClassLoader comprises static methods to support
 *  dynamic class loading with RMI.  Included are methods for loading
 *  classes from a network location (one or more URLs) and obtaining
 *  the location from which an existing class should be loaded by
 *  remote parties.  These methods are used by the RMI runtime when
 *  marshalling and unmarshalling classes contained in the arguments
 *  and return values of remote method calls, and they also may be
 *  invoked directly by applications in order to mimic RMI's dynamic
 *  class loading behavior.
 * 
 *  The implementation of the following static methods
 * 
 *  
 * 
 *  loadClass(URL,String)
 *  loadClass(String,String)
 *  loadClass(String,String,ClassLoader)
 *  loadProxyClass(String,String[],ClassLoader)
 *  getClassLoader(String)
 *  getClassAnnotation(Class)
 * 
 *  
 * 
 *  is provided by an instance of RMIClassLoaderSpi, the
 *  service provider interface for those methods.  When one of the
 *  methods is invoked, its behavior is to delegate to a corresponding
 *  method on the service provider instance.  The details of how each
 *  method delegates to the provider instance is described in the
 *  documentation for each particular method.
 * 
 *  The service provider instance is chosen as follows:
 * 
 *  
 * 
 *  If the system property
 *  java.rmi.server.RMIClassLoaderSpi is defined, then if
 *  its value equals the string "default", the provider
 *  instance will be the value returned by an invocation of the getDefaultProviderInstance() method, and for any other value, if
 *  a class named with the value of the property can be loaded by the
 *  system class loader (see ClassLoader.getSystemClassLoader())
 *  and that class is assignable to RMIClassLoaderSpi and has a
 *  public no-argument constructor, then that constructor will be
 *  invoked to create the provider instance.  If the property is
 *  defined but any other of those conditions are not true, then an
 *  unspecified Error will be thrown to code that attempts
 *  to use RMIClassLoader, indicating the failure to
 *  obtain a provider instance.
 * 
 *  If a resource named
 *  META-INF/services/java.rmi.server.RMIClassLoaderSpi is
 *  visible to the system class loader, then the contents of that
 *  resource are interpreted as a provider-configuration file, and the
 *  first class name specified in that file is used as the provider
 *  class name.  If a class with that name can be loaded by the system
 *  class loader and that class is assignable to RMIClassLoaderSpi and has a public no-argument constructor, then
 *  that constructor will be invoked to create the provider instance.
 *  If the resource is found but a provider cannot be instantiated as
 *  described, then an unspecified Error will be thrown to
 *  code that attempts to use RMIClassLoader, indicating
 *  the failure to obtain a provider instance.
 * 
 *  Otherwise, the provider instance will be the value returned by
 *  an invocation of the getDefaultProviderInstance() method.
 * 
 *  
 */
class RMIClassLoader extends Object {
}

object RMIClassLoader {
    /** Returns the annotation string (representing a location for
     *  the class definition) that RMI will use to annotate the class
     *  descriptor when marshalling objects of the given class.
     */
    @stub
    def getClassAnnotation(cl: Class[_]): String = ???

    /** Returns a class loader that loads classes from the given codebase
     *  URL path.
     */
    @stub
    def getClassLoader(codebase: String): ClassLoader = ???

    /** Returns the canonical instance of the default provider
     *  for the service provider interface RMIClassLoaderSpi.
     */
    @stub
    def getDefaultProviderInstance(): RMIClassLoaderSpi = ???

    /** Deprecated. 
     * no replacement.  As of the Java 2 platform v1.2, RMI no
     *  longer uses this method to obtain a class loader's security context.
     * 
     */
    @stub
    def getSecurityContext(loader: ClassLoader): Object = ???

    /** Deprecated. 
     * replaced by loadClass(String,String) method
     * 
     */
    @stub
    def loadClass(name: String): Class[_] = ???

    /** Loads a class from a codebase URL path. */
    @stub
    def loadClass(codebase: String, name: String): Class[_] = ???

    /** Loads a class from a codebase URL path, optionally using the
     *  supplied loader.
     */
    @stub
    def loadClass(codebase: String, name: String, defaultLoader: ClassLoader): Class[_] = ???

    /** Loads a class from a codebase URL. */
    @stub
    def loadClass(codebase: URL, name: String): Class[_] = ???
}
