package java.nio.file

import java.io.{BufferedReader, BufferedWriter, InputStream, OutputStream}
import java.lang.{CharSequence, Class, Iterable, Object, String}
import java.nio.channels.SeekableByteChannel
import java.nio.charset.Charset
import java.nio.file.attribute.{BasicFileAttributes, FileAttribute, FileAttributeView, FileTime, PosixFilePermission, UserPrincipal}
import java.util.{List, Map, Set}
import java.util.function.BiPredicate
import java.util.stream.Stream

// This class consists exclusively of static methods that operate on files,
// directories, or other types of files.
//
//  In most cases, the methods defined here will delegate to the associated
// file system provider to perform the file operations.
final class Files extends Object {
}

object Files {
    @stub
    // Copies all bytes from an input stream to a file.
    def copy(in: InputStream, target: Path, options: CopyOption*): Long = ???

    @stub
    // Copies all bytes from a file to an output stream.
    def copy(source: Path, out: OutputStream): Long = ???

    @stub
    // Copy a file to a target file.
    def copy(source: Path, target: Path, options: CopyOption*): Path = ???

    @stub
    // Creates a directory by creating all nonexistent parent directories first.
    def createDirectories(dir: Path, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new directory.
    def createDirectory(dir: Path, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new and empty file, failing if the file already exists.
    def createFile(path: Path, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new link (directory entry) for an existing file (optional
    // operation).
    def createLink(link: Path, existing: Path): Path = ???

    @stub
    // Creates a symbolic link to a target (optional operation).
    def createSymbolicLink(link: Path, target: Path, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new directory in the specified directory, using the given
    // prefix to generate its name.
    def createTempDirectory(dir: Path, prefix: String, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new directory in the default temporary-file directory, using
    // the given prefix to generate its name.
    def createTempDirectory(prefix: String, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates a new empty file in the specified directory, using the given
    // prefix and suffix strings to generate its name.
    def createTempFile(dir: Path, prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Creates an empty file in the default temporary-file directory, using
    // the given prefix and suffix to generate its name.
    def createTempFile(prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

    @stub
    // Deletes a file.
    def delete(path: Path): Unit = ???

    @stub
    // Deletes a file if it exists.
    def deleteIfExists(path: Path): Boolean = ???

    @stub
    // Tests whether a file exists.
    def exists(path: Path, options: LinkOption*): Boolean = ???

    @stub
    // Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a given starting
    // file.
    def find(start: Path, maxDepth: Int, matcher: BiPredicate[Path, BasicFileAttributes], options: FileVisitOption*): Stream[Path] = ???

    @stub
    // Reads the value of a file attribute.
    def getAttribute(path: Path, attribute: String, options: LinkOption*): Object = ???

    @stub
    // Returns a file attribute view of a given type.
    def V: [V <: FileAttributeView] = ???

    @stub
    // Returns the FileStore representing the file store where a file
    // is located.
    def getFileStore(path: Path): FileStore = ???

    @stub
    // Returns a file's last modified time.
    def getLastModifiedTime(path: Path, options: LinkOption*): FileTime = ???

    @stub
    // Returns the owner of a file.
    def getOwner(path: Path, options: LinkOption*): UserPrincipal = ???

    @stub
    // Returns a file's POSIX file permissions.
    def getPosixFilePermissions(path: Path, options: LinkOption*): Set[PosixFilePermission] = ???

    @stub
    // Tests whether a file is a directory.
    def isDirectory(path: Path, options: LinkOption*): Boolean = ???

    @stub
    // Tests whether a file is executable.
    def isExecutable(path: Path): Boolean = ???

    @stub
    // Tells whether or not a file is considered hidden.
    def isHidden(path: Path): Boolean = ???

    @stub
    // Tests whether a file is readable.
    def isReadable(path: Path): Boolean = ???

    @stub
    // Tests whether a file is a regular file with opaque content.
    def isRegularFile(path: Path, options: LinkOption*): Boolean = ???

    @stub
    // Tests if two paths locate the same file.
    def isSameFile(path: Path, path2: Path): Boolean = ???

    @stub
    // Tests whether a file is a symbolic link.
    def isSymbolicLink(path: Path): Boolean = ???

    @stub
    // Tests whether a file is writable.
    def isWritable(path: Path): Boolean = ???

    @stub
    // Read all lines from a file as a Stream.
    def lines(path: Path): Stream[String] = ???

    @stub
    // Read all lines from a file as a Stream.
    def lines(path: Path, cs: Charset): Stream[String] = ???

    @stub
    // Return a lazily populated Stream, the elements of
    // which are the entries in the directory.
    def list(dir: Path): Stream[Path] = ???

    @stub
    // Move or rename a file to a target file.
    def move(source: Path, target: Path, options: CopyOption*): Path = ???

    @stub
    // Opens a file for reading, returning a BufferedReader to read text
    // from the file in an efficient manner.
    def newBufferedReader(path: Path): BufferedReader = ???

    @stub
    // Opens a file for reading, returning a BufferedReader that may be
    // used to read text from the file in an efficient manner.
    def newBufferedReader(path: Path, cs: Charset): BufferedReader = ???

    @stub
    // Opens or creates a file for writing, returning a BufferedWriter
    // that may be used to write text to the file in an efficient manner.
    def newBufferedWriter(path: Path, cs: Charset, options: OpenOption*): BufferedWriter = ???

    @stub
    // Opens or creates a file for writing, returning a BufferedWriter
    // to write text to the file in an efficient manner.
    def newBufferedWriter(path: Path, options: OpenOption*): BufferedWriter = ???

    @stub
    // Opens or creates a file, returning a seekable byte channel to access the
    // file.
    def newByteChannel(path: Path, options: OpenOption*): SeekableByteChannel = ???

    @stub
    // Opens or creates a file, returning a seekable byte channel to access the
    // file.
    def newByteChannel(path: Path, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel = ???

    @stub
    // Opens a directory, returning a DirectoryStream to iterate over
    // all entries in the directory.
    def newDirectoryStream(dir: Path): DirectoryStream[Path] = ???

    @stub
    // Opens a directory, returning a DirectoryStream to iterate over
    // the entries in the directory.
    def newDirectoryStream(dir: Path, filter: DirectoryStream.Filter[_ >: Path]): DirectoryStream[Path] = ???

    @stub
    // Opens a directory, returning a DirectoryStream to iterate over
    // the entries in the directory.
    def newDirectoryStream(dir: Path, glob: String): DirectoryStream[Path] = ???

    @stub
    // Opens a file, returning an input stream to read from the file.
    def newInputStream(path: Path, options: OpenOption*): InputStream = ???

    @stub
    // Opens or creates a file, returning an output stream that may be used to
    // write bytes to the file.
    def newOutputStream(path: Path, options: OpenOption*): OutputStream = ???

    @stub
    // Tests whether the file located by this path does not exist.
    def notExists(path: Path, options: LinkOption*): Boolean = ???

    @stub
    // Probes the content type of a file.
    def probeContentType(path: Path): String = ???

    @stub
    // Reads all the bytes from a file.
    def readAllBytes(path: Path): Array[Byte] = ???

    @stub
    // Read all lines from a file.
    def readAllLines(path: Path): List[String] = ???

    @stub
    // Read all lines from a file.
    def readAllLines(path: Path, cs: Charset): List[String] = ???

    @stub
    // Reads a file's attributes as a bulk operation.
    def A: [A <: BasicFileAttributes] = ???

    @stub
    // Reads a set of file attributes as a bulk operation.
    def readAttributes(path: Path, attributes: String, options: LinkOption*): Map[String, Object] = ???

    @stub
    // Reads the target of a symbolic link (optional operation).
    def readSymbolicLink(link: Path): Path = ???

    @stub
    // Sets the value of a file attribute.
    def setAttribute(path: Path, attribute: String, value: Object, options: LinkOption*): Path = ???

    @stub
    // Updates a file's last modified time attribute.
    def setLastModifiedTime(path: Path, time: FileTime): Path = ???

    @stub
    // Updates the file owner.
    def setOwner(path: Path, owner: UserPrincipal): Path = ???

    @stub
    // Sets a file's POSIX permissions.
    def setPosixFilePermissions(path: Path, perms: Set[PosixFilePermission]): Path = ???

    @stub
    // Returns the size of a file (in bytes).
    def size(path: Path): Long = ???

    @stub
    // Return a Stream that is lazily populated with Path by walking the file tree rooted at a given starting file.
    def walk(start: Path, options: FileVisitOption*): Stream[Path] = ???

    @stub
    // Return a Stream that is lazily populated with Path by walking the file tree rooted at a given starting file.
    def walk(start: Path, maxDepth: Int, options: FileVisitOption*): Stream[Path] = ???

    @stub
    // Walks a file tree.
    def walkFileTree(start: Path, visitor: FileVisitor[_ >: Path]): Path = ???

    @stub
    // Walks a file tree.
    def walkFileTree(start: Path, options: Set[FileVisitOption], maxDepth: Int, visitor: FileVisitor[_ >: Path]): Path = ???

    @stub
    // Writes bytes to a file.
    def write(path: Path, bytes: Array[Byte], options: OpenOption*): Path = ???

    @stub
    // Write lines of text to a file.
    def write(path: Path, lines: Iterable[_ <: CharSequence], cs: Charset, options: OpenOption*): Path = ???
}
