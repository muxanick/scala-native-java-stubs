package java.lang.annotation

import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Indicates the contexts in which an annotation type is applicable. The
 *  declaration contexts and type contexts in which an annotation type may be
 *  applicable are specified in JLS 9.6.4.1, and denoted in source code by enum
 *  constants of java.lang.annotation.ElementType.
 * 
 *  If an @Target meta-annotation is not present on an annotation type
 *  T , then an annotation of type T may be written as a
 *  modifier for any declaration except a type parameter declaration.
 * 
 *  If an @Target meta-annotation is present, the compiler will enforce
 *  the usage restrictions indicated by ElementType
 *  enum constants, in line with JLS 9.7.4.
 * 
 *  For example, this @Target meta-annotation indicates that the
 *  declared type is itself a meta-annotation type.  It can only be used on
 *  annotation type declarations:
 *  
 *     @Target(ElementType.ANNOTATION_TYPE)
 *     public @interface MetaAnnotationType {
 *         ...
 *     }
 *  
 * 
 *  This @Target meta-annotation indicates that the declared type is
 *  intended solely for use as a member type in complex annotation type
 *  declarations.  It cannot be used to annotate anything directly:
 *  
 *     @Target({})
 *     public @interface MemberType {
 *         ...
 *     }
 *  
 * 
 *  It is a compile-time error for a single ElementType constant to
 *  appear more than once in an @Target annotation.  For example, the
 *  following @Target meta-annotation is illegal:
 *  
 *     @Target({ElementType.FIELD, ElementType.METHOD, ElementType.FIELD})
 *     public @interface Bogus {
 *         ...
 *     }
 *  
 */
@Documented 
@Retention ( value = RUNTIME ) 
@Target ( value = ANNOTATION_TYPE ) 
 final class Target extends StaticAnnotation {

    /** Returns an array of the kinds of elements an annotation type
     *  can be applied to.
     */
    @stub
    val value: Array[ElementType] = ???
}
