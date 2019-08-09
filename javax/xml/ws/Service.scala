package javax.xml.ws

import java.lang.{Class, Object, String}
import java.net.URL
import java.util.Iterator
import java.util.concurrent.Executor
import javax.xml.bind.JAXBContext
import javax.xml.namespace.QName
import javax.xml.ws.handler.HandlerResolver

// Service objects provide the client view of a Web service.
// Service acts as a factory of the following:
// 
// Proxies for a target service endpoint.
// Instances of Dispatch for
//     dynamic message-oriented invocation of a remote
//     operation.
// 
// 
//
// The ports available on a service can be enumerated using the
// getPorts method. Alternatively, you can pass a
// service endpoint interface to the unary getPort method
// and let the runtime select a compatible port.
//
// Handler chains for all the objects created by a Service
// can be set by means of a HandlerResolver.
//
// An Executor may be set on the service in order
// to gain better control over the threads used to dispatch asynchronous
// callbacks. For instance, thread pooling with certain parameters
// can be enabled by creating a ThreadPoolExecutor and
// registering it with the service.
class Service extends Object {

    @stub
    // 
    protected def this(wsdlDocumentLocation: URL, serviceName: QName) = ???

    @stub
    // Creates a new port for the service.
    def addPort(portName: QName, bindingId: String, endpointAddress: String): Unit = ???

    @stub
    // Creates a Dispatch instance for use with objects of
    // the client's choosing.
    def Dispatch[T]: [T] = ???

    @stub
    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(endpointReference: EndpointReference, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object] = ???

    @stub
    // Creates a Dispatch instance for use with objects of
    // the client's choosing.
    def Dispatch[T]: [T] = ???

    @stub
    // Creates a Dispatch instance for use with objects of
    // the client's choosing.
    def Dispatch[T]: [T] = ???

    @stub
    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode): Dispatch[Object] = ???

    @stub
    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object] = ???

    @stub
    // Returns the executor for this Serviceinstance.
    def getExecutor(): Executor = ???

    @stub
    // Returns the configured handler resolver.
    def getHandlerResolver(): HandlerResolver = ???

    @stub
    // The getPort method returns a proxy.
    def T: [T] = ???

    @stub
    // The getPort method returns a proxy.
    def T: [T] = ???

    @stub
    // The getPort method returns a proxy.
    def T: [T] = ???

    @stub
    // The getPort method returns a proxy.
    def T: [T] = ???

    @stub
    // The getPort method returns a proxy.
    def T: [T] = ???

    @stub
    // Returns an Iterator for the list of
    // QNames of service endpoints grouped by this
    // service
    def getPorts(): Iterator[QName] = ???

    @stub
    // Gets the name of this service.
    def getServiceName(): QName = ???

    @stub
    // Gets the location of the WSDL document for this Service.
    def getWSDLDocumentLocation(): URL = ???

    @stub
    // Sets the executor for this Service instance.
    def setExecutor(executor: Executor): Unit = ???
}

object Service {
    @stub
    // Creates a Service instance.
    def create(serviceName: QName): Service = ???

    @stub
    // Creates a Service instance.
    def create(serviceName: QName, features: WebServiceFeature*): Service = ???

    @stub
    // Creates a Service instance.
    def create(wsdlDocumentLocation: URL, serviceName: QName): Service = ???

    @stub
    // Creates a Service instance.
    def create(wsdlDocumentLocation: URL, serviceName: QName, features: WebServiceFeature*): Service = ???
}
