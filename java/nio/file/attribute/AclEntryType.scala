package java.nio.file.attribute

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** A typesafe enumeration of the access control entry types. */
class AclEntryType private (name: String, ordinal: Int) extends Enum[AclEntryType](name, ordinal) {
}

object AclEntryType {
    /** Generate an alarm, in a system dependent way, the access specified in the
     *  permissions component of the ACL entry.
     */
    final val ALARM: AclEntryType = new AclEntryType("ALARM", 0)

    /** Explicitly grants access to a file or directory. */
    final val ALLOW: AclEntryType = new AclEntryType("ALLOW", 1)

    /** Log, in a system dependent way, the access specified in the
     *  permissions component of the ACL entry.
     */
    final val AUDIT: AclEntryType = new AclEntryType("AUDIT", 2)

    /** Explicitly denies access to a file or directory. */
    final val DENY: AclEntryType = new AclEntryType("DENY", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): AclEntryType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[AclEntryType] = ???
}
