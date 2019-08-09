package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to annotate the getPortName()
 *   methods of a generated service interface.
 * 
 *   The information specified in this annotation is sufficient
 *   to uniquely identify a wsdl:port element
 *   inside a wsdl:service. The latter is
 *   determined based on the value of the WebServiceClient
 *   annotation on the generated service interface itself.
 */
@Target ( value = METHOD ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class WebEndpoint extends StaticAnnotation {

    /** The local name of the endpoint. */
    @stub
    val name: String = ???
}
