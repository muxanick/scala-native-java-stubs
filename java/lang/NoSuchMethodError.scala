package java.lang

// Thrown if an application tries to call a specified method of a
// class (either static or instance), and that class no longer has a
// definition of that method.
// 
// Normally, this error is caught by the compiler; this error can
// only occur at run time if the definition of a class has
// incompatibly changed.
class NoSuchMethodError extends IncompatibleClassChangeError {

    @stub
    // Constructs a NoSuchMethodError with no detail message.
    def this() = ???
}
