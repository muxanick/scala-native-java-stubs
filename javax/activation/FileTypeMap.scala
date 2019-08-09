package javax.activation

import java.io.File
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The FileTypeMap is an abstract class that provides a data typing
 *  interface for files. Implementations of this class will
 *  implement the getContentType methods which will derive a content
 *  type from a file name or a File object. FileTypeMaps could use any
 *  scheme to determine the data type, from examining the file extension
 *  of a file (like the MimetypesFileTypeMap) to opening the file and
 *  trying to derive its type from the contents of the file. The
 *  FileDataSource class uses the default FileTypeMap (a MimetypesFileTypeMap
 *  unless changed) to determine the content type of files.
 */
abstract class FileTypeMap extends Object {

    /** The default constructor. */
    @stub
    def this() = ???

    /** Return the type of the file object. */
    def getContentType(file: File): String

    /** Return the type of the file passed in. */
    def getContentType(filename: String): String
}

object FileTypeMap {
    /** Return the default FileTypeMap for the system. */
    @stub
    def getDefaultFileTypeMap(): FileTypeMap = ???

    /** Sets the default FileTypeMap for the system. */
    @stub
    def setDefaultFileTypeMap(fileTypeMap: FileTypeMap): Unit = ???
}
