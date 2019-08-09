package javax.xml.ws

import java.lang.{Class, Object, String}
import java.net.URL
import java.util.Iterator
import java.util.concurrent.Executor
import javax.xml.bind.JAXBContext
import javax.xml.namespace.QName
import javax.xml.ws.handler.HandlerResolver
import scala.scalanative.annotation.stub

/** Service objects provide the client view of a Web service.
 *  Service acts as a factory of the following:
 *  
 *  Proxies for a target service endpoint.
 *  Instances of Dispatch for
 *      dynamic message-oriented invocation of a remote
 *      operation.
 *  
 *  
 * 
 *  The ports available on a service can be enumerated using the
 *  getPorts method. Alternatively, you can pass a
 *  service endpoint interface to the unary getPort method
 *  and let the runtime select a compatible port.
 * 
 *  Handler chains for all the objects created by a Service
 *  can be set by means of a HandlerResolver.
 * 
 *  An Executor may be set on the service in order
 *  to gain better control over the threads used to dispatch asynchronous
 *  callbacks. For instance, thread pooling with certain parameters
 *  can be enabled by creating a ThreadPoolExecutor and
 *  registering it with the service.
 */
class Service extends Object {

    /**  */
    @stub
    protected def this(wsdlDocumentLocation: URL, serviceName: QName) = ???

    /**  */
    @stub
    protected def this(wsdlDocumentLocation: URL, serviceName: QName, features: WebServiceFeature*) = ???

    /** Creates a new port for the service. */
    @stub
    def addPort(portName: QName, bindingId: String, endpointAddress: String): Unit = ???

    /** Creates a Dispatch instance for use with objects of
     *  the client's choosing.
     */
    @stub
    def createDispatch[T](endpointReference: EndpointReference, type: Class[T], mode: Service.Mode, features: WebServiceFeature*): Dispatch[T] = ???

    /** Creates a Dispatch instance for use with JAXB
     *  generated objects.
     */
    @stub
    def createDispatch(endpointReference: EndpointReference, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object] = ???

    /** Creates a Dispatch instance for use with objects of
     *  the client's choosing.
     */
    @stub
    def createDispatch[T](portName: QName, type: Class[T], mode: Service.Mode): Dispatch[T] = ???

    /** Creates a Dispatch instance for use with objects of
     *  the client's choosing.
     */
    @stub
    def createDispatch[T](portName: QName, type: Class[T], mode: Service.Mode, features: WebServiceFeature*): Dispatch[T] = ???

    /** Creates a Dispatch instance for use with JAXB
     *  generated objects.
     */
    @stub
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode): Dispatch[Object] = ???

    /** Creates a Dispatch instance for use with JAXB
     *  generated objects.
     */
    @stub
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object] = ???

    /** Returns the executor for this Serviceinstance. */
    @stub
    def getExecutor(): Executor = ???

    /** Returns the configured handler resolver. */
    @stub
    def getHandlerResolver(): HandlerResolver = ???

    /** The getPort method returns a proxy. */
    @stub
    def getPort[T](serviceEndpointInterface: Class[T]): T = ???

    /** The getPort method returns a proxy. */
    @stub
    def getPort[T](serviceEndpointInterface: Class[T], features: WebServiceFeature*): T = ???

    /** The getPort method returns a proxy. */
    @stub
    def getPort[T](endpointReference: EndpointReference, serviceEndpointInterface: Class[T], features: WebServiceFeature*): T = ???

    /** The getPort method returns a proxy. */
    @stub
    def getPort[T](portName: QName, serviceEndpointInterface: Class[T]): T = ???

    /** The getPort method returns a proxy. */
    @stub
    def getPort[T](portName: QName, serviceEndpointInterface: Class[T], features: WebServiceFeature*): T = ???

    /** Returns an Iterator for the list of
     *  QNames of service endpoints grouped by this
     *  service
     */
    @stub
    def getPorts(): Iterator[QName] = ???

    /** Gets the name of this service. */
    @stub
    def getServiceName(): QName = ???

    /** Gets the location of the WSDL document for this Service. */
    @stub
    def getWSDLDocumentLocation(): URL = ???

    /** Sets the executor for this Service instance. */
    @stub
    def setExecutor(executor: Executor): Unit = ???

    /** Sets the HandlerResolver for this Service
     *  instance.
     */
    @stub
    def setHandlerResolver(handlerResolver: HandlerResolver): Unit = ???
}

object Service {
    /** The orientation of a dynamic client or service. */
    @stub
    object Mode extends Service.Mode

    /** Creates a Service instance. */
    @stub
    def create(serviceName: QName): Service = ???

    /** Creates a Service instance. */
    @stub
    def create(serviceName: QName, features: WebServiceFeature*): Service = ???

    /** Creates a Service instance. */
    @stub
    def create(wsdlDocumentLocation: URL, serviceName: QName): Service = ???

    /** Creates a Service instance. */
    @stub
    def create(wsdlDocumentLocation: URL, serviceName: QName, features: WebServiceFeature*): Service = ???
}
