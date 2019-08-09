package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value ={ TYPE , METHOD , FIELD } ) 
 final class HandlerChain extends StaticAnnotation {

    /**  */
    @stub
    val file: String = ???

    /** Deprecated.  */
    @stub
    val name: String = ???
}
