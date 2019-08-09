package java.rmi.activation

import java.lang.Object
import java.rmi.{MarshalledObject, Remote}
import java.rmi.server.{RemoteObject, RemoteRef, RemoteStub}
import scala.scalanative.annotation.stub

/** ActivationGroup_Stub is a stub class
 *  for the subclasses of java.rmi.activation.ActivationGroup
 *  that are exported as a java.rmi.server.UnicastRemoteObject.
 */
final class ActivationGroup_Stub extends RemoteStub with ActivationInstantiator with Remote {

    /** Constructs a stub for the ActivationGroup class. */
    @stub
    def this(ref: RemoteRef) = ???

    /** Stub method for ActivationGroup.newInstance. */
    @stub
    def newInstance(id: ActivationID, desc: ActivationDesc): MarshalledObject = ???
}
