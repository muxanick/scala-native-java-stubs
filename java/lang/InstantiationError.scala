package java.lang

// Thrown when an application tries to use the Java new
// construct to instantiate an abstract class or an interface.
// 
// Normally, this error is caught by the compiler; this error can
// only occur at run time if the definition of a class has
// incompatibly changed.
class InstantiationError extends IncompatibleClassChangeError {

    @stub
    // Constructs an InstantiationError with no detail  message.
    def this() = ???
}
