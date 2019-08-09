package java.nio.file

import java.lang.Class
import java.nio.channels.SeekableByteChannel
import java.nio.file.attribute.{FileAttribute, FileAttributeView}
import java.util.Set

/** A DirectoryStream that defines operations on files that are located
 *  relative to an open directory. A SecureDirectoryStream is intended
 *  for use by sophisticated or security sensitive applications requiring to
 *  traverse file trees or otherwise operate on directories in a race-free manner.
 *  Race conditions can arise when a sequence of file operations cannot be
 *  carried out in isolation. Each of the file operations defined by this
 *  interface specify a relative path. All access to the file is relative
 *  to the open directory irrespective of if the directory is moved or replaced
 *  by an attacker while the directory is open. A SecureDirectoryStream
 *  may also be used as a virtual working directory.
 * 
 *   A SecureDirectoryStream requires corresponding support from the
 *  underlying operating system. Where an implementation supports this features
 *  then the DirectoryStream returned by the newDirectoryStream method will be a SecureDirectoryStream and must
 *  be cast to that type in order to invoke the methods defined by this interface.
 * 
 *   In the case of the default provider, and a security manager is set, then the permission checks are
 *  performed using the path obtained by resolving the given relative path
 *  against the original path of the directory (irrespective of if the
 *  directory is moved since it was opened).
 */
trait SecureDirectoryStream[T] extends DirectoryStream[T] {

    /** Deletes a directory. */
    @stub
    def deleteDirectory(path: T): Unit = ???

    /** Deletes a file. */
    @stub
    def deleteFile(path: T): Unit = ???

    /** Returns a new file attribute view to access the file attributes of this
     *  directory.
     */
    @stub
    def getFileAttributeView[V <: FileAttributeView](type: Class[V]): V = ???

    /** Returns a new file attribute view to access the file attributes of a file
     *  in this directory.
     */
    @stub
    def getFileAttributeView[V <: FileAttributeView](path: T, type: Class[V], options: LinkOption*): V = ???

    /** Move a file from this directory to another directory. */
    @stub
    def move(srcpath: T, targetdir: SecureDirectoryStream[T], targetpath: T): Unit = ???

    /** Opens or creates a file in this directory, returning a seekable byte
     *  channel to access the file.
     */
    @stub
    def newByteChannel(path: T, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel = ???
}
