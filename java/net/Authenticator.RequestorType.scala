package java.net

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The type of the entity requesting authentication. */
class Authenticator.RequestorType private (name: String, ordinal: Int) extends Enum[Authenticator.RequestorType](name, ordinal) {
}

object Authenticator.RequestorType {
    /** Entity requesting authentication is a HTTP proxy server. */
    final val PROXY = new Authenticator.RequestorType(PROXY, 0)

    /** Entity requesting authentication is a HTTP origin server. */
    final val SERVER = new Authenticator.RequestorType(SERVER, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Authenticator.RequestorType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Authenticator.RequestorType] = ???
}
