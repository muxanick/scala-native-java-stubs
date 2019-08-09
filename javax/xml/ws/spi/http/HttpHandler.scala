package javax.xml.ws.spi.http

import java.lang.Object

/** A handler which is invoked to process HTTP requests.
 *  
 *  JAX-WS runtime provides the implementation for this and sets
 *  it using HttpContext.setHandler(HttpHandler) during
 *  Endpoint.publish(HttpContext)
 */
abstract class HttpHandler extends Object {
}
