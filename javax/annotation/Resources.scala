package javax.annotation

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** This class is used to allow multiple resources declarations. */
@Documented 
@Retention ( value = RUNTIME ) 
@Target ( value = TYPE ) 
 final class Resources extends StaticAnnotation {
}
