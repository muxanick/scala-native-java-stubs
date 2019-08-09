package java.nio.file

import java.lang.{Enum, Object, String}

/** Defines the standard copy options. */
class StandardCopyOption private (name: String, ordinal: Int) extends Enum[StandardCopyOption](name, ordinal) with CopyOption {
}

object StandardCopyOption {
    /** Move the file as an atomic file system operation. */
    final val ATOMIC_MOVE = new StandardCopyOption(ATOMIC_MOVE, 0)

    /** Copy attributes to the new file. */
    final val COPY_ATTRIBUTES = new StandardCopyOption(COPY_ATTRIBUTES, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): StandardCopyOption = ???
}
