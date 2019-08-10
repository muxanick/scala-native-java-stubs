package javax.xml.ws.soap

import java.lang.{Object, String}
import javax.xml.ws.WebServiceFeature
import scala.scalanative.annotation.stub

/** AddressingFeature represents the use of WS-Addressing with either
 *  the SOAP 1.1/HTTP or SOAP 1.2/HTTP binding. Using this feature
 *  with any other binding is undefined.
 *  
 *  This feature can be used during the creation of SEI proxy, and
 *  Dispatch instances on the client side and Endpoint
 *  instances on the server side. This feature cannot be used for Service
 *  instance creation on the client side.
 *  
 *  The following describes the effects of this feature with respect
 *  to be enabled or disabled:
 *  
 *    ENABLED: In this Mode, WS-Addressing will be enabled. It means
 *        the endpoint supports WS-Addressing but does not require its use.
 *        A sender could send messages with WS-Addressing headers or without
 *        WS-Addressing headers. But a receiver MUST consume both types of
 *        messages.
 *    DISABLED: In this Mode, WS-Addressing will be disabled.
 *        At runtime, WS-Addressing headers MUST NOT be used by a sender or
 *        receiver.
 *  
 *  
 *  If the feature is enabled, the required property determines
 *  whether the endpoint requires WS-Addressing. If it is set true,
 *  WS-Addressing headers MUST be present on incoming and outgoing messages.
 *  By default the required property is false.
 * 
 *  
 *  If the web service developer has not explicitly enabled this feature,
 *  WSDL's wsam:Addressing policy assertion is used to find
 *  the use of WS-Addressing. By using the feature explicitly, an application
 *  overrides WSDL's indication of the use of WS-Addressing. In some cases,
 *  this is really required. For example, if an application has implemented
 *  WS-Addressing itself, it can use this feature to disable addressing. That
 *  means a JAX-WS implementation doesn't consume or produce WS-Addressing
 *  headers.
 * 
 *  
 *  If addressing is enabled, a corresponding wsam:Addressing policy assertion
 *  must be generated in the WSDL as per
 *  
 *  3.1 WS-Policy Assertions
 * 
 *  
 *  Example 1: Possible Policy Assertion in the generated WSDL for
 *  @Addressing
 *  
 *    <wsam:Addressing wsp:Optional="true">
 *      <wsp:Policy/>
 *    </wsam:Addressing>
 *  
 * 
 *  
 *  Example 2: Possible Policy Assertion in the generated WSDL for
 *  @Addressing(required=true)
 *  
 *    <wsam:Addressing>
 *      <wsp:Policy/>
 *    </wsam:Addressing>
 *  
 * 
 *  
 *  Example 3: Possible Policy Assertion in the generated WSDL for
 *  @Addressing(required=true, responses=Responses.ANONYMOUS)
 *  
 *    <wsam:Addressing>
 *       <wsp:Policy>
 *         <wsam:AnonymousResponses/>
 *       </wsp:Policy>
 *    </wsam:Addressing>
 *  
 * 
 *  
 *  See 
 *  Web Services Addressing - Core,
 *  
 *  Web Services Addressing 1.0 - SOAP Binding,
 *  and 
 *  Web Services Addressing 1.0 - Metadata
 *  for more information on WS-Addressing.
 */
final class AddressingFeature extends WebServiceFeature {

    /** Creates and configures an AddressingFeature with the
     *  use of addressing requirements.
     */
    @stub
    def this() = ???

    /** Creates and configures an AddressingFeature with the
     *  use of addressing requirements.
     */
    @stub
    def this(enabled: Boolean) = ???

    /** Creates and configures an AddressingFeature with the
     *  use of addressing requirements.
     */
    @stub
    def this(enabled: Boolean, required: Boolean) = ???

    /** Creates and configures an AddressingFeature with the
     *  use of addressing requirements.
     */
    @stub
    def this(enabled: Boolean, required: Boolean, responses: AddressingFeature.Responses) = ???

    /** If addressing is enabled, this property determines whether the endpoint
     *  requires WS-Addressing.
     */
    @stub
    protected val required: Boolean = ???

    /** Get the unique identifier for this WebServiceFeature. */
    @stub
    def getID(): String = ???

    /** If addressing is enabled, this property determines whether endpoint
     *  requires the use of anonymous responses, or non-anonymous responses,
     *  or all responses.
     */
    @stub
    def getResponses(): AddressingFeature.Responses = ???

    /** If addressing is enabled, this property determines whether the endpoint
     *  requires WS-Addressing.
     */
    @stub
    def isRequired(): Boolean = ???
}

object AddressingFeature {
    /** If addressing is enabled, this property determines if endpoint requires
     *  the use of only anonymous responses, or only non-anonymous responses, or all.
     */
    type Responses = AddressingFeature_Responses

    /** Constant value identifying the AddressingFeature */
    @stub
    val ID: String = ???
}
