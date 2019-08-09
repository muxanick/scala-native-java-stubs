package java.nio.file

import java.lang.{Enum, Object, String}

// Defines the options as to how symbolic links are handled.
class LinkOption private (name: String, ordinal: Int) extends Enum[LinkOption](name, ordinal) with OpenOption, with CopyOption {
}

object LinkOption {
    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): LinkOption = ???
}
