package java.lang

// Thrown when an application tries to call an abstract method.
// Normally, this error is caught by the compiler; this error can
// only occur at run time if the definition of some class has
// incompatibly changed since the currently executing method was last
// compiled.
class AbstractMethodError extends IncompatibleClassChangeError {

    @stub
    // Constructs an AbstractMethodError with no detail  message.
    def this() = ???
}
