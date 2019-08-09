package java.lang.instrument

import java.lang.{Exception, Object, Throwable}

// Thrown by an implementation of
// Instrumentation.redefineClasses
// when one of the specified classes cannot be modified.
class UnmodifiableClassException extends Exception {

    @stub
    // Constructs an UnmodifiableClassException with no
    // detail message.
    def this() = ???
}
