package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when a file system loop, or cycle, is encountered. */
class FileSystemLoopException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(file: String) = ???
}
