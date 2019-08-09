package java.nio.file

import java.io.IOException
import java.lang.Object
import java.nio.file.attribute.BasicFileAttributes

// A simple visitor of files with default behavior to visit all files and to
// re-throw I/O errors.
//
//  Methods in this class may be overridden subject to their general contract.
class SimpleFileVisitor[T] extends Object with FileVisitor[T] {

    @stub
    // Invoked for a directory after entries in the directory, and all of their
    // descendants, have been visited.
    def postVisitDirectory(dir: T, exc: IOException): FileVisitResult = ???

    @stub
    // Invoked for a directory before entries in the directory are visited.
    def preVisitDirectory(dir: T, attrs: BasicFileAttributes): FileVisitResult = ???

    @stub
    // Invoked for a file in a directory.
    def visitFile(file: T, attrs: BasicFileAttributes): FileVisitResult = ???
}
