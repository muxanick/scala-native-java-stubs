package javax.annotation.processing

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** An annotation used to indicate what options an annotation processor
 *  supports.  The Processor.getSupportedOptions() method can
 *  construct its result from the value of this annotation, as done by
 *  AbstractProcessor.getSupportedOptions().  Only strings conforming to the
 *  grammar should be used as values.
 */
@Documented
@Target(value=TYPE)
@Retention(value=RUNTIME)
final class SupportedOptions extends StaticAnnotation {

    /** Returns the supported options. */
    @stub
    val value: Array[String] = ???
}
