package java.nio.file.attribute

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception thrown when a lookup of UserPrincipal fails because
// the principal does not exist.
class UserPrincipalNotFoundException extends IOException {
}
