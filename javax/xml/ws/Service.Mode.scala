package javax.xml.ws

import java.lang.{Enum, Object, String}

// The orientation of a dynamic client or service. MESSAGE provides
// access to entire protocol message, PAYLOAD to protocol message
// payload only.
class Service.Mode private (name: String, ordinal: Int) extends Enum[Service.Mode](name, ordinal) {
}

object Service.Mode {
    // 
    final val MESSAGE = new Service.Mode(MESSAGE, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Service.Mode = ???
}
