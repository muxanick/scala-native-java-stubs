package javax.xml.ws.wsaddressing

import java.lang.{Object, String}
import javax.xml.namespace.QName
import org.w3c.dom.Element

// This class is used to build W3CEndpointReference
// instances. The intended use of this clsss is for
// an application component, for example a factory component,
// to create an W3CEndpointReference for a
// web service endpoint published by the same
// Java EE application. It can also be used to create
// W3CEndpointReferences for an Java SE based
// endpoint by providing the address property.
// 
// When creating a W3CEndpointReference for an
// endpoint that is not published by the same Java EE application,
// the address property MUST be specified.
// 
// When creating a W3CEndpointReference for an endpoint
// published by the same Java EE application, the address
// property MAY be null but then the serviceName
// and endpointName MUST specify an endpoint published by
// the same Java EE application.
// 
// When the wsdlDocumentLocation is specified it MUST refer
// to a valid WSDL document and the serviceName and
// endpointName (if specified) MUST match a service and port
// in the WSDL document.
final class W3CEndpointReferenceBuilder extends Object {

    @stub
    // Sets the address to the
    // W3CEndpointReference instance's
    // wsa:Address.
    def address(address: String): W3CEndpointReferenceBuilder = ???

    @stub
    // Adds an extension attribute to the
    // W3CEndpointReference instance's
    // wsa:EndpointReference element.
    def attribute(name: QName, value: String): W3CEndpointReferenceBuilder = ???

    @stub
    // Builds a W3CEndpointReference from the accumulated
    // properties set on this W3CEndpointReferenceBuilder
    // instance.
    def build(): W3CEndpointReference = ???

    @stub
    // Adds an extension element to the
    // W3CEndpointReference instance's
    // wsa:EndpointReference element.
    def element(element: Element): W3CEndpointReferenceBuilder = ???

    @stub
    // Sets the endpointName as
    // wsam:ServiceName/@EndpointName in the
    // wsa:Metadata element.
    def endpointName(endpointName: QName): W3CEndpointReferenceBuilder = ???

    @stub
    // Sets the interfaceName as the
    // wsam:InterfaceName element in the
    // wsa:Metadata element.
    def interfaceName(interfaceName: QName): W3CEndpointReferenceBuilder = ???

    @stub
    // Adds the metadataElement to the
    // W3CEndpointReference instance's
    // wsa:Metadata element.
    def metadata(metadataElement: Element): W3CEndpointReferenceBuilder = ???

    @stub
    // Adds the referenceParameter to the
    // W3CEndpointReference instance
    // wsa:ReferenceParameters element.
    def referenceParameter(referenceParameter: Element): W3CEndpointReferenceBuilder = ???

    @stub
    // Sets the serviceName as the
    // wsam:ServiceName element in the
    // wsa:Metadata element.
    def serviceName(serviceName: QName): W3CEndpointReferenceBuilder = ???
}
