package javax.management.remote

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Exception thrown by JMXConnectorFactory and
// JMXConnectorServerFactory when a provider exists for
// the required protocol but cannot be used for some reason.
class JMXProviderException extends IOException {

    @stub
    // Constructs a JMXProviderException with no
    // specified detail message.
    def this() = ???

    @stub
    // Constructs a JMXProviderException with the
    // specified detail message.
    def this(message: String) = ???
}
