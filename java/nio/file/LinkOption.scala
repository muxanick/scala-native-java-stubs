package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the options as to how symbolic links are handled. */
class LinkOption private (name: String, ordinal: Int) extends Enum[LinkOption](name, ordinal) with OpenOption with CopyOption {
}

object LinkOption {
    /** Do not follow symbolic links. */
    final val NOFOLLOW_LINKS = new LinkOption(NOFOLLOW_LINKS, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): LinkOption = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[LinkOption] = ???
}
