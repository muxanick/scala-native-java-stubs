package javax.activation

import java.io.{File, InputStream}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class extends FileTypeMap and provides data typing of files
 *  via their file extension. It uses the .mime.types format. 
 * 
 *  MIME types file search order:
 *  The MimetypesFileTypeMap looks in various places in the user's
 *  system for MIME types file entries. When requests are made
 *  to search for MIME types in the MimetypesFileTypeMap, it searches
 *  MIME types files in the following order:
 *  
 *  
 *   Programmatically added entries to the MimetypesFileTypeMap instance.
 *   The file .mime.types in the user's home directory.
 *   The file <java.home>/lib/mime.types.
 *   The file or resources named META-INF/mime.types.
 *   The file or resource named META-INF/mimetypes.default
 *  (usually found only in the activation.jar file).
 *  
 *  
 *  MIME types file format:
 * 
 *  
 *  # comments begin with a '#'
 *  # the format is <mime type> <space separated file extensions>
 *  # for example:
 *  text/plain    txt text TXT
 *  # this would map file.txt, file.text, and file.TXT to
 *  # the mime type "text/plain"
 *  
 */
class MimetypesFileTypeMap extends FileTypeMap {

    /** The default constructor. */
    @stub
    def this() = ???

    /** Construct a MimetypesFileTypeMap with programmatic entries
     *  added from the InputStream.
     */
    @stub
    def this(is: InputStream) = ???

    /** Construct a MimetypesFileTypeMap with programmatic entries
     *  added from the named file.
     */
    @stub
    def this(mimeTypeFileName: String) = ???

    /** Prepend the MIME type values to the registry. */
    @stub
    def addMimeTypes(mime_types: String): Unit = ???

    /** Return the MIME type of the file object. */
    @stub
    def getContentType(f: File): String = ???

    /** Return the MIME type based on the specified file name. */
    @stub
    def getContentType(filename: String): String = ???
}
