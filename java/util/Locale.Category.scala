package java.util

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enum for locale categories.  These locale categories are used to get/set
 *  the default locale for the specific functionality represented by the
 *  category.
 */
class Locale.Category private (name: String, ordinal: Int) extends Enum[Locale.Category](name, ordinal) {
}

object Locale.Category {
    /** Category used to represent the default locale for
     *  displaying user interfaces.
     */
    final val DISPLAY = new Locale.Category(DISPLAY, 0)

    /** Category used to represent the default locale for
     *  formatting dates, numbers, and/or currencies.
     */
    final val FORMAT = new Locale.Category(FORMAT, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Locale.Category = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Locale.Category] = ???
}
