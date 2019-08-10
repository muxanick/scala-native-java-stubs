package java.nio.file.spi

import java.io.{InputStream, OutputStream}
import java.lang.{Class, Object, String}
import java.net.URI
import java.nio.channels.{AsynchronousFileChannel, FileChannel, SeekableByteChannel}
import java.nio.file.{AccessMode, CopyOption, DirectoryStream, DirectoryStream.Filter, FileStore, FileSystem, LinkOption, OpenOption, Path}
import java.nio.file.attribute.{BasicFileAttributes, FileAttribute, FileAttributeView}
import java.util.{List, Map, Set}
import java.util.concurrent.ExecutorService
import scala.scalanative.annotation.stub

/** Service-provider class for file systems. The methods defined by the Files class will typically delegate to an instance of this
 *  class.
 * 
 *   A file system provider is a concrete implementation of this class that
 *  implements the abstract methods defined by this class. A provider is
 *  identified by a URI scheme. The default provider
 *  is identified by the URI scheme "file". It creates the FileSystem that
 *  provides access to the file systems accessible to the Java virtual machine.
 *  The FileSystems class defines how file system providers are located
 *  and loaded. The default provider is typically a system-default provider but
 *  may be overridden if the system property java.nio.file.spi.DefaultFileSystemProvider is set. In that case, the
 *  provider has a one argument constructor whose formal parameter type is FileSystemProvider. All other providers have a zero argument constructor
 *  that initializes the provider.
 * 
 *   A provider is a factory for one or more FileSystem instances. Each
 *  file system is identified by a URI where the URI's scheme matches
 *  the provider's scheme. The default file system, for example,
 *  is identified by the URI "file:///". A memory-based file system,
 *  for example, may be identified by a URI such as "memory:///?name=logfs".
 *  The newFileSystem method may be used to create a file
 *  system, and the getFileSystem method may be used to
 *  obtain a reference to an existing file system created by the provider. Where
 *  a provider is the factory for a single file system then it is provider dependent
 *  if the file system is created when the provider is initialized, or later when
 *  the newFileSystem method is invoked. In the case of the default
 *  provider, the FileSystem is created when the provider is initialized.
 * 
 *   All of the methods in this class are safe for use by multiple concurrent
 *  threads.
 */
abstract class FileSystemProvider extends Object {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Checks the existence, and optionally the accessibility, of a file. */
    def checkAccess(path: Path, modes: AccessMode*): Unit

    /** Copy a file to a target file. */
    def copy(source: Path, target: Path, options: CopyOption*): Unit

    /** Creates a new directory. */
    def createDirectory(dir: Path, attrs: FileAttribute[_]*): Unit

    /** Creates a new link (directory entry) for an existing file. */
    def createLink(link: Path, existing: Path): Unit

    /** Creates a symbolic link to a target. */
    def createSymbolicLink(link: Path, target: Path, attrs: FileAttribute[_]*): Unit

    /** Deletes a file. */
    def delete(path: Path): Unit

    /** Deletes a file if it exists. */
    def deleteIfExists(path: Path): Boolean

    /** Returns a file attribute view of a given type. */
    val V: abstract[V <: FileAttributeView]

    /** Returns the FileStore representing the file store where a file
     *  is located.
     */
    def getFileStore(path: Path): FileStore

    /** Returns an existing FileSystem created by this provider. */
    def getFileSystem(uri: URI): FileSystem

    /** Return a Path object by converting the given URI. */
    def getPath(uri: URI): Path

    /** Returns the URI scheme that identifies this provider. */
    def getScheme(): String

    /** Tells whether or not a file is considered hidden. */
    def isHidden(path: Path): Boolean

    /** Tests if two paths locate the same file. */
    def isSameFile(path: Path, path2: Path): Boolean

    /** Move or rename a file to a target file. */
    def move(source: Path, target: Path, options: CopyOption*): Unit

    /** Opens or creates a file for reading and/or writing, returning an
     *  asynchronous file channel to access the file.
     */
    def newAsynchronousFileChannel(path: Path, options: Set[_ <: OpenOption], executor: ExecutorService, attrs: FileAttribute[_]*): AsynchronousFileChannel

    /** Opens or creates a file, returning a seekable byte channel to access the
     *  file.
     */
    def newByteChannel(path: Path, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel

    /** Opens a directory, returning a DirectoryStream to iterate over
     *  the entries in the directory.
     */
    def newDirectoryStream(dir: Path, filter: DirectoryStream.Filter[_ >: Path]): DirectoryStream[Path]

    /** Opens or creates a file for reading and/or writing, returning a file
     *  channel to access the file.
     */
    def newFileChannel(path: Path, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): FileChannel

    /** Constructs a new FileSystem to access the contents of a file as a
     *  file system.
     */
    def newFileSystem(path: Path, env: Map[String, _]): FileSystem

    /** Constructs a new FileSystem object identified by a URI. */
    def newFileSystem(uri: URI, env: Map[String, _]): FileSystem

    /** Opens a file, returning an input stream to read from the file. */
    def newInputStream(path: Path, options: OpenOption*): InputStream

    /** Opens or creates a file, returning an output stream that may be used to
     *  write bytes to the file.
     */
    def newOutputStream(path: Path, options: OpenOption*): OutputStream

    /** Reads a file's attributes as a bulk operation. */
    val A: abstract[A <: BasicFileAttributes]

    /** Reads a set of file attributes as a bulk operation. */
    def readAttributes(path: Path, attributes: String, options: LinkOption*): Map[String, Object]

    /** Reads the target of a symbolic link. */
    def readSymbolicLink(link: Path): Path

    /** Sets the value of a file attribute. */
    def setAttribute(path: Path, attribute: String, value: Any, options: LinkOption*): Unit
}

object FileSystemProvider {
    /** Returns a list of the installed file system providers. */
    @stub
    def installedProviders(): List[FileSystemProvider] = ???
}
