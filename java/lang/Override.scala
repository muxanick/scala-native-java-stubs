package java.lang

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Indicates that a method declaration is intended to override a
 *  method declaration in a supertype. If a method is annotated with
 *  this annotation type compilers are required to generate an error
 *  message unless at least one of the following conditions hold:
 * 
 *  
 *  The method does override or implement a method declared in a
 *  supertype.
 *  
 *  The method has a signature that is override-equivalent to that of
 *  any public method declared in Object.
 *  
 */
@Target ( value = METHOD ) 
@Retention ( value = SOURCE ) 
 final class Override extends StaticAnnotation {
}
