package java.nio.file

import java.io.Closeable
import java.lang.{Iterable, Object, String}
import java.nio.file.attribute.UserPrincipalLookupService
import java.nio.file.spi.FileSystemProvider

/** Provides an interface to a file system and is the factory for objects to
 *  access files and other objects in the file system.
 * 
 *   The default file system, obtained by invoking the FileSystems.getDefault method, provides access to the file system that is
 *  accessible to the Java virtual machine. The FileSystems class defines
 *  methods to create file systems that provide access to other types of (custom)
 *  file systems.
 * 
 *   A file system is the factory for several types of objects:
 * 
 *  
 *     The getPath method converts a system dependent
 *      path string, returning a Path object that may be used
 *      to locate and access a file. 
 *     The getPathMatcher method is used
 *      to create a PathMatcher that performs match operations on
 *      paths. 
 *     The getFileStores method returns an iterator
 *      over the underlying file-stores. 
 *     The getUserPrincipalLookupService
 *      method returns the UserPrincipalLookupService to lookup users or
 *      groups by name. 
 *     The newWatchService method creates a
 *      WatchService that may be used to watch objects for changes and
 *      events. 
 *  
 * 
 *   File systems vary greatly. In some cases the file system is a single
 *  hierarchy of files with one top-level root directory. In other cases it may
 *  have several distinct file hierarchies, each with its own top-level root
 *  directory. The getRootDirectories method may be
 *  used to iterate over the root directories in the file system. A file system
 *  is typically composed of one or more underlying file-stores
 *  that provide the storage for the files. Theses file stores can also vary in
 *  the features they support, and the file attributes or meta-data that
 *  they associate with files.
 * 
 *   A file system is open upon creation and can be closed by invoking its
 *  close method. Once closed, any further attempt to access
 *  objects in the file system cause ClosedFileSystemException to be
 *  thrown. File systems created by the default provider
 *  cannot be closed.
 * 
 *   A FileSystem can provide read-only or read-write access to the
 *  file system. Whether or not a file system provides read-only access is
 *  established when the FileSystem is created and can be tested by invoking
 *  its isReadOnly method. Attempts to write to file stores
 *  by means of an object associated with a read-only file system throws ReadOnlyFileSystemException.
 * 
 *   File systems are safe for use by multiple concurrent threads. The close method may be invoked at any time to close a file system but
 *  whether a file system is asynchronously closeable is provider specific
 *  and therefore unspecified. In other words, if a thread is accessing an
 *  object in a file system, and another thread invokes the close method
 *  then it may require to block until the first operation is complete. Closing
 *  a file system causes all open channels, watch services, and other closeable objects associated with the file system to be closed.
 */
abstract class FileSystem extends Object with Closeable {

    /** Closes this file system. */
    def close(): Unit

    /** Returns an object to iterate over the underlying file stores. */
    def getFileStores(): Iterable[FileStore]

    /** Converts a path string, or a sequence of strings that when joined form
     *  a path string, to a Path.
     */
    def getPath(first: String, more: String*): Path

    /** Returns a PathMatcher that performs match operations on the
     *  String representation of Path objects by interpreting a
     *  given pattern.
     */
    def getPathMatcher(syntaxAndPattern: String): PathMatcher

    /** Returns an object to iterate over the paths of the root directories. */
    def getRootDirectories(): Iterable[Path]

    /** Returns the name separator, represented as a string. */
    def getSeparator(): String

    /** Returns the UserPrincipalLookupService for this file system
     *  (optional operation).
     */
    def getUserPrincipalLookupService(): UserPrincipalLookupService

    /** Tells whether or not this file system is open. */
    def isOpen(): Boolean

    /** Tells whether or not this file system allows only read-only access to
     *  its file stores.
     */
    def isReadOnly(): Boolean

    /** Constructs a new WatchService (optional operation). */
    def newWatchService(): WatchService

    /** Returns the provider that created this file system. */
    def provider(): FileSystemProvider
}
