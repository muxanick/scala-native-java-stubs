package javax.jws

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention(value=RUNTIME)
@Target(value=METHOD)
final class Oneway extends StaticAnnotation {
}
