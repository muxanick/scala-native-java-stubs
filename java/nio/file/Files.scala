package java.nio.file

import java.io.{BufferedReader, BufferedWriter, InputStream, OutputStream}
import java.lang.{CharSequence, Class, Iterable, Object, String}
import java.nio.channels.SeekableByteChannel
import java.nio.charset.Charset
import java.nio.file.attribute.{BasicFileAttributes, FileAttribute, FileAttributeView, FileTime, PosixFilePermission, UserPrincipal}
import java.util.{List, Map, Set}
import java.util.function.BiPredicate
import java.util.stream.Stream
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods that operate on files,
 *  directories, or other types of files.
 * 
 *   In most cases, the methods defined here will delegate to the associated
 *  file system provider to perform the file operations.
 */
final class Files extends Object {
}

object Files {
    /** Copies all bytes from an input stream to a file. */
    @stub
    def copy(in: InputStream, target: Path, options: CopyOption*): Long = ???

    /** Copies all bytes from a file to an output stream. */
    @stub
    def copy(source: Path, out: OutputStream): Long = ???

    /** Copy a file to a target file. */
    @stub
    def copy(source: Path, target: Path, options: CopyOption*): Path = ???

    /** Creates a directory by creating all nonexistent parent directories first. */
    @stub
    def createDirectories(dir: Path, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new directory. */
    @stub
    def createDirectory(dir: Path, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new and empty file, failing if the file already exists. */
    @stub
    def createFile(path: Path, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new link (directory entry) for an existing file (optional
     *  operation).
     */
    @stub
    def createLink(link: Path, existing: Path): Path = ???

    /** Creates a symbolic link to a target (optional operation). */
    @stub
    def createSymbolicLink(link: Path, target: Path, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new directory in the specified directory, using the given
     *  prefix to generate its name.
     */
    @stub
    def createTempDirectory(dir: Path, prefix: String, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new directory in the default temporary-file directory, using
     *  the given prefix to generate its name.
     */
    @stub
    def createTempDirectory(prefix: String, attrs: FileAttribute[_]*): Path = ???

    /** Creates a new empty file in the specified directory, using the given
     *  prefix and suffix strings to generate its name.
     */
    @stub
    def createTempFile(dir: Path, prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

    /** Creates an empty file in the default temporary-file directory, using
     *  the given prefix and suffix to generate its name.
     */
    @stub
    def createTempFile(prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

    /** Deletes a file. */
    @stub
    def delete(path: Path): Unit = ???

    /** Deletes a file if it exists. */
    @stub
    def deleteIfExists(path: Path): Boolean = ???

    /** Tests whether a file exists. */
    @stub
    def exists(path: Path, options: LinkOption*): Boolean = ???

    /** Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a given starting
     *  file.
     */
    @stub
    def find(start: Path, maxDepth: Int, matcher: BiPredicate[Path, BasicFileAttributes], options: FileVisitOption*): Stream[Path] = ???

    /** Reads the value of a file attribute. */
    @stub
    def getAttribute(path: Path, attribute: String, options: LinkOption*): Any = ???

    /** Returns a file attribute view of a given type. */
    @stub
    def getFileAttributeView[V <: FileAttributeView](path: Path, type: Class[V], options: LinkOption*): V = ???

    /** Returns the FileStore representing the file store where a file
     *  is located.
     */
    @stub
    def getFileStore(path: Path): FileStore = ???

    /** Returns a file's last modified time. */
    @stub
    def getLastModifiedTime(path: Path, options: LinkOption*): FileTime = ???

    /** Returns the owner of a file. */
    @stub
    def getOwner(path: Path, options: LinkOption*): UserPrincipal = ???

    /** Returns a file's POSIX file permissions. */
    @stub
    def getPosixFilePermissions(path: Path, options: LinkOption*): Set[PosixFilePermission] = ???

    /** Tests whether a file is a directory. */
    @stub
    def isDirectory(path: Path, options: LinkOption*): Boolean = ???

    /** Tests whether a file is executable. */
    @stub
    def isExecutable(path: Path): Boolean = ???

    /** Tells whether or not a file is considered hidden. */
    @stub
    def isHidden(path: Path): Boolean = ???

    /** Tests whether a file is readable. */
    @stub
    def isReadable(path: Path): Boolean = ???

    /** Tests whether a file is a regular file with opaque content. */
    @stub
    def isRegularFile(path: Path, options: LinkOption*): Boolean = ???

    /** Tests if two paths locate the same file. */
    @stub
    def isSameFile(path: Path, path2: Path): Boolean = ???

    /** Tests whether a file is a symbolic link. */
    @stub
    def isSymbolicLink(path: Path): Boolean = ???

    /** Tests whether a file is writable. */
    @stub
    def isWritable(path: Path): Boolean = ???

    /** Read all lines from a file as a Stream. */
    @stub
    def lines(path: Path): Stream[String] = ???

    /** Read all lines from a file as a Stream. */
    @stub
    def lines(path: Path, cs: Charset): Stream[String] = ???

    /** Return a lazily populated Stream, the elements of
     *  which are the entries in the directory.
     */
    @stub
    def list(dir: Path): Stream[Path] = ???

    /** Move or rename a file to a target file. */
    @stub
    def move(source: Path, target: Path, options: CopyOption*): Path = ???

    /** Opens a file for reading, returning a BufferedReader to read text
     *  from the file in an efficient manner.
     */
    @stub
    def newBufferedReader(path: Path): BufferedReader = ???

    /** Opens a file for reading, returning a BufferedReader that may be
     *  used to read text from the file in an efficient manner.
     */
    @stub
    def newBufferedReader(path: Path, cs: Charset): BufferedReader = ???

    /** Opens or creates a file for writing, returning a BufferedWriter
     *  that may be used to write text to the file in an efficient manner.
     */
    @stub
    def newBufferedWriter(path: Path, cs: Charset, options: OpenOption*): BufferedWriter = ???

    /** Opens or creates a file for writing, returning a BufferedWriter
     *  to write text to the file in an efficient manner.
     */
    @stub
    def newBufferedWriter(path: Path, options: OpenOption*): BufferedWriter = ???

    /** Opens or creates a file, returning a seekable byte channel to access the
     *  file.
     */
    @stub
    def newByteChannel(path: Path, options: OpenOption*): SeekableByteChannel = ???

    /** Opens or creates a file, returning a seekable byte channel to access the
     *  file.
     */
    @stub
    def newByteChannel(path: Path, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel = ???

    /** Opens a directory, returning a DirectoryStream to iterate over
     *  all entries in the directory.
     */
    @stub
    def newDirectoryStream(dir: Path): DirectoryStream[Path] = ???

    /** Opens a directory, returning a DirectoryStream to iterate over
     *  the entries in the directory.
     */
    @stub
    def newDirectoryStream(dir: Path, filter: DirectoryStream.Filter[_ >: Path]): DirectoryStream[Path] = ???

    /** Opens a directory, returning a DirectoryStream to iterate over
     *  the entries in the directory.
     */
    @stub
    def newDirectoryStream(dir: Path, glob: String): DirectoryStream[Path] = ???

    /** Opens a file, returning an input stream to read from the file. */
    @stub
    def newInputStream(path: Path, options: OpenOption*): InputStream = ???

    /** Opens or creates a file, returning an output stream that may be used to
     *  write bytes to the file.
     */
    @stub
    def newOutputStream(path: Path, options: OpenOption*): OutputStream = ???

    /** Tests whether the file located by this path does not exist. */
    @stub
    def notExists(path: Path, options: LinkOption*): Boolean = ???

    /** Probes the content type of a file. */
    @stub
    def probeContentType(path: Path): String = ???

    /** Reads all the bytes from a file. */
    @stub
    def readAllBytes(path: Path): Array[Byte] = ???

    /** Read all lines from a file. */
    @stub
    def readAllLines(path: Path): List[String] = ???

    /** Read all lines from a file. */
    @stub
    def readAllLines(path: Path, cs: Charset): List[String] = ???

    /** Reads a file's attributes as a bulk operation. */
    @stub
    def readAttributes[A <: BasicFileAttributes](path: Path, type: Class[A], options: LinkOption*): A = ???

    /** Reads a set of file attributes as a bulk operation. */
    @stub
    def readAttributes(path: Path, attributes: String, options: LinkOption*): Map[String, Object] = ???

    /** Reads the target of a symbolic link (optional operation). */
    @stub
    def readSymbolicLink(link: Path): Path = ???

    /** Sets the value of a file attribute. */
    @stub
    def setAttribute(path: Path, attribute: String, value: Any, options: LinkOption*): Path = ???

    /** Updates a file's last modified time attribute. */
    @stub
    def setLastModifiedTime(path: Path, time: FileTime): Path = ???

    /** Updates the file owner. */
    @stub
    def setOwner(path: Path, owner: UserPrincipal): Path = ???

    /** Sets a file's POSIX permissions. */
    @stub
    def setPosixFilePermissions(path: Path, perms: Set[PosixFilePermission]): Path = ???

    /** Returns the size of a file (in bytes). */
    @stub
    def size(path: Path): Long = ???

    /** Return a Stream that is lazily populated with Path by walking the file tree rooted at a given starting file. */
    @stub
    def walk(start: Path, options: FileVisitOption*): Stream[Path] = ???

    /** Return a Stream that is lazily populated with Path by walking the file tree rooted at a given starting file. */
    @stub
    def walk(start: Path, maxDepth: Int, options: FileVisitOption*): Stream[Path] = ???

    /** Walks a file tree. */
    @stub
    def walkFileTree(start: Path, visitor: FileVisitor[_ >: Path]): Path = ???

    /** Walks a file tree. */
    @stub
    def walkFileTree(start: Path, options: Set[FileVisitOption], maxDepth: Int, visitor: FileVisitor[_ >: Path]): Path = ???

    /** Writes bytes to a file. */
    @stub
    def write(path: Path, bytes: Array[Byte], options: OpenOption*): Path = ???

    /** Write lines of text to a file. */
    @stub
    def write(path: Path, lines: Iterable[_ <: CharSequence], cs: Charset, options: OpenOption*): Path = ???

    /** Write lines of text to a file. */
    @stub
    def write(path: Path, lines: Iterable[_ <: CharSequence], options: OpenOption*): Path = ???
}
