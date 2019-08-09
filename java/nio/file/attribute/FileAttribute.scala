package java.nio.file.attribute

import java.lang.String

// An object that encapsulates the value of a file attribute that can be set
// atomically when creating a new file or directory by invoking the createFile or createDirectory methods.
trait FileAttribute[T] {

    @stub
    // Returns the attribute name.
    def name(): String = ???
}
