package java.lang.annotation

import java.lang.{Error, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when the annotation parser attempts to read an annotation
 *  from a class file and determines that the annotation is malformed.
 *  This error can be thrown by the API used to read annotations
 *  reflectively.
 */
class AnnotationFormatError extends Error {

    /** Constructs a new AnnotationFormatError with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new AnnotationFormatError with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new AnnotationFormatError with the specified
     *  cause and a detail message of
     *  (cause == null ? null : cause.toString()) (which
     *  typically contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
