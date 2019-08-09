package java.nio.file.attribute

import java.lang.{Enum, Object, String}

// Defines the flags for used by the flags component of an ACL entry.
//
//  In this release, this class does not define flags related to AclEntryType.AUDIT and AclEntryType.ALARM entry types.
class AclEntryFlag private (name: String, ordinal: Int) extends Enum[AclEntryFlag](name, ordinal) {
}

object AclEntryFlag {
    // Can be placed on a directory and indicates that the ACL entry should be
    // added to each new directory created.
    final val DIRECTORY_INHERIT = new AclEntryFlag(DIRECTORY_INHERIT, 0)

    // Can be placed on a directory and indicates that the ACL entry should be
    // added to each new non-directory file created.
    final val FILE_INHERIT = new AclEntryFlag(FILE_INHERIT, 1)

    // Can be placed on a directory but does not apply to the directory,
    // only to newly created files/directories as specified by the
    // FILE_INHERIT and DIRECTORY_INHERIT flags.
    final val INHERIT_ONLY = new AclEntryFlag(INHERIT_ONLY, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): AclEntryFlag = ???
}
