package java.nio.file.attribute

import java.lang.{Object, String}
import java.util.Set
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods that operate on sets of
 *  PosixFilePermission objects.
 */
final class PosixFilePermissions extends Object {
}

object PosixFilePermissions {
    /** Creates a FileAttribute, encapsulating a copy of the given file
     *  permissions, suitable for passing to the createFile or createDirectory
     *  methods.
     */
    @stub
    def asFileAttribute(perms: Set[PosixFilePermission]): FileAttribute[Set[PosixFilePermission]] = ???

    /** Returns the set of permissions corresponding to a given String
     *  representation.
     */
    @stub
    def fromString(perms: String): Set[PosixFilePermission] = ???

    /** Returns the String representation of a set of permissions. */
    @stub
    def toString(perms: Set[PosixFilePermission]): String = ???
}
