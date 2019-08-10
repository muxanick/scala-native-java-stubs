package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the file tree traversal options. */
class FileVisitOption private (name: String, ordinal: Int) extends Enum[FileVisitOption](name, ordinal) {
}

object FileVisitOption {
    /** Follow symbolic links. */
    final val FOLLOW_LINKS: FileVisitOption = new FileVisitOption("FOLLOW_LINKS", 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FileVisitOption = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[FileVisitOption] = ???
}
