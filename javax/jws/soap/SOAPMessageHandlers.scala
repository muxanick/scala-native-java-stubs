package javax.jws.soap

import java.lang.Deprecated
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value = TYPE ) 
@Deprecated 
 final class SOAPMessageHandlers extends StaticAnnotation {

    /** Deprecated.  */
    @stub
    val value: Array[SOAPMessageHandler] = ???
}
