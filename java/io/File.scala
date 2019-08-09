package java.io

import java.lang.{Comparable, Object, String}
import java.net.{URI, URL}
import java.nio.file.Path
import scala.scalanative.annotation.stub

/** An abstract representation of file and directory pathnames.
 * 
 *   User interfaces and operating systems use system-dependent pathname
 *  strings to name files and directories.  This class presents an
 *  abstract, system-independent view of hierarchical pathnames.  An
 *  abstract pathname has two components:
 * 
 *  
 *   An optional system-dependent prefix string,
 *       such as a disk-drive specifier, "/" for the UNIX root
 *       directory, or "\\\\" for a Microsoft Windows UNC pathname, and
 *   A sequence of zero or more string names.
 *  
 * 
 *  The first name in an abstract pathname may be a directory name or, in the
 *  case of Microsoft Windows UNC pathnames, a hostname.  Each subsequent name
 *  in an abstract pathname denotes a directory; the last name may denote
 *  either a directory or a file.  The empty abstract pathname has no
 *  prefix and an empty name sequence.
 * 
 *   The conversion of a pathname string to or from an abstract pathname is
 *  inherently system-dependent.  When an abstract pathname is converted into a
 *  pathname string, each name is separated from the next by a single copy of
 *  the default separator character.  The default name-separator
 *  character is defined by the system property file.separator, and
 *  is made available in the public static fields separator and separatorChar of this class.
 *  When a pathname string is converted into an abstract pathname, the names
 *  within it may be separated by the default name-separator character or by any
 *  other name-separator character that is supported by the underlying system.
 * 
 *   A pathname, whether abstract or in string form, may be either
 *  absolute or relative.  An absolute pathname is complete in
 *  that no other information is required in order to locate the file that it
 *  denotes.  A relative pathname, in contrast, must be interpreted in terms of
 *  information taken from some other pathname.  By default the classes in the
 *  java.io package always resolve relative pathnames against the
 *  current user directory.  This directory is named by the system property
 *  user.dir, and is typically the directory in which the Java
 *  virtual machine was invoked.
 * 
 *   The parent of an abstract pathname may be obtained by invoking
 *  the getParent() method of this class and consists of the pathname's
 *  prefix and each name in the pathname's name sequence except for the last.
 *  Each directory's absolute pathname is an ancestor of any File
 *  object with an absolute abstract pathname which begins with the directory's
 *  absolute pathname.  For example, the directory denoted by the abstract
 *  pathname "/usr" is an ancestor of the directory denoted by the
 *  pathname "/usr/local/bin".
 * 
 *   The prefix concept is used to handle root directories on UNIX platforms,
 *  and drive specifiers, root directories and UNC pathnames on Microsoft Windows platforms,
 *  as follows:
 * 
 *  
 * 
 *   For UNIX platforms, the prefix of an absolute pathname is always
 *  "/".  Relative pathnames have no prefix.  The abstract pathname
 *  denoting the root directory has the prefix "/" and an empty
 *  name sequence.
 * 
 *   For Microsoft Windows platforms, the prefix of a pathname that contains a drive
 *  specifier consists of the drive letter followed by ":" and
 *  possibly followed by "\\" if the pathname is absolute.  The
 *  prefix of a UNC pathname is "\\\\"; the hostname and the share
 *  name are the first two names in the name sequence.  A relative pathname that
 *  does not specify a drive has no prefix.
 * 
 *  
 * 
 *   Instances of this class may or may not denote an actual file-system
 *  object such as a file or a directory.  If it does denote such an object
 *  then that object resides in a partition.  A partition is an
 *  operating system-specific portion of storage for a file system.  A single
 *  storage device (e.g. a physical disk-drive, flash memory, CD-ROM) may
 *  contain multiple partitions.  The object, if any, will reside on the
 *  partition named by some ancestor of the absolute
 *  form of this pathname.
 * 
 *   A file system may implement restrictions to certain operations on the
 *  actual file-system object, such as reading, writing, and executing.  These
 *  restrictions are collectively known as access permissions.  The file
 *  system may have multiple sets of access permissions on a single object.
 *  For example, one set may apply to the object's owner, and another
 *  may apply to all other users.  The access permissions on an object may
 *  cause some methods in this class to fail.
 * 
 *   Instances of the File class are immutable; that is, once
 *  created, the abstract pathname represented by a File object
 *  will never change.
 * 
 *  Interoperability with java.nio.file package
 * 
 *   The java.nio.file
 *  package defines interfaces and classes for the Java virtual machine to access
 *  files, file attributes, and file systems. This API may be used to overcome
 *  many of the limitations of the java.io.File class.
 *  The toPath method may be used to obtain a Path that uses the abstract path represented by a File object to
 *  locate a file. The resulting Path may be used with the Files class to provide more efficient and extensive access to
 *  additional file operations, file attributes, and I/O exceptions to help
 *  diagnose errors when an operation on a file fails.
 */
class File extends Object with Serializable with Comparable[File] {

    /** Creates a new File instance from a parent abstract
     *  pathname and a child pathname string.
     */
    @stub
    def this(parent: File, child: String) = ???

    /** Creates a new File instance by converting the given
     *  pathname string into an abstract pathname.
     */
    @stub
    def this(pathname: String) = ???

    /** Creates a new File instance from a parent pathname string
     *  and a child pathname string.
     */
    @stub
    def this(parent: String, child: String) = ???

    /** Creates a new File instance by converting the given
     *  file: URI into an abstract pathname.
     */
    @stub
    def this(uri: URI) = ???

    /** Tests whether the application can execute the file denoted by this
     *  abstract pathname.
     */
    @stub
    def canExecute(): Boolean = ???

    /** Tests whether the application can read the file denoted by this
     *  abstract pathname.
     */
    @stub
    def canRead(): Boolean = ???

    /** Tests whether the application can modify the file denoted by this
     *  abstract pathname.
     */
    @stub
    def canWrite(): Boolean = ???

    /** Compares two abstract pathnames lexicographically. */
    @stub
    def compareTo(pathname: File): Int = ???

    /** Atomically creates a new, empty file named by this abstract pathname if
     *  and only if a file with this name does not yet exist.
     */
    @stub
    def createNewFile(): Boolean = ???

    /** Deletes the file or directory denoted by this abstract pathname. */
    @stub
    def delete(): Boolean = ???

    /** Requests that the file or directory denoted by this abstract
     *  pathname be deleted when the virtual machine terminates.
     */
    @stub
    def deleteOnExit(): Unit = ???

    /** Tests this abstract pathname for equality with the given object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Tests whether the file or directory denoted by this abstract pathname
     *  exists.
     */
    @stub
    def exists(): Boolean = ???

    /** Returns the absolute form of this abstract pathname. */
    @stub
    def getAbsoluteFile(): File = ???

    /** Returns the absolute pathname string of this abstract pathname. */
    @stub
    def getAbsolutePath(): String = ???

    /** Returns the canonical form of this abstract pathname. */
    @stub
    def getCanonicalFile(): File = ???

    /** Returns the canonical pathname string of this abstract pathname. */
    @stub
    def getCanonicalPath(): String = ???

    /** Returns the number of unallocated bytes in the partition named by this abstract path name. */
    @stub
    def getFreeSpace(): Long = ???

    /** Returns the name of the file or directory denoted by this abstract
     *  pathname.
     */
    @stub
    def getName(): String = ???

    /** Returns the pathname string of this abstract pathname's parent, or
     *  null if this pathname does not name a parent directory.
     */
    @stub
    def getParent(): String = ???

    /** Returns the abstract pathname of this abstract pathname's parent,
     *  or null if this pathname does not name a parent
     *  directory.
     */
    @stub
    def getParentFile(): File = ???

    /** Converts this abstract pathname into a pathname string. */
    @stub
    def getPath(): String = ???

    /** Returns the size of the partition named by this
     *  abstract pathname.
     */
    @stub
    def getTotalSpace(): Long = ???

    /** Returns the number of bytes available to this virtual machine on the
     *  partition named by this abstract pathname.
     */
    @stub
    def getUsableSpace(): Long = ???

    /** Computes a hash code for this abstract pathname. */
    @stub
    def hashCode(): Int = ???

    /** Tests whether this abstract pathname is absolute. */
    @stub
    def isAbsolute(): Boolean = ???

    /** Tests whether the file denoted by this abstract pathname is a
     *  directory.
     */
    @stub
    def isDirectory(): Boolean = ???

    /** Tests whether the file denoted by this abstract pathname is a normal
     *  file.
     */
    @stub
    def isFile(): Boolean = ???

    /** Tests whether the file named by this abstract pathname is a hidden
     *  file.
     */
    @stub
    def isHidden(): Boolean = ???

    /** Returns the time that the file denoted by this abstract pathname was
     *  last modified.
     */
    @stub
    def lastModified(): Long = ???

    /** Returns the length of the file denoted by this abstract pathname. */
    @stub
    def length(): Long = ???

    /** Returns an array of strings naming the files and directories in the
     *  directory denoted by this abstract pathname.
     */
    @stub
    def list(): Array[String] = ???

    /** Returns an array of strings naming the files and directories in the
     *  directory denoted by this abstract pathname that satisfy the specified
     *  filter.
     */
    @stub
    def list(filter: FilenameFilter): Array[String] = ???

    /** Returns an array of abstract pathnames denoting the files in the
     *  directory denoted by this abstract pathname.
     */
    @stub
    def listFiles(): Array[File] = ???

    /** Returns an array of abstract pathnames denoting the files and
     *  directories in the directory denoted by this abstract pathname that
     *  satisfy the specified filter.
     */
    @stub
    def listFiles(filter: FileFilter): Array[File] = ???

    /** Returns an array of abstract pathnames denoting the files and
     *  directories in the directory denoted by this abstract pathname that
     *  satisfy the specified filter.
     */
    @stub
    def listFiles(filter: FilenameFilter): Array[File] = ???

    /** Creates the directory named by this abstract pathname. */
    @stub
    def mkdir(): Boolean = ???

    /** Creates the directory named by this abstract pathname, including any
     *  necessary but nonexistent parent directories.
     */
    @stub
    def mkdirs(): Boolean = ???

    /** Renames the file denoted by this abstract pathname. */
    @stub
    def renameTo(dest: File): Boolean = ???

    /** A convenience method to set the owner's execute permission for this
     *  abstract pathname.
     */
    @stub
    def setExecutable(executable: Boolean): Boolean = ???

    /** Sets the owner's or everybody's execute permission for this abstract
     *  pathname.
     */
    @stub
    def setExecutable(executable: Boolean, ownerOnly: Boolean): Boolean = ???

    /** Sets the last-modified time of the file or directory named by this
     *  abstract pathname.
     */
    @stub
    def setLastModified(time: Long): Boolean = ???

    /** A convenience method to set the owner's read permission for this abstract
     *  pathname.
     */
    @stub
    def setReadable(readable: Boolean): Boolean = ???

    /** Sets the owner's or everybody's read permission for this abstract
     *  pathname.
     */
    @stub
    def setReadable(readable: Boolean, ownerOnly: Boolean): Boolean = ???

    /** Marks the file or directory named by this abstract pathname so that
     *  only read operations are allowed.
     */
    @stub
    def setReadOnly(): Boolean = ???

    /** A convenience method to set the owner's write permission for this abstract
     *  pathname.
     */
    @stub
    def setWritable(writable: Boolean): Boolean = ???

    /** Sets the owner's or everybody's write permission for this abstract
     *  pathname.
     */
    @stub
    def setWritable(writable: Boolean, ownerOnly: Boolean): Boolean = ???

    /** Returns a java.nio.file.Path object constructed from the
     *  this abstract path.
     */
    @stub
    def toPath(): Path = ???

    /** Returns the pathname string of this abstract pathname. */
    @stub
    def toString(): String = ???

    /** Constructs a file: URI that represents this abstract pathname. */
    @stub
    def toURI(): URI = ???

    /** Deprecated. 
     * This method does not automatically escape characters that
     *  are illegal in URLs.  It is recommended that new code convert an
     *  abstract pathname into a URL by first converting it into a URI, via the
     *  toURI method, and then converting the URI into a URL
     *  via the URI.toURL method.
     * 
     */
    @stub
    def toURL(): URL = ???
}

object File {
    /** The system-dependent path-separator character, represented as a string
     *  for convenience.
     */
    @stub
    val pathSeparator: String = ???

    /** The system-dependent path-separator character. */
    @stub
    val pathSeparatorChar: Char = ???

    /** The system-dependent default name-separator character, represented as a
     *  string for convenience.
     */
    @stub
    val separator: String = ???

    /** The system-dependent default name-separator character. */
    @stub
    val separatorChar: Char = ???

    /** Creates an empty file in the default temporary-file directory, using
     *  the given prefix and suffix to generate its name.
     */
    @stub
    def createTempFile(prefix: String, suffix: String): File = ???

    /**  Creates a new empty file in the specified directory, using the
     *  given prefix and suffix strings to generate its name.
     */
    @stub
    def createTempFile(prefix: String, suffix: String, directory: File): File = ???

    /** List the available filesystem roots. */
    @stub
    def listRoots(): Array[File] = ???
}
