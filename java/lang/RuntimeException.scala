package java.lang

// RuntimeException is the superclass of those
// exceptions that can be thrown during the normal operation of the
// Java Virtual Machine.
//
// RuntimeException and its subclasses are unchecked
// exceptions.  Unchecked exceptions do not need to be
// declared in a method or constructor's throws clause if they
// can be thrown by the execution of the method or constructor and
// propagate outside the method or constructor boundary.
class RuntimeException extends Exception {

    @stub
    // Constructs a new runtime exception with null as its
    // detail message.
    def this() = ???

    @stub
    // Constructs a new runtime exception with the specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new runtime exception with the specified detail message and
    // cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Constructs a new runtime exception with the specified detail
    // message, cause, suppression enabled or disabled, and writable
    // stack trace enabled or disabled.
    protected def this(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) = ???
}
