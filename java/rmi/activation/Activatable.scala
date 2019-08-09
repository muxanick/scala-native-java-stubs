package java.rmi.activation

import java.lang.{Object, String}
import java.rmi.{MarshalledObject, Remote}
import java.rmi.server.{RMIClientSocketFactory, RMIServerSocketFactory, RemoteObject, RemoteServer}

/** The Activatable class provides support for remote
 *  objects that require persistent access over time and that
 *  can be activated by the system.
 * 
 *  For the constructors and static exportObject methods,
 *  the stub for a remote object being exported is obtained as described in
 *  UnicastRemoteObject.
 * 
 *  An attempt to serialize explicitly an instance of this class will
 *  fail.
 */
abstract class Activatable extends RemoteServer {

    /** Constructor used to activate/export the object on a specified
     *  port.
     */
    @stub
    protected def this(id: ActivationID, port: Int) = ???

    /** Constructor used to activate/export the object on a specified
     *  port.
     */
    @stub
    protected def this(id: ActivationID, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory) = ???

    /** Constructs an activatable remote object by registering
     *  an activation descriptor (with the specified location, data, and
     *  restart mode) for this object, and exporting the object with the
     *  specified port.
     */
    @stub
    protected def this(location: String, data: MarshalledObject[_], restart: Boolean, port: Int) = ???

    /** Returns the object's activation identifier. */
    protected def getID(): ActivationID
}

object Activatable {
    /** Export the activatable remote object to the RMI runtime to make
     *  the object available to receive incoming calls.
     */
    @stub
    def exportObject(obj: Remote, id: ActivationID, port: Int): Remote = ???

    /** Export the activatable remote object to the RMI runtime to make
     *  the object available to receive incoming calls.
     */
    @stub
    def exportObject(obj: Remote, id: ActivationID, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory): Remote = ???

    /** Registers an activation descriptor (with the specified location,
     *  data, and restart mode) for the specified object, and exports that
     *  object with the specified port.
     */
    @stub
    def exportObject(obj: Remote, location: String, data: MarshalledObject[_], restart: Boolean, port: Int): ActivationID = ???

    /** Registers an activation descriptor (with the specified location,
     *  data, and restart mode) for the specified object, and exports that
     *  object with the specified port, and the specified client and server
     *  socket factories.
     */
    @stub
    def exportObject(obj: Remote, location: String, data: MarshalledObject[_], restart: Boolean, port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory): ActivationID = ???

    /** Informs the system that the object with the corresponding activation
     *  id is currently inactive.
     */
    @stub
    def inactive(id: ActivationID): Boolean = ???

    /** Register an object descriptor for an activatable remote
     *  object so that is can be activated on demand.
     */
    @stub
    def register(desc: ActivationDesc): Remote = ???

    /** Remove the remote object, obj, from the RMI runtime. */
    @stub
    def unexportObject(obj: Remote, force: Boolean): Boolean = ???
}
