package java.nio.file

import java.lang.FunctionalInterface

/** An interface that is implemented by objects that decide if a directory
 *  entry should be accepted or filtered. A Filter is passed as the
 *  parameter to the Files.newDirectoryStream(Path,DirectoryStream.Filter)
 *  method when opening a directory to iterate over the entries in the
 *  directory.
 */
object 
@FunctionalInterface trait DirectoryStream.Filter[T] {
