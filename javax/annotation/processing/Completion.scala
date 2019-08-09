package javax.annotation.processing

import java.lang.String
import scala.scalanative.annotation.stub

/** A suggested completion for an
 *  annotation.  A completion is text meant to be inserted into a
 *  program as part of an annotation.
 */
trait Completion {

    /** Returns an informative message about the completion. */
    @stub
    def getMessage(): String = ???

    /** Returns the text of the suggested completion. */
    @stub
    def getValue(): String = ???
}
