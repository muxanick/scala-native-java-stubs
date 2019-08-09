package javax.xml.ws.handler

import scala.scalanative.annotation.stub

/** The LogicalHandler extends
 *   Handler to provide typesafety for the message context parameter.
 */
trait LogicalHandler[C <: LogicalMessageContext] extends Handler[C] {
}
