package java.net

import java.lang.{Enum, Object, String}

// The type of the entity requesting authentication.
class Authenticator.RequestorType private (name: String, ordinal: Int) extends Enum[Authenticator.RequestorType](name, ordinal) {
}

object Authenticator.RequestorType {
    // Entity requesting authentication is a HTTP proxy server.
    final val PROXY = new Authenticator.RequestorType(PROXY, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Authenticator.RequestorType = ???
}
