package java.lang

// Common superclass of exceptions thrown by reflective operations in
// core reflection.
class ReflectiveOperationException extends Exception {

    @stub
    // Constructs a new exception with null as its detail
    // message.
    def this() = ???

    @stub
    // Constructs a new exception with the specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new exception with the specified detail message
    // and cause.
    def this(message: String, cause: Throwable) = ???
}
