package javax.xml.ws

import scala.scalanative.annotation.stub

/** Service endpoints may implement the Provider
 *   interface as a dynamic alternative to an SEI.
 * 
 *   Implementations are required to support Provider<Source>,
 *   Provider<SOAPMessage> and
 *   Provider<DataSource>, depending on the binding
 *   in use and the service mode.
 * 
 *   The ServiceMode annotation can be used to control whether
 *   the Provider instance will receive entire protocol messages
 *   or just message payloads.
 */
trait Provider[T] {

    /** Invokes an operation occording to the contents of the request
     *   message.
     */
    @stub
    def invoke(request: T): T = ???
}
