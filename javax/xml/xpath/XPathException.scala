package javax.xml.xpath

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

/** XPathException represents a generic XPath exception. */
class XPathException extends Exception {

    /** Constructs a new XPathException
     *  with the specified detail message.
     */
    @stub
    def this(message: String) = ???

    /** Get the cause of this XPathException. */
    @stub
    def getCause(): Throwable = ???

    /** Print stack trace to System.err. */
    @stub
    def printStackTrace(): Unit = ???

    /** Print stack trace to specified PrintStream. */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???
}
