package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when there is a configuration problem.
 *  This can arise when installation of a provider was
 *  not done correctly, or if there are configuration problems with the
 *  server, or if configuration information required to access
 *  the provider or service is malformed or missing.
 *  For example, a request to use SSL as the security protocol when
 *  the service provider software was not configured with the SSL
 *  component would cause such an exception. Another example is
 *  if the provider requires that a URL be specified as one of the
 *  environment properties but the client failed to provide it.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class ConfigurationException extends NamingException {

    /** Constructs a new instance of ConfigurationException with
     *  all name resolution fields and explanation initialized to null.
     */
    @stub
    def this() = ???

    /** Constructs a new instance of ConfigurationException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}
