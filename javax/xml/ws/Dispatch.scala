package javax.xml.ws

import java.util.concurrent.Future

// The Dispatch interface provides support
//  for the dynamic invocation of a service endpoint operations. The
//  javax.xml.ws.Service
//  class acts as a factory for the creation of Dispatch
//  instances.
trait Dispatch[T] extends BindingProvider {

    @stub
    // Invoke a service operation synchronously.
    def invoke(msg: T): T = ???

    @stub
    // Invoke a service operation asynchronously.
    def invokeAsync(msg: T): Response[T] = ???

    @stub
    // Invoke a service operation asynchronously.
    def invokeAsync(msg: T, handler: AsyncHandler[T]): Future[_] = ???
}
