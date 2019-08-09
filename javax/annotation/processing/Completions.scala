package javax.annotation.processing

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Utility class for assembling Completion objects. */
class Completions extends Object {
}

object Completions {
    /** Returns a completion of the value and an empty message */
    @stub
    def of(value: String): Completion = ???

    /** Returns a completion of the value and message. */
    @stub
    def of(value: String, message: String): Completion = ???
}
