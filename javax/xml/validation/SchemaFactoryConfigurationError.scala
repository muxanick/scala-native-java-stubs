package javax.xml.validation

import java.lang.{Error, Object, String, Throwable}

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
}
