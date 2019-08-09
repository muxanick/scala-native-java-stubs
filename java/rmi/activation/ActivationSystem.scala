package java.rmi.activation

import java.rmi.Remote
import scala.scalanative.annotation.stub

/** The ActivationSystem provides a means for registering
 *  groups and "activatable" objects to be activated within those groups.
 *  The ActivationSystem works closely with the
 *  Activator, which activates objects registered via the
 *  ActivationSystem, and the ActivationMonitor,
 *  which obtains information about active and inactive objects,
 *  and inactive groups.
 */
trait ActivationSystem extends Remote {

    /** Callback to inform activation system that group is now
     *  active.
     */
    @stub
    def activeGroup(id: ActivationGroupID, group: ActivationInstantiator, incarnation: Long): ActivationMonitor = ???

    /** Returns the activation descriptor, for the object with the activation
     *  identifier, id.
     */
    @stub
    def getActivationDesc(id: ActivationID): ActivationDesc = ???

    /** Returns the activation group descriptor, for the group
     *  with the activation group identifier, id.
     */
    @stub
    def getActivationGroupDesc(id: ActivationGroupID): ActivationGroupDesc = ???

    /** Register the activation group. */
    @stub
    def registerGroup(desc: ActivationGroupDesc): ActivationGroupID = ???

    /** The registerObject method is used to register an
     *  activation descriptor, desc, and obtain an
     *  activation identifier for a activatable remote object.
     */
    @stub
    def registerObject(desc: ActivationDesc): ActivationID = ???

    /** Set the activation descriptor, desc for the object with
     *  the activation identifier, id.
     */
    @stub
    def setActivationDesc(id: ActivationID, desc: ActivationDesc): ActivationDesc = ???

    /** Set the activation group descriptor, desc for the object
     *  with the activation group identifier, id.
     */
    @stub
    def setActivationGroupDesc(id: ActivationGroupID, desc: ActivationGroupDesc): ActivationGroupDesc = ???

    /** Shutdown the activation system. */
    @stub
    def shutdown(): Unit = ???

    /** Remove the activation group. */
    @stub
    def unregisterGroup(id: ActivationGroupID): Unit = ???

    /** Remove the activation id and associated descriptor previously
     *  registered with the ActivationSystem; the object
     *  can no longer be activated via the object's activation id.
     */
    @stub
    def unregisterObject(id: ActivationID): Unit = ???
}

object ActivationSystem {
    /** The port to lookup the activation system. */
    @stub
    val SYSTEM_PORT: Int = ???
}
