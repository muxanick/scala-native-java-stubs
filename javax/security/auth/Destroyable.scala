package javax.security.auth

import scala.scalanative.annotation.stub

/** Objects such as credentials may optionally implement this interface
 *  to provide the capability to destroy its contents.
 */
trait Destroyable {

    /** Destroy this Object. */
    @stub
    val Unit: default = ???

    /** Determine if this Object has been destroyed. */
    @stub
    val Boolean: default = ???
}
