package java.nio.file.attribute

import java.lang.{Object, String}
import java.util.Set

// This class consists exclusively of static methods that operate on sets of
// PosixFilePermission objects.
final class PosixFilePermissions extends Object {
}

object PosixFilePermissions {
    @stub
    // Creates a FileAttribute, encapsulating a copy of the given file
    // permissions, suitable for passing to the createFile or createDirectory
    // methods.
    def asFileAttribute(perms: Set[PosixFilePermission]): FileAttribute[Set[PosixFilePermission]] = ???

    @stub
    // Returns the set of permissions corresponding to a given String
    // representation.
    def fromString(perms: String): Set[PosixFilePermission] = ???
}
