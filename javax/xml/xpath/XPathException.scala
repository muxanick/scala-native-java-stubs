package javax.xml.xpath

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** XPathException represents a generic XPath exception. */
class XPathException extends Exception {

    /** Constructs a new XPathException
     *  with the specified detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new XPathException
     *  with the specified cause.
     */
    @stub
    def this(cause: Throwable) = ???

    /** Get the cause of this XPathException. */
    @stub
    def getCause(): Throwable = ???

    /** Print stack trace to System.err. */
    @stub
    def printStackTrace(): Unit = ???

    /** Print stack trace to specified PrintStream. */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Print stack trace to specified PrintWriter. */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???
}
