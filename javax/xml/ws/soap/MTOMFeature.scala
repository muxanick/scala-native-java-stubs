package javax.xml.ws.soap

import java.lang.{Object, String}
import javax.xml.ws.WebServiceFeature

// This feature represents the use of MTOM with a
// web service.
//
// This feature can be used during the creation of SEI proxy, and
// Dispatch instances on the client side and Endpoint
// instances on the server side. This feature cannot be used for Service
// instance creation on the client side.
//
// 
// The following describes the affects of this feature with respect
// to being enabled or disabled:
// 
//   ENABLED: In this Mode, MTOM will be enabled. A receiver MUST accept
// both a non-optimized and an optimized message, and a sender MAY send an
// optimized message, or a non-optimized message. The heuristics used by a
// sender to determine whether to use optimization or not are
// implementation-specific.
//   DISABLED: In this Mode, MTOM will be disabled
// 
// 
// The threshold property can be used to set the threshold
// value used to determine when binary data should be XOP encoded.
final class MTOMFeature extends WebServiceFeature {

    @stub
    // Create an MTOMFeature.
    def this() = ???

    @stub
    // Creates an MTOMFeature.
    def this(enabled: Boolean) = ???

    @stub
    // Creates an MTOMFeature.
    def this(enabled: Boolean, threshold: Int) = ???

    @stub
    // Get the unique identifier for this WebServiceFeature.
    def getID(): String = ???
}

object MTOMFeature {
    @stub
    // Constant value identifying the MTOMFeature
    def ID: String = ???
}
