package javax.xml.ws

import java.lang.{Class, String}
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// The WebServiceRef annotation is used to
// define a reference to a web service and
// (optionally) an injection target for it.
// It can be used to inject both service and proxy
// instances. These injected references are not thread safe.
// If the references are accessed by multiple threads,
// usual synchronization techinques can be used to
// support multiple threads.
//
// 
// Web service references are resources in the Java EE 5 sense.
// The annotations (for example, Addressing) annotated with
// meta-annotation WebServiceFeatureAnnotation
// can be used in conjunction with WebServiceRef.
// The created reference MUST be configured with annotation's web service
// feature.
//
// 
// For example, in the code below, the injected
// StockQuoteProvider proxy MUST
// have WS-Addressing enabled as specifed by the
// Addressing
// annotation.
//
// 
//    public class MyClient {
//       @Addressing
//       @WebServiceRef(StockQuoteService.class)
//       private StockQuoteProvider stockQuoteProvider;
//       ...
//    }
// 
//
// 
// If a JAX-WS implementation encounters an unsupported or unrecognized
// annotation annotated with the WebServiceFeatureAnnotation
// that is specified with WebServiceRef, an ERROR MUST be given.
@Target ( value ={ TYPE , METHOD , FIELD } ) @Retention ( value = RUNTIME ) @Documented @interface WebServiceRef {

    @stub
    // A portable JNDI lookup name that resolves to the target
    // web service reference.
    def lookup: String = ???

    @stub
    // A product specific name that this resource should be mapped to.
    def mappedName: String = ???

    @stub
    // The JNDI name of the resource.
    def name: String = ???

    @stub
    // The Java type of the resource.
    def type: Class[_] = ???

    @stub
    // The service class, alwiays a type extending
    // javax.xml.ws.Service.
    def value: Class[_ <: Service] = ???
}
