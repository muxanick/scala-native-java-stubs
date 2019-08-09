package java.lang.annotation

import java.lang.{Class, Exception, Object, RuntimeException, Throwable}

/** Thrown to indicate that a program has attempted to access an element of
 *  an annotation type that was added to the annotation type definition after
 *  the annotation was compiled (or serialized).  This exception will not be
 *  thrown if the new element has a default value.
 *  This exception can be thrown by the API used to read annotations
 *  reflectively.
 */
class IncompleteAnnotationException extends RuntimeException {

    /** Returns the Class object for the annotation type with the
     *  missing element.
     */
    @stub
    def annotationType(): Class[_ <: Annotation] = ???
}
