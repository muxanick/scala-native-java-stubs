package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to annotate a generated service interface.
 * 
 *   The information specified in this annotation is sufficient
 *   to uniquely identify a wsdl:service
 *   element inside a WSDL document. This wsdl:service
 *   element represents the Web service for which the generated
 *   service interface provides a client view.
 */
@Target(value=TYPE)
@Retention(value=RUNTIME)
@Documented
final class WebServiceClient extends StaticAnnotation {

    /** The local name of the Web service. */
    @stub
    val name: String = ???

    /** The namespace for the Web service. */
    @stub
    val targetNamespace: String = ???

    /** The location of the WSDL document for the service (a URL). */
    @stub
    val wsdlLocation: String = ???
}
