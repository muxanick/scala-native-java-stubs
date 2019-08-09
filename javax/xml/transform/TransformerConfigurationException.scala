package javax.xml.transform

import java.lang.{Exception, Object, String, Throwable}

/** Indicates a serious configuration error. */
class TransformerConfigurationException extends TransformerException {

    /** Create a new TransformerConfigurationException with no
     *  detail mesage.
     */
    @stub
    def this() = ???

    /** Create a new TransformerConfigurationException with
     *  the String  specified as an error message.
     */
    @stub
    def this(msg: String) = ???

    /** Create a new TransformerConfigurationException from a message and a Locator. */
    @stub
    def this(message: String, locator: SourceLocator) = ???

    /** Wrap an existing exception in a TransformerConfigurationException. */
    @stub
    def this(message: String, locator: SourceLocator, e: Throwable) = ???

    /** Create a new TransformerConfigurationException with the
     *  given Exception base cause and detail message.
     */
    @stub
    def this(msg: String, e: Throwable) = ???
}
