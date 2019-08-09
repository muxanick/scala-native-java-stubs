package javax.xml.datatype

import java.lang.{Exception, Object, String, Throwable}

// Indicates a serious configuration error.
class DatatypeConfigurationException extends Exception {

    @stub
    // Create a new DatatypeConfigurationException with
    // no specified detail mesage and cause.
    def this() = ???

    @stub
    // Create a new DatatypeConfigurationException with
    // the specified detail message.
    def this(message: String) = ???

    @stub
    // Create a new DatatypeConfigurationException with
    // the specified detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
