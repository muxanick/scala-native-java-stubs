package javax.xml.ws.spi.http

import java.lang.{Object, String}
import java.util.Set
import scala.scalanative.annotation.stub

/** HttpContext represents a mapping between the root URI path of a web
 *  service to a HttpHandler which is invoked to handle requests
 *  destined for that path on the associated container.
 *  
 *  Container provides the implementation for this and it matches
 *  web service requests to corresponding HttpContext objects.
 */
abstract class HttpContext extends Object {

    /**  */
    @stub
    def this() = ???

    /**  */
    protected val handler: HttpHandler

    /** Returns an attribute value for container's configuration
     *  and other data that can be used by jax-ws runtime.
     */
    def getAttribute(name: String): Any

    /** Returns all attribute names for container's configuration
     *  and other data that can be used by jax-ws runtime.
     */
    def getAttributeNames(): Set[String]

    /** Returns the path for this context. */
    def getPath(): String

    /** JAX-WS runtime sets its handler during
     *  Endpoint.publish(HttpContext) to handle
     *  HTTP requests for this context.
     */
    def setHandler(handler: HttpHandler): Unit
}
