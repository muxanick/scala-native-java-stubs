package java.nio.file.attribute

import java.lang.Object

/** Basic attributes associated with a file in a file system.
 * 
 *   Basic file attributes are attributes that are common to many file systems
 *  and consist of mandatory and optional file attributes as defined by this
 *  interface.
 * 
 *   Usage Example:
 *  
 *     Path file = ...
 *     BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
 *  
 */
trait BasicFileAttributes {

    /** Returns the creation time. */
    @stub
    def creationTime(): FileTime = ???

    /** Returns an object that uniquely identifies the given file, or null if a file key is not available. */
    @stub
    def fileKey(): Object = ???

    /** Tells whether the file is a directory. */
    @stub
    def isDirectory(): Boolean = ???

    /** Tells whether the file is something other than a regular file, directory,
     *  or symbolic link.
     */
    @stub
    def isOther(): Boolean = ???

    /** Tells whether the file is a regular file with opaque content. */
    @stub
    def isRegularFile(): Boolean = ???

    /** Tells whether the file is a symbolic link. */
    @stub
    def isSymbolicLink(): Boolean = ???

    /** Returns the time of last access. */
    @stub
    def lastAccessTime(): FileTime = ???

    /** Returns the time of last modification. */
    @stub
    def lastModifiedTime(): FileTime = ???
}
