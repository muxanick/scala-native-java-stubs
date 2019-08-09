package javax.xml.ws.soap

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import javax.xml.ws.spi.WebServiceFeatureAnnotation

// This annotation represents the use of WS-Addressing with either
// the SOAP 1.1/HTTP or SOAP 1.2/HTTP binding. Using this annotation
// with any other binding is undefined.
// 
// This annotation MUST only be used in conjunction with the
// WebService, WebServiceProvider,
//  and WebServiceRef annotations.
// When used with a javax.jws.WebService annotation, this
// annotation MUST only be used on the service endpoint implementation
// class.
// When used with a WebServiceRef annotation, this annotation
// MUST only be used when a proxy instance is created. The injected SEI
// proxy, and endpoint MUST honor the values of the Addressing
// annotation.
// 
// This annotation's behaviour is defined by the corresponding feature
// AddressingFeature.
@Target ( value ={ TYPE , METHOD , FIELD } ) @Retention ( value = RUNTIME ) @Documented @WebServiceFeatureAnnotation ( id ="http://www.w3.org/2005/08/addressing/module" , bean = AddressingFeature.class ) @interface Addressing {

    @stub
    // Specifies if this feature is enabled or disabled.
    def enabled: Boolean = ???

    @stub
    // If addressing is enabled, this property determines whether the endpoint
    // requires WS-Addressing.
    def required: Boolean = ???
}