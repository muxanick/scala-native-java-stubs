package javax.activation

import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}

// The URLDataSource class provides an object that wraps a URL
// object in a DataSource interface. URLDataSource simplifies the handling
// of data described by URLs within the JavaBeans Activation Framework
// because this class can be used to create new DataHandlers. NOTE: The
// DataHandler object creates a URLDataSource internally,
// when it is constructed with a URL.
class URLDataSource extends Object with DataSource {

    @stub
    // Returns the value of the URL content-type header field.
    def getContentType(): String = ???

    @stub
    // The getInputStream method from the URL.
    def getInputStream(): InputStream = ???

    @stub
    // Calls the getFile method on the URL used to
    // instantiate the object.
    def getName(): String = ???

    @stub
    // The getOutputStream method from the URL.
    def getOutputStream(): OutputStream = ???
}
