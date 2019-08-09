package javax.jws.soap

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/**  */
@Retention ( value = RUNTIME ) 
@Target ( value ={ TYPE , METHOD } ) 
 final class SOAPBinding extends StaticAnnotation {

    /**  */
    @stub
    val parameterStyle: SOAPBinding.ParameterStyle = ???

    /**  */
    @stub
    val style: SOAPBinding.Style = ???
}
