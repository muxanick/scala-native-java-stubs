package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  */
@Retention(value=RUNTIME)
@Target(value=TYPE)
final class WebService extends StaticAnnotation {

    /**  */
    @stub
    val endpointInterface: String = ???

    /**  */
    @stub
    val name: String = ???

    /**  */
    @stub
    val portName: String = ???

    /**  */
    @stub
    val serviceName: String = ???

    /**  */
    @stub
    val targetNamespace: String = ???

    /**  */
    @stub
    val wsdlLocation: String = ???
}
