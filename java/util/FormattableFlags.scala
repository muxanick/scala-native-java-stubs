package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** FomattableFlags are passed to the Formattable.formatTo() method and modify the output format for Formattables.  Implementations of Formattable are
 *  responsible for interpreting and validating any flags.
 */
class FormattableFlags extends Object {
}

object FormattableFlags {
    /** Requires the output to use an alternate form. */
    @stub
    val ALTERNATE: Int = ???

    /** Left-justifies the output. */
    @stub
    val LEFT_JUSTIFY: Int = ???

    /** Converts the output to upper case according to the rules of the
     *  locale given during creation of the
     *  formatter argument of the formatTo() method.
     */
    @stub
    val UPPERCASE: Int = ???
}
