package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// Used to annotate a generated service interface.
//
//  The information specified in this annotation is sufficient
//  to uniquely identify a wsdl:service
//  element inside a WSDL document. This wsdl:service
//  element represents the Web service for which the generated
//  service interface provides a client view.
@Target ( value = TYPE ) @Retention ( value = RUNTIME ) @Documented @interface WebServiceClient {

    @stub
    // The local name of the Web service.
    def name: String = ???

    @stub
    // The namespace for the Web service.
    def targetNamespace: String = ???
}
