package javax.xml.ws.handler

import java.lang.{Enum, Object, String}

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

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MessageContext.Scope = ???
}
