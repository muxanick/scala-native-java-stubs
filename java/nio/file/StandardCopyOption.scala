package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the standard copy options. */
class StandardCopyOption private (name: String, ordinal: Int) extends Enum[StandardCopyOption](name, ordinal) with CopyOption {
}

object StandardCopyOption {
    /** Move the file as an atomic file system operation. */
    final val ATOMIC_MOVE: StandardCopyOption = new StandardCopyOption("ATOMIC_MOVE", 0)

    /** Copy attributes to the new file. */
    final val COPY_ATTRIBUTES: StandardCopyOption = new StandardCopyOption("COPY_ATTRIBUTES", 1)

    /** Replace an existing file if it exists. */
    final val REPLACE_EXISTING: StandardCopyOption = new StandardCopyOption("REPLACE_EXISTING", 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): StandardCopyOption = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[StandardCopyOption] = ???
}
