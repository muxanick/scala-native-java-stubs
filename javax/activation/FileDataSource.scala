package javax.activation

import java.io.{File, InputStream, OutputStream}
import java.lang.{Object, String}

// The FileDataSource class implements a simple DataSource object
// that encapsulates a file. It provides data typing services via
// a FileTypeMap object. 
//
// FileDataSource Typing Semantics
//
// The FileDataSource class delegates data typing of files
// to an object subclassed from the FileTypeMap class.
// The setFileTypeMap method can be used to explicitly
// set the FileTypeMap for an instance of FileDataSource. If no
// FileTypeMap is set, the FileDataSource will call the FileTypeMap's
// getDefaultFileTypeMap method to get the System's default FileTypeMap.
class FileDataSource extends Object with DataSource {

    @stub
    // Creates a FileDataSource from a File object.
    def this(file: File) = ???

    @stub
    // This method returns the MIME type of the data in the form of a
    // string.
    def getContentType(): String = ???

    @stub
    // Return the File object that corresponds to this FileDataSource.
    def getFile(): File = ???

    @stub
    // This method will return an InputStream representing the
    // the data and will throw an IOException if it can
    // not do so.
    def getInputStream(): InputStream = ???

    @stub
    // Return the name of this object.
    def getName(): String = ???

    @stub
    // This method will return an OutputStream representing the
    // the data and will throw an IOException if it can
    // not do so.
    def getOutputStream(): OutputStream = ???
}
