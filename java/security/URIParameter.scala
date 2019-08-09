package java.security

import java.lang.Object
import java.net.URI
import javax.security.auth.login.Configuration.Parameters
import scala.scalanative.annotation.stub

/** A parameter that contains a URI pointing to data intended for a
 *  PolicySpi or ConfigurationSpi implementation.
 */
class URIParameter extends Object with Policy.Parameters with Configuration.Parameters {

    /** Constructs a URIParameter with the URI pointing to
     *  data intended for an SPI implementation.
     */
    @stub
    def this(uri: URI) = ???

    /** Returns the URI. */
    @stub
    def getURI(): URI = ???
}
