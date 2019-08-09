package java.nio.file.attribute

/** File attributes associated with a file in a file system that supports
 *  legacy "DOS" attributes.
 * 
 *   Usage Example:
 *  
 *     Path file = ...
 *     DosFileAttributes attrs = Files.readAttributes(file, DosFileAttributes.class);
 *  
 */
trait DosFileAttributes extends BasicFileAttributes {

    /** Returns the value of the archive attribute. */
    @stub
    def isArchive(): Boolean = ???

    /** Returns the value of the hidden attribute. */
    @stub
    def isHidden(): Boolean = ???

    /** Returns the value of the read-only attribute. */
    @stub
    def isReadOnly(): Boolean = ???
}
