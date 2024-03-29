package java.util

import java.lang.{Class, ClassLoader, Iterable, Object, String}
import scala.scalanative.annotation.stub

/** A simple service-provider loading facility.
 * 
 *   A service is a well-known set of interfaces and (usually
 *  abstract) classes.  A service provider is a specific implementation
 *  of a service.  The classes in a provider typically implement the interfaces
 *  and subclass the classes defined in the service itself.  Service providers
 *  can be installed in an implementation of the Java platform in the form of
 *  extensions, that is, jar files placed into any of the usual extension
 *  directories.  Providers can also be made available by adding them to the
 *  application's class path or by some other platform-specific means.
 * 
 *   For the purpose of loading, a service is represented by a single type,
 *  that is, a single interface or abstract class.  (A concrete class can be
 *  used, but this is not recommended.)  A provider of a given service contains
 *  one or more concrete classes that extend this service type with data
 *  and code specific to the provider.  The provider class is typically
 *  not the entire provider itself but rather a proxy which contains enough
 *  information to decide whether the provider is able to satisfy a particular
 *  request together with code that can create the actual provider on demand.
 *  The details of provider classes tend to be highly service-specific; no
 *  single class or interface could possibly unify them, so no such type is
 *  defined here.  The only requirement enforced by this facility is that
 *  provider classes must have a zero-argument constructor so that they can be
 *  instantiated during loading.
 * 
 *   A service provider is identified by placing a
 *  provider-configuration file in the resource directory
 *  META-INF/services.  The file's name is the fully-qualified binary name of the service's type.
 *  The file contains a list of fully-qualified binary names of concrete
 *  provider classes, one per line.  Space and tab characters surrounding each
 *  name, as well as blank lines, are ignored.  The comment character is
 *  '#' ('\u0023',
 *  NUMBER SIGN); on
 *  each line all characters following the first comment character are ignored.
 *  The file must be encoded in UTF-8.
 * 
 *   If a particular concrete provider class is named in more than one
 *  configuration file, or is named in the same configuration file more than
 *  once, then the duplicates are ignored.  The configuration file naming a
 *  particular provider need not be in the same jar file or other distribution
 *  unit as the provider itself.  The provider must be accessible from the same
 *  class loader that was initially queried to locate the configuration file;
 *  note that this is not necessarily the class loader from which the file was
 *  actually loaded.
 * 
 *   Providers are located and instantiated lazily, that is, on demand.  A
 *  service loader maintains a cache of the providers that have been loaded so
 *  far.  Each invocation of the iterator method returns an
 *  iterator that first yields all of the elements of the cache, in
 *  instantiation order, and then lazily locates and instantiates any remaining
 *  providers, adding each one to the cache in turn.  The cache can be cleared
 *  via the reload method.
 * 
 *   Service loaders always execute in the security context of the caller.
 *  Trusted system code should typically invoke the methods in this class, and
 *  the methods of the iterators which they return, from within a privileged
 *  security context.
 * 
 *   Instances of this class are not safe for use by multiple concurrent
 *  threads.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method in this class will cause a NullPointerException to be thrown.
 * 
 * 
 *  Example
 *  Suppose we have a service type com.example.CodecSet which is
 *  intended to represent sets of encoder/decoder pairs for some protocol.  In
 *  this case it is an abstract class with two abstract methods:
 * 
 *  
 *  public abstract Encoder getEncoder(String encodingName);
 *  public abstract Decoder getDecoder(String encodingName);
 * 
 *  Each method returns an appropriate object or null if the provider
 *  does not support the given encoding.  Typical providers support more than
 *  one encoding.
 * 
 *   If com.example.impl.StandardCodecs is an implementation of the
 *  CodecSet service then its jar file also contains a file named
 * 
 *  
 *  META-INF/services/com.example.CodecSet
 * 
 *   This file contains the single line:
 * 
 *  
 *  com.example.impl.StandardCodecs    # Standard codecs
 * 
 *   The CodecSet class creates and saves a single service instance
 *  at initialization:
 * 
 *  
 *  private static ServiceLoader<CodecSet> codecSetLoader
 *      = ServiceLoader.load(CodecSet.class);
 * 
 *   To locate an encoder for a given encoding name it defines a static
 *  factory method which iterates through the known and available providers,
 *  returning only when it has located a suitable encoder or has run out of
 *  providers.
 * 
 *  
 *  public static Encoder getEncoder(String encodingName) {
 *      for (CodecSet cp : codecSetLoader) {
 *          Encoder enc = cp.getEncoder(encodingName);
 *          if (enc != null)
 *              return enc;
 *      }
 *      return null;
 *  }
 * 
 *   A getDecoder method is defined similarly.
 * 
 * 
 *  Usage Note If
 *  the class path of a class loader that is used for provider loading includes
 *  remote network URLs then those URLs will be dereferenced in the process of
 *  searching for provider-configuration files.
 * 
 *   This activity is normal, although it may cause puzzling entries to be
 *  created in web-server logs.  If a web server is not configured correctly,
 *  however, then this activity may cause the provider-loading algorithm to fail
 *  spuriously.
 * 
 *   A web server should return an HTTP 404 (Not Found) response when a
 *  requested resource does not exist.  Sometimes, however, web servers are
 *  erroneously configured to return an HTTP 200 (OK) response along with a
 *  helpful HTML error page in such cases.  This will cause a ServiceConfigurationError to be thrown when this class attempts to parse
 *  the HTML page as a provider-configuration file.  The best solution to this
 *  problem is to fix the misconfigured web server to return the correct
 *  response code (HTTP 404) along with the HTML error page.
 */
final class ServiceLoader[S] extends Object with Iterable[S] {

    /** Lazily loads the available providers of this loader's service. */
    @stub
    def iterator(): Iterator[S] = ???

    /** Clear this loader's provider cache so that all providers will be
     *  reloaded.
     */
    @stub
    def reload(): Unit = ???

    /** Returns a string describing this service. */
    @stub
    def toString(): String = ???
}

object ServiceLoader {
    /** Creates a new service loader for the given service type, using the
     *  current thread's context class loader.
     */
    @stub
    def load[S](service: Class[S]): ServiceLoader[S] = ???

    /** Creates a new service loader for the given service type and class
     *  loader.
     */
    @stub
    def load[S](service: Class[S], loader: ClassLoader): ServiceLoader[S] = ???

    /** Creates a new service loader for the given service type, using the
     *  extension class loader.
     */
    @stub
    def loadInstalled[S](service: Class[S]): ServiceLoader[S] = ???
}
