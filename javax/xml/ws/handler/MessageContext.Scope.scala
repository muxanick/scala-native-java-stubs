package javax.xml.ws.handler

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Property scope. Properties scoped as APPLICATION are
 *  visible to handlers,
 *  client applications and service endpoints; properties scoped as
 *  HANDLER
 *  are only normally visible to handlers.
 */
class MessageContext.Scope private (name: String, ordinal: Int) extends Enum[MessageContext.Scope](name, ordinal) {
}

object MessageContext.Scope {
    /**  */
    final val APPLICATION = new MessageContext.Scope(APPLICATION, 0)

    /**  */
    final val HANDLER = new MessageContext.Scope(HANDLER, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MessageContext.Scope = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[MessageContext.Scope] = ???
}
