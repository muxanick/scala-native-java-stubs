package javax.xml.ws.spi

import java.lang.{Class, Object, String}
import java.net.URL
import java.util.Iterator
import java.util.concurrent.Executor
import javax.xml.bind.JAXBContext
import javax.xml.namespace.QName
import javax.xml.ws.{Dispatch, EndpointReference, Service.Mode, WebServiceFeature}
import javax.xml.ws.handler.HandlerResolver

// Service delegates are used internally by Service objects
// to allow pluggability of JAX-WS implementations.
// 
// Every Service object has its own delegate, created using
// the Provider.createServiceDelegate(java.net.URL, javax.xml.namespace.QName, java.lang.Class<? extends javax.xml.ws.Service>) method. A Service
// object delegates all of its instance methods to its delegate.
abstract class ServiceDelegate extends Object {

    // Creates a new port for the service.
    def addPort(portName: QName, bindingId: String, endpointAddress: String): Unit

    // Creates a Dispatch instance for use with objects of
    // the user's choosing.
    def Dispatch[T]: abstract[T]

    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(endpointReference: EndpointReference, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object]

    // Creates a Dispatch instance for use with objects of
    // the user's choosing.
    def Dispatch[T]: abstract[T]

    // Creates a Dispatch instance for use with objects of
    // the user's choosing.
    def Dispatch[T]: abstract[T]

    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode): Dispatch[Object]

    // Creates a Dispatch instance for use with JAXB
    // generated objects.
    def createDispatch(portName: QName, context: JAXBContext, mode: Service.Mode, features: WebServiceFeature*): Dispatch[Object]

    // Returns the executor for this Serviceinstance.
    def getExecutor(): Executor

    // Returns the configured handler resolver.
    def getHandlerResolver(): HandlerResolver

    // The getPort method returns a proxy.
    def T: abstract[T]

    // The getPort method returns a proxy.
    def T: abstract[T]

    // The getPort method returns a proxy.
    def T: abstract[T]

    // The getPort method returns a proxy.
    def T: abstract[T]

    // The getPort method returns a proxy.
    def T: abstract[T]

    // Returns an Iterator for the list of
    // QNames of service endpoints grouped by this
    // service
    def getPorts(): Iterator[QName]

    // Gets the name of this service.
    def getServiceName(): QName

    // Gets the location of the WSDL document for this Service.
    def getWSDLDocumentLocation(): URL

    // Sets the executor for this Service instance.
    def setExecutor(executor: Executor): Unit
}
