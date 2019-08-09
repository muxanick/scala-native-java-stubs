package java.rmi.activation

import java.lang.{Object, String}
import java.rmi.{MarshalledObject, Remote}
import java.rmi.server.{RMIClientSocketFactory, RMIServerSocketFactory, RemoteObject, RemoteServer}

// The Activatable class provides support for remote
// objects that require persistent access over time and that
// can be activated by the system.
//
// For the constructors and static exportObject methods,
// the stub for a remote object being exported is obtained as described in
// UnicastRemoteObject.
//
// An attempt to serialize explicitly an instance of this class will
// fail.
abstract class Activatable extends RemoteServer {

    @stub
    // Constructor used to activate/export the object on a specified
    // port.
    protected def this(id: ActivationID, port: Int) = ???

    @stub
    // Constructor used to activate/export the object on a specified
    // port.
    protected def this(id: ActivationID, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory) = ???

    @stub
    // Constructs an activatable remote object by registering
    // an activation descriptor (with the specified location, data, and
    // restart mode) for this object, and exporting the object with the
    // specified port.
    protected def this(location: String, data: MarshalledObject[_], restart: Boolean, port: Int) = ???

    // Returns the object's activation identifier.
    protected def getID(): ActivationID
}

object Activatable {
    @stub
    // Export the activatable remote object to the RMI runtime to make
    // the object available to receive incoming calls.
    def exportObject(obj: Remote, id: ActivationID, port: Int): Remote = ???

    @stub
    // Export the activatable remote object to the RMI runtime to make
    // the object available to receive incoming calls.
    def exportObject(obj: Remote, id: ActivationID, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory): Remote = ???

    @stub
    // Registers an activation descriptor (with the specified location,
    // data, and restart mode) for the specified object, and exports that
    // object with the specified port.
    def exportObject(obj: Remote, location: String, data: MarshalledObject[_], restart: Boolean, port: Int): ActivationID = ???

    @stub
    // Registers an activation descriptor (with the specified location,
    // data, and restart mode) for the specified object, and exports that
    // object with the specified port, and the specified client and server
    // socket factories.
    def exportObject(obj: Remote, location: String, data: MarshalledObject[_], restart: Boolean, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory): ActivationID = ???

    @stub
    // Informs the system that the object with the corresponding activation
    // id is currently inactive.
    def inactive(id: ActivationID): Boolean = ???

    @stub
    // Register an object descriptor for an activatable remote
    // object so that is can be activated on demand.
    def register(desc: ActivationDesc): Remote = ???

    @stub
    // Remove the remote object, obj, from the RMI runtime.
    def unexportObject(obj: Remote, force: Boolean): Boolean = ???
}
