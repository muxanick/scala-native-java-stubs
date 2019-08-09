package java.lang.annotation

import java.lang.{Class, Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that a program has attempted to access an element of
 *  an annotation type that was added to the annotation type definition after
 *  the annotation was compiled (or serialized).  This exception will not be
 *  thrown if the new element has a default value.
 *  This exception can be thrown by the API used to read annotations
 *  reflectively.
 */
class IncompleteAnnotationException extends RuntimeException {

    /** Constructs an IncompleteAnnotationException to indicate that
     *  the named element was missing from the specified annotation type.
     */
    @stub
    def this(annotationType: Class[_ <: Annotation], elementName: String) = ???

    /** Returns the Class object for the annotation type with the
     *  missing element.
     */
    @stub
    def annotationType(): Class[_ <: Annotation] = ???

    /** Returns the name of the missing element. */
    @stub
    def elementName(): String = ???
}
