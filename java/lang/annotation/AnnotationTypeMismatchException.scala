package java.lang.annotation

import java.lang.{Exception, Object, RuntimeException, Throwable}
import java.lang.reflect.Method

// Thrown to indicate that a program has attempted to access an element of
// an annotation whose type has changed after the annotation was compiled
// (or serialized).
// This exception can be thrown by the API used to read annotations
// reflectively.
class AnnotationTypeMismatchException extends RuntimeException {

    @stub
    // Returns the Method object for the incorrectly typed element.
    def element(): Method = ???
}
