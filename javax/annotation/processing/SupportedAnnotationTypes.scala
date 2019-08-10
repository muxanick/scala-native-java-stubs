package javax.annotation.processing

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** An annotation used to indicate what annotation types an annotation
 *  processor supports.  The Processor.getSupportedAnnotationTypes() method can construct its
 *  result from the value of this annotation, as done by AbstractProcessor.getSupportedAnnotationTypes().  Only strings conforming to the
 *  grammar should be used as values.
 */
@Documented
@Target(value=TYPE)
@Retention(value=RUNTIME)
final class SupportedAnnotationTypes extends StaticAnnotation {

    /** Returns the names of the supported annotation types. */
    @stub
    val value: Array[String] = ???
}
