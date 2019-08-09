package java.lang.annotation

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import java.lang.reflect.Method
import scala.scalanative.annotation.stub

/** Thrown to indicate that a program has attempted to access an element of
 *  an annotation whose type has changed after the annotation was compiled
 *  (or serialized).
 *  This exception can be thrown by the API used to read annotations
 *  reflectively.
 */
class AnnotationTypeMismatchException extends RuntimeException {

    /** Constructs an AnnotationTypeMismatchException for the specified
     *  annotation type element and found data type.
     */
    @stub
    def this(element: Method, foundType: String) = ???

    /** Returns the Method object for the incorrectly typed element. */
    @stub
    def element(): Method = ???

    /** Returns the type of data found in the incorrectly typed element. */
    @stub
    def foundType(): String = ???
}
