package java.nio.file

import java.lang.{Enum, Object, String}

// The result type of a FileVisitor.
class FileVisitResult private (name: String, ordinal: Int) extends Enum[FileVisitResult](name, ordinal) {
}

object FileVisitResult {
    // Continue.
    final val CONTINUE = new FileVisitResult(CONTINUE, 0)

    // Continue without visiting the siblings of this file or directory.
    final val SKIP_SIBLINGS = new FileVisitResult(SKIP_SIBLINGS, 1)

    // Continue without visiting the entries in this directory.
    final val SKIP_SUBTREE = new FileVisitResult(SKIP_SUBTREE, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): FileVisitResult = ???
}
