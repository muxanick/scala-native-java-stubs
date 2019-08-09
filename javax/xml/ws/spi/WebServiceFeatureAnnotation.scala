package javax.xml.ws.spi

import java.lang.{Class, String}
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import javax.xml.ws.WebServiceFeature
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Annotation used to identify other annotations
 *  as a WebServiceFeature.
 *  
 *  Each WebServiceFeature annotation annotated with
 *  this annotation MUST contain an
 *  enabled property of type
 *  boolean with a default value of true.
 *  
 *  JAX-WS defines the following
 *  WebServiceFeature annotations (Addressing,
 *  MTOM, RespectBinding), however, an implementation
 *  may define vendors specific annotations for other features.
 *  
 *  Annotations annotated with WebServiceFeatureAnnotation MUST
 *  have the same @Target of WebServiceRef annotation, so that the resulting
 *  feature annotation can be used in conjunction with the WebServiceRef
 *  annotation if necessary.
 *  
 *  If a JAX-WS implementation encounters an annotation annotated
 *  with the WebServiceFeatureAnnotation that it does not
 *  recognize/support an error MUST be given.
 *  
 */
@Target ( value = ANNOTATION_TYPE ) 
@Retention ( value = RUNTIME ) 
@Documented 
 final class WebServiceFeatureAnnotation extends StaticAnnotation {

    /** The WebServiceFeature bean that is associated
     *  with the WebServiceFeature annotation
     */
    @stub
    val bean: Class[_ <: WebServiceFeature] = ???

    /** Unique identifier for the WebServiceFeature. */
    @stub
    val id: String = ???
}
