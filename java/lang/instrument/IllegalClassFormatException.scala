package java.lang.instrument

import java.lang.{Exception, Object, Throwable}

// Thrown by an implementation of
// ClassFileTransformer.transform
// when its input parameters are invalid.
// This may occur either because the initial class file bytes were
// invalid or a previously applied transform corrupted the bytes.
class IllegalClassFormatException extends Exception {

    @stub
    // Constructs an IllegalClassFormatException with no
    // detail message.
    def this() = ???
}
