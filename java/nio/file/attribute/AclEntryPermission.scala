package java.nio.file.attribute

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the permissions for use with the permissions component of an ACL
 *  entry.
 */
class AclEntryPermission private (name: String, ordinal: Int) extends Enum[AclEntryPermission](name, ordinal) {
}

object AclEntryPermission {
    /** Permission to append data to a file. */
    final val APPEND_DATA = new AclEntryPermission(APPEND_DATA, 0)

    /** Permission to delete the file. */
    final val DELETE = new AclEntryPermission(DELETE, 1)

    /** Permission to delete a file or directory within a directory. */
    final val DELETE_CHILD = new AclEntryPermission(DELETE_CHILD, 2)

    /** Permission to execute a file. */
    final val EXECUTE = new AclEntryPermission(EXECUTE, 3)

    /** Permission to read the ACL attribute. */
    final val READ_ACL = new AclEntryPermission(READ_ACL, 4)

    /** The ability to read (non-acl) file attributes. */
    final val READ_ATTRIBUTES = new AclEntryPermission(READ_ATTRIBUTES, 5)

    /** Permission to read the data of the file. */
    final val READ_DATA = new AclEntryPermission(READ_DATA, 6)

    /** Permission to read the named attributes of a file. */
    final val READ_NAMED_ATTRS = new AclEntryPermission(READ_NAMED_ATTRS, 7)

    /** Permission to access file locally at the server with synchronous reads
     *  and writes.
     */
    final val SYNCHRONIZE = new AclEntryPermission(SYNCHRONIZE, 8)

    /** Permission to write the ACL attribute. */
    final val WRITE_ACL = new AclEntryPermission(WRITE_ACL, 9)

    /** The ability to write (non-acl) file attributes. */
    final val WRITE_ATTRIBUTES = new AclEntryPermission(WRITE_ATTRIBUTES, 10)

    /** Permission to modify the file's data. */
    final val WRITE_DATA = new AclEntryPermission(WRITE_DATA, 11)

    /** Permission to write the named attributes of a file. */
    final val WRITE_NAMED_ATTRS = new AclEntryPermission(WRITE_NAMED_ATTRS, 12)

    /** Permission to change the owner. */
    final val WRITE_OWNER = new AclEntryPermission(WRITE_OWNER, 13)

    /** Permission to add a new file to a directory (equal to WRITE_DATA) */
    @stub
    val ADD_FILE: AclEntryPermission = ???

    /** Permission to create a subdirectory to a directory (equal to APPEND_DATA) */
    @stub
    val ADD_SUBDIRECTORY: AclEntryPermission = ???

    /** Permission to list the entries of a directory (equal to READ_DATA) */
    @stub
    val LIST_DIRECTORY: AclEntryPermission = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): AclEntryPermission = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[AclEntryPermission] = ???
}
