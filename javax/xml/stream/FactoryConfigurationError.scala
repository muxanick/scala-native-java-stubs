package javax.xml.stream

import java.lang.{Error, Exception, Object, String, Throwable}

// An error class for reporting factory configuration errors.
class FactoryConfigurationError extends Error {

    @stub
    // Default constructor
    def this() = ???

    @stub
    // Construct an exception with a nested inner exception
    def this(e: Exception) = ???

    @stub
    // Construct an exception with a nested inner exception
    // and a message
    def this(e: Exception, msg: String) = ???

    @stub
    // Construct an exception with associated message
    def this(msg: String) = ???

    @stub
    // use the exception chaining mechanism of JDK1.4
    def getCause(): Throwable = ???

    @stub
    // Return the nested exception (if any)
    def getException(): Exception = ???
}
