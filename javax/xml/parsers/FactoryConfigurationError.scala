package javax.xml.parsers

import java.lang.{Error, Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a problem with configuration with the Parser Factories
 *  exists. This error will typically be thrown when the class of a
 *  parser factory specified in the system properties cannot be found
 *  or instantiated.
 */
class FactoryConfigurationError extends Error {

    /** Create a new FactoryConfigurationError with no
     *  detail mesage.
     */
    @stub
    def this() = ???

    /** Create a new FactoryConfigurationError with a
     *  given Exception base cause of the error.
     */
    @stub
    def this(e: Exception) = ???

    /** Create a new FactoryConfigurationError with the
     *  given Exception base cause and detail message.
     */
    @stub
    def this(e: Exception, msg: String) = ???

    /** Create a new FactoryConfigurationError with
     *  the String  specified as an error message.
     */
    @stub
    def this(msg: String) = ???

    /** use the exception chaining mechanism of JDK1.4 */
    @stub
    def getCause(): Throwable = ???

    /** Return the actual exception (if any) that caused this exception to
     *  be raised.
     */
    @stub
    def getException(): Exception = ???

    /** Return the message (if any) for this error . */
    @stub
    def getMessage(): String = ???
}
