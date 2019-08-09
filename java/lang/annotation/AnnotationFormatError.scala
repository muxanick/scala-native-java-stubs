package java.lang.annotation

import java.lang.{Error, Object, String, Throwable}

// Thrown when the annotation parser attempts to read an annotation
// from a class file and determines that the annotation is malformed.
// This error can be thrown by the API used to read annotations
// reflectively.
class AnnotationFormatError extends Error {

    @stub
    // Constructs a new AnnotationFormatError with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new AnnotationFormatError with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
