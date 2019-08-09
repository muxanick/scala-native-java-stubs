package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to annotate a Provider implementation class. */
@Target ( value = TYPE ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class WebServiceProvider extends StaticAnnotation {

    /** Port name. */
    @stub
    val portName: String = ???

    /** Service name. */
    @stub
    val serviceName: String = ???

    /** Target namespace for the service */
    @stub
    val targetNamespace: String = ???

    /** Location of the WSDL description for the service. */
    @stub
    val wsdlLocation: String = ???
}
