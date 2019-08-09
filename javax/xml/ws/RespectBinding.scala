package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import javax.xml.ws.spi.WebServiceFeatureAnnotation
import scala.annotation.StaticAnnotation

/** This feature clarifies the use of the wsdl:binding
 *  in a JAX-WS runtime.
 *  
 *  This annotation MUST only be used in conjunction the
 *  javax.jws.WebService, WebServiceProvider,
 *  WebServiceRef annotations.
 *  When used with the javax.jws.WebService annotation this
 *  annotation MUST only be used on the service endpoint implementation
 *  class.
 *  When used with a WebServiceRef annotation, this annotation
 *  MUST only be used when a proxy instance is created. The injected SEI
 *  proxy, and endpoint MUST honor the values of the RespectBinding
 *  annotation.
 *  
 * 
 *  This annotation's behaviour is defined by the corresponding feature
 *  RespectBindingFeature.
 */
@Target ( value ={ TYPE , METHOD , FIELD } ) 
@Retention ( value = RUNTIME ) 
@Documented 
@WebServiceFeatureAnnotation ( id ="javax.xml.ws.RespectBindingFeature" , bean = RespectBindingFeature.class ) 
 final class RespectBinding extends StaticAnnotation {
}
