package java.nio.file.attribute

import java.lang.{Enum, Object, String}

// A typesafe enumeration of the access control entry types.
class AclEntryType private (name: String, ordinal: Int) extends Enum[AclEntryType](name, ordinal) {
}

object AclEntryType {
    // Generate an alarm, in a system dependent way, the access specified in the
    // permissions component of the ACL entry.
    final val ALARM = new AclEntryType(ALARM, 0)

    // Explicitly grants access to a file or directory.
    final val ALLOW = new AclEntryType(ALLOW, 1)

    // Log, in a system dependent way, the access specified in the
    // permissions component of the ACL entry.
    final val AUDIT = new AclEntryType(AUDIT, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): AclEntryType = ???
}
