package java.nio.file.attribute

// File attributes associated with a file in a file system that supports
// legacy "DOS" attributes.
//
//  Usage Example:
// 
//    Path file = ...
//    DosFileAttributes attrs = Files.readAttributes(file, DosFileAttributes.class);
// 
trait DosFileAttributes extends BasicFileAttributes {

    @stub
    // Returns the value of the archive attribute.
    def isArchive(): Boolean = ???

    @stub
    // Returns the value of the hidden attribute.
    def isHidden(): Boolean = ???

    @stub
    // Returns the value of the read-only attribute.
    def isReadOnly(): Boolean = ???
}
