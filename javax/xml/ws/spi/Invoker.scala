package javax.xml.ws.spi

import java.lang.Object
import java.lang.reflect.Method
import javax.xml.ws.WebServiceContext
import scala.scalanative.annotation.stub

/** Invoker hides the detail of calling into application endpoint
 *  implementation. Container hands over an implementation of Invoker
 *  to JAX-WS runtime, and jax-ws runtime calls invoke(java.lang.reflect.Method, java.lang.Object...)
 *  for a web service invocation. Finally, Invoker does the actual
 *  invocation of web service on endpoint instance.
 * 
 *  Container also injects the provided WebServiceContext and takes
 *  care of invoking javax.annotation.PostConstruct methods,
 *  if present, on the endpoint implementation.
 */
abstract class Invoker extends Object {

    /**  */
    @stub
    def this() = ???

    /** JAX-WS runtimes calls this method to ask container to inject
     *  WebServiceContext on the endpoint instance.
     */
    def inject(webServiceContext: WebServiceContext): Unit

    /** JAX-WS runtime calls this method to do the actual web service
     *  invocation on endpoint instance.
     */
    def invoke(m: Method, args: Object*): Object
}
