package java.lang.annotation

import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Indicates that a field defining a constant value may be referenced
 *  from native code.
 * 
 *  The annotation may be used as a hint by tools that generate native
 *  header files to determine whether a header file is required, and
 *  if so, what declarations it should contain.
 */
@Documented
@Target(value=FIELD)
@Retention(value=SOURCE)
final class Native extends StaticAnnotation {
}
