package javax.xml.ws

import java.lang.Object

// EndpointContext allows multiple endpoints in an application
// to share any information. For example, servlet application's war may
// contain multiple endpoints and these endpoints can get addresses of each
// other by sharing this context. If multiple endpoints share different
// ports of a WSDL, then the multiple port addresses can be patched
// when the WSDL is accessed. It also allows all endpoints to share any
// other runtime information.
//
// 
// This needs to be set by using Endpoint.setEndpointContext(javax.xml.ws.EndpointContext)
// before Endpoint.publish(java.lang.String) methods.
abstract class EndpointContext extends Object {
}
