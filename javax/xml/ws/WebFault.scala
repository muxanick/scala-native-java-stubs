package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// Used to annotate service specific exception classes to customize
// to the local and namespace name of the fault element and the name
// of the fault bean.
@Target ( value = TYPE ) @Retention ( value = RUNTIME ) @Documented @interface WebFault {

    @stub
    // Fault bean name.
    def faultBean: String = ???

    @stub
    // wsdl:Message's name.
    def messageName: String = ???

    @stub
    // Element's local name.
    def name: String = ???
}
