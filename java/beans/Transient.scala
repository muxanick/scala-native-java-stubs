package java.beans

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Indicates that an attribute called "transient"
 *  should be declared with the given value
 *  when the Introspector constructs
 *  a PropertyDescriptor or EventSetDescriptor
 *  classes associated with the annotated code element.
 *  A true value for the "transient" attribute
 *  indicates to encoders derived from Encoder
 *  that this feature should be ignored.
 *  
 *  The Transient annotation may be be used
 *  in any of the methods that are involved
 *  in a FeatureDescriptor subclass
 *  to identify the transient feature in the annotated class and its subclasses.
 *  Normally, the method that starts with "get" is the best place
 *  to put the annotation and it is this declaration
 *  that takes precedence in the case of multiple annotations
 *  being defined for the same feature.
 *  
 *  To declare a feature non-transient in a class
 *  whose superclass declares it transient,
 *  use @Transient(false).
 *  In all cases, the Introspector decides
 *  if a feature is transient by referring to the annotation
 *  on the most specific superclass.
 *  If no Transient annotation is present
 *  in any superclass the feature is not transient.
 */
@Target ( value = METHOD ) 
@Retention ( value = RUNTIME ) 
 final class Transient extends StaticAnnotation {
}
