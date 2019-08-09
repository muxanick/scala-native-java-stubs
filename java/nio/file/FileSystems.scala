package java.nio.file

import java.lang.{ClassLoader, Object, String}
import java.net.URI
import java.util.Map
import scala.scalanative.annotation.stub

/** Factory methods for file systems. This class defines the getDefault method to get the default file system and factory methods to
 *  construct other types of file systems.
 * 
 *   The first invocation of any of the methods defined by this class causes
 *  the default provider to be loaded. The default
 *  provider, identified by the URI scheme "file", creates the FileSystem
 *  that provides access to the file systems accessible to the Java virtual
 *  machine. If the process of loading or initializing the default provider fails
 *  then an unspecified error is thrown.
 * 
 *   The first invocation of the installedProviders method, by way of invoking any of the newFileSystem methods defined by this class, locates and loads all
 *  installed file system providers. Installed providers are loaded using the
 *  service-provider loading facility defined by the ServiceLoader class.
 *  Installed providers are loaded using the system class loader. If the
 *  system class loader cannot be found then the extension class loader is used;
 *  if there is no extension class loader then the bootstrap class loader is used.
 *  Providers are typically installed by placing them in a JAR file on the
 *  application class path or in the extension directory, the JAR file contains a
 *  provider-configuration file named java.nio.file.spi.FileSystemProvider
 *  in the resource directory META-INF/services, and the file lists one or
 *  more fully-qualified names of concrete subclass of FileSystemProvider
 *  that have a zero argument constructor.
 *  The ordering that installed providers are located is implementation specific.
 *  If a provider is instantiated and its getScheme returns the same URI scheme of a provider that was previously
 *  instantiated then the most recently instantiated duplicate is discarded. URI
 *  schemes are compared without regard to case. During construction a provider
 *  may safely access files associated with the default provider but care needs
 *  to be taken to avoid circular loading of other installed providers. If
 *  circular loading of installed providers is detected then an unspecified error
 *  is thrown.
 * 
 *   This class also defines factory methods that allow a ClassLoader
 *  to be specified when locating a provider. As with installed providers, the
 *  provider classes are identified by placing the provider configuration file
 *  in the resource directory META-INF/services.
 * 
 *   If a thread initiates the loading of the installed file system providers
 *  and another thread invokes a method that also attempts to load the providers
 *  then the method will block until the loading completes.
 */
final class FileSystems extends Object {
}

object FileSystems {
    /** Returns the default FileSystem. */
    @stub
    def getDefault(): FileSystem = ???

    /** Returns a reference to an existing FileSystem. */
    @stub
    def getFileSystem(uri: URI): FileSystem = ???

    /** Constructs a new FileSystem to access the contents of a file as a
     *  file system.
     */
    @stub
    def newFileSystem(path: Path, loader: ClassLoader): FileSystem = ???

    /** Constructs a new file system that is identified by a URI */
    @stub
    def newFileSystem(uri: URI, env: Map[String, _]): FileSystem = ???

    /** Constructs a new file system that is identified by a URI */
    @stub
    def newFileSystem(uri: URI, env: Map[String, _], loader: ClassLoader): FileSystem = ???
}
