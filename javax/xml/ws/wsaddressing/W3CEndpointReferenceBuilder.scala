package javax.xml.ws.wsaddressing

import java.lang.{Object, String}
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** This class is used to build W3CEndpointReference
 *  instances. The intended use of this clsss is for
 *  an application component, for example a factory component,
 *  to create an W3CEndpointReference for a
 *  web service endpoint published by the same
 *  Java EE application. It can also be used to create
 *  W3CEndpointReferences for an Java SE based
 *  endpoint by providing the address property.
 *  
 *  When creating a W3CEndpointReference for an
 *  endpoint that is not published by the same Java EE application,
 *  the address property MUST be specified.
 *  
 *  When creating a W3CEndpointReference for an endpoint
 *  published by the same Java EE application, the address
 *  property MAY be null but then the serviceName
 *  and endpointName MUST specify an endpoint published by
 *  the same Java EE application.
 *  
 *  When the wsdlDocumentLocation is specified it MUST refer
 *  to a valid WSDL document and the serviceName and
 *  endpointName (if specified) MUST match a service and port
 *  in the WSDL document.
 */
final class W3CEndpointReferenceBuilder extends Object {

    /** Creates a new W3CEndpointReferenceBuilder instance. */
    @stub
    def this() = ???

    /** Sets the address to the
     *  W3CEndpointReference instance's
     *  wsa:Address.
     */
    @stub
    def address(address: String): W3CEndpointReferenceBuilder = ???

    /** Adds an extension attribute to the
     *  W3CEndpointReference instance's
     *  wsa:EndpointReference element.
     */
    @stub
    def attribute(name: QName, value: String): W3CEndpointReferenceBuilder = ???

    /** Builds a W3CEndpointReference from the accumulated
     *  properties set on this W3CEndpointReferenceBuilder
     *  instance.
     */
    @stub
    def build(): W3CEndpointReference = ???

    /** Adds an extension element to the
     *  W3CEndpointReference instance's
     *  wsa:EndpointReference element.
     */
    @stub
    def element(element: Element): W3CEndpointReferenceBuilder = ???

    /** Sets the endpointName as
     *  wsam:ServiceName/@EndpointName in the
     *  wsa:Metadata element.
     */
    @stub
    def endpointName(endpointName: QName): W3CEndpointReferenceBuilder = ???

    /** Sets the interfaceName as the
     *  wsam:InterfaceName element in the
     *  wsa:Metadata element.
     */
    @stub
    def interfaceName(interfaceName: QName): W3CEndpointReferenceBuilder = ???

    /** Adds the metadataElement to the
     *  W3CEndpointReference instance's
     *  wsa:Metadata element.
     */
    @stub
    def metadata(metadataElement: Element): W3CEndpointReferenceBuilder = ???

    /** Adds the referenceParameter to the
     *  W3CEndpointReference instance
     *  wsa:ReferenceParameters element.
     */
    @stub
    def referenceParameter(referenceParameter: Element): W3CEndpointReferenceBuilder = ???

    /** Sets the serviceName as the
     *  wsam:ServiceName element in the
     *  wsa:Metadata element.
     */
    @stub
    def serviceName(serviceName: QName): W3CEndpointReferenceBuilder = ???

    /** Sets the wsdlDocumentLocation that will be referenced
     *  as wsa:Metadata/@wsdli:wsdlLocation.
     */
    @stub
    def wsdlDocumentLocation(wsdlDocumentLocation: String): W3CEndpointReferenceBuilder = ???
}
