package java.nio.file.attribute

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the bits for use with the permissions attribute.
 * 
 *   The PosixFilePermissions class defines methods for manipulating
 *  set of permissions.
 */
class PosixFilePermission private (name: String, ordinal: Int) extends Enum[PosixFilePermission](name, ordinal) {
}

object PosixFilePermission {
    /** Execute/search permission, group. */
    final val GROUP_EXECUTE = new PosixFilePermission(GROUP_EXECUTE, 0)

    /** Read permission, group. */
    final val GROUP_READ = new PosixFilePermission(GROUP_READ, 1)

    /** Write permission, group. */
    final val GROUP_WRITE = new PosixFilePermission(GROUP_WRITE, 2)

    /** Execute/search permission, others. */
    final val OTHERS_EXECUTE = new PosixFilePermission(OTHERS_EXECUTE, 3)

    /** Read permission, others. */
    final val OTHERS_READ = new PosixFilePermission(OTHERS_READ, 4)

    /** Write permission, others. */
    final val OTHERS_WRITE = new PosixFilePermission(OTHERS_WRITE, 5)

    /** Execute/search permission, owner. */
    final val OWNER_EXECUTE = new PosixFilePermission(OWNER_EXECUTE, 6)

    /** Read permission, owner. */
    final val OWNER_READ = new PosixFilePermission(OWNER_READ, 7)

    /** Write permission, owner. */
    final val OWNER_WRITE = new PosixFilePermission(OWNER_WRITE, 8)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): PosixFilePermission = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[PosixFilePermission] = ???
}
