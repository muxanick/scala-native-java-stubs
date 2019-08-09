package java.security

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A GuardedObject is an object that is used to protect access to
 *  another object.
 * 
 *  A GuardedObject encapsulates a target object and a Guard object,
 *  such that access to the target object is possible
 *  only if the Guard object allows it.
 *  Once an object is encapsulated by a GuardedObject,
 *  access to that object is controlled by the getObject
 *  method, which invokes the
 *  checkGuard method on the Guard object that is
 *  guarding access. If access is not allowed,
 *  an exception is thrown.
 */
class GuardedObject extends Object with Serializable {

    /** Constructs a GuardedObject using the specified object and guard. */
    @stub
    def this(object: Object, guard: Guard) = ???

    /** Retrieves the guarded object, or throws an exception if access
     *  to the guarded object is denied by the guard.
     */
    @stub
    def getObject(): Object = ???
}
