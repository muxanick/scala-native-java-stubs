package java.io

import java.lang.{Comparable, Object, String}
import java.net.URI
import java.nio.file.Path

// An abstract representation of file and directory pathnames.
//
//  User interfaces and operating systems use system-dependent pathname
// strings to name files and directories.  This class presents an
// abstract, system-independent view of hierarchical pathnames.  An
// abstract pathname has two components:
//
// 
//  An optional system-dependent prefix string,
//      such as a disk-drive specifier, "/" for the UNIX root
//      directory, or "\\\\" for a Microsoft Windows UNC pathname, and
//  A sequence of zero or more string names.
// 
//
// The first name in an abstract pathname may be a directory name or, in the
// case of Microsoft Windows UNC pathnames, a hostname.  Each subsequent name
// in an abstract pathname denotes a directory; the last name may denote
// either a directory or a file.  The empty abstract pathname has no
// prefix and an empty name sequence.
//
//  The conversion of a pathname string to or from an abstract pathname is
// inherently system-dependent.  When an abstract pathname is converted into a
// pathname string, each name is separated from the next by a single copy of
// the default separator character.  The default name-separator
// character is defined by the system property file.separator, and
// is made available in the public static fields separator and separatorChar of this class.
// When a pathname string is converted into an abstract pathname, the names
// within it may be separated by the default name-separator character or by any
// other name-separator character that is supported by the underlying system.
//
//  A pathname, whether abstract or in string form, may be either
// absolute or relative.  An absolute pathname is complete in
// that no other information is required in order to locate the file that it
// denotes.  A relative pathname, in contrast, must be interpreted in terms of
// information taken from some other pathname.  By default the classes in the
// java.io package always resolve relative pathnames against the
// current user directory.  This directory is named by the system property
// user.dir, and is typically the directory in which the Java
// virtual machine was invoked.
//
//  The parent of an abstract pathname may be obtained by invoking
// the getParent() method of this class and consists of the pathname's
// prefix and each name in the pathname's name sequence except for the last.
// Each directory's absolute pathname is an ancestor of any File
// object with an absolute abstract pathname which begins with the directory's
// absolute pathname.  For example, the directory denoted by the abstract
// pathname "/usr" is an ancestor of the directory denoted by the
// pathname "/usr/local/bin".
//
//  The prefix concept is used to handle root directories on UNIX platforms,
// and drive specifiers, root directories and UNC pathnames on Microsoft Windows platforms,
// as follows:
//
// 
//
//  For UNIX platforms, the prefix of an absolute pathname is always
// "/".  Relative pathnames have no prefix.  The abstract pathname
// denoting the root directory has the prefix "/" and an empty
// name sequence.
//
//  For Microsoft Windows platforms, the prefix of a pathname that contains a drive
// specifier consists of the drive letter followed by ":" and
// possibly followed by "\\" if the pathname is absolute.  The
// prefix of a UNC pathname is "\\\\"; the hostname and the share
// name are the first two names in the name sequence.  A relative pathname that
// does not specify a drive has no prefix.
//
// 
//
//  Instances of this class may or may not denote an actual file-system
// object such as a file or a directory.  If it does denote such an object
// then that object resides in a partition.  A partition is an
// operating system-specific portion of storage for a file system.  A single
// storage device (e.g. a physical disk-drive, flash memory, CD-ROM) may
// contain multiple partitions.  The object, if any, will reside on the
// partition named by some ancestor of the absolute
// form of this pathname.
//
//  A file system may implement restrictions to certain operations on the
// actual file-system object, such as reading, writing, and executing.  These
// restrictions are collectively known as access permissions.  The file
// system may have multiple sets of access permissions on a single object.
// For example, one set may apply to the object's owner, and another
// may apply to all other users.  The access permissions on an object may
// cause some methods in this class to fail.
//
//  Instances of the File class are immutable; that is, once
// created, the abstract pathname represented by a File object
// will never change.
//
// Interoperability with java.nio.file package
//
//  The java.nio.file
// package defines interfaces and classes for the Java virtual machine to access
// files, file attributes, and file systems. This API may be used to overcome
// many of the limitations of the java.io.File class.
// The toPath method may be used to obtain a Path that uses the abstract path represented by a File object to
// locate a file. The resulting Path may be used with the Files class to provide more efficient and extensive access to
// additional file operations, file attributes, and I/O exceptions to help
// diagnose errors when an operation on a file fails.
class File extends Object with Serializable, with Comparable[File] {

    @stub
    // Creates a new File instance from a parent abstract
    // pathname and a child pathname string.
    def this(parent: File, child: String) = ???

    @stub
    // Creates a new File instance by converting the given
    // pathname string into an abstract pathname.
    def this(pathname: String) = ???

    @stub
    // Creates a new File instance from a parent pathname string
    // and a child pathname string.
    def this(parent: String, child: String) = ???

    @stub
    // Tests whether the application can execute the file denoted by this
    // abstract pathname.
    def canExecute(): Boolean = ???

    @stub
    // Tests whether the application can read the file denoted by this
    // abstract pathname.
    def canRead(): Boolean = ???

    @stub
    // Tests whether the application can modify the file denoted by this
    // abstract pathname.
    def canWrite(): Boolean = ???

    @stub
    // Compares two abstract pathnames lexicographically.
    def compareTo(pathname: File): Int = ???

    @stub
    // Atomically creates a new, empty file named by this abstract pathname if
    // and only if a file with this name does not yet exist.
    def createNewFile(): Boolean = ???

    @stub
    // Deletes the file or directory denoted by this abstract pathname.
    def delete(): Boolean = ???

    @stub
    // Requests that the file or directory denoted by this abstract
    // pathname be deleted when the virtual machine terminates.
    def deleteOnExit(): Unit = ???

    @stub
    // Tests this abstract pathname for equality with the given object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Tests whether the file or directory denoted by this abstract pathname
    // exists.
    def exists(): Boolean = ???

    @stub
    // Returns the absolute form of this abstract pathname.
    def getAbsoluteFile(): File = ???

    @stub
    // Returns the absolute pathname string of this abstract pathname.
    def getAbsolutePath(): String = ???

    @stub
    // Returns the canonical form of this abstract pathname.
    def getCanonicalFile(): File = ???

    @stub
    // Returns the canonical pathname string of this abstract pathname.
    def getCanonicalPath(): String = ???

    @stub
    // Returns the number of unallocated bytes in the partition named by this abstract path name.
    def getFreeSpace(): Long = ???

    @stub
    // Returns the name of the file or directory denoted by this abstract
    // pathname.
    def getName(): String = ???

    @stub
    // Returns the pathname string of this abstract pathname's parent, or
    // null if this pathname does not name a parent directory.
    def getParent(): String = ???

    @stub
    // Returns the abstract pathname of this abstract pathname's parent,
    // or null if this pathname does not name a parent
    // directory.
    def getParentFile(): File = ???

    @stub
    // Converts this abstract pathname into a pathname string.
    def getPath(): String = ???

    @stub
    // Returns the size of the partition named by this
    // abstract pathname.
    def getTotalSpace(): Long = ???

    @stub
    // Returns the number of bytes available to this virtual machine on the
    // partition named by this abstract pathname.
    def getUsableSpace(): Long = ???

    @stub
    // Computes a hash code for this abstract pathname.
    def hashCode(): Int = ???

    @stub
    // Tests whether this abstract pathname is absolute.
    def isAbsolute(): Boolean = ???

    @stub
    // Tests whether the file denoted by this abstract pathname is a
    // directory.
    def isDirectory(): Boolean = ???

    @stub
    // Tests whether the file denoted by this abstract pathname is a normal
    // file.
    def isFile(): Boolean = ???

    @stub
    // Tests whether the file named by this abstract pathname is a hidden
    // file.
    def isHidden(): Boolean = ???

    @stub
    // Returns the time that the file denoted by this abstract pathname was
    // last modified.
    def lastModified(): Long = ???

    @stub
    // Returns the length of the file denoted by this abstract pathname.
    def length(): Long = ???

    @stub
    // Returns an array of strings naming the files and directories in the
    // directory denoted by this abstract pathname.
    def list(): Array[String] = ???

    @stub
    // Returns an array of strings naming the files and directories in the
    // directory denoted by this abstract pathname that satisfy the specified
    // filter.
    def list(filter: FilenameFilter): Array[String] = ???

    @stub
    // Returns an array of abstract pathnames denoting the files in the
    // directory denoted by this abstract pathname.
    def listFiles(): Array[File] = ???

    @stub
    // Returns an array of abstract pathnames denoting the files and
    // directories in the directory denoted by this abstract pathname that
    // satisfy the specified filter.
    def listFiles(filter: FileFilter): Array[File] = ???

    @stub
    // Returns an array of abstract pathnames denoting the files and
    // directories in the directory denoted by this abstract pathname that
    // satisfy the specified filter.
    def listFiles(filter: FilenameFilter): Array[File] = ???

    @stub
    // Creates the directory named by this abstract pathname.
    def mkdir(): Boolean = ???

    @stub
    // Creates the directory named by this abstract pathname, including any
    // necessary but nonexistent parent directories.
    def mkdirs(): Boolean = ???

    @stub
    // Renames the file denoted by this abstract pathname.
    def renameTo(dest: File): Boolean = ???

    @stub
    // A convenience method to set the owner's execute permission for this
    // abstract pathname.
    def setExecutable(executable: Boolean): Boolean = ???

    @stub
    // Sets the owner's or everybody's execute permission for this abstract
    // pathname.
    def setExecutable(executable: Boolean, ownerOnly: Boolean): Boolean = ???

    @stub
    // Sets the last-modified time of the file or directory named by this
    // abstract pathname.
    def setLastModified(time: Long): Boolean = ???

    @stub
    // A convenience method to set the owner's read permission for this abstract
    // pathname.
    def setReadable(readable: Boolean): Boolean = ???

    @stub
    // Sets the owner's or everybody's read permission for this abstract
    // pathname.
    def setReadable(readable: Boolean, ownerOnly: Boolean): Boolean = ???

    @stub
    // Marks the file or directory named by this abstract pathname so that
    // only read operations are allowed.
    def setReadOnly(): Boolean = ???

    @stub
    // A convenience method to set the owner's write permission for this abstract
    // pathname.
    def setWritable(writable: Boolean): Boolean = ???

    @stub
    // Sets the owner's or everybody's write permission for this abstract
    // pathname.
    def setWritable(writable: Boolean, ownerOnly: Boolean): Boolean = ???

    @stub
    // Returns a java.nio.file.Path object constructed from the
    // this abstract path.
    def toPath(): Path = ???

    @stub
    // Returns the pathname string of this abstract pathname.
    def toString(): String = ???

    @stub
    // Constructs a file: URI that represents this abstract pathname.
    def toURI(): URI = ???
}

object File {
    @stub
    // The system-dependent path-separator character, represented as a string
    // for convenience.
    def pathSeparator: String = ???

    @stub
    // The system-dependent path-separator character.
    def pathSeparatorChar: Char = ???

    @stub
    // The system-dependent default name-separator character, represented as a
    // string for convenience.
    def separator: String = ???

    @stub
    // Creates an empty file in the default temporary-file directory, using
    // the given prefix and suffix to generate its name.
    def createTempFile(prefix: String, suffix: String): File = ???

    @stub
    //  Creates a new empty file in the specified directory, using the
    // given prefix and suffix strings to generate its name.
    def createTempFile(prefix: String, suffix: String, directory: File): File = ???

    @stub
    // List the available filesystem roots.
    def listRoots(): Array[File] = ???
}
