package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a file system operation fails on one or two files. This class is
 *  the general class for file system exceptions.
 */
class FileSystemException extends IOException {

    /** Constructs an instance of this class. */
    @stub
    def this(file: String) = ???

    /** Constructs an instance of this class. */
    @stub
    def this(file: String, other: String, reason: String) = ???

    /** Returns the file used to create this exception. */
    @stub
    def getFile(): String = ???

    /** Returns the detail message string. */
    @stub
    def getMessage(): String = ???

    /** Returns the other file used to create this exception. */
    @stub
    def getOtherFile(): String = ???

    /** Returns the string explaining why the file system operation failed. */
    @stub
    def getReason(): String = ???
}
