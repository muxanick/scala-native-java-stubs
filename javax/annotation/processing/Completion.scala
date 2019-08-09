package javax.annotation.processing

import java.lang.String

/** A suggested completion for an
 *  annotation.  A completion is text meant to be inserted into a
 *  program as part of an annotation.
 */
trait Completion {

    /** Returns an informative message about the completion. */
    @stub
    def getMessage(): String = ???
}
