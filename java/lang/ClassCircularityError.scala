package java.lang

// Thrown when the Java Virtual Machine detects a circularity in the
// superclass hierarchy of a class being loaded.
class ClassCircularityError extends LinkageError {

    @stub
    // Constructs a ClassCircularityError with no detail message.
    def this() = ???
}