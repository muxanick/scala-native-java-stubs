package javax.security.auth

import scala.scalanative.annotation.stub

/** Objects such as credentials may optionally implement this
 *  interface to provide the capability to refresh itself.
 *  For example, a credential with a particular time-restricted lifespan
 *  may implement this interface to allow callers to refresh the time period
 *  for which it is valid.
 */
trait Refreshable {

    /** Determine if this Object is current. */
    @stub
    def isCurrent(): Boolean = ???

    /** Update or extend the validity period for this
     *  Object.
     */
    @stub
    def refresh(): Unit = ???
}
