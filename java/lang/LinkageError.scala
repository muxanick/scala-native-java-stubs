package java.lang

// Subclasses of LinkageError indicate that a class has
// some dependency on another class; however, the latter class has
// incompatibly changed after the compilation of the former class.
class LinkageError extends Error {

    @stub
    // Constructs a LinkageError with no detail message.
    def this() = ???

    @stub
    // Constructs a LinkageError with the specified detail
    // message.
    def this(s: String) = ???
}
