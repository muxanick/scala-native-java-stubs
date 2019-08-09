package java.util

import java.lang.Object

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
}
