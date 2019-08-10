package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The result type of a FileVisitor. */
class FileVisitResult private (name: String, ordinal: Int) extends Enum[FileVisitResult](name, ordinal) {
}

object FileVisitResult {
    /** Continue. */
    final val CONTINUE: FileVisitResult = new FileVisitResult("CONTINUE", 0)

    /** Continue without visiting the siblings of this file or directory. */
    final val SKIP_SIBLINGS: FileVisitResult = new FileVisitResult("SKIP_SIBLINGS", 1)

    /** Continue without visiting the entries in this directory. */
    final val SKIP_SUBTREE: FileVisitResult = new FileVisitResult("SKIP_SUBTREE", 2)

    /** Terminate. */
    final val TERMINATE: FileVisitResult = new FileVisitResult("TERMINATE", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FileVisitResult = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[FileVisitResult] = ???
}
