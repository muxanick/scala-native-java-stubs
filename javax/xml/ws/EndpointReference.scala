package javax.xml.ws

import java.lang.{Class, Object, String}
import javax.xml.transform.Source

// This class represents an WS-Addressing EndpointReference
// which is a remote reference to a web service endpoint.
// See 
// Web Services Addressing 1.0 - Core
// for more information on WS-Addressing EndpointReferences.
// 
// This class is immutable as the typical web service developer
// need not be concerned with its contents.  The web service
// developer should use this class strictly as a mechanism to
// reference a remote web service endpoint. See the Service APIs
// that clients can use to that utilize an EndpointReference.
// See the Endpoint, and
// BindingProvider APIs on how
// EndpointReferences can be created for published
// endpoints.
// 
// Concrete implementations of this class will represent
// an EndpointReference for a particular version of Addressing.
// For example the W3CEndpointReference is for use
// with W3C Web Services Addressing 1.0 - Core Recommendation.
// If JAX-WS implementors need to support different versions
// of addressing, they should write their own
// EndpointReference subclass for that version.
// This will allow a JAX-WS implementation to create
// a vendor specific EndpointReferences that the
// vendor can use to flag a different version of
// addressing.
// 
// Web service developers that wish to pass or return
// EndpointReference in Java methods in an
// SEI should use
// concrete instances of an EndpointReference such
// as the W3CEndpointReference.  This way the
// schema mapped from the SEI will be more descriptive of the
// type of endpoint reference being passed.
// 
// JAX-WS implementors are expected to extract the XML infoset
// from an EndpointReferece using the
// writeTo(javax.xml.transform.Result)
// method.
// 
// JAXB will bind this class to xs:anyType. If a better binding
// is desired, web services developers should use a concrete
// subclass such as W3CEndpointReference.
abstract class EndpointReference extends Object {

    // The getPort method returns a proxy.
    def T: [T]

    // Displays EPR infoset for debugging convenience.
    def toString(): String
}

object EndpointReference {
    @stub
    // Factory method to read an EndpointReference from the infoset contained in
    // eprInfoset.
    def readFrom(eprInfoset: Source): EndpointReference = ???
}
