package java.lang

// Thrown to indicate that an assertion has failed.
//
// The seven one-argument public constructors provided by this
// class ensure that the assertion error returned by the invocation:
// 
//     new AssertionError(expression)
// 
// has as its detail message the string conversion of
// expression (as defined in section 15.18.1.1 of
// The Java™ Language Specification),
// regardless of the type of expression.
class AssertionError extends Error {

    @stub
    // Constructs an AssertionError with no detail message.
    def this() = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified boolean, which is converted to
    // a string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: Boolean) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified char, which is converted to a
    // string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: Char) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified double, which is converted to a
    // string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: double) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified float, which is converted to a
    // string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: float) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified int, which is converted to a
    // string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: Int) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified long, which is converted to a
    // string as defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: Long) = ???

    @stub
    // Constructs an AssertionError with its detail message derived
    // from the specified object, which is converted to a string as
    // defined in section 15.18.1.1 of
    // The Java™ Language Specification.
    def this(detailMessage: Object) = ???
}
