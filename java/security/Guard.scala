package java.security

import java.lang.Object
import scala.scalanative.annotation.stub

/**  This interface represents a guard, which is an object that is used
 *  to protect access to another object.
 * 
 *  This interface contains a single method, checkGuard,
 *  with a single object argument. checkGuard is
 *  invoked (by the GuardedObject getObject method)
 *  to determine whether or not to allow access to the object.
 */
trait Guard {

    /** Determines whether or not to allow access to the guarded object
     *  object.
     */
    @stub
    def checkGuard(object: Any): Unit = ???
}
