package javax.xml.transform

import java.lang.{Exception, Object, String, Throwable}

// Indicates a serious configuration error.
class TransformerConfigurationException extends TransformerException {

    @stub
    // Create a new TransformerConfigurationException with no
    // detail mesage.
    def this() = ???

    @stub
    // Create a new TransformerConfigurationException with
    // the String  specified as an error message.
    def this(msg: String) = ???

    @stub
    // Create a new TransformerConfigurationException from a message and a Locator.
    def this(message: String, locator: SourceLocator) = ???

    @stub
    // Wrap an existing exception in a TransformerConfigurationException.
    def this(message: String, locator: SourceLocator, e: Throwable) = ???

    @stub
    // Create a new TransformerConfigurationException with the
    // given Exception base cause and detail message.
    def this(msg: String, e: Throwable) = ???
}
