package java.nio.file

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** An interface that is implemented by objects that decide if a directory
 *  entry should be accepted or filtered. A Filter is passed as the
 *  parameter to the Files.newDirectoryStream(Path,DirectoryStream.Filter)
 *  method when opening a directory to iterate over the entries in the
 *  directory.
 */
@FunctionalInterface trait DirectoryStream_Filter[T] {

    /** Decides if the given directory entry should be accepted or filtered. */
    @stub
    def accept(entry: T): Boolean = ???
}
