package java.nio.file.attribute

import java.lang.Object

// Basic attributes associated with a file in a file system.
//
//  Basic file attributes are attributes that are common to many file systems
// and consist of mandatory and optional file attributes as defined by this
// interface.
//
//  Usage Example:
// 
//    Path file = ...
//    BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
// 
trait BasicFileAttributes {

    @stub
    // Returns the creation time.
    def creationTime(): FileTime = ???

    @stub
    // Returns an object that uniquely identifies the given file, or null if a file key is not available.
    def fileKey(): Object = ???

    @stub
    // Tells whether the file is a directory.
    def isDirectory(): Boolean = ???

    @stub
    // Tells whether the file is something other than a regular file, directory,
    // or symbolic link.
    def isOther(): Boolean = ???

    @stub
    // Tells whether the file is a regular file with opaque content.
    def isRegularFile(): Boolean = ???

    @stub
    // Tells whether the file is a symbolic link.
    def isSymbolicLink(): Boolean = ???

    @stub
    // Returns the time of last access.
    def lastAccessTime(): FileTime = ???

    @stub
    // Returns the time of last modification.
    def lastModifiedTime(): FileTime = ???
}
