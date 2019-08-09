package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// Used to annotate a Provider implementation class.
@Target ( value = TYPE ) @Retention ( value = RUNTIME ) @Documented @interface WebServiceProvider {

    @stub
    // Port name.
    def portName: String = ???

    @stub
    // Service name.
    def serviceName: String = ???

    @stub
    // Target namespace for the service
    def targetNamespace: String = ???
}
