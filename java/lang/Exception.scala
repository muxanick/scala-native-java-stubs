package java.lang

// The class Exception and its subclasses are a form of
// Throwable that indicates conditions that a reasonable
// application might want to catch.
//
// The class Exception and any subclasses that are not also
// subclasses of RuntimeException are checked
// exceptions.  Checked exceptions need to be declared in a
// method or constructor's throws clause if they can be thrown
// by the execution of the method or constructor and propagate outside
// the method or constructor boundary.
class Exception extends Throwable {

    @stub
    // Constructs a new exception with null as its detail message.
    def this() = ???

    @stub
    // Constructs a new exception with the specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new exception with the specified detail message and
    // cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Constructs a new exception with the specified detail message,
    // cause, suppression enabled or disabled, and writable stack
    // trace enabled or disabled.
    protected def this(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) = ???
}
