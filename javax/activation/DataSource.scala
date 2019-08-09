package javax.activation

import java.io.InputStream
import java.lang.String

// The DataSource interface provides the JavaBeans Activation Framework
// with an abstraction of an arbitrary collection of data.  It
// provides a type for that data as well as access
// to it in the form of InputStreams and
// OutputStreams where appropriate.
trait DataSource {

    @stub
    // This method returns the MIME type of the data in the form of a
    // string.
    def getContentType(): String = ???

    @stub
    // This method returns an InputStream representing
    // the data and throws the appropriate exception if it can
    // not do so.
    def getInputStream(): InputStream = ???

    @stub
    // Return the name of this object where the name of the object
    // is dependant on the nature of the underlying objects.
    def getName(): String = ???
}
