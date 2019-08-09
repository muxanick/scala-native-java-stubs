package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Thrown when a file system operation fails on one or two files. This class is
// the general class for file system exceptions.
class FileSystemException extends IOException {

    @stub
    // Constructs an instance of this class.
    def this(file: String) = ???

    @stub
    // Returns the file used to create this exception.
    def getFile(): String = ???

    @stub
    // Returns the detail message string.
    def getMessage(): String = ???

    @stub
    // Returns the other file used to create this exception.
    def getOtherFile(): String = ???
}
