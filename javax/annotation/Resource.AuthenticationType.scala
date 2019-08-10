package javax.annotation

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The two possible authentication types for a resource. */
class Resource_AuthenticationType private (name: String, ordinal: Int) extends Enum[Resource.AuthenticationType](name, ordinal) {
}

object Resource_AuthenticationType {
    /**  */
    final val APPLICATION = new Resource.AuthenticationType(APPLICATION, 0)

    /**  */
    final val CONTAINER = new Resource.AuthenticationType(CONTAINER, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Resource.AuthenticationType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Resource.AuthenticationType] = ???
}
