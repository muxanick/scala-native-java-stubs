package javax.annotation

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** The Generated annotation is used to mark source code that has been generated.
 *  It can also be used to differentiate user written code from generated code
 *  in a single file. When used, the value element must have the name of the
 *  code generator. The recommended convention is to use the fully qualified
 *  name of the code generator in the value field .
 *  For example: com.company.package.classname.
 *  The date element is used to indicate the date the source was generated.
 *  The date element must follow the ISO 8601 standard. For example the date
 *  element would have the following value 2001-07-04T12:08:56.235-0700
 *  which represents 2001-07-04 12:08:56 local time in the U.S. Pacific
 *  Time time zone.
 *  The comment element is a place holder for any comments that the code
 *  generator may want to include in the generated code.
 */
@Documented 
@Retention ( value = SOURCE ) 
@Target ( value ={ PACKAGE , TYPE , ANNOTATION_TYPE , METHOD , CONSTRUCTOR , FIELD , LOCAL_VARIABLE , PARAMETER } ) 
 final class Generated extends StaticAnnotation {

    /** The value element MUST have the name of the code generator. */
    @stub
    val value: Array[String] = ???

    /** A place holder for any comments that the code generator may want to
     *  include in the generated code.
     */
    @stub
    val comments: String = ???

    /** Date when the source was generated. */
    @stub
    val date: String = ???
}
