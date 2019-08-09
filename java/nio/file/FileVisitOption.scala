package java.nio.file

import java.lang.{Enum, Object, String}

/** Defines the file tree traversal options. */
class FileVisitOption private (name: String, ordinal: Int) extends Enum[FileVisitOption](name, ordinal) {
}

object FileVisitOption {
    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FileVisitOption = ???
}
