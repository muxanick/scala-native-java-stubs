package java.util

import java.lang.Object

// FomattableFlags are passed to the Formattable.formatTo() method and modify the output format for Formattables.  Implementations of Formattable are
// responsible for interpreting and validating any flags.
class FormattableFlags extends Object {
}

object FormattableFlags {
    @stub
    // Requires the output to use an alternate form.
    def ALTERNATE: Int = ???

    @stub
    // Left-justifies the output.
    def LEFT_JUSTIFY: Int = ???
}
