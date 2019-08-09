package java.rmi

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** An AlreadyBoundException is thrown if an attempt
 *  is made to bind an object in the registry to a name that already
 *  has an associated binding.
 */
class AlreadyBoundException extends Exception {

    /** Constructs an AlreadyBoundException with no
     *  specified detail message.
     */
    @stub
    def this() = ???

    /** Constructs an AlreadyBoundException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
