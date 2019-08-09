package javax.xml.ws.soap

import java.lang.{Object, String}
import javax.xml.ws.WebServiceFeature
import scala.scalanative.annotation.stub

/** This feature represents the use of MTOM with a
 *  web service.
 * 
 *  This feature can be used during the creation of SEI proxy, and
 *  Dispatch instances on the client side and Endpoint
 *  instances on the server side. This feature cannot be used for Service
 *  instance creation on the client side.
 * 
 *  
 *  The following describes the affects of this feature with respect
 *  to being enabled or disabled:
 *  
 *    ENABLED: In this Mode, MTOM will be enabled. A receiver MUST accept
 *  both a non-optimized and an optimized message, and a sender MAY send an
 *  optimized message, or a non-optimized message. The heuristics used by a
 *  sender to determine whether to use optimization or not are
 *  implementation-specific.
 *    DISABLED: In this Mode, MTOM will be disabled
 *  
 *  
 *  The threshold property can be used to set the threshold
 *  value used to determine when binary data should be XOP encoded.
 */
final class MTOMFeature extends WebServiceFeature {

    /** Create an MTOMFeature. */
    @stub
    def this() = ???

    /** Creates an MTOMFeature. */
    @stub
    def this(enabled: Boolean) = ???

    /** Creates an MTOMFeature. */
    @stub
    def this(enabled: Boolean, threshold: Int) = ???

    /** Creates an MTOMFeature. */
    @stub
    def this(threshold: Int) = ???

    /** Property for MTOM threshold value. */
    @stub
    protected val threshold: Int = ???

    /** Get the unique identifier for this WebServiceFeature. */
    @stub
    def getID(): String = ???

    /** Gets the threshold value used to determine when binary data
     *  should be sent as an attachment.
     */
    @stub
    def getThreshold(): Int = ???
}

object MTOMFeature {
    /** Constant value identifying the MTOMFeature */
    @stub
    val ID: String = ???
}
