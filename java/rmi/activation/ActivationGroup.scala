package java.rmi.activation

import java.lang.Object
import java.rmi.{MarshalledObject, Remote}
import java.rmi.server.{RemoteObject, RemoteServer, UnicastRemoteObject}

/** An ActivationGroup is responsible for creating new
 *  instances of "activatable" objects in its group, informing its
 *  ActivationMonitor when either: its object's become
 *  active or inactive, or the group as a whole becomes inactive. 
 * 
 *  An ActivationGroup is initially created in one
 *  of several ways: 
 *  as a side-effect of creating an ActivationDesc
 *      without an explicit ActivationGroupID for the
 *      first activatable object in the group, or
 *  via the ActivationGroup.createGroup method
 *  as a side-effect of activating the first object in a group
 *      whose ActivationGroupDesc was only registered.
 * 
 *  Only the activator can recreate an
 *  ActivationGroup.  The activator spawns, as needed, a
 *  separate VM (as a child process, for example) for each registered
 *  activation group and directs activation requests to the appropriate
 *  group. It is implementation specific how VMs are spawned. An
 *  activation group is created via the
 *  ActivationGroup.createGroup static method. The
 *  createGroup method has two requirements on the group
 *  to be created: 1) the group must be a concrete subclass of
 *  ActivationGroup, and 2) the group must have a
 *  constructor that takes two arguments:
 * 
 *  
 *   the group's ActivationGroupID, and
 *   the group's initialization data (in a
 *       java.rmi.MarshalledObject)
 * 
 *  When created, the default implementation of
 *  ActivationGroup will override the system properties
 *  with the properties requested when its
 *  ActivationGroupDesc was created, and will set a
 *  SecurityManager as the default system
 *  security manager.  If your application requires specific properties
 *  to be set when objects are activated in the group, the application
 *  should create a special Properties object containing
 *  these properties, then create an ActivationGroupDesc
 *  with the Properties object, and use
 *  ActivationGroup.createGroup before creating any
 *  ActivationDescs (before the default
 *  ActivationGroupDesc is created).  If your application
 *  requires the use of a security manager other than
 *  SecurityManager, in the
 *  ActivativationGroupDescriptor properties list you can set
 *  java.security.manager property to the name of the security
 *  manager you would like to install.
 */
abstract class ActivationGroup extends UnicastRemoteObject with ActivationInstantiator {

    /** This protected method is necessary for subclasses to
     *  make the activeObject callback to the group's
     *  monitor.
     */
    protected def activeObject(id: ActivationID, mobj: MarshalledObject[_ <: Remote]): Unit

    /** The group's activeObject method is called when an
     *  object is exported (either by Activatable object
     *  construction or an explicit call to
     *  Activatable.exportObject.
     */
    def activeObject(id: ActivationID, obj: Remote): Unit

    /** This protected method is necessary for subclasses to
     *  make the inactiveGroup callback to the group's
     *  monitor.
     */
    protected def inactiveGroup(): Unit

    /** The group's inactiveObject method is called
     *  indirectly via a call to the Activatable.inactive
     *  method.
     */
    def inactiveObject(id: ActivationID): Boolean
}

object ActivationGroup {
    /** Create and set the activation group for the current VM. */
    @stub
    def createGroup(id: ActivationGroupID, desc: ActivationGroupDesc, incarnation: Long): ActivationGroup = ???

    /** Returns the current activation group's identifier. */
    @stub
    def currentGroupID(): ActivationGroupID = ???

    /** Returns the activation system for the VM. */
    @stub
    def getSystem(): ActivationSystem = ???
}
