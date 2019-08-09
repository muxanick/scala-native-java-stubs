package javax.xml.ws.spi.http

import java.lang.Object
import scala.scalanative.annotation.stub

/** A handler which is invoked to process HTTP requests.
 *  
 *  JAX-WS runtime provides the implementation for this and sets
 *  it using HttpContext.setHandler(HttpHandler) during
 *  Endpoint.publish(HttpContext)
 */
abstract class HttpHandler extends Object {

    /**  */
    @stub
    def this() = ???

    /** Handles a given request and generates an appropriate response. */
    def handle(exchange: HttpExchange): Unit
}
