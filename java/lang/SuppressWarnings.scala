package java.lang

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Indicates that the named compiler warnings should be suppressed in the
 *  annotated element (and in all program elements contained in the annotated
 *  element).  Note that the set of warnings suppressed in a given element is
 *  a superset of the warnings suppressed in all containing elements.  For
 *  example, if you annotate a class to suppress one warning and annotate a
 *  method to suppress another, both warnings will be suppressed in the method.
 * 
 *  As a matter of style, programmers should always use this annotation
 *  on the most deeply nested element where it is effective.  If you want to
 *  suppress a warning in a particular method, you should annotate that
 *  method rather than its class.
 */
@Target ( value ={ TYPE , FIELD , METHOD , PARAMETER , CONSTRUCTOR , LOCAL_VARIABLE } ) 
@Retention ( value = SOURCE ) 
 final class SuppressWarnings extends StaticAnnotation {

    /** The set of warnings that are to be suppressed by the compiler in the
     *  annotated element.
     */
    @stub
    val value: Array[String] = ???
}
