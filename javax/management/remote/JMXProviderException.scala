package javax.management.remote

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** Exception thrown by JMXConnectorFactory and
 *  JMXConnectorServerFactory when a provider exists for
 *  the required protocol but cannot be used for some reason.
 */
class JMXProviderException extends IOException {

    /** Constructs a JMXProviderException with no
     *  specified detail message.
     */
    @stub
    def this() = ???

    /** Constructs a JMXProviderException with the
     *  specified detail message.
     */
    @stub
    def this(message: String) = ???
}
