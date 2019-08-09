package javax.xml.bind

import java.lang.{Exception, Object, String, Throwable}

// This exception indicates that an error was encountered while getting or
// setting a property.
class PropertyException extends JAXBException {

    @stub
    // Construct a PropertyException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Construct a PropertyException whose message field is set based on the
    // name of the property and value.toString().
    def this(name: String, value: Object) = ???

    @stub
    // Construct a PropertyException with the specified detail message and
    // vendor specific errorCode.
    def this(message: String, errorCode: String) = ???

    @stub
    // Construct a PropertyException with the specified detail message, vendor
    // specific errorCode, and linkedException.
    def this(message: String, errorCode: String, exception: Throwable) = ???

    @stub
    // Construct a PropertyException with the specified detail message and
    // linkedException.
    def this(message: String, exception: Throwable) = ???
}
