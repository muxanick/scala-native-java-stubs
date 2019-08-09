package java.rmi.activation

import java.rmi.{MarshalledObject, Remote}
import scala.scalanative.annotation.stub

/** The Activator facilitates remote object activation. A
 *  "faulting" remote reference calls the activator's
 *  activate method to obtain a "live" reference to a
 *  "activatable" remote object. Upon receiving a request for activation,
 *  the activator looks up the activation descriptor for the activation
 *  identifier, id, determines the group in which the
 *  object should be activated initiates object re-creation via the
 *  group's ActivationInstantiator (via a call to the
 *  newInstance method). The activator initiates the
 *  execution of activation groups as necessary. For example, if an
 *  activation group for a specific group identifier is not already
 *  executing, the activator initiates the execution of a VM for the
 *  group. 
 * 
 *  The Activator works closely with
 *  ActivationSystem, which provides a means for registering
 *  groups and objects within those groups, and ActivationMonitor,
 *  which recives information about active and inactive objects and inactive
 *  groups. 
 * 
 *  The activator is responsible for monitoring and detecting when
 *  activation groups fail so that it can remove stale remote references
 *  to groups and active object's within those groups.
 */
trait Activator extends Remote {

    /** Activate the object associated with the activation identifier,
     *  id.
     */
    @stub
    def activate(id: ActivationID, force: Boolean): MarshalledObject[_ <: Remote] = ???
}
