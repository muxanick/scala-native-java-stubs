package javax.jws.soap

import java.lang.Deprecated
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value = TYPE ) 
@Deprecated 
 final class SOAPMessageHandlers extends StaticAnnotation {
}
