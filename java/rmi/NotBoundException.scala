package java.rmi

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A NotBoundException is thrown if an attempt
 *  is made to lookup or unbind in the registry a name that has
 *  no associated binding.
 */
class NotBoundException extends Exception {

    /** Constructs a NotBoundException with no
     *  specified detail message.
     */
    @stub
    def this() = ???

    /** Constructs a NotBoundException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
