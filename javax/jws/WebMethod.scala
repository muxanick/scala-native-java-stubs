package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value = METHOD ) 
 final class WebMethod extends StaticAnnotation {

    /**  */
    @stub
    val action: String = ???

    /**  */
    @stub
    val exclude: Boolean = ???

    /**  */
    @stub
    val operationName: String = ???
}
