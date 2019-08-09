package java.nio.charset

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A typesafe enumeration for coding-error actions.
 * 
 *   Instances of this class are used to specify how malformed-input and
 *  unmappable-character errors are to be handled by charset decoders and encoders.  
 */
class CodingErrorAction extends Object {

    /** Returns a string describing this action. */
    @stub
    def toString(): String = ???
}

object CodingErrorAction {
    /** Action indicating that a coding error is to be handled by dropping the
     *  erroneous input and resuming the coding operation.
     */
    @stub
    val IGNORE: CodingErrorAction = ???

    /** Action indicating that a coding error is to be handled by dropping the
     *  erroneous input, appending the coder's replacement value to the output
     *  buffer, and resuming the coding operation.
     */
    @stub
    val REPLACE: CodingErrorAction = ???

    /** Action indicating that a coding error is to be reported, either by
     *  returning a CoderResult object or by throwing a CharacterCodingException, whichever is appropriate for the method
     *  implementing the coding process.
     */
    @stub
    val REPORT: CodingErrorAction = ???
}
