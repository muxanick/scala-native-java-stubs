package javax.annotation

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** This class is used to allow multiple resources declarations. */
@Documented
@Retention(value=RUNTIME)
@Target(value=TYPE)
final class Resources extends StaticAnnotation {

    /** Array used for multiple resource declarations. */
    @stub
    val value: Array[Resource] = ???
}
