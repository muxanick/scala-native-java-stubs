package java.nio.file.attribute

/** File attributes associated with files on file systems used by operating systems
 *  that implement the Portable Operating System Interface (POSIX) family of
 *  standards.
 * 
 *   The POSIX attributes of a file are retrieved using a PosixFileAttributeView by invoking its readAttributes method.
 */
trait PosixFileAttributes extends BasicFileAttributes {

    /** Returns the group owner of the file. */
    @stub
    def group(): GroupPrincipal = ???

    /** Returns the owner of the file. */
    @stub
    def owner(): UserPrincipal = ???
}
