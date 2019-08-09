package java.security

import java.lang.Object
import javax.security.auth.login.Configuration.Parameters

// A parameter that contains a URI pointing to data intended for a
// PolicySpi or ConfigurationSpi implementation.
class URIParameter extends Object with Policy.Parameters, with Configuration.Parameters {
}
