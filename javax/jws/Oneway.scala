package javax.jws

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value = METHOD ) 
 final class Oneway extends StaticAnnotation {
}
