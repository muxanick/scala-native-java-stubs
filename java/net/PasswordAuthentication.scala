package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The class PasswordAuthentication is a data holder that is used by
 *  Authenticator.  It is simply a repository for a user name and a password.
 */
final class PasswordAuthentication extends Object {

    /** Creates a new PasswordAuthentication object from the given
     *  user name and password.
     */
    @stub
    def this(userName: String, password: Array[Char]) = ???

    /** Returns the user password. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Returns the user name. */
    @stub
    def getUserName(): String = ???
}
