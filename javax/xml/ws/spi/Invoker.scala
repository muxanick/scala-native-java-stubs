package javax.xml.ws.spi

import java.lang.Object
import javax.xml.ws.WebServiceContext

// Invoker hides the detail of calling into application endpoint
// implementation. Container hands over an implementation of Invoker
// to JAX-WS runtime, and jax-ws runtime calls invoke(java.lang.reflect.Method, java.lang.Object...)
// for a web service invocation. Finally, Invoker does the actual
// invocation of web service on endpoint instance.
//
// Container also injects the provided WebServiceContext and takes
// care of invoking javax.annotation.PostConstruct methods,
// if present, on the endpoint implementation.
abstract class Invoker extends Object {

    // JAX-WS runtimes calls this method to ask container to inject
    // WebServiceContext on the endpoint instance.
    def inject(webServiceContext: WebServiceContext): Unit
}
