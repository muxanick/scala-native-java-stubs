package javax.annotation.processing

import java.lang.{Object, String}

// Utility class for assembling Completion objects.
class Completions extends Object {
}

object Completions {
    @stub
    // Returns a completion of the value and an empty message
    def of(value: String): Completion = ???
}
