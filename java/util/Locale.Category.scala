package java.util

import java.lang.{Enum, Object, String}

// Enum for locale categories.  These locale categories are used to get/set
// the default locale for the specific functionality represented by the
// category.
class Locale.Category private (name: String, ordinal: Int) extends Enum[Locale.Category](name, ordinal) {
}

object Locale.Category {
    // Category used to represent the default locale for
    // displaying user interfaces.
    final val DISPLAY = new Locale.Category(DISPLAY, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Locale.Category = ???
}
