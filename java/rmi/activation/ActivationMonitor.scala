package java.rmi.activation

import java.rmi.{MarshalledObject, Remote}
import scala.scalanative.annotation.stub

/** An ActivationMonitor is specific to an
 *  ActivationGroup and is obtained when a group is
 *  reported active via a call to
 *  ActivationSystem.activeGroup (this is done
 *  internally). An activation group is responsible for informing its
 *  ActivationMonitor when either: its objects become active or
 *  inactive, or the group as a whole becomes inactive.
 */
trait ActivationMonitor extends Remote {

    /** Informs that an object is now active. */
    @stub
    def activeObject(id: ActivationID, obj: MarshalledObject[_ <: Remote]): Unit = ???

    /** Informs that the group is now inactive. */
    @stub
    def inactiveGroup(id: ActivationGroupID, incarnation: Long): Unit = ???

    /** An activation group calls its monitor's
     *  inactiveObject method when an object in its group
     *  becomes inactive (deactivates).
     */
    @stub
    def inactiveObject(id: ActivationID): Unit = ???
}
