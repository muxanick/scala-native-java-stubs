package javax.xml.ws.spi.http

import java.lang.{Object, String}
import java.util.Set

// HttpContext represents a mapping between the root URI path of a web
// service to a HttpHandler which is invoked to handle requests
// destined for that path on the associated container.
// 
// Container provides the implementation for this and it matches
// web service requests to corresponding HttpContext objects.
abstract class HttpContext extends Object {

    // Returns an attribute value for container's configuration
    // and other data that can be used by jax-ws runtime.
    def getAttribute(name: String): Object

    // Returns all attribute names for container's configuration
    // and other data that can be used by jax-ws runtime.
    def getAttributeNames(): Set[String]

    // Returns the path for this context.
    def getPath(): String
}
