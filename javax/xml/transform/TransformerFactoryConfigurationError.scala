package javax.xml.transform

import java.lang.{Error, Exception, Object, String, Throwable}

// Thrown when a problem with configuration with the Transformer Factories
// exists. This error will typically be thrown when the class of a
// transformation factory specified in the system properties cannot be found
// or instantiated.
class TransformerFactoryConfigurationError extends Error {

    @stub
    // Create a new TransformerFactoryConfigurationError with no
    // detail mesage.
    def this() = ???

    @stub
    // Create a new TransformerFactoryConfigurationError with a
    // given Exception base cause of the error.
    def this(e: Exception) = ???

    @stub
    // Create a new TransformerFactoryConfigurationError with the
    // given Exception base cause and detail message.
    def this(e: Exception, msg: String) = ???

    @stub
    // use the exception chaining mechanism of JDK1.4
    def getCause(): Throwable = ???

    @stub
    // Return the actual exception (if any) that caused this exception to
    // be raised.
    def getException(): Exception = ???
}
