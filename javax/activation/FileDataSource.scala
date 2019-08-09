package javax.activation

import java.io.{File, InputStream, OutputStream}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The FileDataSource class implements a simple DataSource object
 *  that encapsulates a file. It provides data typing services via
 *  a FileTypeMap object. 
 * 
 *  FileDataSource Typing Semantics
 * 
 *  The FileDataSource class delegates data typing of files
 *  to an object subclassed from the FileTypeMap class.
 *  The setFileTypeMap method can be used to explicitly
 *  set the FileTypeMap for an instance of FileDataSource. If no
 *  FileTypeMap is set, the FileDataSource will call the FileTypeMap's
 *  getDefaultFileTypeMap method to get the System's default FileTypeMap.
 */
class FileDataSource extends Object with DataSource {

    /** Creates a FileDataSource from a File object. */
    @stub
    def this(file: File) = ???

    /** Creates a FileDataSource from
     *  the specified path name.
     */
    @stub
    def this(name: String) = ???

    /** This method returns the MIME type of the data in the form of a
     *  string.
     */
    @stub
    def getContentType(): String = ???

    /** Return the File object that corresponds to this FileDataSource. */
    @stub
    def getFile(): File = ???

    /** This method will return an InputStream representing the
     *  the data and will throw an IOException if it can
     *  not do so.
     */
    @stub
    def getInputStream(): InputStream = ???

    /** Return the name of this object. */
    @stub
    def getName(): String = ???

    /** This method will return an OutputStream representing the
     *  the data and will throw an IOException if it can
     *  not do so.
     */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Set the FileTypeMap to use with this FileDataSource */
    @stub
    def setFileTypeMap(map: FileTypeMap): Unit = ???
}
