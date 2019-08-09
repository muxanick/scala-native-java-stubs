package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value = METHOD ) 
 final class WebResult extends StaticAnnotation {

    /**  */
    @stub
    val header: Boolean = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val partName: String = ???

    /**  */
    @stub
    val targetNamespace: String = ???
}
