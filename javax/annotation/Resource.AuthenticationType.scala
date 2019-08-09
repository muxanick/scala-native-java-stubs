package javax.annotation

import java.lang.{Enum, Object, String}

// The two possible authentication types for a resource.
class Resource.AuthenticationType private (name: String, ordinal: Int) extends Enum[Resource.AuthenticationType](name, ordinal) {
}

object Resource.AuthenticationType {
    // 
    final val APPLICATION = new Resource.AuthenticationType(APPLICATION, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Resource.AuthenticationType = ???
}
