package java.rmi.server

import scala.scalanative.annotation.stub

/** A remote object implementation should implement the
 *  Unreferenced interface to receive notification when there are
 *  no more clients that reference that remote object.
 */
trait Unreferenced {

    /** Called by the RMI runtime sometime after the runtime determines that
     *  the reference list, the list of clients referencing the remote object,
     *  becomes empty.
     */
    @stub
    def unreferenced(): Unit = ???
}
