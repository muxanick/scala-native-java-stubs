package javax.xml.ws.soap

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import javax.xml.ws.spi.WebServiceFeatureAnnotation
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** This feature represents the use of MTOM with a
 *  web service.
 *  
 *  This annotation MUST only be used in conjunction the
 *  javax.jws.WebService, WebServiceProvider,
 *  WebServiceRef annotations.
 *  When used with the javax.jws.WebService annotation this
 *  annotation MUST only be used on the service endpoint implementation
 *  class.
 *  When used with a WebServiceRef annotation, this annotation
 *  MUST only be used when a proxy instance is created. The injected SEI
 *  proxy, and endpoint MUST honor the values of the MTOM
 *  annotation.
 *  
 * 
 *  This annotation's behaviour is defined by the corresponding feature
 *  MTOMFeature.
 */
@Target(value={TYPE,METHOD,FIELD})
@Retention(value=RUNTIME)
@Documented
@WebServiceFeatureAnnotation(id="http://www.w3.org/2004/08/soap/features/http-optimization",bean=MTOMFeature.class)
final class MTOM extends StaticAnnotation {

    /** Specifies if this feature is enabled or disabled. */
    @stub
    val enabled: Boolean = ???

    /** Property for MTOM threshold value. */
    @stub
    val threshold: Int = ???
}
