package java.lang

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** A program element annotated @Deprecated is one that programmers
 *  are discouraged from using, typically because it is dangerous,
 *  or because a better alternative exists.  Compilers warn when a
 *  deprecated program element is used or overridden in non-deprecated code.
 */
@Documented
@Retention(value=RUNTIME)
@Target(value={CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,PARAMETER,TYPE})
final class Deprecated extends StaticAnnotation {
}
