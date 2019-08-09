package java.nio.file

import java.io.File
import java.lang.{Comparable, Iterable, Object, String}
import java.util.Iterator

/** An object that may be used to locate a file in a file system. It will
 *  typically represent a system dependent file path.
 * 
 *   A Path represents a path that is hierarchical and composed of a
 *  sequence of directory and file name elements separated by a special separator
 *  or delimiter. A root component, that identifies a file system
 *  hierarchy, may also be present. The name element that is farthest
 *  from the root of the directory hierarchy is the name of a file or directory.
 *  The other name elements are directory names. A Path can represent a
 *  root, a root and a sequence of names, or simply one or more name elements.
 *  A Path is considered to be an empty path if it consists
 *  solely of one name element that is empty. Accessing a file using an
 *  empty path is equivalent to accessing the default directory of the
 *  file system. Path defines the getFileName,
 *  getParent, getRoot, and subpath methods to access the path components or a subsequence of its name
 *  elements.
 * 
 *   In addition to accessing the components of a path, a Path also
 *  defines the resolve and resolveSibling methods to combine paths. The relativize
 *  method that can be used to construct a relative path between two paths.
 *  Paths can be compared, and tested against each other using
 *  the startsWith and endsWith methods.
 * 
 *   This interface extends Watchable interface so that a directory
 *  located by a path can be registered with a WatchService and entries in the directory watched. 
 * 
 *   WARNING: This interface is only intended to be implemented by
 *  those developing custom file system implementations. Methods may be added to
 *  this interface in future releases. 
 * 
 *  Accessing Files
 *   Paths may be used with the Files class to operate on files,
 *  directories, and other types of files. For example, suppose we want a BufferedReader to read text from a file "access.log". The
 *  file is located in a directory "logs" relative to the current working
 *  directory and is UTF-8 encoded.
 *  
 *      Path path = FileSystems.getDefault().getPath("logs", "access.log");
 *      BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
 *  
 * 
 *  Interoperability
 *   Paths associated with the default provider are generally interoperable
 *  with the java.io.File class. Paths created by other
 *  providers are unlikely to be interoperable with the abstract path names
 *  represented by java.io.File. The toPath
 *  method may be used to obtain a Path from the abstract path name
 *  represented by a java.io.File object. The resulting Path can
 *  be used to operate on the same file as the java.io.File object. In
 *  addition, the toFile method is useful to construct a File from the String representation of a Path.
 * 
 *  Concurrency
 *   Implementations of this interface are immutable and safe for use by
 *  multiple concurrent threads.
 */
trait Path extends Comparable[Path] with Iterable[Path] with Watchable {

    /** Compares two abstract paths lexicographically. */
    @stub
    def compareTo(other: Path): Int = ???

    /** Tests if this path ends with the given path. */
    @stub
    def endsWith(other: Path): Boolean = ???

    /** Tests if this path ends with a Path, constructed by converting
     *  the given path string, in exactly the manner specified by the endsWith(Path) method.
     */
    @stub
    def endsWith(other: String): Boolean = ???

    /** Tests this path for equality with the given object. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Returns the name of the file or directory denoted by this path as a
     *  Path object.
     */
    @stub
    def getFileName(): Path = ???

    /** Returns the file system that created this object. */
    @stub
    def getFileSystem(): FileSystem = ???

    /** Returns a name element of this path as a Path object. */
    @stub
    def getName(index: Int): Path = ???

    /** Returns the number of name elements in the path. */
    @stub
    def getNameCount(): Int = ???

    /** Returns the parent path, or null if this path does not
     *  have a parent.
     */
    @stub
    def getParent(): Path = ???

    /** Returns the root component of this path as a Path object,
     *  or null if this path does not have a root component.
     */
    @stub
    def getRoot(): Path = ???

    /** Computes a hash code for this path. */
    @stub
    def hashCode(): Int = ???

    /** Tells whether or not this path is absolute. */
    @stub
    def isAbsolute(): Boolean = ???

    /** Returns an iterator over the name elements of this path. */
    @stub
    def iterator(): Iterator[Path] = ???

    /** Returns a path that is this path with redundant name elements eliminated. */
    @stub
    def normalize(): Path = ???

    /** Registers the file located by this path with a watch service. */
    @stub
    def register(watcher: WatchService, events: WatchEvent.Kind[_]*): WatchKey = ???

    /** Registers the file located by this path with a watch service. */
    @stub
    def register(watcher: WatchService, events: Array[WatchEvent.Kind[_]], modifiers: WatchEvent.Modifier*): WatchKey = ???

    /** Constructs a relative path between this path and a given path. */
    @stub
    def relativize(other: Path): Path = ???

    /** Resolve the given path against this path. */
    @stub
    def resolve(other: Path): Path = ???

    /** Converts a given path string to a Path and resolves it against
     *  this Path in exactly the manner specified by the resolve method.
     */
    @stub
    def resolve(other: String): Path = ???

    /** Resolves the given path against this path's parent
     *  path.
     */
    @stub
    def resolveSibling(other: Path): Path = ???

    /** Converts a given path string to a Path and resolves it against
     *  this path's parent path in exactly the manner
     *  specified by the resolveSibling method.
     */
    @stub
    def resolveSibling(other: String): Path = ???

    /** Tests if this path starts with the given path. */
    @stub
    def startsWith(other: Path): Boolean = ???

    /** Tests if this path starts with a Path, constructed by converting
     *  the given path string, in exactly the manner specified by the startsWith(Path) method.
     */
    @stub
    def startsWith(other: String): Boolean = ???

    /** Returns a relative Path that is a subsequence of the name
     *  elements of this path.
     */
    @stub
    def subpath(beginIndex: Int, endIndex: Int): Path = ???

    /** Returns a Path object representing the absolute path of this
     *  path.
     */
    @stub
    def toAbsolutePath(): Path = ???

    /** Returns a File object representing this path. */
    @stub
    def toFile(): File = ???

    /** Returns the real path of an existing file. */
    @stub
    def toRealPath(options: LinkOption*): Path = ???

    /** Returns the string representation of this path. */
    @stub
    def toString(): String = ???
}
