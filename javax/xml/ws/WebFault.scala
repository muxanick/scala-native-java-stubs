package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to annotate service specific exception classes to customize
 *  to the local and namespace name of the fault element and the name
 *  of the fault bean.
 */
@Target(value=TYPE)
@Retention(value=RUNTIME)
@Documented
final class WebFault extends StaticAnnotation {

    /** Fault bean name. */
    @stub
    val faultBean: String = ???

    /** wsdl:Message's name. */
    @stub
    val messageName: String = ???

    /** Element's local name. */
    @stub
    val name: String = ???

    /** Element's namespace name. */
    @stub
    val targetNamespace: String = ???
}
