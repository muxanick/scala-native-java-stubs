package javax.xml.ws

import java.lang.{Class, String}
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** The WebServiceRef annotation is used to
 *  define a reference to a web service and
 *  (optionally) an injection target for it.
 *  It can be used to inject both service and proxy
 *  instances. These injected references are not thread safe.
 *  If the references are accessed by multiple threads,
 *  usual synchronization techinques can be used to
 *  support multiple threads.
 * 
 *  
 *  Web service references are resources in the Java EE 5 sense.
 *  The annotations (for example, Addressing) annotated with
 *  meta-annotation WebServiceFeatureAnnotation
 *  can be used in conjunction with WebServiceRef.
 *  The created reference MUST be configured with annotation's web service
 *  feature.
 * 
 *  
 *  For example, in the code below, the injected
 *  StockQuoteProvider proxy MUST
 *  have WS-Addressing enabled as specifed by the
 *  Addressing
 *  annotation.
 * 
 *  
 *     public class MyClient {
 *        @Addressing
 *        @WebServiceRef(StockQuoteService.class)
 *        private StockQuoteProvider stockQuoteProvider;
 *        ...
 *     }
 *  
 * 
 *  
 *  If a JAX-WS implementation encounters an unsupported or unrecognized
 *  annotation annotated with the WebServiceFeatureAnnotation
 *  that is specified with WebServiceRef, an ERROR MUST be given.
 */
@Target ( value ={ TYPE , METHOD , FIELD } ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class WebServiceRef extends StaticAnnotation {

    /** A portable JNDI lookup name that resolves to the target
     *  web service reference.
     */
    @stub
    val lookup: String = ???

    /** A product specific name that this resource should be mapped to. */
    @stub
    val mappedName: String = ???

    /** The JNDI name of the resource. */
    @stub
    val name: String = ???

    /** The Java type of the resource. */
    @stub
    val type: Class[_] = ???

    /** The service class, alwiays a type extending
     *  javax.xml.ws.Service.
     */
    @stub
    val value: Class[_ <: Service] = ???

    /** A URL pointing to the WSDL document for the web service. */
    @stub
    val wsdlLocation: String = ???
}
