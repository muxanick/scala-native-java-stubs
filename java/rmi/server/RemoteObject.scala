package java.rmi.server

import java.io.Serializable
import java.lang.{Object, String}
import java.rmi.Remote
import scala.scalanative.annotation.stub

/** The RemoteObject class implements the
 *  java.lang.Object behavior for remote objects.
 *  RemoteObject provides the remote semantics of Object by
 *  implementing methods for hashCode, equals, and toString.
 */
abstract class RemoteObject extends Object with Remote with Serializable {

    /** Creates a remote object. */
    @stub
    protected def this() = ???

    /** Creates a remote object, initialized with the specified remote
     *  reference.
     */
    @stub
    protected def this(newref: RemoteRef) = ???

    /** The object's remote reference. */
    protected val ref: RemoteRef

    /** Compares two remote objects for equality. */
    def equals(obj: Any): Boolean

    /** Returns the remote reference for the remote object. */
    def getRef(): RemoteRef

    /** Returns a hashcode for a remote object. */
    def hashCode(): Int

    /** Returns a String that represents the value of this remote object. */
    def toString(): String
}

object RemoteObject {
    /** Returns the stub for the remote object obj passed
     *  as a parameter.
     */
    @stub
    def toStub(obj: Remote): Remote = ???
}
