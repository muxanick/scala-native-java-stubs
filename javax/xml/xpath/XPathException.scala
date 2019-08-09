package javax.xml.xpath

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// XPathException represents a generic XPath exception.
class XPathException extends Exception {

    @stub
    // Constructs a new XPathException
    // with the specified detail message.
    def this(message: String) = ???

    @stub
    // Get the cause of this XPathException.
    def getCause(): Throwable = ???

    @stub
    // Print stack trace to System.err.
    def printStackTrace(): Unit = ???

    @stub
    // Print stack trace to specified PrintStream.
    def printStackTrace(s: PrintStream): Unit = ???
}
