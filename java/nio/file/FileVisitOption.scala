package java.nio.file

import java.lang.{Enum, Object, String}

// Defines the file tree traversal options.
class FileVisitOption private (name: String, ordinal: Int) extends Enum[FileVisitOption](name, ordinal) {
}

object FileVisitOption {
    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): FileVisitOption = ???
}
