package java.lang

import scala.scalanative.annotation.stub

/** Thrown when the "verifier" detects that a class file,
 *  though well formed, contains some sort of internal inconsistency
 *  or security problem.
 */
class VerifyError extends LinkageError {

    /** Constructs an VerifyError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an VerifyError with the specified detail message. */
    @stub
    def this(s: String) = ???
}
