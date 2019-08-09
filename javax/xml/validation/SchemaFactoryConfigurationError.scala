package javax.xml.validation

import java.lang.{Error, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a problem with configuration with the Schema Factories
 *  exists. This error will typically be thrown when the class of a
 *  schema factory specified in the system properties cannot be found
 *  or instantiated.
 */
final class SchemaFactoryConfigurationError extends Error {

    /** Create a new SchemaFactoryConfigurationError with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Create a new SchemaFactoryConfigurationError with
     *  the String specified as an error message.
     */
    @stub
    def this(message: String) = ???

    /** Create a new SchemaFactoryConfigurationError with the
     *  given Throwable base cause and detail message.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Create a new SchemaFactoryConfigurationError with the
     *  given Throwable base cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
