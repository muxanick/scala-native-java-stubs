package javax.xml.ws.spi

import java.lang.{Class, Object, String}
import java.net.URL
import java.util.{List, Map}
import javax.xml.namespace.QName
import javax.xml.transform.Source
import javax.xml.ws.{Endpoint, EndpointReference, Service, WebServiceFeature}
import javax.xml.ws.wsaddressing.W3CEndpointReference
import scala.scalanative.annotation.stub

/** Service provider for ServiceDelegate and
 *  Endpoint objects.
 *  
 */
abstract class Provider extends Object {

    /** Creates a new instance of Provider */
    @stub
    protected def this() = ???

    /** Creates and publishes an endpoint object with the specified
     *  address and implementation object.
     */
    def createAndPublishEndpoint(address: String, implementor: Any): Endpoint

    /** Creates and publishes an endpoint object with the specified
     *  address, implementation object and web service features.
     */
    def createAndPublishEndpoint(address: String, implementor: Any, features: WebServiceFeature*): Endpoint

    /** Creates an endpoint object with the provided binding, implementation
     *  class, invoker and web service features.
     */
    def createEndpoint(bindingId: String, implementorClass: Class[_], invoker: Invoker, features: WebServiceFeature*): Endpoint

    /** Creates an endpoint object with the provided binding and implementation
     *  object.
     */
    def createEndpoint(bindingId: String, implementor: Any): Endpoint

    /** Creates an endpoint object with the provided binding, implementation
     *  object and web service features.
     */
    def createEndpoint(bindingId: String, implementor: Any, features: WebServiceFeature*): Endpoint

    /** Creates a service delegate object. */
    def createServiceDelegate(wsdlDocumentLocation: URL, serviceName: QName, serviceClass: Class[_ <: Service]): ServiceDelegate

    /** Creates a service delegate object. */
    def createServiceDelegate(wsdlDocumentLocation: URL, serviceName: QName, serviceClass: Class[_ <: Service], features: WebServiceFeature*): ServiceDelegate

    /** Factory method to create a W3CEndpointReference. */
    def createW3CEndpointReference(address: String, serviceName: QName, portName: QName, metadata: List[Element], wsdlDocumentLocation: String, referenceParameters: List[Element]): W3CEndpointReference

    /** Factory method to create a W3CEndpointReference. */
    def createW3CEndpointReference(address: String, interfaceName: QName, serviceName: QName, portName: QName, metadata: List[Element], wsdlDocumentLocation: String, referenceParameters: List[Element], elements: List[Element], attributes: Map[QName, String]): W3CEndpointReference

    /** The getPort method returns a proxy. */
    val T: abstract[T]

    /** read an EndpointReference from the infoset contained in
     *  eprInfoset.
     */
    def readEndpointReference(eprInfoset: Source): EndpointReference
}

object Provider {
    /** A constant representing the property used to lookup the
     *  name of a Provider implementation
     *  class.
     */
    @stub
    val JAXWSPROVIDER_PROPERTY: String = ???

    /** Creates a new provider object. */
    @stub
    def provider(): Provider = ???
}
