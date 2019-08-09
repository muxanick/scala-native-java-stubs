package java.nio.file

import java.io.IOException
import java.lang.Object
import java.nio.file.attribute.BasicFileAttributes
import scala.scalanative.annotation.stub

/** A simple visitor of files with default behavior to visit all files and to
 *  re-throw I/O errors.
 * 
 *   Methods in this class may be overridden subject to their general contract.
 */
class SimpleFileVisitor[T] extends Object with FileVisitor[T] {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Invoked for a directory after entries in the directory, and all of their
     *  descendants, have been visited.
     */
    @stub
    def postVisitDirectory(dir: T, exc: IOException): FileVisitResult = ???

    /** Invoked for a directory before entries in the directory are visited. */
    @stub
    def preVisitDirectory(dir: T, attrs: BasicFileAttributes): FileVisitResult = ???

    /** Invoked for a file in a directory. */
    @stub
    def visitFile(file: T, attrs: BasicFileAttributes): FileVisitResult = ???

    /** Invoked for a file that could not be visited. */
    @stub
    def visitFileFailed(file: T, exc: IOException): FileVisitResult = ???
}
