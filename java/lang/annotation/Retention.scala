package java.lang.annotation

import scala.annotation.StaticAnnotation

/** Indicates how long annotations with the annotated type are to
 *  be retained.  If no Retention annotation is present on
 *  an annotation type declaration, the retention policy defaults to
 *  RetentionPolicy.CLASS.
 * 
 *  A Retention meta-annotation has effect only if the
 *  meta-annotated type is used directly for annotation.  It has no
 *  effect if the meta-annotated type is used as a member type in
 *  another annotation type.
 */
@Documented 
@Retention ( value = RUNTIME ) 
@Target ( value = ANNOTATION_TYPE ) 
 final class Retention extends StaticAnnotation {
}
