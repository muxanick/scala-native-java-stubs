package java.nio.file.attribute

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when a lookup of UserPrincipal fails because
 *  the principal does not exist.
 */
class UserPrincipalNotFoundException extends IOException {

    /** Constructs an instance of this class. */
    @stub
    def this(name: String) = ???

    /** Returns the user principal name if this exception was created with the
     *  user principal name that was not found, otherwise null.
     */
    @stub
    def getName(): String = ???
}
