package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** The BindingType annotation is used to
 *   specify the binding to use for a web service
 *   endpoint implementation class.
 *   
 *   This annotation may be overriden programmatically or via
 *   deployment descriptors, depending on the platform in use.
 */
@Target ( value = TYPE ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class BindingType extends StaticAnnotation {
}
