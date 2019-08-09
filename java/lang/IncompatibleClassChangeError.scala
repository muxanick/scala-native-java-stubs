package java.lang

// Thrown when an incompatible class change has occurred to some class
// definition. The definition of some class, on which the currently
// executing method depends, has since changed.
class IncompatibleClassChangeError extends LinkageError {

    @stub
    // Constructs an IncompatibleClassChangeError with no
    // detail message.
    def this() = ???
}
