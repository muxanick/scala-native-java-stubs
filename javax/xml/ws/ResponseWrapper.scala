package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Used to annotate methods in the Service Endpoint Interface with the response
 *  wrapper bean to be used at runtime. The default value of the localName is
 *  the operationName as defined in WebMethod annotation appended with
 *  Response and the targetNamespace is the target namespace of the SEI.
 *   When starting from Java this annotation is used resolve
 *  overloading conflicts in document literal mode. Only the className
 *  is required in this case.
 */
@Target ( value = METHOD ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class ResponseWrapper extends StaticAnnotation {

    /** Response wrapper bean name. */
    @stub
    val className: String = ???

    /** Element's local name. */
    @stub
    val localName: String = ???

    /** wsdl:part name for the wrapper part */
    @stub
    val partName: String = ???
}
