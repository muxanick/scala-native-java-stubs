package javax.xml.ws

import java.lang.{Class, Object, String}
import java.util.{List, Map}
import java.util.concurrent.Executor
import javax.xml.transform.Source
import javax.xml.ws.spi.http.HttpContext
import scala.scalanative.annotation.stub

/** A Web service endpoint.
 * 
 *  Endpoints are created using the static methods defined in this
 *  class. An endpoint is always tied to one Binding
 *  and one implementor, both set at endpoint creation time.
 * 
 *  An endpoint is either in a published or an unpublished state.
 *  The publish methods can be used to start publishing
 *  an endpoint, at which point it starts accepting incoming requests.
 *  Conversely, the stop method can be used to stop
 *  accepting incoming requests and take the endpoint down.
 *  Once stopped, an endpoint cannot be published again.
 * 
 *  An Executor may be set on the endpoint in order
 *  to gain better control over the threads used to dispatch incoming
 *  requests. For instance, thread pooling with certain parameters
 *  can be enabled by creating a ThreadPoolExecutor and
 *  registering it with the endpoint.
 * 
 *  Handler chains can be set using the contained Binding.
 * 
 *  An endpoint may have a list of metadata documents, such as WSDL
 *  and XMLSchema documents, bound to it. At publishing time, the
 *  JAX-WS implementation will try to reuse as much of that metadata
 *  as possible instead of generating new ones based on the annotations
 *  present on the implementor.
 */
abstract class Endpoint extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns the binding for this endpoint. */
    def getBinding(): Binding

    /** Returns the EndpointReference associated with
     *  this Endpoint instance.
     */
    val T: abstract[T <: EndpointReference]

    /** Returns the EndpointReference associated with
     *  this Endpoint instance.
     */
    def getEndpointReference(referenceParameters: Element*): EndpointReference

    /** Returns the executor for this Endpointinstance. */
    def getExecutor(): Executor

    /** Returns the implementation object for this endpoint. */
    def getImplementor(): Any

    /** Returns a list of metadata documents for the service. */
    def getMetadata(): List[Source]

    /** Returns the property bag for this Endpoint instance. */
    def getProperties(): Map[String, Object]

    /** Returns true if the endpoint is in the published state. */
    def isPublished(): Boolean

    /** Publishes this endpoint at the provided server context. */
    def publish(serverContext: HttpContext): Unit

    /** Publishes this endpoint at the provided server context. */
    def publish(serverContext: Any): Unit

    /** Publishes this endpoint at the given address. */
    def publish(address: String): Unit

    /** By settng a EndpointContext, JAX-WS runtime knows about
     *  addresses of other endpoints in an application.
     */
    def setEndpointContext(ctxt: EndpointContext): Unit

    /** Sets the executor for this Endpoint instance. */
    def setExecutor(executor: Executor): Unit

    /** Sets the metadata for this endpoint. */
    def setMetadata(metadata: List[Source]): Unit

    /** Sets the property bag for this Endpoint instance. */
    def setProperties(properties: Map[String, Object]): Unit

    /** Stops publishing this endpoint. */
    def stop(): Unit
}

object Endpoint {
    /** Standard property: name of WSDL port. */
    @stub
    val WSDL_PORT: String = ???

    /** Standard property: name of WSDL service. */
    @stub
    val WSDL_SERVICE: String = ???

    /** Creates an endpoint with the specified implementor object. */
    @stub
    def create(implementor: Any): Endpoint = ???

    /** Creates an endpoint with the specified implementor object and web
     *  service features.
     */
    @stub
    def create(implementor: Any, features: WebServiceFeature*): Endpoint = ???

    /** Creates an endpoint with the specified binding type and
     *  implementor object.
     */
    @stub
    def create(bindingId: String, implementor: Any): Endpoint = ???

    /** Creates an endpoint with the specified binding type,
     *  implementor object, and web service features.
     */
    @stub
    def create(bindingId: String, implementor: Any, features: WebServiceFeature*): Endpoint = ???

    /** Creates and publishes an endpoint for the specified implementor
     *  object at the given address.
     */
    @stub
    def publish(address: String, implementor: Any): Endpoint = ???

    /** Creates and publishes an endpoint for the specified implementor
     *  object at the given address.
     */
    @stub
    def publish(address: String, implementor: Any, features: WebServiceFeature*): Endpoint = ???
}
