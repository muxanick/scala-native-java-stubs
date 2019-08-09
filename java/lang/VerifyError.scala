package java.lang

// Thrown when the "verifier" detects that a class file,
// though well formed, contains some sort of internal inconsistency
// or security problem.
class VerifyError extends LinkageError {

    @stub
    // Constructs an VerifyError with no detail message.
    def this() = ???
}
