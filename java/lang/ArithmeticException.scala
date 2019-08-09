package java.lang

// Thrown when an exceptional arithmetic condition has occurred. For
// example, an integer "divide by zero" throws an
// instance of this class.
//
// ArithmeticException objects may be constructed by the
// virtual machine as if suppression were disabled and/or the
// stack trace was not writable.
class ArithmeticException extends RuntimeException {

    @stub
    // Constructs an ArithmeticException with no detail
    // message.
    def this() = ???
}
