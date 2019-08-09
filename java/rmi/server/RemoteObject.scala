package java.rmi.server

import java.io.Serializable
import java.lang.{Object, String}
import java.rmi.Remote

/** The RemoteObject class implements the
 *  java.lang.Object behavior for remote objects.
 *  RemoteObject provides the remote semantics of Object by
 *  implementing methods for hashCode, equals, and toString.
 */
abstract class RemoteObject extends Object with Remote with Serializable {

    /** Creates a remote object. */
    @stub
    protected def this() = ???

    /** Compares two remote objects for equality. */
    def equals(obj: Object): Boolean

    /** Returns the remote reference for the remote object. */
    def getRef(): RemoteRef

    /** Returns a hashcode for a remote object. */
    def hashCode(): Int

    /** Returns a String that represents the value of this remote object. */
    def toString(): String
}
