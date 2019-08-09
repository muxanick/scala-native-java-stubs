package javax.xml.ws.wsaddressing

import java.lang.Object
import javax.xml.ws.EndpointReference

// This class represents a W3C Addressing EndpointReferece which is
// a remote reference to a web service endpoint that supports the
// W3C WS-Addressing 1.0 - Core Recommendation.
// 
// Developers should use this class in their SEIs if they want to
// pass/return endpoint references that represent the W3C WS-Addressing
// recommendation.
// 
// JAXB will use the JAXB annotations and bind this class to XML infoset
// that is consistent with that defined by WS-Addressing.  See
// 
// WS-Addressing
// for more information on WS-Addressing EndpointReferences.
final class W3CEndpointReference extends EndpointReference {

    @stub
    // 
    protected def this() = ???
}
