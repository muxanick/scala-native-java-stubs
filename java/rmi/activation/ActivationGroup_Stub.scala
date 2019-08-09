package java.rmi.activation

import java.lang.Object
import java.rmi.Remote
import java.rmi.server.{RemoteObject, RemoteStub}

/** ActivationGroup_Stub is a stub class
 *  for the subclasses of java.rmi.activation.ActivationGroup
 *  that are exported as a java.rmi.server.UnicastRemoteObject.
 */
final class ActivationGroup_Stub extends RemoteStub with ActivationInstantiator with Remote {
}
